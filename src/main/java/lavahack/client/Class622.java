/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.AmrNfv7kGOECFtQRgCWbud2mFPGYrVbK
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.AmrNfv7kGOECFtQRgCWbud2mFPGYrVbK;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/util/enums/PearlBypassModes;", "", "displayName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "toString", "Normal", "CrystalPvPcc", "kisman.cc"})
public final class Class622
extends Enum {
    public static final /* enum */ Class622 Field10650;
    public static final /* enum */ Class622 Field10651;
    private static final Class622[] Field10652;
    @NotNull
    private final String Field10653;
    private int Field10654;

    static {
        Class622[] class622Array = new Class622[2];
        Class622[] class622Array2 = class622Array;
        class622Array[0] = Field10650 = new Class622("Normal", 0, "Normal");
        class622Array[1] = Field10651 = new Class622("CrystalPvPcc", 1, "crystalpvp.cc");
        Field10652 = class622Array;
    }

    @NotNull
    @NotNull
    public String toString() {
        return this.Field10653;
    }

    @NotNull
    @NotNull
    public final String Method2657() {
        return this.Field10653;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class622() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field10653 = var3_1;
    }

    public static Class622[] values() {
        return (AmrNfv7kGOECFtQRgCWbud2mFPGYrVbK[])Field10652.clone();
    }

    public static Class622 valueOf(String string) {
        return Enum.valueOf(Class622.class, string);
    }

    private static String Method2658(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 64;
            cArray2[n] = (char)(cArray[n] ^ (0x4161 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

