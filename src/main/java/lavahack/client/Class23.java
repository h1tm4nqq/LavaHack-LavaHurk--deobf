//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class23 extends Exception
{
    private static final long Field7913;
    private final int Field7914;
    private String Field7915 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class23(final int field7914) {
        this.Field7914 = field7914;
    }
    
    public Class23(final int field7914, final String message) {
        super(message);
        this.Field7914 = field7914;
    }
    
    public Class23(final int field7914, final Throwable cause) {
        super(cause);
        this.Field7914 = field7914;
    }
    
    public Class23(final int field7914, final String message, final Throwable cause) {
        super(message, cause);
        this.Field7914 = field7914;
    }
    
    public int Method192() {
        return this.Field7914;
    }
    
    static {
        Field7913 = 3731842424390998726L;
    }
}
