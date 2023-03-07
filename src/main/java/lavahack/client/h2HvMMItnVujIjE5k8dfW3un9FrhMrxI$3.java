/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import lavahack.client.h2HvMMItnVujIjE5k8dfW3un9FrhMrxI;

final class h2HvMMItnVujIjE5k8dfW3un9FrhMrxI$3
implements Runnable {
    final String Field15761;
    final List Field15762;
    private String Field15763 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    h2HvMMItnVujIjE5k8dfW3un9FrhMrxI$3(String string, List list) {
        this.Field15761 = string;
        this.Field15762 = list;
    }

    @Override
    public void run() {
        String string;
        URL uRL = new URL(this.Field15761);
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
        httpURLConnection.addRequestProperty(h2HvMMItnVujIjE5k8dfW3un9FrhMrxI.Field12517, h2HvMMItnVujIjE5k8dfW3un9FrhMrxI.Field12518);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        while ((string = bufferedReader.readLine()) != null) {
            if (string.isEmpty() || string.equals(" ") || string.equals("   ")) continue;
            this.Field15762.add(string.contains(" ") ? string.replace(" ", "") : string);
        }
    }

    private static String Method6437(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)100232785L ^ 0x5F96E51;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1896964354L ^ 0x711161FD);
            int n2 = (int)-1675912108L ^ 0x9C1B9C0F;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1953849142 ^ (long)-1953850751) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

