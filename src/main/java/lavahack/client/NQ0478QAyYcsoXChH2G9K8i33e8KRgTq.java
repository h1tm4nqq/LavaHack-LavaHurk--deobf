//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.util.math.MathHelper
 */
package lavahack.client;

import kotlin.Metadata;
import net.minecraft.util.math.MathHelper;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000f\u001a!\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0086\b\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0011\u0010\f\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0003\"\u0011\u0010\u000e\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0011\u0010\u0010\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0003\"\u0011\u0010\u0012\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000b\u00a8\u0006\u0018"}, d2={"NUM_X_BITS", "", "getNUM_X_BITS", "()I", "NUM_Y_BITS", "getNUM_Y_BITS", "NUM_Z_BITS", "getNUM_Z_BITS", "X_MASK", "", "getX_MASK", "()J", "X_SHIFT", "getX_SHIFT", "Y_MASK", "getY_MASK", "Y_SHIFT", "getY_SHIFT", "Z_MASK", "getZ_MASK", "toLong", "x", "y", "z", "kisman.cc"})
public final class NQ0478QAyYcsoXChH2G9K8i33e8KRgTq {
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
        return Field11249;
    }

    public static final int Method3163() {
        return Field11250;
    }

    public static final int Method3164() {
        return Field11251;
    }

    public static final int Method3165() {
        return Field11252;
    }

    public static final int Method3166() {
        return Field11253;
    }

    public static final long Method3167() {
        return Field11254;
    }

    public static final long Method3168() {
        return Field11255;
    }

    public static final long Method3169() {
        return Field11256;
    }

    public static final long Method3170(int n, int n2, int n3) {
        return ((long)n & NQ0478QAyYcsoXChH2G9K8i33e8KRgTq.Method3167()) << NQ0478QAyYcsoXChH2G9K8i33e8KRgTq.Method3166() | ((long)n2 & NQ0478QAyYcsoXChH2G9K8i33e8KRgTq.Method3168()) << NQ0478QAyYcsoXChH2G9K8i33e8KRgTq.Method3165() | (long)n3 & NQ0478QAyYcsoXChH2G9K8i33e8KRgTq.Method3169();
    }

    static {
        Field11250 = Field11249 = (int)((long)-495108865 ^ (long)-495108866) + MathHelper.log2((int)MathHelper.smallestEncompassingPowerOfTwo((int)(((int)-861200407L ^ 0xCCA88C6E) << 7)));
        Field11251 = (((int)-1180183103L ^ 0xB9A7D5C0) << 6) - Field11249 - Field11250;
        Field11252 = ((int)-162705636L ^ 0xF64D4F1C) + Field11250;
        Field11253 = Field11252 + Field11251;
        Field11254 = (1L << Field11249) - 1L;
        Field11255 = (1L << Field11251) - 1L;
        Field11256 = (1L << Field11250) - 1L;
    }
}

