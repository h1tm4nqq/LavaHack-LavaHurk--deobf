//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class2173 extends Class42
{
    @Class873
    public static Class2173 Field17944;
    private int Field17945;
    
    public Class2173() {
        super("ModuleInstancingJava", "Tests @ModuleInstance annotation in java", Class97.Field8345);
    }
    
    @Override
    public void Method45() {
        if (Class2173.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class2173.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class1393.Method5506().Method1886("Instance of module " + this.Method40() + " is " + "NULL");
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x57A3 ^ 0xA6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
