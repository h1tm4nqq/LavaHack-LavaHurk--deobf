//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.network.play.client.CPacketUseEntity$Action
 *  net.minecraft.world.World
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class618;
import lavahack.client.Class805;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.world.World;

public class Class952
extends Class42 {
    private final Class44 Field12053 = this.Method23(new Class44("Strict", (Class42)this, false));
    private final Class44 Field12054 = this.Method23(new Class44("OnlyKillAura", (Class42)this, false));
    @Class1801
    private final Class618 Field12055 = new Class618(this::Method3917, new Predicate[0]);
    private int Field12056;

    public Class952() {
        super("Criticals", "", Class97.Field8338);
        super.Method44(this::Method3918);
    }

    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field12055);
    }

    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field12055);
    }

    private void Method3917(Class805 class805) {
        if (!(class805.Method982() instanceof CPacketUseEntity)) return;
        CPacketUseEntity cPacketUseEntity = (CPacketUseEntity)class805.Method982();
        if (!cPacketUseEntity.action.equals((Object)CPacketUseEntity.Action.ATTACK)) return;
        if (!Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) return;
        if (Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInLava()) return;
        if (Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWater()) return;
        if (Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWeb) return;
        if (this.Field12054.Method365() && !Class1796.Field16241.Field16254.Method1162("KillAuraRewrite").Method35()) {
            return;
        }
        Entity entity = cPacketUseEntity.getEntityFromWorld((World)Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world);
        if (!(entity instanceof EntityLivingBase)) return;
        double d = Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
        double d2 = Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        double d3 = Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
        if (this.Field12053.Method365()) {
            Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d, d2 + Double.longBitsToDouble((long)1655709122 ^ 0x3FB1EB857C084C2EL), d3, false));
            Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d, d2 + Double.longBitsToDouble((long)1584021396 ^ 0x3FB47AE119C42BEFL), d3, false));
            Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d, d2, d3, false));
        }
        Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d, d2 + Double.longBitsToDouble((long)314225261 ^ 0x3FA999998B232BF7L), d3, false));
        Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d, d2, d3, false));
        Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d, d2 + Double.longBitsToDouble(4578071150808694522L), d3, false));
        Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d, d2, d3, false));
        Class952.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onCriticalHit(entity);
    }

    private String Method3918() {
        if (!this.Field12053.Method365()) return "";
        return "[Strict]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 72;
            cArray2[n] = (char)(cArray[n] ^ (0x1630 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

