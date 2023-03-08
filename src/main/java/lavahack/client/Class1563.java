//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import net.minecraft.util.text.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bB\u0005?\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016?\u0006\f" }, d2 = { "Lcom/kisman/cc/util/chat/ChatHandler;", "", "()V", "complete", "", "message", "", "error", "print", "warning", "Companion", "Instance", "kisman.cc" })
public abstract class Class1563
{
    @NotNull
    private static final Class883 Field15281;
    public static final Class1118 Field15282;
    private String Field15283 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method435(@NotNull @NotNull final String str) {
        Intrinsics.checkParameterIsNotNull((Object)str, "message");
        if (Class2142.Field17803.currentScreen instanceof Class264) {
            new Class967(TextFormatting.GRAY.toString() + "[" + TextFormatting.WHITE + Class1796.Method6783() + TextFormatting.GRAY + "] " + str).Method167();
        }
        else {
            Class1393.Method5506().Method1882(str);
        }
    }
    
    public void Method436(@NotNull @NotNull final String str) {
        Intrinsics.checkParameterIsNotNull((Object)str, "message");
        if (Class2142.Field17803.currentScreen instanceof Class264) {
            new Class967(TextFormatting.GRAY.toString() + "[" + TextFormatting.GOLD + Class1796.Method6783() + TextFormatting.GRAY + "] " + str).Method167();
        }
        else {
            Class1393.Method5507().Method1882(str);
        }
    }
    
    public void Method437(@NotNull @NotNull final String str) {
        Intrinsics.checkParameterIsNotNull((Object)str, "message");
        if (Class2142.Field17803.currentScreen instanceof Class264) {
            new Class967(TextFormatting.GRAY.toString() + "[" + TextFormatting.LIGHT_PURPLE + Class1796.Method6783() + TextFormatting.GRAY + "] " + str).Method167();
        }
        else {
            Class1393.Method5503().Method1882(str);
        }
    }
    
    public void Method438(@NotNull @NotNull final String str) {
        Intrinsics.checkParameterIsNotNull((Object)str, "message");
        if (Class2142.Field17803.currentScreen instanceof Class264) {
            new Class967(TextFormatting.GRAY.toString() + "[" + TextFormatting.RED + Class1796.Method6783() + TextFormatting.GRAY + "] " + str).Method167();
        }
        else {
            Class1393.Method5504().Method1882(str);
        }
    }
    
    public void Method439(@Nullable @Nullable final String s) {
        if (Class2142.Field17803.currentScreen instanceof Class264) {
            if (s == null) {
                Intrinsics.throwNpe();
            }
            new Class967(s).Method167();
        }
        else {
            Class1393.Method5506().Method1875(s);
        }
    }
    
    static {
        Field15282 = new Class1118((DefaultConstructorMarker)null);
        Field15281 = new Class883();
    }
    
    public static final Class883 Method440() {
        return Class1563.Field15281;
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6A0E ^ 0xD9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
