//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.nbt.*;

public class Class2105 extends Class153
{
    private String Field17586 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class686 Method990(final NBTTagCompound nbtTagCompound) {
        return null;
    }
    
    public boolean Method991(final NBTTagCompound nbtTagCompound, final Class686 class686) {
        return false;
    }
    
    public String Method992() {
        return "schematica.format.classic";
    }
    
    public String Method993() {
        return ".schematic";
    }
    
    private static String Method1001(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5000 ^ 0x82));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
