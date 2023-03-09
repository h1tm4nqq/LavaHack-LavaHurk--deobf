/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.event.Class1273;
import com.kisman.cc.event.Class2157;
import java.util.function.Consumer;

public class Class478
extends Class2157 {
    protected float Field9991;
    protected float Field9992;
    protected double Field9993;
    protected double Field9994;
    protected double Field9995;
    protected boolean Field9996;
    private Consumer Field9997 = null;
    private boolean Field9998;
    public boolean Field9999 = false;
    private String Field10000 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class478(Class1273 class1273, float f, float f2, double d, double d2, double d3, boolean bl) {
        super(class1273, new Object[0]);
        this.Field9991 = f;
        this.Field9992 = f2;
        this.Field9993 = d;
        this.Field9994 = d2;
        this.Field9995 = d3;
        this.Field9996 = bl;
    }

    public Class478(Class1273 class1273, Class478 class478) {
        this(class1273, class478.Field9991, class478.Field9992, class478.Field9993, class478.Field9994, class478.Field9995, class478.Field9996);
    }

    public Consumer Method1731() {
        return this.Field9997;
    }

    public void Method1732(Consumer consumer) {
        this.Field9999 = true;
        this.Field9997 = consumer;
    }

    public float Method1733() {
        return this.Field9991;
    }

    public void Method1734(float f) {
        this.Field9999 = true;
        this.Field9991 = f;
    }

    public float Method1735() {
        return this.Field9992;
    }

    public void Method1736(float f) {
        this.Field9999 = true;
        this.Field9992 = f;
    }

    public void Method1737(double d) {
        this.Field9999 = true;
        this.Field9991 = (float)d;
    }

    public void Method1738(double d) {
        this.Field9999 = true;
        this.Field9992 = (float)d;
    }

    public void Method1739() {
        this.Field9998 = true;
    }

    public boolean Method1740() {
        return this.Field9998;
    }

    public void Method1741(double d) {
        this.Field9999 = true;
        this.Field9993 = d;
    }

    public void Method1742(double d) {
        this.Field9999 = true;
        this.Field9994 = d;
    }

    public void Method1743(double d) {
        this.Field9999 = true;
        this.Field9995 = d;
    }

    public void Method1744(boolean bl) {
        this.Field9999 = true;
        this.Field9996 = bl;
    }

    public double Method1745() {
        return this.Field9993;
    }

    public double Method1746() {
        return this.Field9994;
    }

    public double Method1747() {
        return this.Field9995;
    }

    public boolean Method1748() {
        return this.Field9996;
    }

    @Override
    public String Method163() {
        return "player_motion";
    }

    private static String Method170(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 178;
            cArray2[n] = (char)(cArray[n] ^ (0x7F8F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

