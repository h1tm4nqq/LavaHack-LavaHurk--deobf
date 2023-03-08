//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.entity.*;
import net.minecraft.network.*;
import net.minecraft.network.play.client.*;

@Class2012
public class Class683 extends Class42
{
    public static Class683 Field10890;
    public Class44 Field10891;
    public Class44 Field10892;
    private boolean Field10893;
    @Class1801
    private final Class618 Field10894;
    private String Field10895 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class683() {
        super("AntiHunger", "Attempts to negate hunger loss", Class97.Field8341);
        this.Field10891 = this.Method23(new Class44("StopSprint", (Class42)this, false));
        this.Field10892 = this.Method23(new Class44("GroundSpoof", (Class42)this, false));
        this.Field10894 = new Class618(this::Method2877, new Predicate[0]);
        Class683.Field10890 = this;
    }
    
    public void Method38() {
        if (Class683.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSprinting() || Class683.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSprinting()) {
            this.Field10893 = true;
            Class683.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class683.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction$Action.STOP_SPRINTING));
        }
        super.Method38();
        Class1796.Field16242.Method706(this.Field10894);
    }
    
    public void Method39() {
        if (Class683.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class683.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        super.Method39();
        Class1796.Field16242.Method711(this.Field10894);
        if (this.Field10893) {
            this.Field10893 = false;
            Class683.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class683.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction$Action.START_SPRINTING));
        }
    }
    
    private void Method2877(final Class805 class805) {
        if (class805.Method982() instanceof CPacketPlayer) {
            if (this.Field10892.Method365() && !Class683.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRiding() && !Class683.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isElytraFlying()) {
                ((CPacketPlayer)class805.Method982()).onGround = true;
            }
        }
        else if (class805.Method982() instanceof CPacketEntityAction) {
            final CPacketEntityAction cPacketEntityAction = (CPacketEntityAction)class805.Method982();
            if ((cPacketEntityAction.getAction().equals((Object)CPacketEntityAction$Action.START_SPRINTING) || cPacketEntityAction.getAction().equals((Object)CPacketEntityAction$Action.STOP_SPRINTING)) && this.Field10891.Method365()) {
                class805.Method158();
            }
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7C36 ^ 0x33));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
