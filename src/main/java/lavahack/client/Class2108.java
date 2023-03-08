//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraftforge.client.event.*;
import net.minecraft.entity.*;
import net.minecraftforge.fml.common.eventhandler.*;
import org.lwjgl.input.*;

public class Class2108 extends Class42
{
    private final Class44 Field17593;
    private final Class44 Field17594;
    private final Class44 Field17595;
    private final Class44 Field17596;
    private final Class44 Field17597;
    private int Field17598;
    private int Field17599;
    
    public Class2108() {
        super("YawLock", Class97.Field8341);
        this.Field17593 = this.Method23(new Class44("Diagonals", this, true));
        this.Field17594 = this.Method23(new Class44("Entities", this, false));
        this.Field17595 = this.Method23(new Class44("IgnoreTicks", this, Double.longBitsToDouble(4616189618054758400L), 0.0, Double.longBitsToDouble((long)2008707667 ^ 0x4034000077BA7253L), true));
        this.Field17596 = this.Method23(new Class44("Interpolate", this, true));
        this.Field17597 = this.Method23(new Class44("Speed", this, Double.longBitsToDouble(4591870180066957722L), 0.0, Double.longBitsToDouble((long)831931330 ^ 0x40140000319643C2L), false).Method313(this.Field17596::Method365));
        this.Field17598 = 0;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method7648(final RenderWorldLastEvent renderWorldLastEvent) {
        if (Class2108.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class2108.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        if (Class2108.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.mouseHelper.deltaX != 0 || Class2108.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.mouseHelper.deltaY != 0 || Method7649()) {
            this.Field17598 = this.Field17595.Method335();
            return;
        }
        if (this.Field17598 > 0) {
            --this.Field17598;
            return;
        }
        final float n = Float.intBitsToFloat(1135869952) / (this.Field17593.Method365() ? Float.intBitsToFloat(1090519040) : Float.intBitsToFloat(1082130432));
        final float n2 = Math.round((Class2108.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw + Float.intBitsToFloat(1127481344)) / n) * n - Float.intBitsToFloat(1127481344);
        Class2108.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevRotationYaw = Class2108.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        Class2108.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = (this.Field17596.Method365() ? Class567.Method2508(Class2108.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, n2, Class2108.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderPartialTicks(), this.Field17597.Method368()) : n2);
        final Entity getRidingEntity = Class2108.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getRidingEntity();
        if (this.Field17594.Method365() && getRidingEntity != null) {
            getRidingEntity.prevRotationYaw = getRidingEntity.rotationYaw;
            getRidingEntity.rotationYaw = Class2108.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        }
    }
    
    private static boolean Method7649() {
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
                value[i] = (char)(charArray[i] ^ (0x2181 ^ 0x7C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
