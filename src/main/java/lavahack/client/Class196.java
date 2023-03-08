//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import com.kisman.cc.util.*;
import net.minecraftforge.client.event.*;
import net.minecraft.util.math.*;
import java.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import net.minecraft.init.*;
import net.minecraft.world.*;
import net.minecraft.block.*;
import net.minecraft.block.state.*;

public class Class196 extends Class42
{
    private final Class44 Field8860;
    private final Class44 Field8861;
    private final Class44 Field8862;
    private final Class44 Field8863;
    private final Class44 Field8864;
    private final Class44 Field8865;
    private final Class44 Field8866;
    private final Class44 Field8867;
    private final Class44 Field8868;
    private final Class44 Field8869;
    private final List Field8870;
    private String Field8871 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class196() {
        super("SelfCityESP", Class97.Field8342);
        this.Field8860 = this.Method23(new Class44("Smart", this, false));
        this.Field8861 = this.Method23(new Class44("EnemyCheck", this, true));
        this.Field8862 = this.Method23(new Class44("EnemyRange", this, 1.0, Double.longBitsToDouble((long)20526296 ^ 0x40180000013934D8L), Double.longBitsToDouble(4624633867356078080L), false).Method313(this.Field8861::Method365));
        this.Field8863 = this.Method23(new Class44("IgnoreFriends", this, true).Method313(this.Field8861::Method365));
        this.Field8864 = this.Method23(new Class44("SurroundCheck", this, false));
        this.Field8865 = this.Method23(new Class44("Terrain", this, false));
        this.Field8866 = this.Method23(new Class44("Color", this, "Color", new Class2027(255, 255, 255)));
        this.Field8867 = this.Method23(new Class44("Color1", this, "Color1", new Class2027(255, 255, 255)));
        this.Field8868 = this.Method23(new Class44("RenderMode", this, "Both", Arrays.asList("Box", "Outline", "Both", "Gradient", "Glow")));
        this.Field8869 = this.Method23(new Class44("LineWidth", this, Double.longBitsToDouble(4611686018427387904L), 1.0, Double.longBitsToDouble((long)1534340308 ^ 0x401400005B742CD4L), false));
        this.Field8870 = new ArrayList();
    }
    
