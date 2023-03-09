//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.network.play.client.CPacketUseEntity$Action
 *  net.minecraft.network.play.server.SPacketPlayerPosLook
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1303;
import lavahack.client.Class1501;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class805;
import lavahack.client.Class97;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.network.play.server.SPacketPlayerPosLook;

public class Class1400
extends Class42 {
    private final Class44 Field14330 = this.Method23(new Class44("Reach", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 1.0, Double.longBitsToDouble((long)179439278 ^ 0x407F40000AB206AEL), true));
    private final Class44 Field14331 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 1.0, Double.longBitsToDouble((long)1980045856 ^ 0x4018000076051A20L), false));
    private final Class44 Field14332 = this.Method23(new Class44("WallRange", (Class42)this, Double.longBitsToDouble((long)1738909954 ^ 0x4008000067A5A902L), 1.0, Double.longBitsToDouble((long)41607026 ^ 0x40180000027ADF72L), false));
    private final Class44 Field14333 = this.Method23(new Class44("ThroughWalls", (Class42)this, false));
    private final Class1303 Field14334 = new Class1303("Limit", (Class42)this, Class1501.Field15039).Method5303();
    private final Class44 Field14335 = this.Method23(new Class44("Confirm", (Class42)this, true));
    private final Class44 Field14336 = this.Method23(new Class44("Constrict", (Class42)this, false));
    private final Class44 Field14337 = this.Method23(new Class44("Strict", (Class42)this, false));
    private final Class44 Field14338 = this.Method23(new Class44("Rotate", (Class42)this, false));
    int Field14339 = -1;
    @Class1801
    private final Class618 Field14340 = new Class618(this::Method5531, new Predicate[0]);
    @Class1801
    private final Class618 Field14341 = new Class618(this::Method5530, new Predicate[0]);
    private int Field14342;

    public Class1400() {
        super("SuperReach", "Hit entities from very far away. This might no work on all servers", Class97.Field8344);
    }

    @Override
    public void Method38() {
        if (Class1400.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class1400.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            Class1796.Field16242.Method705(this);
            this.Method5527(new CPacketPlayer.Position(Class1400.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble((long)210329878 ^ 0x409034000C896116L), Class1400.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble((long)1799145239 ^ 0x409034006B3CC717L), Class1400.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble(4652275589678366720L), false), true);
            return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method710(this);
        this.Field14339 = -1;
    }

    public double Method5526() {
        double d;
        double d2 = Double.longBitsToDouble(0x4008000000000000L) / (Double.longBitsToDouble((long)236352883 ^ 0x400800000E167573L) - (double)((Class1501)this.Field14334.Method341()).ordinal());
        if (this.Field14337.Method365()) {
            d = Double.longBitsToDouble(0x4000000000000000L) + d2;
            return d;
        }
        d = Double.longBitsToDouble(0x4014000000000000L) + d2;
        return d;
    }

    public void Method5527(CPacketPlayer.Position position, boolean bl) {
    }

    public void Method5528(CPacketUseEntity cPacketUseEntity) {
    }

    public void Method5529(CPacketUseEntity cPacketUseEntity) {
    }

    private void Method5530(Class544 class544) {
        if (!(class544.Method982() instanceof SPacketPlayerPosLook)) {
            return;
        }
        this.Field14339 = ((SPacketPlayerPosLook)class544.Method982()).getTeleportId();
    }

    private void Method5531(Class805 class805) {
        if (!(class805.Method982() instanceof CPacketUseEntity)) {
            return;
        }
        CPacketUseEntity cPacketUseEntity = (CPacketUseEntity)class805.Method982();
        if (cPacketUseEntity.getAction() != CPacketUseEntity.Action.ATTACK) {
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

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 44;
            cArray2[n] = (char)(cArray[n] ^ (0x74D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

