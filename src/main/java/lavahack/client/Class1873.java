//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class1873 implements Class1520
{
    private final Class42 Field16593;
    private int Field16594;
    private int Field16595;
    private int Field16596;
    private int Field16597;
    private int Field16598;
    private int Field16599;
    private int Field16600;
    
    public Class1873(final Class42 field16593, final int field16594, final int field16595, final int field16596, final int field16597, final int field16598) {
        this.Field16598 = 120;
        this.Field16593 = field16593;
        this.Field16594 = field16594;
        this.Field16595 = field16595;
        this.Field16596 = field16596;
        this.Field16597 = field16597;
        this.Field16599 = field16598;
        this.Field16598 = Class981.Method3992(field16598, this.Field16598);
    }
    
    public void Method623(final int n, final int n2) {
        super.Method623(n, n2);
        Class753.drawRectWH(this.Field16594, this.Field16595 + this.Field16596, this.Field16598, Class1419.Field14604, Class1419.Field14584.Method3626());
        if (Class1419.Field14590) {
            if (this.Field16593.Field8064) {
                Class753.drawAbstract(new Class211(new Class340(new double[] { this.Field16594 + Class1419.Field14601, this.Field16595 + this.Field16596 + Class1419.Field14602 }, new double[] { this.Field16594 + this.Field16598 - Class1419.Field14601, this.Field16595 + this.Field16596 + Class1419.Field14602 }, new double[] { this.Field16594 + this.Field16598 - Class1419.Field14601, this.Field16595 + this.Field16596 + Class1419.Field14604 - Class1419.Field14602 }, new double[] { this.Field16594 + Class1419.Field14601, this.Field16595 + this.Field16596 + Class1419.Field14604 - Class1419.Field14602 }), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335()), Class1419.Method1228(this.Field16597).Method3625()));
            }
        }
        else if (Class1419.Field14594 || this.Field16593.Field8064) {
            Class753.drawRectWH(this.Field16594 + Class1419.Field14601, this.Field16595 + this.Field16596 + Class1419.Field14602, this.Field16598 - Class1419.Field14601 * Double.longBitsToDouble((long)556520748 ^ 0x40000000212BD52CL), Class1419.Field14604 - Class1419.Field14602 * Double.longBitsToDouble(4611686018427387904L), this.Field16593.Field8064 ? Class1419.Method1228(this.Field16597).Method3626() : Class1419.Field14584.Method3626());
        }
        Class1419.Method1224("Visible", this.Field16594, this.Field16595 + this.Field16596, this.Field16598, Class1419.Field14604);
    }
    
    public void Method625(final int n, final int n2, final int n3) {
        if (this.Method6969(n, n2) && n3 == 0) {
            this.Field16593.Field8064 = !this.Field16593.Field8064;
        }
    }
    
    public void Method627(final int field16594, final int field16595) {
        this.Field16594 = field16594;
        this.Field16595 = field16595;
    }
    
    public void Method629(final int field16596) {
        this.Field16596 = field16596;
    }
    
    public int Method631() {
        return Class1419.Field14604;
    }
    
    public boolean Method641() {
        return true;
    }
    
    public void Method630(final int field16597) {
        this.Field16597 = field16597;
    }
    
    public int Method633() {
        return this.Field16597;
    }
    
    public void Method634(final int field16598) {
        this.Field16598 = field16598;
    }
    
    public void Method635(final int field16594) {
        this.Field16594 = field16594;
    }
    
    public int Method636() {
        return this.Field16594;
    }
    
    public void Method639(final int field16599) {
        this.Field16599 = field16599;
    }
    
    public int Method640() {
        return this.Field16599;
    }
    
    private boolean Method6969(final int n, final int n2) {
        return n > this.Field16594 && n < this.Field16594 + this.Field16598 && n2 > this.Field16595 + this.Field16596 && n2 < this.Field16595 + this.Field16596 + Class1419.Field14604;
    }
    
    public void Method637(final int field16595) {
        this.Field16595 = field16595;
    }
    
    public int Method638() {
        return this.Field16595 + this.Field16596;
    }
    
    private static String Method6970(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3226 ^ 0xEB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
