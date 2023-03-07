/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.DKlCcWQ3o1tQ1Mr1sopVjcizhNpCSHti;
import lavahack.client.MQAatIIhRiErGuc1Tr5Nh44qIUzOKNKE;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/util/thread/kisman/ThreadManager;", "", "()V", "service", "Lcom/kisman/cc/util/thread/kisman/Service;", "getService", "()Lcom/kisman/cc/util/thread/kisman/Service;", "submit", "", "runnable", "Ljava/lang/Runnable;", "kisman.cc"})
public final class smV5JOluLiBZH5M4QrQHiUUe9Pp73qYA {
    @NotNull
    private final MQAatIIhRiErGuc1Tr5Nh44qIUzOKNKE Field9206;
    private String Field9207 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final MQAatIIhRiErGuc1Tr5Nh44qIUzOKNKE Method1458() {
        return this.Field9206;
    }

    public final void Method1459(@NotNull @NotNull Runnable runnable) {
        Intrinsics.checkParameterIsNotNull((Object)runnable, (String)"runnable");
        DKlCcWQ3o1tQ1Mr1sopVjcizhNpCSHti.Method1271().add(runnable);
    }

    public smV5JOluLiBZH5M4QrQHiUUe9Pp73qYA() {
        MQAatIIhRiErGuc1Tr5Nh44qIUzOKNKE mQAatIIhRiErGuc1Tr5Nh44qIUzOKNKE;
        MQAatIIhRiErGuc1Tr5Nh44qIUzOKNKE mQAatIIhRiErGuc1Tr5Nh44qIUzOKNKE2 = new MQAatIIhRiErGuc1Tr5Nh44qIUzOKNKE();
        smV5JOluLiBZH5M4QrQHiUUe9Pp73qYA smV5JOluLiBZH5M4QrQHiUUe9Pp73qYA2 = this;
        int n = (int)((long)-1940571393 ^ (long)-1940571393);
        int n2 = (int)((long)-566369175 ^ (long)-566369175);
        MQAatIIhRiErGuc1Tr5Nh44qIUzOKNKE mQAatIIhRiErGuc1Tr5Nh44qIUzOKNKE3 = mQAatIIhRiErGuc1Tr5Nh44qIUzOKNKE2;
        int n3 = (int)423743038L ^ 0x1941CE3E;
        mQAatIIhRiErGuc1Tr5Nh44qIUzOKNKE3.setName("LavaHack-Thread-Manager");
        mQAatIIhRiErGuc1Tr5Nh44qIUzOKNKE3.setDaemon(((int)1644209937L ^ 0x6200A710) != 0);
        mQAatIIhRiErGuc1Tr5Nh44qIUzOKNKE3.start();
        smV5JOluLiBZH5M4QrQHiUUe9Pp73qYA2.Field9206 = mQAatIIhRiErGuc1Tr5Nh44qIUzOKNKE = mQAatIIhRiErGuc1Tr5Nh44qIUzOKNKE2;
    }

    private static String Method1460(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1795116201L ^ 0x9500B357;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1829554701 ^ (long)-1829554932);
            int n2 = (int)-1178883964L ^ 0xB9BBA8D5;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1499520416 ^ (long)-1499516747) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

