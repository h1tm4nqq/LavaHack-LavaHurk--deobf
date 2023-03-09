/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.YlOA1H9nu3uHez6LQQUu0YHsUPZCxeJb
 *  net.minecraft.util.EnumHand
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.YlOA1H9nu3uHez6LQQUu0YHsUPZCxeJb;
import net.minecraft.util.EnumHand;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2={"Lcom/kisman/cc/util/enums/HandModes;", "", "hand", "Lnet/minecraft/util/EnumHand;", "(Ljava/lang/String;ILnet/minecraft/util/EnumHand;)V", "getHand", "()Lnet/minecraft/util/EnumHand;", "MainHand", "OffHand", "kisman.cc"})
public final class Class1944
extends Enum {
    public static final /* enum */ Class1944 Field16988;
    public static final /* enum */ Class1944 Field16989;
    private static final Class1944[] Field16990;
    @NotNull
    private final EnumHand Field16991;
    private String Field16992 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1944[] class1944Array = new Class1944[2];
        Class1944[] class1944Array2 = class1944Array;
        class1944Array[0] = Field16988 = new Class1944("MainHand", 0, EnumHand.MAIN_HAND);
        class1944Array[1] = Field16989 = new Class1944("OffHand", 1, EnumHand.OFF_HAND);
        Field16990 = class1944Array;
    }

    @NotNull
    @NotNull
    public final EnumHand Method7226() {
        return this.Field16991;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1944() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field16991 = var3_1;
    }

    public static Class1944[] values() {
        return (YlOA1H9nu3uHez6LQQUu0YHsUPZCxeJb[])Field16990.clone();
    }

    public static Class1944 valueOf(String string) {
        return Enum.valueOf(Class1944.class, string);
    }

    private static String Method7227(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 239;
            cArray2[n] = (char)(cArray[n] ^ (0x6B5C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

