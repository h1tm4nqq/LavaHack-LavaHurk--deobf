//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000\u001e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u001e\u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007\u001a\u0016\u0010\u0006\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t\u001a\u001a\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001\u001a\u001a\u0010\u000b\u001a\u00020\t*\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t\u001a\u0012\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u0012\u0010\u000e\u001a\u00020\t*\u00020\t2\u0006\u0010\u000f\u001a\u00020\t\u001a\u0012\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005\u001a\u0012\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001\u001a\n\u0010\u0011\u001a\u00020\u0001*\u00020\u0001?\u0006\u0012" }, d2 = { "lerp", "", "from", "to", "delta", "", "toDelta", "", "start", "", "length", "coerceIn", "minimumValue", "maximumValue", "max", "second", "min", "square", "kisman.cc" })
public final class Class1047
{
    private String Field12639 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static final double Method4278(final double n, final double n2, final double n3) {
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static final float Method4279(final float n, final float n2, final float n3) {
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static final float Method4280(final float a, final float b) {
        return Math.max(a, b);
    }
    
    public static final int Method4281(final int a, final int b) {
        return Math.max(a, b);
    }
    
    public static final double Method4282(final double a, final double b) {
        return Math.max(a, b);
    }
    
    public static final double Method4283(final double a, final double b) {
        return Math.min(a, b);
    }
    
    public static final long Method4284(final long n) {
        return System.currentTimeMillis() - n;
    }
    
    public static final float Method4285(final long n, final float n2) {
        return Method4279(Method4284(n) / n2, 0.0f, 1.0f);
    }
}
