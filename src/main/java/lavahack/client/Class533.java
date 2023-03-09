/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1416;

public class Class533
implements Runnable {
    private static Class533 Field10254;
    private Class1416 Field10255;
    private String Field10256 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static Class533 Method2419(Class1416 class1416) {
        if (Field10254 != null) return Field10254;
        Field10254 = new Class533();
        Class533.Field10254.Field10255 = class1416;
        return Field10254;
    }

    @Override
    public void run() {
        if (!this.Field10255.Field14535.Method309("While")) {
            if (this.Field10255.Field14535.Method309("None")) return;
            Class1416.Method5670(this.Field10255).set(true);
            this.Field10255.Method20();
            Class1416.Method5670(this.Field10255).set(false);
            return;
        }
        while (this.Field10255.Method35()) {
            if (!this.Field10255.Field14535.Method309("While")) return;
            if (Class1416.Method5667(this.Field10255).get()) {
                Class1416.Method5667(this.Field10255).set(false);
                Class1416.Method5668(this.Field10255).Method2801();
                Class1416.Method5669(this.Field10255).interrupt();
            }
            Class1416.Method5670(this.Field10255).set(true);
            this.Field10255.Method20();
            Class1416.Method5670(this.Field10255).set(false);
            Thread.sleep(this.Field10255.Field14536.Method369());
        }
    }

    private static String Method2420(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 182;
            cArray2[n] = (char)(cArray[n] ^ (0x63D6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

