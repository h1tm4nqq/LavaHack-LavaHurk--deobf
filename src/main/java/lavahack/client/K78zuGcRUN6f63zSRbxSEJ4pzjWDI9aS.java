//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.vo8JGtFXaeonZQiouVGTbpILJYQDvWk4;
import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2={"Lcom/kisman/cc/features/module/movement/SoftScaffold;", "Lcom/kisman/cc/features/module/Module;", "()V", "delay", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "noJump", "onlyWhenOnGround", "packet", "switchMode", "timer", "Lcom/kisman/cc/util/TimerUtils;", "doNoJump", "", "onEnable", "update", "kisman.cc"})
public final class K78zuGcRUN6f63zSRbxSEJ4pzjWDI9aS
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16811 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Switch Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11028));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16812 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("No Jump", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1378988064 ^ (long)1378988064)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16813 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1629778869 ^ 0x40340000612473B5L), 0.0, Double.longBitsToDouble((long)1707862844 ^ 0x408F400065CBEB3CL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16814 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)297669677L ^ 0x11BE142D) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16815 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Only When onGround", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1323229021 ^ (long)1323229020)));
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field16816 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private String Field16817 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        this.Field16816.Method2801();
    }

    @Override
    public void Method45() {
        if (K78zuGcRUN6f63zSRbxSEJ4pzjWDI9aS.Method7096().player == null) return;
        if (K78zuGcRUN6f63zSRbxSEJ4pzjWDI9aS.Method7096().world == null) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field16815;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"onlyWhenOnGround");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365() && !K78zuGcRUN6f63zSRbxSEJ4pzjWDI9aS.Method7096().player.onGround) {
            return;
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field16813;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"delay");
        if (this.Field16816.Method2797(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method369())) {
            this.Field16816.Method2801();
            int n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method103((int)((long)1639288535 ^ (long)1639288535), (int)((long)1075351366 ^ (long)1075351375));
            if (n == (int)((long)1640981993 ^ (long)-1640981994)) {
                NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1886("Out of valid blocks. Disabling!");
                super.Method21((boolean)((long)1316123753 ^ (long)1316123753));
            }
            int n2 = K78zuGcRUN6f63zSRbxSEJ4pzjWDI9aS.Method7096().player.inventory.currentItem;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field16811;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"switchMode");
            Enum enum_ = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method341();
            if (enum_ == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.dynamic.SwapEnum2.Swap");
            }
            FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi fKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)enum_;
            Object[] objectArray = new Object[((int)1332115158L ^ 0x4F6676D7) << 1];
            objectArray[(int)-685547928L ^ 0xD7235E68] = n;
            objectArray[(int)-204233776L ^ 0xF3D3A3D1] = ((int)2102460247L ^ 0x7D50FF57) != 0;
            fKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method2972().Method1726(objectArray);
            if (K78zuGcRUN6f63zSRbxSEJ4pzjWDI9aS.Method7096().player.onGround) {
                BlockPos blockPos = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6657();
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field16814;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"packet");
                vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5949(blockPos, EnumHand.MAIN_HAND, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365());
            }
            Object[] objectArray2 = new Object[((int)-137407201L ^ 0xF7CF551E) << 1];
            objectArray2[(int)2047954605L ^ 0x7A114EAD] = n2;
            objectArray2[(int)343529293L ^ 0x1479D74C] = ((int)-490499613L ^ 0xE2C391E2) != 0;
            fKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method2972().Method1726(objectArray2);
        }
        this.Method7095();
    }

    private final void Method7095() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field16812;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"noJump");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
        K78zuGcRUN6f63zSRbxSEJ4pzjWDI9aS.Method7096().gameSettings.keyBindJump.pressed = (int)-1964487777L ^ 0x8AE84B9F;
        K78zuGcRUN6f63zSRbxSEJ4pzjWDI9aS.Method7096().player.motionY = 0.0;
    }

    public K78zuGcRUN6f63zSRbxSEJ4pzjWDI9aS() {
        super("SoftScaffold", "Like default Scaffold but for soft(no solid) blocks.", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340);
    }

    public static final Minecraft Method7096() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method7097(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1506977313 ^ (long)1506977313);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)323066677L ^ 0x13419BCA);
            int n2 = (int)-722934595L ^ 0xD4E8E450;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1072489326 ^ (long)1072490683) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

