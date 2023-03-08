//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class2061 extends Class42
{
    public final Class44 Field17417;
    public final Class44 Field17418;
    public final Class44 Field17419;
    public final Class44 Field17420;
    public static Class2061 Field17421;
    private int Field17422;
    
    public Class2061() {
        super("SmallShield", Class97.Field8342);
        this.Field17417 = this.Method23(new Class44("MainHandX", this, 0.0, Double.longBitsToDouble((long)540246078 ^ 0xBFF000002033803EL), 1.0, false));
        this.Field17418 = this.Method23(new Class44("MainHandY", this, 0.0, Double.longBitsToDouble((long)2147402397 ^ 0xBFF000007FFEC29DL), 1.0, false));
        this.Field17419 = this.Method23(new Class44("OffHandX", this, 0.0, Double.longBitsToDouble((long)741351957 ^ 0xBFF000002C302215L), 1.0, false));
        this.Field17420 = this.Method23(new Class44("OffHandY", this, 0.0, Double.longBitsToDouble(-4616189618054758400L), 1.0, false));
        Class2061.Field17421 = this;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x32B4 ^ 0x75));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
