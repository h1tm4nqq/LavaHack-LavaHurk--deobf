/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.t78OP2bAm0IpqKGogPcm5ldff27AWz8I
 */
package lavahack.client;

import java.text.DecimalFormat;
import kotlin.Metadata;
import lavahack.client.t78OP2bAm0IpqKGogPcm5ldff27AWz8I;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2={"Lcom/kisman/cc/util/enums/SpeedUnits;", "", "formatter", "Ljava/text/DecimalFormat;", "displayInfo", "", "(Ljava/lang/String;ILjava/text/DecimalFormat;Ljava/lang/String;)V", "getDisplayInfo", "()Ljava/lang/String;", "getFormatter", "()Ljava/text/DecimalFormat;", "BPS", "KMH", "kisman.cc"})
public final class Class1358
extends Enum {
    public static final /* enum */ Class1358 Field14186;
    public static final /* enum */ Class1358 Field14187;
    private static final Class1358[] Field14188;
    @NotNull
    private final DecimalFormat Field14189;
    @NotNull
    private final String Field14190;
    private int Field14191;

    static {
        Class1358[] class1358Array = new Class1358[2];
        Class1358[] class1358Array2 = class1358Array;
        class1358Array[0] = Field14186 = new Class1358("BPS", 0, new DecimalFormat("#.#"), "b/s");
        class1358Array[1] = Field14187 = new Class1358("KMH", 1, new DecimalFormat("#.#"), "km/h");
        Field14188 = class1358Array;
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
    private Class1358() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field14189 = var3_1;
        this.Field14190 = var4_2;
    }

    public static Class1358[] values() {
        return (t78OP2bAm0IpqKGogPcm5ldff27AWz8I[])Field14188.clone();
    }

    public static Class1358 valueOf(String string) {
        return Enum.valueOf(Class1358.class, string);
    }

    private static String Method5428(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 114;
            cArray2[n] = (char)(cArray[n] ^ (0x5EF4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

