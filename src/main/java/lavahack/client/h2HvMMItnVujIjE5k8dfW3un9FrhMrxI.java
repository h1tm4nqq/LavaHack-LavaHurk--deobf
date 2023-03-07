/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lavahack.client.h2HvMMItnVujIjE5k8dfW3un9FrhMrxI$1;
import lavahack.client.h2HvMMItnVujIjE5k8dfW3un9FrhMrxI$2;
import lavahack.client.h2HvMMItnVujIjE5k8dfW3un9FrhMrxI$3;

public class h2HvMMItnVujIjE5k8dfW3un9FrhMrxI {
    public static String Field12517 = "User-Agent";
    public static String Field12518 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36";
    private int Field12519;

    public static String Method4167(String string) {
        ArrayList arrayList = new ArrayList();
        String string2 = "";
        new Thread(new h2HvMMItnVujIjE5k8dfW3un9FrhMrxI$1(string, arrayList)).start();
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String string3 = (String)iterator.next();
            string2 = string2 + string3;
        }
        return string2;
    }

    public static void Method4168(String string) {
        ArrayList arrayList = new ArrayList();
        String string2 = "";
        new Thread(new h2HvMMItnVujIjE5k8dfW3un9FrhMrxI$2(string)).start();
    }

    public static List Method4169(String string) {
        ArrayList arrayList = new ArrayList();
        new Thread(new h2HvMMItnVujIjE5k8dfW3un9FrhMrxI$3(string, arrayList)).start();
        return arrayList;
    }

    public static String Method4170(String string) {
        Object object;
        ArrayList<String> arrayList = new ArrayList<String>();
        String string2 = "";
        URL uRL = new URL(string);
        Object object2 = (HttpURLConnection)uRL.openConnection();
        ((URLConnection)object2).addRequestProperty(Field12517, Field12518);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(((URLConnection)object2).getInputStream(), "UTF-8"));
        while ((object = bufferedReader.readLine()) != null) {
            arrayList.add((String)object);
        }
        object = arrayList.iterator();
        while (object.hasNext()) {
            object2 = (String)object.next();
            string2 = string2 + (String)object2;
        }
        return string2;
    }

    private static String Method4171(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)974465082L ^ 0x3A15283A;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1562537982L ^ 0x5D226F01);
            int n2 = (int)-346309720L ^ 0xEB5BBBE9;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-392079380 ^ (long)-392081223) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

