//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;

public class Class1249 extends Class42 implements Class732
{
    protected static Minecraft Field13656;
    public boolean Field13657;
    private double Field13658;
    private double Field13659;
    private double Field13660;
    private double Field13661;
    private String Field13662 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1249(final String s, final String s2) {
        super(s, s2, Class97.Field8342);
        this.Field13657 = false;
        this.Field13658 = 0.0;
        this.Field13659 = 0.0;
        this.Field13660 = 0.0;
        this.Field13661 = 0.0;
    }
    
    public Class1249(final String s, final String s2, final boolean field13657) {
        this(s, s2);
        this.Field13657 = field13657;
    }
    
    public Class1249(final String s) {
        this(s, "");
    }
    
    public Class1249(final String s, final boolean field13657) {
        this(s);
        this.Field13657 = field13657;
    }
    
    @Override
    public double Method267() {
        return this.Field13658;
    }
    
    @Override
    public void Method271(final double field13658) {
        this.Field13658 = field13658;
    }
    
    @Override
    public double Method268() {
        return this.Field13659;
    }
    
    @Override
    public void Method272(final double field13659) {
        this.Field13659 = field13659;
    }
    
    @Override
    public double Method269() {
        return this.Field13660;
    }
    
    @Override
    public void Method273(final double field13660) {
        this.Field13660 = field13660;
    }
    
    @Override
    public double Method270() {
        return this.Field13661;
    }
    
    @Override
    public void Method274(final double field13661) {
        this.Field13661 = field13661;
    }
    
    protected Class451 Method275() {
        return new Class451(this).Method2149().Method2150();
    }
    
    static {
        Class1249.Field13656 = Minecraft.getMinecraft();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x16C8 ^ 0xAF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
