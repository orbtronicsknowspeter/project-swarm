package c4;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.activities.MyDownloads;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i5 implements RecyclerView.OnItemTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MyDownloads f1717a;

    public i5(MyDownloads myDownloads) {
        this.f1717a = myDownloads;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        recyclerView.getClass();
        motionEvent.getClass();
        int action = motionEvent.getAction();
        MyDownloads myDownloads = this.f1717a;
        if (action != 0) {
            return action == 2 && myDownloads.S;
        }
        myDownloads.S = false;
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        recyclerView.getClass();
        motionEvent.getClass();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onRequestDisallowInterceptTouchEvent(boolean z9) {
    }
}
