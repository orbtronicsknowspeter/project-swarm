package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.collection.ScatterMapKt;
import androidx.core.math.MathUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.progressindicator.DrawingDelegate;
import com.google.android.material.transformation.FabTransformationScrimBehavior;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {
    private float adjustedWavelength;
    private int cachedWavelength;
    private float displayedAmplitude;
    private float displayedCornerRadius;
    private float displayedInnerCornerRadius;
    private float displayedTrackThickness;
    private boolean drawingDeterminateIndicator;
    Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> endPoints;

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    private float totalTrackLengthFraction;
    private float trackLength;

    public LinearDrawingDelegate(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.trackLength = 300.0f;
        this.endPoints = new Pair<>(new DrawingDelegate.PathPoint(), new DrawingDelegate.PathPoint());
    }

    private void calculateDisplayedPath(@NonNull PathMeasure pathMeasure, @NonNull Path path, @NonNull Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair, float f, float f10, float f11, float f12) {
        boolean z9 = this.drawingDeterminateIndicator;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.spec;
        int i = z9 ? linearProgressIndicatorSpec.wavelengthDeterminate : linearProgressIndicatorSpec.wavelengthIndeterminate;
        if (pathMeasure == this.activePathMeasure && i != this.cachedWavelength) {
            this.cachedWavelength = i;
            invalidateCachedPaths();
        }
        path.rewind();
        float f13 = (-this.trackLength) / 2.0f;
        boolean zHasWavyEffect = ((LinearProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator);
        if (zHasWavyEffect) {
            float f14 = this.trackLength;
            float f15 = this.adjustedWavelength;
            float f16 = f14 / f15;
            float f17 = f12 / f16;
            float f18 = f16 / (f16 + 1.0f);
            f = (f + f17) * f18;
            f10 = (f10 + f17) * f18;
            f13 -= f12 * f15;
        }
        float length = pathMeasure.getLength() * f;
        float length2 = pathMeasure.getLength() * f10;
        pathMeasure.getSegment(length, length2, path, true);
        DrawingDelegate.PathPoint pathPoint = (DrawingDelegate.PathPoint) pair.first;
        pathPoint.reset();
        pathMeasure.getPosTan(length, pathPoint.posVec, pathPoint.tanVec);
        DrawingDelegate.PathPoint pathPoint2 = (DrawingDelegate.PathPoint) pair.second;
        pathPoint2.reset();
        pathMeasure.getPosTan(length2, pathPoint2.posVec, pathPoint2.tanVec);
        this.transform.reset();
        this.transform.setTranslate(f13, 0.0f);
        pathPoint.translate(f13, 0.0f);
        pathPoint2.translate(f13, 0.0f);
        if (zHasWavyEffect) {
            float f19 = this.displayedAmplitude * f11;
            this.transform.postScale(1.0f, f19);
            pathPoint.scale(1.0f, f19);
            pathPoint2.scale(1.0f, f19);
        }
        path.transform(this.transform);
    }

    private void drawLine(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f10, @ColorInt int i, @Px int i6, @Px int i10, float f11, float f12, boolean z9) {
        float f13;
        float fLerp;
        Paint paint2;
        Canvas canvas2;
        float fClamp = MathUtils.clamp(f, 0.0f, 1.0f);
        float fClamp2 = MathUtils.clamp(f10, 0.0f, 1.0f);
        float fLerp2 = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, fClamp);
        float fLerp3 = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, fClamp2);
        int iClamp = (int) ((MathUtils.clamp(fLerp2, 0.0f, 0.01f) * i6) / 0.01f);
        float fClamp3 = 1.0f - MathUtils.clamp(fLerp3, 0.99f, 1.0f);
        float f14 = this.trackLength;
        int i11 = (int) ((fLerp2 * f14) + iClamp);
        int i12 = (int) ((fLerp3 * f14) - ((int) ((fClamp3 * i10) / 0.01f)));
        float f15 = this.displayedCornerRadius;
        float f16 = this.displayedInnerCornerRadius;
        if (f15 != f16) {
            float fMax = Math.max(f15, f16);
            float f17 = this.trackLength;
            float f18 = fMax / f17;
            float fLerp4 = com.google.android.material.math.MathUtils.lerp(this.displayedCornerRadius, this.displayedInnerCornerRadius, MathUtils.clamp(i11 / f17, 0.0f, f18) / f18);
            float f19 = this.displayedCornerRadius;
            float f20 = this.displayedInnerCornerRadius;
            float f21 = this.trackLength;
            fLerp = com.google.android.material.math.MathUtils.lerp(f19, f20, MathUtils.clamp((f21 - i12) / f21, 0.0f, f18) / f18);
            f13 = fLerp4;
        } else {
            f13 = f15;
            fLerp = f13;
        }
        float f22 = (-this.trackLength) / 2.0f;
        boolean z10 = ((LinearProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator) && z9 && f11 > 0.0f;
        if (i11 <= i12) {
            float f23 = i11 + f13;
            float f24 = i12 - fLerp;
            float f25 = f13 * 2.0f;
            float f26 = 2.0f * fLerp;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.displayedTrackThickness);
            ((DrawingDelegate.PathPoint) this.endPoints.first).reset();
            ((DrawingDelegate.PathPoint) this.endPoints.second).reset();
            ((DrawingDelegate.PathPoint) this.endPoints.first).translate(f23 + f22, 0.0f);
            ((DrawingDelegate.PathPoint) this.endPoints.second).translate(f22 + f24, 0.0f);
            if (i11 == 0 && f24 + fLerp < f23 + f13) {
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair = this.endPoints;
                DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint = (DrawingDelegate.PathPoint) pair.first;
                float f27 = this.displayedTrackThickness;
                drawRoundedBlock(canvas, paint, pathPoint, f25, f27, f13, (DrawingDelegate.PathPoint) pair.second, f26, f27, fLerp, true);
                return;
            }
            if (f23 - f13 > f24 - fLerp) {
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair2 = this.endPoints;
                DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint2 = (DrawingDelegate.PathPoint) pair2.second;
                float f28 = this.displayedTrackThickness;
                drawRoundedBlock(canvas, paint, pathPoint2, f26, f28, fLerp, (DrawingDelegate.PathPoint) pair2.first, f25, f28, f13, false);
                return;
            }
            float f29 = fLerp;
            float f30 = f13;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(((LinearProgressIndicatorSpec) this.spec).useStrokeCap() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z10) {
                paint2 = paint;
                PathMeasure pathMeasure = this.activePathMeasure;
                Path path = this.displayedActivePath;
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair3 = this.endPoints;
                float f31 = this.trackLength;
                calculateDisplayedPath(pathMeasure, path, pair3, f23 / f31, f24 / f31, f11, f12);
                canvas2 = canvas;
                canvas2.drawPath(this.displayedActivePath, paint2);
            } else {
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair4 = this.endPoints;
                Object obj = pair4.first;
                float f32 = ((DrawingDelegate.PathPoint) obj).posVec[0];
                float f33 = ((DrawingDelegate.PathPoint) obj).posVec[1];
                Object obj2 = pair4.second;
                canvas.drawLine(f32, f33, ((DrawingDelegate.PathPoint) obj2).posVec[0], ((DrawingDelegate.PathPoint) obj2).posVec[1], paint);
                paint2 = paint;
                canvas2 = canvas;
            }
            if (((LinearProgressIndicatorSpec) this.spec).useStrokeCap()) {
                return;
            }
            if (f23 > 0.0f && f30 > 0.0f) {
                drawRoundedBlock(canvas2, paint2, (DrawingDelegate.PathPoint) this.endPoints.first, f25, this.displayedTrackThickness, f30);
            }
            if (f24 >= this.trackLength || f29 <= 0.0f) {
                return;
            }
            drawRoundedBlock(canvas, paint, (DrawingDelegate.PathPoint) this.endPoints.second, f26, this.displayedTrackThickness, f29);
        }
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint, float f, float f10, float f11, @Nullable DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint2, float f12, float f13, float f14, boolean z9) {
        float f15;
        float f16;
        float fMin = Math.min(f10, this.displayedTrackThickness);
        float f17 = (-f) / 2.0f;
        float f18 = (-fMin) / 2.0f;
        float f19 = f / 2.0f;
        float f20 = fMin / 2.0f;
        RectF rectF = new RectF(f17, f18, f19, f20);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pathPoint2 != null) {
            float fMin2 = Math.min(f13, this.displayedTrackThickness);
            float fMin3 = Math.min(f12 / 2.0f, (f14 * fMin2) / this.displayedTrackThickness);
            RectF rectF2 = new RectF();
            float[] fArr = pathPoint2.posVec;
            if (z9) {
                float f21 = (fArr[0] - fMin3) - (pathPoint.posVec[0] - f11);
                if (f21 > 0.0f) {
                    pathPoint2.translate((-f21) / 2.0f, 0.0f);
                    f16 = f12 + f21;
                } else {
                    f16 = f12;
                }
                rectF2.set(0.0f, f18, f19, f20);
            } else {
                float f22 = (fArr[0] + fMin3) - (pathPoint.posVec[0] + f11);
                if (f22 < 0.0f) {
                    pathPoint2.translate((-f22) / 2.0f, 0.0f);
                    f15 = f12 - f22;
                } else {
                    f15 = f12;
                }
                rectF2.set(f17, f18, 0.0f, f20);
                f16 = f15;
            }
            RectF rectF3 = new RectF((-f16) / 2.0f, (-fMin2) / 2.0f, f16 / 2.0f, fMin2 / 2.0f);
            float[] fArr2 = pathPoint2.posVec;
            canvas.translate(fArr2[0], fArr2[1]);
            canvas.rotate(vectorToCanvasRotation(pathPoint2.tanVec));
            Path path = new Path();
            path.addRoundRect(rectF3, fMin3, fMin3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-vectorToCanvasRotation(pathPoint2.tanVec));
            float[] fArr3 = pathPoint2.posVec;
            canvas.translate(-fArr3[0], -fArr3[1]);
            float[] fArr4 = pathPoint.posVec;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(vectorToCanvasRotation(pathPoint.tanVec));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f11, f11, paint);
        } else {
            float[] fArr5 = pathPoint.posVec;
            canvas.translate(fArr5[0], fArr5[1]);
            canvas.rotate(vectorToCanvasRotation(pathPoint.tanVec));
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN) float f, boolean z9, boolean z10) {
        if (this.trackLength != rect.width()) {
            this.trackLength = rect.width();
            invalidateCachedPaths();
        }
        float preferredHeight = getPreferredHeight();
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - preferredHeight) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (((LinearProgressIndicatorSpec) this.spec).drawHorizontallyInverse) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f10 = this.trackLength / 2.0f;
        float f11 = preferredHeight / 2.0f;
        canvas.clipRect(-f10, -f11, f10, f11);
        S s6 = this.spec;
        this.displayedTrackThickness = ((LinearProgressIndicatorSpec) s6).trackThickness * f;
        this.displayedCornerRadius = Math.min(((LinearProgressIndicatorSpec) s6).trackThickness / 2, ((LinearProgressIndicatorSpec) s6).getTrackCornerRadiusInPx()) * f;
        S s9 = this.spec;
        this.displayedAmplitude = ((LinearProgressIndicatorSpec) s9).waveAmplitude * f;
        this.displayedInnerCornerRadius = Math.min(((LinearProgressIndicatorSpec) s9).trackThickness / 2.0f, ((LinearProgressIndicatorSpec) s9).getTrackInnerCornerRadiusInPx()) * f;
        if (z9 || z10) {
            if ((z9 && ((LinearProgressIndicatorSpec) this.spec).showAnimationBehavior == 2) || (z10 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z9 || (z10 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior != 3)) {
                canvas.translate(0.0f, ((1.0f - f) * ((LinearProgressIndicatorSpec) this.spec).trackThickness) / 2.0f);
            }
        }
        if (z10 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i, @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, to = ScatterMapKt.Sentinel) int i6) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i, i6);
        this.drawingDeterminateIndicator = false;
        if (((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize <= 0 || iCompositeARGBWithAlpha == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iCompositeARGBWithAlpha);
        S s6 = this.spec;
        DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint = new DrawingDelegate.PathPoint(new float[]{(this.trackLength / 2.0f) - (((LinearProgressIndicatorSpec) s6).trackStopIndicatorPadding != null ? (((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize / 2.0f) + ((LinearProgressIndicatorSpec) s6).trackStopIndicatorPadding.floatValue() : this.displayedTrackThickness / 2.0f), 0.0f}, new float[]{1.0f, 0.0f});
        S s9 = this.spec;
        drawRoundedBlock(canvas, paint, pathPoint, ((LinearProgressIndicatorSpec) s9).trackStopIndicatorSize, ((LinearProgressIndicatorSpec) s9).trackStopIndicatorSize, (this.displayedCornerRadius * ((LinearProgressIndicatorSpec) s9).trackStopIndicatorSize) / this.displayedTrackThickness);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate.ActiveIndicator activeIndicator, int i) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i);
        this.drawingDeterminateIndicator = activeIndicator.isDeterminate;
        float f = activeIndicator.startFraction;
        float f10 = activeIndicator.endFraction;
        int i6 = activeIndicator.gapSize;
        drawLine(canvas, paint, f, f10, iCompositeARGBWithAlpha, i6, i6, activeIndicator.amplitudeFraction, activeIndicator.phaseFraction, true);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f10, int i, int i6, @Px int i10) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i, i6);
        this.drawingDeterminateIndicator = false;
        drawLine(canvas, paint, f, f10, iCompositeARGBWithAlpha, i10, i10, 0.0f, 0.0f, false);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        S s6 = this.spec;
        return (((LinearProgressIndicatorSpec) s6).waveAmplitude * 2) + ((LinearProgressIndicatorSpec) s6).trackThickness;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return -1;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void invalidateCachedPaths() {
        this.cachedActivePath.rewind();
        if (((LinearProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator)) {
            boolean z9 = this.drawingDeterminateIndicator;
            LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.spec;
            int i = z9 ? linearProgressIndicatorSpec.wavelengthDeterminate : linearProgressIndicatorSpec.wavelengthIndeterminate;
            float f = this.trackLength;
            int i6 = (int) (f / i);
            this.adjustedWavelength = f / i6;
            for (int i10 = 0; i10 <= i6; i10++) {
                int i11 = i10 * 2;
                float f10 = i11 + 1;
                this.cachedActivePath.cubicTo(i11 + 0.48f, 0.0f, f10 - 0.48f, 1.0f, f10, 1.0f);
                float f11 = i11 + 2;
                this.cachedActivePath.cubicTo(f10 + 0.48f, 1.0f, f11 - 0.48f, 0.0f, f11, 0.0f);
            }
            this.transform.reset();
            this.transform.setScale(this.adjustedWavelength / 2.0f, -2.0f);
            this.transform.postTranslate(0.0f, 1.0f);
            this.cachedActivePath.transform(this.transform);
        } else {
            this.cachedActivePath.lineTo(this.trackLength, 0.0f);
        }
        this.activePathMeasure.setPath(this.cachedActivePath, false);
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint, float f, float f10, float f11) {
        drawRoundedBlock(canvas, paint, pathPoint, f, f10, f11, null, 0.0f, 0.0f, 0.0f, false);
    }
}
