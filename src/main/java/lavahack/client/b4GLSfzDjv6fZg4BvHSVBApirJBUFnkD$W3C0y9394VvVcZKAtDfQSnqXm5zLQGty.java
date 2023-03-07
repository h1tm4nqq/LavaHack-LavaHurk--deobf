/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD;

public class b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$W3C0y9394VvVcZKAtDfQSnqXm5zLQGty
implements Runnable {
    private static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$W3C0y9394VvVcZKAtDfQSnqXm5zLQGty Field10254;
    private b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD Field10255;
    private String Field10256 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$W3C0y9394VvVcZKAtDfQSnqXm5zLQGty Method2419(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD2) {
        if (Field10254 != null) return Field10254;
        Field10254 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$W3C0y9394VvVcZKAtDfQSnqXm5zLQGty();
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$W3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field10254.Field10255 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD2;
        return Field10254;
    }

    @Override
    public void run() {
        if (!this.Field10255.Field14535.Method309("While")) {
            if (this.Field10255.Field14535.Method309("None")) return;
            b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Method5670(this.Field10255).set((boolean)((long)1216685464 ^ (long)1216685465));
            this.Field10255.Method20();
            b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Method5670(this.Field10255).set((boolean)((long)-1810093145 ^ (long)-1810093145));
            return;
        }
        while (this.Field10255.Method35()) {
            if (!this.Field10255.Field14535.Method309("While")) return;
            if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Method5667(this.Field10255).get()) {
                b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Method5667(this.Field10255).set((boolean)((long)-1138462785 ^ (long)-1138462785));
                b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Method5668(this.Field10255).Method2801();
                b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Method5669(this.Field10255).interrupt();
            }
            b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Method5670(this.Field10255).set(((int)478572548L ^ 0x1C867005) != 0);
            this.Field10255.Method20();
            b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Method5670(this.Field10255).set(((int)-2076422985L ^ 0x843C4CB7) != 0);
            Thread.sleep(this.Field10255.Field14536.Method369());
        }
    }

    private static String Method2420(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)944693518L ^ 0x384EE10E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-90135738L ^ 0xFAA0A3B9);
            int n2 = ((int)-1752031887L ^ 0x97921D2A) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-2114843964L ^ 0x81F23B2F) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

