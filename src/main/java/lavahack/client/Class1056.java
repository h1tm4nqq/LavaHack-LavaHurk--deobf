//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class867;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2={"Lcom/kisman/cc/features/module/misc/HotbarScroller;", "Lcom/kisman/cc/features/module/Module;", "()V", "delay", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "timer", "Lcom/kisman/cc/util/TimerUtils;", "getNextValidSlot", "", "onEnable", "", "update", "kisman.cc"})
public final class Class1056
extends Class42 {
    private final Class44 Field12671 = this.Method23(new Class44("Delay", (Class42)this, Double.longBitsToDouble((long)1536874356 ^ 0x405900005B9AD774L), 1.0, Double.longBitsToDouble(4652007308841189376L), Class467.Field9943));
    private final Class650 Field12672 = new Class650();
    private String Field12673 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        this.Field12672.Method2801();
    }

    @Override
    public void Method45() {
        boolean bl = false;
        Class44 class44 = this.Field12671;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"delay");
        if (this.Field12672.Method2797(class44.Method369())) {
            this.Field12672.Method2801();
            bl = true;
        }
        if (Class1056.Method4306().player == null) return;
        if (Class1056.Method4306().world != null) return;
    }

    private final int Method4305() {
        if (Class1056.Method4306().player.inventory.currentItem == 9) {
            return 0;
        }
        int n = Class1056.Method4306().player.inventory.currentItem + 1;
        return n;
    }

    public Class1056() {
        super("HotbarScroller", "uwu like future.", Class97.Field8343);
        this.Method44(new Class867(this));
    }

    public static final Minecraft Method4306() {
        return Class42.Field8052;
    }

    public static final void Method4307(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    public static final Class44 Method4308(Class1056 class1056) {
        return class1056.Field12671;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 115;
            cArray2[n] = (char)(cArray[n] ^ (0x1D23 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

