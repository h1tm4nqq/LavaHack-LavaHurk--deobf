//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.opengl.*;

public class Class435
{
    private final int Field9820;
    private final int Field9821;
    private final int Field9822;
    private final int Field9823;
    private String Field9824 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class435(final int field9820, final int field9821, final int field9822, final int field9823) {
        this.Field9820 = field9820;
        this.Field9821 = field9821;
        this.Field9822 = field9822;
        this.Field9823 = field9823;
    }
    
    public int Method2076() {
        return this.Field9820;
    }
    
    public int Method2077() {
        return this.Field9821;
    }
    
    public int Method2078() {
        return this.Field9822;
    }
    
    public int Method2079() {
        return this.Field9823;
    }
    
    public static Class435 Method2080(final int n, final int n2, final int n3, final int n4) {
        return new Class435(Math.min(n, n3), Math.min(n2, n4), Math.max(n, n3), Math.max(n2, n4));
    }
    
    public static Class435 Method2081(final double n, final double n2, final double n3, final double n4) {
        return Method2080((int)(n * Display.getWidth()), (int)n2 * Display.getHeight(), (int)(n3 * Display.getWidth()), (int)(n4 * Display.getHeight()));
    }
    
    public static Class435 Method2082(final double n, final double n2, final double n3, final double n4) {
        return Method2081((n + 1.0) / Double.longBitsToDouble(4611686018427387904L), (n2 + 1.0) / Double.longBitsToDouble((long)345905557 ^ 0x40000000149E1995L), (n3 + 1.0) / Double.longBitsToDouble(4611686018427387904L), (n4 + 1.0) / Double.longBitsToDouble(4611686018427387904L));
    }
}
