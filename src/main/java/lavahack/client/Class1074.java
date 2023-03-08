//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import net.minecraft.entity.*;
import net.minecraft.network.play.server.*;
import net.minecraft.network.*;
import net.minecraft.network.play.client.*;
import com.kisman.cc.mixin.mixins.accessor.*;
import net.minecraft.client.gui.*;

public class Class1074 implements Class2142
{
    private int Field12738;
    
    public static void Method4344(final SPacketPlayerPosLook sPacketPlayerPosLook, final Entity entity, final boolean b) {
        Method4345(sPacketPlayerPosLook, entity, b, false);
    }
    
    public static void Method4345(final SPacketPlayerPosLook sPacketPlayerPosLook, final Entity entity, final boolean b, final boolean b2) {
        double getX = sPacketPlayerPosLook.getX();
        double getY = sPacketPlayerPosLook.getY();
        double getZ = sPacketPlayerPosLook.getZ();
        float getYaw = sPacketPlayerPosLook.getYaw();
        float getPitch = sPacketPlayerPosLook.getPitch();
        if (sPacketPlayerPosLook.getFlags().contains(SPacketPlayerPosLook$EnumFlags.X)) {
            getX += entity.posX;
        }
        else {
            entity.motionX = 0.0;
        }
        if (sPacketPlayerPosLook.getFlags().contains(SPacketPlayerPosLook$EnumFlags.Y)) {
            getY += entity.posY;
        }
        else {
            entity.motionY = 0.0;
        }
        if (sPacketPlayerPosLook.getFlags().contains(SPacketPlayerPosLook$EnumFlags.Z)) {
            getZ += entity.posZ;
        }
        else {
            entity.motionZ = 0.0;
        }
        if (sPacketPlayerPosLook.getFlags().contains(SPacketPlayerPosLook$EnumFlags.X_ROT)) {
            getPitch += entity.rotationPitch;
        }
        if (sPacketPlayerPosLook.getFlags().contains(SPacketPlayerPosLook$EnumFlags.Y_ROT)) {
            getYaw += entity.rotationYaw;
        }
        entity.setPositionAndRotation(getX, getY, getZ, b ? entity.rotationYaw : getYaw, b ? entity.rotationPitch : getPitch);
        final CPacketConfirmTeleport cPacketConfirmTeleport = new CPacketConfirmTeleport(sPacketPlayerPosLook.getTeleportId());
        final CPacketPlayer method4346 = Method4346(entity.posX, entity.getEntityBoundingBox().minY, entity.posZ, getYaw, getPitch, false);
        if (b2) {
            Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)cPacketConfirmTeleport);
            Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)method4346);
        }
        else {
            Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)cPacketConfirmTeleport);
            Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)method4346);
        }
        Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.addScheduledTask(Class1074::Method4347);
    }
    
    public static CPacketPlayer Method4346(final double n, final double n2, final double n3, final float n4, final float n5, final boolean b) {
        return (CPacketPlayer)new CPacketPlayer$PositionRotation(n, n2, n3, n4, n5, b);
    }
    
    public static void Method4347() {
        Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.addScheduledTask(Class1074::Method4348);
    }
    
    private static void Method4348() {
        if (!((AccessorNetHandlerPlayClient)Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection).Method5234()) {
            Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.prevPosX = Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.posX;
            Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.prevPosY = Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.posY;
            Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.prevPosZ = Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.posZ;
            ((AccessorNetHandlerPlayClient)Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection).Method5235(true);
            Class1074.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.displayGuiScreen((GuiScreen)null);
        }
    }
}
