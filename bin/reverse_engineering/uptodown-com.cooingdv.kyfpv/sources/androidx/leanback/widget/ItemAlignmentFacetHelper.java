package androidx.leanback.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.GridLayoutManager;
import androidx.leanback.widget.ItemAlignmentFacet;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
class ItemAlignmentFacetHelper {
    private static final Rect sRect = new Rect();

    private ItemAlignmentFacetHelper() {
    }

    public static int getAlignmentPosition(View view, ItemAlignmentFacet.ItemAlignmentDef itemAlignmentDef, int i) {
        View viewFindViewById;
        GridLayoutManager.LayoutParams layoutParams = (GridLayoutManager.LayoutParams) view.getLayoutParams();
        int i6 = itemAlignmentDef.mViewId;
        if (i6 == 0 || (viewFindViewById = view.findViewById(i6)) == null) {
            viewFindViewById = view;
        }
        int opticalTopInset = itemAlignmentDef.mOffset;
        if (i != 0) {
            if (itemAlignmentDef.mOffsetWithPadding) {
                float f = itemAlignmentDef.mOffsetPercent;
                if (f == 0.0f) {
                    opticalTopInset += viewFindViewById.getPaddingTop();
                } else if (f == 100.0f) {
                    opticalTopInset -= viewFindViewById.getPaddingBottom();
                }
            }
            if (itemAlignmentDef.mOffsetPercent != -1.0f) {
                opticalTopInset += (int) (((viewFindViewById == view ? layoutParams.getOpticalHeight(viewFindViewById) : viewFindViewById.getHeight()) * itemAlignmentDef.mOffsetPercent) / 100.0f);
            }
            if (view != viewFindViewById) {
                Rect rect = sRect;
                rect.top = opticalTopInset;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect);
                opticalTopInset = rect.top - layoutParams.getOpticalTopInset();
            }
            return itemAlignmentDef.isAlignedToTextViewBaseLine() ? viewFindViewById.getBaseline() + opticalTopInset : opticalTopInset;
        }
        if (view.getLayoutDirection() != 1) {
            if (itemAlignmentDef.mOffsetWithPadding) {
                float f10 = itemAlignmentDef.mOffsetPercent;
                if (f10 == 0.0f) {
                    opticalTopInset += viewFindViewById.getPaddingLeft();
                } else if (f10 == 100.0f) {
                    opticalTopInset -= viewFindViewById.getPaddingRight();
                }
            }
            if (itemAlignmentDef.mOffsetPercent != -1.0f) {
                opticalTopInset += (int) (((viewFindViewById == view ? layoutParams.getOpticalWidth(viewFindViewById) : viewFindViewById.getWidth()) * itemAlignmentDef.mOffsetPercent) / 100.0f);
            }
            if (view == viewFindViewById) {
                return opticalTopInset;
            }
            Rect rect2 = sRect;
            rect2.left = opticalTopInset;
            ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect2);
            return rect2.left - layoutParams.getOpticalLeftInset();
        }
        int opticalWidth = (viewFindViewById == view ? layoutParams.getOpticalWidth(viewFindViewById) : viewFindViewById.getWidth()) - opticalTopInset;
        if (itemAlignmentDef.mOffsetWithPadding) {
            float f11 = itemAlignmentDef.mOffsetPercent;
            if (f11 == 0.0f) {
                opticalWidth -= viewFindViewById.getPaddingRight();
            } else if (f11 == 100.0f) {
                opticalWidth += viewFindViewById.getPaddingLeft();
            }
        }
        if (itemAlignmentDef.mOffsetPercent != -1.0f) {
            opticalWidth -= (int) (((viewFindViewById == view ? layoutParams.getOpticalWidth(viewFindViewById) : viewFindViewById.getWidth()) * itemAlignmentDef.mOffsetPercent) / 100.0f);
        }
        if (view == viewFindViewById) {
            return opticalWidth;
        }
        Rect rect3 = sRect;
        rect3.right = opticalWidth;
        ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect3);
        return rect3.right + layoutParams.getOpticalRightInset();
    }
}
