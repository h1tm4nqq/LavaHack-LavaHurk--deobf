//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0005?\u0006\u0002\u0010\u0002?\u0006\u0005" }, d2 = { "Lcom/kisman/cc/util/enums/dynamic/CharmsRewriteOptionsEnum;", "", "()V", "CharmsRewriteOptions", "Companion", "kisman.cc" })
public final class Class369
{
    private static final Class2124 Field9553;
    private static final Class1763 Field9554;
    public static final Class623 Field9555;
    private String Field9556 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    static {
        Field9555 = new Class623(null);
        final Class2124 method1727 = Class1763.Method1727((Class)Void.class, new Class[] { Void.class });
        Intrinsics.checkExpressionValueIsNotNull((Object)method1727, "AbstractTask.types(\n    \u2026oid::class.java\n        )");
        Field9553 = method1727;
        Field9554 = Class369.Field9553.Method7663((Class1471)Class2031.Field17339);
    }
    
    public static final Class2124 Method1820() {
        return Class369.Field9553;
    }
    
    public static final Class1763 Method1821() {
        return Class369.Field9554;
    }
    
    private static String Method1822(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1A2A ^ 0x84));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
