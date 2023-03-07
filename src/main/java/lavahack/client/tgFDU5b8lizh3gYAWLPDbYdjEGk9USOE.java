/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.WkowkMIYywGBZ1LvpVpVCHmyCihJiruH;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;

public class tgFDU5b8lizh3gYAWLPDbYdjEGk9USOE
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public static tgFDU5b8lizh3gYAWLPDbYdjEGk9USOE Field13915;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field13916 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(WkowkMIYywGBZ1LvpVpVCHmyCihJiruH::Method158, new Predicate[(int)((long)-2117353415 ^ (long)-2117353415)]);
    private String Field13917 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public tgFDU5b8lizh3gYAWLPDbYdjEGk9USOE() {
        super("CameraClip", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8341);
        Field13915 = this;
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field13916);
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field13916);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1138481440 ^ (long)-1138481440);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)661825235 ^ (long)661825068);
            int n2 = (int)((long)678649386 ^ (long)678649351) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)787042216L ^ 0x2EE94C33 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

