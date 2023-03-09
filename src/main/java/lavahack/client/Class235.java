/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.rBUbPGhhEYTwVrYPtXKkJHZ6uz7WPyF6
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.rBUbPGhhEYTwVrYPtXKkJHZ6uz7WPyF6;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/util/enums/RPCImages;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "Default", "LavaHake", "New", "Rc", "Null", "kisman.cc"})
public final class Class235
extends Enum {
    public static final /* enum */ Class235 Field9024;
    public static final /* enum */ Class235 Field9025;
    public static final /* enum */ Class235 Field9026;
    public static final /* enum */ Class235 Field9027;
    public static final /* enum */ Class235 Field9028;
    private static final Class235[] Field9029;
    @NotNull
    private final String Field9030;
    private int Field9031;

    static {
        Class235[] class235Array = new Class235[5];
        Class235[] class235Array2 = class235Array;
        class235Array[0] = Field9024 = new Class235("Default", 0, "logo");
        class235Array[1] = Field9025 = new Class235("LavaHake", 1, "lavahake");
        class235Array[2] = Field9026 = new Class235("New", 2, "new");
        class235Array[3] = Field9027 = new Class235("Rc", 3, "rc");
        class235Array[4] = Field9028 = new Class235("Null", 4, "small");
        Field9029 = class235Array;
    }

    @NotNull
    @NotNull
    public final String Method1303() {
        return this.Field9030;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class235() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field9030 = var3_1;
    }

    public static Class235[] values() {
        return (rBUbPGhhEYTwVrYPtXKkJHZ6uz7WPyF6[])Field9029.clone();
    }

    public static Class235 valueOf(String string) {
        return Enum.valueOf(Class235.class, string);
    }

    private static String Method1304(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 156;
            cArray2[n] = (char)(cArray[n] ^ (0x1AD7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

