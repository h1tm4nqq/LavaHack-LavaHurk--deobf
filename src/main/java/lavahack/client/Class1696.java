//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DoubleCompanionObject
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class166;
import lavahack.client.Class1796;
import lavahack.client.Class42;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00020\u0006`\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006R.\u0010\u0003\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u0004j\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/features/subsystem/subsystems/EnemyManager;", "Lcom/kisman/cc/features/subsystem/SubSystem;", "()V", "enemies", "Ljava/util/ArrayList;", "Ljava/util/function/Supplier;", "Lnet/minecraft/entity/player/EntityPlayer;", "Lkotlin/collections/ArrayList;", "enemy", "", "player", "nearestEnemy", "kisman.cc"})
public final class Class1696
extends Class166 {
    private static final ArrayList Field15859;
    public static final Class1696 Field15860;
    private String Field15861 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final ArrayList Method6504() {
        ArrayList<EntityPlayer> arrayList = new ArrayList<EntityPlayer>();
        Iterator iterator = Field15859.iterator();
        while (iterator.hasNext()) {
            Supplier supplier = (Supplier)iterator.next();
            Object t = supplier.get();
            boolean bl = false;
            boolean bl2 = false;
            EntityPlayer entityPlayer = (EntityPlayer)t;
            boolean bl3 = false;
            if (entityPlayer == null) continue;
            arrayList.add(entityPlayer);
        }
        return arrayList;
    }

    @Nullable
    @Nullable
    public final EntityPlayer Method6505() {
        EntityPlayer entityPlayer = null;
        double d = DoubleCompanionObject.INSTANCE.getMAX_VALUE();
        Iterator iterator = this.Method6504().iterator();
        while (iterator.hasNext()) {
            EntityPlayer entityPlayer2 = (EntityPlayer)iterator.next();
            double d2 = Class2142.Field17803.player.getDistanceSq((Entity)entityPlayer2);
            if (entityPlayer != null && !(d2 < d)) continue;
            entityPlayer = entityPlayer2;
            d = d2;
        }
        return entityPlayer;
    }

    public final boolean Method6506(@NotNull @NotNull EntityPlayer entityPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, (String)"player");
        return this.Method6504().contains(entityPlayer);
    }

    private Class1696() {
        super("Enemy Manager");
    }

    static {
        Class1696 class1696;
        Field15860 = class1696 = new Class1696();
        Field15859 = new ArrayList();
        Iterator iterator = Class1796.Field16241.Field16254.Field8855.iterator();
        while (iterator.hasNext()) {
            Class42 class42 = (Class42)iterator.next();
            Field15859.add(class42.Field8068);
        }
    }

    private static String Method1064(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 166;
            cArray2[n] = (char)(cArray[n] ^ (0x24BB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

