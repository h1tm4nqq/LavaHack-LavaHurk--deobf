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

final class Class1666
implements Runnable {
    final String Field15756;
    final List Field15757;
    private int Field15758;

    Class1666(String string, List list) {
        this.Field15756 = string;
        this.Field15757 = list;
    }

    @Override
    public void run() {
        String string;
        URL uRL = new URL(this.Field15756);
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
        httpURLConnection.addRequestProperty(Class1028.Field12517, Class1028.Field12518);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        while ((string = bufferedReader.readLine()) != null) {
            this.Field15757.add(string);
        }
    }
}

