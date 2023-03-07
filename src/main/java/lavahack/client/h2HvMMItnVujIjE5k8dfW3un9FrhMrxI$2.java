/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import lavahack.client.XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR;
import lavahack.client.h2HvMMItnVujIjE5k8dfW3un9FrhMrxI;

final class h2HvMMItnVujIjE5k8dfW3un9FrhMrxI$2
implements Runnable {
    final String Field15759;
    private String Field15760 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    h2HvMMItnVujIjE5k8dfW3un9FrhMrxI$2(String string) {
        this.Field15759 = string;
    }

    @Override
    public void run() {
        System.out.println("Attempting to play video with ID " + this.Field15759);
        String string = h2HvMMItnVujIjE5k8dfW3un9FrhMrxI.Method4170("https://www.convertmp3.io/fetch/?format=text&video=https://www.youtube.com/watch?v=" + this.Field15759);
        System.out.println(string);
        if (string.contains("meta")) {
            System.out.println("Sorry, this video has not yet been converted & cached. It is being converted now, come back later and it will be ready.");
        }
        URL uRL = new URL(string.split("Link: ")[(int)-669569497L ^ 0xD8172E26]);
        String string2 = string.split("Length: ")[(int)((long)1181217072 ^ (long)1181217073)];
        String string3 = string2.split(" <br")[(int)((long)-1196554863 ^ (long)-1196554863)];
        System.out.println("Length: " + string3);
        System.out.println("Successfully got virtual storage location");
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
        httpURLConnection.addRequestProperty(h2HvMMItnVujIjE5k8dfW3un9FrhMrxI.Field12517, h2HvMMItnVujIjE5k8dfW3un9FrhMrxI.Field12518);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        String string4 = httpURLConnection.getURL().toString();
        System.out.println("Successfully got physical location of song");
        XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Method6297(string4);
        System.out.println("Now Playing");
    }

    private static String Method6436(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1918819592 ^ (long)-1918819592);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)46173873L ^ 0x2C08E4E);
            int n2 = ((int)-1669887837L ^ 0x9C7788E0) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)804322963 ^ (long)804320022) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

