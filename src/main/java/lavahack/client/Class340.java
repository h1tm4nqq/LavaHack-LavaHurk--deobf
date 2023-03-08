//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import org.lwjgl.opengl.*;

public class Class340
{
    public double Field9398;
    public double Field9399;
    public double Field9400;
    public double Field9401;
    public double Field9402;
    public double Field9403;
    public double Field9404;
    public double Field9405;
    private String Field9406 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class340(final double[] array, final double[] array2, final double[] array3, final double[] array4) {
        this.Field9398 = array[0];
        this.Field9400 = array[1];
        this.Field9399 = array2[0];
        this.Field9401 = array2[1];
        this.Field9402 = array3[0];
        this.Field9404 = array3[1];
        this.Field9403 = array4[0];
        this.Field9405 = array4[1];
    }
    
    public ArrayList Method1672() {
        return new ArrayList((Collection<? extends E>)Arrays.asList(new double[][] { { this.Field9398, this.Field9400 }, { this.Field9399, this.Field9401 }, { this.Field9402, this.Field9404 }, { this.Field9403, this.Field9405 } }));
    }
    
    public float Method1673() {
        return (float)Math.min(this.Field9398, Math.min(this.Field9399, Math.min(this.Field9402, this.Field9403)));
    }
    
    public float Method1674() {
        return (float)Math.min(this.Field9400, Math.min(this.Field9401, Math.min(this.Field9404, this.Field9405)));
    }
    
    public float Method1675() {
        return (float)Math.max(this.Field9398, Math.max(this.Field9399, Math.max(this.Field9402, this.Field9403)));
    }
    
    public float Method1676() {
        return (float)Math.max(this.Field9400, Math.max(this.Field9401, Math.max(this.Field9404, this.Field9405)));
    }
    
    public void Method1677() {
        GL11.glVertex2d(this.Field9398, this.Field9400);
        GL11.glVertex2d(this.Field9399, this.Field9401);
        GL11.glVertex2d(this.Field9402, this.Field9404);
        GL11.glVertex2d(this.Field9403, this.Field9405);
    }
}
