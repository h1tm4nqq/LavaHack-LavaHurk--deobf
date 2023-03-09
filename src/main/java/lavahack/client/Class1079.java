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
import lavahack.client.Class2101;
import lavahack.client.Class542;
import lavahack.client.Class686;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class Class1079 {
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

    public Class1079(Class686 class686, EntityPlayer entityPlayer, World world, File file, @Nullable @Nullable String string, int n, int n2, int n3, int n4, int n5, int n6) {
        this.Field12799 = class686;
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
        if (this.Field12814 <= this.Field12811) return;
        this.Field12814 = this.Field12810;
        ++this.Field12815;
    }

    public boolean Method4354() {
        if (this.Field12814 != this.Field12810) return false;
        if (this.Field12815 != this.Field12812) return false;
        return true;
    }

    public boolean Method4355() {
        if (this.Field12814 > this.Field12811) return false;
        if (this.Field12815 > this.Field12813) return false;
        return true;
    }

    private static String Method4356(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 13;
            cArray2[n] = (char)(cArray[n] ^ (0x40C1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

