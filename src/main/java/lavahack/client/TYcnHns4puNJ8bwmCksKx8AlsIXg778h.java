//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$LeftClickBlock
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.TYcnHns4puNJ8bwmCksKx8AlsIXg778h$1;
import lavahack.client.TYcnHns4puNJ8bwmCksKx8AlsIXg778h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.dHW1jZK49fXgBu9AY91BXDMHsTGGza8u;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.jxq9vjxqXSadGa0SNXilT7p3PaAfRM8h;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class TYcnHns4puNJ8bwmCksKx8AlsIXg778h
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final jxq9vjxqXSadGa0SNXilT7p3PaAfRM8h Field9043 = new jxq9vjxqXSadGa0SNXilT7p3PaAfRM8h(this).Method5457();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9044 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, TYcnHns4puNJ8bwmCksKx8AlsIXg778h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14244));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9045 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)943890624 ^ 0x403400003842A0C0L), 1.0, Double.longBitsToDouble(0x829800C9E6FC0297L ^ 0xC2C100C9E6FC0297L), ((int)-2112773509L ^ 0x8211A27A) != 0));
    private boolean Field9046 = (int)-950370114L ^ 0xC75A80BE;
    private long Field9047;
    private BlockPos Field9048;
    private String Field9049 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public TYcnHns4puNJ8bwmCksKx8AlsIXg778h() {
        super("BlockOverlay", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method1319(PlayerInteractEvent.LeftClickBlock leftClickBlock) {
        if (TYcnHns4puNJ8bwmCksKx8AlsIXg778h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (TYcnHns4puNJ8bwmCksKx8AlsIXg778h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        this.Field9048 = leftClickBlock.getPos();
        this.Field9047 = System.currentTimeMillis();
        this.Field9046 = (int)-1255050368L ^ 0xB5317381;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method1320(RenderWorldLastEvent renderWorldLastEvent) {
        if (TYcnHns4puNJ8bwmCksKx8AlsIXg778h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (TYcnHns4puNJ8bwmCksKx8AlsIXg778h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        BlockPos blockPos = TYcnHns4puNJ8bwmCksKx8AlsIXg778h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos();
        if (blockPos == null) {
            return;
        }
        if (!this.Field9046) {
            return;
        }
        double d = System.currentTimeMillis() - this.Field9047;
        double d2 = d / ((double)this.Field9045.Method335() * Double.longBitsToDouble((long)670636548 ^ 0x4049000027F91A04L));
        if (d2 > 1.0) {
            this.Field9046 = (int)-1335143640L ^ 0xB06B5328;
            return;
        }
        AxisAlignedBB axisAlignedBB = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3447(exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3449(this.Field9048, this.Method1321(d2)));
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3446(axisAlignedBB, Float.intBitsToFloat(0x34A8CAA5 ^ 0x74E8CAA5), new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)343506231 ^ (long)343506376), (int)-1468097886L ^ 0xA87E9A5D, (int)-34593917L ^ 0xFDF0237C, (int)((long)-354770622 ^ (long)-354770611) << 3), exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17214);
    }

    private double Method1321(double d) {
        switch (TYcnHns4puNJ8bwmCksKx8AlsIXg778h$1.Field17485[((TYcnHns4puNJ8bwmCksKx8AlsIXg778h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field9044.Method341()).ordinal()]) {
            case 1: {
                return dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2140(d);
            }
            case 2: {
                return dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2141(d);
            }
            case 3: {
                return Math.sin(d * Double.longBitsToDouble((long)157313322 ^ 0x3FF921FB5D244432L));
            }
            case 4: {
                return dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2140(d * Double.longBitsToDouble(0x2F1650ACE23CAABAL ^ 0x6F1650ACE23CAABAL));
            }
            case 5: {
                return Math.sin(Double.longBitsToDouble(0xF3F2635650F25166L ^ 0xB3F2635650F25166L) * d * Double.longBitsToDouble(0xC46198D8D57B9E64L ^ 0xFB98B923813FB37CL));
            }
            case 6: {
                return dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2140(d + 1.0);
            }
        }
        return d;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)253589430L ^ 0xF1D77B6;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1771828611 ^ (long)-1771828606);
            int n2 = (int)-658853460L ^ 0xD8BAB117;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-84152582 ^ (long)-84153897) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

