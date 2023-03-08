//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

public class Class902 extends Exception
{
    private static final long Field11769;
    private final int Field11770;
    private String Field11771 = "TheKisDevs & LavaHack Development owns you";
    
    public Class902(final int field11770) {
        this.Field11770 = field11770;
    }
    
    public Class902(final int field11770, final String message) {
        super(message);
        this.Field11770 = field11770;
    }
    
    public Class902(final int field11770, final Throwable cause) {
        super(cause);
        this.Field11770 = field11770;
    }
    
    public Class902(final int field11770, final String message, final Throwable cause) {
        super(message, cause);
        this.Field11770 = field11770;
    }
    
    public int Method483() {
        return this.Field11770;
    }
    
    static {
        Field11769 = 3731842424390998726L;
    }
}
