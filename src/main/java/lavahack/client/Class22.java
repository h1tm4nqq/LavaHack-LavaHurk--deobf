/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import lavahack.client.Class1172;
import org.lwjgl.opengl.GL11;

public class Class22 {
    public ArrayList Field7908;
    public Color Field7909;
    public boolean Field7910;
    public float Field7911;
    private String Field7912 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class22(ArrayList arrayList, Color color, boolean bl, float f) {
        this.Field7908 = arrayList;
        this.Field7909 = color;
        this.Field7910 = bl;
        this.Field7911 = f;
    }

    public void Method190() {
        Class1172.Method4730(this.Field7909);
        if (this.Field7910) {
            GL11.glLineWidth((float)this.Field7911);
            GL11.glBegin((int)0);
        } else {
            GL11.glBegin((int)9);
        }
        this.Method191();
        GL11.glEnd();
    }

    private void Method191() {
        Iterator iterator = this.Field7908.iterator();
        while (iterator.hasNext()) {
            double[] dArray = (double[])iterator.next();
            GL11.glVertex2d((double)dArray[0], (double)dArray[1]);
        }
    }
}

