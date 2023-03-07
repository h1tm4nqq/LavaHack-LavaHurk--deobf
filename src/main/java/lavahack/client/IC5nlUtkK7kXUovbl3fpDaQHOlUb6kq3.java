//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.material.Material
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x;
import lavahack.client.I7F8iz7oQorkIm5qDcfi8iw0hGUOnlSO;
import lavahack.client.IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

@ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy
public class IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10422 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16117));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10423 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Pitch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1342286949 ^ 0x404E00005001AC65L), 0.0, Double.longBitsToDouble((long)1634373898 ^ 0x40568000616A910AL), (boolean)((long)463215923 ^ (long)463215923)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10424 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Timer", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-2143338486L ^ 0x803F400A) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10425 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Timer Value", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xB7466E666CC94A75L ^ 0xF7526E666CC94A75L), Double.longBitsToDouble((long)764985216 ^ 0x3FB999998D98BF80L), Double.longBitsToDouble((long)101850640 ^ 0x4034000006121E10L), (boolean)((long)-63702115 ^ (long)-63702115)).Method313(this.Field10424::Method365));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10426 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Disable After Complete", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1485285253L ^ 0xA778587B) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10427 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fast Fall", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1855972815L ^ 0x6E9FE5CF) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10428 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fast Fall Motion", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1031753378 ^ 0x402400003D7F4EA2L), 1.0, Double.longBitsToDouble((long)313282417 ^ 0x4024000012AC4F71L), ((int)-521375415L ^ 0xE0EC7149) != 0).Method313(this.Field10427::Method365));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10429 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Use Fast Fall Lag Time", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1797712058 ^ (long)1797712058)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10430 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fast Fall Lag Time", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x9D0A31886A687042L ^ 0xDD7571886A687042L), 0.0, Double.longBitsToDouble(0x51407C19EE9D7929L ^ 0x11CF3C19EE9D7929L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10431 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sync With Reverse Step", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1878223839 ^ (long)-1878223839)));
    private boolean Field10432 = (int)1083161028L ^ 0x408FB9C4;
    private final double[] Field10433;
    private int Field10434;
    private boolean Field10435;
    private boolean Field10436;
    private String Field10437 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3() {
        super("Anchor", "Helps with holes", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340);
        double[] dArray = new double[((int)1056784079L ^ 0x3EFD3ECE) << 1];
        dArray[(int)-488701564L ^ 0xE2DF0184] = Double.longBitsToDouble((long)34175418 ^ 0x3FDAE147AC1D035BL);
        dArray[(int)-831314260L ^ 0xCE7326AD] = Double.longBitsToDouble((long)670257742 ^ 0x3FE8000027F3524EL);
        this.Field10433 = dArray;
        this.Field10435 = (int)((long)-583530086 ^ (long)-583530086);
        this.Field10436 = (int)1808055337L ^ 0x6BC4BC29;
        super.Method44(this::Method2516);
    }

    private boolean Method2513(BlockPos blockPos) {
        boolean bl;
        int n = (int)((long)-906999763 ^ (long)-906999763);
        if (IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)-940532119 ^ (long)-940532119), (int)-1402034640L ^ 0xAC6EA633, (int)-1756233671L ^ 0x97520039)).getBlock() == Blocks.AIR) {
            ++n;
        }
        if (IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)-999290026L ^ 0xC4700B56, ((int)903340754L ^ 0x35D7E2D3) << 1, (int)968298897L ^ 0x39B71191)).getBlock() == Blocks.AIR) {
            ++n;
        }
        if (IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)-1644545767 ^ (long)-1644545767), (int)944552592L ^ 0x384CBA91, (int)((long)-1152696430 ^ (long)-1152696430))).getBlock() == Blocks.AIR) {
            ++n;
        }
        if (IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)430755622 ^ (long)430755622), (int)((long)548871329 ^ (long)548871329), (int)((long)-1321294600 ^ (long)-1321294600))).getBlock() == Blocks.AIR) {
            ++n;
        }
        if (IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)-800434880L ^ 0xD04A5540, (int)-1161732769L ^ 0x453EA2A0, (int)((long)352238883 ^ (long)352238883))).getBlock() == Blocks.OBSIDIAN || IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)1901976283 ^ (long)1901976283), (int)((long)-284235627 ^ (long)284235626), (int)2043983413L ^ 0x79D4B635)).getBlock() == Blocks.BEDROCK || IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)1377809517 ^ (long)1377809517), (int)((long)-869957828 ^ (long)869957827), (int)((long)-1403083364 ^ (long)-1403083364))).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)241866624 ^ (long)241866625), (int)((long)79273762 ^ (long)79273762), (int)-104039611L ^ 0xF9CC7B45)).getBlock() == Blocks.OBSIDIAN || IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)-156979234 ^ (long)-156979233), (int)-1089903706L ^ 0xBF0963A6, (int)751367042L ^ 0x2CC8F382)).getBlock() == Blocks.BEDROCK || IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)1716846057 ^ (long)1716846056), (int)-739495646L ^ 0xD3EC3122, (int)699961700L ^ 0x29B89164)).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)-952948861 ^ (long)952948860), (int)795135278L ^ 0x2F64CD2E, (int)((long)1149449459 ^ (long)1149449459))).getBlock() == Blocks.OBSIDIAN || IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)-1990164506 ^ (long)1990164505), (int)((long)-1402417384 ^ (long)-1402417384), (int)881582682L ^ 0x348BE25A)).getBlock() == Blocks.BEDROCK || IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)-490113649 ^ (long)490113648), (int)((long)-1632434834 ^ (long)-1632434834), (int)((long)369795291 ^ (long)369795291))).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)465689071 ^ (long)465689071), (int)((long)425970615 ^ (long)425970615), (int)349240033L ^ 0x14D0FAE0)).getBlock() == Blocks.OBSIDIAN || IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)1805611803 ^ (long)1805611803), (int)((long)-1141739927 ^ (long)-1141739927), (int)((long)1954747202 ^ (long)1954747203))).getBlock() == Blocks.BEDROCK || IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)-950797330L ^ 0xC753FBEE, (int)((long)1276339385 ^ (long)1276339385), (int)((long)-1485500719 ^ (long)-1485500720))).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)-1407219852L ^ 0xAC1F8774, (int)-244699848L ^ 0xF16A2D38, (int)1950973125L ^ 0x8BB6833A)).getBlock() == Blocks.OBSIDIAN || IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)854705784L ^ 0x32F1C678, (int)-988977687L ^ 0xC50D65E9, (int)((long)-1200982907 ^ (long)1200982906))).getBlock() == Blocks.BEDROCK || IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)-674641447L ^ 0xD7C9C9D9, (int)1743991135L ^ 0x67F3315F, (int)-559933587L ^ 0x215FE892)).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (n >= (int)((long)549778522 ^ (long)549778515)) {
            bl = (int)-702636425L ^ 0xD61E9E76;
            return bl;
        }
        bl = (int)1311424240L ^ 0x4E2ABEF0;
        return bl;
    }

    private Vec3d Method2514(double d, double d2, double d3) {
        return new Vec3d(Math.floor(d) + Double.longBitsToDouble(0x5B711B40E8113DAAL ^ 0x64911B40E8113DAAL), Math.floor(d2), Math.floor(d3) + Double.longBitsToDouble(0x7C9C3CCD1E1062FEL ^ 0x437C3CCD1E1062FEL));
    }

    @Override
    public void Method38() {
        if (this.Field10432 && this.Field10436) {
            GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x = (GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x)leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162("MoveModifier");
            gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7102().Method366((boolean)((long)-1071586150 ^ (long)-1071586149));
        }
        this.Field10432 = (int)1615580339L ^ 0x604BCCB3;
    }

    @Override
    public void Method45() {
        GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x;
        if (IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null && IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isDead || IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY < 0.0) {
            this.Field10432 = (int)((long)-1845845401 ^ (long)-1845845401);
            return;
        }
        if (IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch >= (float)this.Field10423.Method335()) {
            if (this.Method2513(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6638().down((int)-856561412L ^ 0xCCF1E8FD)) || this.Method2513(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6638().down((int)((long)295652460 ^ (long)295652461) << 1)) || this.Method2513(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6638().down((int)305713811L ^ 0x1238D290)) || this.Method2513(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6638().down(((int)908282129L ^ 0x36234910) << 2))) {
                if (this.Field10422.Method359().equals(IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16117.name())) {
                    gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x = this.Method2514(IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                    double d = Math.abs(((Vec3d)gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x).x - IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX);
                    double d2 = Math.abs(((Vec3d)gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x).z - IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                    if (!(d <= Double.longBitsToDouble((long)1189452443 ^ 0x3FB99999DF7C0301L)) || !(d2 <= Double.longBitsToDouble((long)922663839 ^ 0x3FB99999AF672205L))) {
                        double d3 = ((Vec3d)gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x).x - IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
                        double d4 = ((Vec3d)gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x).z - IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
                        IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = d3 / Double.longBitsToDouble(0xFC00FF26B0CC3E29L ^ 0xBC00FF26B0CC3E29L);
                        IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = d4 / Double.longBitsToDouble(0x5B50EBBD696A1A45L ^ 0x1B50EBBD696A1A45L);
                    }
                    this.Field10432 = (int)-1454823822L ^ 0xA9492673;
                } else if (this.Field10422.Method359().equals(IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16118.name())) {
                    if (!IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                        this.Field10435 = IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isKeyDown();
                    }
                    if (!this.Field10435 && (double)IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance < Double.longBitsToDouble((long)119915999 ^ 0x3FE000000725C5DFL) && h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4219() && IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4202() <= Double.longBitsToDouble(0x1E83B887AA006146L ^ 0x2171B887AA006146L) && IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4202() <= Double.longBitsToDouble((long)1186737216 ^ 0x3FEE666620DA4A26L) && !EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1919() && !EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1936()) {
                        if (!IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                            this.Field10434 += (int)-1021988685L ^ 0xC315B0B2;
                        }
                        if (!(IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround || IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInsideOfMaterial(Material.WATER) || IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInsideOfMaterial(Material.LAVA) || IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isKeyDown() || IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isOnLadder() || this.Field10434 <= 0)) {
                            gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x = new BlockPos(IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                            double[] dArray = this.Field10433;
                            int n = dArray.length;
                            for (int i = (int)1145696484L ^ 0x4449F0E4; i < n; ++i) {
                                double d = dArray[i];
                                IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position((double)((float)gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.getX() + Float.intBitsToFloat(0x4B1C282D ^ 0x741C282D)), IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - d, (double)((float)gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.getZ() + Float.intBitsToFloat(0x79B7BD6C ^ 0x46B7BD6C)), (boolean)((long)427775670 ^ (long)427775671)));
                            }
                            IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition((double)((float)gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.getX() + Float.intBitsToFloat(0x6A18EDA1 ^ 0x5518EDA1)), h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4202() + Double.longBitsToDouble((long)1548330992 ^ 0x3FB99999C5D03E6AL), (double)((float)gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.getZ() + Float.intBitsToFloat((int)((long)62666221 ^ (long)1018967533))));
                            this.Field10434 = (int)((long)255820289 ^ (long)255820289);
                        }
                    }
                } else if (this.Field10422.Method309("MovementStop")) {
                    if (this.Method2513(IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPosition())) {
                        IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
                        IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
                    } else {
                        gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x = this.Method2514(IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                        double d = Math.abs(((Vec3d)gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x).x - IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX);
                        double d5 = Math.abs(((Vec3d)gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x).z - IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                        if (!(d <= Double.longBitsToDouble(0x52FDE723F60D94EBL ^ 0x6D447EBA6F940D71L)) || !(d5 <= Double.longBitsToDouble(0x7F02BF09F3C77BFDL ^ 0x40BB26906A5EE267L))) {
                            double d6 = ((Vec3d)gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x).x - IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
                            double d7 = ((Vec3d)gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x).z - IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
                            IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = d6 / Double.longBitsToDouble(0x7C3E8C00D62F04CBL ^ 0x3C3E8C00D62F04CBL);
                            IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = d7 / Double.longBitsToDouble(0xEAA8BF8039EAC2D2L ^ 0xAAA8BF8039EAC2D2L);
                        }
                    }
                    this.Field10432 = (int)514181251L ^ 0x1EA5C882;
                }
                if (this.Field10427.Method365() && !this.Method2515()) {
                    IC5nlUtkK7kXUovbl3fpDaQHOlUb6kq3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = -this.Field10428.Method367();
                }
            } else {
                this.Field10432 = (int)1813204637L ^ 0x6C134E9D;
            }
        }
        if (this.Method2513(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6638())) {
            this.Field10432 = (int)((long)1304878940 ^ (long)1304878940);
        }
        if (this.Field10432 && this.Field10424.Method365()) {
            EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1952(this.Field10425.Method368());
        } else {
            EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1953();
        }
        if (this.Method2513(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6638())) {
            if (this.Field10426.Method365()) {
                super.Method21(((int)755031207L ^ 0x2D00DCA7) != 0);
            }
            if (this.Field10432) {
                this.Field10432 = (int)-2001688943L ^ 0x88B0A691;
            }
        }
        if (this.Field10432 && this.Field10431.Method365()) {
            gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x = (GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x)leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162("MoveModifier");
            gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7102().Method366((boolean)((long)282136034 ^ (long)282136034));
            this.Field10436 = (int)((long)2107819114 ^ (long)2107819115);
        }
        if (!this.Field10436) return;
        if (this.Field10432) return;
        gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x = (GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x)leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162("MoveModifier");
        gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7102().Method366(((int)241489775L ^ 0xE64D76E) != 0);
    }

    private boolean Method2515() {
        int n;
        if (this.Field10429.Method365() && I7F8iz7oQorkIm5qDcfi8iw0hGUOnlSO.Field8400.Method837(this.Field10430.Method335())) {
            n = (int)107824896L ^ 0x66D4701;
            return n != 0;
        }
        n = (int)((long)54377007 ^ (long)54377007);
        return n != 0;
    }

    private String Method2516() {
        return "[" + this.Field10422.Method359() + "]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-531928224L ^ 0xE04B6B60;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1342336431 ^ (long)-1342336338);
            int n2 = ((int)1128523068L ^ 0x4343E56B) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1281916606L ^ 0x4C687271) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

