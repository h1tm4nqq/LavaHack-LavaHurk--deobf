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

import com.kisman.cc.util.Class2027;
import lavahack.client.Class1365;
import lavahack.client.Class1377;
import lavahack.client.Class2008;
import lavahack.client.Class2073;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class447;
import lavahack.client.Class815;
import lavahack.client.Class97;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class240
extends Class42 {
    private final Class1365 Field9043 = new Class1365(this).Method5457();
    private final Class44 Field9044 = this.Method23(new Class44("Mode", (Class42)this, Class1377.Field14244));
    private final Class44 Field9045 = this.Method23(new Class44("Speed", (Class42)this, Double.longBitsToDouble((long)943890624 ^ 0x403400003842A0C0L), 1.0, Double.longBitsToDouble(4636737291354636288L), true));
    private boolean Field9046 = false;
    private long Field9047;
    private BlockPos Field9048;
    private String Field9049 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class240() {
        super("BlockOverlay", Class97.Field8345);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method1319(PlayerInteractEvent.LeftClickBlock leftClickBlock) {
        if (Class240.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class240.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        this.Field9048 = leftClickBlock.getPos();
        this.Field9047 = System.currentTimeMillis();
        this.Field9046 = true;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method1320(RenderWorldLastEvent renderWorldLastEvent) {
        if (Class240.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class240.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        BlockPos blockPos = Class240.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos();
        if (blockPos == null) {
            return;
        }
        if (!this.Field9046) {
            return;
        }
        double d = System.currentTimeMillis() - this.Field9047;
        double d2 = d / ((double)this.Field9045.Method335() * Double.longBitsToDouble((long)670636548 ^ 0x4049000027F91A04L));
        if (d2 > 1.0) {
            this.Field9046 = false;
            return;
        }
        AxisAlignedBB axisAlignedBB = Class815.Method3447(Class815.Method3449(this.Field9048, this.Method1321(d2)));
        Class815.Method3446(axisAlignedBB, Float.intBitsToFloat(0x40400000), new Class2027(255, 255, 255, 120), Class815.Field11486, Class2008.Field17214);
    }

    private double Method1321(double d) {
        switch (Class2073.Field17485[((Class1377)this.Field9044.Method341()).ordinal()]) {
            case 1: {
                return Class447.Method2140(d);
            }
            case 2: {
                return Class447.Method2141(d);
            }
            case 3: {
                return Math.sin(d * Double.longBitsToDouble((long)157313322 ^ 0x3FF921FB5D244432L));
            }
            case 4: {
                return Class447.Method2140(d * Double.longBitsToDouble(0x4000000000000000L));
            }
            case 5: {
                return Math.sin(Double.longBitsToDouble(0x4000000000000000L) * d * Double.longBitsToDouble(4609753056924675352L));
            }
            case 6: {
                return Class447.Method2140(d + 1.0);
            }
        }
        return d;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 187;
            cArray2[n] = (char)(cArray[n] ^ (0x72D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

