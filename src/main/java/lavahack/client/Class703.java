//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.nio.file.*;
import java.io.*;

public class Class703
{
    public final String Field10978 = "params.csv";
    public final String Field10979 = "fields.csv";
    public final String Field10980 = "methods.csv";
    public final String Field10981 = "lzma.txt";
    public final Path Field10982;
    public final Path Field10983;
    public final Path Field10984;
    public final Path Field10985;
    public HashMap Field10986;
    public HashMap Field10987;
    public HashMap Field10988;
    public HashMap Field10989;
    public final HashMap Field10990;
    public final HashMap Field10991;
    public final HashMap Field10992;
    private int Field10993;
    
    public Class703() {
        this.Field10982 = Paths.get("kisman.cc/Mapping/params.csv", new String[0]);
        this.Field10983 = Paths.get("kisman.cc/Mapping/fields.csv", new String[0]);
        this.Field10984 = Paths.get("kisman.cc/Mapping/methods.csv", new String[0]);
        this.Field10985 = Paths.get("kisman.cc/Mapping/lzma.txt", new String[0]);
        this.Field10990 = new HashMap();
        this.Field10991 = new HashMap();
        this.Field10992 = new HashMap();
    }
    
    public String Method2925(final String s) {
        return this.Field10986.getOrDefault(s, s);
    }
    
    public String Method2926(final String s) {
        return this.Field10987.getOrDefault(s, s);
    }
    
    public void Method2927() {
        if (!Class1796.Field16249) {
            Class1796.Field16243.error("Can't init CatLua :<");
            return;
        }
        Class1796.Field16243.info("[Remapper3000] Start remapping!");
        if (!Files.exists(this.Field10985, new LinkOption[0]) || !Files.exists(this.Field10983, new LinkOption[0]) || !Files.exists(this.Field10984, new LinkOption[0])) {
            Class1796.Field16243.error("[Remapper3000] You haven't mapping files, if you want to use lua scripts, you should to put mapping files in .minecraft/kisman.cc/Mapping/ and relaunch the client!");
        }
        else {
            final HashMap hashMap = new HashMap();
            this.Field10989 = hashMap;
            this.Field10988 = hashMap;
            this.Field10987 = hashMap;
            this.Field10986 = hashMap;
            if (!Class1796.Field16249) {
                return;
            }
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(this.Field10983, new OpenOption[0])));
            final Object o = null;
            String[] array = { "", "" };
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                final String[] split = line.split(",");
                this.Field10986.put(split[0], split[1]);
                array = new String[] { split[0], split[1] };
            }
            System.out.println("key - " + array[1] + "\nvalue - " + array[0]);
            if (bufferedReader != null) {
                if (o != null) {
                    bufferedReader.close();
                }
                else {
                    bufferedReader.close();
                }
            }
            final BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(Files.newInputStream(this.Field10984, new OpenOption[0])));
            final Object o2 = null;
            String[] array2 = { "", "" };
            String line2;
            while ((line2 = bufferedReader2.readLine()) != null) {
                final String[] split2 = line2.split(",");
                this.Field10987.put(split2[0], split2[0]);
                array2 = new String[] { split2[0], split2[1] };
            }
            System.out.println("key - " + array2[1] + "\nvalue - " + array2[0]);
            if (bufferedReader2 != null) {
                if (o2 != null) {
                    bufferedReader2.close();
                }
                else {
                    bufferedReader2.close();
                }
            }
            (Class1796.Field16241.Field16281 = new Class1362()).Method5435((InputStream)new FileInputStream(this.Field10985.toFile()));
        }
        Class1796.Field16243.info("[Remapper3000] Remapping has been finished!");
    }
    
    private static String Method2928(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x685A ^ 0x41));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
