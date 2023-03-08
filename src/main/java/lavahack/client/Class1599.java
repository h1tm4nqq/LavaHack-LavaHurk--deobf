//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.math.*;

public class Class1599 implements Class1520
{
    private final Class44 Field15481;
    private int Field15482;
    private int Field15483;
    private int Field15484;
    private int Field15485;
    private boolean Field15486;
    private int Field15487;
    private int Field15488;
    private String Field15489;
    private boolean Field15490;
    private boolean Field15491;
    private String Field15492 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1599(final Class44 field15481, final int field15482, final int field15483, final int field15484, final int field15485, final int field15486) {
        this.Field15487 = 120;
        this.Field15489 = "";
        this.Field15490 = false;
        this.Field15491 = false;
        this.Field15481 = field15481;
        this.Field15482 = field15482;
        this.Field15483 = field15483;
        this.Field15484 = field15484;
        this.Field15485 = field15485;
        this.Field15488 = field15486;
        this.Field15487 = Class981.Method3992(field15486, this.Field15487);
    }
    
    public void Method623(final int n, final int n2) {
        super.Method623(n, n2);
        final double method371 = this.Field15481.Method371();
        final double method372 = this.Field15481.Method372();
        if (this.Field15491) {
            this.Field15486 = false;
        }
        else {
            this.Field15489 = "";
        }
        if (this.Field15486) {
            final double n3 = Math.min(this.Field15487, Math.max(0, n - this.Field15482));
            if (n3 == 0.0) {
                this.Field15481.Method370(this.Field15481.Method371());
            }
            else {
                this.Field15481.Method370(Method6258(n3 / this.Field15487 * (method372 - method371) + method371, 2));
            }
        }
        final String s = this.Field15491 ? (this.Field15489 + "_") : (this.Field15481.Method354() + ": " + this.Field15481.Method320().Method2190().apply(this.Field15481.Method367()));
        Class753.drawRectWH(this.Field15482, this.Field15483 + this.Field15484, this.Field15487, Class1419.Field14604, Class1419.Field14584.Method3626());
        final int n4 = (int)(this.Field15487 * (this.Field15481.Method367() - method371) / (method372 - method371));
        if (Class1419.Field14590) {
            Class753.drawAbstract(new Class211(new Class340(new double[] { this.Field15482 + Class1419.Field14601, this.Field15483 + this.Field15484 + Class1419.Field14602 }, new double[] { this.Field15482 + n4 - Class1419.Field14601, this.Field15483 + this.Field15484 + Class1419.Field14602 }, new double[] { this.Field15482 + n4 - Class1419.Field14601, this.Field15483 + this.Field15484 + Class1419.Field14604 - Class1419.Field14602 }, new double[] { this.Field15482 + Class1419.Field14601, this.Field15483 + this.Field15484 + Class1419.Field14604 - Class1419.Field14602 }), Class1419.Method1228(this.Field15485).Method3625(), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335())));
        }
        else {
            Class753.drawRectWH(this.Field15482 + Class1419.Field14601, this.Field15483 + this.Field15484 + Class1419.Field14602, n4 - Class1419.Field14601 * Double.longBitsToDouble((long)1726677962 ^ 0x4000000066EB03CAL), Class1419.Field14604 - Class1419.Field14602 * Double.longBitsToDouble((long)592999030 ^ 0x4000000023587276L), Class1419.Method1228(this.Field15485).Method3626());
        }
        Class1419.Method1224(s, this.Field15482, this.Field15483 + this.Field15484, this.Field15487, Class1419.Field14604);
    }
    
    public void Method625(final int n, final int n2, final int n3) {
        if (this.Method6257(n, n2) && n3 == 0) {
            this.Field15486 = true;
        }
        if (this.Method6257(n, n2) && n3 == 1) {
            this.Field15491 = true;
        }
    }
    
    public void Method626(final int n, final int n2, final int n3) {
        this.Field15486 = false;
    }
    
    public void Method627(final int field15482, final int field15483) {
        this.Field15482 = field15482;
        this.Field15483 = field15483;
    }
    
    public void Method628(final char c, final int n) {
        if (this.Field15491) {
            if (n == 28) {
                this.Field15491 = false;
                if (!this.Field15489.isEmpty()) {
                    this.Field15481.Method370(Class1990.Method7392(this.Field15489, this.Field15481.Method367()));
                }
                return;
            }
            if (n == 14 && !this.Field15489.isEmpty() && Class1990.Method7392(this.Field15489, this.Field15481.Method367()) != this.Field15481.Method367()) {
                this.Field15489 = this.Field15489.substring(0, this.Field15489.length() - 1);
                return;
            }
            this.Field15489 += c;
        }
    }
    
    public void Method629(final int field15484) {
        this.Field15484 = field15484;
    }
    
    public int Method631() {
        return Class1419.Field14604;
    }
    
    public boolean Method641() {
        return this.Field15481.Method311() && Class1419.Method1233(this.Field15481.Method354());
    }
    
    public void Method630(final int field15485) {
        this.Field15485 = field15485;
    }
    
    public int Method633() {
        return this.Field15485;
    }
    
    public void Method634(final int field15487) {
        this.Field15487 = field15487;
    }
    
    public void Method635(final int field15482) {
        this.Field15482 = field15482;
    }
    
    public int Method636() {
        return this.Field15482;
    }
    
    public void Method639(final int field15488) {
        this.Field15488 = field15488;
    }
    
    public int Method640() {
        return this.Field15488;
    }
    
    private boolean Method6257(final int n, final int n2) {
        return n > this.Field15482 && n < this.Field15482 + this.Field15487 && n2 > this.Field15483 + this.Field15484 && n2 < this.Field15483 + this.Field15484 + Class1419.Field14604;
    }
    
    private static double Method6258(final double val, final int newScale) {
        if (newScale < 0) {
            throw new IllegalArgumentException();
        }
        return new BigDecimal(val).setScale(newScale, RoundingMode.HALF_UP).doubleValue();
    }
    
    public void Method637(final int field15483) {
        this.Field15483 = field15483;
    }
    
    public int Method638() {
        return this.Field15483 + this.Field15484;
    }
    
    private static String Method6259(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7739 ^ 0x60));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
