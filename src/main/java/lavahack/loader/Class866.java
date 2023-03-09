/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.loader.OvvNFVp1prZcFYv57XGirjG11JCXathw
 */
package lavahack.loader;

import kotlin.Metadata;
import lavahack.loader.OvvNFVp1prZcFYv57XGirjG11JCXathw;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/loader/websockets/api/enums/ReadyState;", "", "(Ljava/lang/String;I)V", "NOT_YET_CONNECTED", "OPEN", "CLOSING", "CLOSED", "kisman.cc"})
public final class Class866
extends Enum {
    public static final /* enum */ Class866 Field11645;
    public static final /* enum */ Class866 Field11646;
    public static final /* enum */ Class866 Field11647;
    public static final /* enum */ Class866 Field11648;
    private static final Class866[] Field11649;
    private int Field11650;

    static {
        Class866[] class866Array = new Class866[4];
        Class866[] class866Array2 = class866Array;
        class866Array[0] = Field11645 = new Class866("NOT_YET_CONNECTED", 0);
        class866Array[1] = Field11646 = new Class866("OPEN", 1);
        class866Array[2] = Field11647 = new Class866("CLOSING", 2);
        class866Array[3] = Field11648 = new Class866("CLOSED", 3);
        Field11649 = class866Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class866() {
        void var2_-1;
        void var1_-1;
    }

    public static Class866[] values() {
        return (OvvNFVp1prZcFYv57XGirjG11JCXathw[])Field11649.clone();
    }

    public static Class866 valueOf(String string) {
        return Enum.valueOf(Class866.class, string);
    }

    private static String Method3658(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 89;
            cArray2[n] = (char)(cArray[n] ^ (0x8A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

