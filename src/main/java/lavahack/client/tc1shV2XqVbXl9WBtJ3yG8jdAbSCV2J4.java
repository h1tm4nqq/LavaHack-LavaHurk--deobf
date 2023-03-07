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

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
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

public class tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8860 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Smart", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-2027295011 ^ (long)-2027295011)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8861 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("EnemyCheck", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-947832599 ^ (long)-947832600)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8862 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("EnemyRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble((long)20526296 ^ 0x40180000013934D8L), Double.longBitsToDouble(0xF681177F4561AC05L ^ 0xB6AF177F4561AC05L), (boolean)((long)2008729158 ^ (long)2008729158)).Method313(this.Field8861::Method365));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8863 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("IgnoreFriends", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)924015095L ^ 0x371359F6) != 0).Method313(this.Field8861::Method365));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8864 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SurroundCheck", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1158380726L ^ 0xBAF4834A) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8865 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Terrain", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-836310092 ^ (long)-836310092)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8866 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Color", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)1797402242 ^ (long)1797402237), (int)1782730942L ^ 0x6A425041, (int)-1796735609L ^ 0x94E7FD78)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8867 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color1", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Color1", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)1242974623L ^ 0x4A164960, (int)((long)1876918419 ^ (long)1876918380), (int)((long)-1502547996 ^ (long)-1502548197))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8868;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8869;
    private final List Field8870;
    private String Field8871 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4() {
        super("SelfCityESP", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
        String[] stringArray = new String[(int)((long)-1646236405 ^ (long)-1646236402)];
        stringArray[(int)-1047924520L ^ 0xC189F0D8] = "Box";
        stringArray[(int)((long)-296619229 ^ (long)-296619230)] = "Outline";
        stringArray[(int)((long)964404368 ^ (long)964404369) << 1] = "Both";
        stringArray[(int)((long)-448372883 ^ (long)-448372882)] = "Gradient";
        stringArray[(int)((long)-624157739 ^ (long)-624157740) << 2] = "Glow";
        this.Field8868 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RenderMode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Both", Arrays.asList(stringArray)));
        this.Field8869 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("LineWidth", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x64D4241EBEB5A601L ^ 0x24D4241EBEB5A601L), 1.0, Double.longBitsToDouble((long)1534340308 ^ 0x401400005B742CD4L), (boolean)((long)-584679075 ^ (long)-584679075)));
        this.Field8870 = new ArrayList();
    }

    @Override
    public void Method45() {
        if (tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
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
        if (tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
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
            var4_4 = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3447(new AxisAlignedBB(var3_3));
            var5_5 = this.Field8868.Method359();
            var6_6 = (int)((long)1653245168 ^ (long)-1653245169);
            switch (var5_5.hashCode()) {
                case 66987: {
                    if (!var5_5.equals("Box")) ** GOTO lbl7
                    var6_6 = (int)-1925324520L ^ -1925324520;
                    break;
                }
                case 558407714: {
                    if (!var5_5.equals("Outline")) ** GOTO lbl7
                    var6_6 = (int)((long)-2045880304 ^ (long)-2045880303);
                    break;
                }
                case 0x1FAFA1: {
                    if (!var5_5.equals("Both")) ** GOTO lbl7
                    var6_6 = (int)((long)-978193427 ^ (long)-978193428) << 1;
                    break;
                }
                case 154295120: {
                    if (!var5_5.equals("Gradient")) ** GOTO lbl7
                    var6_6 = (int)((long)317099055 ^ (long)317099052);
                    continue block6;
                }
            }
        }
    }

    public boolean Method1171() {
        EntityPlayer entityPlayer;
        double d = this.Field8862.Method367() * this.Field8862.Method367();
        Iterator iterator = tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities.iterator();
        do {
            if (!iterator.hasNext()) return ((int)46593204L ^ 0x2C6F4B4) != 0;
            entityPlayer = (EntityPlayer)iterator.next();
        } while (!this.Field8863.Method365() && n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086.Method3043(entityPlayer.getName()) || !(entityPlayer.getDistanceSq((Entity)tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) <= d));
        return ((int)-1665374745L ^ 0x9CBC65E6) != 0;
    }

    public void Method1172() {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        BlockPos blockPos = new BlockPos(tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        BlockPos blockPos2 = blockPos.north();
        if (this.Method1175(blockPos2).getBlock() != Blocks.BEDROCK && !this.Method1175(blockPos2).getBlock().isReplaceable((IBlockAccess)tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos2)) {
            bl5 = this.Method1173(blockPos2.west());
            bl4 = this.Method1173(blockPos2.north());
            bl3 = this.Method1173(blockPos2.east());
            bl2 = this.Method1173(blockPos2.west().north());
            bl = this.Method1173(blockPos2.east().north());
            if (bl5 || bl4 || bl3 || bl2 || bl) {
                this.Field8870.add(blockPos2);
            }
        }
        if (this.Method1175(blockPos2 = blockPos.east()).getBlock() != Blocks.BEDROCK && !this.Method1175(blockPos2).getBlock().isReplaceable((IBlockAccess)tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos2)) {
            bl5 = this.Method1173(blockPos2.north());
            bl4 = this.Method1173(blockPos2.east());
            bl3 = this.Method1173(blockPos2.south());
            bl2 = this.Method1173(blockPos2.north().east());
            bl = this.Method1173(blockPos2.south().east());
            if (bl5 || bl4 || bl3 || bl2 || bl) {
                this.Field8870.add(blockPos2);
            }
        }
        if (this.Method1175(blockPos2 = blockPos.south()).getBlock() != Blocks.BEDROCK && !this.Method1175(blockPos2).getBlock().isReplaceable((IBlockAccess)tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos2)) {
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
        if (this.Method1175(blockPos2).getBlock().isReplaceable((IBlockAccess)tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos2)) {
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
        int n;
        IBlockState iBlockState = tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
        if (!iBlockState.getBlock().isReplaceable((IBlockAccess)tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            return ((int)-2093811246L ^ 0x8332F9D2) != 0;
        }
        IBlockState iBlockState2 = tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.down());
        Block block = iBlockState2.getBlock();
        int n2 = block == Blocks.OBSIDIAN || block == Blocks.BEDROCK ? (int)((long)356347567 ^ (long)356347566) : (int)((long)-823252385 ^ (long)-823252385);
        IBlockState iBlockState3 = tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.up());
        if (iBlockState3.getBlock() == Blocks.AIR) {
            n = (int)((long)97098692 ^ (long)97098693);
            return n != 0;
        }
        n = (int)-173569856L ^ 0xF5A788C0;
        return n != 0;
    }

    public boolean Method28() {
        BlockPos blockPos = new BlockPos(tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        BlockPos blockPos2 = blockPos.north();
        if (this.Method1174(blockPos2)) {
            return (int)((long)-182702227 ^ (long)-182702227) != 0;
        }
        blockPos2 = blockPos.east();
        if (this.Method1174(blockPos2)) {
            return (int)((long)-739264328 ^ (long)-739264328) != 0;
        }
        blockPos2 = blockPos.south();
        if (this.Method1174(blockPos2)) {
            return (int)((long)811608835 ^ (long)811608835) != 0;
        }
        blockPos2 = blockPos.west();
        if (!this.Method1174(blockPos2)) return (int)((long)-306054587 ^ (long)-306054588) != 0;
        return (int)((long)-1110537521 ^ (long)-1110537521) != 0;
    }

    public boolean Method1174(BlockPos blockPos) {
        int n;
        if (this.Field8865.Method365()) {
            return this.Method1175(blockPos).getBlock().isReplaceable((IBlockAccess)tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos);
        }
        if (this.Method1175(blockPos).getBlock() == Blocks.OBSIDIAN && this.Method1175(blockPos).getBlock() == Blocks.ENDER_CHEST && this.Method1175(blockPos).getBlock() == Blocks.BEDROCK) {
            n = (int)((long)-369386242 ^ (long)-369386242);
            return n != 0;
        }
        n = (int)((long)1569697962 ^ (long)1569697963);
        return n != 0;
    }

    public IBlockState Method1175(BlockPos blockPos) {
        return tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
    }

    public void Method1176() {
        double d;
        double d2 = tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
        double d3 = tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
        BlockPos blockPos = new BlockPos(tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        BlockPos blockPos2 = blockPos.north();
        if (!this.Method1177(blockPos2) && (d = this.Method1178(blockPos2.getZ(), d3)) > Double.longBitsToDouble((long)221356722 ^ 0x3FF4CCCCC1FD6E7FL)) {
            this.Field8870.add(blockPos2);
        }
        if (!this.Method1177(blockPos2 = blockPos.east()) && (d = this.Method1178(blockPos2.getX(), d2)) > Double.longBitsToDouble((long)910882938 ^ 0x3FF4CCCCFA8634B7L)) {
            this.Field8870.add(blockPos2);
        }
        if (!this.Method1177(blockPos2 = blockPos.south()) && (d = this.Method1178(blockPos2.getZ(), d3)) > Double.longBitsToDouble(0xE76BE550CD96FC26L ^ 0xD89F299C015A30EBL)) {
            this.Field8870.add(blockPos2);
        }
        if (this.Method1177(blockPos2 = blockPos.west())) {
            return;
        }
        d = this.Method1178(blockPos2.getX(), d2);
        if (!(d > Double.longBitsToDouble(0x66494D1027A4AA64L ^ 0x59BD81DCEB6866A9L))) return;
        this.Field8870.add(blockPos2);
    }

    public boolean Method1177(BlockPos blockPos) {
        return this.Method1175(blockPos).getBlock().isReplaceable((IBlockAccess)tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos);
    }

    public double Method1178(double d, double d2) {
        return Math.abs(d - d2);
    }

    public boolean Method1179(BlockPos blockPos) {
        return tc1shV2XqVbXl9WBtJ3yG8jdAbSCV2J4.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(EntityPlayer.class, new AxisAlignedBB(blockPos)).isEmpty();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)921464885L ^ 0x36EC7035;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1953961780 ^ (long)-1953961933);
            int n2 = ((int)-38622033L ^ 0xFDB2ACCE) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)322312818L ^ 0x13360BB9) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

