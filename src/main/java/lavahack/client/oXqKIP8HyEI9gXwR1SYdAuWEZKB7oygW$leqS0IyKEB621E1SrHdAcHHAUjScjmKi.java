/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.entity.Entity
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/util/enums/EntityESPTypes$Companion;", "", "()V", "get", "Lcom/kisman/cc/util/enums/EntityESPTypes;", "entity", "Lnet/minecraft/entity/Entity;", "kisman.cc"})
public final class oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    private String Field17856 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Nullable
    @Nullable
    public final oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW Method7776(@NotNull @NotNull Entity entity) {
        Intrinsics.checkParameterIsNotNull((Object)entity, (String)"entity");
        oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW[] oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygWArray = oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW.values();
        int n = oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygWArray.length;
        int n2 = (int)-1773421490L ^ 0x964BBC4E;
        while (n2 < n) {
            oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW2 = oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygWArray[n2];
            if (oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW2.Method5102().isInstance(entity)) {
                return oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW2;
            }
            ++n2;
        }
        return null;
    }

    private oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    public oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method7777(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)995003164L ^ 0x3B4E8B1C;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)936223569 ^ (long)936223662);
            int n2 = (int)((long)-1534656624 ^ (long)-1534656597) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1115753859L ^ 0xBD7E9158 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

