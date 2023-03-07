/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import java.text.DecimalFormat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2={"Lcom/kisman/cc/util/enums/SpeedUnits;", "", "formatter", "Ljava/text/DecimalFormat;", "displayInfo", "", "(Ljava/lang/String;ILjava/text/DecimalFormat;Ljava/lang/String;)V", "getDisplayInfo", "()Ljava/lang/String;", "getFormatter", "()Ljava/text/DecimalFormat;", "BPS", "KMH", "kisman.cc"})
public final class t78OP2bAm0IpqKGogPcm5ldff27AWz8I
extends Enum {
    public static final /* enum */ t78OP2bAm0IpqKGogPcm5ldff27AWz8I Field14186;
    public static final /* enum */ t78OP2bAm0IpqKGogPcm5ldff27AWz8I Field14187;
    private static final t78OP2bAm0IpqKGogPcm5ldff27AWz8I[] Field14188;
    @NotNull
    private final DecimalFormat Field14189;
    @NotNull
    private final String Field14190;
    private int Field14191;

    static {
        t78OP2bAm0IpqKGogPcm5ldff27AWz8I[] t78OP2bAm0IpqKGogPcm5ldff27AWz8IArray = new t78OP2bAm0IpqKGogPcm5ldff27AWz8I[((int)-717909082L ^ 0xD53593A7) << 1];
        t78OP2bAm0IpqKGogPcm5ldff27AWz8I[] t78OP2bAm0IpqKGogPcm5ldff27AWz8IArray2 = t78OP2bAm0IpqKGogPcm5ldff27AWz8IArray;
        t78OP2bAm0IpqKGogPcm5ldff27AWz8IArray[(int)994671213L ^ 0x3B497A6D] = Field14186 = new t78OP2bAm0IpqKGogPcm5ldff27AWz8I("BPS", (int)((long)-36725352 ^ (long)-36725352), new DecimalFormat("#.#"), "b/s");
        t78OP2bAm0IpqKGogPcm5ldff27AWz8IArray[(int)((long)-725606327 ^ (long)-725606328)] = Field14187 = new t78OP2bAm0IpqKGogPcm5ldff27AWz8I("KMH", (int)((long)1283709031 ^ (long)1283709030), new DecimalFormat("#.#"), "km/h");
        Field14188 = t78OP2bAm0IpqKGogPcm5ldff27AWz8IArray;
    }

    @NotNull
    @NotNull
    public final DecimalFormat Method5426() {
        return this.Field14189;
    }

    @NotNull
    @NotNull
    public final String Method5427() {
        return this.Field14190;
    }

    /*
     * WARNING - void declaration
     */
    private t78OP2bAm0IpqKGogPcm5ldff27AWz8I() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field14189 = var3_1;
        this.Field14190 = var4_2;
    }

    public static t78OP2bAm0IpqKGogPcm5ldff27AWz8I[] values() {
        return (t78OP2bAm0IpqKGogPcm5ldff27AWz8I[])Field14188.clone();
    }

    public static t78OP2bAm0IpqKGogPcm5ldff27AWz8I valueOf(String string) {
        return Enum.valueOf(t78OP2bAm0IpqKGogPcm5ldff27AWz8I.class, string);
    }

    private static String Method5428(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)813547045L ^ 0x307DBE25;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1687589552 ^ (long)-1687589457);
            int n2 = ((int)874965943L ^ 0x3426EB8E) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1658150586 ^ (long)1658145031) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

