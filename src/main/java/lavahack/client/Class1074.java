//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketConfirmTeleport
 *  net.minecraft.network.play.client.CPacketPlayer
 *  net.minecraft.network.play.client.CPacketPlayer$PositionRotation
 *  net.minecraft.network.play.server.SPacketPlayerPosLook
 *  net.minecraft.network.play.server.SPacketPlayerPosLook$EnumFlags
 */
package lavahack.client;

import com.kisman.cc.mixin.mixins.accessor.AccessorNetHandlerPlayClient;
import com.kisman.cc.util.Class2142;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketConfirmTeleport;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.server.SPacketPlayerPosLook;

public class Class1074
implements Class2142 {
    private int Field12738;

    public static void Method4344(SPacketPlayerPosLook sPacketPlayerPosLook, Entity entity, boolean bl) {
        Class1074.Method4345(sPacketPlayerPosLook, entity, bl, false);
    }

    public static void Method4345(SPacketPlayerPosLook sPacketPlayerPosLook, Entity entity, boolean bl, boolean bl2) {
        double d = sPacketPlayerPosLook.getX();
        double d2 = sPacketPlayerPosLook.getY();
        double d3 = sPacketPlayerPosLook.getZ();
        float f = sPacketPlayerPosLook.getYaw();
        float f2 = sPacketPlayerPosLook.getPitch();
        if (sPacketPlayerPosLook.getFlags().contains(SPacketPlayerPosLook.EnumFlags.X)) {
            d += entity.posX;
        } else {
            entity.motionX = 0.0;
        }
        if (sPacketPlayerPosLook.getFlags().contains(SPacketPlayerPosLook.EnumFlags.Y)) {
            d2 += entity.posY;
        } else {
            entity.motionY = 0.0;
        }
        if (sPacketPlayerPosLook.getFlags().contains(SPacketPlayerPosLook.EnumFlags.Z)) {
            d3 += entity.posZ;
        } else {
            entity.motionZ = 0.0;
        }
        if (sPacketPlayerPosLook.getFlags().contains(SPacketPlayerPosLook.EnumFlags.X_ROT)) {
            f2 += entity.rotationPitch;
        }
        if (sPacketPlayerPosLook.getFlags().contains(SPacketPlayerPosLook.EnumFlags.Y_ROT)) {
            f += entity.rotationYaw;
        }
        entity.setPositionAndRotation(d, d2, d3, bl ? entity.rotationYaw : f, bl ? entity.rotationPitch : f2);
        CPacketConfirmTeleport cPacketConfirmTeleport = new CPacketConfirmTeleport(sPacketPlayerPosLook.getTeleportId());
        CPacketPlayer cPacketPlayer = Class1074.Method4346(entity.posX, entity.getEntityBoundingBox().minY, entity.posZ, f, f2, false);
        if (bl2) {
            Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)cPacketConfirmTeleport);
            Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)cPacketPlayer);
        } else {
            Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)cPacketConfirmTeleport);
            Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)cPacketPlayer);
        }
        ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.addScheduledTask(Class1074::Method4347);
    }

    public static CPacketPlayer Method4346(double d, double d2, double d3, float f, float f2, boolean bl) {
        return new CPacketPlayer.PositionRotation(d, d2, d3, f, f2, bl);
    }

    public static void Method4347() {
        ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.addScheduledTask(Class1074::Method4348);
    }

    private static void Method4348() {
        if (((AccessorNetHandlerPlayClient)Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection).Method5234()) return;
        Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.prevPosX = Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.posX;
        Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.prevPosY = Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.posY;
        Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.prevPosZ = Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.posZ;
        ((AccessorNetHandlerPlayClient)Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection).Method5235(true);
        ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.displayGuiScreen(null);
    }
}

