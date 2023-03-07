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
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK;
import lavahack.client.Ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.network.play.server.SPacketChunkData;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class rfELj5YPm7hkYM7kt3InWMlOH5r9JyqY
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10447 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x2F4FD47EC358FB66L ^ 0x6F6FD47EC358FB66L), Double.longBitsToDouble((long)1181271342 ^ 0x401000004668C52EL), Double.longBitsToDouble((long)1205733977 ^ 0x4060000047DE0A59L), ((int)-1511200159L ^ 0xA5ECEA60) != 0));
    private final MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK Field10448 = new MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK(this).Method3788().Method3789();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10449 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("EdgeOf", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)2044779299 ^ 0x401C000079E0DB23L), (boolean)((long)-1872958844 ^ (long)-1872958844)));
    private List Field10450 = new Vector();
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field10451 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method2526, new Predicate[(int)-18158251L ^ 0xFEEAED55]);
    private String Field10452 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public rfELj5YPm7hkYM7kt3InWMlOH5r9JyqY() {
        super("NewChunks", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    @Override
    public void Method38() {
        if (rfELj5YPm7hkYM7kt3InWMlOH5r9JyqY.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && rfELj5YPm7hkYM7kt3InWMlOH5r9JyqY.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field10451);
            return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field10451);
        this.Field10450.clear();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2524(RenderWorldLastEvent renderWorldLastEvent) {
        if (rfELj5YPm7hkYM7kt3InWMlOH5r9JyqY.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (rfELj5YPm7hkYM7kt3InWMlOH5r9JyqY.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
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
            Ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq = (Ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq)iterator.next();
            AxisAlignedBB axisAlignedBB = new AxisAlignedBB((double)((Integer)ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq.Method2522()).intValue() + d, 0.0, (double)((Integer)ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq.Method2523()).intValue() + d, (double)((Integer)ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq.Method2522()).intValue() + d2, 0.0, (double)((Integer)ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq.Method2523()).intValue() + d2);
            this.Field10448.Method3804(axisAlignedBB);
        }
    }

    private boolean Method2525(Ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq) {
        int n;
        if (rfELj5YPm7hkYM7kt3InWMlOH5r9JyqY.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq((double)((Integer)ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq.Method2522() + ((int)((long)1406734314 ^ (long)1406734315) << 3)), rfELj5YPm7hkYM7kt3InWMlOH5r9JyqY.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, (double)((Integer)ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq.Method2523() + ((int)((long)-814979956 ^ (long)-814979955) << 3))) <= (double)this.Field10447.Method335()) {
            n = (int)((long)-900409294 ^ (long)-900409293);
            return n != 0;
        }
        n = (int)((long)-2136747063 ^ (long)-2136747063);
        return n != 0;
    }

    private void Method2526(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketChunkData)) {
            return;
        }
        SPacketChunkData sPacketChunkData = (SPacketChunkData)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
        if (sPacketChunkData.isFullChunk()) {
            return;
        }
        Ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq = new Ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq(sPacketChunkData.getChunkX() * ((int)((long)-1957710124 ^ (long)-1957710123) << 4), sPacketChunkData.getChunkZ() * (((int)1515083383L ^ 0x5A4E5676) << 4));
        if (this.Field10450.contains(ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq)) return;
        this.Field10450.add(ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-849532125L ^ 0xCD5D2B23;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-69090691 ^ (long)-69090686);
            int n2 = ((int)733164040L ^ 0x2BB33201) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1244466655 ^ (long)1244466122) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

