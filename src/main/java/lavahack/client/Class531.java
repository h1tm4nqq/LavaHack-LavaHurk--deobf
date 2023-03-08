//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class531 extends Class23
{
    private static final long Field10240;
    private final int Field10241;
    private String Field10242 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class531() {
        this(Integer.MAX_VALUE);
    }
    
    public Class531(final int field10241) {
        super(1009);
        this.Field10241 = field10241;
    }
    
    public Class531(final String s, final int field10241) {
        super(1009, s);
        this.Field10241 = field10241;
    }
    
    public Class531(final String s) {
        this(s, Integer.MAX_VALUE);
    }
    
    public int Method2412() {
        return this.Field10241;
    }
    
    static {
        Field10240 = 6908339749836826785L;
    }
}
