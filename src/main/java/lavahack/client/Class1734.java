/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.kisman.cc.util.Class886;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1796;
import lavahack.client.Class221;
import lavahack.client.Class42;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/thread/kisman/Service;", "Ljava/lang/Thread;", "()V", "run", "", "kisman.cc"})
public final class Class1734
extends Thread {
    private int Field15959;

    @Override
    public void run() {
        block0: while (true) {
            Thread thread = Thread.currentThread();
            Intrinsics.checkExpressionValueIsNotNull((Object)thread, (String)"currentThread()");
            if (thread.isInterrupted()) return;
            if (Class886.Method3712()) {
                Object object = Class221.Method1271();
                boolean bl = false;
                boolean bl2 = !object.isEmpty();
                Iterator iterator = Class1796.Field16241.Field16254.Field8854.iterator();
                while (true) {
                    if (!iterator.hasNext()) continue block0;
                    object = (Class42)iterator.next();
                    Object object2 = object;
                    Intrinsics.checkExpressionValueIsNotNull((Object)object2, (String)"module");
                    if (!((Class42)object2).Method35()) continue;
                    ((Class42)object).Method46();
                }
            }
            Thread.yield();
        }
    }

    private static String Method6605(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 132;
            cArray2[n] = (char)(cArray[n] ^ (0xFE5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

