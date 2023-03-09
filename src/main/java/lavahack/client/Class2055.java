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

import lavahack.client.Class1036;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class2055
extends Class42 {
    private final Class44 Field17406 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 1.0, Double.longBitsToDouble((long)1709093911 ^ 0x4049000065DEB417L), false));
    private String Field17407 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class2055() {
        super("ObjectMouseOver", Class97.Field8345, true);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7574(RenderWorldLastEvent renderWorldLastEvent) {
        if (Class2055.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class2055.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        Vec3d vec3d = Class1036.Method4206();
        float f = Float.intBitsToFloat(1135869952);
        float f2 = Class2055.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        return (void)((f2 % f + f) % f);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 28;
            cArray2[n] = (char)(cArray[n] ^ (0x2E94 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

