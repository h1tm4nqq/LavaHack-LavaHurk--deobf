//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;

public class Class1012 extends Class42
{
    private final Class44 Field12397;
    @Class1801
    private final Class618 Field12398;
    @Class1801
    private final Class618 Field12399;
    private String Field12400 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1012() {
        super("NoPing", Class97.Field8343, true);
        this.Field12397 = this.Method23(new Class44("Compatibility", this, false));
        this.Field12398 = new Class618(Class1185::Method158, new Predicate[0]);
        this.Field12399 = new Class618(this::Method4121, new Predicate[0]);
    }
    
    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method705(this);
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method710(this);
    }
    
    private void Method4121(final Class1967 class1967) {
        if (this.Field12397.Method365()) {
            class1967.Method158();
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1061 ^ 0x26));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
