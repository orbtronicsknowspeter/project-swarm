package r4;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import f0.i;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f8902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f8903b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f8904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f8905m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f8906n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CheckBox f8907o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, i iVar) {
        super(view);
        iVar.getClass();
        this.f8902a = iVar;
        View viewFindViewById = view.findViewById(R.id.iv_icon_file_item);
        viewFindViewById.getClass();
        this.f8903b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_name_file_item);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.f8904l = textView;
        View viewFindViewById3 = view.findViewById(R.id.tv_date_file_item);
        viewFindViewById3.getClass();
        TextView textView2 = (TextView) viewFindViewById3;
        this.f8905m = textView2;
        View viewFindViewById4 = view.findViewById(R.id.tv_size_file_item);
        viewFindViewById4.getClass();
        TextView textView3 = (TextView) viewFindViewById4;
        this.f8906n = textView3;
        View viewFindViewById5 = view.findViewById(R.id.cb_checked_file_item);
        viewFindViewById5.getClass();
        this.f8907o = (CheckBox) viewFindViewById5;
        textView.setTypeface(f4.c.f4884x);
        textView2.setTypeface(f4.c.f4884x);
        textView3.setTypeface(f4.c.f4883w);
    }
}
