/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/util/enums/PearlBypassModes;", "", "displayName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "toString", "Normal", "CrystalPvPcc", "kisman.cc"})
public final class AmrNfv7kGOECFtQRgCWbud2mFPGYrVbK
extends Enum {
    public static final /* enum */ AmrNfv7kGOECFtQRgCWbud2mFPGYrVbK Field10650;
    public static final /* enum */ AmrNfv7kGOECFtQRgCWbud2mFPGYrVbK Field10651;
    private static final AmrNfv7kGOECFtQRgCWbud2mFPGYrVbK[] Field10652;
    @NotNull
    private final String Field10653;
    private int Field10654;

    static {
        AmrNfv7kGOECFtQRgCWbud2mFPGYrVbK[] amrNfv7kGOECFtQRgCWbud2mFPGYrVbKArray = new AmrNfv7kGOECFtQRgCWbud2mFPGYrVbK[(int)((long)1676709753 ^ (long)1676709752) << 1];
        AmrNfv7kGOECFtQRgCWbud2mFPGYrVbK[] amrNfv7kGOECFtQRgCWbud2mFPGYrVbKArray2 = amrNfv7kGOECFtQRgCWbud2mFPGYrVbKArray;
        amrNfv7kGOECFtQRgCWbud2mFPGYrVbKArray[(int)((long)-425128670 ^ (long)-425128670)] = Field10650 = new AmrNfv7kGOECFtQRgCWbud2mFPGYrVbK("Normal", (int)1704780647L ^ 0x659CE367, "Normal");
        amrNfv7kGOECFtQRgCWbud2mFPGYrVbKArray[(int)100096125L ^ 0x5F7587C] = Field10651 = new AmrNfv7kGOECFtQRgCWbud2mFPGYrVbK("CrystalPvPcc", (int)((long)1458030727 ^ (long)1458030726), "crystalpvp.cc");
        Field10652 = amrNfv7kGOECFtQRgCWbud2mFPGYrVbKArray;
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
    private AmrNfv7kGOECFtQRgCWbud2mFPGYrVbK() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field10653 = var3_1;
    }

    public static AmrNfv7kGOECFtQRgCWbud2mFPGYrVbK[] values() {
        return (AmrNfv7kGOECFtQRgCWbud2mFPGYrVbK[])Field10652.clone();
    }

    public static AmrNfv7kGOECFtQRgCWbud2mFPGYrVbK valueOf(String string) {
        return Enum.valueOf(AmrNfv7kGOECFtQRgCWbud2mFPGYrVbK.class, string);
    }

    private static String Method2658(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1211648908L ^ 0x48384B8C;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)229294802L ^ 0xDAAC22D);
            int n2 = (int)((long)-1970838032 ^ (long)-1970838031) << 6;
            cArray2[n] = (char)(cArray[n] ^ ((int)1353709326L ^ 0x50AFB66F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

