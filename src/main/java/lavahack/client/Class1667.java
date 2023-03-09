/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import lavahack.client.Class1028;
import lavahack.client.Class1617;

final class Class1667
implements Runnable {
    final String Field15759;
    private String Field15760 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class1667(String string) {
        this.Field15759 = string;
    }

    @Override
    public void run() {
        System.out.println("Attempting to play video with ID " + this.Field15759);
        String string = Class1028.Method4170("https://www.convertmp3.io/fetch/?format=text&video=https://www.youtube.com/watch?v=" + this.Field15759);
        System.out.println(string);
        if (string.contains("meta")) {
            System.out.println("Sorry, this video has not yet been converted & cached. It is being converted now, come back later and it will be ready.");
        }
        URL uRL = new URL(string.split("Link: ")[1]);
        String string2 = string.split("Length: ")[1];
        String string3 = string2.split(" <br")[0];
        System.out.println("Length: " + string3);
        System.out.println("Successfully got virtual storage location");
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
        httpURLConnection.addRequestProperty(Class1028.Field12517, Class1028.Field12518);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        String string4 = httpURLConnection.getURL().toString();
        System.out.println("Successfully got physical location of song");
        Class1617.Method6297(string4);
        System.out.println("Now Playing");
    }

    private static String Method6436(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 134;
            cArray2[n] = (char)(cArray[n] ^ (0xD85 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

