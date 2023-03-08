//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003?\u0006\u0002\u0010\u0005?\u0006\u0006" }, d2 = { "Lcom/kisman/cc/features/nocom/gui/NoComModulesFrame;", "Lcom/kisman/cc/gui/halq/Frame;", "x", "", "y", "(II)V", "kisman.cc" })
public final class Class177 extends Class354
{
    private String Field8786 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class177(final int n, final int n2) {
        super(null, n, n2, true, "Modules");
        int n3 = 0;
        Class1796.Field16241;
        final Iterator iterator = null.Method4122().iterator();
        while (iterator.hasNext()) {
            this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.add(new Class1429((Class42)iterator.next(), n, n2, (n3 + 1) * Class1419.Field14604, n3 + 1));
            ++n3;
        }
    }
    
    private static String Method74(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x677E ^ 0x50));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
