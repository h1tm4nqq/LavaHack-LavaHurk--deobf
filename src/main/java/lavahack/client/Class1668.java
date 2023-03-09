/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import lavahack.client.Class1028;

final class Class1668
implements Runnable {
    final String Field15761;
    final List Field15762;
    private String Field15763 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class1668(String string, List list) {
        this.Field15761 = string;
        this.Field15762 = list;
    }

    @Override
    public void run() {
        String string;
        URL uRL = new URL(this.Field15761);
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
        httpURLConnection.addRequestProperty(Class1028.Field12517, Class1028.Field12518);
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 91;
            cArray2[n] = (char)(cArray[n] ^ (0x7496 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

