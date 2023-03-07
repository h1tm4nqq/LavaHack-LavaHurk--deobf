/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.event.Event;
import com.kisman.cc.event.Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import java.util.function.Consumer;

public class RG0Ef4LzpvaRaWkCktLl94QMei9n80rd
extends Event {
    protected float Field9991;
    protected float Field9992;
    protected double Field9993;
    protected double Field9994;
    protected double Field9995;
    protected boolean Field9996;
    private Consumer Field9997 = null;
    private boolean Field9998;
    public boolean Field9999 = (int)((long)392316856 ^ (long)392316856);
    private String Field10000 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public RG0Ef4LzpvaRaWkCktLl94QMei9n80rd(Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, float f, float f2, double d, double d2, double d3, boolean bl) {
        super(event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, new Object[(int)((long)-1977239347 ^ (long)-1977239347)]);
        this.Field9991 = f;
        this.Field9992 = f2;
        this.Field9993 = d;
        this.Field9994 = d2;
        this.Field9995 = d3;
        this.Field9996 = bl;
    }

    public RG0Ef4LzpvaRaWkCktLl94QMei9n80rd(Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, RG0Ef4LzpvaRaWkCktLl94QMei9n80rd rG0Ef4LzpvaRaWkCktLl94QMei9n80rd) {
        this(event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, rG0Ef4LzpvaRaWkCktLl94QMei9n80rd.Field9991, rG0Ef4LzpvaRaWkCktLl94QMei9n80rd.Field9992, rG0Ef4LzpvaRaWkCktLl94QMei9n80rd.Field9993, rG0Ef4LzpvaRaWkCktLl94QMei9n80rd.Field9994, rG0Ef4LzpvaRaWkCktLl94QMei9n80rd.Field9995, rG0Ef4LzpvaRaWkCktLl94QMei9n80rd.Field9996);
    }

    public Consumer Method1731() {
        return this.Field9997;
    }

    public void Method1732(Consumer consumer) {
        this.Field9999 = (int)1506662611L ^ 0x59CDD8D2;
        this.Field9997 = consumer;
    }

    public float Method1733() {
        return this.Field9991;
    }

    public void Method1734(float f) {
        this.Field9999 = (int)((long)-1595676184 ^ (long)-1595676183);
        this.Field9991 = f;
    }

    public float Method1735() {
        return this.Field9992;
    }

    public void Method1736(float f) {
        this.Field9999 = (int)((long)-153911132 ^ (long)-153911131);
        this.Field9992 = f;
    }

    public void Method1737(double d) {
        this.Field9999 = (int)2141027019L ^ 0x7F9D7ACA;
        this.Field9991 = (float)d;
    }

    public void Method1738(double d) {
        this.Field9999 = (int)-841067049L ^ 0xCDDE55D6;
        this.Field9992 = (float)d;
    }

    public void Method1739() {
        this.Field9998 = (int)-904931652L ^ 0xCA0FD6BD;
    }

    public boolean Method1740() {
        return this.Field9998;
    }

    public void Method1741(double d) {
        this.Field9999 = (int)2077846044L ^ 0x7BD96A1D;
        this.Field9993 = d;
    }

    public void Method1742(double d) {
        this.Field9999 = (int)-128287582L ^ 0xF85A7CA3;
        this.Field9994 = d;
    }

    public void Method1743(double d) {
        this.Field9999 = (int)-58979201L ^ 0xFC7C0C7E;
        this.Field9995 = d;
    }

    public void Method1744(boolean bl) {
        this.Field9999 = (int)((long)2042299662 ^ (long)2042299663);
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
        int n = (int)((long)724377209 ^ (long)724377209);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1483398754L ^ 0x586ADE9D);
            int n2 = ((int)1050904138L ^ 0x3EA38613) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-396481205 ^ (long)-396471612) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

