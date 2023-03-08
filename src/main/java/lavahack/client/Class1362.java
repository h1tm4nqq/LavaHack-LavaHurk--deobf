//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.io.*;
import it.unimi.dsi.fastutil.objects.*;
import org.objectweb.asm.*;
import java.util.*;

public class Class1362
{
    public ObjectList Field14198;
    public ObjectList Field14199;
    public ObjectList Field14200;
    private String Field14201 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method5435(final InputStream in) throws IOException {
        this.Field14198 = (ObjectList)new ObjectArrayList();
        this.Field14199 = (ObjectList)new ObjectArrayList();
        this.Field14200 = (ObjectList)new ObjectArrayList();
        String line;
        while ((line = new BufferedReader(new InputStreamReader(in)).readLine()) != null) {
            if (line.startsWith("CL")) {
                final String[] split = line.replace("CL: ", "").split(" ");
                final Class685 class685 = new Class685();
                class685.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = split[0];
                final Class685 class686 = class685;
                final Class685 class687 = class685;
                final String s = split[1];
                class687.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS = s;
                class686.Ljc0gDTN8WkwPRHY480HpEkScGALG41A = s;
                this.Field14198.add((Object)class685);
                System.out.println("Class: official " + class685.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV + ", named/intermediary " + class685.Ljc0gDTN8WkwPRHY480HpEkScGALG41A);
            }
            if (line.startsWith("FD")) {
                final String[] split2 = line.replaceAll("FD: ", "").split(" ");
                final Class1070 class688 = new Class1070();
                class688.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = split2[0].split("/")[1];
                class688.Field12715 = "";
                class688.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS = split2[1].split("/")[split2[1].split("/").length - 1];
                class688.Ljc0gDTN8WkwPRHY480HpEkScGALG41A = Class1796.Field16241.Field16280.Method2925(class688.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS);
                class688.Field12717 = this.Method5436(split2[0].split("/")[0], Class1458.Field14820);
                if (class688.Field12717 != null) {
                    class688.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = class688.Field12717.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
                }
                this.Field14200.add((Object)class688);
                System.out.println("Field: official " + class688.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV + ", named " + class688.Ljc0gDTN8WkwPRHY480HpEkScGALG41A + ", intermediary " + class688.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS);
            }
            if (line.startsWith("MD")) {
                final String[] split3 = line.replace("MD: ", "").split(" ");
                final Class553 class689 = new Class553();
                class689.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = split3[0].split("/")[1];
                class689.Field10347 = split3[1];
                class689.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS = split3[2].split("/")[split3[2].split("/").length - 1];
                class689.Ljc0gDTN8WkwPRHY480HpEkScGALG41A = Class1796.Field16241.Field16280.Method2926(class689.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS);
                class689.Field10350 = this.Method5436(split3[0].split("/")[0], Class1458.Field14820);
                if (class689.Field10350 != null) {
                    class689.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = class689.Field10350.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
                }
                this.Field14199.add((Object)class689);
                System.out.println("Method: official " + class689.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV + ", named " + class689.Ljc0gDTN8WkwPRHY480HpEkScGALG41A + ", intermediary " + class689.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS);
            }
        }
    }
    
    public Class685 Method5436(final String anObject, final Class1458 class1458) {
        for (final Class685 class1459 : this.Field14198) {
            switch (Class15.Field7892[class1458.ordinal()]) {
                case 1: {
                    if (class1459.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.equals(anObject)) {
                        return class1459;
                    }
                    continue;
                }
                case 2: {
                    if (class1459.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.equals(anObject)) {
                        return class1459;
                    }
                    continue;
                }
                case 3: {
                    if (class1459.Ljc0gDTN8WkwPRHY480HpEkScGALG41A.equals(anObject)) {
                        return class1459;
                    }
                    continue;
                }
            }
        }
        return null;
    }
    
    public Class1070 Method5437(final String anObject, final String anObject2, final Class95 class95) {
        for (final Class1070 class96 : this.Field14200) {
            if (class96.Ljc0gDTN8WkwPRHY480HpEkScGALG41A == null) {
                continue;
            }
            if (anObject != null && !class96.Field12717.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.equals(anObject)) {
                continue;
            }
            switch (Class15.Field7893[class95.ordinal()]) {
                case 1: {
                    if (class96.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.equals(anObject2)) {
                        return class96;
                    }
                    continue;
                }
                case 2: {
                    if (class96.Ljc0gDTN8WkwPRHY480HpEkScGALG41A.equals(anObject2)) {
                        return class96;
                    }
                    continue;
                }
                case 3: {
                    if (class96.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.equals(anObject2)) {
                        return class96;
                    }
                    continue;
                }
            }
        }
        return null;
    }
    
    public Class553 Method5438(final String anObject, final String s, final Class95 class95, final int n, final String s2) {
        for (final Class553 class96 : this.Field14199) {
            if (class96.Ljc0gDTN8WkwPRHY480HpEkScGALG41A == null) {
                continue;
            }
            if (anObject != null && !class96.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.equals(anObject)) {
                continue;
            }
            if (n != -1 && Type.getArgumentTypes(class96.Field10347).length != n) {
                continue;
            }
            if (s2 != null && !class96.Field10347.contains(s2)) {
                continue;
            }
            switch (Class15.Field7893[class95.ordinal()]) {
                case 1: {
                    if (class96.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.equals(s)) {
                        return class96;
                    }
                    continue;
                }
                case 2: {
                    if (class96.Ljc0gDTN8WkwPRHY480HpEkScGALG41A.equals(s)) {
                        return class96;
                    }
                    continue;
                }
            }
        }
        return null;
    }
    
    public List Method5439() {
        return (List)this.Field14198;
    }
    
    public List Method5440() {
        return (List)this.Field14200;
    }
    
    public List Method5441() {
        return (List)this.Field14199;
    }
    
    private static String Method5442(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3DF6 ^ 0xE3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
