/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import lavahack.client.Class1362;
import lavahack.client.Class1796;

public class Class703 {
    public final String Field10978 = "params.csv";
    public final String Field10979 = "fields.csv";
    public final String Field10980 = "methods.csv";
    public final String Field10981 = "lzma.txt";
    public final Path Field10982 = Paths.get("kisman.cc/Mapping/params.csv", new String[0]);
    public final Path Field10983 = Paths.get("kisman.cc/Mapping/fields.csv", new String[0]);
    public final Path Field10984 = Paths.get("kisman.cc/Mapping/methods.csv", new String[0]);
    public final Path Field10985 = Paths.get("kisman.cc/Mapping/lzma.txt", new String[0]);
    public HashMap Field10986;
    public HashMap Field10987;
    public HashMap Field10988;
    public HashMap Field10989;
    public final HashMap Field10990 = new HashMap();
    public final HashMap Field10991 = new HashMap();
    public final HashMap Field10992 = new HashMap();
    private int Field10993;

    public String Method2925(String string) {
        return this.Field10986.getOrDefault(string, string);
    }

    public String Method2926(String string) {
        return this.Field10987.getOrDefault(string, string);
    }

    public void Method2927() {
        if (!Class1796.Field16249) {
            Class1796.Field16243.error("Can't init CatLua :<");
            return;
        }
        Class1796.Field16243.info("[Remapper3000] Start remapping!");
        if (!(Files.exists(this.Field10985, new LinkOption[0]) && Files.exists(this.Field10983, new LinkOption[0]) && Files.exists(this.Field10984, new LinkOption[0]))) {
            Class1796.Field16243.error("[Remapper3000] You haven't mapping files, if you want to use lua scripts, you should to put mapping files in .minecraft/kisman.cc/Mapping/ and relaunch the client!");
        } else {
            String[] stringArray;
            String string;
            this.Field10988 = this.Field10989 = new HashMap();
            this.Field10987 = this.Field10989;
            this.Field10986 = this.Field10989;
            if (!Class1796.Field16249) {
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(this.Field10983, new OpenOption[0])));
            Object var2_2 = null;
            String[] stringArray2 = new String[]{"", ""};
            while ((string = bufferedReader.readLine()) != null) {
                stringArray = string.split(",");
                this.Field10986.put(stringArray[0], stringArray[1]);
                stringArray2 = new String[]{stringArray[0], stringArray[1]};
            }
            System.out.println("key - " + stringArray2[1] + "\nvalue - " + stringArray2[0]);
            if (bufferedReader != null) {
                if (var2_2 != null) {
                    bufferedReader.close();
                } else {
                    bufferedReader.close();
                }
            }
            bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(this.Field10984, new OpenOption[0])));
            var2_2 = null;
            stringArray2 = new String[]{"", ""};
            while ((string = bufferedReader.readLine()) != null) {
                stringArray = string.split(",");
                this.Field10987.put(stringArray[0], stringArray[0]);
                stringArray2 = new String[]{stringArray[0], stringArray[1]};
            }
            System.out.println("key - " + stringArray2[1] + "\nvalue - " + stringArray2[0]);
            if (bufferedReader != null) {
                if (var2_2 != null) {
                    bufferedReader.close();
                } else {
                    bufferedReader.close();
                }
            }
            Class1796.Field16241.Field16281 = new Class1362();
            Class1796.Field16241.Field16281.Method5435(new FileInputStream(this.Field10985.toFile()));
        }
        Class1796.Field16243.info("[Remapper3000] Remapping has been finished!");
    }

    private static String Method2928(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 65;
            cArray2[n] = (char)(cArray[n] ^ (0x685A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

