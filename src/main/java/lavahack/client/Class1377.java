//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class1377
{
    Field14244("Curve", 0), 
    Field14245("Curve2", 1), 
    Field14246("Sin", 2), 
    Field14247("FullCurve", 3), 
    Field14248("FullSin", 4), 
    Field14249("ReverseCurve", 5);
    
    private static final Class1377[] Field14250;
    private int Field14251;
    
    private Class1377(final String name, final int ordinal) {
    }
    
    static {
        Field14250 = new Class1377[] { Class1377.Field14244, Class1377.Field14245, Class1377.Field14246, Class1377.Field14247, Class1377.Field14248, Class1377.Field14249 };
    }
    
    private static String Method5480(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x238B ^ 0x1C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
