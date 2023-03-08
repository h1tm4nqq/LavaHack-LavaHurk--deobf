//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import org.lwjgl.opengl.*;

public class Class28 extends Class1591
{
    public static Class28 Field7934;
    public float Field7935;
    public float Field7936;
    private String Field7937 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class28() {
        super("hidef.frag");
        this.Field7936 = Float.intBitsToFloat(1028443341);
    }
    
    public void Method232() {
        this.Method237("resolution");
        this.Method237("time");
    }
    
    public void Method233() {
        GL20.glUniform2f(this.Method238("resolution"), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth(), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight());
        GL20.glUniform1f(this.Method238("time"), this.Field7935);
        this.Field7935 += this.Field7936 * this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static {
        Class28.Field7934 = new Class28();
    }
    
    private static String Method240(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1D41 ^ 0xFB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
