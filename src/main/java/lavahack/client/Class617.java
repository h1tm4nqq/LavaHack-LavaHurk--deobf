//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class617
{
    Field10633("ALL", 0, "schematica.gui.all"), 
    Field10634("SINGLE_LAYER", 1, "schematica.gui.layers"), 
    Field10635("ALL_BELOW", 2, "schematica.gui.below");
    
    public final String Field10636;
    private static final Class617[] Field10637;
    private int Field10638;
    
    public abstract boolean Method1104(final Class1479 p0, final int p1);
    
    private Class617(final String name, final int ordinal, final String field10636) {
        this.Field10636 = field10636;
    }
    
    public static Class617 Method1105(final Class617 class617) {
        final Class617[] values = values();
        return values[(class617.ordinal() + 1) % values.length];
    }
    
    Class617(final String s, final int n, final String s2, final Class144 class144) {
        this(s, n, s2);
    }
    
    static {
        Field10637 = new Class617[] { Class617.Field10633, Class617.Field10634, Class617.Field10635 };
    }
    
    private static String Method1106(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1F43 ^ 0xB4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
