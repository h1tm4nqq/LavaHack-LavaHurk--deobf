//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.entity.*;
import net.minecraft.network.*;
import net.minecraft.network.play.client.*;

public class Class621 extends Class42
{
    private final Class44 Field10648;
    private int Field10649;
    
    public Class621() {
        super("Spider", "Allows to walk on walls", Class97.Field8340);
        this.Field10648 = this.Method23(new Class44("Mode", (Class42)this, (Enum)Class1026.Field12512));
        super.Method44((Supplier)this::Method2656);
    }
    
    public void Method45() {
        if (Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null && Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null) {
            if (this.Field10648.Method309(Class1026.Field12512.name()) && !Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isOnLadder() && Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedHorizontally && Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY < Double.longBitsToDouble((long)1692048699 ^ 0x3FC99999FD4304A1L)) {
                Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble((long)1382139757 ^ 0x3FC99999CBF85EF7L);
            }
            else if (this.Field10648.Method309(Class1026.Field12513.name()) && Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedHorizontally && Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % 8 == 0) {
                Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction$Action.START_FALL_FLYING));
                Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble(4601237667291888353L);
                Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance = 0.0f;
                Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer(true));
                Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
                Class621.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
            }
        }
    }
    
    private String Method2656() {
        return "[" + this.Field10648.Method359() + "]";
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x518B ^ 0x33));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
