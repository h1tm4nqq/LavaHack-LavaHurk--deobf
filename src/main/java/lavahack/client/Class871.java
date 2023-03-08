//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.lang.reflect.*;
import java.util.*;

class Class871
{
    private final HashMap Field11665;
    final Class1073 Field11666;
    private String Field11667 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class871(final Class1073 field11666) {
        this.Field11666 = field11666;
        this.Field11665 = new HashMap();
    }
    
    void Method3663(final String key, final Object value) {
        if (value != null) {
            this.Field11665.put(key, value);
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        final Set<Map.Entry<K, Object>> entrySet = (Set<Map.Entry<K, Object>>)this.Field11665.entrySet();
        sb.append("{");
        int n = 0;
        for (final Map.Entry<K, Object> entry : entrySet) {
            final Object value = entry.getValue();
            sb.append(this.Method3664((String)entry.getKey())).append(":");
            if (value instanceof String) {
                sb.append(this.Method3664(String.valueOf(value)));
            }
            else if (value instanceof Integer) {
                sb.append(Integer.valueOf(String.valueOf(value)));
            }
            else if (value instanceof Boolean) {
                sb.append(value);
            }
            else if (value instanceof Class871) {
                sb.append(value.toString());
            }
            else if (value.getClass().isArray()) {
                sb.append("[");
                for (int length = Array.getLength(value), i = 0; i < length; ++i) {
                    sb.append(Array.get(value, i).toString()).append((i != length - 1) ? "," : "");
                }
                sb.append("]");
            }
            sb.append((++n == entrySet.size()) ? "}" : ",");
        }
        return sb.toString();
    }
    
    private String Method3664(final String str) {
        return "\"" + str + "\"";
    }
    
    Class871(final Class1073 class1073, final Class1383 class1074) {
        this(class1073);
    }
    
    private static String Method3665(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2818 ^ 0xEE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
