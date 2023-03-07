//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class t1VocxLVZLuqu2mSJV1MeOkc8PsDuGTO
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17406 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x78CBB351835B3FFDL ^ 0x38DFB351835B3FFDL), 1.0, Double.longBitsToDouble((long)1709093911 ^ 0x4049000065DEB417L), (boolean)((long)-1109549173 ^ (long)-1109549173)));
    private String Field17407 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public t1VocxLVZLuqu2mSJV1MeOkc8PsDuGTO() {
        super("ObjectMouseOver", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345, (boolean)((long)-919791117 ^ (long)-919791118));
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7574(RenderWorldLastEvent renderWorldLastEvent) {
        if (t1VocxLVZLuqu2mSJV1MeOkc8PsDuGTO.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (t1VocxLVZLuqu2mSJV1MeOkc8PsDuGTO.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        Vec3d vec3d = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4206();
        float f = Float.intBitsToFloat(0x242ADEEE ^ 0x679EDEEE);
        float f2 = t1VocxLVZLuqu2mSJV1MeOkc8PsDuGTO.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        return (void)((f2 % f + f) % f);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-36020715L ^ 0xFDDA5E15;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)981867228 ^ (long)981867043);
            int n2 = ((int)-864064911L ^ 0xCC7F6A76) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1772490631L ^ 0x9659FBDC) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

