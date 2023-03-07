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
import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketConfirmTeleport;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.server.SPacketPlayerPosLook;

public class Xk5sPHveL7cs0etgQcPiiTDg9MaCU9uc
implements Ljc0gDTN8WkwPRHY480HpEkScGALG41A {
    private int Field12738;

    public static void Method4344(SPacketPlayerPosLook sPacketPlayerPosLook, Entity entity, boolean bl) {
        Xk5sPHveL7cs0etgQcPiiTDg9MaCU9uc.Method4345(sPacketPlayerPosLook, entity, bl, (boolean)((long)-1163770932 ^ (long)-1163770932));
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
        CPacketPlayer cPacketPlayer = Xk5sPHveL7cs0etgQcPiiTDg9MaCU9uc.Method4346(entity.posX, entity.getEntityBoundingBox().minY, entity.posZ, f, f2, (boolean)((long)478710460 ^ (long)478710460));
        if (bl2) {
            Xk5sPHveL7cs0etgQcPiiTDg9MaCU9uc.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)cPacketConfirmTeleport);
            Xk5sPHveL7cs0etgQcPiiTDg9MaCU9uc.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)cPacketPlayer);
        } else {
            Xk5sPHveL7cs0etgQcPiiTDg9MaCU9uc.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)cPacketConfirmTeleport);
            Xk5sPHveL7cs0etgQcPiiTDg9MaCU9uc.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)cPacketPlayer);
        }
        ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.addScheduledTask(Xk5sPHveL7cs0etgQcPiiTDg9MaCU9uc::Method4347);
    }

    public static CPacketPlayer Method4346(double d, double d2, double d3, float f, float f2, boolean bl) {
        return new CPacketPlayer.PositionRotation(d, d2, d3, f, f2, bl);
    }

    public static void Method4347() {
        ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.addScheduledTask(Xk5sPHveL7cs0etgQcPiiTDg9MaCU9uc::Method4348);
    }

    private static void Method4348() {
        if (((AccessorNetHandlerPlayClient)Xk5sPHveL7cs0etgQcPiiTDg9MaCU9uc.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection).Method5234()) return;
        Xk5sPHveL7cs0etgQcPiiTDg9MaCU9uc.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.prevPosX = Xk5sPHveL7cs0etgQcPiiTDg9MaCU9uc.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.posX;
        Xk5sPHveL7cs0etgQcPiiTDg9MaCU9uc.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.prevPosY = Xk5sPHveL7cs0etgQcPiiTDg9MaCU9uc.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.posY;
        Xk5sPHveL7cs0etgQcPiiTDg9MaCU9uc.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.prevPosZ = Xk5sPHveL7cs0etgQcPiiTDg9MaCU9uc.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.posZ;
        ((AccessorNetHandlerPlayClient)Xk5sPHveL7cs0etgQcPiiTDg9MaCU9uc.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection).Method5235(((int)-121026677L ^ 0xF8C9478A) != 0);
        ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.displayGuiScreen(null);
    }
}

