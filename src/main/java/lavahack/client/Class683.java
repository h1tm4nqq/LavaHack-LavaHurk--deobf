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

import java.util.function.Predicate;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class2012;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class618;
import lavahack.client.Class805;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketPlayer;

@Class2012
public class Class683
extends Class42 {
    public static Class683 Field10890;
    public Class44 Field10891 = this.Method23(new Class44("StopSprint", (Class42)this, false));
    public Class44 Field10892 = this.Method23(new Class44("GroundSpoof", (Class42)this, false));
    private boolean Field10893;
    @Class1801
    private final Class618 Field10894 = new Class618(this::Method2877, new Predicate[0]);
    private String Field10895 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class683() {
        super("AntiHunger", "Attempts to negate hunger loss", Class97.Field8341);
        Field10890 = this;
    }

    @Override
    public void Method38() {
        if (Class683.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSprinting() || Class683.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSprinting()) {
            this.Field10893 = true;
            Class683.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class683.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction.Action.STOP_SPRINTING));
        }
        super.Method38();
        Class1796.Field16242.Method706(this.Field10894);
    }

    @Override
    public void Method39() {
        if (Class683.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class683.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        super.Method39();
        Class1796.Field16242.Method711(this.Field10894);
        if (!this.Field10893) return;
        this.Field10893 = false;
        Class683.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class683.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction.Action.START_SPRINTING));
    }

    private void Method2877(Class805 class805) {
        if (class805.Method982() instanceof CPacketPlayer) {
            if (!this.Field10892.Method365()) return;
            if (Class683.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRiding()) return;
            if (Class683.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isElytraFlying()) return;
            ((CPacketPlayer)class805.Method982()).onGround = true;
            return;
        }
        if (!(class805.Method982() instanceof CPacketEntityAction)) return;
        CPacketEntityAction cPacketEntityAction = (CPacketEntityAction)class805.Method982();
        if (!cPacketEntityAction.getAction().equals((Object)CPacketEntityAction.Action.START_SPRINTING)) {
            if (!cPacketEntityAction.getAction().equals((Object)CPacketEntityAction.Action.STOP_SPRINTING)) return;
        }
        if (!this.Field10891.Method365()) return;
        class805.Method158();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 51;
            cArray2[n] = (char)(cArray[n] ^ (0x7C36 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

