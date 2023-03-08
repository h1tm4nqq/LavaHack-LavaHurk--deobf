//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import java.util.function.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016?\u0006\u0006" }, d2 = { "Lcom/kisman/cc/features/module/misc/Printer;", "Lcom/kisman/cc/features/module/Module;", "()V", "onDisable", "", "onEnable", "kisman.cc" })
public final class Class500 extends Class42
{
    private String Field10081 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method38() {
        super.Method38();
        final Class415 field9718 = Class415.Field9718;
        Intrinsics.checkExpressionValueIsNotNull((Object)field9718, "SchematicPrinter.INSTANCE");
        field9718.Method2013(true);
    }
    
    public void Method39() {
        super.Method39();
        final Class415 field9718 = Class415.Field9718;
        Intrinsics.checkExpressionValueIsNotNull((Object)field9718, "SchematicPrinter.INSTANCE");
        field9718.Method2013(false);
    }
    
    public Class500() {
        super("Printer", "Integration of Schematica's printer", Class97.Field8343);
        super.Method44((Supplier)Class2074.Field17487);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2208 ^ 0x32));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
