//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class1986 extends Class158
{
    private String Field17127 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1986() {
        super("toggle");
    }
    
    public void Method443(final String s, final String[] array) {
        final String str = array[0];
        Class1796.Field16241.Field16254.Method1162(str);
        if (array.length > 1) {
            this.Method438("Usage: " + this.Method448());
            return;
        }
        Class1796.Field16241.Field16254.Method1162(str).Method21(!Class1796.Field16241.Field16254.Method1162(str).Method35());
        this.Method437("Module " + str + " has been toggled!");
    }
    
    public String Method447() {
        return "toggled modules";
    }
    
    public String Method448() {
        return "toggle <module>";
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2A92 ^ 0x72));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
