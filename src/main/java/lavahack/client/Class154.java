//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class154
{
    Field8596("kismancc", 0), 
    Field8597("LavaHack", 1), 
    Field8598("TheKisDevs", 2), 
    Field8599("kidman", 3), 
    Field8600("TheClient", 4), 
    Field8601("BloomWare", 5), 
    Field8602("UwU", 6), 
    Field8603("kidmad", 7), 
    Field8604("EarthHack", 8), 
    Field8605("Ferret", 9), 
    Field8606("custom", 10), 
    Field8607("ClientName", 11);
    
    private static final Class154[] Field8608;
    private int Field8609;
    
    private Class154(final String name, final int ordinal) {
    }
    
    static {
        Field8608 = new Class154[] { Class154.Field8596, Class154.Field8597, Class154.Field8598, Class154.Field8599, Class154.Field8600, Class154.Field8601, Class154.Field8602, Class154.Field8603, Class154.Field8604, Class154.Field8605, Class154.Field8606, Class154.Field8607 };
    }
    
    private static String Method1002(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x522F ^ 0x93));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
