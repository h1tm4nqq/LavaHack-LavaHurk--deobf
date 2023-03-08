//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;

public class Class1627 extends Class158
{
    private int Field15606;
    
    public Class1627() {
        super("antispam");
    }
    
    public void Method443(final String s, final String[] array) {
        if (array[0].equalsIgnoreCase("add")) {
            Class848.Field11583.Field11584.add(array[1]);
            this.Method437(array[1] + " added to AntiSpammer list");
        }
        else if (array[0].equalsIgnoreCase("remove")) {
            Class848.Field11583.Field11584.remove(array[1]);
            this.Method437(array[1] + " removed from AntiSpammer list");
        }
        else if (array[0].equalsIgnoreCase("clear")) {
            Class848.Field11583.Field11584.clear();
            this.Method437("AntiSpammer list has been cleared");
        }
        else if (array[0].equalsIgnoreCase("list")) {
            this.Method439("AntiSpammer list:");
            final Iterator<String> iterator = Class848.Field11583.Field11584.iterator();
            while (iterator.hasNext()) {
                this.Method439((String)iterator.next());
            }
        }
    }
    
    public String Method447() {
        return "null";
    }
    
    public String Method448() {
        return "antispam <add/remove/list>";
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x388E ^ 0xA4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
