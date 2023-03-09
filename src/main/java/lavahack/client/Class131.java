//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1303;
import lavahack.client.Class1508;
import lavahack.client.Class1529;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class1830;
import lavahack.client.Class42;
import lavahack.client.Class618;
import lavahack.client.Class873;
import lavahack.client.Class97;

public class Class131
extends Class42 {
    @Class873
    public static Class131 Field8450;
    public Class1303 Field8451 = new Class1303("Cape Mode", (Class42)this, Class1529.Field15151).Method5303();
    @Class1801
    private final Class618 Field8452 = new Class618(this::Method868, new Predicate[0]);
    private String Field8453 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class131() {
        super("Cape", "Custom cape", Class97.Field8339);
        super.Method44(this::Method869);
    }

    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field8452);
    }

    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field8452);
    }

    private void Method868(Class1508 class1508) {
        if (!Class1830.Field16451.Method6895(class1508.Method6030().getGameProfile().getId().toString())) return;
        class1508.Method6029(((Class1529)this.Field8451.Method341()).Method6069());
    }

    private String Method869() {
        return "[" + this.Field8451.Method359() + "]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 126;
            cArray2[n] = (char)(cArray[n] ^ (0x699D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

