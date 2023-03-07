/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ArrayList;
import lavahack.client.Dzdnshc8ASybvyDRNs0jWVS0PHAwpepd;
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.HOKNToKSLv8ndFpMwlqBYSsOzF8pxGqY;
import lavahack.client.MUU5rY7bYKphpPNPTaXWkJXha4Qjva9q;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.TDrOJYGYE6GxbjOEblLxwsKQtY1HZZvO;
import lavahack.client.aVhQcqd4Hc1pL4UEBC6g8vsoe8wyJ8uY;
import lavahack.client.dxECsBiCCQZR3sg44LtDW8kcY6zewFx8;
import lavahack.client.g9ACcWJQzdXB5LBLWDC3b7mU2TcuKMwK;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.nNkPle7w34lMi0rtTNBkV7SXBXo02JDb;
import org.jetbrains.annotations.NotNull;

public class c2oeCshnhAcIH7aXeJp09KDB8j0W468R
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    private int Field15607;

    public c2oeCshnhAcIH7aXeJp09KDB8j0W468R() {
        super("macro");
    }

    @Override
    public String Method447() {
        return "";
    }

    @Override
    public String Method448() {
        return "";
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        String string2 = c2oeCshnhAcIH7aXeJp09KDB8j0W468R.Method6360(stringArray);
        String string3 = string2.substring(string2.indexOf((int)((long)-114040572 ^ (long)-114040575) << 3) + (int)((long)-697884750 ^ (long)-697884749), string2.indexOf((int)((long)1481992808 ^ (long)1481992769)));
        String string4 = string2.substring(string2.indexOf((int)((long)-858100009 ^ (long)-858100052)) + (int)((long)-1256830632 ^ (long)-1256830631), string2.indexOf((int)((long)591332061 ^ (long)591332000)));
        String[] stringArray2 = string4.split(":");
        String string5 = stringArray2[(int)-2016180939L ^ 0x87D38535].trim();
        String string6 = stringArray2[(int)((long)-855418512 ^ (long)-855418511)].trim();
        aVhQcqd4Hc1pL4UEBC6g8vsoe8wyJ8uY aVhQcqd4Hc1pL4UEBC6g8vsoe8wyJ8uY2 = Dzdnshc8ASybvyDRNs0jWVS0PHAwpepd.Method5688(string5);
        if (aVhQcqd4Hc1pL4UEBC6g8vsoe8wyJ8uY2 == null) {
            c2oeCshnhAcIH7aXeJp09KDB8j0W468R.Method6361("[MacroCommand] " + string5 + " is an invalid macro");
            return;
        }
        TDrOJYGYE6GxbjOEblLxwsKQtY1HZZvO tDrOJYGYE6GxbjOEblLxwsKQtY1HZZvO = aVhQcqd4Hc1pL4UEBC6g8vsoe8wyJ8uY2.Method6962(string6);
        String string7 = string2.substring(string2.indexOf((int)1888793513L ^ 0x7094B3F2) + ((int)31906210L ^ 0x1E6D9A3), string2.indexOf((int)789384928L ^ 0x2F0D0EBD));
        String[] stringArray3 = string7.split(",");
        ArrayList<dxECsBiCCQZR3sg44LtDW8kcY6zewFx8> arrayList = new ArrayList<dxECsBiCCQZR3sg44LtDW8kcY6zewFx8>();
        Object object = stringArray3;
        int n = ((String[])object).length;
        int n2 = (int)((long)-1671124278 ^ (long)-1671124278);
        while (true) {
            if (n2 >= n) {
                object = new MUU5rY7bYKphpPNPTaXWkJXha4Qjva9q(string3, tDrOJYGYE6GxbjOEblLxwsKQtY1HZZvO, arrayList);
                ((MUU5rY7bYKphpPNPTaXWkJXha4Qjva9q)object).Method5065();
                g9ACcWJQzdXB5LBLWDC3b7mU2TcuKMwK.Method729((MUU5rY7bYKphpPNPTaXWkJXha4Qjva9q)object);
                return;
            }
            String string8 = object[n2];
            String[] stringArray4 = string8.trim().split(":");
            String string9 = stringArray4[(int)((long)259938118 ^ (long)259938118)].trim();
            String string10 = stringArray4[(int)((long)-1206969007 ^ (long)-1206969008)].trim();
            nNkPle7w34lMi0rtTNBkV7SXBXo02JDb nNkPle7w34lMi0rtTNBkV7SXBXo02JDb2 = HOKNToKSLv8ndFpMwlqBYSsOzF8pxGqY.Method4617(string9);
            if (nNkPle7w34lMi0rtTNBkV7SXBXo02JDb2 == null) {
                c2oeCshnhAcIH7aXeJp09KDB8j0W468R.Method6361("[MacroCommand] " + string9 + " is an invalid activator");
                return;
            }
            arrayList.add(nNkPle7w34lMi0rtTNBkV7SXBXo02JDb2.Method7634(string10, tDrOJYGYE6GxbjOEblLxwsKQtY1HZZvO));
            ++n2;
        }
    }

    private static String Method6360(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = (int)656492594L ^ 0x27214832;
        while (n < stringArray.length) {
            stringBuilder.append(stringArray[n]);
            if (n < stringArray.length - (int)((long)-2021975592 ^ (long)-2021975591)) {
                stringBuilder.append(((int)-1756530867L ^ 0x974D774C) << 5);
            }
            ++n;
        }
        return stringBuilder.toString();
    }

    private static void Method6361(String string) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.error(string);
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1882(string);
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-407161585L ^ 0xE7BB350F;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)29190681 ^ (long)29190886);
            int n2 = (int)((long)-755923332 ^ (long)-755923361);
            cArray2[n] = (char)(cArray[n] ^ ((int)-1747392643L ^ 0x97D8970E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

