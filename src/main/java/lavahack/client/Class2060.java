//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014?\u0006\u0005" }, d2 = { "Lcom/kisman/cc/features/nocom/gui/NoComGui;", "Lcom/kisman/cc/gui/halq/HalqGui;", "()V", "gui", "Lcom/kisman/cc/gui/selectionbar/SelectionBar$Guis;", "kisman.cc" })
public final class Class2060 extends Class1419
{
    private String Field17416 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    protected Class1233 Method1220() {
        final Class1233 method1220 = super.Method1220();
        Intrinsics.checkExpressionValueIsNotNull((Object)method1220, "super.gui()");
        return method1220;
    }
    
    public Class2060() {
        super(true);
        this.ItyDJooi2U23sHYdNmIhbJFmcHy1UFNl.add(new Class177(15, 15));
    }
    
    private static String Method1235(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2243 ^ 0x34));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
