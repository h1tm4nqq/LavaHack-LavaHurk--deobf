//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;

public class Class1802 extends Class42
{
    @Class1801
    private final Class618 Field16304;
    private int Field16305;
    
    public Class1802() {
        super("NoBobbing", Class97.Field8342);
        this.Field16304 = new Class618(Class1185::Method158, new Predicate[0]);
    }
    
    @Override
    public void Method38() {
        super.Method38();
        if (Class1802.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1802.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class1796.Field16242.Method706(this.Field16304);
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field16304);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5722 ^ 0xF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
