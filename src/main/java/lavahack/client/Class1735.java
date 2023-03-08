//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1735
{
    Field15960("None", 0), 
    Field15961("Normal", 1), 
    Field15962("Silent", 2);
    
    private static final Class1735[] Field15963;
    private int Field15964;
    
    private Class1735(final String name, final int ordinal) {
    }
    
    static {
        Field15963 = new Class1735[] { Class1735.Field15960, Class1735.Field15961, Class1735.Field15962 };
    }
    
    private static String Method6606(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2AFE ^ 0x32));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
