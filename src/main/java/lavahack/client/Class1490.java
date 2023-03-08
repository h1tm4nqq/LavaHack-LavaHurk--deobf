//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.input.*;
import java.util.*;

public class Class1490 extends Class158
{
    private String Field14973 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1490() {
        super("bind");
    }
    
    @Override
    public void Method443(final String s, final String[] array) {
        final String s2 = array[0];
        final String s3 = array[0];
        if (array.length == 1 && !s3.equalsIgnoreCase("list")) {
            this.Method438("Usage: " + this.Method448());
            return;
        }
        if (array.length > 2 && s3.equalsIgnoreCase("list")) {
            this.Method438("Usage: " + this.Method448());
            return;
        }
        if (array.length == 1 && s3.equalsIgnoreCase("list")) {
            this.Method435("----------------------------------");
            this.Method435("Bind List:");
            this.Method435("----------------------------------");
            return;
        }
        for (final Class42 class42 : Class1796.Field16241.Field16254.Field8854) {
            if (class42.Method40().equalsIgnoreCase(array[1])) {
                class42.Method13(Class955.Field12068);
                class42.Method9(Keyboard.getKeyIndex(s2.toUpperCase()));
                this.Method435(class42.Method40() + " binned to " + Keyboard.getKeyName(class42.Method8()));
            }
        }
    }
    
    @Override
    public String Method447() {
        return "Changes key for modules/commands. | Shows your bind list";
    }
    
    @Override
    public String Method448() {
        return "bind <key> <command/module> or bind list";
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x9F7 ^ 0xEA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
