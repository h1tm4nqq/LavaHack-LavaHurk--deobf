//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.util.math.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000f\u001a!\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0086\b\"\u0011\u0010\u0000\u001a\u00020\u0001?\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u0001?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0011\u0010\b\u001a\u00020\t?\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0011\u0010\f\u001a\u00020\u0001?\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0003\"\u0011\u0010\u000e\u001a\u00020\t?\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0011\u0010\u0010\u001a\u00020\u0001?\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0003\"\u0011\u0010\u0012\u001a\u00020\t?\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000b?\u0006\u0018" }, d2 = { "NUM_X_BITS", "", "getNUM_X_BITS", "()I", "NUM_Y_BITS", "getNUM_Y_BITS", "NUM_Z_BITS", "getNUM_Z_BITS", "X_MASK", "", "getX_MASK", "()J", "X_SHIFT", "getX_SHIFT", "Y_MASK", "getY_MASK", "Y_SHIFT", "getY_SHIFT", "Z_MASK", "getZ_MASK", "toLong", "x", "y", "z", "kisman.cc" })
public final class Class767
{
    private static final int Field11249;
    private static final int Field11250;
    private static final int Field11251;
    private static final int Field11252;
    private static final int Field11253;
    private static final long Field11254;
    private static final long Field11255;
    private static final long Field11256;
    private int Field11257;
    
    public static final int Method3162() {
        return Class767.Field11249;
    }
    
    public static final int Method3163() {
        return Class767.Field11250;
    }
    
    public static final int Method3164() {
        return Class767.Field11251;
    }
    
    public static final int Method3165() {
        return Class767.Field11252;
    }
    
    public static final int Method3166() {
        return Class767.Field11253;
    }
    
    public static final long Method3167() {
        return Class767.Field11254;
    }
    
    public static final long Method3168() {
        return Class767.Field11255;
    }
    
    public static final long Method3169() {
        return Class767.Field11256;
    }
    
    public static final long Method3170(final int n, final int n2, final int n3) {
        return ((long)n & Method3167()) << Method3166() | ((long)n2 & Method3168()) << Method3165() | ((long)n3 & Method3169());
    }
    
    static {
        Field11249 = 1 + MathHelper.log2(MathHelper.smallestEncompassingPowerOfTwo(30000000));
        Field11250 = Class767.Field11249;
        Field11251 = 64 - Class767.Field11249 - Class767.Field11250;
        Field11252 = 0 + Class767.Field11250;
        Field11253 = Class767.Field11252 + Class767.Field11251;
        Field11254 = (1L << Class767.Field11249) - 1L;
        Field11255 = (1L << Class767.Field11251) - 1L;
        Field11256 = (1L << Class767.Field11250) - 1L;
    }
}
