/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2={"Lcom/kisman/cc/websockets/util/Constants;", "", "()V", "FILE_PREFIX", "", "MAX_PACKET_SIZE", "", "SERVER_BACKLOG", "TEXT_PREFIX", "kisman.cc"})
public final class PvrnInPXM0lWSwKKWKGRV4xSY3HYmwDs {
    @NotNull
    public static final String Field17830;
    @NotNull
    public static final String Field17831;
    public static final int Field17832;
    public static final int Field17833;
    public static final PvrnInPXM0lWSwKKWKGRV4xSY3HYmwDs Field17834;
    private int Field17835;

    private PvrnInPXM0lWSwKKWKGRV4xSY3HYmwDs() {
    }

    static {
        PvrnInPXM0lWSwKKWKGRV4xSY3HYmwDs pvrnInPXM0lWSwKKWKGRV4xSY3HYmwDs;
        Field17833 = (int)2123594851L ^ 0x7E93839C;
        Field17832 = ((int)1147369321L ^ 0x44637770) << 1;
        Field17831 = "IFILE";
        Field17830 = "ITEXT";
        Field17834 = pvrnInPXM0lWSwKKWKGRV4xSY3HYmwDs = new PvrnInPXM0lWSwKKWKGRV4xSY3HYmwDs();
    }

    private static String Method7736(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-922175072 ^ (long)-922175072);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1007602451L ^ 0x3C0ECBEC);
            int n2 = (int)-309722035L ^ 0xED8A04CA;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1386251855 ^ (long)1386256386) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

