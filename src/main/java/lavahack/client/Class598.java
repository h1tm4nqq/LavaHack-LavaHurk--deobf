//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class598 extends Class42
{
    private long Field10542;
    private int Field10543;
    
    public Class598() {
        super("EventSystemTest", Class97.Field8345);
        this.Field10542 = 0L;
    }
    
    @Class1786
    @Class1786
    public void Method2582(final Class1594 class1594) {
        if (Class598.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || Class598.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        Class1393.Method5505().Method1886("Ticks passed" + this.Field10542++);
    }
    
    public void Method45() {
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1908 ^ 0x81));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
