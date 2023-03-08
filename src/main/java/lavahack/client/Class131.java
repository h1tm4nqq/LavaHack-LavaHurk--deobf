//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;

public class Class131 extends Class42
{
    @Class873
    public static Class131 Field8450;
    public Class1303 Field8451;
    @Class1801
    private final Class618 Field8452;
    private String Field8453 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class131() {
        super("Cape", "Custom cape", Class97.Field8339);
        this.Field8451 = new Class1303("Cape Mode", (Class42)this, (Enum)Class1529.Field15151).Method5303();
        this.Field8452 = new Class618(this::Method868, new Predicate[0]);
        super.Method44(this::Method869);
    }
    
    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field8452);
    }
    
    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field8452);
    }
    
    private void Method868(final Class1508 class1508) {
        if (Class1830.Field16451.Method6895(class1508.Method6030().getGameProfile().getId().toString())) {
            class1508.Method6029(((Class1529)this.Field8451.Method341()).Method6069());
        }
    }
    
    private String Method869() {
        return "[" + this.Field8451.Method359() + "]";
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x699D ^ 0x7E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
