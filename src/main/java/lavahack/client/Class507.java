//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import org.lwjgl.opengl.*;

public class Class507 extends Class1591
{
    public static Class507 Field10131;
    public float Field10132;
    public float Field10133;
    private int Field10134;
    
    public Class507() {
        super("holyfuck.frag");
        this.Field10133 = Float.intBitsToFloat(1008981770);
    }
    
    public void Method232() {
        this.Method237("resolution");
        this.Method237("time");
    }
    
    public void Method233() {
        GL20.glUniform2f(this.Method238("resolution"), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth(), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight());
        GL20.glUniform1f(this.Method238("time"), this.Field10132);
        this.Field10132 += this.Field10133 * this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static {
        Class507.Field10131 = new Class507();
    }
    
    private static String Method240(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5B2 ^ 0x2E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
