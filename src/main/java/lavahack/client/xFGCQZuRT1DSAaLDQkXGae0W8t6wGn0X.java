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
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2={"Lcom/kisman/cc/features/module/Debug/FastFallTest;", "Lcom/kisman/cc/features/module/Module;", "()V", "coefficient", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "groundCheck", "lastPosY", "", "logic", "progression", "onEnable", "", "update", "Logic", "Progression", "kisman.cc"})
public final class xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12104 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Logic", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12088));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12105 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Progression", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field14062));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12106 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Coefficient", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble((long)2093515923 ^ 0x3FB99999E5511D09L), Double.longBitsToDouble(0xF1523C42A09F69B3L ^ 0xB1523C42A09F69B3L), (boolean)((long)1136594521 ^ (long)1136594521)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12107 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Ground Check", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)692134716L ^ 0x2941233C) != 0));
    private double Field12108;
    private String Field12109 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        this.Field12108 = 0.0;
    }

    @Override
    public void Method45() {
        if (xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X.Method3951().player == null || xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X.Method3951().world == null) {
            this.Field12108 = 0.0;
            return;
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field12107;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"groundCheck");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365() && xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X.Method3951().player.onGround) {
            this.Field12108 = xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X.Method3951().player.posY;
            return;
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field12104;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"logic");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method341() == xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12088 ? xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X.Method3951().player.motionY >= (double)((int)231723883L ^ 0xDCFD36B) : xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X.Method3951().player.posY >= this.Field12108) {
            return;
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field12105;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"progression");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method341() == xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field14062) {
            double d = xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X.Method3951().player.motionY;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field12106;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"coefficient");
            xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X.Method3951().player.motionY = d + -qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method367();
        } else {
            double d = xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X.Method3951().player.motionY;
            EntityPlayerSP entityPlayerSP = xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X.Method3951().player;
            int n = (int)((long)1793617262 ^ (long)1793617262);
            double d2 = Math.abs(d);
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = this.Field12106;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"coefficient");
            entityPlayerSP.motionY = d2 * -qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method367();
        }
        this.Field12108 = xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X.Method3951().player.posY;
    }

    public xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X() {
        super("FastFall", "Test of fast fall module uwa?", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    public static final Minecraft Method3951() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method3952(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1040115450 ^ (long)1040115450);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-220896813L ^ 0xF2D5612C);
            int n2 = ((int)-113390829L ^ 0xF93DCB00) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1744193937 ^ (long)-1744190338) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

