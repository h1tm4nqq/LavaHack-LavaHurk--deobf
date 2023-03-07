//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.Packet
 *  net.minecraft.network.status.client.CPacketPing
 *  net.minecraft.network.status.server.SPacketPong
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.network.Packet;
import net.minecraft.network.status.client.CPacketPing;
import net.minecraft.network.status.server.SPacketPong;

public class p8k23NT4E4aC9orXXvmDwkPp2Xzrb26C
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private long Field17603 = 0L;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field17604 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method7651, new Predicate[(int)-971655224L ^ 0xC615B7C8]);
    private String Field17605 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public p8k23NT4E4aC9orXXvmDwkPp2Xzrb26C() {
        super("PacketDelay", "Measures the delay a packet needs to be send and received back", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343, (int)((long)-1819127024 ^ (long)-1819127024), ((int)1183950405L ^ 0x4691A644) != 0);
    }

    @Override
    public void Method38() {
        if (p8k23NT4E4aC9orXXvmDwkPp2Xzrb26C.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (p8k23NT4E4aC9orXXvmDwkPp2Xzrb26C.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1886("Sending packet...");
        p8k23NT4E4aC9orXXvmDwkPp2Xzrb26C.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPing());
        this.Field17603 = System.currentTimeMillis();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method705(this);
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method710(this);
    }

    private void Method7651(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketPong)) {
            return;
        }
        long l = System.currentTimeMillis();
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1886("The delay was: " + (l - this.Field17603) + "ms");
        this.Field17603 = 0L;
        this.Method22();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)198328814 ^ (long)198328814);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1031134696L ^ 0xC28A22E7);
            int n2 = (int)((long)635558538 ^ (long)635558515);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1194693856 ^ (long)-1194719293) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

