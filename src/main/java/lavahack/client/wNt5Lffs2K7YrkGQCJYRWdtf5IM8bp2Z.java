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
import lavahack.client.BKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ;
import lavahack.client.EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN;
import lavahack.client.QLIpNqoDBC9c2InoQrmQyG4lJtqF4TsA;
import lavahack.client.UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh;
import lavahack.client.Z59nFS7fzGt9MllssMcgOsEYj1a2guaH;
import lavahack.client.k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt;
import lavahack.client.kQ72jH1kluusFFUnlWwOgQ64UIYIqb8r;
import lavahack.client.meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU;
import lavahack.client.pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class wNt5Lffs2K7YrkGQCJYRWdtf5IM8bp2Z {
    public boolean Field15669 = (int)-2114659834L ^ 0x81F4DA07;
    public boolean Field15670 = (int)-1098051080L ^ 0xBE8D11F9;
    private String Field15671 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void Method410() {
        if (Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7990.exists()) return;
        if (Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7990.mkdirs()) return;
        pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.warn("Could not create schematic directory [{}]!", (Object)Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7990.getAbsolutePath());
    }

    public abstract File Method411();

    public File Method412(String string) {
        File file = this.Method411();
        File file2 = new File(file, string);
        if (file2.exists()) return file2.getCanonicalFile();
        if (file2.mkdirs()) return file2.getCanonicalFile();
        pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.error("Could not create directory [{}]!", (Object)file2.getAbsolutePath());
        return file2.getCanonicalFile();
    }

    public void Method413() {
        this.Field15669 = (int)((long)2024253228 ^ (long)2024253229);
        this.Field15670 = (int)-1184947887L ^ 0xB95F2150;
    }

    public void Method414() {
    }

    public void Method415(meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2, World world, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        IBlockState iBlockState;
        int n9;
        int n10;
        int n11;
        int n12;
        EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN = new EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN();
        EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN2 = new EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN();
        int n13 = n3 < n << ((int)((long)-2030464704 ^ (long)-2030464703) << 2) ? (int)-2098828123L ^ 0x82E66CA5 : n3 & ((int)-1307118604L ^ 0xB216F3FB);
        int n14 = n4 > (n << ((int)((long)-519577292 ^ (long)-519577291) << 2)) + (int)((long)1947889996 ^ (long)1947889987) ? (int)((long)-1014464677 ^ (long)-1014464684) : n4 & (int)((long)-1218797793 ^ (long)-1218797808);
        int n15 = n7 < n2 << (((int)-1244550646L ^ 0xB5D1AA0B) << 2) ? (int)893899110L ^ 0x3547D166 : n7 & (int)((long)857393657 ^ (long)857393654);
        int n16 = n8 > (n2 << (((int)1507095379L ^ 0x59D47352) << 2)) + (int)((long)1784325521 ^ (long)1784325534) ? (int)((long)-973303185 ^ (long)-973303200) : n8 & (int)((long)1748848748 ^ (long)1748848739);
        for (n12 = n13; n12 <= n14; ++n12) {
            for (n11 = n15; n11 <= n16; ++n11) {
                for (n10 = n5; n10 <= n6; ++n10) {
                    TileEntity tileEntity;
                    n9 = n12 | n << ((int)((long)-163134718 ^ (long)-163134717) << 2);
                    int n17 = n11 | n2 << ((int)((long)1830344969 ^ (long)1830344968) << 2);
                    int n18 = n9 - n3;
                    int n19 = n10 - n5;
                    int n20 = n17 - n7;
                    eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.set(n9, n10, n17);
                    eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN2.set(n18, n19, n20);
                    iBlockState = world.getBlockState((BlockPos)eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN);
                    Block block = iBlockState.getBlock();
                    boolean bl = meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2881(eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN2, iBlockState);
                    if (!bl || !block.hasTileEntity(iBlockState) || (tileEntity = world.getTileEntity((BlockPos)eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN)) == null) continue;
                    TileEntity tileEntity2 = UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh.Method5731(tileEntity, n3, n5, n7);
                    meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2884(eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN2, tileEntity2);
                }
            }
        }
        n12 = n13 | n << (((int)-179211419L ^ 0xF5517364) << 2);
        n11 = n15 | n2 << ((int)((long)-1457344145 ^ (long)-1457344146) << 2);
        n10 = n14 | n << ((int)((long)-239964806 ^ (long)-239964805) << 2);
        n9 = n16 | n2 << (((int)-143344913L ^ 0xF774BAEE) << 2);
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB((double)n12, (double)n5, (double)n11, (double)(n10 + ((int)875726437L ^ 0x34328664)), (double)(n6 + ((int)-510685553L ^ 0xE18F8E8E)), (double)(n9 + (int)((long)463631390 ^ (long)463631391)));
        List list = world.getEntitiesWithinAABB(Entity.class, axisAlignedBB);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            iBlockState = UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh.Method5733(entity, n3, n5, n7);
            meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2887((Entity)iBlockState);
        }
    }

    public boolean Method416(EntityPlayer entityPlayer, File file, String string, World world, @Nullable @Nullable String string2, BlockPos blockPos, BlockPos blockPos2) {
        String string3 = "";
        String[] stringArray = string.split(";");
        if (stringArray.length == (int)((long)-1941161576 ^ (long)-1941161575) << 1) {
            string3 = stringArray[(int)((long)-1366359675 ^ (long)-1366359675)];
            string = stringArray[(int)((long)1866337580 ^ (long)1866337581)];
        }
        int n = Math.min(blockPos.getX(), blockPos2.getX());
        int n2 = Math.max(blockPos.getX(), blockPos2.getX());
        int n3 = Math.min(blockPos.getY(), blockPos2.getY());
        int n4 = Math.max(blockPos.getY(), blockPos2.getY());
        int n5 = Math.min(blockPos.getZ(), blockPos2.getZ());
        int n6 = Math.max(blockPos.getZ(), blockPos2.getZ());
        short s = (short)(Math.abs(n2 - n) + ((int)-114124432L ^ 0xF9329971));
        short s2 = (short)(Math.abs(n4 - n3) + (int)((long)1744568327 ^ (long)1744568326));
        short s3 = (short)(Math.abs(n6 - n5) + (int)((long)290317610 ^ (long)290317611));
        BKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ bKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ = new BKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ(kQ72jH1kluusFFUnlWwOgQ64UIYIqb8r.Method1527(string3), s, s2, s3, entityPlayer.getName());
        k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt2 = new k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt(bKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ, entityPlayer, world, new File(file, string), string2, n, n2, n3, n4, n5, n6);
        QLIpNqoDBC9c2InoQrmQyG4lJtqF4TsA.Field17312.Method7491(k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt2);
        return (int)((long)-858233769 ^ (long)-858233770) != 0;
    }

    public abstract boolean Method417(EntityPlayer var1, File var2, String var3);

    public abstract boolean Method418(EntityPlayer var1);

    public abstract File Method419(EntityPlayer var1, boolean var2);

    private static String Method420(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-984257946L ^ 0xC5556A66;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)384997084 ^ (long)384996899);
            int n2 = (int)((long)2120176370 ^ (long)2120176325);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-268697611 ^ (long)-268716720) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

