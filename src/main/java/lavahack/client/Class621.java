//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketEntityAction$Action
 *  net.minecraft.network.play.client.CPacketPlayer
 */
package lavahack.client;

import lavahack.client.Class1026;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketPlayer;

public class Class621
extends Class42 {
    private final Class44 Field10648 = this.Method23(new Class44("Mode", (Class42)this, Class1026.Field12512));
    private int Field10649;

    public Class621() {
        super("Spider", "Allows to walk on walls", Class97.Field8340);
        super.Method44(this::Method2656);
    }

    @Override
    public void Method45() {
        if (Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (this.Field10648.Method309(Class1026.Field12512.name()) && !Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isOnLadder() && Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedHorizontally && Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY < Double.longBitsToDouble((long)1692048699 ^ 0x3FC99999FD4304A1L)) {
            Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble((long)1382139757 ^ 0x3FC99999CBF85EF7L);
            return;
        }
        if (!this.Field10648.Method309(Class1026.Field12513.name())) return;
        if (!Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedHorizontally) return;
        if (Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % 8 != 0) return;
        Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction.Action.START_FALL_FLYING));
        Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble(4601237667291888353L);
        Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance = 0.0f;
        Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer(true));
        Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
    }

    private String Method2656() {
        return "[" + this.Field10648.Method359() + "]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 51;
            cArray2[n] = (char)(cArray[n] ^ (0x518B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

