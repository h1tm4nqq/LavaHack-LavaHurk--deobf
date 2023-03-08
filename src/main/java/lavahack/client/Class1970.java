//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraftforge.client.event.*;
import net.minecraft.entity.*;
import net.minecraftforge.fml.common.eventhandler.*;
import org.lwjgl.input.*;

public class Class1970 extends Class42
{
    private final Class1303 Field17062;
    private final Class44 Field17063;
    private final Class44 Field17064;
    private final Class44 Field17065;
    private final Class44 Field17066;
    private final Class44 Field17067;
    private final Class44 Field17068;
    private int Field17069;
    private int Field17070;
    
    public Class1970() {
        super("YawStep", Class97.Field8341);
        this.Field17062 = new Class1303("Mode", (Class42)this, (Enum)Class808.Field11447).Method5303();
        this.Field17063 = this.Method23(new Class44("Section", this, Double.longBitsToDouble(4616189618054758400L), 1.0, Double.longBitsToDouble((long)1042999872 ^ 0x403000003E2AEA40L), true).Method314(this.Field17062.Method341() == Class808.Field11447));
        this.Field17064 = this.Method23(new Class44("Angle", this, Double.longBitsToDouble((long)1230803490 ^ 0x40568000495C9222L), 1.0, Double.longBitsToDouble(4645040803167600640L), true).Method314(this.Field17062.Method341() == Class808.Field11448));
        this.Field17065 = this.Method23(new Class44("Entities", this, false));
        this.Field17066 = this.Method23(new Class44("IgnoreTicks", this, Double.longBitsToDouble((long)150565022 ^ 0x4010000008F9709EL), 0.0, Double.longBitsToDouble(4626322717216342016L), true));
        this.Field17067 = this.Method23(new Class44("Interpolate", this, true));
        this.Field17068 = this.Method23(new Class44("Speed", this, Double.longBitsToDouble((long)442817283 ^ 0x3FB9999983FD4299L), 0.0, Double.longBitsToDouble((long)1920756877 ^ 0x40140000727C6C8DL), false).Method313(this.Field17067::Method365));
        this.Field17069 = 0;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method7290(final RenderWorldLastEvent renderWorldLastEvent) {
        if (Class1970.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1970.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        if (Class1970.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.mouseHelper.deltaX != 0 || Class1970.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.mouseHelper.deltaY != 0 || Method7291()) {
            this.Field17069 = this.Field17066.Method335();
            return;
        }
        if (this.Field17069 > 0) {
            --this.Field17069;
            return;
        }
        float method368;
        if (this.Field17062.Method341() == Class808.Field11447) {
            method368 = Float.intBitsToFloat(1135869952) / this.Field17063.Method335();
        }
        else {
            method368 = this.Field17064.Method368();
        }
        final float n2;
        final float n = Math.round((n2 = Class1970.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw + Float.intBitsToFloat(1127481344)) / method368) * method368;
        final float n3 = n + (n2 - n) - Float.intBitsToFloat(1127481344);
        Class1970.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevRotationYaw = Class1970.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        Class1970.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = (this.Field17067.Method365() ? Class567.Method2508(Class1970.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, n3, Class1970.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderPartialTicks(), this.Field17068.Method368()) : n3);
        final Entity getRidingEntity = Class1970.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getRidingEntity();
        if (this.Field17065.Method365() && getRidingEntity != null) {
            getRidingEntity.prevRotationYaw = getRidingEntity.rotationYaw;
            getRidingEntity.rotationYaw = Class1970.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        }
    }
    
    private static boolean Method7291() {
        for (int i = 0; i < Mouse.getButtonCount(); ++i) {
            if (Mouse.isButtonDown(i)) {
                return true;
            }
        }
        return false;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3F55 ^ 0xE9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
