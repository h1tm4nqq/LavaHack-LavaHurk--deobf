//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.io.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.block.state.*;
import net.minecraft.block.*;
import net.minecraft.tileentity.*;
import java.util.*;
import net.minecraft.entity.player.*;
import javax.annotation.*;

public abstract class Class1650
{
    public boolean Field15669;
    public boolean Field15670;
    private String Field15671 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1650() {
        this.Field15669 = true;
        this.Field15670 = true;
    }
    
    public void Method410() {
        if (!Class32.Field7990.exists() && !Class32.Field7990.mkdirs()) {
            Class542.Field10314.warn("Could not create schematic directory [{}]!", (Object)Class32.Field7990.getAbsolutePath());
        }
    }
    
    public abstract File Method411();
    
    public File Method412(final String child) {
        final File file = new File(this.Method411(), child);
        if (!file.exists() && !file.mkdirs()) {
            Class542.Field10314.error("Could not create directory [{}]!", (Object)file.getAbsolutePath());
        }
        return file.getCanonicalFile();
    }
    
    public void Method413() {
        this.Field15669 = true;
        this.Field15670 = true;
    }
    
    public void Method414() {
    }
    
    public void Method415(final Class686 class686, final World world, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final Class16 class687 = new Class16();
        final Class16 class688 = new Class16();
        final int n9 = (n3 < n << 4) ? 0 : (n3 & 0xF);
        final int n10 = (n4 > (n << 4) + 15) ? 15 : (n4 & 0xF);
        final int n11 = (n7 < n2 << 4) ? 0 : (n7 & 0xF);
        final int n12 = (n8 > (n2 << 4) + 15) ? 15 : (n8 & 0xF);
        for (int i = n9; i <= n10; ++i) {
            for (int j = n11; j <= n12; ++j) {
                for (int k = n5; k <= n6; ++k) {
                    final int n13 = i | n << 4;
                    final int n14 = j | n2 << 4;
                    final int n15 = n13 - n3;
                    final int n16 = k - n5;
                    final int n17 = n14 - n7;
                    class687.set(n13, k, n14);
                    class688.set(n15, n16, n17);
                    final IBlockState getBlockState = world.getBlockState((BlockPos)class687);
                    final Block getBlock = getBlockState.getBlock();
                    if (class686.Method2881((BlockPos)class688, getBlockState) && getBlock.hasTileEntity(getBlockState)) {
                        final TileEntity getTileEntity = world.getTileEntity((BlockPos)class687);
                        if (getTileEntity != null) {
                            class686.Method2884((BlockPos)class688, Class1433.Method5731(getTileEntity, n3, n5, n7));
                        }
                    }
                }
            }
        }
        final Iterator iterator = world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB((double)(n9 | n << 4), (double)n5, (double)(n11 | n2 << 4), (double)((n10 | n << 4) + 1), (double)(n6 + 1), (double)((n12 | n2 << 4) + 1))).iterator();
        while (iterator.hasNext()) {
            class686.Method2887(Class1433.Method5733((Entity)iterator.next(), n3, n5, n7));
        }
    }
    
    public boolean Method416(final EntityPlayer entityPlayer, final File parent, String child, final World world, @Nullable @Nullable final String s, final BlockPos blockPos, final BlockPos blockPos2) {
        String s2 = "";
        final String[] split = child.split(";");
        if (split.length == 2) {
            s2 = split[0];
            child = split[1];
        }
        final int min = Math.min(blockPos.getX(), blockPos2.getX());
        final int max = Math.max(blockPos.getX(), blockPos2.getX());
        final int min2 = Math.min(blockPos.getY(), blockPos2.getY());
        final int max2 = Math.max(blockPos.getY(), blockPos2.getY());
        final int min3 = Math.min(blockPos.getZ(), blockPos2.getZ());
        final int max3 = Math.max(blockPos.getZ(), blockPos2.getZ());
        Class2025.Field17312.Method7491(new Class1079((Class686)new Class1885(Class292.Method1527(s2), (short)(Math.abs(max - min) + 1), (short)(Math.abs(max2 - min2) + 1), (short)(Math.abs(max3 - min3) + 1), entityPlayer.getName()), entityPlayer, world, new File(parent, child), s, min, max, min2, max2, min3, max3));
        return true;
    }
    
    public abstract boolean Method417(final EntityPlayer p0, final File p1, final String p2);
    
    public abstract boolean Method418(final EntityPlayer p0);
    
    public abstract File Method419(final EntityPlayer p0, final boolean p1);
    
    private static String Method420(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4AA5 ^ 0x37));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