    @Override
    public void Method45() {
        if (Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
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
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method1170(final RenderWorldLastEvent renderWorldLastEvent) {
        if (Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        final Iterator<BlockPos> iterator = this.Field8870.iterator();
        while (iterator.hasNext()) {
            Class815.Method3447(new AxisAlignedBB((BlockPos)iterator.next()));
            final String method359 = this.Field8868.Method359();
            switch (method359.hashCode()) {
                case 66987: {
                    if (method359.equals("Box")) {
                        continue;
                    }
                    continue;
                }
                case 558407714: {
                    if (method359.equals("Outline")) {
                        continue;
                    }
                    continue;
                }
                case 2076577: {
                    if (method359.equals("Both")) {
                        continue;
                    }
                    continue;
                }
                case 154295120: {
                    if (method359.equals("Gradient")) {
                        continue;
                    }
                    continue;
                }
            }
        }
    }
    
    public boolean Method1171() {
        final double n = this.Field8862.Method367() * this.Field8862.Method367();
        for (final EntityPlayer entityPlayer : Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities) {
            if (!this.Field8863.Method365() && Class726.Field11086.Method3043(entityPlayer.getName())) {
                continue;
            }
            if (entityPlayer.getDistanceSq((Entity)Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) <= n) {
                return true;
            }
        }
        return false;
    }
    
    public void Method1172() {
        final BlockPos blockPos = new BlockPos(Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        final BlockPos north = blockPos.north();
        if (this.Method1175(north).getBlock() != Blocks.BEDROCK) {
            if (!this.Method1175(north).getBlock().isReplaceable((IBlockAccess)Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, north)) {
                final boolean method1173 = this.Method1173(north.west());
                final boolean method1174 = this.Method1173(north.north());
                final boolean method1175 = this.Method1173(north.east());
                final boolean method1176 = this.Method1173(north.west().north());
                final boolean method1177 = this.Method1173(north.east().north());
                if (method1173 || method1174 || method1175 || method1176 || method1177) {
                    this.Field8870.add(north);
                }
            }
        }
        final BlockPos east = blockPos.east();
        if (this.Method1175(east).getBlock() != Blocks.BEDROCK) {
            if (!this.Method1175(east).getBlock().isReplaceable((IBlockAccess)Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, east)) {
                final boolean method1178 = this.Method1173(east.north());
                final boolean method1179 = this.Method1173(east.east());
                final boolean method1180 = this.Method1173(east.south());
                final boolean method1181 = this.Method1173(east.north().east());
                final boolean method1182 = this.Method1173(east.south().east());
                if (method1178 || method1179 || method1180 || method1181 || method1182) {
                    this.Field8870.add(east);
                }
            }
        }
        final BlockPos south = blockPos.south();
        if (this.Method1175(south).getBlock() != Blocks.BEDROCK) {
            if (!this.Method1175(south).getBlock().isReplaceable((IBlockAccess)Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, south)) {
                final boolean method1183 = this.Method1173(south.east());
                final boolean method1184 = this.Method1173(south.south());
                final boolean method1185 = this.Method1173(south.west());
                final boolean method1186 = this.Method1173(south.east().south());
                final boolean method1187 = this.Method1173(south.west().south());
                if (method1183 || method1184 || method1185 || method1186 || method1187) {
                    this.Field8870.add(south);
                }
            }
        }
        final BlockPos west = blockPos.west();
        if (this.Method1175(west).getBlock() != Blocks.BEDROCK) {
            if (!this.Method1175(west).getBlock().isReplaceable((IBlockAccess)Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, west)) {
                final boolean method1188 = this.Method1173(west.south());
                final boolean method1189 = this.Method1173(west.west());
                final boolean method1190 = this.Method1173(west.north());
                final boolean method1191 = this.Method1173(west.south().west());
                final boolean method1192 = this.Method1173(west.north().west());
                if (method1188 || method1189 || method1190 || method1191 || method1192) {
                    this.Field8870.add(west);
                }
            }
        }
    }
    
    public boolean Method1173(final BlockPos blockPos) {
        if (!Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            return false;
        }
        final Block getBlock = Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.down()).getBlock();
        final boolean b = getBlock == Blocks.OBSIDIAN || getBlock == Blocks.BEDROCK;
        return Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.up()).getBlock() == Blocks.AIR;
    }
    
    public boolean Method28() {
        final BlockPos blockPos = new BlockPos(Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        return !this.Method1174(blockPos.north()) && !this.Method1174(blockPos.east()) && !this.Method1174(blockPos.south()) && !this.Method1174(blockPos.west());
    }
    
    public boolean Method1174(final BlockPos blockPos) {
        if (this.Field8865.Method365()) {
            return this.Method1175(blockPos).getBlock().isReplaceable((IBlockAccess)Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos);
        }
        return this.Method1175(blockPos).getBlock() != Blocks.OBSIDIAN || this.Method1175(blockPos).getBlock() != Blocks.ENDER_CHEST || this.Method1175(blockPos).getBlock() != Blocks.BEDROCK;
    }
    
    public IBlockState Method1175(final BlockPos blockPos) {
        return Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
    }
    
    public void Method1176() {
        final double posX = Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
        final double posZ = Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
        final BlockPos blockPos = new BlockPos(Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        final BlockPos north = blockPos.north();
        if (!this.Method1177(north)) {
            if (this.Method1178(north.getZ(), posZ) > Double.longBitsToDouble((long)221356722 ^ 0x3FF4CCCCC1FD6E7FL)) {
                this.Field8870.add(north);
            }
        }
        final BlockPos east = blockPos.east();
        if (!this.Method1177(east)) {
            if (this.Method1178(east.getX(), posX) > Double.longBitsToDouble((long)910882938 ^ 0x3FF4CCCCFA8634B7L)) {
                this.Field8870.add(east);
            }
        }
        final BlockPos south = blockPos.south();
        if (!this.Method1177(south)) {
            if (this.Method1178(south.getZ(), posZ) > Double.longBitsToDouble(4608533498688228557L)) {
                this.Field8870.add(south);
            }
        }
        final BlockPos west = blockPos.west();
        if (!this.Method1177(west)) {
            if (this.Method1178(west.getX(), posX) > Double.longBitsToDouble(4608533498688228557L)) {
                this.Field8870.add(west);
            }
        }
    }
    
    public boolean Method1177(final BlockPos blockPos) {
        return this.Method1175(blockPos).getBlock().isReplaceable((IBlockAccess)Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos);
    }
    
    public double Method1178(final double n, final double n2) {
        return Math.abs(n - n2);
    }
    
    public boolean Method1179(final BlockPos blockPos) {
        return Class196.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)EntityPlayer.class, new AxisAlignedBB(blockPos)).isEmpty();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x472C ^ 0xC2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
