//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import org.lwjgl.opengl.*;

public class Class1927 extends Class1591
{
    public static Class1927 Field16941;
    public float Field16942;
    public float Field16943;
    private String Field16944 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1927() {
        super("blueflames.frag");
        this.Field16943 = Float.intBitsToFloat(1008981770);
    }
    
    public void Method232() {
        this.Method237("resolution");
        this.Method237("time");
    }
    
    public void Method233() {
        GL20.glUniform2f(this.Method238("resolution"), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth(), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight());
        GL20.glUniform1f(this.Method238("time"), this.Field16942);
        this.Field16942 += this.Field16943 * this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static {
        Class1927.Field16941 = new Class1927();
    }
    
    private static String Method240(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7AFB ^ 0xE1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
