//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.client.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.function.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005?\u0006\u0002\u0010\u0002?\u0006\u0004" }, d2 = { "Lcom/kisman/cc/features/module/combat/autorer/AutoRerUtil;", "", "()V", "Companion", "kisman.cc" })
public final class Class1955
{
    private static final Minecraft Field17019;
    @NotNull
    private static Class1921 Field17020;
    public static final Class1757 Field17021;
    private String Field17022 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    static {
        Field17021 = new Class1757((DefaultConstructorMarker)null);
        final Minecraft getMinecraft = Minecraft.getMinecraft();
        Intrinsics.checkExpressionValueIsNotNull((Object)getMinecraft, "Minecraft.getMinecraft()");
        Field17019 = getMinecraft;
        final Supplier method5302 = Class1416.Field14544.Field14453.Method5302();
        final Class44 field14447 = Class1416.Field14544.Field14447;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14447, "AutoRer.instance.placeRange");
        final Supplier method5303 = field14447.Method394();
        Intrinsics.checkExpressionValueIsNotNull((Object)method5303, "AutoRer.instance.placeRange.supplierFloat");
        final Class1416 field14448 = Class1416.Field14544;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14448, "AutoRer.instance");
        final Class44 field14449 = Class1416.Field14544.Field14451;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14449, "AutoRer.instance.targetRange");
        final Supplier method5304 = field14449.Method393();
        Intrinsics.checkExpressionValueIsNotNull((Object)method5304, "AutoRer.instance.targetRange.supplierDouble");
        Class1955.Field17020 = new Class1921(method5302, method5303, field14448, method5304, (Supplier)Class900.Field11767, (Supplier)Class1472.Field14874);
    }
    
    public static final Class1921 Method7266() {
        return Class1955.Field17020;
    }
    
    public static final void Method7267(final Class1921 field17020) {
        Class1955.Field17020 = field17020;
    }
    
    public static final Minecraft Method7268() {
        return Class1955.Field17019;
    }
    
    private static String Method7269(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1668 ^ 0xBD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
