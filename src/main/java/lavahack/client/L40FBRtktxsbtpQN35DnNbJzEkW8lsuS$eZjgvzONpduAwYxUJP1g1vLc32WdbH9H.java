/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.FunctionReference
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Reflection
 *  kotlin.reflect.KDeclarationContainer
 *  net.minecraft.entity.Entity
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003\u00a2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u00a2\u0006\u0002\b\u0007"}, d2={"<anonymous>", "", "p1", "Lnet/minecraft/entity/Entity;", "Lkotlin/ParameterName;", "name", "crystal", "invoke"})
final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$eZjgvzONpduAwYxUJP1g1vLc32WdbH9H
extends FunctionReference
implements Function1 {
    private int Field12091;

    public Object invoke(Object object) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((Entity)object);
        return Unit.INSTANCE;
    }

    public final void leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull Entity entity) {
        Intrinsics.checkParameterIsNotNull((Object)entity, (String)"p1");
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5178((L40FBRtktxsbtpQN35DnNbJzEkW8lsuS)this.receiver, entity);
    }

    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.class);
    }

    public final String getName() {
        return "breakCrystal";
    }

    public final String getSignature() {
        return "breakCrystal(Lnet/minecraft/entity/Entity;)V";
    }

    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$eZjgvzONpduAwYxUJP1g1vLc32WdbH9H(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS) {
        super((int)-1645913703L ^ 0x9DE55998, (Object)l40FBRtktxsbtpQN35DnNbJzEkW8lsuS);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)485638004L ^ 0x1CF23F74;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1584518793L ^ 0xA18E2988);
            int n2 = (int)-253530107L ^ 0xF0E370FC;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1113494994 ^ (long)-1113515907) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

