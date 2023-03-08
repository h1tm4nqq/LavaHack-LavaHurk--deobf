//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.world.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.entity.*;

public class Class952 extends Class42
{
    private final Class44 Field12053;
    private final Class44 Field12054;
    @Class1801
    private final Class618 Field12055;
    private int Field12056;
    
    public Class952() {
        super("Criticals", "", Class97.Field8338);
        this.Field12053 = this.Method23(new Class44("Strict", (Class42)this, false));
        this.Field12054 = this.Method23(new Class44("OnlyKillAura", (Class42)this, false));
        this.Field12055 = new Class618(this::Method3917, new Predicate[0]);
        super.Method44((Supplier)this::Method3918);
    }
    
    public void Method38() {
        Class1796.Field16242.Method706(this.Field12055);
    }
    
    public void Method39() {
        Class1796.Field16242.Method711(this.Field12055);
    }
    
    private void Method3917(final Class805 class805) {
        if (class805.Method982() instanceof CPacketUseEntity) {
            final CPacketUseEntity cPacketUseEntity = (CPacketUseEntity)class805.Method982();
            if (cPacketUseEntity.action.equals((Object)CPacketUseEntity$Action.ATTACK) && Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround && !Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInLava() && !Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWater() && !Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWeb) {
                if (this.Field12054.Method365() && !Class1796.Field16241.Field16254.Method1162("KillAuraRewrite").Method35()) {
                    return;
                }
                final Entity getEntityFromWorld = cPacketUseEntity.getEntityFromWorld((World)Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world);
                if (getEntityFromWorld instanceof EntityLivingBase) {
                    final double posX = Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
                    final double posY = Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
                    final double posZ = Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
                    if (this.Field12053.Method365()) {
                        Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(posX, posY + Double.longBitsToDouble((long)1655709122 ^ 0x3FB1EB857C084C2EL), posZ, false));
                        Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(posX, posY + Double.longBitsToDouble((long)1584021396 ^ 0x3FB47AE119C42BEFL), posZ, false));
                        Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(posX, posY, posZ, false));
                    }
                    Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(posX, posY + Double.longBitsToDouble((long)314225261 ^ 0x3FA999998B232BF7L), posZ, false));
                    Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(posX, posY, posZ, false));
                    Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(posX, posY + Double.longBitsToDouble(4578071150808694522L), posZ, false));
                    Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(posX, posY, posZ, false));
                    Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onCriticalHit(getEntityFromWorld);
                }
            }
        }
    }
    
    private String Method3918() {
        return this.Field12053.Method365() ? "[Strict]" : "";
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1630 ^ 0x48));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
