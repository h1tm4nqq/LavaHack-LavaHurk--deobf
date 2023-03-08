//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

public abstract class Class1679 extends Class1327
{
    private String Field15818 = "TheKisDevs & LavaHack Development owns you";
    
    public Class1679(final Class1753 class1753) {
        super(class1753);
    }
    
    public void Method84() throws Class902 {
        if (!this.Method76()) {
            throw new Class939("Control frame can't have fin==false set");
        }
        if (this.Method77()) {
            throw new Class939("Control frame can't have rsv1==true set");
        }
        if (this.Method78()) {
            throw new Class939("Control frame can't have rsv2==true set");
        }
        if (this.Method79()) {
            throw new Class939("Control frame can't have rsv3==true set");
        }
    }
    
    private static String Method92(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2358 ^ 0xAC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
