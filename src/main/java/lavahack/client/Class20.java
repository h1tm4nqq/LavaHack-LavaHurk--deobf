//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002?\u0006\u0003" }, d2 = { "Lcom/kisman/cc/features/viaforge/gui/MainFrame;", "Lcom/kisman/cc/gui/halq/Frame;", "()V", "kisman.cc" })
public final class Class20 extends Class354
{
    private String Field7905 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class20() {
        super(null, 10, 10, true, "ViaForge");
        if (Class1729.Field15934 != null) {
            this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.add(Class1729.Field15934);
        }
        else {
            Class1796.Field16243.error("ViaForge module component is null!");
        }
    }
    
    private static String Method74(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6FEE ^ 0x77));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
