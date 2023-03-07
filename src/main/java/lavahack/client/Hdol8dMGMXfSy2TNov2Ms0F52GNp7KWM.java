//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.server.SPacketChat
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
import net.minecraft.network.play.server.SPacketChat;

public class Hdol8dMGMXfSy2TNov2Ms0F52GNp7KWM
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field11627 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(Hdol8dMGMXfSy2TNov2Ms0F52GNp7KWM::Method3607, new Predicate[(int)((long)1137443643 ^ (long)1137443643)]);
    private String Field11628 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Hdol8dMGMXfSy2TNov2Ms0F52GNp7KWM() {
        super("AntiLogger", "Log4j protect", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field11627);
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field11627);
    }

    private static void Method3607(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketChat)) return;
        String string = ((SPacketChat)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getChatComponent().getUnformattedText();
        if (!string.contains("jndi")) return;
        tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method158();
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1886("Removed Log4j exploit message");
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1248213043 ^ (long)1248213043);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1195644862L ^ 0x47441741);
            int n2 = (int)2131526001L ^ 0x7F0C81BC;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1203047990 ^ (long)1203047859) << 5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

