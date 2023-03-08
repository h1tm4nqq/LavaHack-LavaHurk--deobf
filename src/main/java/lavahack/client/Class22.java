//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.awt.*;
import org.lwjgl.opengl.*;
import java.util.*;

public class Class22
{
    public ArrayList Field7908;
    public Color Field7909;
    public boolean Field7910;
    public float Field7911;
    private String Field7912 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class22(final ArrayList field7908, final Color field7909, final boolean field7910, final float field7911) {
        this.Field7908 = field7908;
        this.Field7909 = field7909;
        this.Field7910 = field7910;
        this.Field7911 = field7911;
    }
    
    public void Method190() {
        Class1172.Method4730(this.Field7909);
        if (this.Field7910) {
            GL11.glLineWidth(this.Field7911);
            GL11.glBegin(0);
        }
        else {
            GL11.glBegin(9);
        }
        this.Method191();
        GL11.glEnd();
    }
    
    private void Method191() {
        for (final double[] array : this.Field7908) {
            GL11.glVertex2d(array[0], array[1]);
        }
    }
}
