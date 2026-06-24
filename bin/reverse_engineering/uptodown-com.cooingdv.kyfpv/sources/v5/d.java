package v5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.l;
import m5.u0;
import n4.i;
import p9.e;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends p9.a {
    public static final /* synthetic */ int B = 0;
    public b A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public c f10855z;

    @Override // p9.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        b bVar = arguments == null ? null : (b) i.a(arguments, "partner_disclosure_args", b.class);
        if (bVar == null) {
            bVar = new b(new ArrayList());
        }
        this.A = bVar;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        ViewModelStore viewModelStore = activity.getViewModelStore();
        viewModelStore.getClass();
        this.f10855z = (c) new ViewModelProvider(viewModelStore, new b6.i(7)).get(c.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_partners_disclosures, viewGroup, false);
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // p9.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        view.getClass();
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_disclosures);
        if (recyclerView != null) {
            b bVar = this.A;
            if (bVar == null) {
                l.i("args");
                throw null;
            }
            recyclerView.setAdapter(new e(bVar.f10853a));
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        }
        TextView textView = this.f8495b;
        if (textView != null) {
            c cVar = this.f10855z;
            if (cVar == null) {
                l.i("viewModel");
                throw null;
            }
            textView.setText(cVar.f10854a.f5590a);
        }
        ImageView imageView = this.f8496l;
        if (imageView != null) {
            imageView.setOnClickListener(new u0(this, 10));
            c cVar2 = this.f10855z;
            if (cVar2 == null) {
                l.i("viewModel");
                throw null;
            }
            imageView.setContentDescription(cVar2.f10854a.f5591b);
        }
        h9.d dVar = this.f8503s;
        if (dVar == null || (num = dVar.g) == null) {
            return;
        }
        view.setBackgroundColor(num.intValue());
    }
}
