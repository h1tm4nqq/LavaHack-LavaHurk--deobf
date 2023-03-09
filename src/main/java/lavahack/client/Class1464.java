//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1048;
import lavahack.client.Class135;
import lavahack.client.Class1763;
import lavahack.client.Class841;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n\u001a\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\u0016\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n\u001a\u001e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\"\u001c\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\"\u001c\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u00018\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2={"rotationBlockCache", "Lcom/kisman/cc/util/collections/LimitedHashMap;", "Lnet/minecraft/util/math/BlockPos;", "", "rotationEntityCache", "Lnet/minecraft/entity/Entity;", "rotateBlock", "Ljava/lang/Void;", "pos", "rotator", "Lcom/kisman/cc/util/enums/dynamic/RotationEnum$Rotation;", "silent", "", "rotateEntity", "entity", "kisman.cc"})
public final class Class1464 {
    @JvmField
    @NotNull
    public static final Class841 Field14844 = new Class841(1000);
    @JvmField
    @NotNull
    public static final Class841 Field14845 = new Class841(1000);
    private int Field14846;

    @NotNull
    @NotNull
    public static final Void Method5894(@NotNull @NotNull Entity entity, @NotNull @NotNull Class135 class135, boolean bl) {
        Object object;
        Object[] objectArray;
        Intrinsics.checkParameterIsNotNull((Object)entity, (String)"entity");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class135), (String)"rotator");
        Object object2 = class135.Method931().Method1726(new Object[]{entity.entityId, Class1048.Field12640});
        int n = 0;
        Object[] objectArray2 = objectArray = new Object[2];
        Class1763 class1763 = class135.Method929();
        boolean bl2 = false;
        boolean bl3 = false;
        float[] fArray = (float[])object2;
        boolean bl4 = false;
        Map map = Field14845;
        Entity entity2 = entity;
        Intrinsics.checkExpressionValueIsNotNull((Object)fArray, (String)"it");
        float[] fArray2 = fArray;
        boolean bl5 = false;
        map.put(entity2, fArray2);
        objectArray[n] = object = object2;
        objectArray2[1] = bl;
        Object object3 = class1763.Method1726(objectArray2);
        Intrinsics.checkExpressionValueIsNotNull((Object)object3, (String)"rotator.taskR.doTask(rot\u2026e[entity] = it }, silent)");
        return (Void)object3;
    }

    @NotNull
    @NotNull
    public static final Void Method5895(@NotNull @NotNull Entity entity, @NotNull @NotNull Class135 class135) {
        Intrinsics.checkParameterIsNotNull((Object)entity, (String)"entity");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class135), (String)"rotator");
        return Class1464.Method5894(entity, class135, false);
    }

    @NotNull
    @NotNull
    public static final Void Method5896(@NotNull @NotNull BlockPos blockPos, @NotNull @NotNull Class135 class135, boolean bl) {
        Object object;
        Object[] objectArray;
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class135), (String)"rotator");
        Object object2 = class135.Method932().Method1726(blockPos);
        int n = 0;
        Object[] objectArray2 = objectArray = new Object[2];
        Class1763 class1763 = class135.Method929();
        boolean bl2 = false;
        boolean bl3 = false;
        float[] fArray = (float[])object2;
        boolean bl4 = false;
        Map map = Field14844;
        BlockPos blockPos2 = blockPos;
        Intrinsics.checkExpressionValueIsNotNull((Object)fArray, (String)"it");
        float[] fArray2 = fArray;
        boolean bl5 = false;
        map.put(blockPos2, fArray2);
        objectArray[n] = object = object2;
        objectArray2[1] = bl;
        Object object3 = class1763.Method1726(objectArray2);
        Intrinsics.checkExpressionValueIsNotNull((Object)object3, (String)"rotator.taskR.doTask(rot\u2026ache[pos] = it }, silent)");
        return (Void)object3;
    }

    @NotNull
    @NotNull
    public static final Void Method5897(@NotNull @NotNull BlockPos blockPos, @NotNull @NotNull Class135 class135) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class135), (String)"rotator");
        return Class1464.Method5896(blockPos, class135, false);
    }

    private static String Method5898(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 26;
            cArray2[n] = (char)(cArray[n] ^ (0x66BF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

