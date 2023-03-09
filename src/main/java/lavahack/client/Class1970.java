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

import lavahack.client.Class1303;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class567;
import lavahack.client.Class808;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Mouse;

public class Class1970
extends Class42 {
    private final Class1303 Field17062 = new Class1303("Mode", (Class42)this, Class808.Field11447).Method5303();
    private final Class44 Field17063 = this.Method23(new Class44("Section", (Class42)this, Double.longBitsToDouble(0x4010000000000000L), 1.0, Double.longBitsToDouble((long)1042999872 ^ 0x403000003E2AEA40L), true).Method314(this.Field17062.Method341() == Class808.Field11447));
    private final Class44 Field17064 = this.Method23(new Class44("Angle", (Class42)this, Double.longBitsToDouble((long)1230803490 ^ 0x40568000495C9222L), 1.0, Double.longBitsToDouble(4645040803167600640L), true).Method314(this.Field17062.Method341() == Class808.Field11448));
    private final Class44 Field17065 = this.Method23(new Class44("Entities", (Class42)this, false));
    private final Class44 Field17066 = this.Method23(new Class44("IgnoreTicks", (Class42)this, Double.longBitsToDouble((long)150565022 ^ 0x4010000008F9709EL), 0.0, Double.longBitsToDouble(0x4034000000000000L), true));
    private final Class44 Field17067 = this.Method23(new Class44("Interpolate", (Class42)this, true));
    private final Class44 Field17068 = this.Method23(new Class44("Speed", (Class42)this, Double.longBitsToDouble((long)442817283 ^ 0x3FB9999983FD4299L), 0.0, Double.longBitsToDouble((long)1920756877 ^ 0x40140000727C6C8DL), false).Method313(this.Field17067::Method365));
    private int Field17069 = 0;
    private int Field17070;

    public Class1970() {
        super("YawStep", Class97.Field8341);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7290(RenderWorldLastEvent renderWorldLastEvent) {
        float f;
        if (Class1970.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1970.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        if (Class1970.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.mouseHelper.deltaX != 0 || Class1970.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.mouseHelper.deltaY != 0 || Class1970.Method7291()) {
            this.Field17069 = this.Field17066.Method335();
            return;
        }
        if (this.Field17069 > 0) {
            --this.Field17069;
            return;
        }
        float f2 = this.Field17062.Method341() == Class808.Field11447 ? Float.intBitsToFloat(1135869952) / (float)this.Field17063.Method335() : this.Field17064.Method368();
        float f3 = f = Class1970.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw + Float.intBitsToFloat(0x43340000);
        f = (float)Math.round(f / f2) * f2;
        f += f3 - f;
        Class1970.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevRotationYaw = Class1970.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        Class1970.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = this.Field17067.Method365() ? Class567.Method2508(Class1970.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, f, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderPartialTicks(), this.Field17068.Method368()) : (f -= Float.intBitsToFloat(0x43340000));
        Entity entity = Class1970.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getRidingEntity();
        if (!this.Field17065.Method365()) return;
        if (entity == null) return;
        entity.prevRotationYaw = entity.rotationYaw;
        entity.rotationYaw = Class1970.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
    }

    private static boolean Method7291() {
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
            int n2 = 233;
            cArray2[n] = (char)(cArray[n] ^ (0x3F55 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

