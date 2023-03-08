//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import org.spongepowered.asm.mixin.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004?\u0006\u0006" }, d2 = { "Lcom/kisman/cc/features/plugins/PluginHandler;", "", "()V", "coreModInit", "", "init", "kisman.cc" })
public final class Class1604
{
    private String Field15503 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final void Method6264() {
        final Class379 method1845 = Class379.Method1845();
        Intrinsics.checkExpressionValueIsNotNull((Object)method1845, "PluginManager.getInstance()");
        for (final Class1669 class1669 : method1845.Method1850().values()) {
            final String[] array = { null };
            final int n = 0;
            final Class1669 class1670 = class1669;
            Intrinsics.checkExpressionValueIsNotNull((Object)class1670, "config");
            array[n] = class1670.Method6443();
            Mixins.addConfigurations(array);
        }
    }
    
    public final void Method6265() {
        Class379.Method1845().Method1848();
        final Class379 method1845 = Class379.Method1845();
        Intrinsics.checkExpressionValueIsNotNull((Object)method1845, "PluginManager.getInstance()");
        for (final Class1669 class1669 : method1845.Method1850().values()) {
            Intrinsics.checkExpressionValueIsNotNull((Object)class1669, "config");
            final Class1096 class1670 = new Class1096(class1669);
            Class1796.Field16241.Field16254.Field8854.add(class1670);
            class1670.Method4487().Method3759();
            class1670.Method4489();
        }
    }
    
    public Class1604() {
        Class1207.Method4872();
        Class379.Method1845().Method1846(Class379.class.getClassLoader());
    }
    
    private static String Method6266(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5D59 ^ 0x6C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
