package androidx.constraintlayout.core.parser;

import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public class CLParser {
    static boolean sDebug = false;
    private String mContent;
    private boolean mHasComment = false;
    private int mLineNumber;

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public enum TYPE {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public CLParser(String str) {
        this.mContent = str;
    }

    private CLElement createElement(CLElement cLElement, int i, TYPE type, boolean z9, char[] cArr) {
        CLElement cLElementAllocate;
        if (sDebug) {
            System.out.println("CREATE " + type + " at " + cArr[i]);
        }
        switch (type.ordinal()) {
            case 1:
                cLElementAllocate = CLObject.allocate(cArr);
                i++;
                break;
            case 2:
                cLElementAllocate = CLArray.allocate(cArr);
                i++;
                break;
            case 3:
                cLElementAllocate = CLNumber.allocate(cArr);
                break;
            case 4:
                cLElementAllocate = CLString.allocate(cArr);
                break;
            case 5:
                cLElementAllocate = CLKey.allocate(cArr);
                break;
            case 6:
                cLElementAllocate = CLToken.allocate(cArr);
                break;
            default:
                cLElementAllocate = null;
                break;
        }
        if (cLElementAllocate == null) {
            return null;
        }
        cLElementAllocate.setLine(this.mLineNumber);
        if (z9) {
            cLElementAllocate.setStart(i);
        }
        if (cLElement instanceof CLContainer) {
            cLElementAllocate.setContainer((CLContainer) cLElement);
        }
        return cLElementAllocate;
    }

    private CLElement getNextJsonElement(int i, char c9, CLElement cLElement, char[] cArr) throws CLParsingException {
        if (c9 != '\t' && c9 != '\n' && c9 != '\r' && c9 != ' ') {
            if (c9 == '\"' || c9 == '\'') {
                return cLElement instanceof CLObject ? createElement(cLElement, i, TYPE.KEY, true, cArr) : createElement(cLElement, i, TYPE.STRING, true, cArr);
            }
            if (c9 == '[') {
                return createElement(cLElement, i, TYPE.ARRAY, true, cArr);
            }
            if (c9 != ']') {
                if (c9 == '{') {
                    return createElement(cLElement, i, TYPE.OBJECT, true, cArr);
                }
                if (c9 != '}') {
                    switch (c9) {
                        case '+':
                        case '-':
                        case '.':
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                        case '1':
                        case '2':
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                        case '8':
                        case '9':
                            return createElement(cLElement, i, TYPE.NUMBER, true, cArr);
                        case ',':
                        case ':':
                            break;
                        case '/':
                            int i6 = i + 1;
                            if (i6 >= cArr.length || cArr[i6] != '/') {
                                return cLElement;
                            }
                            this.mHasComment = true;
                            return cLElement;
                        default:
                            if (!(cLElement instanceof CLContainer) || (cLElement instanceof CLObject)) {
                                return createElement(cLElement, i, TYPE.KEY, true, cArr);
                            }
                            CLElement cLElementCreateElement = createElement(cLElement, i, TYPE.TOKEN, true, cArr);
                            CLToken cLToken = (CLToken) cLElementCreateElement;
                            if (cLToken.validate(c9, i)) {
                                return cLElementCreateElement;
                            }
                            throw new CLParsingException("incorrect token <" + c9 + "> at line " + this.mLineNumber, cLToken);
                    }
                }
            }
            cLElement.setEnd(i - 1);
            CLElement container = cLElement.getContainer();
            container.setEnd(i);
            return container;
        }
        return cLElement;
    }

    public CLObject parse() throws CLParsingException {
        int i;
        char[] charArray = this.mContent.toCharArray();
        int length = charArray.length;
        int i6 = 1;
        this.mLineNumber = 1;
        boolean z9 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            char c9 = charArray[i10];
            if (c9 == '{') {
                break;
            }
            if (c9 == '\n') {
                this.mLineNumber++;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new CLParsingException("invalid json content", null);
        }
        CLObject cLObjectAllocate = CLObject.allocate(charArray);
        cLObjectAllocate.setLine(this.mLineNumber);
        cLObjectAllocate.setStart(i10);
        int i11 = i10 + 1;
        CLElement container = cLObjectAllocate;
        while (i11 < length) {
            char c10 = charArray[i11];
            if (c10 == '\n') {
                this.mLineNumber += i6;
            }
            if (this.mHasComment) {
                if (c10 == '\n') {
                    this.mHasComment = z9;
                } else {
                    i = i6;
                    i11++;
                    i6 = i;
                    z9 = false;
                }
            }
            if (container == null) {
                break;
            }
            if (container.isDone()) {
                container = getNextJsonElement(i11, c10, container, charArray);
            } else if (container instanceof CLObject) {
                if (c10 == '}') {
                    container.setEnd(i11 - 1);
                } else {
                    container = getNextJsonElement(i11, c10, container, charArray);
                }
            } else if (!(container instanceof CLArray)) {
                boolean z10 = container instanceof CLString;
                if (z10) {
                    long j = container.mStart;
                    if (charArray[(int) j] == c10) {
                        container.setStart(j + 1);
                        container.setEnd(i11 - 1);
                    }
                } else {
                    if (container instanceof CLToken) {
                        CLToken cLToken = (CLToken) container;
                        i = i6;
                        if (!cLToken.validate(c10, i11)) {
                            throw new CLParsingException("parsing incorrect token " + cLToken.content() + " at line " + this.mLineNumber, cLToken);
                        }
                    } else {
                        i = i6;
                    }
                    if ((container instanceof CLKey) || z10) {
                        long j6 = container.mStart;
                        char c11 = charArray[(int) j6];
                        if ((c11 == '\'' || c11 == '\"') && c11 == c10) {
                            container.setStart(j6 + 1);
                            container.setEnd(i11 - 1);
                        }
                    }
                    if (!container.isDone() && (c10 == '}' || c10 == ']' || c10 == ',' || c10 == ' ' || c10 == '\t' || c10 == '\r' || c10 == '\n' || c10 == ':')) {
                        long j10 = i11 - 1;
                        container.setEnd(j10);
                        if (c10 == '}' || c10 == ']') {
                            container = container.getContainer();
                            container.setEnd(j10);
                            if (container instanceof CLKey) {
                                container = container.getContainer();
                                container.setEnd(j10);
                            }
                        }
                    }
                    if (!container.isDone() && (!(container instanceof CLKey) || ((CLKey) container).mElements.size() > 0)) {
                        container = container.getContainer();
                    }
                    i11++;
                    i6 = i;
                    z9 = false;
                }
            } else if (c10 == ']') {
                container.setEnd(i11 - 1);
            } else {
                container = getNextJsonElement(i11, c10, container, charArray);
            }
            i = i6;
            if (!container.isDone()) {
            }
            i11++;
            i6 = i;
            z9 = false;
        }
        while (container != null && !container.isDone()) {
            if (container instanceof CLString) {
                container.setStart(((int) container.mStart) + 1);
            }
            container.setEnd(length - 1);
            container = container.getContainer();
        }
        if (sDebug) {
            System.out.println("Root: " + cLObjectAllocate.toJSON());
        }
        return cLObjectAllocate;
    }

    public static CLObject parse(String str) throws CLParsingException {
        return new CLParser(str).parse();
    }
}
