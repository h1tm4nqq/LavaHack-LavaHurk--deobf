//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class1506 extends Class42
{
    private final Class44 Field15055;
    private final Class44 Field15056;
    private Class93 Field15057;
    private String Field15058 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1506() {
        super("LavaHackOwns", Class97.Field8345);
        this.Field15055 = this.Method23(new Class44("Count", this, Double.longBitsToDouble(4617315517961601024L), 1.0, Double.longBitsToDouble(4632233691727265792L), true));
        this.Field15056 = this.Method23(new Class44("Delay", this, Double.longBitsToDouble(4647503709213818880L), 0.0, Double.longBitsToDouble(4656510908468559872L), Class467.Field9943));
    }
    
    @Override
    public void Method38() {
        super.Method38();
        if (Class1506.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1506.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field15057 = new Class93(Class251.Field9121, Class1077.Field12793, this.Field15056.Method335(), this.Field15055.Method335(), Class1506::Method20);
        this.Field15057.Method793().start();
    }
    
    @Override
    public void Method39() {
        super.Method39();
        this.Field15057.Method793().stop();
    }
    
    private static void Method20() {
        Class1393.Method5505().Method1875("LavaHack owns!");
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4F53 ^ 0x94));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
