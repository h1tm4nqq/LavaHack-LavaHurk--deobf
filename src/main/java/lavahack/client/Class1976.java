//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;

@Class1887
public class Class1976 extends Class42
{
    @Class1801
    private final Class618 Field17096;
    private int Field17097;
    
    public Class1976() {
        super("NoCrosshair", Class97.Field8342);
        this.Field17096 = new Class618(Class1185::Method158, new Predicate[0]);
    }
    
    @Override
    public void Method38() {
        super.Method38();
        if (Class1976.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1976.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        Class1796.Field16242.Method705((Class1320)this);
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method710((Class1320)this);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x51C9 ^ 0x69));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
