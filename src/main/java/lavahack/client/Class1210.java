//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;

@Deprecated
public class Class1210 extends Class42
{
    private String Field13492 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1210() {
        super("PacketMine V2", Class97.Field8344);
    }
    
    static Minecraft Method4877() {
        return Class1210.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method4878() {
        return Class1210.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method4879() {
        return Class1210.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x20E6 ^ 0xF2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
