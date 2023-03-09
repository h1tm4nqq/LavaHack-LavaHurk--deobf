/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/BindType;", "", "(Ljava/lang/String;I)V", "Keyboard", "Mouse", "kisman.cc"})
public final class Class955
extends Enum {
    public static final /* enum */ Class955 Field12068;
    public static final /* enum */ Class955 Field12069;
    private static final Class955[] Field12070;
    private int Field12071;

    static {
        Class955[] class955Array = new Class955[2];
        Class955[] class955Array2 = class955Array;
        class955Array[0] = Field12068 = new Class955("Keyboard", 0);
        class955Array[1] = Field12069 = new Class955("Mouse", 1);
        Field12070 = class955Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class955() {
        void var2_-1;
        void var1_-1;
    }

    public static Class955[] values() {
        return (ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K[])Field12070.clone();
    }

    public static Class955 valueOf(String string) {
        return Enum.valueOf(Class955.class, string);
    }

    private static String Method3923(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 182;
            cArray2[n] = (char)(cArray[n] ^ (0x5C07 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

