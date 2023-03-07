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
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.network.play.server.SPacketPlayerPosLook;

public class U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14330 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Reach", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x408FA72904ED80A1L ^ 0x9BA72904ED80A1L), 1.0, Double.longBitsToDouble((long)179439278 ^ 0x407F40000AB206AEL), (boolean)((long)-850912779 ^ (long)-850912780)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14331 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x8529C006EC74B6ABL ^ 0xC53DC006EC74B6ABL), 1.0, Double.longBitsToDouble((long)1980045856 ^ 0x4018000076051A20L), (boolean)((long)1326461701 ^ (long)1326461701)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14332 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("WallRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1738909954 ^ 0x4008000067A5A902L), 1.0, Double.longBitsToDouble((long)41607026 ^ 0x40180000027ADF72L), ((int)454914670L ^ 0x1B1D726E) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14333 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ThroughWalls", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-752025932L ^ 0xD32CFEB4) != 0));
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field14334 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Limit", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field15039).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14335 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Confirm", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-733297677L ^ 0xD44AC3F2) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14336 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Constrict", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-823465927L ^ 0xCEEAE839) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14337 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Strict", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1008115372L ^ 0x3C169EAC) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14338 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1580720019 ^ (long)1580720019)));
    int Field14339 = (int)1394487829L ^ 0xACE1CDEA;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field14340 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method5531, new Predicate[(int)((long)1210533812 ^ (long)1210533812)]);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field14341 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method5530, new Predicate[(int)-675959778L ^ 0xD7B5AC1E]);
    private int Field14342;

    public U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw() {
        super("SuperReach", "Hit entities from very far away. This might no work on all servers", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    @Override
    public void Method38() {
        if (U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method705(this);
            this.Method5527(new CPacketPlayer.Position(U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble((long)210329878 ^ 0x409034000C896116L), U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble((long)1799145239 ^ 0x409034006B3CC717L), U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble(0x2E9B816C2E03B6C1L ^ 0x6E0BB56C2E03B6C1L), (boolean)((long)-1543913813 ^ (long)-1543913813)), ((int)-1919151863L ^ 0x8D9C1108) != 0);
            return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method710(this);
        this.Field14339 = (int)((long)23674478 ^ (long)-23674479);
    }

    public double Method5526() {
        double d;
        double d2 = Double.longBitsToDouble(0x47AFF2A89256498AL ^ 0x7A7F2A89256498AL) / (Double.longBitsToDouble((long)236352883 ^ 0x400800000E167573L) - (double)((U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field14334.Method341()).ordinal());
        if (this.Field14337.Method365()) {
            d = Double.longBitsToDouble(0x1E0A99772E2CFFBDL ^ 0x5E0A99772E2CFFBDL) + d2;
            return d;
        }
        d = Double.longBitsToDouble(0x719F9ECF4B625EE9L ^ 0x318B9ECF4B625EE9L) + d2;
        return d;
    }

    public void Method5527(CPacketPlayer.Position position, boolean bl) {
    }

    public void Method5528(CPacketUseEntity cPacketUseEntity) {
    }

    public void Method5529(CPacketUseEntity cPacketUseEntity) {
    }

    private void Method5530(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketPlayerPosLook)) {
            return;
        }
        this.Field14339 = ((SPacketPlayerPosLook)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getTeleportId();
    }

    private void Method5531(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketUseEntity)) {
            return;
        }
        CPacketUseEntity cPacketUseEntity = (CPacketUseEntity)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982();
        if (cPacketUseEntity.getAction() != CPacketUseEntity.Action.ATTACK) {
            return;
        }
        if (this.Field14339 == (int)((long)1929826085 ^ (long)-1929826086)) {
            return;
        }
        tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method158();
        this.Method5528(cPacketUseEntity);
        U8CUcA9G4vsk4jmI08MQZ4GgzVJZsthw.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)cPacketUseEntity);
        this.Method5529(cPacketUseEntity);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1674616423L ^ 0x63D09E67;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1470974168 ^ (long)1470973991);
            int n2 = (int)((long)-1665566840 ^ (long)-1665566845) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)426077090 ^ (long)426077423) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

