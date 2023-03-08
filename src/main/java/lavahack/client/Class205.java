//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.objectweb.asm.*;

public class Class205 extends ClassWriter
{
    private int Field8896;
    
    public Class205(final int n) {
        super(n);
    }
    
    protected String Method1216(final String s, final String s2) {
        if (s.equals("blr")) {
            return "blk";
        }
        return "java/lang/Object";
    }
    
    private static String Method1217(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2FE9 ^ 0x44));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
