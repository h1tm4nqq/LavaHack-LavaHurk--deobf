//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.input.Mouse
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class567;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Mouse;

public class Class2108
extends Class42 {
    private final Class44 Field17593 = this.Method23(new Class44("Diagonals", (Class42)this, true));
    private final Class44 Field17594 = this.Method23(new Class44("Entities", (Class42)this, false));
    private final Class44 Field17595 = this.Method23(new Class44("IgnoreTicks", (Class42)this, Double.longBitsToDouble(0x4010000000000000L), 0.0, Double.longBitsToDouble((long)2008707667 ^ 0x4034000077BA7253L), true));
    private final Class44 Field17596 = this.Method23(new Class44("Interpolate", (Class42)this, true));
    private final Class44 Field17597 = this.Method23(new Class44("Speed", (Class42)this, Double.longBitsToDouble(4591870180066957722L), 0.0, Double.longBitsToDouble((long)831931330 ^ 0x40140000319643C2L), false).Method313(this.Field17596::Method365));
    private int Field17598 = 0;
    private int Field17599;

    public Class2108() {
        super("YawLock", Class97.Field8341);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7648(RenderWorldLastEvent renderWorldLastEvent) {
        if (Class2108.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class2108.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        if (Class2108.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.mouseHelper.deltaX != 0 || Class2108.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.mouseHelper.deltaY != 0 || Class2108.Method7649()) {
            this.Field17598 = this.Field17595.Method335();
            return;
        }
        if (this.Field17598 > 0) {
            --this.Field17598;
            return;
        }
        float f = Float.intBitsToFloat(1135869952) / (this.Field17593.Method365() ? Float.intBitsToFloat(0x41000000) : Float.intBitsToFloat(0x40800000));
        float f2 = Class2108.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw + Float.intBitsToFloat(0x43340000);
        f2 = (float)Math.round(f2 / f) * f;
        Class2108.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevRotationYaw = Class2108.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        Class2108.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = this.Field17596.Method365() ? Class567.Method2508(Class2108.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, f2, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderPartialTicks(), this.Field17597.Method368()) : (f2 -= Float.intBitsToFloat(0x43340000));
        Entity entity = Class2108.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getRidingEntity();
        if (!this.Field17594.Method365()) return;
        if (entity == null) return;
        entity.prevRotationYaw = entity.rotationYaw;
        entity.rotationYaw = Class2108.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
    }

    private static boolean Method7649() {
        int n = 0;
        while (n < Mouse.getButtonCount()) {
            if (Mouse.isButtonDown((int)n)) {
                return true;
            }
            ++n;
        }
        return false;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 124;
            cArray2[n] = (char)(cArray[n] ^ (0x2181 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

