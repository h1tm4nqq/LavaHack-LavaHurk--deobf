//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.util.function.*;
import net.minecraft.util.math.*;
import net.minecraft.block.*;
import net.minecraft.client.entity.*;
import net.minecraft.network.play.server.*;
import net.minecraft.world.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.entity.*;

@Class2012
public class Class1809 extends Class42
{
    private final Class44 Field16322;
    private final Class44 Field16323;
    private final Class44 Field16324;
    private final Class44 Field16325;
    private final Class44 Field16326;
    private final Class44 Field16327;
    @Class1801
    private final Class618 Field16328;
    @Class1801
    private final Class618 Field16329;
    @Class1801
    private final Class618 Field16330;
    @Class1801
    private final Class618 Field16331;
    private String Field16332 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1809() {
        super("Velocity", "akb", Class97.Field8341);
        this.Field16322 = this.Method23(new Class44("Mode", this, "None", Arrays.asList("None", "Matrix", "Matrix 6.4", "Vanilla")));
        this.Field16323 = this.Method23(new Class44("Explosion", this, true));
        this.Field16324 = this.Method23(new Class44("Bobbers", this, true));
        this.Field16325 = this.Method23(new Class44("NoPush", this, true));
        this.Field16326 = this.Method23(new Class44("Horizontal", this, Double.longBitsToDouble(4636033603912859648L), 0.0, Double.longBitsToDouble(4636737291354636288L), true));
        this.Field16327 = this.Method23(new Class44("Vertical", this, Double.longBitsToDouble(4636737291354636288L), 0.0, Double.longBitsToDouble((long)593972255 ^ 0x4059000023674C1FL), true));
        this.Field16328 = new Class618(this::Method6831, new Predicate[0]);
        this.Field16329 = new Class618(this::Method6830, new Predicate[0]);
        this.Field16330 = new Class618(this::Method6829, new Predicate[0]);
        this.Field16331 = new Class618(this::Method6828, new Predicate[0]);
        super.Method44(this::Method6832);
    }
    
    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field16331);
        Class1796.Field16242.Method706(this.Field16328);
        Class1796.Field16242.Method706(this.Field16329);
        Class1796.Field16242.Method706(this.Field16330);
    }
    
    @Override
    public void Method45() {
        if (Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field16322.Method309("Matrix") && Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getBlock() == Block.getBlockById(0) && Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.hurtTime > 0) {
            Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble(-4626998257160447590L);
        }
        else if (this.Field16322.Method309("Matrix 6.4") && Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.hurtTime > 8) {
            Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = true;
        }
        else if (this.Field16322.Method309("Vanilla") && Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.hurtTime == Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.maxHurtTime) {
            final EntityPlayerSP player = Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
            player.motionX *= this.Field16326.Method335() / Double.longBitsToDouble(4636737291354636288L);
            final EntityPlayerSP player2 = Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
            player2.motionY *= this.Field16327.Method335() / Double.longBitsToDouble((long)2003348113 ^ 0x405900007768AA91L);
            final EntityPlayerSP player3 = Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
            player3.motionZ *= this.Field16326.Method335() / Double.longBitsToDouble(4636737291354636288L);
        }
    }
    
    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field16331);
        Class1796.Field16242.Method711(this.Field16328);
        Class1796.Field16242.Method711(this.Field16329);
        Class1796.Field16242.Method711(this.Field16330);
    }
    
    private void Method6828(final Class544 class544) {
        if (class544.Method982() instanceof SPacketEntityVelocity && ((SPacketEntityVelocity)class544.Method982()).getEntityID() == Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityId()) {
            class544.Method158();
        }
        if (class544.Method982() instanceof SPacketExplosion && this.Field16323.Method365()) {
            class544.Method158();
        }
        if (class544.Method982() instanceof SPacketEntityStatus && this.Field16324.Method365()) {
            final SPacketEntityStatus sPacketEntityStatus = (SPacketEntityStatus)class544.Method982();
            if (sPacketEntityStatus.getOpCode() == 31) {
                final Entity getEntity = sPacketEntityStatus.getEntity((World)Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world);
                if (getEntity instanceof EntityFishHook && ((EntityFishHook)getEntity).caughtEntity == Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) {
                    class544.Method158();
                }
            }
        }
    }
    
    private void Method6829(final Class1758 class1758) {
        if (this.Field16325.Method365()) {
            class1758.Method158();
        }
    }
    
    private void Method6830(final Class2030 class2030) {
        if (this.Field16325.Method365()) {
            class2030.Method158();
        }
    }
    
    private void Method6831(final Class1406 class1406) {
        if (this.Field16325.Method365()) {
            class1406.Method158();
        }
    }
    
    private String Method6832() {
        return "[" + this.Field16322 + "]";
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1608 ^ 0x9E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
