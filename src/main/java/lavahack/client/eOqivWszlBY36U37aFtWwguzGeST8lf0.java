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
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.event.RenderWorldLastEvent;

public class eOqivWszlBY36U37aFtWwguzGeST8lf0
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10569 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("EnemyRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1157185045 ^ 0x4020000044F93E15L), 1.0, Double.longBitsToDouble((long)337895140 ^ 0x402E00001423DEE4L), (boolean)((long)1998194363 ^ (long)1998194363)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10570 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CircleRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x8E661F4A30324B0FL ^ 0xCE661F4A30324B0FL), 1.0, Double.longBitsToDouble(0xB20CF4CBD8B720E9L ^ 0xF218F4CBD8B720E9L), ((int)308904125L ^ 0x126980BD) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10571 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SinglePlace", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-518281873L ^ 0xE11BA56E) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10572 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)983682206L ^ 0x3AA1CC9E) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10573 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-562642509L ^ 0xDE76C1B3) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10574;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10575;
    private static eOqivWszlBY36U37aFtWwguzGeST8lf0 Field10576;
    private List Field10577;
    private BlockPos Field10578;
    private int Field10579;

    public eOqivWszlBY36U37aFtWwguzGeST8lf0() {
        super("AutoObsidian", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        String[] stringArray = new String[(int)-412723822L ^ 0xE7665591];
        stringArray[(int)((long)384384057 ^ (long)384384057)] = "Normal";
        stringArray[(int)2140343204L ^ 0x7F930BA5] = "Silent";
        stringArray[((int)1484321373L ^ 0x5878F25C) << 1] = "Packet";
        this.Field10574 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Switch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Silent", Arrays.asList(stringArray)));
        this.Field10575 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("UpdateController", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)685377588L ^ 0x28DA0834) != 0));
        this.Field10577 = new ArrayList();
        this.Field10578 = null;
        Field10576 = this;
    }

    @Override
    public boolean Method52() {
        return (int)((long)1538855906 ^ (long)1538855907) != 0;
    }

    @Override
    public void Method45() {
        if (eOqivWszlBY36U37aFtWwguzGeST8lf0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (eOqivWszlBY36U37aFtWwguzGeST8lf0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        this.Field10577.clear();
        int n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127(Blocks.OBSIDIAN);
        if (n == (int)((long)1044925072 ^ (long)-1044925073)) {
            return;
        }
        int n2 = eOqivWszlBY36U37aFtWwguzGeST8lf0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        EntityPlayer entityPlayer = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1924(this.Field10569.Method368());
        if (entityPlayer == null) {
            return;
        }
        List list = eOqivWszlBY36U37aFtWwguzGeST8lf0.Method2610((Entity)entityPlayer);
        if (list.isEmpty()) {
            this.Field10578 = null;
            return;
        }
        if (this.Field10571.Method365() && this.Field10578 == list.get((int)((long)-1253672368 ^ (long)-1253672368))) {
            return;
        }
        this.Method2608(n, (boolean)((long)-2088147037 ^ (long)-2088147037));
        if (this.Field10571.Method365()) {
            h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4207((BlockPos)list.get((int)((long)-595978189 ^ (long)-595978189)), EnumHand.MAIN_HAND, this.Field10572.Method365(), this.Field10573.Method365(), ((int)-1097577527L ^ 0xBE944BC9) != 0);
            this.Field10578 = (BlockPos)list.get((int)((long)-303667540 ^ (long)-303667540));
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5506().Method1886(this.Field10578.getX() + " " + this.Field10578.getY() + " " + this.Field10578.getZ());
        } else {
            for (BlockPos blockPos : list) {
                h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4207(blockPos, EnumHand.MAIN_HAND, this.Field10572.Method365(), this.Field10573.Method365(), (boolean)((long)-2143081717 ^ (long)-2143081717));
            }
            this.Field10578 = null;
        }
        this.Method2608(n2, ((int)-207435278L ^ 0xF3A2C9F3) != 0);
        this.Field10577 = list;
    }

    public BlockPos Method2607(int n) {
        return (BlockPos)this.Field10577.get(n);
    }

    /*
     * Exception decompiling
     */
    public void Method2608(int var1_1, boolean var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getInt(SwitchStringRewriter.java:417)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$700(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at the.bytecode.club.bytecodeviewer.decompilers.impl.CFRDecompiler.decompileToZip(CFRDecompiler.java:306)
         *     at the.bytecode.club.bytecodeviewer.resources.ResourceDecompiling.decompileSaveAll(ResourceDecompiling.java:262)
         *     at the.bytecode.club.bytecodeviewer.resources.ResourceDecompiling.lambda$decompileSaveAll$0(ResourceDecompiling.java:127)
         *     at java.base/java.lang.Thread.run(Thread.java:833)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void Method2609(RenderWorldLastEvent renderWorldLastEvent) {
        if (eOqivWszlBY36U37aFtWwguzGeST8lf0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (eOqivWszlBY36U37aFtWwguzGeST8lf0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        if (this.Field10577.isEmpty()) {
            return;
        }
        AxisAlignedBB axisAlignedBB = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3447(new AxisAlignedBB((BlockPos)this.Field10577.get((int)((long)-1134259722 ^ (long)-1134259722))));
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3446(axisAlignedBB, 2.0f, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)-2020308072L ^ 0x87948B67, (int)((long)-2133696941 ^ (long)-2133696852), (int)((long)-1292072046 ^ (long)-1292072083), (int)((long)689229902 ^ (long)689229889) << 3), exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17214);
    }

    public static List Method2610(Entity entity) {
        List list = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1946(new BlockPos(entity.posX, entity.posY, entity.posZ), eOqivWszlBY36U37aFtWwguzGeST8lf0.Field10576.Field10570.Method368(), (int)((long)-1100202212 ^ (long)-1100202211), (boolean)((long)-765597161 ^ (long)-765597161), (boolean)((long)-988509448 ^ (long)-988509448), (int)((long)2132127290 ^ (long)-2132127291));
        return list.stream().filter(arg_0 -> eOqivWszlBY36U37aFtWwguzGeST8lf0.Method2613(entity, arg_0)).sorted((arg_0, arg_1) -> eOqivWszlBY36U37aFtWwguzGeST8lf0.Method2612(entity, arg_0, arg_1)).collect(Collectors.toList());
    }

    public static boolean Method2611(BlockPos blockPos, Entity entity) {
        if (eOqivWszlBY36U37aFtWwguzGeST8lf0.Field10576.Field10571.Method365() && !eOqivWszlBY36U37aFtWwguzGeST8lf0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(entity.getClass(), new AxisAlignedBB(blockPos.up())).isEmpty()) {
            return ((int)-943476987L ^ 0xC7C3AF05) != 0;
        }
        IBlockState iBlockState = eOqivWszlBY36U37aFtWwguzGeST8lf0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
        if (!iBlockState.getBlock().isReplaceable((IBlockAccess)eOqivWszlBY36U37aFtWwguzGeST8lf0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            return (int)((long)-1123753711 ^ (long)-1123753711) != 0;
        }
        if (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4213(blockPos).isEmpty()) {
            return ((int)2109651134L ^ 0x7DBEB8BE) != 0;
        }
        IBlockState iBlockState2 = eOqivWszlBY36U37aFtWwguzGeST8lf0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.up());
        Block block = iBlockState2.getBlock();
        int n = block == Blocks.AIR ? (int)349049390L ^ 0x14CE122F : (int)((long)1497468463 ^ (long)1497468463);
        IBlockState iBlockState3 = eOqivWszlBY36U37aFtWwguzGeST8lf0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.up((int)((long)-532500773 ^ (long)-532500774) << 1));
        if (iBlockState3.getBlock() != Blocks.AIR) return (int)((long)-1451194727 ^ (long)-1451194727) != 0;
        return (int)((long)-1451194727 ^ (long)-1451194727) != 0;
    }

    private static int Method2612(Entity entity, BlockPos blockPos, BlockPos blockPos2) {
        double d = entity.getDistanceSq((double)blockPos.getX() + Double.longBitsToDouble((long)1573238378 ^ 0x3FE000005DC5B66AL), (double)blockPos.getY() + Double.longBitsToDouble(0xCAA8B7B84D7EAC16L ^ 0xF548B7B84D7EAC16L), (double)blockPos.getZ() + Double.longBitsToDouble(0xB4422EDB20485BF1L ^ 0x8BA22EDB20485BF1L));
        double d2 = entity.getDistanceSq((double)blockPos2.getX() + Double.longBitsToDouble((long)1206896399 ^ 0x3FE0000047EFC70FL), (double)blockPos2.getY() + Double.longBitsToDouble((long)1389773518 ^ 0x3FE0000052D642CEL), (double)blockPos2.getZ() + Double.longBitsToDouble((long)1763335437 ^ 0x3FE00000691A5D0DL));
        return Double.compare(d, d2);
    }

    private static boolean Method2613(Entity entity, BlockPos blockPos) {
        return eOqivWszlBY36U37aFtWwguzGeST8lf0.Method2611(blockPos, entity);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)23851848L ^ 0x16BF348;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)922619274 ^ (long)922619253);
            int n2 = (int)837304266L ^ 0x31E83FA3;
            cArray2[n] = (char)(cArray[n] ^ ((int)-725135586L ^ 0xD4C72675 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

