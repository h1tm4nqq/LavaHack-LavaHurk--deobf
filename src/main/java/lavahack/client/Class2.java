//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;

@Class1887
public class Class2 extends Class42
{
    private final Class618 Field7827;
    private int Field7828;
    
    public Class2() {
        super("LiquidInteract", Class97.Field8344);
        this.Field7827 = new Class618(Class1185::Method158, new Predicate[0]);
    }
    
    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field7827);
        if (Class2.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class2.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
        }
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field7827);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2F18 ^ 0x86));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
