package a4;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.google.android.gms.internal.measurement.i5;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UriMatcher f122b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f123a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f122b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public j(Context context) {
        this.f123a = context;
    }

    @Override // a4.n0
    public final boolean b(k0 k0Var) {
        Uri uri = (Uri) k0Var.f127b;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f122b.match(uri) != -1;
    }

    @Override // a4.n0
    public final m0 e(k0 k0Var, int i) throws FileNotFoundException {
        InputStream inputStreamOpenContactPhotoInputStream;
        ContentResolver contentResolver = this.f123a.getContentResolver();
        Uri uriLookupContact = (Uri) k0Var.f127b;
        int iMatch = f122b.match(uriLookupContact);
        if (iMatch != 1) {
            if (iMatch != 2) {
                if (iMatch != 3) {
                    if (iMatch != 4) {
                        a3.b.l(uriLookupContact, "Invalid uri: ");
                        return null;
                    }
                }
            }
            inputStreamOpenContactPhotoInputStream = contentResolver.openInputStream(uriLookupContact);
        } else {
            uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uriLookupContact);
            inputStreamOpenContactPhotoInputStream = uriLookupContact == null ? null : ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
        }
        if (inputStreamOpenContactPhotoInputStream == null) {
            return null;
        }
        return new m0(i5.M(inputStreamOpenContactPhotoInputStream), 2);
    }
}
