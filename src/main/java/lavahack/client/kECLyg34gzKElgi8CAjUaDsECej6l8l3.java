//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.GQCHtwrp6JeYnKqhNV7KuQ1v85QZoqcw;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.iDprz50yBrPJ6StAk1hDYgq1aL04tvSb;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua;
import lavahack.client.x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk;

public class kECLyg34gzKElgi8CAjUaDsECej6l8l3
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    @tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua
    public static kECLyg34gzKElgi8CAjUaDsECej6l8l3 Field8450;
    public M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field8451 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Cape Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, GQCHtwrp6JeYnKqhNV7KuQ1v85QZoqcw.Field15151).Method5303();
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field8452 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method868, new Predicate[(int)((long)1174090743 ^ (long)1174090743)]);
    private String Field8453 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public kECLyg34gzKElgi8CAjUaDsECej6l8l3() {
        super("Cape", "Custom cape", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8339);
        super.Method44(this::Method869);
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field8452);
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field8452);
    }

    private void Method868(x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk2) {
        if (!iDprz50yBrPJ6StAk1hDYgq1aL04tvSb.Field16451.Method6895(x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk2.Method6030().getGameProfile().getId().toString())) return;
        x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk2.Method6029(((GQCHtwrp6JeYnKqhNV7KuQ1v85QZoqcw)this.Field8451.Method341()).Method6069());
    }

    private String Method869() {
        return "[" + this.Field8451.Method359() + "]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)998598985L ^ 0x3B856949;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1978542492L ^ 0x8A11D69B);
            int n2 = (int)((long)-1141932821 ^ (long)-1141932844) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)2083662102 ^ (long)2083668107) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

