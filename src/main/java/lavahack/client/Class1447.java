//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketEntityAction$Action
 */
package lavahack.client;

import java.util.Arrays;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;

public class Class1447
extends Class42 {
    private final Class44 Field14771 = this.Method23(new Class44("Mode", (Class42)this, "Vanilla", Arrays.asList("Vanilla", "WellMore", "ReallyWorld")));
    private String Field14772 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1447() {
        super("Fly", "Your flying", Class97.Field8340);
        super.Method44(this::Method5770);
    }

    @Override
    public void Method45() {
        if (Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field14771.Method359().equalsIgnoreCase("Vanilla")) {
            Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.capabilities.isFlying = true;
            Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.capabilities.setFlySpeed(Float.intBitsToFloat(1028443341));
            return;
        }
        if (this.Field14771.Method359().equalsIgnoreCase("WellMore")) {
            if (Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = 1.0;
                return;
            }
            Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.capabilities.isFlying = true;
            Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.capabilities.setFlySpeed(Float.intBitsToFloat(1067869798));
            Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble((long)76140967 ^ 0xBF947AE14327C5DCL);
            Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
            return;
        }
        if (!this.Field14771.Method359().equalsIgnoreCase("ReallyWorld")) return;
        if (!Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.pressed) return;
        if (Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % 3 == 0) {
            Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction.Action.START_FALL_FLYING));
        }
        Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
    }

    @Override
    public void Method39() {
        if (Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.capabilities.isFlying = false;
        Class1447.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.capabilities.setFlySpeed(Float.intBitsToFloat(0x3DCCCCCD));
    }

    private String Method5770() {
        return "[" + this.Field14771.Method359() + "]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 11;
            cArray2[n] = (char)(cArray[n] ^ (0x3D8C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

