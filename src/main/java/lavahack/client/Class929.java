//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public abstract class Class929 extends Class494
{
    private int Field11935;
    
    public Class929(final Class927 class927) {
        super(class927);
    }
    
    public void Method1620() throws Class23 {
        if (!this.Method1612()) {
            throw new Class475("Control frame can't have fin==false set");
        }
        if (this.Method1613()) {
            throw new Class475("Control frame can't have rsv1==true set");
        }
        if (this.Method1614()) {
            throw new Class475("Control frame can't have rsv2==true set");
        }
        if (this.Method1615()) {
            throw new Class475("Control frame can't have rsv3==true set");
        }
    }
    
    private static String Method1628(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x294F ^ 0xF2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
