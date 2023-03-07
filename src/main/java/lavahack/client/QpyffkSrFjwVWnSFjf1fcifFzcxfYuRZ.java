//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.c329TsrwyQaghkrpEAKnYsAuVtEEsCMs;
import lavahack.client.c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK;
import lavahack.client.hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7;
import lavahack.client.mZKglU52NJKeleKf9WRZyyfpIeAgybGE;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.tdSm3RmMRb5Kp8aQNd26dKOJur9ncrg8;
import lavahack.client.tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua;
import lavahack.client.ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J
implements c329TsrwyQaghkrpEAKnYsAuVtEEsCMs {
    private final Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ Field8536 = this.Method54();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8537 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Obsidian", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1083088240 ^ (long)1083088241)).Method355("Obby"));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8538 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Bedrock", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1963873417L ^ 0x8AF1AB76) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8539 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Custom", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1814831023L ^ 0x93D3E050) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8540 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Single", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1580834187 ^ (long)1580834186)).Method355("1x1"));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8541 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Double", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1594233140 ^ (long)1594233141)).Method355("2x1"));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8542 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x60852A2664F826C0L ^ 0x20AD2A2664F826C0L), 1.0, Double.longBitsToDouble(0x26CF69B2D01C15C7L ^ 0x66FB69B2D01C15C7L), (boolean)((long)1543088350 ^ (long)1543088350)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8543 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Limit", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble(0xD6D52F61BBB762A2L ^ 0x969C2F61BBB762A2L), (boolean)((long)127155738 ^ (long)127155739)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8544 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("IgnoreOwnHole", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1943064763 ^ (long)1943064763)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field8545 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Obby", this)));
    private final c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK Field8546 = new c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK(this, hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7.Field14902, ((int)-1959235669L ^ 0x8B386FAB) != 0).Method3814("Obsidian").Method3816(this.Field8545).Method3813().Method3812();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8547 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HeightObsidian", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, 1.0, ((int)-1946538130L ^ 0x8BFA2F6E) != 0));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field8548 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Bedrock", this)));
    private final c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK Field8549 = new c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK(this, hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7.Field14902, (boolean)((long)-730106107 ^ (long)-730106107)).Method3814("Bedrock").Method3816(this.Field8548).Method3813().Method3812();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8550 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HeightBedrock", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, 1.0, ((int)1170471509L ^ 0x45C3FA55) != 0));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field8551 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Custom", this)));
    private final c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK Field8552 = new c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK(this, hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7.Field14902, ((int)-95990332L ^ 0xFA474DC4) != 0).Method3814("Custom").Method3816(this.Field8551).Method3813().Method3812();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8553 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Height", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, 1.0, (boolean)((long)-518917186 ^ (long)-518917186)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8554 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("FadeIn", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1119967888L ^ 0x42C15A90) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8555 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("FadeInTicks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1628527895 ^ 0x4069000061115D17L), 0.0, Double.longBitsToDouble((long)1657582659 ^ 0x407F400062CCB443L), ((int)571201398L ^ 0x220BD777) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8556 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("FadeInCool", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)957442040 ^ (long)957442040)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8557 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("FadeOut", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)733587439 ^ (long)733587439)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8558 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("FadeOutTicks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xEEE108382A33ED70L ^ 0xAE8808382A33ED70L), 0.0, Double.longBitsToDouble((long)1665823804 ^ 0x407F4000634A743CL), (boolean)((long)1723175694 ^ (long)1723175695)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8559 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("FadeOutCool", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1020729113 ^ (long)-1020729113)));
    private static final Comparator Field8560 = QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ::Method978;
    private static final Comparator Field8561 = QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ::Method977;
    private Map Field8562 = new TreeMap(Field8560);
    private Map Field8563 = new TreeMap(Field8560);
    private Map Field8564 = new TreeMap(Field8561);
    private Map Field8565 = new TreeMap(Field8561);
    @tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua
    public static QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ Field8566;
    private String Field8567 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ() {
        super("HoleESPRewrite2", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field8536.Method2004();
    }

    @Override
    public void Method39() {
        super.Method39();
        this.Field8562.clear();
        this.Field8564.clear();
        this.Field8565.clear();
    }

    @Override
    public void Method45() {
        this.Field8536.Method2005(this::Method968);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method967(RenderWorldLastEvent renderWorldLastEvent) {
        if (!this.Method974(QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10494).Method3791() && !this.Method974(QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10495).Method3791()) {
            if (!this.Method974(QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10496).Method3791()) return;
        }
        this.Method969((boolean)((long)-981325545 ^ (long)-981325545));
    }

    public void Method20() {
        this.Method969(((int)-1833916029L ^ 0x92B0A982) != 0);
    }

    private void Method968() {
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(this::Method976);
    }

    public void Method969(boolean bl) {
        double d;
        ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22;
        double d2;
        double d3;
        double d4;
        ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23;
        int n;
        Object object;
        TreeMap treeMap;
        TreeMap<Object, Object> treeMap2 = new TreeMap<Object, Object>(Field8560);
        treeMap2.putAll(this.Field8562);
        TreeMap treeMap3 = new TreeMap(Field8561);
        TreeMap treeMap4 = new TreeMap(Field8561);
        if (this.Field8554.Method365()) {
            treeMap = new TreeMap(Field8561);
            for (Map.Entry object2 : this.Field8564.entrySet()) {
                object = ((ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2)((SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr)object2.getKey()).Method6307()).Method4977();
                n = (int)-1437855977L ^ 0xAA4C0F16;
                if (QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(object.x, object.y, object.z) > this.Field8542.Method367()) {
                    treeMap3.put(object2.getKey(), object2.getValue());
                    n = (int)((long)-778362504 ^ (long)-778362504);
                }
                if (this.Method970((Double)object2.getValue(), ((int)1853543024L ^ 0x6E7AD271) != 0)) {
                    treeMap2.put(((SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr)object2.getKey()).Method6307(), ((SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr)object2.getKey()).Method6308());
                    continue;
                }
                ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23 = (ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2)((SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr)object2.getKey()).Method6307();
                d4 = ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13620 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13617;
                d3 = ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13621 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13618;
                d2 = ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13622 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13619;
                ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22 = ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Method4981((Double)object2.getValue() * d4, (Double)object2.getValue() * d3, (Double)object2.getValue() * d2);
                this.Method974((QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)((Object)((SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr)object2.getKey()).Method6308())).Method3804(ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Method4989());
                if (this.Field8556.Method365()) {
                    double d5 = 1.0 / this.Field8555.Method367();
                    double d6 = 1.0;
                    double d7 = (Double)object2.getValue();
                    return (void)(d7 + (d6 - d7) * d5);
                }
                d = (Double)object2.getValue() + 1.0 / this.Field8555.Method367();
                if (n == 0) continue;
                treeMap.put(object2.getKey(), d);
            }
            this.Field8564 = treeMap;
        }
        if (this.Field8557.Method365()) {
            treeMap = new TreeMap(Field8561);
            for (Map.Entry entry : this.Field8565.entrySet()) {
                object = ((ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2)((SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr)entry.getKey()).Method6307()).Method4977();
                n = (int)-942155109L ^ 0xC7D7DA9A;
                if (QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(object.x, object.y, object.z) > this.Field8542.Method367()) {
                    treeMap4.put(entry.getKey(), entry.getValue());
                    n = (int)((long)1855223712 ^ (long)1855223712);
                }
                if (this.Method970((Double)entry.getValue(), ((int)558843682L ^ 0x214F4722) != 0)) continue;
                ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23 = (ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2)((SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr)entry.getKey()).Method6307();
                d4 = ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13620 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13617;
                d3 = ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13621 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13618;
                d2 = ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13622 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13619;
                ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22 = ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Method4981(1.0 - (Double)entry.getValue() * d4, 1.0 - (Double)entry.getValue() * d3, 1.0 - (Double)entry.getValue() * d2);
                this.Method974((QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)((Object)((SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr)entry.getKey()).Method6308())).Method3804(ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Method4989());
                if (this.Field8559.Method365()) {
                    double d8 = 1.0 / this.Field8555.Method367();
                    double d9 = 1.0;
                    double d10 = (Double)entry.getValue();
                    return (void)(d10 + (d9 - d10) * d8);
                }
                d = (Double)entry.getValue() + 1.0 / this.Field8555.Method367();
                if (n == 0) continue;
                treeMap.put(entry.getKey(), d);
            }
            this.Field8565 = treeMap;
            this.Field8565.putAll(treeMap3);
            this.Field8564.putAll(treeMap4);
        }
        treeMap = treeMap2.entrySet().iterator();
        while (treeMap.hasNext()) {
            Map.Entry entry = (Map.Entry)treeMap.next();
            if (this.Field8554.Method365() && this.Field8564.containsKey(new SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr(entry.getKey(), entry.getValue())) || this.Field8557.Method365() && this.Field8565.containsKey(new SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr(entry.getKey(), entry.getValue()))) continue;
            ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX24 = (ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2)entry.getKey();
            object = (QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)((Object)entry.getValue());
            Vec3d vec3d = tdSm3RmMRb5Kp8aQNd26dKOJur9ncrg8.Field16968.Method6696(ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX24.Method4989()).Method7191();
            if ((!bl || this.Method974((QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)((Object)object)).Method3791()) && (bl || !this.Method974((QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)((Object)object)).Method3791())) continue;
            this.Method974((QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)((Object)object)).Method3817(ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX24.Method4989(), (Long)this.Field8563.get(ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX24), this.Field8542.Method368(), (float)QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(vec3d.x, vec3d.y, vec3d.z));
        }
    }

    private boolean Method970(double d, boolean bl) {
        boolean bl2;
        if (bl) {
            int n;
            if (this.Field8556.Method365()) {
                return mZKglU52NJKeleKf9WRZyyfpIeAgybGE.Method2507(1.0 - d, Double.longBitsToDouble(0xB53AF785B30C5FDBL ^ 0x8A20C167530C5FDBL));
            }
            if (d >= 1.0) {
                n = (int)((long)555060674 ^ (long)555060675);
                return n != 0;
            }
            n = (int)((long)1414190527 ^ (long)1414190527);
            return n != 0;
        }
        if (this.Field8559.Method365()) {
            return mZKglU52NJKeleKf9WRZyyfpIeAgybGE.Method2507(1.0 - d, Double.longBitsToDouble(0xC48D372646DB4558L ^ 0xFB9701C4A6DB4558L));
        }
        if (d >= 1.0) {
            bl2 = (int)1120866774L ^ 0x42CF11D7;
            return bl2;
        }
        bl2 = (int)-1179122248L ^ 0xB9B805B8;
        return bl2;
    }

    private Map Method971() {
        TreeMap<ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2, QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi> treeMap = new TreeMap<ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2, QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi>(Field8560);
        List list = this.Method972(this.Field8542.Method368());
        int n = (int)((long)446510328 ^ (long)446510328);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            if (this.Field8543.Method335() != 0 && n > this.Field8543.Method335()) {
                return treeMap;
            }
            AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.Method7131(blockPos, ((int)905150685L ^ 0x35F380DD) != 0, (boolean)((long)-1839572623 ^ (long)-1839572623));
            AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6959();
            if (ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV == AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field9771 || ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV == AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field9768 && !this.Field8540.Method365() || ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV == AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field9769 && !this.Field8541.Method365()) continue;
            AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6960();
            AxisAlignedBB axisAlignedBB = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6961();
            if (axisAlignedBB == null) {
                return treeMap;
            }
            QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi qpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf == AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9697 ? QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10495 : QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10494;
            if (ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV == AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field9770) {
                qpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10496;
            }
            if (qpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi == QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10494 && !this.Field8537.Method365() || qpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi == QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10495 && !this.Field8538.Method365() || qpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi == QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10496 && !this.Field8539.Method365()) continue;
            ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22 = this.Method973(ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6961(), qpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
            if (!treeMap.containsKey(ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22)) {
                treeMap.put(ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22, qpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
            }
            ++n;
        }
        return treeMap;
    }

    private List Method972(float f) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(((int)-1031917335L ^ 0xC27E30E8) << 6);
        List list = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1946(new BlockPos(QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), f, (int)(f + 1.0f), (boolean)((long)141101918 ^ (long)141101918), (boolean)((long)1183428885 ^ (long)1183428884), (int)((long)1437956310 ^ (long)1437956310));
        list = list.stream().sorted(QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ::Method975).collect(Collectors.toList());
        BlockPos blockPos = new BlockPos(QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos2 = (BlockPos)iterator.next();
            if (this.Field8544.Method365() && blockPos == blockPos2 || !QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2).getBlock().equals(Blocks.AIR) || QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2.add((int)1204939197L ^ 0x47D1E9BD, (int)1331390792L ^ 0xB0A496B7, (int)-1585032976L ^ 0xA18650F0)).getBlock().equals(Blocks.AIR) || !QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2.add((int)973980120L ^ 0x3A0DC1D8, (int)((long)390344168 ^ (long)390344169), (int)((long)1103806631 ^ (long)1103806631))).getBlock().equals(Blocks.AIR) || !QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2.add((int)((long)-980651241 ^ (long)-980651241), (int)((long)556389569 ^ (long)556389568) << 1, (int)((long)-657885542 ^ (long)-657885542))).getBlock().equals(Blocks.AIR)) continue;
            arrayList.add(blockPos2);
        }
        return arrayList;
    }

    private ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 Method973(AxisAlignedBB axisAlignedBB, QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi qpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22 = new ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2(axisAlignedBB);
        if (qpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi == QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10494) {
            ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13621 = ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13618 + this.Field8547.Method367();
            return ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22;
        }
        if (qpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi == QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10495) {
            ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13621 = ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13618 + this.Field8550.Method367();
            return ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22;
        }
        ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13621 = ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13618 + this.Field8553.Method367();
        return ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22;
    }

    private c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK Method974(QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi qpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        if (qpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi == QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10495) {
            return this.Field8549;
        }
        if (qpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi != QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10496) return this.Field8546;
        return this.Field8552;
    }

    private static int Method975(BlockPos blockPos, BlockPos blockPos2) {
        double d = blockPos.distanceSq(QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        double d2 = blockPos2.distanceSq(QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        return Double.compare(d, d2);
    }

    private void Method976() {
        Map map = this.Method971();
        TreeMap<ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2, Long> treeMap = new TreeMap<ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2, Long>(Field8560);
        for (ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 object : map.keySet()) {
            treeMap.put(object, System.currentTimeMillis());
        }
        if (this.Field8557.Method365()) {
            for (Map.Entry entry : this.Field8562.entrySet()) {
                if (map.containsKey(entry.getKey())) continue;
                this.Field8565.put(new SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr(entry.getKey(), entry.getValue()), 0.0);
            }
        } else {
            this.Field8565.clear();
        }
        if (this.Field8554.Method365()) {
            for (Map.Entry entry : map.entrySet()) {
                if (this.Field8562.containsKey(entry.getKey())) continue;
                this.Field8564.put(new SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr(entry.getKey(), entry.getValue()), 0.0);
            }
        } else {
            this.Field8564.clear();
        }
        this.Field8562 = map;
        this.Field8563 = treeMap;
    }

    private static int Method977(SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr, SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr2) {
        return Double.compare(QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(((ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr2.Method6307()).Method4977().x, ((ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr2.Method6307()).Method4977().y, ((ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr2.Method6307()).Method4977().z), QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(((ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr.Method6307()).Method4977().x, ((ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr.Method6307()).Method4977().y, ((ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr.Method6307()).Method4977().z));
    }

    private static int Method978(ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22, ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23) {
        return Double.compare(QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Method4977().x, ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Method4977().y, ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Method4977().z), QpyffkSrFjwVWnSFjf1fcifFzcxfYuRZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Method4977().x, ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Method4977().y, ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Method4977().z));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1049638526 ^ (long)-1049638526);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1891259370 ^ (long)1891259157);
            int n2 = (int)76955706L ^ 0x496401D;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1970417732 ^ (long)-1970423239) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

