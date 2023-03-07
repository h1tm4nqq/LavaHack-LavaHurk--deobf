/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.world.World
 */
package lavahack.client;

import java.io.File;
import javax.annotation.Nullable;
import lavahack.client.Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo;
import lavahack.client.meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU;
import lavahack.client.pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt {
    public final meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU Field12799;
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

    public k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt(meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2, EntityPlayer entityPlayer, World world, File file, @Nullable @Nullable String string, int n, int n2, int n3, int n4, int n5, int n6) {
        this.Field12799 = meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2;
        this.Field12800 = entityPlayer;
        this.Field12801 = world;
        this.Field12802 = file;
        this.Field12803 = string;
        this.Field12804 = n;
        this.Field12805 = n2;
        this.Field12806 = n3;
        this.Field12807 = n4;
        this.Field12808 = n5;
        this.Field12809 = n6;
        this.Field12810 = this.Field12804 >> (((int)-1624553276L ^ 0x9F2B48C5) << 2);
        this.Field12811 = this.Field12805 >> ((int)((long)853718001 ^ (long)853718000) << 2);
        this.Field12812 = this.Field12808 >> ((int)((long)98671624 ^ (long)98671625) << 2);
        this.Field12813 = this.Field12809 >> (((int)1797422756L ^ 0x6B227EA5) << 2);
        this.Field12814 = this.Field12810;
        this.Field12815 = this.Field12812;
        this.Field12816 = (this.Field12811 - this.Field12810 + ((int)2069507149L ^ 0x7B5A2C4C)) * (this.Field12813 - this.Field12812 + ((int)-67798139L ^ 0xFBF57B84));
    }

    public void Method4353() {
        if (!this.Method4355()) {
            return;
        }
        pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.debug("Copying chunk at [{},{}] into {}", (Object)this.Field12814, (Object)this.Field12815, (Object)this.Field12802.getName());
        Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo.Field17565.Method415(this.Field12799, this.Field12801, this.Field12814, this.Field12815, this.Field12804, this.Field12805, this.Field12806, this.Field12807, this.Field12808, this.Field12809);
        this.Field12817 += (int)((long)1304315515 ^ (long)1304315514);
        this.Field12814 += (int)((long)1077171750 ^ (long)1077171751);
        if (this.Field12814 <= this.Field12811) return;
        this.Field12814 = this.Field12810;
        this.Field12815 += (int)-1837415801L ^ 0x927B4286;
    }

    public boolean Method4354() {
        int n;
        if (this.Field12814 == this.Field12810 && this.Field12815 == this.Field12812) {
            n = (int)((long)958935610 ^ (long)958935611);
            return n != 0;
        }
        n = (int)1959175533L ^ 0x74C6A56D;
        return n != 0;
    }

    public boolean Method4355() {
        int n;
        if (this.Field12814 <= this.Field12811 && this.Field12815 <= this.Field12813) {
            n = (int)((long)-1286204301 ^ (long)-1286204302);
            return n != 0;
        }
        n = (int)-191313395L ^ 0xF498CA0D;
        return n != 0;
    }

    private static String Method4356(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-707555003L ^ 0xD5D39145;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1671936214 ^ (long)-1671936043);
            int n2 = (int)((long)2042912984 ^ (long)2042912981);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)674068756 ^ (long)674052565) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

