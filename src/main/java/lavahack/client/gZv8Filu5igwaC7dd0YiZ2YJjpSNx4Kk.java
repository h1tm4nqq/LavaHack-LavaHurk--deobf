//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.network.play.server.SPacketBlockBreakAnim
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.ArrayList;
import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.network.play.server.SPacketBlockBreakAnim;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Deprecated
public class gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10719 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Message Type", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14293);
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10720 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Display Show Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)173757493 ^ 0x408F40000A5B5435L), 1.0, Double.longBitsToDouble((long)983985242 ^ 0x40B388003AA66C5AL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943);
    private ArrayList Field10721 = new ArrayList();
    private IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field10722 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field10723 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method2753, new Predicate[(int)-117178162L ^ 0xF90400CE]);
    private int Field10724;

    public gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk() {
        super("BreakAlert", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field10719);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field10720);
    }

    @Override
    public boolean Method52() {
        return ((int)-92621060L ^ 0xFA7AB6FD) != 0;
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field10723);
        this.Field10721.clear();
    }

    @Override
    public void Method45() {
        if (gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (this.Field10721.isEmpty()) {
            return;
        }
        int n = (int)1244140754L ^ 0x4A2814D2;
        while (n < this.Field10721.size()) {
            if (this.Field10719.Method359().equalsIgnoreCase(gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14293.name())) {
                NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507().Method1886(TextFormatting.DARK_PURPLE + "Break Alert! " + TextFormatting.LIGHT_PURPLE + "Your surround blocks is mining!");
            }
            ++n;
        }
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2748(RenderGameOverlayEvent.Text text) {
        if (!this.Field10722.Method2797(this.Field10720.Method369())) {
            this.Field10722.Method2801();
            return;
        }
        int n = (int)-1430287670L ^ 0xAABF8ACA;
        while (n < this.Field10721.size()) {
            if (this.Field10719.Method359().equalsIgnoreCase(gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14294.name())) {
                ScaledResolution scaledResolution = new ScaledResolution(vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi);
                fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Field13314.Method762(TextFormatting.DARK_PURPLE + "Break Alert!", scaledResolution.getScaledWidth() / (((int)-1915124788L ^ 0x8DD983CD) << 1), scaledResolution.getScaledHeight() / ((int)((long)1638966383 ^ (long)1638966382) << 1) - fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748(), (int)((long)-1628107247 ^ (long)1628107246));
                fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Field13315.Method762(TextFormatting.LIGHT_PURPLE + "Your surround blocks is mining!", scaledResolution.getScaledWidth() / (((int)1339122132L ^ 0x4FD161D5) << 1), scaledResolution.getScaledHeight() / ((int)((long)1650782888 ^ (long)1650782889) << 1) + ((int)-2009368155L ^ 0x883B79A0), (int)-977585395L ^ 0x3A44C4F2);
            }
            ++n;
        }
    }

    private ArrayList Method2749() {
        int n;
        int n2;
        double d = Math.abs(gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) - Math.floor(Math.abs(gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX));
        double d2 = Math.abs(gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) - Math.floor(Math.abs(gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ));
        int n3 = this.Method2750(d, ((int)-467436049L ^ 0xE4237DEF) != 0);
        int n4 = this.Method2750(d, ((int)-1459511332L ^ 0xA9019FDD) != 0);
        int n5 = this.Method2750(d2, ((int)-1482628390L ^ 0xA7A0E2DA) != 0);
        int n6 = this.Method2750(d2, ((int)-748022717L ^ 0xD36A1442) != 0);
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        for (n2 = (int)-979559637L ^ 0xC59D1B2A; n2 < n3 + (int)((long)1647220550 ^ (long)1647220551); ++n2) {
            arrayList.add(this.Method2752(this.Method2751(), n2, (int)((long)1409825772 ^ (long)1409825773) + n5));
            arrayList.add(this.Method2752(this.Method2751(), n2, -((int)((long)1283615348 ^ (long)1283615349) + n6)));
        }
        for (n2 = (int)347382765L ^ 0x14B4A3ED; n2 <= n4; ++n2) {
            arrayList.add(this.Method2752(this.Method2751(), -n2, ((int)755601360L ^ 0x2D098FD1) + n5));
            arrayList.add(this.Method2752(this.Method2751(), -n2, -(((int)751079053L ^ 0x2CC48E8C) + n6)));
        }
        for (n = (int)((long)829516226 ^ (long)829516227); n < n5 + (int)((long)2104813871 ^ (long)2104813870); ++n) {
            arrayList.add(this.Method2752(this.Method2751(), (int)((long)-79700638 ^ (long)-79700637) + n3, n));
            arrayList.add(this.Method2752(this.Method2751(), -((int)((long)-1412457876 ^ (long)-1412457875) + n4), n));
        }
        n = (int)-2019804120L ^ 0x879C3C28;
        while (n <= n6) {
            arrayList.add(this.Method2752(this.Method2751(), (int)((long)383634116 ^ (long)383634117) + n3, -n));
            arrayList.add(this.Method2752(this.Method2751(), -((int)((long)-1711038240 ^ (long)-1711038239) + n4), -n));
            ++n;
        }
        return arrayList;
    }

    private int Method2750(double d, boolean bl) {
        int n;
        if (bl) {
            int n2;
            if (d <= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(0x6253F30845B5E23AL ^ 0x226D7CD8DEE36915L)) ^ 0x7FEDBCE3AE65B91EL & 0x7FEDBCE3A965BC3CL)) {
                n2 = (int)-2138463727L ^ 0x8089A210;
                return n2;
            }
            n2 = (int)((long)134632589 ^ (long)134632589);
            return n2;
        }
        if (d >= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1608219652 ^ 0x403659BB42AFAE3FL)) ^ 0x7FD03FDD7BD2B6DDL & 0x7FD03FDD7B13FC7FL)) {
            n = (int)((long)-368925084 ^ (long)-368925083);
            return n;
        }
        n = (int)((long)2080054652 ^ (long)2080054652);
        return n;
    }

    private BlockPos Method2751() {
        double d;
        double d2 = gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
        if (gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Math.floor(gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) > Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)580018004 ^ 0x403364B825354FA3L)) ^ 0x7FDAFD21BEBE897DL & 0x7FDAFD219E3E896FL)) {
            d = Math.floor(gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) + Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1645815601 ^ 0x4013A10B86BD8221L)) ^ 0x7FE3A10BE4A5A550L & 0x7FE3A10BF7A4E510L);
            return new BlockPos(d2, d, gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        }
        d = Math.floor(gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY);
        return new BlockPos(d2, d, gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
    }

    private BlockPos Method2752(BlockPos blockPos, double d, double d2) {
        if (blockPos.getX() < 0) {
            d = -d;
        }
        if (blockPos.getZ() >= 0) {
            return blockPos.add(d, Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(0xE801C206CA7BCFC3L ^ 0x97EBB55F619C3802L)) ^ 0x7FEA7759ABE7F7E9L & 0x7FEA7759EBE7FFC7L), d2);
        }
        d2 = -d2;
        return blockPos.add(d, Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(0xE801C206CA7BCFC3L ^ 0x97EBB55F619C3802L)) ^ 0x7FEA7759ABE7F7E9L & 0x7FEA7759EBE7FFC7L), d2);
    }

    private void Method2753(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketBlockBreakAnim)) return;
        SPacketBlockBreakAnim sPacketBlockBreakAnim = (SPacketBlockBreakAnim)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
        if (this.Method2749().isEmpty()) return;
        if (!this.Method2749().contains(sPacketBlockBreakAnim.getPosition())) {
            return;
        }
        if (!this.Field10721.contains(sPacketBlockBreakAnim.getPosition()) && sPacketBlockBreakAnim.getProgress() > 0 && sPacketBlockBreakAnim.getProgress() <= (int)((long)1122017582 ^ (long)1122017579) << 1) {
            this.Field10721.add(sPacketBlockBreakAnim.getPosition());
            return;
        }
        if (sPacketBlockBreakAnim.getProgress() > 0) {
            if (sPacketBlockBreakAnim.getProgress() <= (int)((long)1361593443 ^ (long)1361593446) << 1) return;
        }
        this.Field10721.remove(sPacketBlockBreakAnim.getPosition());
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-2075964475 ^ (long)-2075964475);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1374345051 ^ (long)-1374345126);
            int n2 = (int)((long)-1469590595 ^ (long)-1469590572) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1440526261 ^ (long)-1440523926) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

