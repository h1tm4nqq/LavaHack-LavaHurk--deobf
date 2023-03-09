/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.wNM4U1NB2Ofc1ABWK5xbjgJ9wZ6Zvqvz
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Class97;
import lavahack.client.wNM4U1NB2Ofc1ABWK5xbjgJ9wZ6Zvqvz;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/pingbypass/server/features/modules/PingBypassCategory;", "", "category", "Lcom/kisman/cc/features/module/Category;", "(Ljava/lang/String;ILcom/kisman/cc/features/module/Category;)V", "getCategory", "()Lcom/kisman/cc/features/module/Category;", "COMBAT", "CLIENT", "MOVEMENT", "PLAYER", "kisman.cc"})
public final class Class2130
extends Enum {
    public static final /* enum */ Class2130 Field17685;
    public static final /* enum */ Class2130 Field17686;
    public static final /* enum */ Class2130 Field17687;
    public static final /* enum */ Class2130 Field17688;
    private static final Class2130[] Field17689;
    @NotNull
    private final Class97 Field17690;
    private String Field17691 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class2130[] class2130Array = new Class2130[4];
        Class2130[] class2130Array2 = class2130Array;
        class2130Array[0] = Field17685 = new Class2130("COMBAT", 0, Class97.Field8338);
        class2130Array[1] = Field17686 = new Class2130("CLIENT", 1, Class97.Field8339);
        class2130Array[2] = Field17687 = new Class2130("MOVEMENT", 2, Class97.Field8340);
        class2130Array[3] = Field17688 = new Class2130("PLAYER", 3, Class97.Field8341);
        Field17689 = class2130Array;
    }

    @NotNull
    @NotNull
    public final Class97 Method7667() {
        return this.Field17690;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class2130() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field17690 = var3_1;
    }

    public static Class2130[] values() {
        return (wNM4U1NB2Ofc1ABWK5xbjgJ9wZ6Zvqvz[])Field17689.clone();
    }

    public static Class2130 valueOf(String string) {
        return Enum.valueOf(Class2130.class, string);
    }

    private static String Method7668(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 79;
            cArray2[n] = (char)(cArray[n] ^ (0x2F51 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

