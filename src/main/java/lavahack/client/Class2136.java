//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import org.jetbrains.annotations.*;

public class Class2136 implements Class337
{
    private final Class44 Field17768;
    private int Field17769;
    private int Field17770;
    private int Field17771;
    private int Field17772;
    private int Field17773;
    private int Field17774;
    private final Class691 Field17775;
    private boolean Field17776;
    private int Field17777;
    
    public Class2136(final Class44 field17768, final int field17769, final int field17770, final int field17771, final int field17772, final int field17773) {
        this.Field17773 = 120;
        this.Field17768 = field17768;
        this.Field17769 = field17769;
        this.Field17770 = field17770;
        this.Field17771 = field17771;
        this.Field17772 = field17772;
        this.Field17774 = field17773;
        this.Field17773 = Class981.Method3992(field17773, this.Field17773);
        this.Field17775 = new Class691(field17768, field17769, field17770, field17771 + Class1419.Field14604, field17772, field17773 + 1);
    }
    
    public void Method623(final int n, final int n2) {
        super.Method623(n, n2);
        Class753.drawRectWH(this.Field17769, this.Field17770 + this.Field17771, this.Field17773, Class1419.Field14604, Class1419.Field14584.Method3626());
        if (Class1419.Field14590) {
            if (this.Field17768.Method365()) {
                Class753.drawAbstract(new Class211(new Class340(new double[] { this.Field17769 + Class1419.Field14601, this.Field17770 + this.Field17771 + Class1419.Field14602 }, new double[] { this.Field17769 + this.Field17773 - Class1419.Field14601, this.Field17770 + this.Field17771 + Class1419.Field14602 }, new double[] { this.Field17769 + this.Field17773 - Class1419.Field14601, this.Field17770 + this.Field17771 + Class1419.Field14604 - Class1419.Field14602 }, new double[] { this.Field17769 + Class1419.Field14601, this.Field17770 + this.Field17771 + Class1419.Field14604 - Class1419.Field14602 }), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335()), Class1419.Method1228(this.Field17772).Method3625()));
            }
        }
        else if (Class1419.Field14594 || this.Field17768.Method365()) {
            Class753.drawRectWH(this.Field17769 + Class1419.Field14601, this.Field17770 + this.Field17771 + Class1419.Field14602, this.Field17773 - Class1419.Field14601 * Double.longBitsToDouble(4611686018427387904L), Class1419.Field14604 - Class1419.Field14602 * Double.longBitsToDouble((long)432337699 ^ 0x4000000019C4F323L), this.Field17768.Method365() ? Class1419.Method1228(this.Field17772).Method3626() : Class1419.Field14584.Method3626());
        }
        if (null.Field11809.Method365()) {
            final Class44 field17768 = this.Field17768;
            if (Class44.Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Method7141((Class695)this.Field17768)) {
                final Class44 field17769 = this.Field17768;
                Class1419.Method1226(Class44.Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Method7140((Class695)this.Field17768), this.Field17768.Method354(), (double)this.Field17769, (double)(this.Field17770 + this.Field17771), (double)this.Field17773, (double)Class1419.Field14604, this.Field17772, 3);
            }
        }
        Class1419.Method1224(this.Field17768.Method354(), this.Field17769, this.Field17770 + this.Field17771, this.Field17773, Class1419.Field14604);
        if (this.Field17776) {
            this.Field17775.Method623(n, n2);
        }
    }
    
    public void Method625(final int n, final int n2, final int n3) {
        if (this.Method7705(n, n2) && n3 == 0) {
            this.Field17768.Method366(!this.Field17768.Method365());
        }
        if (this.Method7705(n, n2) && n3 == 1) {
            this.Field17776 = !this.Field17776;
        }
        if (this.Field17776) {
            this.Field17775.Method625(n, n2, n3);
        }
    }
    
    public void Method627(final int field17769, final int field17770) {
        this.Field17769 = field17769;
        this.Field17770 = field17770;
        if (this.Field17776) {
            this.Field17775;
            return (void)(this.Field17774 * 5);
        }
    }
    
    public void Method629(final int field17771) {
        this.Field17771 = field17771;
    }
    
    public void Method628(final char c, final int n) {
        if (this.Field17776) {
            this.Field17775.Method628(c, n);
        }
    }
    
    public int Method631() {
        return Class1419.Field14604;
    }
    
    public boolean Method641() {
        return this.Field17768.Method311() && Class1419.Method1233(this.Field17768.Method354());
    }
    
    public void Method630(final int field17772) {
        this.Field17772 = field17772;
    }
    
    public int Method633() {
        return this.Field17772;
    }
    
    public void Method634(final int field17773) {
        this.Field17773 = field17773;
        this.Field17775.Method634(field17773 - 10);
    }
    
    public void Method635(final int field17769) {
        this.Field17769 = field17769;
    }
    
    public int Method636() {
        return this.Field17769;
    }
    
    public void Method639(final int field17774) {
        this.Field17774 = field17774;
    }
    
    public int Method640() {
        return this.Field17774;
    }
    
    private boolean Method7705(final int n, final int n2) {
        return n > this.Field17769 && n < this.Field17769 + this.Field17773 && n2 > this.Field17770 + this.Field17771 && n2 < this.Field17770 + this.Field17771 + Class1419.Field14604;
    }
    
    @Override
    public boolean Method1668() {
        return this.Field17776;
    }
    
    @NotNull
    @NotNull
    @Override
    public ArrayList Method1669() {
        return new ArrayList((Collection<? extends E>)Collections.singletonList(this.Field17775));
    }
    
    public void Method637(final int field17770) {
        this.Field17770 = field17770;
    }
    
    public int Method638() {
        return this.Field17770 + this.Field17771;
    }
}
