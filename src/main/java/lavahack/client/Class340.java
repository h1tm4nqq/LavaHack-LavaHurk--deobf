/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Arrays;
import org.lwjgl.opengl.GL11;

public class Class340 {
    public double Field9398;
    public double Field9399;
    public double Field9400;
    public double Field9401;
    public double Field9402;
    public double Field9403;
    public double Field9404;
    public double Field9405;
    private String Field9406 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class340(double[] dArray, double[] dArray2, double[] dArray3, double[] dArray4) {
        this.Field9398 = dArray[0];
        this.Field9400 = dArray[1];
        this.Field9399 = dArray2[0];
        this.Field9401 = dArray2[1];
        this.Field9402 = dArray3[0];
        this.Field9404 = dArray3[1];
        this.Field9403 = dArray4[0];
        this.Field9405 = dArray4[1];
    }

    public ArrayList Method1672() {
        return new ArrayList(Arrays.asList({this.Field9398, this.Field9400}, {this.Field9399, this.Field9401}, {this.Field9402, this.Field9404}, {this.Field9403, this.Field9405}));
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
        GL11.glVertex2d((double)this.Field9398, (double)this.Field9400);
        GL11.glVertex2d((double)this.Field9399, (double)this.Field9401);
        GL11.glVertex2d((double)this.Field9402, (double)this.Field9404);
        GL11.glVertex2d((double)this.Field9403, (double)this.Field9405);
    }
}

