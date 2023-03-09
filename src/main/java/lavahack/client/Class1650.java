//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package lavahack.client;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import lavahack.client.Class1079;
import lavahack.client.Class1433;
import lavahack.client.Class16;
import lavahack.client.Class1885;
import lavahack.client.Class2025;
import lavahack.client.Class292;
import lavahack.client.Class32;
import lavahack.client.Class542;
import lavahack.client.Class686;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class Class1650 {
    public boolean Field15669 = true;
    public boolean Field15670 = true;
    private String Field15671 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void Method410() {
        if (Class32.Field7990.exists()) return;
        if (Class32.Field7990.mkdirs()) return;
        Class542.Field10314.warn("Could not create schematic directory [{}]!", (Object)Class32.Field7990.getAbsolutePath());
    }

    public abstract File Method411();

    public File Method412(String string) {
        File file = this.Method411();
        File file2 = new File(file, string);
        if (file2.exists()) return file2.getCanonicalFile();
        if (file2.mkdirs()) return file2.getCanonicalFile();
        Class542.Field10314.error("Could not create directory [{}]!", (Object)file2.getAbsolutePath());
        return file2.getCanonicalFile();
    }

    public void Method413() {
        this.Field15669 = true;
        this.Field15670 = true;
    }

    public void Method414() {
    }

    public void Method415(Class686 class686, World world, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        IBlockState iBlockState;
        int n9;
        int n10;
        int n11;
        int n12;
        Class16 class16 = new Class16();
        Class16 class162 = new Class16();
        int n13 = n3 < n << 4 ? 0 : n3 & 0xF;
        int n14 = n4 > (n << 4) + 15 ? 15 : n4 & 0xF;
        int n15 = n7 < n2 << 4 ? 0 : n7 & 0xF;
        int n16 = n8 > (n2 << 4) + 15 ? 15 : n8 & 0xF;
        for (n12 = n13; n12 <= n14; ++n12) {
            for (n11 = n15; n11 <= n16; ++n11) {
                for (n10 = n5; n10 <= n6; ++n10) {
                    TileEntity tileEntity;
                    n9 = n12 | n << 4;
                    int n17 = n11 | n2 << 4;
                    int n18 = n9 - n3;
                    int n19 = n10 - n5;
                    int n20 = n17 - n7;
                    class16.set(n9, n10, n17);
                    class162.set(n18, n19, n20);
                    iBlockState = world.getBlockState((BlockPos)class16);
                    Block block = iBlockState.getBlock();
                    boolean bl = class686.Method2881(class162, iBlockState);
                    if (!bl || !block.hasTileEntity(iBlockState) || (tileEntity = world.getTileEntity((BlockPos)class16)) == null) continue;
                    TileEntity tileEntity2 = Class1433.Method5731(tileEntity, n3, n5, n7);
                    class686.Method2884(class162, tileEntity2);
                }
            }
        }
        n12 = n13 | n << 4;
        n11 = n15 | n2 << 4;
        n10 = n14 | n << 4;
        n9 = n16 | n2 << 4;
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB((double)n12, (double)n5, (double)n11, (double)(n10 + 1), (double)(n6 + 1), (double)(n9 + 1));
        List list = world.getEntitiesWithinAABB(Entity.class, axisAlignedBB);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            iBlockState = Class1433.Method5733(entity, n3, n5, n7);
            class686.Method2887((Entity)iBlockState);
        }
    }

    public boolean Method416(EntityPlayer entityPlayer, File file, String string, World world, @Nullable @Nullable String string2, BlockPos blockPos, BlockPos blockPos2) {
        String string3 = "";
        String[] stringArray = string.split(";");
        if (stringArray.length == 2) {
            string3 = stringArray[0];
            string = stringArray[1];
        }
        int n = Math.min(blockPos.getX(), blockPos2.getX());
        int n2 = Math.max(blockPos.getX(), blockPos2.getX());
        int n3 = Math.min(blockPos.getY(), blockPos2.getY());
        int n4 = Math.max(blockPos.getY(), blockPos2.getY());
        int n5 = Math.min(blockPos.getZ(), blockPos2.getZ());
        int n6 = Math.max(blockPos.getZ(), blockPos2.getZ());
        short s = (short)(Math.abs(n2 - n) + 1);
        short s2 = (short)(Math.abs(n4 - n3) + 1);
        short s3 = (short)(Math.abs(n6 - n5) + 1);
        Class1885 class1885 = new Class1885(Class292.Method1527(string3), s, s2, s3, entityPlayer.getName());
        Class1079 class1079 = new Class1079(class1885, entityPlayer, world, new File(file, string), string2, n, n2, n3, n4, n5, n6);
        Class2025.Field17312.Method7491(class1079);
        return true;
    }

    public abstract boolean Method417(EntityPlayer var1, File var2, String var3);

    public abstract boolean Method418(EntityPlayer var1);

    public abstract File Method419(EntityPlayer var1, boolean var2);

    private static String Method420(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 55;
            cArray2[n] = (char)(cArray[n] ^ (0x4AA5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

