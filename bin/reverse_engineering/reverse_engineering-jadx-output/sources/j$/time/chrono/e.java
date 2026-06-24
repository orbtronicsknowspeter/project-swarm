package j$.time.chrono;

import j$.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public interface e extends j$.time.temporal.m, j$.time.temporal.o, Comparable {
    l getChronology();

    ChronoZonedDateTime h(ZoneOffset zoneOffset);

    /* JADX INFO: renamed from: t */
    int compareTo(e eVar);

    b toLocalDate();

    j$.time.k toLocalTime();
}
