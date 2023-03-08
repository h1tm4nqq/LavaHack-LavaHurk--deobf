//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import java.io.*;
import javax.annotation.*;

public class Class1079
{
    public final Class686 Field12799;
    public final EntityPlayer Field12800;
    public final World Field12801;
    public final File Field12802;
    @Nullable
    public final String Field12803;
    public final int Field12804;
    public final int Field12805;
    public final int Field12806;
    public final int Field12807;
    public final int Field12808;
    public final int Field12809;
    public final int Field12810;
    public final int Field12811;
    public final int Field12812;
    public final int Field12813;
    public int Field12814;
    public int Field12815;
    public final int Field12816;
    public int Field12817;
    private int Field12818;
    
    public Class1079(final Class686 field12799, final EntityPlayer field12800, final World field12801, final File field12802, @Nullable @Nullable final String field12803, final int field12804, final int field12805, final int field12806, final int field12807, final int field12808, final int field12809) {
        this.Field12799 = field12799;
        this.Field12800 = field12800;
        this.Field12801 = field12801;
        this.Field12802 = field12802;
        this.Field12803 = field12803;
        this.Field12804 = field12804;
        this.Field12805 = field12805;
        this.Field12806 = field12806;
        this.Field12807 = field12807;
        this.Field12808 = field12808;
        this.Field12809 = field12809;
        this.Field12810 = this.Field12804 >> 4;
        this.Field12811 = this.Field12805 >> 4;
        this.Field12812 = this.Field12808 >> 4;
        this.Field12813 = this.Field12809 >> 4;
        this.Field12814 = this.Field12810;
        this.Field12815 = this.Field12812;
        this.Field12816 = (this.Field12811 - this.Field12810 + 1) * (this.Field12813 - this.Field12812 + 1);
    }
    
    public void Method4353() {
        if (!this.Method4355()) {
            return;
        }
        Class542.Field10314.debug("Copying chunk at [{},{}] into {}", (Object)this.Field12814, (Object)this.Field12815, (Object)this.Field12802.getName());
        Class2101.Field17565.Method415(this.Field12799, this.Field12801, this.Field12814, this.Field12815, this.Field12804, this.Field12805, this.Field12806, this.Field12807, this.Field12808, this.Field12809);
        ++this.Field12817;
        ++this.Field12814;
        if (this.Field12814 > this.Field12811) {
            this.Field12814 = this.Field12810;
            ++this.Field12815;
        }
    }
    
    public boolean Method4354() {
        return this.Field12814 == this.Field12810 && this.Field12815 == this.Field12812;
    }
    
    public boolean Method4355() {
        return this.Field12814 <= this.Field12811 && this.Field12815 <= this.Field12813;
    }
    
    private static String Method4356(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x40C1 ^ 0xD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
