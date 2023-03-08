//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class2049 extends Class1 implements Class1892
{
    private String Field17397;
    private int Field17398;
    
    public Class2049() {
        this.Field17397 = "*";
    }
    
    public void Method7008(final String field17397) {
        if (field17397 == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        this.Field17397 = field17397;
    }
    
    public String Method2233() {
        return this.Field17397;
    }
    
    private static String Method7(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x62C ^ 0xA1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
