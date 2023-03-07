/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.kisman.cc.util.agYEaptPUW8OPC6jB7DK1WZuIoCKRIex;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.DKlCcWQ3o1tQ1Mr1sopVjcizhNpCSHti;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/thread/kisman/Service;", "Ljava/lang/Thread;", "()V", "run", "", "kisman.cc"})
public final class MQAatIIhRiErGuc1Tr5Nh44qIUzOKNKE
extends Thread {
    private int Field15959;

    @Override
    public void run() {
        block0: while (true) {
            Thread thread = Thread.currentThread();
            Intrinsics.checkExpressionValueIsNotNull((Object)thread, (String)"currentThread()");
            if (thread.isInterrupted()) return;
            if (agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3712()) {
                Object object = DKlCcWQ3o1tQ1Mr1sopVjcizhNpCSHti.Method1271();
                int n = (int)-1568436186L ^ 0xA2839026;
                int n2 = !object.isEmpty() ? (int)-937018233L ^ 0xC8263C86 : (int)((long)-1426655582 ^ (long)-1426655582);
                Iterator iterator = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Field8854.iterator();
                while (true) {
                    if (!iterator.hasNext()) continue block0;
                    object = (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)iterator.next();
                    Object object2 = object;
                    Intrinsics.checkExpressionValueIsNotNull((Object)object2, (String)"module");
                    if (!((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)object2).Method35()) continue;
                    ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)object).Method46();
                }
            }
            Thread.yield();
        }
    }

    private static String Method6605(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-102904721 ^ (long)-102904721);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-80708002L ^ 0xFB307EA1);
            int n2 = ((int)1244325511L ^ 0x4A2AE6A6) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)596008622L ^ 0x2386514B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

