/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.fdljcT89CBPrL7HBEVQFJfXSVaiifxsj
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.fdljcT89CBPrL7HBEVQFJfXSVaiifxsj;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000e"}, d2={"Lcom/kisman/cc/features/capes/Capes;", "", "name0", "", "subscription", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getName0", "()Ljava/lang/String;", "getSubscription", "()I", "Release", "Beta", "Developer", "kisman.cc"})
public final class Class1670
extends Enum {
    public static final /* enum */ Class1670 Field15771;
    public static final /* enum */ Class1670 Field15772;
    public static final /* enum */ Class1670 Field15773;
    private static final Class1670[] Field15774;
    @NotNull
    private final String Field15775;
    private final int Field15776;
    private int Field15777;

    static {
        Class1670[] class1670Array = new Class1670[3];
        Class1670[] class1670Array2 = class1670Array;
        class1670Array[0] = Field15771 = new Class1670("Release", 0, "release", 1);
        class1670Array[1] = Field15772 = new Class1670("Beta", 1, "beta", 2);
        class1670Array[2] = Field15773 = new Class1670("Developer", 2, "developer", 3);
        Field15774 = class1670Array;
    }

    @NotNull
    @NotNull
    public final String Method6445() {
        return this.Field15775;
    }

    public final int Method6446() {
        return this.Field15776;
    }

    /*
     * WARNING - void declaration
     */
    private Class1670() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field15775 = var3_1;
        this.Field15776 = var4_2;
    }

    public static Class1670[] values() {
        return (fdljcT89CBPrL7HBEVQFJfXSVaiifxsj[])Field15774.clone();
    }

    public static Class1670 valueOf(String string) {
        return Enum.valueOf(Class1670.class, string);
    }

    private static String Method6447(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 198;
            cArray2[n] = (char)(cArray[n] ^ (0x7627 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

