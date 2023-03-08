//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class1263
{
    Field13712("Normal", 0), 
    Field13713("SwitchBack", 1);
    
    private static final Class1263[] Field13714;
    private String Field13715 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1263(final String name, final int ordinal) {
    }
    
    static {
        Field13714 = new Class1263[] { Class1263.Field13712, Class1263.Field13713 };
    }
    
    private static String Method5096(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4FEB ^ 0xEC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
