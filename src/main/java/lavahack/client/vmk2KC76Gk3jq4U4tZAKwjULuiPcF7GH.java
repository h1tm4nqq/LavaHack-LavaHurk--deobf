//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.event.Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

public class vmk2KC76Gk3jq4U4tZAKwjULuiPcF7GH
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16018 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Place", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1498639550 ^ (long)1498639551)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16019 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Break", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1507898987L ^ 0xA61F4994) != 0));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16020 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Ground", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-907107026 ^ (long)-907107026)));
    public static vmk2KC76Gk3jq4U4tZAKwjULuiPcF7GH Field16021;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16022 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method6670, new Predicate[(int)((long)2143034729 ^ (long)2143034729)]);
    private int Field16023;

    public vmk2KC76Gk3jq4U4tZAKwjULuiPcF7GH() {
        super("NoGlitchBlocks", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
        Field16021 = this;
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field16022);
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field16022);
    }

    public boolean Method6669() {
        int n;
        if (this.Method35() && this.Field16018.Method365() && (this.Field16020.Method365() || vmk2KC76Gk3jq4U4tZAKwjULuiPcF7GH.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround)) {
            n = (int)1503519786L ^ 0x599DE42B;
            return n != 0;
        }
        n = (int)1183940873L ^ 0x46918109;
        return n != 0;
    }

    private void Method6670(UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!this.Field16019.Method365()) return;
        if (!uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field9305.equals((Object)Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13746)) return;
        uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method158();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-480867112 ^ (long)-480867112);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-655564206L ^ 0xD8ECE2AD);
            int n2 = (int)364895589L ^ 0x15BFDD65;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1908834095 ^ (long)-1908830408) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

