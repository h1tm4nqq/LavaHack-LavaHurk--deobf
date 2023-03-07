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
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;

public class VkKMWBQnnVwZotiWGeBWlb2rSNvQUfRc
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14771;
    private String Field14772 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public VkKMWBQnnVwZotiWGeBWlb2rSNvQUfRc() {
        super("Fly", "Your flying", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340);
        String[] stringArray = new String[(int)((long)2099327167 ^ (long)2099327164)];
        stringArray[(int)-833516242L ^ 0xCE518D2E] = "Vanilla";
        stringArray[(int)-813202258L ^ 0xCF8784AF] = "WellMore";
        stringArray[(int)((long)-941700739 ^ (long)-941700740) << 1] = "ReallyWorld";
        this.Field14771 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Vanilla", Arrays.asList(stringArray)));
        super.Method44(this::Method5770);
    }

    @Override
    public void Method45() {
        if (VkKMWBQnnVwZotiWGeBWlb2rSNvQUfRc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (VkKMWBQnnVwZotiWGeBWlb2rSNvQUfRc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field14771.Method359().equalsIgnoreCase("Vanilla")) {
            VkKMWBQnnVwZotiWGeBWlb2rSNvQUfRc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.capabilities.isFlying = (int)((long)461709510 ^ (long)461709511);
            VkKMWBQnnVwZotiWGeBWlb2rSNvQUfRc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.capabilities.setFlySpeed(Float.intBitsToFloat((int)16730363L ^ 0x3DB38436));
            return;
        }
        if (this.Field14771.Method359().equalsIgnoreCase("WellMore")) {
            if (VkKMWBQnnVwZotiWGeBWlb2rSNvQUfRc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                VkKMWBQnnVwZotiWGeBWlb2rSNvQUfRc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = 1.0;
                return;
            }
            VkKMWBQnnVwZotiWGeBWlb2rSNvQUfRc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.capabilities.isFlying = (int)-234829402L ^ 0xF200C9A7;
            VkKMWBQnnVwZotiWGeBWlb2rSNvQUfRc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.capabilities.setFlySpeed(Float.intBitsToFloat((int)792715585L ^ 0x10998727));
            VkKMWBQnnVwZotiWGeBWlb2rSNvQUfRc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            VkKMWBQnnVwZotiWGeBWlb2rSNvQUfRc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble((long)76140967 ^ 0xBF947AE14327C5DCL);
            VkKMWBQnnVwZotiWGeBWlb2rSNvQUfRc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
            return;
        }
        if (!this.Field14771.Method359().equalsIgnoreCase("ReallyWorld")) return;
        if (!VkKMWBQnnVwZotiWGeBWlb2rSNvQUfRc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.pressed) return;
        if (VkKMWBQnnVwZotiWGeBWlb2rSNvQUfRc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % (int)((long)-1734068019 ^ (long)-1734068018) == 0) {
            VkKMWBQnnVwZotiWGeBWlb2rSNvQUfRc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)VkKMWBQnnVwZotiWGeBWlb2rSNvQUfRc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction.Action.START_FALL_FLYING));
        }
        VkKMWBQnnVwZotiWGeBWlb2rSNvQUfRc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
    }

    @Override
    public void Method39() {
        if (VkKMWBQnnVwZotiWGeBWlb2rSNvQUfRc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (VkKMWBQnnVwZotiWGeBWlb2rSNvQUfRc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        VkKMWBQnnVwZotiWGeBWlb2rSNvQUfRc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.capabilities.isFlying = (int)-1132022437L ^ 0xBC86B55B;
        VkKMWBQnnVwZotiWGeBWlb2rSNvQUfRc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.capabilities.setFlySpeed(Float.intBitsToFloat(0x7EB09A8A ^ 0x437C5647));
    }

    private String Method5770() {
        return "[" + this.Field14771.Method359() + "]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-2080401814L ^ 0x83FF966A;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1072198824L ^ 0x3FE87457);
            int n2 = (int)1077540069L ^ 0x4039F4EE;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1012255879 ^ (long)1012253668) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

