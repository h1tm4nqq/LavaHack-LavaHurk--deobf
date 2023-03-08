//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "processPatterns", "", "invoke" })
final class Class84 extends Lambda implements Function0
{
    final Class1307 Field8284;
    private String Field8285 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Object invoke() {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    }
    
    public final boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        boolean b = false;
        for (final Class1612 class1612 : this.Field8284.Field13971.Method780().Field8070) {
            final Class85 field8286 = Class85.Field8286;
            final Class1612 class1613 = class1612;
            Intrinsics.checkExpressionValueIsNotNull((Object)class1613, "pattern");
            if (field8286.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(class1613)) {
                b = true;
            }
        }
        return b;
    }
    
    Class84(final Class1307 field8284) {
        this.Field8284 = field8284;
        super(0);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1622 ^ 0x90));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
