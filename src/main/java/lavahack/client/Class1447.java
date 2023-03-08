//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.util.function.*;
import net.minecraft.network.play.client.*;
import net.minecraft.entity.*;
import net.minecraft.network.*;

public class Class1447 extends Class42
{
    private final Class44 Field14771;
    private String Field14772 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1447() {
        super("Fly", "Your flying", Class97.Field8340);
        this.Field14771 = this.Method23(new Class44("Mode", this, "Vanilla", Arrays.asList("Vanilla", "WellMore", "ReallyWorld")));
        super.Method44(this::Method5770);
    }
    
    @Override
    public void Method45() {
        if (Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field14771.Method359().equalsIgnoreCase("Vanilla")) {
            Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.capabilities.isFlying = true;
            Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.capabilities.setFlySpeed(Float.intBitsToFloat(1028443341));
        }
        else if (this.Field14771.Method359().equalsIgnoreCase("WellMore")) {
            if (Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = 1.0;
            }
            else {
                Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.capabilities.isFlying = true;
                Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.capabilities.setFlySpeed(Float.intBitsToFloat(1067869798));
                Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
                Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble((long)76140967 ^ 0xBF947AE14327C5DCL);
                Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
            }
        }
        else if (this.Field14771.Method359().equalsIgnoreCase("ReallyWorld") && Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.pressed) {
            if (Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % 3 == 0) {
                Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction$Action.START_FALL_FLYING));
            }
            Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
        }
    }
    
    @Override
    public void Method39() {
        if (Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.capabilities.isFlying = false;
        Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.capabilities.setFlySpeed(Float.intBitsToFloat(1036831949));
    }
    
    private String Method5770() {
        return "[" + this.Field14771.Method359() + "]";
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3D8C ^ 0xB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
