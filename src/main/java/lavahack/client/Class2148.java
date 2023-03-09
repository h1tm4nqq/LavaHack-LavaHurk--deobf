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
public final class Class2148 {
    @NotNull
    public static final String Field17830;
    @NotNull
    public static final String Field17831;
    public static final int Field17832;
    public static final int Field17833;
    public static final Class2148 Field17834;
    private int Field17835;

    private Class2148() {
    }

    static {
        Class2148 class2148;
        Field17833 = 65535;
        Field17832 = 50;
        Field17831 = "IFILE";
        Field17830 = "ITEXT";
        Field17834 = class2148 = new Class2148();
    }

    private static String Method7736(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 135;
            cArray2[n] = (char)(cArray[n] ^ (0x1E4D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

