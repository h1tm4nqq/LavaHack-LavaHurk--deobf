//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.projectile.EntityFishHook
 *  net.minecraft.network.play.server.SPacketEntityStatus
 *  net.minecraft.network.play.server.SPacketEntityVelocity
 *  net.minecraft.network.play.server.SPacketExplosion
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package lavahack.client;

import java.util.Arrays;
import java.util.function.Predicate;
import lavahack.client.Class1406;
import lavahack.client.Class1758;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class2012;
import lavahack.client.Class2030;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class97;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.network.play.server.SPacketEntityStatus;
import net.minecraft.network.play.server.SPacketEntityVelocity;
import net.minecraft.network.play.server.SPacketExplosion;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@Class2012
public class Class1809
extends Class42 {
    private final Class44 Field16322 = this.Method23(new Class44("Mode", (Class42)this, "None", Arrays.asList("None", "Matrix", "Matrix 6.4", "Vanilla")));
    private final Class44 Field16323 = this.Method23(new Class44("Explosion", (Class42)this, true));
    private final Class44 Field16324 = this.Method23(new Class44("Bobbers", (Class42)this, true));
    private final Class44 Field16325 = this.Method23(new Class44("NoPush", (Class42)this, true));
    private final Class44 Field16326 = this.Method23(new Class44("Horizontal", (Class42)this, Double.longBitsToDouble(4636033603912859648L), 0.0, Double.longBitsToDouble(4636737291354636288L), true));
    private final Class44 Field16327 = this.Method23(new Class44("Vertical", (Class42)this, Double.longBitsToDouble(4636737291354636288L), 0.0, Double.longBitsToDouble((long)593972255 ^ 0x4059000023674C1FL), true));
    @Class1801
    private final Class618 Field16328 = new Class618(this::Method6831, new Predicate[0]);
    @Class1801
    private final Class618 Field16329 = new Class618(this::Method6830, new Predicate[0]);
    @Class1801
    private final Class618 Field16330 = new Class618(this::Method6829, new Predicate[0]);
    @Class1801
    private final Class618 Field16331 = new Class618(this::Method6828, new Predicate[0]);
    private String Field16332 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1809() {
        super("Velocity", "akb", Class97.Field8341);
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
        if (Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field16322.Method309("Matrix") && Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getBlock() == Block.getBlockById((int)0) && Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.hurtTime > 0) {
            Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble(-4626998257160447590L);
            return;
        }
        if (this.Field16322.Method309("Matrix 6.4") && Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.hurtTime > 8) {
            Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = true;
            return;
        }
        if (!this.Field16322.Method309("Vanilla")) return;
        if (Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.hurtTime != Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.maxHurtTime) return;
        Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX *= (double)this.Field16326.Method335() / Double.longBitsToDouble(4636737291354636288L);
        Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY *= (double)this.Field16327.Method335() / Double.longBitsToDouble((long)2003348113 ^ 0x405900007768AA91L);
        Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ *= (double)this.Field16326.Method335() / Double.longBitsToDouble(4636737291354636288L);
    }

    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field16331);
        Class1796.Field16242.Method711(this.Field16328);
        Class1796.Field16242.Method711(this.Field16329);
        Class1796.Field16242.Method711(this.Field16330);
    }

    private void Method6828(Class544 class544) {
        if (class544.Method982() instanceof SPacketEntityVelocity && ((SPacketEntityVelocity)class544.Method982()).getEntityID() == Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityId()) {
            class544.Method158();
        }
        if (class544.Method982() instanceof SPacketExplosion && this.Field16323.Method365()) {
            class544.Method158();
        }
        if (!(class544.Method982() instanceof SPacketEntityStatus)) return;
        if (!this.Field16324.Method365()) return;
        SPacketEntityStatus sPacketEntityStatus = (SPacketEntityStatus)class544.Method982();
        if (sPacketEntityStatus.getOpCode() != 31) return;
        Entity entity = sPacketEntityStatus.getEntity((World)Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world);
        if (!(entity instanceof EntityFishHook)) return;
        if (((EntityFishHook)entity).caughtEntity != Class1809.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) return;
        class544.Method158();
    }

    private void Method6829(Class1758 class1758) {
        if (!this.Field16325.Method365()) return;
        class1758.Method158();
    }

    private void Method6830(Class2030 class2030) {
        if (!this.Field16325.Method365()) return;
        class2030.Method158();
    }

    private void Method6831(Class1406 class1406) {
        if (!this.Field16325.Method365()) return;
        class1406.Method158();
    }

    private String Method6832() {
        return "[" + this.Field16322 + "]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 158;
            cArray2[n] = (char)(cArray[n] ^ (0x1608 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

