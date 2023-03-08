//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class1858
{
    Field16549("Off", 0), 
    Field16550("RemoveEntity", 1), 
    Field16551("SetDead", 2), 
    Field16552("Both", 3);
    
    private static final Class1858[] Field16553;
    private String Field16554 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1858(final String name, final int ordinal) {
    }
    
    static {
        Field16553 = new Class1858[] { Class1858.Field16549, Class1858.Field16550, Class1858.Field16551, Class1858.Field16552 };
    }
    
    private static String Method6950(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4452 ^ 0xFA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
