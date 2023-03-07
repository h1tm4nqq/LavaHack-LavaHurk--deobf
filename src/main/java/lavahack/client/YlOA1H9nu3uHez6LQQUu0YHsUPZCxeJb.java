/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.util.EnumHand
 */
package lavahack.client;

import kotlin.Metadata;
import net.minecraft.util.EnumHand;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2={"Lcom/kisman/cc/util/enums/HandModes;", "", "hand", "Lnet/minecraft/util/EnumHand;", "(Ljava/lang/String;ILnet/minecraft/util/EnumHand;)V", "getHand", "()Lnet/minecraft/util/EnumHand;", "MainHand", "OffHand", "kisman.cc"})
public final class YlOA1H9nu3uHez6LQQUu0YHsUPZCxeJb
extends Enum {
    public static final /* enum */ YlOA1H9nu3uHez6LQQUu0YHsUPZCxeJb Field16988;
    public static final /* enum */ YlOA1H9nu3uHez6LQQUu0YHsUPZCxeJb Field16989;
    private static final YlOA1H9nu3uHez6LQQUu0YHsUPZCxeJb[] Field16990;
    @NotNull
    private final EnumHand Field16991;
    private String Field16992 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        YlOA1H9nu3uHez6LQQUu0YHsUPZCxeJb[] ylOA1H9nu3uHez6LQQUu0YHsUPZCxeJbArray = new YlOA1H9nu3uHez6LQQUu0YHsUPZCxeJb[((int)1862936280L ^ 0x6F0A26D9) << 1];
        YlOA1H9nu3uHez6LQQUu0YHsUPZCxeJb[] ylOA1H9nu3uHez6LQQUu0YHsUPZCxeJbArray2 = ylOA1H9nu3uHez6LQQUu0YHsUPZCxeJbArray;
        ylOA1H9nu3uHez6LQQUu0YHsUPZCxeJbArray[(int)((long)-1286511422 ^ (long)-1286511422)] = Field16988 = new YlOA1H9nu3uHez6LQQUu0YHsUPZCxeJb("MainHand", (int)((long)2070269221 ^ (long)2070269221), EnumHand.MAIN_HAND);
        ylOA1H9nu3uHez6LQQUu0YHsUPZCxeJbArray[(int)1654230694L ^ 0x62998EA7] = Field16989 = new YlOA1H9nu3uHez6LQQUu0YHsUPZCxeJb("OffHand", (int)((long)27167195 ^ (long)27167194), EnumHand.OFF_HAND);
        Field16990 = ylOA1H9nu3uHez6LQQUu0YHsUPZCxeJbArray;
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
    private YlOA1H9nu3uHez6LQQUu0YHsUPZCxeJb() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field16991 = var3_1;
    }

    public static YlOA1H9nu3uHez6LQQUu0YHsUPZCxeJb[] values() {
        return (YlOA1H9nu3uHez6LQQUu0YHsUPZCxeJb[])Field16990.clone();
    }

    public static YlOA1H9nu3uHez6LQQUu0YHsUPZCxeJb valueOf(String string) {
        return Enum.valueOf(YlOA1H9nu3uHez6LQQUu0YHsUPZCxeJb.class, string);
    }

    private static String Method7227(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1276060486 ^ (long)-1276060486);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1523048149L ^ 0x5AC7DE2A);
            int n2 = (int)((long)-975189128 ^ (long)-975189097);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1563895871 ^ (long)1563898600) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

