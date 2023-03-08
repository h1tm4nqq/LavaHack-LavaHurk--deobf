//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.io.*;
import java.util.*;

public class Class1790
{
    private final Map Field16209;
    private final Map Field16210;
    private final Map Field16211;
    private final Map Field16212;
    private int Field16213;
    
    public Class1790(final Map field16209, final Map field16210, final Map field16211, final Map field16212) {
        this.Field16209 = field16209;
        this.Field16210 = field16210;
        this.Field16211 = field16211;
        this.Field16212 = field16212;
    }
    
    public Map Method6769() {
        return this.Field16209;
    }
    
    public Map Method6770() {
        return this.Field16210;
    }
    
    public Map Method6771() {
        return this.Field16211;
    }
    
    public Map Method6772() {
        return this.Field16212;
    }
    
    public static Class1790 Method6773(final String name) throws IOException {
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        final HashMap hashMap3 = new HashMap();
        final HashMap hashMap4 = new HashMap();
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Objects.requireNonNull(Class1790.class.getClassLoader().getResourceAsStream(name))));
        final Object o = null;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            final String s = line.split(",")[0];
            switch (s.hashCode()) {
                case 94742904: {
                    if (s.equals("class")) {
                        continue;
                    }
                    continue;
                }
                case 97427706: {
                    if (s.equals("field")) {
                        continue;
                    }
                    continue;
                }
                case 3154628: {
                    if (s.equals("func")) {
                        continue;
                    }
                    continue;
                }
            }
        }
        if (bufferedReader != null) {
            if (o != null) {
                bufferedReader.close();
            }
            else {
                bufferedReader.close();
            }
        }
        return new Class1790(hashMap2, hashMap3, hashMap, hashMap4);
    }
    
    private static List Method6774(final String s) {
        return new ArrayList(1);
    }
    
    private static String Method6775(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4986 ^ 0xFE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
