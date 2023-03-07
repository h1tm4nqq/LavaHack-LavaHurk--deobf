//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.server.SPacketChat
 *  net.minecraft.util.text.ChatType
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
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.network.play.server.SPacketChat;
import net.minecraft.util.text.ChatType;

public class dGg18tGVNHuunuH2eXAtLcCOmo0a66ym
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15833 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Name", this, "Kisman", "Kisman", (boolean)((long)-950608953 ^ (long)-950608954));
    public static dGg18tGVNHuunuH2eXAtLcCOmo0a66ym Field15834;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field15835 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method6491, new Predicate[(int)-1089434781L ^ 0xBF108B63]);
    private String Field15836 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public dGg18tGVNHuunuH2eXAtLcCOmo0a66ym() {
        super("NameProtect", "NameProtect", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
        Field15834 = this;
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15833);
    }

    @Override
    public boolean Method52() {
        return ((int)-187609694L ^ 0xF4D14DA3) != 0;
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field15835);
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field15835);
    }

    private boolean Method6490(String string) {
        if (dGg18tGVNHuunuH2eXAtLcCOmo0a66ym.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return ((int)1071372808L ^ 0x3FDBDA08) != 0;
        }
        String string2 = string;
        string2 = string2.replace(dGg18tGVNHuunuH2eXAtLcCOmo0a66ym.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getName(), this.Field15833.Method359());
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5508(string2);
        return (int)((long)-1766511561 ^ (long)-1766511562) != 0;
    }

    private void Method6491(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketChat)) return;
        SPacketChat sPacketChat = (SPacketChat)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
        if (sPacketChat.getType() == ChatType.GAME_INFO) return;
        if (!this.Method6490(sPacketChat.getChatComponent().getFormattedText())) return;
        tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method158();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-672077756L ^ 0xD7F0E844;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)515681943L ^ 0x1EBCAE68);
            int n2 = ((int)537174092L ^ 0x2004A06F) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1060963304 ^ (long)-1060969465) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

