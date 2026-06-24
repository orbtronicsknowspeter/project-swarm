package androidx.leanback.widget.picker;

import a4.x;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import androidx.annotation.IntRange;
import androidx.core.view.ViewCompat;
import androidx.core.view.contentcapture.a;
import androidx.leanback.R;
import androidx.leanback.widget.picker.PickerUtility;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public class TimePicker extends Picker {
    private static final int AM_INDEX = 0;
    private static final int HOURS_IN_HALF_DAY = 12;
    private static final int PM_INDEX = 1;
    static final String TAG = "TimePicker";
    PickerColumn mAmPmColumn;
    int mColAmPmIndex;
    int mColHourIndex;
    int mColMinuteIndex;
    private final PickerUtility.TimeConstant mConstant;
    private int mCurrentAmPmIndex;
    private int mCurrentHour;
    private int mCurrentMinute;
    PickerColumn mHourColumn;
    private boolean mIs24hFormat;
    PickerColumn mMinuteColumn;
    private String mTimePickerFormat;

    @SuppressLint({"CustomViewStyleable"})
    public TimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        PickerUtility.TimeConstant timeConstantInstance = PickerUtility.getTimeConstantInstance(Locale.getDefault(), context.getResources());
        this.mConstant = timeConstantInstance;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.lbTimePicker);
        ViewCompat.saveAttributeDataForStyleable(this, context, R.styleable.lbTimePicker, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            this.mIs24hFormat = typedArrayObtainStyledAttributes.getBoolean(R.styleable.lbTimePicker_is24HourFormat, DateFormat.is24HourFormat(context));
            boolean z9 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.lbTimePicker_useCurrentTime, true);
            typedArrayObtainStyledAttributes.recycle();
            updateColumns();
            updateColumnsRange();
            if (z9) {
                Calendar calendarForLocale = PickerUtility.getCalendarForLocale(null, timeConstantInstance.locale);
                setHour(calendarForLocale.get(11));
                setMinute(calendarForLocale.get(12));
                setAmPmValue();
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private String extractTimeFields() {
        String bestHourMinutePattern = getBestHourMinutePattern();
        boolean z9 = TextUtils.getLayoutDirectionFromLocale(this.mConstant.locale) == 1;
        boolean z10 = bestHourMinutePattern.indexOf(97) < 0 || bestHourMinutePattern.indexOf("a") > bestHourMinutePattern.indexOf("m");
        String str = z9 ? "mh" : "hm";
        return is24Hour() ? str : z10 ? str.concat("a") : "a".concat(str);
    }

    private static boolean isAnyOf(char c9, char[] cArr) {
        for (char c10 : cArr) {
            if (c9 == c10) {
                return true;
            }
        }
        return false;
    }

    private void setAmPmValue() {
        if (is24Hour()) {
            return;
        }
        setColumnValue(this.mColAmPmIndex, this.mCurrentAmPmIndex, false);
    }

    private void updateColumns() {
        String bestHourMinutePattern = getBestHourMinutePattern();
        if (TextUtils.equals(bestHourMinutePattern, this.mTimePickerFormat)) {
            return;
        }
        this.mTimePickerFormat = bestHourMinutePattern;
        String strExtractTimeFields = extractTimeFields();
        List<CharSequence> listExtractSeparators = extractSeparators();
        if (listExtractSeparators.size() != strExtractTimeFields.length() + 1) {
            a.i("Separators size: ", listExtractSeparators.size(), " must equal the size of timeFieldsPattern: ", strExtractTimeFields.length(), " + 1");
            return;
        }
        setSeparators(listExtractSeparators);
        String upperCase = strExtractTimeFields.toUpperCase(this.mConstant.locale);
        this.mAmPmColumn = null;
        this.mMinuteColumn = null;
        this.mHourColumn = null;
        this.mColAmPmIndex = -1;
        this.mColMinuteIndex = -1;
        this.mColHourIndex = -1;
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < upperCase.length(); i++) {
            char cCharAt = upperCase.charAt(i);
            if (cCharAt == 'A') {
                PickerColumn pickerColumn = new PickerColumn();
                this.mAmPmColumn = pickerColumn;
                arrayList.add(pickerColumn);
                this.mAmPmColumn.setStaticLabels(this.mConstant.ampm);
                this.mColAmPmIndex = i;
                updateMin(this.mAmPmColumn, 0);
                updateMax(this.mAmPmColumn, 1);
            } else if (cCharAt == 'H') {
                PickerColumn pickerColumn2 = new PickerColumn();
                this.mHourColumn = pickerColumn2;
                arrayList.add(pickerColumn2);
                this.mHourColumn.setStaticLabels(this.mConstant.hours24);
                this.mColHourIndex = i;
            } else {
                if (cCharAt != 'M') {
                    com.google.gson.internal.a.p("Invalid time picker format.");
                    return;
                }
                PickerColumn pickerColumn3 = new PickerColumn();
                this.mMinuteColumn = pickerColumn3;
                arrayList.add(pickerColumn3);
                this.mMinuteColumn.setStaticLabels(this.mConstant.minutes);
                this.mColMinuteIndex = i;
            }
        }
        setColumns(arrayList);
    }

    private void updateColumnsRange() {
        updateMin(this.mHourColumn, !this.mIs24hFormat ? 1 : 0);
        updateMax(this.mHourColumn, this.mIs24hFormat ? 23 : 12);
        updateMin(this.mMinuteColumn, 0);
        updateMax(this.mMinuteColumn, 59);
        PickerColumn pickerColumn = this.mAmPmColumn;
        if (pickerColumn != null) {
            updateMin(pickerColumn, 0);
            updateMax(this.mAmPmColumn, 1);
        }
    }

    private static void updateMax(PickerColumn pickerColumn, int i) {
        if (i != pickerColumn.getMaxValue()) {
            pickerColumn.setMaxValue(i);
        }
    }

    private static void updateMin(PickerColumn pickerColumn, int i) {
        if (i != pickerColumn.getMinValue()) {
            pickerColumn.setMinValue(i);
        }
    }

    public List<CharSequence> extractSeparators() {
        String bestHourMinutePattern = getBestHourMinutePattern();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        char[] cArr = {'H', 'h', 'K', 'k', 'm', 'M', 'a'};
        boolean z9 = false;
        char c9 = 0;
        for (int i = 0; i < bestHourMinutePattern.length(); i++) {
            char cCharAt = bestHourMinutePattern.charAt(i);
            if (cCharAt != ' ') {
                if (cCharAt != '\'') {
                    if (z9 || !isAnyOf(cCharAt, cArr)) {
                        sb.append(cCharAt);
                    } else if (cCharAt != c9) {
                        arrayList.add(sb.toString());
                        sb.setLength(0);
                    }
                    c9 = cCharAt;
                } else if (z9) {
                    z9 = false;
                } else {
                    sb.setLength(0);
                    z9 = true;
                }
            }
        }
        arrayList.add(sb.toString());
        return arrayList;
    }

    public String getBestHourMinutePattern() {
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(this.mConstant.locale, this.mIs24hFormat ? "Hma" : "hma");
        return TextUtils.isEmpty(bestDateTimePattern) ? "h:mma" : bestDateTimePattern;
    }

    public int getHour() {
        if (this.mIs24hFormat) {
            return this.mCurrentHour;
        }
        int i = this.mCurrentAmPmIndex;
        int i6 = this.mCurrentHour;
        return i == 0 ? i6 % 12 : (i6 % 12) + 12;
    }

    public int getMinute() {
        return this.mCurrentMinute;
    }

    public boolean is24Hour() {
        return this.mIs24hFormat;
    }

    public boolean isPm() {
        return this.mCurrentAmPmIndex == 1;
    }

    @Override // androidx.leanback.widget.picker.Picker
    public void onColumnValueChanged(int i, int i6) {
        if (i == this.mColHourIndex) {
            this.mCurrentHour = i6;
            return;
        }
        if (i == this.mColMinuteIndex) {
            this.mCurrentMinute = i6;
        } else if (i == this.mColAmPmIndex) {
            this.mCurrentAmPmIndex = i6;
        } else {
            com.google.gson.internal.a.p("Invalid column index.");
        }
    }

    public void setHour(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, to = 23) int i) {
        if (i < 0 || i > 23) {
            com.google.gson.internal.a.p(x.g(i, "hour: ", " is not in [0-23] range in"));
            return;
        }
        this.mCurrentHour = i;
        if (!is24Hour()) {
            int i6 = this.mCurrentHour;
            if (i6 >= 12) {
                this.mCurrentAmPmIndex = 1;
                if (i6 > 12) {
                    this.mCurrentHour = i6 - 12;
                }
            } else {
                this.mCurrentAmPmIndex = 0;
                if (i6 == 0) {
                    this.mCurrentHour = 12;
                }
            }
            setAmPmValue();
        }
        setColumnValue(this.mColHourIndex, this.mCurrentHour, false);
    }

    public void setIs24Hour(boolean z9) {
        if (this.mIs24hFormat == z9) {
            return;
        }
        int hour = getHour();
        int minute = getMinute();
        this.mIs24hFormat = z9;
        updateColumns();
        updateColumnsRange();
        setHour(hour);
        setMinute(minute);
        setAmPmValue();
    }

    public void setMinute(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, to = 59) int i) {
        if (i < 0 || i > 59) {
            com.google.gson.internal.a.p(x.g(i, "minute: ", " is not in [0-59] range."));
        } else {
            this.mCurrentMinute = i;
            setColumnValue(this.mColMinuteIndex, i, false);
        }
    }

    public TimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.timePickerStyle);
    }
}
