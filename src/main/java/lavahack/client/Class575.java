//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.server.SPacketChunkData
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import lavahack.client.Class1612;
import lavahack.client.Class1796;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class544;
import lavahack.client.Class574;
import lavahack.client.Class618;
import lavahack.client.Class97;
import net.minecraft.network.play.server.SPacketChunkData;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class575
extends Class42 {
    private final Class44 Field10447 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble(0x4020000000000000L), Double.longBitsToDouble((long)1181271342 ^ 0x401000004668C52EL), Double.longBitsToDouble((long)1205733977 ^ 0x4060000047DE0A59L), true));
    private final Class1612 Field10448 = new Class1612(this).Method3788().Method3789();
    private final Class44 Field10449 = this.Method23(new Class44("EdgeOf", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)2044779299 ^ 0x401C000079E0DB23L), false));
    private List Field10450 = new Vector();
    private final Class618 Field10451 = new Class618(this::Method2526, new Predicate[0]);
    private String Field10452 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class575() {
        super("NewChunks", Class97.Field8344);
    }

    @Override
    public void Method38() {
        if (Class575.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class575.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            Class1796.Field16242.Method706(this.Field10451);
            return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field10451);
        this.Field10450.clear();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2524(RenderWorldLastEvent renderWorldLastEvent) {
        if (Class575.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class575.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        double d = this.Field10449.Method367();
        double d2 = Double.longBitsToDouble((long)1440731287 ^ 0x4030000055DFD097L) - this.Field10449.Method367();
        this.Field10450 = this.Field10450.stream().filter(this::Method2525).collect(Collectors.toList());
        Iterator iterator = this.Field10450.iterator();
        while (iterator.hasNext()) {
            Class574 class574 = (Class574)iterator.next();
            AxisAlignedBB axisAlignedBB = new AxisAlignedBB((double)((Integer)class574.Method2522()).intValue() + d, 0.0, (double)((Integer)class574.Method2523()).intValue() + d, (double)((Integer)class574.Method2522()).intValue() + d2, 0.0, (double)((Integer)class574.Method2523()).intValue() + d2);
            this.Field10448.Method3804(axisAlignedBB);
        }
    }

    private boolean Method2525(Class574 class574) {
        if (!(Class575.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq((double)((Integer)class574.Method2522() + 8), Class575.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, (double)((Integer)class574.Method2523() + 8)) <= (double)this.Field10447.Method335())) return false;
        return true;
    }

    private void Method2526(Class544 class544) {
        if (!(class544.Method982() instanceof SPacketChunkData)) {
            return;
        }
        SPacketChunkData sPacketChunkData = (SPacketChunkData)class544.Method982();
        if (sPacketChunkData.isFullChunk()) {
            return;
        }
        Class574 class574 = new Class574(sPacketChunkData.getChunkX() * 16, sPacketChunkData.getChunkZ() * 16);
        if (this.Field10450.contains(class574)) return;
        this.Field10450.add(class574);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 72;
            cArray2[n] = (char)(cArray[n] ^ (0x30A8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

