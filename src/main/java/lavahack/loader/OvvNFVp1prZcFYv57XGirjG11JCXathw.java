/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.loader;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/loader/websockets/api/enums/ReadyState;", "", "(Ljava/lang/String;I)V", "NOT_YET_CONNECTED", "OPEN", "CLOSING", "CLOSED", "kisman.cc"})
public final class OvvNFVp1prZcFYv57XGirjG11JCXathw
extends Enum {
    public static final /* enum */ OvvNFVp1prZcFYv57XGirjG11JCXathw Field11645;
    public static final /* enum */ OvvNFVp1prZcFYv57XGirjG11JCXathw Field11646;
    public static final /* enum */ OvvNFVp1prZcFYv57XGirjG11JCXathw Field11647;
    public static final /* enum */ OvvNFVp1prZcFYv57XGirjG11JCXathw Field11648;
    private static final OvvNFVp1prZcFYv57XGirjG11JCXathw[] Field11649;
    private int Field11650;

    static {
        OvvNFVp1prZcFYv57XGirjG11JCXathw[] ovvNFVp1prZcFYv57XGirjG11JCXathwArray = new OvvNFVp1prZcFYv57XGirjG11JCXathw[(int)((long)-75182240 ^ (long)-75182239) << 2];
        OvvNFVp1prZcFYv57XGirjG11JCXathw[] ovvNFVp1prZcFYv57XGirjG11JCXathwArray2 = ovvNFVp1prZcFYv57XGirjG11JCXathwArray;
        ovvNFVp1prZcFYv57XGirjG11JCXathwArray[(int)1296082298L ^ 0x4D40A57A] = Field11645 = new OvvNFVp1prZcFYv57XGirjG11JCXathw("NOT_YET_CONNECTED", (int)1608097961L ^ 0x5FD9A0A9);
        ovvNFVp1prZcFYv57XGirjG11JCXathwArray[(int)-207284753L ^ 0xF3A515EE] = Field11646 = new OvvNFVp1prZcFYv57XGirjG11JCXathw("OPEN", (int)((long)660078156 ^ (long)660078157));
        ovvNFVp1prZcFYv57XGirjG11JCXathwArray[(int)((long)-1152178887 ^ (long)-1152178888) << 1] = Field11647 = new OvvNFVp1prZcFYv57XGirjG11JCXathw("CLOSING", ((int)545373618L ^ 0x2081BDB3) << 1);
        ovvNFVp1prZcFYv57XGirjG11JCXathwArray[(int)((long)349172352 ^ (long)349172355)] = Field11648 = new OvvNFVp1prZcFYv57XGirjG11JCXathw("CLOSED", (int)((long)1494428659 ^ (long)1494428656));
        Field11649 = ovvNFVp1prZcFYv57XGirjG11JCXathwArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private OvvNFVp1prZcFYv57XGirjG11JCXathw() {
        void var2_-1;
        void var1_-1;
    }

    public static OvvNFVp1prZcFYv57XGirjG11JCXathw[] values() {
        return (OvvNFVp1prZcFYv57XGirjG11JCXathw[])Field11649.clone();
    }

    public static OvvNFVp1prZcFYv57XGirjG11JCXathw valueOf(String string) {
        return Enum.valueOf(OvvNFVp1prZcFYv57XGirjG11JCXathw.class, string);
    }

    private static String Method3658(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-272490629 ^ (long)-272490629);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1497548444L ^ 0x5942C663);
            int n2 = (int)-191314121L ^ 0xF498C76E;
            cArray2[n] = (char)(cArray[n] ^ (((int)-991969916L ^ 0xC4DFBDC1) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

