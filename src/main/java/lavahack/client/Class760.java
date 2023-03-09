/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/util/enums/Object3dTypes;", "", "(Ljava/lang/String;I)V", "Tracer", "Box", "Text", "kisman.cc"})
public final class Class760
extends Enum {
    public static final /* enum */ Class760 Field11216;
    public static final /* enum */ Class760 Field11217;
    public static final /* enum */ Class760 Field11218;
    private static final Class760[] Field11219;
    private int Field11220;

    static {
        Class760[] class760Array = new Class760[3];
        Class760[] class760Array2 = class760Array;
        class760Array[0] = Field11216 = new Class760("Tracer", 0);
        class760Array[1] = Field11217 = new Class760("Box", 1);
        class760Array[2] = Field11218 = new Class760("Text", 2);
        Field11219 = class760Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class760() {
        void var2_-1;
        void var1_-1;
    }

    public static Class760[] values() {
        return (Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L[])Field11219.clone();
    }

    public static Class760 valueOf(String string) {
        return Enum.valueOf(Class760.class, string);
    }

    private static String Method3146(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 4;
            cArray2[n] = (char)(cArray[n] ^ (0x575C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

