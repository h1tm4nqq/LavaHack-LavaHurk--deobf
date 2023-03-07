//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.server.SPacketUpdateHealth
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketUpdateHealth;

public class YXALYSGVcZG2VikhqUXDzSVA9Dgsvt4N
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private Packet Field14773 = null;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field14774 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method5771, new Predicate[(int)-345142655L ^ 0xEB6D8A81]);
    private String Field14775 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public YXALYSGVcZG2VikhqUXDzSVA9Dgsvt4N() {
        super("HealthCancel", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (YXALYSGVcZG2VikhqUXDzSVA9Dgsvt4N.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (YXALYSGVcZG2VikhqUXDzSVA9Dgsvt4N.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field14774);
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field14774);
        if (YXALYSGVcZG2VikhqUXDzSVA9Dgsvt4N.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.networkManager != null && YXALYSGVcZG2VikhqUXDzSVA9Dgsvt4N.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.networkManager.isChannelOpen()) {
            this.Field14773.processPacket(YXALYSGVcZG2VikhqUXDzSVA9Dgsvt4N.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.networkManager.getNetHandler());
        }
        this.Field14773 = null;
    }

    private void Method5771(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof SPacketUpdateHealth)) return;
        this.Field14773 = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982();
        tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method158();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-538896533L ^ 0xDFE1176B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1139855462L ^ 0xBC0F2F65);
            int n2 = (int)1183991548L ^ 0x46924633;
            cArray2[n] = (char)(cArray[n] ^ (((int)609219055L ^ 0x244FDD5C) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

