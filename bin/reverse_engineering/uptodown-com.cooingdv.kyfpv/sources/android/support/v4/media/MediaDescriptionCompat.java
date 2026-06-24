package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.m;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new f(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f227b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CharSequence f228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CharSequence f229m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Bitmap f230n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Uri f231o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Bundle f232p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Uri f233q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f234r;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f226a = str;
        this.f227b = charSequence;
        this.f228l = charSequence2;
        this.f229m = charSequence3;
        this.f230n = bitmap;
        this.f231o = uri;
        this.f232p = bundle;
        this.f233q = uri2;
    }

    public static MediaDescriptionCompat a(Object obj) {
        Uri mediaUri;
        Bundle bundle;
        if (obj == null) {
            return null;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        String mediaId = mediaDescription.getMediaId();
        CharSequence title = mediaDescription.getTitle();
        CharSequence subtitle = mediaDescription.getSubtitle();
        CharSequence description = mediaDescription.getDescription();
        Bitmap iconBitmap = mediaDescription.getIconBitmap();
        Uri iconUri = mediaDescription.getIconUri();
        Bundle extras = mediaDescription.getExtras();
        if (extras != null) {
            m.a(extras);
            mediaUri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
        } else {
            mediaUri = null;
        }
        if (mediaUri == null) {
            bundle = extras;
        } else if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
            bundle = null;
        } else {
            extras.remove("android.support.v4.media.description.MEDIA_URI");
            extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = extras;
        }
        if (mediaUri == null) {
            mediaUri = mediaDescription.getMediaUri();
        }
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
        mediaDescriptionCompat.f234r = obj;
        return mediaDescriptionCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f227b) + ", " + ((Object) this.f228l) + ", " + ((Object) this.f229m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Object objBuild = this.f234r;
        if (objBuild == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f226a);
            builder.setTitle(this.f227b);
            builder.setSubtitle(this.f228l);
            builder.setDescription(this.f229m);
            builder.setIconBitmap(this.f230n);
            builder.setIconUri(this.f231o);
            builder.setExtras(this.f232p);
            builder.setMediaUri(this.f233q);
            objBuild = builder.build();
            this.f234r = objBuild;
        }
        ((MediaDescription) objBuild).writeToParcel(parcel, i);
    }
}
