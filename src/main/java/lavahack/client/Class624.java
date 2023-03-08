//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.util.math.*;
import net.minecraft.network.*;

public class Class624 extends Class42
{
    private final Class44 Field10656;
    private final Class44 Field10657;
    private final Class44 Field10658;
    private final Class44 Field10659;
    private final Class44 Field10660;
    private final Class44 Field10661;
    private final Class44 Field10662;
    private final Class44 Field10663;
    private final Class44 Field10664;
    private final Class650 Field10665;
    private CPacketPlayer$Position[] Field10666;
    private long Field10667;
    private String Field10668 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class624() {
        super("TickShiftTeleport", Class97.Field8344);
        this.Field10656 = this.Method23(new Class44("Test", (Class42)this, false));
        this.Field10657 = this.Method23(new Class44("Strict", (Class42)this, true));
        this.Field10658 = this.Method23(new Class44("DelayMultiplier", (Class42)this, 1.0, 0.0, Double.longBitsToDouble(4621819117588971520L), false));
        this.Field10659 = this.Method23(new Class44("Sprint", (Class42)this, false));
        this.Field10660 = this.Method23(new Class44("SetPosition", (Class42)this, false));
        this.Field10661 = this.Method23(new Class44("SmartOnGround", (Class42)this, false));
        this.Field10662 = this.Method23(new Class44("NoClip", (Class42)this, false));
        this.Field10663 = this.Method23(new Class44("CancelInBlock", (Class42)this, false));
        this.Field10664 = this.Method23(new Class44("CancelOffGround", (Class42)this, false));
        this.Field10665 = new Class650();
        this.Field10666 = new CPacketPlayer$Position[0];
    }
    
    public void Method38() {
        if (Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        final BlockPos getBlockPos = Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos();
        if (getBlockPos == null || Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.entityHit != null) {
            Class1393.Method5504().Method1886("Cannot Teleport onto an Entity!");
            return;
        }
        final BlockPos up = getBlockPos.up();
        final double n = up.getX();
        double n2 = up.getY();
        final double n3 = up.getZ();
        if (this.Field10656.Method365()) {
            n2 = Class1744.Method6657().getY();
        }
        final double n4 = n + Double.longBitsToDouble(4602678819172646912L);
        final double n5 = n3 + Double.longBitsToDouble((long)819899470 ^ 0x3FE0000030DEAC4EL);
        final double posX = Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
        final double posY = Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        final double posZ = Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
        final int method1678 = Class341.Method1678(Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(n4, n2, n5), this.Field10659.Method365());
        this.Field10666 = Class341.Method1679(method1678, true, this.Field10663.Method365(), this.Field10664.Method365(), this.Field10661.Method365(), posX, posY, posZ, n4, n2, n5);
        this.Field10665.Method2801();
        this.Field10667 = (long)(method1678 * 50L * this.Field10658.Method367());
    }
    
    public void Method45() {
        if (Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        if (this.Field10657.Method365() && !this.Field10665.Method2797(this.Field10667)) {
            return;
        }
        Class1393.Method5505().Method1886("Charged!");
        Class1393.Method5505().Method1886("Teleporting...");
        final boolean noClip = Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip;
        if (this.Field10662.Method365()) {
            Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = true;
        }
        for (final CPacketPlayer$Position cPacketPlayer$Position : this.Field10666) {
            if (cPacketPlayer$Position != null) {
                Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)cPacketPlayer$Position);
                if (this.Field10660.Method365()) {
                    Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(cPacketPlayer$Position.x, cPacketPlayer$Position.y, cPacketPlayer$Position.z);
                }
            }
        }
        if (this.Field10666.length > 0) {
            final CPacketPlayer$Position cPacketPlayer$Position2 = this.Field10666[this.Field10666.length - 1];
            Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(cPacketPlayer$Position2.x, cPacketPlayer$Position2.y, cPacketPlayer$Position2.z);
        }
        Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = noClip;
        this.Method22();
    }
    
    public void Method39() {
        this.Field10665.Method2801();
        this.Field10666 = new CPacketPlayer$Position[0];
        this.Field10667 = -1L;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x39E7 ^ 0xF6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
