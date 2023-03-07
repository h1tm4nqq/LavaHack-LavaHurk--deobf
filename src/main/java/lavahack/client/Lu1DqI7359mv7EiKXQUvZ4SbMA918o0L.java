/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/util/enums/Object3dTypes;", "", "(Ljava/lang/String;I)V", "Tracer", "Box", "Text", "kisman.cc"})
public final class Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L
extends Enum {
    public static final /* enum */ Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L Field11216;
    public static final /* enum */ Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L Field11217;
    public static final /* enum */ Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L Field11218;
    private static final Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L[] Field11219;
    private int Field11220;

    static {
        Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L[] lu1DqI7359mv7EiKXQUvZ4SbMA918o0LArray = new Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L[(int)((long)-977735558 ^ (long)-977735559)];
        Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L[] lu1DqI7359mv7EiKXQUvZ4SbMA918o0LArray2 = lu1DqI7359mv7EiKXQUvZ4SbMA918o0LArray;
        lu1DqI7359mv7EiKXQUvZ4SbMA918o0LArray[(int)259987113L ^ 0xF7F16A9] = Field11216 = new Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L("Tracer", (int)1713643749L ^ 0x662420E5);
        lu1DqI7359mv7EiKXQUvZ4SbMA918o0LArray[(int)-2109726556L ^ 0x824020A5] = Field11217 = new Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L("Box", (int)((long)-1955897169 ^ (long)-1955897170));
        lu1DqI7359mv7EiKXQUvZ4SbMA918o0LArray[(int)((long)116841904 ^ (long)116841905) << 1] = Field11218 = new Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L("Text", (int)((long)1624391043 ^ (long)1624391042) << 1);
        Field11219 = lu1DqI7359mv7EiKXQUvZ4SbMA918o0LArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L() {
        void var2_-1;
        void var1_-1;
    }

    public static Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L[] values() {
        return (Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L[])Field11219.clone();
    }

    public static Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L valueOf(String string) {
        return Enum.valueOf(Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L.class, string);
    }

    private static String Method3146(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1164457083L ^ 0x4568347B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1078421968 ^ (long)1078421807);
            int n2 = ((int)568402820L ^ 0x21E12385) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1606264289 ^ (long)-1606266936) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

