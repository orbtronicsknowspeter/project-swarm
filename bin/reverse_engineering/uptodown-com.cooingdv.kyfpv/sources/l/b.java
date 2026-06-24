package l;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import b2.t1;
import b6.i;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.cmpapi.status.DisplayStatus;
import com.inmobi.cmp.model.DisplayInfo;
import com.inmobi.cmp.model.Regulations;
import com.uptodown.R;
import kotlin.jvm.internal.l;
import o7.c0;
import o7.m0;
import o7.z0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends p9.a implements c.b {
    public static final /* synthetic */ int D = 0;
    public Button A;
    public NestedScrollView B;
    public c C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f7029z;

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onCancel(dialogInterface);
        c cVar = this.C;
        if (cVar == null) {
            l.i("viewModel");
            throw null;
        }
        DisplayInfo displayInfo = new DisplayInfo(DisplayStatus.DISMISSED, "User dismissed GBC screen", Regulations.NA, true);
        ChoiceCmpCallback choiceCmpCallback = cVar.f7031b;
        if (choiceCmpCallback != null) {
            choiceCmpCallback.onCMPUIStatusChanged(displayInfo);
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    @Override // p9.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() == null) {
            return;
        }
        ViewModelStore viewModelStore = getViewModelStore();
        viewModelStore.getClass();
        this.C = (c) new ViewModelProvider(viewModelStore, new i(1)).get(c.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.gbc_privacy_screen, viewGroup, false);
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // p9.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        view.getClass();
        super.onViewCreated(view, bundle);
        this.f7029z = (TextView) view.findViewById(R.id.tv_gbc_description);
        this.A = (Button) view.findViewById(R.id.btn_save_and_exit);
        this.B = (NestedScrollView) view.findViewById(R.id.sv_container);
        getChildFragmentManager().beginTransaction().add(R.id.gbc_fragment_container, new d(), "d").addToBackStack(null).commit();
        TextView textView2 = this.f8495b;
        if (textView2 != null) {
            c cVar = this.C;
            if (cVar == null) {
                l.i("viewModel");
                throw null;
            }
            String string = cVar.f7032c.f6984b.f6977a;
            if (string.length() == 0) {
                string = getString(R.string.we_value_your_privacy);
                string.getClass();
            }
            textView2.setText(string);
        }
        TextView textView3 = this.f7029z;
        if (textView3 != null) {
            c cVar2 = this.C;
            if (cVar2 == null) {
                l.i("viewModel");
                throw null;
            }
            String string2 = cVar2.f7032c.f6984b.f6979c;
            if (string2.length() == 0) {
                string2 = getString(R.string.gbc_description);
                string2.getClass();
            }
            textView3.setText(string2);
        }
        TextView textView4 = this.f7029z;
        if (textView4 != null) {
            textView4.setMovementMethod(LinkMovementMethod.getInstance());
        }
        Context context = getContext();
        if (context != null && (textView = this.f7029z) != null) {
            textView.setLinkTextColor(ContextCompat.getColor(context, R.color.colorBlueAccent));
        }
        Button button = this.A;
        if (button != null) {
            c cVar3 = this.C;
            if (cVar3 == null) {
                l.i("viewModel");
                throw null;
            }
            String string3 = cVar3.f7032c.f6984b.f6980d;
            if (string3.length() == 0) {
                string3 = getString(R.string.save_and_exit);
                string3.getClass();
            }
            button.setText(string3);
        }
        ImageView imageView = this.f8496l;
        final int i = 0;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: l.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f7028b;

                {
                    this.f7028b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = i;
                    b bVar = this.f7028b;
                    switch (i6) {
                        case 0:
                            c cVar4 = bVar.C;
                            if (cVar4 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            DisplayInfo displayInfo = new DisplayInfo(DisplayStatus.DISMISSED, "User dismissed GBC screen", Regulations.NA, true);
                            ChoiceCmpCallback choiceCmpCallback = cVar4.f7031b;
                            if (choiceCmpCallback != null) {
                                choiceCmpCallback.onCMPUIStatusChanged(displayInfo);
                            }
                            bVar.dismiss();
                            FragmentActivity activity = bVar.getActivity();
                            if (activity == null) {
                                return;
                            }
                            activity.finish();
                            return;
                        default:
                            Fragment fragmentFindFragmentByTag = bVar.getChildFragmentManager().findFragmentByTag("d");
                            d dVar = fragmentFindFragmentByTag instanceof d ? (d) fragmentFindFragmentByTag : null;
                            if (dVar != null) {
                                dVar.a();
                            }
                            if (bVar.C == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            v7.e eVar = m0.f8289a;
                            c0.s(z0.f8336a, v7.d.f10885a, null, new b.d(2, null, 5), 2);
                            bVar.dismiss();
                            FragmentActivity activity2 = bVar.getActivity();
                            if (activity2 == null) {
                                return;
                            }
                            activity2.finish();
                            return;
                    }
                }
            });
        }
        Button button2 = this.A;
        final int i6 = 1;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener(this) { // from class: l.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f7028b;

                {
                    this.f7028b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i62 = i6;
                    b bVar = this.f7028b;
                    switch (i62) {
                        case 0:
                            c cVar4 = bVar.C;
                            if (cVar4 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            DisplayInfo displayInfo = new DisplayInfo(DisplayStatus.DISMISSED, "User dismissed GBC screen", Regulations.NA, true);
                            ChoiceCmpCallback choiceCmpCallback = cVar4.f7031b;
                            if (choiceCmpCallback != null) {
                                choiceCmpCallback.onCMPUIStatusChanged(displayInfo);
                            }
                            bVar.dismiss();
                            FragmentActivity activity = bVar.getActivity();
                            if (activity == null) {
                                return;
                            }
                            activity.finish();
                            return;
                        default:
                            Fragment fragmentFindFragmentByTag = bVar.getChildFragmentManager().findFragmentByTag("d");
                            d dVar = fragmentFindFragmentByTag instanceof d ? (d) fragmentFindFragmentByTag : null;
                            if (dVar != null) {
                                dVar.a();
                            }
                            if (bVar.C == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            v7.e eVar = m0.f8289a;
                            c0.s(z0.f8336a, v7.d.f10885a, null, new b.d(2, null, 5), 2);
                            bVar.dismiss();
                            FragmentActivity activity2 = bVar.getActivity();
                            if (activity2 == null) {
                                return;
                            }
                            activity2.finish();
                            return;
                    }
                }
            });
        }
        h9.d dVar = this.f8503s;
        if (dVar != null) {
            Integer num = dVar.g;
            if (num != null) {
                view.setBackgroundColor(num.intValue());
            }
            Integer num2 = dVar.f5496a;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                NestedScrollView nestedScrollView = this.B;
                if (nestedScrollView != null) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(2.0f);
                    gradientDrawable.setStroke(4, iIntValue);
                    nestedScrollView.setBackground(gradientDrawable);
                }
            }
            Integer num3 = dVar.i;
            if (num3 != null) {
                int iIntValue2 = num3.intValue();
                TextView textView5 = this.f7029z;
                if (textView5 != null) {
                    textView5.setTextColor(iIntValue2);
                }
            }
            Integer num4 = dVar.f5505o;
            if (num4 != null) {
                int iIntValue3 = num4.intValue();
                Button button3 = this.A;
                if (button3 != null) {
                    button3.setBackgroundColor(iIntValue3);
                }
            }
            Integer num5 = dVar.f5503m;
            if (num5 != null) {
                int iIntValue4 = num5.intValue();
                Button button4 = this.A;
                if (button4 != null) {
                    button4.setTextColor(iIntValue4);
                }
            }
        }
        t1.f(this.f8505u, this.A);
        t1.f(this.v, this.f7029z);
    }

    @Override // c.b
    public final void e(c.i iVar) {
    }

    @Override // c.b
    public final void f(c.i iVar) {
    }
}
