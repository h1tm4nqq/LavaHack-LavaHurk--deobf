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
import lavahack.client.auE3dCySxyIc1tKngAVuALlcvYBWsMni;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;

public class pA7QGCR74zCuCMNttxzQD6TX0owx4gST {
    public final String Field10978 = "params.csv";
    public final String Field10979 = "fields.csv";
    public final String Field10980 = "methods.csv";
    public final String Field10981 = "lzma.txt";
    public final Path Field10982 = Paths.get("kisman.cc/Mapping/params.csv", new String[(int)((long)1667624328 ^ (long)1667624328)]);
    public final Path Field10983 = Paths.get("kisman.cc/Mapping/fields.csv", new String[(int)-1033857023L ^ 0xC2609801]);
    public final Path Field10984 = Paths.get("kisman.cc/Mapping/methods.csv", new String[(int)((long)-1724948523 ^ (long)-1724948523)]);
    public final Path Field10985 = Paths.get("kisman.cc/Mapping/lzma.txt", new String[(int)303463431L ^ 0x12167C07]);
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
        if (!leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16249) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.error("Can't init CatLua :<");
            return;
        }
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.info("[Remapper3000] Start remapping!");
        if (!(Files.exists(this.Field10985, new LinkOption[(int)203397895L ^ 0xC1F9B07]) && Files.exists(this.Field10983, new LinkOption[(int)((long)405338608 ^ (long)405338608)]) && Files.exists(this.Field10984, new LinkOption[(int)1920602494L ^ 0x727A117E]))) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.error("[Remapper3000] You haven't mapping files, if you want to use lua scripts, you should to put mapping files in .minecraft/kisman.cc/Mapping/ and relaunch the client!");
        } else {
            String[] stringArray;
            String string;
            this.Field10988 = this.Field10989 = new HashMap();
            this.Field10987 = this.Field10989;
            this.Field10986 = this.Field10989;
            if (!leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16249) {
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(this.Field10983, new OpenOption[(int)((long)1214641264 ^ (long)1214641264)])));
            Object var2_2 = null;
            String[] stringArray2 = new String[(int)((long)424998054 ^ (long)424998055) << 1];
            stringArray2[(int)((long)1766409359 ^ (long)1766409359)] = "";
            stringArray2[(int)-1048719234L ^ 0xC17DD07F] = "";
            String[] stringArray3 = stringArray2;
            while ((string = bufferedReader.readLine()) != null) {
                stringArray = string.split(",");
                this.Field10986.put(stringArray[(int)1584867099L ^ 0x5E77271B], stringArray[(int)127742657L ^ 0x79D32C0]);
                String[] stringArray4 = new String[(int)((long)2116480543 ^ (long)2116480542) << 1];
                stringArray4[(int)-321702023L ^ 0xECD33779] = stringArray[(int)((long)-1980770809 ^ (long)-1980770809)];
                stringArray4[(int)((long)555664047 ^ (long)555664046)] = stringArray[(int)((long)-785543488 ^ (long)-785543487)];
                stringArray3 = stringArray4;
            }
            System.out.println("key - " + stringArray3[(int)-1237771569L ^ 0xB6391ACE] + "\nvalue - " + stringArray3[(int)((long)-508532016 ^ (long)-508532016)]);
            if (bufferedReader != null) {
                if (var2_2 != null) {
                    bufferedReader.close();
                } else {
                    bufferedReader.close();
                }
            }
            bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(this.Field10984, new OpenOption[(int)((long)664649291 ^ (long)664649291)])));
            var2_2 = null;
            String[] stringArray5 = new String[(int)((long)-401310224 ^ (long)-401310223) << 1];
            stringArray5[(int)2021782379L ^ 0x7881F36B] = "";
            stringArray5[(int)((long)494268352 ^ (long)494268353)] = "";
            stringArray3 = stringArray5;
            while ((string = bufferedReader.readLine()) != null) {
                stringArray = string.split(",");
                this.Field10987.put(stringArray[(int)((long)-456830898 ^ (long)-456830898)], stringArray[(int)((long)-812959179 ^ (long)-812959179)]);
                String[] stringArray6 = new String[((int)-479321183L ^ 0xE36E23A0) << 1];
                stringArray6[(int)-188996025L ^ 0xF4BC2647] = stringArray[(int)-1674176277L ^ 0x9C3618EB];
                stringArray6[(int)-984046359L ^ 0xC558A4E8] = stringArray[(int)1025776555L ^ 0x3D241BAA];
                stringArray3 = stringArray6;
            }
            System.out.println("key - " + stringArray3[(int)((long)-753041954 ^ (long)-753041953)] + "\nvalue - " + stringArray3[(int)-1192806574L ^ 0xB8E73752]);
            if (bufferedReader != null) {
                if (var2_2 != null) {
                    bufferedReader.close();
                } else {
                    bufferedReader.close();
                }
            }
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16281 = new auE3dCySxyIc1tKngAVuALlcvYBWsMni();
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16281.Method5435(new FileInputStream(this.Field10985.toFile()));
        }
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.info("[Remapper3000] Remapping has been finished!");
    }

    private static String Method2928(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-473911553L ^ 0xE3C0AEFF;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1070206102 ^ (long)-1070206059);
            int n2 = (int)-1152816692L ^ 0xBB49698D;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1099809596 ^ (long)1099822865) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

