//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import com.kisman.cc.event.*;

public class Class478 extends Class2157
{
    protected float Field9991;
    protected float Field9992;
    protected double Field9993;
    protected double Field9994;
    protected double Field9995;
    protected boolean Field9996;
    private Consumer Field9997;
    private boolean Field9998;
    public boolean Field9999;
    private String Field10000 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class478(final Class1273 class1273, final float field9991, final float field9992, final double field9993, final double field9994, final double field9995, final boolean field9996) {
        super(class1273, new Object[0]);
        this.Field9999 = false;
        this.Field9997 = null;
        this.Field9991 = field9991;
        this.Field9992 = field9992;
        this.Field9993 = field9993;
        this.Field9994 = field9994;
        this.Field9995 = field9995;
        this.Field9996 = field9996;
    }
    
    public Class478(final Class1273 class1273, final Class478 class1274) {
        this(class1273, class1274.Field9991, class1274.Field9992, class1274.Field9993, class1274.Field9994, class1274.Field9995, class1274.Field9996);
    }
    
    public Consumer Method1731() {
        return this.Field9997;
    }
    
    public void Method1732(final Consumer field9997) {
        this.Field9999 = true;
        this.Field9997 = field9997;
    }
    
    public float Method1733() {
        return this.Field9991;
    }
    
    public void Method1734(final float field9991) {
        this.Field9999 = true;
        this.Field9991 = field9991;
    }
    
    public float Method1735() {
        return this.Field9992;
    }
    
    public void Method1736(final float field9992) {
        this.Field9999 = true;
        this.Field9992 = field9992;
    }
    
    public void Method1737(final double n) {
        this.Field9999 = true;
        this.Field9991 = (float)n;
    }
    
    public void Method1738(final double n) {
        this.Field9999 = true;
        this.Field9992 = (float)n;
    }
    
    public void Method1739() {
        this.Field9998 = true;
    }
    
    public boolean Method1740() {
        return this.Field9998;
    }
    
    public void Method1741(final double field9993) {
        this.Field9999 = true;
        this.Field9993 = field9993;
    }
    
    public void Method1742(final double field9994) {
        this.Field9999 = true;
        this.Field9994 = field9994;
    }
    
    public void Method1743(final double field9995) {
        this.Field9999 = true;
        this.Field9995 = field9995;
    }
    
    public void Method1744(final boolean field9996) {
        this.Field9999 = true;
        this.Field9996 = field9996;
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
    
    public String Method163() {
        return "player_motion";
    }
    
    private static String Method170(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7F8F ^ 0xB2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
