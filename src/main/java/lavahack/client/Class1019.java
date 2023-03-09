/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.Packet
 */
package lavahack.client;

import java.lang.reflect.Field;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1393;
import lavahack.client.Class254;
import lavahack.client.Class27;
import lavahack.client.Class44;
import lavahack.client.Class544;
import net.minecraft.network.Packet;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "kotlin.jvm.PlatformType", "invoke"})
final class Class1019
implements Class254 {
    final Class27 Field12431;
    private String Field12432 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method4134((Class544)object);
    }

    public final void Method4134(Class544 class544) {
        Class44 class44 = Class27.Method225(this.Field12431);
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"cancellerState");
        if (class44.Method365()) {
            HashMap hashMap = Class27.Method226(this.Field12431);
            Class544 class5442 = class544;
            Intrinsics.checkExpressionValueIsNotNull((Object)class5442, (String)"it");
            if (hashMap.containsKey(class5442.Method982().getClass())) {
                Object v = Class27.Method226(this.Field12431).get(class544.Method982().getClass());
                if (v == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(v, (String)"cancellerPacketsMap[it.packet::class.java]!!");
                if (((Class44)v).Method365()) {
                    class544.Method158();
                }
            }
        }
        Class44 class442 = Class27.Method227(this.Field12431);
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"loggerState");
        if (!class442.Method365()) return;
        HashMap hashMap = Class27.Method228(this.Field12431);
        Class544 class5443 = class544;
        Intrinsics.checkExpressionValueIsNotNull((Object)class5443, (String)"it");
        if (!hashMap.containsKey(class5443.Method982().getClass())) return;
        Object v = Class27.Method228(this.Field12431).get(class544.Method982().getClass());
        if (v == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(v, (String)"loggerPacketsMap[it.packet::class.java]!!");
        if (!((Class44)v).Method365()) return;
        String string = "---------------------";
        string = string + class544.Method982().getClass().getSimpleName();
        for (Field field : class544.Method982().getClass().getFields()) {
            StringBuilder stringBuilder = new StringBuilder().append(string).append("\n\t");
            Packet packet = class544.Method982();
            Intrinsics.checkExpressionValueIsNotNull((Object)packet, (String)"it.packet");
            Field field2 = field;
            Intrinsics.checkExpressionValueIsNotNull((Object)field2, (String)"field");
            string = stringBuilder.append(Class27.Method229(this.Field12431, packet, field2)).toString();
        }
        if (class544.cancelled) {
            string = string + "\n\tCancelled";
        }
        string = string + "---------------------";
        Class1393.Method5508(string);
    }

    Class1019(Class27 class27) {
        this.Field12431 = class27;
    }

    private static String Method4135(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 15;
            cArray2[n] = (char)(cArray[n] ^ (0x678 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

