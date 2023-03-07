//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/features/module/exploit/DamageLeave;", "Lcom/kisman/cc/features/module/Module;", "()V", "motion", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "update", "", "kisman.cc"})
public final class K35x1lzZRlFj1XvKSPzbbG5z6fi8T8n9
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17680 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Motion", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x6E2996B340776EAAL ^ 0x2E0D96B340776EAAL), Double.longBitsToDouble((long)1011401076 ^ 0x401400003C48C174L), Double.longBitsToDouble(0x23CCCD6CD4761FECL ^ 0x63F8CD6CD4761FECL), ((int)-600254889L ^ 0xDC38D656) != 0));
    private String Field17681 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method45() {
        if (K35x1lzZRlFj1XvKSPzbbG5z6fi8T8n9.Method7665().player == null) return;
        if (K35x1lzZRlFj1XvKSPzbbG5z6fi8T8n9.Method7665().world == null) return;
        if (K35x1lzZRlFj1XvKSPzbbG5z6fi8T8n9.Method7665().player.hurtTime < (int)((long)-1258377172 ^ (long)-1258377173)) return;
        EntityPlayerSP entityPlayerSP = K35x1lzZRlFj1XvKSPzbbG5z6fi8T8n9.Method7665().player;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field17680;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"motion");
        entityPlayerSP.motionY = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method367();
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503().Method1886("Done! Disabling!");
        this.Method21(((int)1247704788L ^ 0x4A5E76D4) != 0);
    }

    public K35x1lzZRlFj1XvKSPzbbG5z6fi8T8n9() {
        super("DamageLeave", "Sets your Y motion when you get \"any\" damage", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    public static final Minecraft Method7665() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method7666(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)633305913 ^ (long)633305913);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1458730587 ^ (long)1458730660);
            int n2 = (int)-1748327403L ^ 0x97CAA454;
            cArray2[n] = (char)(cArray[n] ^ (((int)-904587884L ^ 0xCA151447) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

