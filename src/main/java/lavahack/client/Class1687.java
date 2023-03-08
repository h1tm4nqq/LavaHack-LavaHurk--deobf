//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;

public class Class1687 extends Class42
{
    public final Class44 Field15837;
    public final Class44 Field15838;
    public final Class44 Field15839;
    public final Class44 Field15840;
    @Class873
    public static Class1687 Field15841;
    private String Field15842 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1687() {
        super("CustomMainMenu", Class97.Field8339);
        this.Field15837 = this.Method23(new Class44("WaterMark", this, true));
        this.Field15838 = this.Method23(new Class44("Custom Splash Text", this, true));
        this.Field15839 = this.Method23(new Class44("Custom Splash Font", this, false).Method313(this::Method6492));
        this.Field15840 = this.Method23(new Class44("Particles", this, false));
        super.Method21(true);
    }
    
    @Override
    public void Method45() {
        Class351.Field9449 = this.Field15837.Method365();
        Class351.Field9450 = this.Field15838.Method365();
        Class351.Field9451 = this.Field15839.Method365();
        Class351.Field9452 = this.Field15840.Method365();
    }
    
    @Override
    public void Method39() {
        Class351.Field9449 = false;
        Class351.Field9450 = false;
        Class351.Field9451 = false;
        Class351.Field9452 = false;
    }
    
    private Boolean Method6492() {
        return this.Field15838.Method365();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x36BB ^ 0x73));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
