//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.block.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.item.*;
import java.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.client.network.*;
import net.minecraft.util.*;

@Deprecated
public class Class1564 extends Class42
{
    private final Class44 Field15284;
    private final Class44 Field15285;
    private final Class44 Field15286;
    private final Class44 Field15287;
    private final Class44 Field15288;
    private final Class44 Field15289;
    private final Class44 Field15290;
    private final Class44 Field15291;
    private final Class44 Field15292;
    private final Class44 Field15293;
    private BlockPos Field15294;
    private String Field15295 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1564() {
        super("Burrow", Class97.Field8338);
        this.Field15284 = new Class44("Offset", this, Double.longBitsToDouble(4619567317775286272L), Double.longBitsToDouble(-4597049319638433792L), Double.longBitsToDouble((long)1075492929 ^ 0x40340000401AB841L), false);
        this.Field15285 = new Class44("SmartOffset", this, false);
        this.Field15286 = new Class44("Block", this, Class613.Field10609);
        this.Field15287 = new Class44("Switch", this, Class711.Field11028);
        this.Field15288 = new Class44("Rotate", this, false);
        this.Field15289 = new Class44("Packet", this, false);
        this.Field15290 = new Class44("Center", this, false);
        this.Field15291 = new Class44("FloorY", this, false).Method313(this.Field15290::Method365);
        this.Field15292 = new Class44("SmartOnGround", this, false);
        this.Field15293 = new Class44("KeepOn", this, false);
        this.Field15294 = null;
        Class1564.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15284);
        Class1564.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15285);
        Class1564.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15286);
        Class1564.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15287);
        Class1564.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15288);
        Class1564.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15289);
        Class1564.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15290);
        Class1564.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15291);
        Class1564.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15292);
        Class1564.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15293);
    }
    
    private int Method6155() {
        return Class9.Method127((Block)((Class613)this.Field15286.Method341()).Method2630().Method1726(new Object[0]));
    }
    
    private void Method6156(final int i, final boolean b) {
        ((Class711)this.Field15287.Method341()).Method2972().Method1726(i, b);
    }
    
    private boolean Method6157(final BlockPos blockPos) {
        if (!Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getMaterial().isReplaceable()) {
            return false;
        }
        for (final Entity entity : Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB(blockPos))) {
            if (!entity.equals((Object)Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) && !(entity instanceof EntityItem)) {
                if (entity instanceof EntityXPOrb) {
                    continue;
                }
                return false;
            }
        }
        return true;
    }
    
    private void Method6158() {
        final double n = Math.floor(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble((long)1100543050 ^ 0x3FE000004198F44AL);
        final double n2 = this.Field15291.Method365() ? Math.floor(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) : Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        final double n3 = Math.floor(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble((long)1209744320 ^ 0x3FE00000481B3BC0L);
        if ((long)n2 != n2 || Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(n, n2, n3).down()).getMaterial().isReplaceable()) {}
        Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        final NetHandlerPlayClient connection = Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection;
        final double n4 = n;
        final double n5 = n2;
        final double n6 = n3;
        if (this.Field15292.Method365()) {}
        connection.sendPacket((Packet)new CPacketPlayer$Position(n4, n5, n6, true));
    }
    
    private void Method6159() {
        Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(4601237667055665185L), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
        Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(4604959441848497896L), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
        Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(4607188435515049016L), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
        Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(4607930508405681519L), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
    }
    
    private void Method6160(final BlockPos blockPos, final int n) {
        final int currentItem = Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        this.Method6156(n, false);
        Class1036.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field15288.Method365(), this.Field15289.Method365());
        this.Method6156(currentItem, true);
    }
    
    private double Method6161() {
        if (!this.Field15285.Method365() || this.Field15284.Method367() < Double.longBitsToDouble(4611686018427387904L)) {
            return this.Field15284.Method367();
        }
        for (int n = 0; n <= Math.ceil(this.Field15284.Method367()); ++n) {
            final BlockPos blockPos = new BlockPos(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble(4599075939470750515L), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + n + Double.longBitsToDouble(4611686018427387904L), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble(4599075939470750515L));
            final BlockPos blockPos2 = new BlockPos(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble((long)743338930 ^ 0x3FD333331F7D4081L), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + n + Double.longBitsToDouble(4611686018427387904L), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble(4599075939470750515L));
            final BlockPos blockPos3 = new BlockPos(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble((long)886409322 ^ 0x3FD3333307E6BB59L), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + n + Double.longBitsToDouble((long)386632469 ^ 0x40000000170B8B15L), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble((long)468747026 ^ 0x3FD3333328C3B021L));
            final BlockPos blockPos4 = new BlockPos(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble((long)105032344 ^ 0x3FD33333357199ABL), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + n + Double.longBitsToDouble(4611686018427387904L), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble(4599075939470750515L));
            final boolean b = !Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getMaterial().isReplaceable();
            final boolean b2 = !Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2).getMaterial().isReplaceable();
            final boolean b3 = !Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos3).getMaterial().isReplaceable();
            final boolean b4 = !Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos4).getMaterial().isReplaceable();
        }
        return this.Field15284.Method367();
    }
    
    @Override
    public void Method38() {
        this.Field15294 = new BlockPos(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        if (this.Field15290.Method365()) {
            this.Method6158();
        }
    }
    
    @Override
    public void Method45() {
        if (Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        final int method6155 = this.Method6155();
        if (method6155 == -1) {
            if (!this.Field15293.Method365()) {
                this.Method22();
            }
            return;
        }
        if (!this.Method6157(this.Field15294)) {
            if (!this.Field15293.Method365()) {
                this.Method22();
            }
            return;
        }
        this.Method6159();
        this.Method6160(this.Field15294, method6155);
        Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + this.Method6161(), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, false));
        if (this.Field15293.Method365()) {
            return;
        }
        this.Method22();
    }
    
    @Override
    public void Method39() {
        this.Field15294 = null;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1A27 ^ 0x4D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
