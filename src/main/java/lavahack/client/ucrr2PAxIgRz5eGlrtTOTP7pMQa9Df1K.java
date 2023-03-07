/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/BindType;", "", "(Ljava/lang/String;I)V", "Keyboard", "Mouse", "kisman.cc"})
public final class ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K
extends Enum {
    public static final /* enum */ ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K Field12068;
    public static final /* enum */ ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K Field12069;
    private static final ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K[] Field12070;
    private int Field12071;

    static {
        ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K[] ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1KArray = new ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K[((int)-361003210L ^ 0xEA7B8737) << 1];
        ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K[] ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1KArray2 = ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1KArray;
        ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1KArray[(int)((long)1893408879 ^ (long)1893408879)] = Field12068 = new ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K("Keyboard", (int)((long)1096528429 ^ (long)1096528429));
        ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1KArray[(int)((long)184911813 ^ (long)184911812)] = Field12069 = new ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K("Mouse", (int)-1440695780L ^ 0xAA20BA1D);
        Field12070 = ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1KArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K() {
        void var2_-1;
        void var1_-1;
    }

    public static ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K[] values() {
        return (ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K[])Field12070.clone();
    }

    public static ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K valueOf(String string) {
        return Enum.valueOf(ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.class, string);
    }

    private static String Method3923(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-96056799L ^ 0xFA464A21;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)560406726L ^ 0x21672039);
            int n2 = ((int)453291559L ^ 0x1B04AE7C) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-90373309 ^ (long)-90349756) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

