//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class916 extends Class158
{
    private String Field11886 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class916() {
        super("friend");
    }
    
    public void Method443(final String s, final String[] array) {
        if (array[0].equalsIgnoreCase("add")) {
            Class1796.Field16241.Field16256.Method3040(array[1]);
            this.Method437(array[1] + " added in friends!");
        }
        else if (array[0].equalsIgnoreCase("remove")) {
            Class1796.Field16241.Field16256.Method3041(array[1]);
            this.Method437(array[1] + " removed from friends :(");
        }
        else {
            if (!array[0].equalsIgnoreCase("list")) {
                throw new Exception();
            }
            String s2 = "Friends: ";
            for (int i = 0; i < Class726.Field11086.Method3039().size(); ++i) {
                s2 += (String)Class726.Field11086.Method3039().get(i);
                if (i != Class726.Field11086.Method3039().size() - 1) {
                    s2 += ", ";
                }
            }
            this.Method437(s2);
        }
    }
    
    public String Method447() {
        return "friend's command";
    }
    
    public String Method448() {
        return "friend add/remove <player's name> | friend list";
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7141 ^ 0x23));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
