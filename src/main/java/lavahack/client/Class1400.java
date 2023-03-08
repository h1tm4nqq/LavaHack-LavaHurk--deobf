//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.network.play.server.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;

public class Class1400 extends Class42
{
    private final Class44 Field14330;
    private final Class44 Field14331;
    private final Class44 Field14332;
    private final Class44 Field14333;
    private final Class1303 Field14334;
    private final Class44 Field14335;
    private final Class44 Field14336;
    private final Class44 Field14337;
    private final Class44 Field14338;
    int Field14339;
    @Class1801
    private final Class618 Field14340;
    @Class1801
    private final Class618 Field14341;
    private int Field14342;
    
    public Class1400() {
        super("SuperReach", "Hit entities from very far away. This might no work on all servers", Class97.Field8344);
        this.Field14330 = this.Method23(new Class44("Reach", this, Double.longBitsToDouble(4617315517961601024L), 1.0, Double.longBitsToDouble((long)179439278 ^ 0x407F40000AB206AEL), true));
        this.Field14331 = this.Method23(new Class44("Range", this, Double.longBitsToDouble(4617315517961601024L), 1.0, Double.longBitsToDouble((long)1980045856 ^ 0x4018000076051A20L), false));
        this.Field14332 = this.Method23(new Class44("WallRange", this, Double.longBitsToDouble((long)1738909954 ^ 0x4008000067A5A902L), 1.0, Double.longBitsToDouble((long)41607026 ^ 0x40180000027ADF72L), false));
        this.Field14333 = this.Method23(new Class44("ThroughWalls", this, false));
        this.Field14334 = new Class1303("Limit", (Class42)this, (Enum)Class1501.Field15039).Method5303();
        this.Field14335 = this.Method23(new Class44("Confirm", this, true));
        this.Field14336 = this.Method23(new Class44("Constrict", this, false));
        this.Field14337 = this.Method23(new Class44("Strict", this, false));
        this.Field14338 = this.Method23(new Class44("Rotate", this, false));
        this.Field14339 = -1;
        this.Field14340 = new Class618(this::Method5531, new Predicate[0]);
        this.Field14341 = new Class618(this::Method5530, new Predicate[0]);
    }
    
    @Override
    public void Method38() {
        if (Class1400.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1400.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        Class1796.Field16242.Method705((Class1320)this);
        this.Method5527(new CPacketPlayer$Position(Class1400.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble((long)210329878 ^ 0x409034000C896116L), Class1400.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble((long)1799145239 ^ 0x409034006B3CC717L), Class1400.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble(4652275589678366720L), false), true);
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method710((Class1320)this);
        this.Field14339 = -1;
    }
    
    public double Method5526() {
        final double n = Double.longBitsToDouble(4613937818241073152L) / (Double.longBitsToDouble((long)236352883 ^ 0x400800000E167573L) - ((Class1501)this.Field14334.Method341()).ordinal());
        return this.Field14337.Method365() ? (Double.longBitsToDouble(4611686018427387904L) + n) : (Double.longBitsToDouble(4617315517961601024L) + n);
    }
    
    public void Method5527(final CPacketPlayer$Position cPacketPlayer$Position, final boolean b) {
    }
    
    public void Method5528(final CPacketUseEntity cPacketUseEntity) {
    }
    
    public void Method5529(final CPacketUseEntity cPacketUseEntity) {
    }
    
    private void Method5530(final Class544 class544) {
        if (!(class544.Method982() instanceof SPacketPlayerPosLook)) {
            return;
        }
        this.Field14339 = ((SPacketPlayerPosLook)class544.Method982()).getTeleportId();
    }
    
    private void Method5531(final Class805 class805) {
        if (!(class805.Method982() instanceof CPacketUseEntity)) {
            return;
        }
        final CPacketUseEntity cPacketUseEntity = (CPacketUseEntity)class805.Method982();
        if (cPacketUseEntity.getAction() != CPacketUseEntity$Action.ATTACK) {
            return;
        }
        if (this.Field14339 == -1) {
            return;
        }
        class805.Method158();
        this.Method5528(cPacketUseEntity);
        Class1400.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)cPacketUseEntity);
        this.Method5529(cPacketUseEntity);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x74D ^ 0x2C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
