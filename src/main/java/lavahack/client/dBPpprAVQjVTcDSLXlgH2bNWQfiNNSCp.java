//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import com.kisman.cc.event.Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.RG0Ef4LzpvaRaWkCktLl94QMei9n80rd;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

public class dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public static dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp Field9930;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9931;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9932;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9933;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9934;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9935;
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field9936;
    public Set Field9937;
    private final Vec3d[] Field9938;
    private boolean Field9939;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field9940;
    private String Field9941 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp() {
        super("AntiTrap", "", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        String[] stringArray = new String[((int)-1542239685L ^ 0xA4134A3A) << 1];
        stringArray[(int)1105173858L ^ 0x41DF9D62] = "MotionTick";
        stringArray[(int)((long)1882227695 ^ (long)1882227694)] = "ClientTick";
        this.Field9931 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "MotionTick", Arrays.asList(stringArray)));
        this.Field9932 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)91924171 ^ 0x40790000057AA6CBL), 0.0, Double.longBitsToDouble(0x867F4E83E0DD2A0CL ^ 0xC6F00E83E0DD2A0CL), (boolean)((long)1015265775 ^ (long)1015265774)));
        this.Field9933 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SwitchMode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field9803));
        this.Field9934 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SortY", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1830726648 ^ (long)-1830726647)));
        this.Field9935 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("OnlyInHole", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)2111075558 ^ (long)2111075559)));
        this.Field9936 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
        this.Field9937 = new HashSet();
        Vec3d[] vec3dArray = new Vec3d[((int)368736973L ^ 0x15FA7ACC) << 4];
        vec3dArray[(int)((long)-980542524 ^ (long)-980542524)] = new Vec3d(1.0, 0.0, 0.0);
        vec3dArray[(int)((long)-81541286 ^ (long)-81541285)] = new Vec3d(0.0, 0.0, 1.0);
        vec3dArray[(int)((long)681381108 ^ (long)681381109) << 1] = new Vec3d(Double.longBitsToDouble(0x1DE12C934A4B1DB1L ^ 0xA2112C934A4B1DB1L), 0.0, 0.0);
        vec3dArray[(int)((long)153063521 ^ (long)153063522)] = new Vec3d(0.0, 0.0, Double.longBitsToDouble(0x514A9F731CF33727L ^ 0xEEBA9F731CF33727L));
        vec3dArray[((int)2004579652L ^ 0x777B7545) << 2] = new Vec3d(1.0, 0.0, Double.longBitsToDouble((long)1539705153 ^ 0xBFF000005BC60941L));
        vec3dArray[(int)1936361859L ^ 0x736A8986] = new Vec3d(1.0, 0.0, 1.0);
        vec3dArray[(int)((long)-1545712119 ^ (long)-1545712118) << 1] = new Vec3d(Double.longBitsToDouble((long)1528792970 ^ 0xBFF000005B1F878AL), 0.0, Double.longBitsToDouble((long)1674151981 ^ 0xBFF0000063C9882DL));
        vec3dArray[(int)368071030L ^ 0x15F05171] = new Vec3d(Double.longBitsToDouble(0x70467DBA3ECB911EL ^ 0xCFB67DBA3ECB911EL), 0.0, 1.0);
        vec3dArray[((int)340253174L ^ 0x1447D9F7) << 3] = new Vec3d(1.0, 1.0, 0.0);
        vec3dArray[(int)((long)1569454976 ^ (long)1569454985)] = new Vec3d(0.0, 1.0, 1.0);
        vec3dArray[((int)419475030L ^ 0x1900AE53) << 1] = new Vec3d(Double.longBitsToDouble((long)1439886290 ^ 0xBFF0000055D2EBD2L), 1.0, 0.0);
        vec3dArray[(int)-814295866L ^ 0xCF76D4CD] = new Vec3d(0.0, 1.0, Double.longBitsToDouble(0xBB4218A715CB8D42L ^ 0x4B218A715CB8D42L));
        vec3dArray[(int)((long)-1776392070 ^ (long)-1776392071) << 2] = new Vec3d(1.0, 1.0, Double.longBitsToDouble((long)1698094988 ^ 0xBFF000006536DF8CL));
        vec3dArray[(int)((long)-1550876231 ^ (long)-1550876236)] = new Vec3d(1.0, 1.0, 1.0);
        vec3dArray[((int)1063035204L ^ 0x3F5CA143) << 1] = new Vec3d(Double.longBitsToDouble((long)1808939599 ^ 0xBFF000006BD23A4FL), 1.0, Double.longBitsToDouble(0xC1CF6159BF0F081AL ^ 0x7E3F6159BF0F081AL));
        vec3dArray[(int)999953024L ^ 0x3B9A128F] = new Vec3d(Double.longBitsToDouble((long)1258182371 ^ 0xBFF000004AFE56E3L), 1.0, 1.0);
        this.Field9938 = vec3dArray;
        this.Field9939 = (int)-727887417L ^ 0xD49D51C7;
        this.Field9940 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method2182, new Predicate[(int)((long)-1737622583 ^ (long)-1737622583)]);
        super.Method44(this::Method2183);
        Field9930 = this;
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field9940);
        if (dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null) return;
        if (dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) return;
        super.Method21(((int)-495265794L ^ 0xE27AD7FE) != 0);
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field9940);
        if (dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Method27();
    }

    @Override
    public void Method45() {
        if (dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (!this.Field9931.Method309("ClientTick")) return;
        this.Method20();
    }

    private void Method20() {
        Vec3d vec3d;
        BlockPos blockPos;
        if (!this.Field9936.Method2797(this.Field9932.Method335())) return;
        this.Field9936.Method2801();
        if (this.Field9935.Method365() && !this.Method2179(dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPosition())) {
            return;
        }
        this.Field9939 = dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() == Items.END_CRYSTAL ? (int)1357095165L ^ 0x50E3A0FC : (int)((long)-10091247 ^ (long)-10091247);
        int n = this.Field9939 ? 1 : 0;
        if (!this.Field9939 && lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method116(Items.END_CRYSTAL, (int)1004348230L ^ 0x3BDD2346, (int)365692451L ^ 0x15CC062A) == ((int)643762223L ^ 0xD9A0F7D0)) {
            return;
        }
        ArrayList<Vec3d> arrayList = new ArrayList<Vec3d>();
        Collections.addAll(arrayList, h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4192(dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector(), this.Field9938));
        EntityPlayer entityPlayer = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1924(Float.intBitsToFloat((int)((long)2126565424 ^ (long)1046532144)));
        if (entityPlayer != null) {
            arrayList.sort(dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp::Method2181);
            if (this.Field9934.Method365()) {
                arrayList.sort(Comparator.comparingDouble(dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp::Method2180));
            }
        }
        Iterator iterator = arrayList.iterator();
        do {
            if (!iterator.hasNext()) return;
        } while (!vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7754(blockPos = new BlockPos(vec3d = (Vec3d)iterator.next())));
        this.Method2178(blockPos);
        super.Method39();
    }

    private void Method2178(BlockPos blockPos) {
        int n = dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() == Items.END_CRYSTAL ? (int)((long)-2096234851 ^ (long)-2096234852) : (int)((long)-41844247 ^ (long)-41844247);
        if (!this.Field9939 && !this.Method27()) {
            return;
        }
        RayTraceResult rayTraceResult = dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(new Vec3d(dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEyeHeight(), dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), new Vec3d((double)blockPos.getX() + Double.longBitsToDouble(0xC6F30138E841D79EL ^ 0xF9130138E841D79EL), (double)blockPos.getY() - Double.longBitsToDouble((long)1734575111 ^ 0x3FE0000067638407L), (double)blockPos.getZ() + Double.longBitsToDouble((long)626637544 ^ 0x3FE000002559BAE8L)));
        EnumFacing enumFacing = rayTraceResult == null || rayTraceResult.sideHit == null ? EnumFacing.UP : rayTraceResult.sideHit;
        this.Field9937.add(blockPos);
        dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos, enumFacing, this.Field9939 ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND, 0.0f, 0.0f, 0.0f));
        dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(EnumHand.MAIN_HAND);
        this.Field9936.Method2801();
    }

    private boolean Method27() {
        if (this.Field9939) {
            return ((int)-2143571163L ^ 0x803BB324) != 0;
        }
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method110(lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method116(Items.END_CRYSTAL, (int)((long)-1349748527 ^ (long)-1349748527), (int)-1708855883L ^ 0x9A24EDBC), this.Field9933.Method359().equals("Silent"));
        return (int)((long)-1667685675 ^ (long)-1667685676) != 0;
    }

    private boolean Method2179(BlockPos blockPos) {
        boolean bl;
        int n = (int)((long)-1526682902 ^ (long)-1526682902);
        if (dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)-1583372412 ^ (long)-1583372412), (int)((long)1667598132 ^ (long)1667598135), (int)((long)-769695870 ^ (long)-769695870))).getBlock() == Blocks.AIR) {
            ++n;
        }
        if (dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)1435271542 ^ (long)1435271542), ((int)1107735492L ^ 0x4206B3C5) << 1, (int)((long)436454174 ^ (long)436454174))).getBlock() == Blocks.AIR) {
            ++n;
        }
        if (dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)-1665109327L ^ 0x9CC072B1, (int)124422022L ^ 0x76A8787, (int)468592968L ^ 0x1BEE2948)).getBlock() == Blocks.AIR) {
            ++n;
        }
        if (dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)265708956 ^ (long)265708956), (int)((long)-324575666 ^ (long)-324575666), (int)((long)-558853980 ^ (long)-558853980))).getBlock() == Blocks.AIR) {
            ++n;
        }
        if (dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)-1432598244 ^ (long)-1432598244), (int)((long)1189999903 ^ (long)-1189999904), (int)-166386090L ^ 0xF6152656)).getBlock() == Blocks.OBSIDIAN || dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)-363057545L ^ 0xEA5C2E77, (int)((long)1176927738 ^ (long)-1176927739), (int)-1431559673L ^ 0xAAAC2207)).getBlock() == Blocks.BEDROCK || dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)1534436715 ^ (long)1534436715), (int)((long)728632969 ^ (long)-728632970), (int)1545500562L ^ 0x5C1E7792)).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)-569679329 ^ (long)-569679330), (int)((long)1236167872 ^ (long)1236167872), (int)((long)-1845382638 ^ (long)-1845382638))).getBlock() == Blocks.OBSIDIAN || dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)1551289478L ^ 0x5C76CC87, (int)1743092275L ^ 0x67E57A33, (int)118592917L ^ 0x7119595)).getBlock() == Blocks.BEDROCK || dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)-716354315 ^ (long)-716354316), (int)((long)-1562679262 ^ (long)-1562679262), (int)-1691467431L ^ 0x9B2E4159)).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)943825813L ^ 0xC7BE5C6A, (int)-133158249L ^ 0xF8102A97, (int)1483209033L ^ 0x5867F949)).getBlock() == Blocks.OBSIDIAN || dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)-1274749651L ^ 0x4BFB22D2, (int)-1027811068L ^ 0xC2BCD904, (int)822880947L ^ 0x310C2AB3)).getBlock() == Blocks.BEDROCK || dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)558923179 ^ (long)-558923180), (int)((long)1539740713 ^ (long)1539740713), (int)((long)-1933987953 ^ (long)-1933987953))).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)1141747804 ^ (long)1141747804), (int)((long)1994327004 ^ (long)1994327004), (int)619332278L ^ 0x24EA42B7)).getBlock() == Blocks.OBSIDIAN || dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)1052188689 ^ (long)1052188689), (int)((long)391627484 ^ (long)391627484), (int)254174067L ^ 0xF266372)).getBlock() == Blocks.BEDROCK || dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)-1788571229L ^ 0x956491A3, (int)((long)937117081 ^ (long)937117081), (int)((long)-1952690318 ^ (long)-1952690317))).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)250166212 ^ (long)250166212), (int)-993137368L ^ 0xC4CDED28, (int)((long)1400432548 ^ (long)-1400432549))).getBlock() == Blocks.OBSIDIAN || dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)2096707119L ^ 0x7CF9362F, (int)1019638007L ^ 0x3CC670F7, (int)1329475635L ^ 0xB0C1CFCC)).getBlock() == Blocks.BEDROCK || dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)-335259673 ^ (long)-335259673), (int)-1001698038L ^ 0xC44B4D0A, (int)-523173179L ^ 0x1F2EFD3A)).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (n >= (int)((long)1990069783 ^ (long)1990069790)) {
            bl = (int)-1265458089L ^ 0xB492A456;
            return bl;
        }
        bl = (int)-1319076444L ^ 0xB1607DA4;
        return bl;
    }

    private static double Method2180(Vec3d vec3d) {
        return vec3d.y;
    }

    private static int Method2181(Vec3d vec3d, Vec3d vec3d2) {
        return Double.compare(dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(vec3d2.x, vec3d2.y, vec3d2.z), dBPpprAVQjVTcDSLXlgH2bNWQfiNNSCp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(vec3d.x, vec3d.y, vec3d.z));
    }

    private void Method2182(RG0Ef4LzpvaRaWkCktLl94QMei9n80rd rG0Ef4LzpvaRaWkCktLl94QMei9n80rd) {
        if (rG0Ef4LzpvaRaWkCktLl94QMei9n80rd.Method160() != Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13746) return;
        if (!this.Field9931.Method309("MotionTick")) return;
        this.Method20();
    }

    private String Method2183() {
        return "[" + this.Field9931.Method359() + "]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)104782870 ^ (long)104782870);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1382447190 ^ (long)1382447273);
            int n2 = (int)-1182665266L ^ 0xB981F585;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1967126140 ^ (long)1967110649) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

