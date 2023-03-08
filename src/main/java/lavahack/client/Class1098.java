//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.network.play.server.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;

public class Class1098 extends Class42
{
    private final Class44 Field12951;
    @Class1801
    private final Class618 Field12952;
    private String Field12953 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1098() {
        super("TraceTeleport", "", Class97.Field8344);
        this.Field12951 = this.Method23(new Class44("Only Players", this, true));
        this.Field12952 = new Class618(this::Method4496, new Predicate[0]);
    }
    
    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field12952);
    }
    
    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field12952);
    }
    
    private void Method4496(final Class544 class544) {
        if (class544.Method982() instanceof SPacketEntityTeleport) {
            final SPacketEntityTeleport sPacketEntityTeleport = (SPacketEntityTeleport)class544.Method982();
            final Entity getEntityByID = Class1098.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntityByID(sPacketEntityTeleport.getEntityId());
            if ((!this.Field12951.Method365() || getEntityByID instanceof EntityPlayer) && (Math.abs(Class1098.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - sPacketEntityTeleport.getX()) > Double.longBitsToDouble(4647503709213818880L) || Math.abs(Class1098.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - sPacketEntityTeleport.getZ()) > Double.longBitsToDouble((long)94471313 ^ 0x407F400005A18491L))) {
                Class1393.Method5507().Method1886(String.format("Entity [%s] teleported to [%.2f, %.2f, %.2f], %.2f blocks away", (getEntityByID != null) ? getEntityByID.getClass().getSimpleName() : "Unknown", sPacketEntityTeleport.getX(), sPacketEntityTeleport.getY(), sPacketEntityTeleport.getZ(), Math.sqrt(Math.pow(Class1098.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - sPacketEntityTeleport.getX(), Double.longBitsToDouble((long)418521698 ^ 0x4000000018F22262L)) + Math.pow(Class1098.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - sPacketEntityTeleport.getZ(), Double.longBitsToDouble(4611686018427387904L)))));
            }
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x72D3 ^ 0x37));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
