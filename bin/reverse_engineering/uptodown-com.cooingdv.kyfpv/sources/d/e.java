package d;

import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.InputDeviceCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.l;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final Charset A;
    public static final byte[] B;
    public static final List j = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final List f3513k = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f3514l = {8, 8, 8};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f3515m = {8};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f3516n = {-1, -40, -1};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f3517o = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f3518p = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String[] f3519q = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f3520r = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f3521s = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f3522t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c[][] f3523u;
    public static final c[] v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final HashMap[] f3524w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final HashMap[] f3525x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final HashSet f3526y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final HashMap f3527z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap[] f3530c = new HashMap[f3523u.length];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteOrder f3531d = ByteOrder.BIG_ENDIAN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3532e;
    public int f;
    public int g;
    public int h;
    public int i;

    static {
        c[] cVarArr = {new c(ExifInterface.TAG_NEW_SUBFILE_TYPE, 254, 4), new c(ExifInterface.TAG_SUBFILE_TYPE, 255, 4), new c(ExifInterface.TAG_IMAGE_WIDTH, 256), new c(ExifInterface.TAG_IMAGE_LENGTH, 257), new c(ExifInterface.TAG_BITS_PER_SAMPLE, 258, 3), new c(ExifInterface.TAG_COMPRESSION, 259, 3), new c(ExifInterface.TAG_PHOTOMETRIC_INTERPRETATION, 262, 3), new c(ExifInterface.TAG_IMAGE_DESCRIPTION, SubsamplingScaleImageView.ORIENTATION_270, 2), new c(ExifInterface.TAG_MAKE, 271, 2), new c(ExifInterface.TAG_MODEL, 272, 2), new c(ExifInterface.TAG_STRIP_OFFSETS, 273), new c(ExifInterface.TAG_ORIENTATION, 274, 3), new c(ExifInterface.TAG_SAMPLES_PER_PIXEL, 277, 3), new c(ExifInterface.TAG_ROWS_PER_STRIP, 278), new c(ExifInterface.TAG_STRIP_BYTE_COUNTS, 279), new c(ExifInterface.TAG_X_RESOLUTION, 282, 5), new c(ExifInterface.TAG_Y_RESOLUTION, 283, 5), new c(ExifInterface.TAG_PLANAR_CONFIGURATION, 284, 3), new c(ExifInterface.TAG_RESOLUTION_UNIT, 296, 3), new c(ExifInterface.TAG_TRANSFER_FUNCTION, 301, 3), new c(ExifInterface.TAG_SOFTWARE, 305, 2), new c(ExifInterface.TAG_DATETIME, 306, 2), new c(ExifInterface.TAG_ARTIST, 315, 2), new c(ExifInterface.TAG_WHITE_POINT, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 5), new c(ExifInterface.TAG_PRIMARY_CHROMATICITIES, 319, 5), new c("SubIFDPointer", 330, 4), new c(ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT, InputDeviceCompat.SOURCE_DPAD, 4), new c(ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, 514, 4), new c(ExifInterface.TAG_Y_CB_CR_COEFFICIENTS, 529, 5), new c(ExifInterface.TAG_Y_CB_CR_SUB_SAMPLING, 530, 3), new c(ExifInterface.TAG_Y_CB_CR_POSITIONING, 531, 3), new c(ExifInterface.TAG_REFERENCE_BLACK_WHITE, 532, 5), new c(ExifInterface.TAG_COPYRIGHT, 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c(ExifInterface.TAG_RW2_SENSOR_TOP_BORDER, 4, 4), new c(ExifInterface.TAG_RW2_SENSOR_LEFT_BORDER, 5, 4), new c(ExifInterface.TAG_RW2_SENSOR_BOTTOM_BORDER, 6, 4), new c(ExifInterface.TAG_RW2_SENSOR_RIGHT_BORDER, 7, 4), new c(ExifInterface.TAG_RW2_ISO, 23, 3), new c(ExifInterface.TAG_RW2_JPG_FROM_RAW, 46, 7)};
        c[] cVarArr2 = {new c(ExifInterface.TAG_EXPOSURE_TIME, 33434, 5), new c(ExifInterface.TAG_F_NUMBER, 33437, 5), new c(ExifInterface.TAG_EXPOSURE_PROGRAM, 34850, 3), new c(ExifInterface.TAG_SPECTRAL_SENSITIVITY, 34852, 2), new c(ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, 34855, 3), new c(ExifInterface.TAG_OECF, 34856, 7), new c(ExifInterface.TAG_EXIF_VERSION, 36864, 2), new c(ExifInterface.TAG_DATETIME_ORIGINAL, 36867, 2), new c(ExifInterface.TAG_DATETIME_DIGITIZED, 36868, 2), new c(ExifInterface.TAG_COMPONENTS_CONFIGURATION, 37121, 7), new c(ExifInterface.TAG_COMPRESSED_BITS_PER_PIXEL, 37122, 5), new c(ExifInterface.TAG_SHUTTER_SPEED_VALUE, 37377, 10), new c(ExifInterface.TAG_APERTURE_VALUE, 37378, 5), new c(ExifInterface.TAG_BRIGHTNESS_VALUE, 37379, 10), new c(ExifInterface.TAG_EXPOSURE_BIAS_VALUE, 37380, 10), new c(ExifInterface.TAG_MAX_APERTURE_VALUE, 37381, 5), new c(ExifInterface.TAG_SUBJECT_DISTANCE, 37382, 5), new c(ExifInterface.TAG_METERING_MODE, 37383, 3), new c(ExifInterface.TAG_LIGHT_SOURCE, 37384, 3), new c(ExifInterface.TAG_FLASH, 37385, 3), new c(ExifInterface.TAG_FOCAL_LENGTH, 37386, 5), new c(ExifInterface.TAG_SUBJECT_AREA, 37396, 3), new c(ExifInterface.TAG_MAKER_NOTE, 37500, 7), new c(ExifInterface.TAG_USER_COMMENT, 37510, 7), new c(ExifInterface.TAG_SUBSEC_TIME, 37520, 2), new c(ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, 37521, 2), new c(ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, 37522, 2), new c(ExifInterface.TAG_FLASHPIX_VERSION, 40960, 7), new c(ExifInterface.TAG_COLOR_SPACE, 40961, 3), new c(ExifInterface.TAG_PIXEL_X_DIMENSION, 40962), new c(ExifInterface.TAG_PIXEL_Y_DIMENSION, 40963), new c(ExifInterface.TAG_RELATED_SOUND_FILE, 40964, 2), new c("InteroperabilityIFDPointer", 40965, 4), new c(ExifInterface.TAG_FLASH_ENERGY, 41483, 5), new c(ExifInterface.TAG_SPATIAL_FREQUENCY_RESPONSE, 41484, 7), new c(ExifInterface.TAG_FOCAL_PLANE_X_RESOLUTION, 41486, 5), new c(ExifInterface.TAG_FOCAL_PLANE_Y_RESOLUTION, 41487, 5), new c(ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, 41488, 3), new c(ExifInterface.TAG_SUBJECT_LOCATION, 41492, 3), new c(ExifInterface.TAG_EXPOSURE_INDEX, 41493, 5), new c(ExifInterface.TAG_SENSING_METHOD, 41495, 3), new c(ExifInterface.TAG_FILE_SOURCE, 41728, 7), new c(ExifInterface.TAG_SCENE_TYPE, 41729, 7), new c(ExifInterface.TAG_CFA_PATTERN, 41730, 7), new c(ExifInterface.TAG_CUSTOM_RENDERED, 41985, 3), new c(ExifInterface.TAG_EXPOSURE_MODE, 41986, 3), new c(ExifInterface.TAG_WHITE_BALANCE, 41987, 3), new c(ExifInterface.TAG_DIGITAL_ZOOM_RATIO, 41988, 5), new c(ExifInterface.TAG_FOCAL_LENGTH_IN_35MM_FILM, 41989, 3), new c(ExifInterface.TAG_SCENE_CAPTURE_TYPE, 41990, 3), new c(ExifInterface.TAG_GAIN_CONTROL, 41991, 3), new c(ExifInterface.TAG_CONTRAST, 41992, 3), new c(ExifInterface.TAG_SATURATION, 41993, 3), new c(ExifInterface.TAG_SHARPNESS, 41994, 3), new c(ExifInterface.TAG_DEVICE_SETTING_DESCRIPTION, 41995, 7), new c(ExifInterface.TAG_SUBJECT_DISTANCE_RANGE, 41996, 3), new c(ExifInterface.TAG_IMAGE_UNIQUE_ID, 42016, 2), new c(ExifInterface.TAG_DNG_VERSION, 50706, 1), new c(ExifInterface.TAG_DEFAULT_CROP_SIZE, 50720)};
        c[] cVarArr3 = {new c(ExifInterface.TAG_GPS_VERSION_ID, 0, 1), new c(ExifInterface.TAG_GPS_LATITUDE_REF, 1, 2), new c(ExifInterface.TAG_GPS_LATITUDE, 2, 5), new c(ExifInterface.TAG_GPS_LONGITUDE_REF, 3, 2), new c(ExifInterface.TAG_GPS_LONGITUDE, 4, 5), new c(ExifInterface.TAG_GPS_ALTITUDE_REF, 5, 1), new c(ExifInterface.TAG_GPS_ALTITUDE, 6, 5), new c(ExifInterface.TAG_GPS_TIMESTAMP, 7, 5), new c(ExifInterface.TAG_GPS_SATELLITES, 8, 2), new c(ExifInterface.TAG_GPS_STATUS, 9, 2), new c(ExifInterface.TAG_GPS_MEASURE_MODE, 10, 2), new c(ExifInterface.TAG_GPS_DOP, 11, 5), new c(ExifInterface.TAG_GPS_SPEED_REF, 12, 2), new c(ExifInterface.TAG_GPS_SPEED, 13, 5), new c(ExifInterface.TAG_GPS_TRACK_REF, 14, 2), new c(ExifInterface.TAG_GPS_TRACK, 15, 5), new c(ExifInterface.TAG_GPS_IMG_DIRECTION_REF, 16, 2), new c(ExifInterface.TAG_GPS_IMG_DIRECTION, 17, 5), new c(ExifInterface.TAG_GPS_MAP_DATUM, 18, 2), new c(ExifInterface.TAG_GPS_DEST_LATITUDE_REF, 19, 2), new c(ExifInterface.TAG_GPS_DEST_LATITUDE, 20, 5), new c(ExifInterface.TAG_GPS_DEST_LONGITUDE_REF, 21, 2), new c(ExifInterface.TAG_GPS_DEST_LONGITUDE, 22, 5), new c(ExifInterface.TAG_GPS_DEST_BEARING_REF, 23, 2), new c(ExifInterface.TAG_GPS_DEST_BEARING, 24, 5), new c(ExifInterface.TAG_GPS_DEST_DISTANCE_REF, 25, 2), new c(ExifInterface.TAG_GPS_DEST_DISTANCE, 26, 5), new c(ExifInterface.TAG_GPS_PROCESSING_METHOD, 27, 7), new c(ExifInterface.TAG_GPS_AREA_INFORMATION, 28, 7), new c(ExifInterface.TAG_GPS_DATESTAMP, 29, 2), new c(ExifInterface.TAG_GPS_DIFFERENTIAL, 30, 3)};
        c[] cVarArr4 = {new c(ExifInterface.TAG_INTEROPERABILITY_INDEX, 1, 2)};
        c[] cVarArr5 = {new c(ExifInterface.TAG_NEW_SUBFILE_TYPE, 254, 4), new c(ExifInterface.TAG_SUBFILE_TYPE, 255, 4), new c(ExifInterface.TAG_THUMBNAIL_IMAGE_WIDTH, 256), new c(ExifInterface.TAG_THUMBNAIL_IMAGE_LENGTH, 257), new c(ExifInterface.TAG_BITS_PER_SAMPLE, 258, 3), new c(ExifInterface.TAG_COMPRESSION, 259, 3), new c(ExifInterface.TAG_PHOTOMETRIC_INTERPRETATION, 262, 3), new c(ExifInterface.TAG_IMAGE_DESCRIPTION, SubsamplingScaleImageView.ORIENTATION_270, 2), new c(ExifInterface.TAG_MAKE, 271, 2), new c(ExifInterface.TAG_MODEL, 272, 2), new c(ExifInterface.TAG_STRIP_OFFSETS, 273), new c(ExifInterface.TAG_ORIENTATION, 274, 3), new c(ExifInterface.TAG_SAMPLES_PER_PIXEL, 277, 3), new c(ExifInterface.TAG_ROWS_PER_STRIP, 278), new c(ExifInterface.TAG_STRIP_BYTE_COUNTS, 279), new c(ExifInterface.TAG_X_RESOLUTION, 282, 5), new c(ExifInterface.TAG_Y_RESOLUTION, 283, 5), new c(ExifInterface.TAG_PLANAR_CONFIGURATION, 284, 3), new c(ExifInterface.TAG_RESOLUTION_UNIT, 296, 3), new c(ExifInterface.TAG_TRANSFER_FUNCTION, 301, 3), new c(ExifInterface.TAG_SOFTWARE, 305, 2), new c(ExifInterface.TAG_DATETIME, 306, 2), new c(ExifInterface.TAG_ARTIST, 315, 2), new c(ExifInterface.TAG_WHITE_POINT, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 5), new c(ExifInterface.TAG_PRIMARY_CHROMATICITIES, 319, 5), new c("SubIFDPointer", 330, 4), new c(ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT, InputDeviceCompat.SOURCE_DPAD, 4), new c(ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, 514, 4), new c(ExifInterface.TAG_Y_CB_CR_COEFFICIENTS, 529, 5), new c(ExifInterface.TAG_Y_CB_CR_SUB_SAMPLING, 530, 3), new c(ExifInterface.TAG_Y_CB_CR_POSITIONING, 531, 3), new c(ExifInterface.TAG_REFERENCE_BLACK_WHITE, 532, 5), new c(ExifInterface.TAG_COPYRIGHT, 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c(ExifInterface.TAG_DNG_VERSION, 50706, 1), new c(ExifInterface.TAG_DEFAULT_CROP_SIZE, 50720)};
        f3522t = new c(ExifInterface.TAG_STRIP_OFFSETS, 273, 3);
        f3523u = new c[][]{cVarArr, cVarArr2, cVarArr3, cVarArr4, cVarArr5, cVarArr, new c[]{new c(ExifInterface.TAG_ORF_THUMBNAIL_IMAGE, 256, 7), new c("CameraSettingsIFDPointer", 8224, 4), new c("ImageProcessingIFDPointer", 8256, 4)}, new c[]{new c(ExifInterface.TAG_ORF_PREVIEW_IMAGE_START, 257, 4), new c(ExifInterface.TAG_ORF_PREVIEW_IMAGE_LENGTH, 258, 4)}, new c[]{new c(ExifInterface.TAG_ORF_ASPECT_FRAME, 4371, 3)}, new c[]{new c(ExifInterface.TAG_COLOR_SPACE, 55, 3)}};
        v = new c[]{new c("SubIFDPointer", 330, 4), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("InteroperabilityIFDPointer", 40965, 4), new c("CameraSettingsIFDPointer", 8224, 1), new c("ImageProcessingIFDPointer", 8256, 1)};
        f3524w = new HashMap[10];
        f3525x = new HashMap[10];
        f3526y = new HashSet(Arrays.asList(ExifInterface.TAG_F_NUMBER, ExifInterface.TAG_DIGITAL_ZOOM_RATIO, ExifInterface.TAG_EXPOSURE_TIME, ExifInterface.TAG_SUBJECT_DISTANCE, ExifInterface.TAG_GPS_TIMESTAMP));
        f3527z = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        A = charsetForName;
        B = "Exif\u0000\u0000".getBytes(charsetForName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            c[][] cVarArr6 = f3523u;
            if (i >= cVarArr6.length) {
                HashMap map = f3527z;
                c[] cVarArr7 = v;
                map.put(Integer.valueOf(cVarArr7[0].f3507a), 5);
                map.put(Integer.valueOf(cVarArr7[1].f3507a), 1);
                map.put(Integer.valueOf(cVarArr7[2].f3507a), 2);
                map.put(Integer.valueOf(cVarArr7[3].f3507a), 3);
                map.put(Integer.valueOf(cVarArr7[4].f3507a), 7);
                map.put(Integer.valueOf(cVarArr7[5].f3507a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
            f3524w[i] = new HashMap();
            f3525x[i] = new HashMap();
            for (c cVar : cVarArr6[i]) {
                f3524w[i].put(Integer.valueOf(cVar.f3507a), cVar);
                f3525x[i].put(cVar.f3508b, cVar);
            }
            i++;
        }
    }

    public e(String str) throws Throwable {
        FileInputStream fileInputStream;
        this.f3528a = str;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            m(fileInputStream);
            try {
                fileInputStream.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (RuntimeException e11) {
                    throw e11;
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] b(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static ByteOrder o(a aVar) throws IOException {
        short s6 = aVar.readShort();
        if (s6 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s6 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        androidx.core.content.pm.a.k(Integer.toHexString(s6), "Invalid byte order: ");
        return null;
    }

    public final void a() {
        String strC = c(ExifInterface.TAG_DATETIME_ORIGINAL);
        HashMap[] mapArr = this.f3530c;
        if (strC != null && c(ExifInterface.TAG_DATETIME) == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strC.concat("\u0000").getBytes(A);
            map.put(ExifInterface.TAG_DATETIME, new b(2, bytes.length, bytes));
        }
        if (c(ExifInterface.TAG_IMAGE_WIDTH) == null) {
            mapArr[0].put(ExifInterface.TAG_IMAGE_WIDTH, b.a(0L, this.f3531d));
        }
        if (c(ExifInterface.TAG_IMAGE_LENGTH) == null) {
            mapArr[0].put(ExifInterface.TAG_IMAGE_LENGTH, b.a(0L, this.f3531d));
        }
        if (c(ExifInterface.TAG_ORIENTATION) == null) {
            mapArr[0].put(ExifInterface.TAG_ORIENTATION, b.a(0L, this.f3531d));
        }
        if (c(ExifInterface.TAG_LIGHT_SOURCE) == null) {
            mapArr[1].put(ExifInterface.TAG_LIGHT_SOURCE, b.a(0L, this.f3531d));
        }
    }

    public final String c(String str) {
        b bVarD = d(str);
        if (bVarD != null) {
            int i = bVarD.f3504a;
            if (!f3526y.contains(str)) {
                return bVarD.f(this.f3531d);
            }
            if (str.equals(ExifInterface.TAG_GPS_TIMESTAMP)) {
                if (i != 5 && i != 10) {
                    l.z(i, "GPS Timestamp format is not rational. format=", "ExifInterface");
                    return null;
                }
                d[] dVarArr = (d[]) bVarD.g(this.f3531d);
                if (dVarArr == null || dVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(dVarArr));
                    return null;
                }
                d dVar = dVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (dVar.f3511a / dVar.f3512b));
                d dVar2 = dVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (dVar2.f3511a / dVar2.f3512b));
                d dVar3 = dVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (dVar3.f3511a / dVar3.f3512b)));
            }
            try {
                return Double.toString(bVarD.d(this.f3531d));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final b d(String str) {
        if (ExifInterface.TAG_ISO_SPEED_RATINGS.equals(str)) {
            str = ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        for (int i = 0; i < f3523u.length; i++) {
            b bVar = (b) this.f3530c[i].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056 A[FALL_THROUGH] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(d.a r12, int r13, int r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.e.e(d.a, int, int):void");
    }

    public final int f(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr2 = f3516n;
            if (i >= bArr2.length) {
                return 4;
            }
            if (bArr[i] != bArr2[i]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i6 = 0; i6 < bytes.length; i6++) {
                    if (bArr[i6] != bytes[i6]) {
                        a aVar = new a(bArr);
                        ByteOrder byteOrderO = o(aVar);
                        this.f3531d = byteOrderO;
                        aVar.f3501b = byteOrderO;
                        short s6 = aVar.readShort();
                        aVar.close();
                        if (s6 == 20306 || s6 == 21330) {
                            return 7;
                        }
                        a aVar2 = new a(bArr);
                        ByteOrder byteOrderO2 = o(aVar2);
                        this.f3531d = byteOrderO2;
                        aVar2.f3501b = byteOrderO2;
                        short s9 = aVar2.readShort();
                        aVar2.close();
                        return s9 == 85 ? 10 : 0;
                    }
                }
                return 9;
            }
            i++;
        }
    }

    public final void g(a aVar) throws Throwable {
        int i;
        int i6;
        i(aVar);
        HashMap[] mapArr = this.f3530c;
        b bVar = (b) mapArr[1].get(ExifInterface.TAG_MAKER_NOTE);
        if (bVar != null) {
            a aVar2 = new a(bVar.f3506c);
            aVar2.f3501b = this.f3531d;
            byte[] bArr = f3517o;
            byte[] bArr2 = new byte[bArr.length];
            aVar2.readFully(bArr2);
            aVar2.b(0L);
            byte[] bArr3 = f3518p;
            byte[] bArr4 = new byte[bArr3.length];
            aVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                aVar2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                aVar2.b(12L);
            }
            p(aVar2, 6);
            b bVar2 = (b) mapArr[7].get(ExifInterface.TAG_ORF_PREVIEW_IMAGE_START);
            b bVar3 = (b) mapArr[7].get(ExifInterface.TAG_ORF_PREVIEW_IMAGE_LENGTH);
            if (bVar2 != null && bVar3 != null) {
                mapArr[5].put(ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT, bVar2);
                mapArr[5].put(ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, bVar3);
            }
            b bVar4 = (b) mapArr[8].get(ExifInterface.TAG_ORF_ASPECT_FRAME);
            if (bVar4 != null) {
                int[] iArr = (int[]) bVar4.g(this.f3531d);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i10 = iArr[2];
                int i11 = iArr[0];
                if (i10 <= i11 || (i = iArr[3]) <= (i6 = iArr[1])) {
                    return;
                }
                int i12 = (i10 - i11) + 1;
                int i13 = (i - i6) + 1;
                if (i12 < i13) {
                    int i14 = i12 + i13;
                    i13 = i14 - i13;
                    i12 = i14 - i13;
                }
                b bVarC = b.c(i12, this.f3531d);
                b bVarC2 = b.c(i13, this.f3531d);
                mapArr[0].put(ExifInterface.TAG_IMAGE_WIDTH, bVarC);
                mapArr[0].put(ExifInterface.TAG_IMAGE_LENGTH, bVarC2);
            }
        }
    }

    public final void h(a aVar) throws IOException {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i6 = ByteBuffer.wrap(bArr2).getInt();
        e(aVar, i, 5);
        aVar.b(i6);
        aVar.f3501b = ByteOrder.BIG_ENDIAN;
        int i10 = aVar.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            int unsignedShort = aVar.readUnsignedShort();
            int unsignedShort2 = aVar.readUnsignedShort();
            if (unsignedShort == f3522t.f3507a) {
                short s6 = aVar.readShort();
                short s9 = aVar.readShort();
                b bVarC = b.c(s6, this.f3531d);
                b bVarC2 = b.c(s9, this.f3531d);
                HashMap[] mapArr = this.f3530c;
                mapArr[0].put(ExifInterface.TAG_IMAGE_LENGTH, bVarC);
                mapArr[0].put(ExifInterface.TAG_IMAGE_WIDTH, bVarC2);
                return;
            }
            aVar.skipBytes(unsignedShort2);
        }
    }

    public final void i(a aVar) throws Throwable {
        b bVar;
        n(aVar, aVar.f3500a.available());
        p(aVar, 0);
        s(aVar, 0);
        s(aVar, 5);
        s(aVar, 4);
        r(0, 5);
        r(0, 4);
        r(5, 4);
        HashMap[] mapArr = this.f3530c;
        b bVar2 = (b) mapArr[1].get(ExifInterface.TAG_PIXEL_X_DIMENSION);
        b bVar3 = (b) mapArr[1].get(ExifInterface.TAG_PIXEL_Y_DIMENSION);
        if (bVar2 != null && bVar3 != null) {
            mapArr[0].put(ExifInterface.TAG_IMAGE_WIDTH, bVar2);
            mapArr[0].put(ExifInterface.TAG_IMAGE_LENGTH, bVar3);
        }
        if (mapArr[4].isEmpty() && l(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!l(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        if (this.f3529b != 8 || (bVar = (b) mapArr[1].get(ExifInterface.TAG_MAKER_NOTE)) == null) {
            return;
        }
        a aVar2 = new a(bVar.f3506c);
        aVar2.f3501b = this.f3531d;
        aVar2.b(6L);
        p(aVar2, 9);
        b bVar4 = (b) mapArr[9].get(ExifInterface.TAG_COLOR_SPACE);
        if (bVar4 != null) {
            mapArr[1].put(ExifInterface.TAG_COLOR_SPACE, bVar4);
        }
    }

    public final void j(a aVar) throws Throwable {
        i(aVar);
        HashMap[] mapArr = this.f3530c;
        if (((b) mapArr[0].get(ExifInterface.TAG_RW2_JPG_FROM_RAW)) != null) {
            e(aVar, this.i, 5);
        }
        b bVar = (b) mapArr[0].get(ExifInterface.TAG_RW2_ISO);
        b bVar2 = (b) mapArr[1].get(ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY);
        if (bVar == null || bVar2 != null) {
            return;
        }
        mapArr[1].put(ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, bVar);
    }

    public final void k(a aVar, HashMap map) throws Throwable {
        int i;
        b bVar = (b) map.get(ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT);
        b bVar2 = (b) map.get(ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
        if (bVar == null || bVar2 == null) {
            return;
        }
        int iE = bVar.e(this.f3531d);
        int iMin = Math.min(bVar2.e(this.f3531d), aVar.f3500a.available() - iE);
        int i6 = this.f3529b;
        if (i6 != 4 && i6 != 9 && i6 != 10) {
            if (i6 == 7) {
                i = this.f;
            }
            if (iE > 0 || iMin <= 0 || this.f3528a != null) {
                return;
            }
            aVar.b(iE);
            aVar.readFully(new byte[iMin]);
            return;
        }
        i = this.f3532e;
        iE += i;
        if (iE > 0) {
        }
    }

    public final boolean l(HashMap map) {
        b bVar = (b) map.get(ExifInterface.TAG_IMAGE_LENGTH);
        b bVar2 = (b) map.get(ExifInterface.TAG_IMAGE_WIDTH);
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.e(this.f3531d) <= 512 && bVar2.e(this.f3531d) <= 512;
    }

    public final void m(FileInputStream fileInputStream) {
        for (int i = 0; i < f3523u.length; i++) {
            try {
                this.f3530c[i] = new HashMap();
            } catch (IOException unused) {
                a();
                return;
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 5000);
        this.f3529b = f(bufferedInputStream);
        a aVar = new a(bufferedInputStream);
        switch (this.f3529b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                i(aVar);
                break;
            case 4:
                e(aVar, 0, 0);
                break;
            case 7:
                g(aVar);
                break;
            case 9:
                h(aVar);
                break;
            case 10:
                j(aVar);
                break;
        }
        q(aVar);
        a();
    }

    public final void n(a aVar, int i) throws IOException {
        ByteOrder byteOrderO = o(aVar);
        this.f3531d = byteOrderO;
        aVar.f3501b = byteOrderO;
        int unsignedShort = aVar.readUnsignedShort();
        int i6 = this.f3529b;
        if (i6 != 7 && i6 != 10 && unsignedShort != 42) {
            androidx.core.content.pm.a.k(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i10 = aVar.readInt();
        if (i10 < 8 || i10 >= i) {
            com.google.gson.internal.a.n(l.u(i10, "Invalid first Ifd offset: "));
            return;
        }
        int i11 = i10 - 8;
        if (i11 <= 0 || aVar.skipBytes(i11) == i11) {
            return;
        }
        com.google.gson.internal.a.n(l.u(i11, "Couldn't jump to first Ifd: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(d.a r30, int r31) {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.e.p(d.a, int):void");
    }

    public final void q(a aVar) throws Throwable {
        b bVar;
        HashMap map = this.f3530c[4];
        b bVar2 = (b) map.get(ExifInterface.TAG_COMPRESSION);
        if (bVar2 == null) {
            k(aVar, map);
            return;
        }
        int iE = bVar2.e(this.f3531d);
        if (iE != 1) {
            if (iE == 6) {
                k(aVar, map);
                return;
            } else if (iE != 7) {
                return;
            }
        }
        b bVar3 = (b) map.get(ExifInterface.TAG_BITS_PER_SAMPLE);
        if (bVar3 != null) {
            int[] iArr = (int[]) bVar3.g(this.f3531d);
            int[] iArr2 = f3514l;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.f3529b != 3 || (bVar = (b) map.get(ExifInterface.TAG_PHOTOMETRIC_INTERPRETATION)) == null) {
                    return;
                }
                int iE2 = bVar.e(this.f3531d);
                if ((iE2 != 1 || !Arrays.equals(iArr, f3515m)) && (iE2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            b bVar4 = (b) map.get(ExifInterface.TAG_STRIP_OFFSETS);
            b bVar5 = (b) map.get(ExifInterface.TAG_STRIP_BYTE_COUNTS);
            if (bVar4 == null || bVar5 == null) {
                return;
            }
            long[] jArrB = b(bVar4.g(this.f3531d));
            long[] jArrB2 = b(bVar5.g(this.f3531d));
            if (jArrB == null) {
                Log.w("ExifInterface", "stripOffsets should not be null.");
                return;
            }
            if (jArrB2 == null) {
                Log.w("ExifInterface", "stripByteCounts should not be null.");
                return;
            }
            long j6 = 0;
            for (long j10 : jArrB2) {
                j6 += j10;
            }
            byte[] bArr = new byte[(int) j6];
            int i = 0;
            int i6 = 0;
            for (int i10 = 0; i10 < jArrB.length; i10++) {
                int i11 = (int) jArrB[i10];
                int i12 = (int) jArrB2[i10];
                int i13 = i11 - i;
                if (i13 < 0) {
                    Log.d("ExifInterface", "Invalid strip offset value");
                }
                aVar.b(i13);
                int i14 = i + i13;
                byte[] bArr2 = new byte[i12];
                aVar.read(bArr2);
                i = i14 + i12;
                System.arraycopy(bArr2, 0, bArr, i6, i12);
                i6 += i12;
            }
        }
    }

    public final void r(int i, int i6) throws Throwable {
        HashMap[] mapArr = this.f3530c;
        if (mapArr[i].isEmpty() || mapArr[i6].isEmpty()) {
            return;
        }
        b bVar = (b) mapArr[i].get(ExifInterface.TAG_IMAGE_LENGTH);
        b bVar2 = (b) mapArr[i].get(ExifInterface.TAG_IMAGE_WIDTH);
        b bVar3 = (b) mapArr[i6].get(ExifInterface.TAG_IMAGE_LENGTH);
        b bVar4 = (b) mapArr[i6].get(ExifInterface.TAG_IMAGE_WIDTH);
        if (bVar == null || bVar2 == null || bVar3 == null || bVar4 == null) {
            return;
        }
        int iE = bVar.e(this.f3531d);
        int iE2 = bVar2.e(this.f3531d);
        int iE3 = bVar3.e(this.f3531d);
        int iE4 = bVar4.e(this.f3531d);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i6];
        mapArr[i6] = map;
    }

    public final void s(a aVar, int i) throws Throwable {
        b bVar;
        b bVarC;
        b bVarC2;
        HashMap[] mapArr = this.f3530c;
        b bVar2 = (b) mapArr[i].get(ExifInterface.TAG_DEFAULT_CROP_SIZE);
        b bVar3 = (b) mapArr[i].get(ExifInterface.TAG_RW2_SENSOR_TOP_BORDER);
        b bVar4 = (b) mapArr[i].get(ExifInterface.TAG_RW2_SENSOR_LEFT_BORDER);
        b bVar5 = (b) mapArr[i].get(ExifInterface.TAG_RW2_SENSOR_BOTTOM_BORDER);
        b bVar6 = (b) mapArr[i].get(ExifInterface.TAG_RW2_SENSOR_RIGHT_BORDER);
        if (bVar2 != null) {
            int i6 = bVar2.f3504a;
            ByteOrder byteOrder = this.f3531d;
            if (i6 == 5) {
                d[] dVarArr = (d[]) bVar2.g(byteOrder);
                if (dVarArr == null || dVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(dVarArr));
                    return;
                }
                bVarC = b.b(dVarArr[0], this.f3531d);
                bVarC2 = b.b(dVarArr[1], this.f3531d);
            } else {
                int[] iArr = (int[]) bVar2.g(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                bVarC = b.c(iArr[0], this.f3531d);
                bVarC2 = b.c(iArr[1], this.f3531d);
            }
            mapArr[i].put(ExifInterface.TAG_IMAGE_WIDTH, bVarC);
            mapArr[i].put(ExifInterface.TAG_IMAGE_LENGTH, bVarC2);
            return;
        }
        if (bVar3 == null || bVar4 == null || bVar5 == null || bVar6 == null) {
            b bVar7 = (b) mapArr[i].get(ExifInterface.TAG_IMAGE_LENGTH);
            b bVar8 = (b) mapArr[i].get(ExifInterface.TAG_IMAGE_WIDTH);
            if ((bVar7 == null || bVar8 == null) && (bVar = (b) mapArr[i].get(ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT)) != null) {
                e(aVar, bVar.e(this.f3531d), i);
                return;
            }
            return;
        }
        int iE = bVar3.e(this.f3531d);
        int iE2 = bVar5.e(this.f3531d);
        int iE3 = bVar6.e(this.f3531d);
        int iE4 = bVar4.e(this.f3531d);
        if (iE2 <= iE || iE3 <= iE4) {
            return;
        }
        b bVarC3 = b.c(iE2 - iE, this.f3531d);
        b bVarC4 = b.c(iE3 - iE4, this.f3531d);
        mapArr[i].put(ExifInterface.TAG_IMAGE_LENGTH, bVarC3);
        mapArr[i].put(ExifInterface.TAG_IMAGE_WIDTH, bVarC4);
    }
}
