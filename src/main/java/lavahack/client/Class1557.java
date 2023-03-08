//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class1557 extends Class42
{
    private boolean Field15267;
    private int Field15268;
    
    public Class1557() {
        super("AntiAutoJump", Class97.Field8343);
    }
    
    @Override
    public void Method38() {
        this.Field15267 = Class1557.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.autoJump;
    }
    
    @Override
    public void Method45() {
        if (Class1557.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.autoJump) {
            Class1557.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.autoJump = false;
        }
    }
    
    @Override
    public void Method39() {
        Class1557.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.autoJump = this.Field15267;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5A8A ^ 0x6A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
