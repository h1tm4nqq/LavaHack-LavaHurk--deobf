//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class923
{
    Field11900("None", 0), 
    Field11901("Crystal", 1), 
    Field11902("Pearl", 2), 
    Field11903("Totem", 3), 
    Field11904("Sword", 4), 
    Field11905("Pickaxe", 5), 
    Field11906("Axe", 6), 
    Field11907("Strength", 7), 
    Field11908("Chorus", 8), 
    Field11909("Shield", 9), 
    Field11910("Gapple", 10), 
    Field11911("RedstoneBlock", 11), 
    Field11912("Piston", 12), 
    Field11913("Obsidian", 13), 
    Field11914("EnderChest", 14), 
    Field11915("Exp", 15);
    
    private static final Class923[] Field11916;
    private int Field11917;
    
    private Class923(final String name, final int ordinal) {
    }
    
    static {
        Field11916 = new Class923[] { Class923.Field11900, Class923.Field11901, Class923.Field11902, Class923.Field11903, Class923.Field11904, Class923.Field11905, Class923.Field11906, Class923.Field11907, Class923.Field11908, Class923.Field11909, Class923.Field11910, Class923.Field11911, Class923.Field11912, Class923.Field11913, Class923.Field11914, Class923.Field11915 };
    }
    
    private static String Method3844(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1F4 ^ 0xB0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
