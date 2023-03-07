/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000e"}, d2={"Lcom/kisman/cc/features/capes/Capes;", "", "name0", "", "subscription", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getName0", "()Ljava/lang/String;", "getSubscription", "()I", "Release", "Beta", "Developer", "kisman.cc"})
public final class fdljcT89CBPrL7HBEVQFJfXSVaiifxsj
extends Enum {
    public static final /* enum */ fdljcT89CBPrL7HBEVQFJfXSVaiifxsj Field15771;
    public static final /* enum */ fdljcT89CBPrL7HBEVQFJfXSVaiifxsj Field15772;
    public static final /* enum */ fdljcT89CBPrL7HBEVQFJfXSVaiifxsj Field15773;
    private static final fdljcT89CBPrL7HBEVQFJfXSVaiifxsj[] Field15774;
    @NotNull
    private final String Field15775;
    private final int Field15776;
    private int Field15777;

    static {
        fdljcT89CBPrL7HBEVQFJfXSVaiifxsj[] fdljcT89CBPrL7HBEVQFJfXSVaiifxsjArray = new fdljcT89CBPrL7HBEVQFJfXSVaiifxsj[(int)((long)-650888425 ^ (long)-650888428)];
        fdljcT89CBPrL7HBEVQFJfXSVaiifxsj[] fdljcT89CBPrL7HBEVQFJfXSVaiifxsjArray2 = fdljcT89CBPrL7HBEVQFJfXSVaiifxsjArray;
        fdljcT89CBPrL7HBEVQFJfXSVaiifxsjArray[(int)1942350223L ^ 0x73C5E98F] = Field15771 = new fdljcT89CBPrL7HBEVQFJfXSVaiifxsj("Release", (int)408169095L ^ 0x18542A87, "release", (int)1422378418L ^ 0x54C7C5B3);
        fdljcT89CBPrL7HBEVQFJfXSVaiifxsjArray[(int)165854180L ^ 0x9E2BBE5] = Field15772 = new fdljcT89CBPrL7HBEVQFJfXSVaiifxsj("Beta", (int)1208549880L ^ 0x480901F9, "beta", (int)((long)-475813369 ^ (long)-475813370) << 1);
        fdljcT89CBPrL7HBEVQFJfXSVaiifxsjArray[(int)((long)1308649058 ^ (long)1308649059) << 1] = Field15773 = new fdljcT89CBPrL7HBEVQFJfXSVaiifxsj("Developer", (int)((long)458954696 ^ (long)458954697) << 1, "developer", (int)((long)63937523 ^ (long)63937520));
        Field15774 = fdljcT89CBPrL7HBEVQFJfXSVaiifxsjArray;
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
    private fdljcT89CBPrL7HBEVQFJfXSVaiifxsj() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field15775 = var3_1;
        this.Field15776 = var4_2;
    }

    public static fdljcT89CBPrL7HBEVQFJfXSVaiifxsj[] values() {
        return (fdljcT89CBPrL7HBEVQFJfXSVaiifxsj[])Field15774.clone();
    }

    public static fdljcT89CBPrL7HBEVQFJfXSVaiifxsj valueOf(String string) {
        return Enum.valueOf(fdljcT89CBPrL7HBEVQFJfXSVaiifxsj.class, string);
    }

    private static String Method6447(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-126022648L ^ 0xF87D0C08;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1928842147 ^ (long)-1928842078);
            int n2 = (int)((long)-1019029078 ^ (long)-1019029047) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-687835443 ^ (long)-687865622) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

