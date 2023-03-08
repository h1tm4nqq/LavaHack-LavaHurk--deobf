//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.util.function.*;

public class Class1831 extends Class42
{
    public final Class1303 Field16453;
    private final Class44 Field16454;
    private final Class44 Field16455;
    public final Class44 Field16456;
    public final Class44 Field16457;
    public final Class44 Field16458;
    public final Class44 Field16459;
    public final Class44 Field16460;
    public final Class44 Field16461;
    public final Class44 Field16462;
    public final Class44 Field16463;
    public static boolean Field16464;
    public static Class1831 Field16465;
    private String Field16466 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1831() {
        super("CustomFont", "custom font", Class97.Field8339);
        this.Field16453 = new Class1303("Mode", (Class42)this, (Enum)Class1427.Field14654).Method5303();
        this.Field16454 = this.Method23(new Class44("Anti Alias", this, true));
        this.Field16455 = this.Method23(new Class44("Fraction Metrics", this, true));
        this.Field16456 = this.Method23(new Class44("Style", this, (Enum)Class1613.Field15543));
        this.Field16457 = this.Method23(new Class44("Test", this, false));
        this.Field16458 = this.Method23(new Class44("Test 2", this, false));
        this.Field16459 = this.Method23(new Class44("Multi Line Offset", this, Double.longBitsToDouble(4611686018427387904L), 0.0, Double.longBitsToDouble(4624633867356078080L), true));
        this.Field16460 = new Class44("Fallback Font", this, false);
        this.Field16461 = new Class44("Fallback Mode", this, "Futura", Arrays.asList("Verdana", "Comfortaa", "Comfortaa Light", "Comfortaa Bold", "Consolas", "LexendDeca", "Futura", "SfUi", "Century"));
        this.Field16462 = this.Method23(new Class44("Custom Size", this, false));
        this.Field16463 = this.Method23(new Class44("Size", this, Double.longBitsToDouble(4625759767262920704L), Double.longBitsToDouble((long)1374408160 ^ 0x4014000051EBCDE0L), Double.longBitsToDouble(4629137466983448576L), true).Method313(this.Field16462::Method365));
        super.Method44(this::Method6899);
        Class1831.Field16465 = this;
    }
    
    @Override
    public void Method45() {
        Class1831.Field16464 = true;
        if (Class2167.Field17910.Method3261() != this.Field16454.Method365()) {
            Class2167.Field17910.Method3259(this.Field16454.Method365());
        }
        if (Class2167.Field17910.Method3262() != this.Field16455.Method365()) {
            Class2167.Field17910.Method3260(this.Field16455.Method365());
            Class2167.Field17910.Method3259(this.Field16454.Method365());
        }
        Class2167.Field17910.Method3265(this.Field16459.Method335());
    }
    
    @Override
    public void Method39() {
        Class1831.Field16464 = false;
    }
    
    private String Method6899() {
        return "[" + this.Field16453.Method359() + (this.Field16460.Method365() ? (" | " + this.Field16461.Method359()) : "") + "]";
    }
    
    static {
        Class1831.Field16464 = false;
        Class1831.Field16465 = new Class1831();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3B21 ^ 0x4B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
