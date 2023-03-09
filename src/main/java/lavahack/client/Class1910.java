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

import com.kisman.cc.util.Class650;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1393;
import lavahack.client.Class1486;
import lavahack.client.Class1744;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class711;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2={"Lcom/kisman/cc/features/module/movement/SoftScaffold;", "Lcom/kisman/cc/features/module/Module;", "()V", "delay", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "noJump", "onlyWhenOnGround", "packet", "switchMode", "timer", "Lcom/kisman/cc/util/TimerUtils;", "doNoJump", "", "onEnable", "update", "kisman.cc"})
public final class Class1910
extends Class42 {
    private final Class44 Field16811 = this.Method23(new Class44("Switch Mode", (Class42)this, Class711.Field11028));
    private final Class44 Field16812 = this.Method23(new Class44("No Jump", (Class42)this, false));
    private final Class44 Field16813 = this.Method23(new Class44("Delay", (Class42)this, Double.longBitsToDouble((long)1629778869 ^ 0x40340000612473B5L), 0.0, Double.longBitsToDouble((long)1707862844 ^ 0x408F400065CBEB3CL), Class467.Field9943));
    private final Class44 Field16814 = this.Method23(new Class44("Packet", (Class42)this, false));
    private final Class44 Field16815 = this.Method23(new Class44("Only When onGround", (Class42)this, true));
    private final Class650 Field16816 = new Class650();
    private String Field16817 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        this.Field16816.Method2801();
    }

    @Override
    public void Method45() {
        if (Class1910.Method7096().player == null) return;
        if (Class1910.Method7096().world == null) return;
        Class44 class44 = this.Field16815;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"onlyWhenOnGround");
        if (class44.Method365() && !Class1910.Method7096().player.onGround) {
            return;
        }
        Class44 class442 = this.Field16813;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"delay");
        if (this.Field16816.Method2797(class442.Method369())) {
            this.Field16816.Method2801();
            int n = Class9.Method103(0, 9);
            if (n == -1) {
                Class1393.Method5504().Method1886("Out of valid blocks. Disabling!");
                super.Method21(false);
            }
            int n2 = Class1910.Method7096().player.inventory.currentItem;
            Class44 class443 = this.Field16811;
            Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"switchMode");
            Enum enum_ = class443.Method341();
            if (enum_ == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.dynamic.SwapEnum2.Swap");
            }
            Class711 class711 = (Class711)enum_;
            class711.Method2972().Method1726(n, false);
            if (Class1910.Method7096().player.onGround) {
                BlockPos blockPos = Class1744.Method6657();
                Class44 class444 = this.Field16814;
                Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"packet");
                Class1486.Method5949(blockPos, EnumHand.MAIN_HAND, class444.Method365());
            }
            class711.Method2972().Method1726(n2, true);
        }
        this.Method7095();
    }

    private final void Method7095() {
        Class44 class44 = this.Field16812;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"noJump");
        if (!class44.Method365()) return;
        Class1910.Method7096().gameSettings.keyBindJump.pressed = false;
        Class1910.Method7096().player.motionY = 0.0;
    }

    public Class1910() {
        super("SoftScaffold", "Like default Scaffold but for soft(no solid) blocks.", Class97.Field8340);
    }

    public static final Minecraft Method7096() {
        return Class42.Field8052;
    }

    public static final void Method7097(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 237;
            cArray2[n] = (char)(cArray[n] ^ (0x2F54 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

