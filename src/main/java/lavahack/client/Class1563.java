//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.text.TextFormatting
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1118;
import lavahack.client.Class1393;
import lavahack.client.Class1796;
import lavahack.client.Class264;
import lavahack.client.Class883;
import lavahack.client.Class967;
import net.minecraft.util.text.TextFormatting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/util/chat/ChatHandler;", "", "()V", "complete", "", "message", "", "error", "print", "warning", "Companion", "Instance", "kisman.cc"})
public abstract class Class1563 {
    @NotNull
    private static final Class883 Field15281;
    public static final Class1118 Field15282;
    private String Field15283 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void Method435(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
        if (Class2142.Field17803.currentScreen instanceof Class264) {
            new Class967(TextFormatting.GRAY.toString() + "[" + TextFormatting.WHITE + Class1796.Method6783() + TextFormatting.GRAY + "] " + string).Method167();
            return;
        }
        Class1393.Method5506().Method1882(string);
    }

    public void Method436(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
        if (Class2142.Field17803.currentScreen instanceof Class264) {
            new Class967(TextFormatting.GRAY.toString() + "[" + TextFormatting.GOLD + Class1796.Method6783() + TextFormatting.GRAY + "] " + string).Method167();
            return;
        }
        Class1393.Method5507().Method1882(string);
    }

    public void Method437(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
        if (Class2142.Field17803.currentScreen instanceof Class264) {
            new Class967(TextFormatting.GRAY.toString() + "[" + TextFormatting.LIGHT_PURPLE + Class1796.Method6783() + TextFormatting.GRAY + "] " + string).Method167();
            return;
        }
        Class1393.Method5503().Method1882(string);
    }

    public void Method438(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
        if (Class2142.Field17803.currentScreen instanceof Class264) {
            new Class967(TextFormatting.GRAY.toString() + "[" + TextFormatting.RED + Class1796.Method6783() + TextFormatting.GRAY + "] " + string).Method167();
            return;
        }
        Class1393.Method5504().Method1882(string);
    }

    public void Method439(@Nullable @Nullable String string) {
        if (!(Class2142.Field17803.currentScreen instanceof Class264)) {
            Class1393.Method5506().Method1875(string);
            return;
        }
        String string2 = string;
        if (string2 == null) {
            Intrinsics.throwNpe();
        }
        new Class967(string2).Method167();
    }

    static {
        Field15282 = new Class1118(null);
        Field15281 = new Class883();
    }

    public static final Class883 Method440() {
        return Field15281;
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 217;
            cArray2[n] = (char)(cArray[n] ^ (0x6A0E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

