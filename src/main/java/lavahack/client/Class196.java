//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class726;
import lavahack.client.Class815;
import lavahack.client.Class97;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class196
extends Class42 {
    private final Class44 Field8860 = this.Method23(new Class44("Smart", (Class42)this, false));
    private final Class44 Field8861 = this.Method23(new Class44("EnemyCheck", (Class42)this, true));
    private final Class44 Field8862 = this.Method23(new Class44("EnemyRange", (Class42)this, 1.0, Double.longBitsToDouble((long)20526296 ^ 0x40180000013934D8L), Double.longBitsToDouble(4624633867356078080L), false).Method313(this.Field8861::Method365));
    private final Class44 Field8863 = this.Method23(new Class44("IgnoreFriends", (Class42)this, true).Method313(this.Field8861::Method365));
    private final Class44 Field8864 = this.Method23(new Class44("SurroundCheck", (Class42)this, false));
    private final Class44 Field8865 = this.Method23(new Class44("Terrain", (Class42)this, false));
    private final Class44 Field8866 = this.Method23(new Class44("Color", (Class42)this, "Color", new Class2027(255, 255, 255)));
    private final Class44 Field8867 = this.Method23(new Class44("Color1", (Class42)this, "Color1", new Class2027(255, 255, 255)));
    private final Class44 Field8868 = this.Method23(new Class44("RenderMode", (Class42)this, "Both", Arrays.asList("Box", "Outline", "Both", "Gradient", "Glow")));
    private final Class44 Field8869 = this.Method23(new Class44("LineWidth", (Class42)this, Double.longBitsToDouble(0x4000000000000000L), 1.0, Double.longBitsToDouble((long)1534340308 ^ 0x401400005B742CD4L), false));
    private final List Field8870 = new ArrayList();
    private String Field8871 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class196() {
        super("SelfCityESP", Class97.Field8342);
    }

    @Override
    public void Method45() {
        if (Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        this.Field8870.clear();
        if (this.Field8861.Method365() && !this.Method1171()) {
            return;
        }
        if (this.Field8864.Method365() && !this.Method28()) {
            return;
        }
        if (this.Field8860.Method365()) {
            this.Method1172();
            return;
        }
        this.Method1176();
    }

    /*
     * Unable to fully structure code
     */
    @SubscribeEvent
    @SubscribeEvent
    public void Method1170(RenderWorldLastEvent var1_1) {
        if (Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        var2_2 = this.Field8870.iterator();
lbl7:
        // 7 sources

        block6: while (var2_2.hasNext() != false) {
            var3_3 = (BlockPos)var2_2.next();
            var4_4 = Class815.Method3447(new AxisAlignedBB(var3_3));
            var5_5 = this.Field8868.Method359();
            var6_6 = -1;
            switch (var5_5.hashCode()) {
                case 66987: {
                    if (!var5_5.equals("Box")) ** GOTO lbl7
                    var6_6 = 0;
                    break;
                }
                case 558407714: {
                    if (!var5_5.equals("Outline")) ** GOTO lbl7
                    var6_6 = 1;
                    break;
                }
                case 0x1FAFA1: {
                    if (!var5_5.equals("Both")) ** GOTO lbl7
                    var6_6 = 2;
                    break;
                }
                case 154295120: {
                    if (!var5_5.equals("Gradient")) ** GOTO lbl7
                    var6_6 = 3;
                    continue block6;
                }
            }
        }
    }

    public boolean Method1171() {
        EntityPlayer entityPlayer;
        double d = this.Field8862.Method367() * this.Field8862.Method367();
        Iterator iterator = Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities.iterator();
        do {
            if (!iterator.hasNext()) return false;
            entityPlayer = (EntityPlayer)iterator.next();
        } while (!this.Field8863.Method365() && Class726.Field11086.Method3043(entityPlayer.getName()) || !(entityPlayer.getDistanceSq((Entity)Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) <= d));
        return true;
    }

    public void Method1172() {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        BlockPos blockPos = new BlockPos(Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        BlockPos blockPos2 = blockPos.north();
        if (this.Method1175(blockPos2).getBlock() != Blocks.BEDROCK && !this.Method1175(blockPos2).getBlock().isReplaceable((IBlockAccess)Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos2)) {
            bl5 = this.Method1173(blockPos2.west());
            bl4 = this.Method1173(blockPos2.north());
            bl3 = this.Method1173(blockPos2.east());
            bl2 = this.Method1173(blockPos2.west().north());
            bl = this.Method1173(blockPos2.east().north());
            if (bl5 || bl4 || bl3 || bl2 || bl) {
                this.Field8870.add(blockPos2);
            }
        }
        if (this.Method1175(blockPos2 = blockPos.east()).getBlock() != Blocks.BEDROCK && !this.Method1175(blockPos2).getBlock().isReplaceable((IBlockAccess)Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos2)) {
            bl5 = this.Method1173(blockPos2.north());
            bl4 = this.Method1173(blockPos2.east());
            bl3 = this.Method1173(blockPos2.south());
            bl2 = this.Method1173(blockPos2.north().east());
            bl = this.Method1173(blockPos2.south().east());
            if (bl5 || bl4 || bl3 || bl2 || bl) {
                this.Field8870.add(blockPos2);
            }
        }
        if (this.Method1175(blockPos2 = blockPos.south()).getBlock() != Blocks.BEDROCK && !this.Method1175(blockPos2).getBlock().isReplaceable((IBlockAccess)Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos2)) {
            bl5 = this.Method1173(blockPos2.east());
            bl4 = this.Method1173(blockPos2.south());
            bl3 = this.Method1173(blockPos2.west());
            bl2 = this.Method1173(blockPos2.east().south());
            bl = this.Method1173(blockPos2.west().south());
            if (bl5 || bl4 || bl3 || bl2 || bl) {
                this.Field8870.add(blockPos2);
            }
        }
        if (this.Method1175(blockPos2 = blockPos.west()).getBlock() == Blocks.BEDROCK) {
            return;
        }
        if (this.Method1175(blockPos2).getBlock().isReplaceable((IBlockAccess)Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos2)) {
            return;
        }
        bl5 = this.Method1173(blockPos2.south());
        bl4 = this.Method1173(blockPos2.west());
        bl3 = this.Method1173(blockPos2.north());
        bl2 = this.Method1173(blockPos2.south().west());
        bl = this.Method1173(blockPos2.north().west());
        if (!(bl5 || bl4 || bl3 || bl2)) {
            if (!bl) return;
        }
        this.Field8870.add(blockPos2);
    }

    public boolean Method1173(BlockPos blockPos) {
        IBlockState iBlockState = Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
        if (!iBlockState.getBlock().isReplaceable((IBlockAccess)Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            return false;
        }
        IBlockState iBlockState2 = Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.down());
        Block block = iBlockState2.getBlock();
        boolean bl = block == Blocks.OBSIDIAN || block == Blocks.BEDROCK;
        IBlockState iBlockState3 = Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.up());
        if (iBlockState3.getBlock() != Blocks.AIR) return false;
        return true;
    }

    public boolean Method28() {
        BlockPos blockPos = new BlockPos(Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        BlockPos blockPos2 = blockPos.north();
        if (this.Method1174(blockPos2)) {
            return false;
        }
        blockPos2 = blockPos.east();
        if (this.Method1174(blockPos2)) {
            return false;
        }
        blockPos2 = blockPos.south();
        if (this.Method1174(blockPos2)) {
            return false;
        }
        blockPos2 = blockPos.west();
        if (!this.Method1174(blockPos2)) return true;
        return false;
    }

    public boolean Method1174(BlockPos blockPos) {
        if (this.Field8865.Method365()) {
            return this.Method1175(blockPos).getBlock().isReplaceable((IBlockAccess)Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos);
        }
        if (this.Method1175(blockPos).getBlock() != Blocks.OBSIDIAN) return true;
        if (this.Method1175(blockPos).getBlock() != Blocks.ENDER_CHEST) return true;
        if (this.Method1175(blockPos).getBlock() != Blocks.BEDROCK) return true;
        return false;
    }

    public IBlockState Method1175(BlockPos blockPos) {
        return Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
    }

    public void Method1176() {
        double d;
        double d2 = Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
        double d3 = Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
        BlockPos blockPos = new BlockPos(Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        BlockPos blockPos2 = blockPos.north();
        if (!this.Method1177(blockPos2) && (d = this.Method1178(blockPos2.getZ(), d3)) > Double.longBitsToDouble((long)221356722 ^ 0x3FF4CCCCC1FD6E7FL)) {
            this.Field8870.add(blockPos2);
        }
        if (!this.Method1177(blockPos2 = blockPos.east()) && (d = this.Method1178(blockPos2.getX(), d2)) > Double.longBitsToDouble((long)910882938 ^ 0x3FF4CCCCFA8634B7L)) {
            this.Field8870.add(blockPos2);
        }
        if (!this.Method1177(blockPos2 = blockPos.south()) && (d = this.Method1178(blockPos2.getZ(), d3)) > Double.longBitsToDouble(4608533498688228557L)) {
            this.Field8870.add(blockPos2);
        }
        if (this.Method1177(blockPos2 = blockPos.west())) {
            return;
        }
        d = this.Method1178(blockPos2.getX(), d2);
        if (!(d > Double.longBitsToDouble(4608533498688228557L))) return;
        this.Field8870.add(blockPos2);
    }

    public boolean Method1177(BlockPos blockPos) {
        return this.Method1175(blockPos).getBlock().isReplaceable((IBlockAccess)Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos);
    }

    public double Method1178(double d, double d2) {
        return Math.abs(d - d2);
    }

    public boolean Method1179(BlockPos blockPos) {
        return Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(EntityPlayer.class, new AxisAlignedBB(blockPos)).isEmpty();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 194;
            cArray2[n] = (char)(cArray[n] ^ (0x472C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

