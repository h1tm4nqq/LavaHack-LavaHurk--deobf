/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1497;
import lavahack.client.Class44;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class Class577
implements Runnable {
    public static final Class577 Field10465 = new Class577();
    private String Field10466 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        Class44 class44 = Class1497.Method6013(Class1497.Field15034);
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"debug2");
        if (class44.Method365()) {
            String string = "Update 3";
            boolean bl = false;
            System.out.println((Object)string);
        }
        EntityPlayer entityPlayer = Class1497.Method6015(Class1497.Field15034).Method496();
        if (entityPlayer == null) {
            Intrinsics.throwNpe();
        }
        Class1497.Method6014(Class1497.Field15034, (Entity)entityPlayer);
        Class1497.Method6016(Class1497.Field15034);
        Class1497.Method6017(Class1497.Field15034);
    }

    Class577() {
    }

    private static String Method2529(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 53;
            cArray2[n] = (char)(cArray[n] ^ (0x41D3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

