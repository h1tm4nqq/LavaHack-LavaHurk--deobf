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

public class Jl14CJNmtWTqlp58umYadtnd800b2Vd0 {
    public double Field9398;
    public double Field9399;
    public double Field9400;
    public double Field9401;
    public double Field9402;
    public double Field9403;
    public double Field9404;
    public double Field9405;
    private String Field9406 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Jl14CJNmtWTqlp58umYadtnd800b2Vd0(double[] dArray, double[] dArray2, double[] dArray3, double[] dArray4) {
        this.Field9398 = dArray[(int)1151497578L ^ 0x44A2756A];
        this.Field9400 = dArray[(int)1687965473L ^ 0x649C4F20];
        this.Field9399 = dArray2[(int)349439095L ^ 0x14D40477];
        this.Field9401 = dArray2[(int)((long)572600997 ^ (long)572600996)];
        this.Field9402 = dArray3[(int)((long)-1980051278 ^ (long)-1980051278)];
        this.Field9404 = dArray3[(int)((long)1106903481 ^ (long)1106903480)];
        this.Field9403 = dArray4[(int)1806057417L ^ 0x6BA63FC9];
        this.Field9405 = dArray4[(int)-1780860718L ^ 0x95DA38D3];
    }

    public ArrayList Method1672() {
        double[][] dArrayArray = new double[(int)((long)1475584446 ^ (long)1475584447) << 2][];
        double[] dArray = new double[((int)-1412676742L ^ 0xABCC437B) << 1];
        dArray[(int)-517389322L ^ 0xE12943F6] = this.Field9398;
        dArray[(int)((long)1392194961 ^ (long)1392194960)] = this.Field9400;
        dArrayArray[(int)((long)-2128664210 ^ (long)-2128664210)] = dArray;
        double[] dArray2 = new double[((int)154576957L ^ 0x936A83C) << 1];
        dArray2[(int)((long)-1499006110 ^ (long)-1499006110)] = this.Field9399;
        dArray2[(int)1213062116L ^ 0x484DDBE5] = this.Field9401;
        dArrayArray[(int)((long)102334558 ^ (long)102334559)] = dArray2;
        double[] dArray3 = new double[(int)((long)1060543370 ^ (long)1060543371) << 1];
        dArray3[(int)((long)1585297095 ^ (long)1585297095)] = this.Field9402;
        dArray3[(int)-95130943L ^ 0xFA546AC0] = this.Field9404;
        dArrayArray[((int)527694813L ^ 0x1F73FBDC) << 1] = dArray3;
        double[] dArray4 = new double[((int)1840044060L ^ 0x6DACD81D) << 1];
        dArray4[(int)-510538172L ^ 0xE191CE44] = this.Field9403;
        dArray4[(int)((long)322187237 ^ (long)322187236)] = this.Field9405;
        dArrayArray[(int)((long)81343944 ^ (long)81343947)] = dArray4;
        return new ArrayList(Arrays.asList(dArrayArray));
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

