/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.lslPsdoabrsi1K2CJNP77JXrAha7Hnr3
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.lslPsdoabrsi1K2CJNP77JXrAha7Hnr3;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/util/enums/BurrowModes;", "", "displayName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "toString", "Normal", "CrystalPvPcc", "kisman.cc"})
public final class Class1212
extends Enum {
    public static final /* enum */ Class1212 Field13495;
    public static final /* enum */ Class1212 Field13496;
    private static final Class1212[] Field13497;
    @NotNull
    private final String Field13498;
    private int Field13499;

    static {
        Class1212[] class1212Array = new Class1212[2];
        Class1212[] class1212Array2 = class1212Array;
        class1212Array[0] = Field13495 = new Class1212("Normal", 0, "Normal");
        class1212Array[1] = Field13496 = new Class1212("CrystalPvPcc", 1, "crystalpvp.cc");
        Field13497 = class1212Array;
    }

    @NotNull
    @NotNull
    public String toString() {
        return this.Field13498;
    }

    @NotNull
    @NotNull
    public final String Method4880() {
        return this.Field13498;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1212() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field13498 = var3_1;
    }

    public static Class1212[] values() {
        return (lslPsdoabrsi1K2CJNP77JXrAha7Hnr3[])Field13497.clone();
    }

    public static Class1212 valueOf(String string) {
        return Enum.valueOf(Class1212.class, string);
    }

    private static String Method4881(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 6;
            cArray2[n] = (char)(cArray[n] ^ (0x219E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

