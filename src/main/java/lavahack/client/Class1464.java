//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.*;
import org.jetbrains.annotations.*;
import net.minecraft.entity.*;
import kotlin.jvm.internal.*;
import net.minecraft.util.math.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n\u001a\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\u0016\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n\u001a\u001e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\"\u001c\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0006X\u0087\u0004?\u0006\u0002\n\u0000\"\u001c\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u00018\u0006X\u0087\u0004?\u0006\u0002\n\u0000?\u0006\u000f" }, d2 = { "rotationBlockCache", "Lcom/kisman/cc/util/collections/LimitedHashMap;", "Lnet/minecraft/util/math/BlockPos;", "", "rotationEntityCache", "Lnet/minecraft/entity/Entity;", "rotateBlock", "Ljava/lang/Void;", "pos", "rotator", "Lcom/kisman/cc/util/enums/dynamic/RotationEnum$Rotation;", "silent", "", "rotateEntity", "entity", "kisman.cc" })
public final class Class1464
{
    @JvmField
    @NotNull
    public static final Class841 Field14844;
    @JvmField
    @NotNull
    public static final Class841 Field14845;
    private int Field14846;
    
    @NotNull
    @NotNull
    public static final Void Method5894(@NotNull @NotNull final Entity entity, @NotNull @NotNull final Class135 class135, final boolean b) {
        Intrinsics.checkParameterIsNotNull((Object)entity, "entity");
        Intrinsics.checkParameterIsNotNull((Object)class135, "rotator");
        final Class1763 method929 = class135.Method929();
        final Object[] array = new Object[2];
        final int n = 0;
        final Object method930 = class135.Method931().Method1726(entity.entityId, Class1048.Field12640);
        final int n2 = n;
        final Object[] array2 = array;
        final Object[] array3 = array;
        final Class1763 class136 = method929;
        final float[] array4 = (float[])method930;
        final Class841 class137 = Class1464.Field14845;
        final float[] array5 = array4;
        Intrinsics.checkExpressionValueIsNotNull((Object)array5, "it");
        class137.put(entity, array5);
        final float[] array6 = (float[])method930;
        final Class1763 class138 = class136;
        final Object[] array7 = array3;
        array2[n2] = array6;
        array7[1] = b;
        final Object method931 = class138.Method1726(array7);
        Intrinsics.checkExpressionValueIsNotNull(method931, "rotator.taskR.doTask(rot\u2026e[entity] = it }, silent)");
        return (Void)method931;
    }
    
    @NotNull
    @NotNull
    public static final Void Method5895(@NotNull @NotNull final Entity entity, @NotNull @NotNull final Class135 class135) {
        Intrinsics.checkParameterIsNotNull((Object)entity, "entity");
        Intrinsics.checkParameterIsNotNull((Object)class135, "rotator");
        return Method5894(entity, class135, false);
    }
    
    @NotNull
    @NotNull
    public static final Void Method5896(@NotNull @NotNull final BlockPos blockPos, @NotNull @NotNull final Class135 class135, final boolean b) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        Intrinsics.checkParameterIsNotNull((Object)class135, "rotator");
        final Class1763 method929 = class135.Method929();
        final Object[] array = new Object[2];
        final int n = 0;
        final Object method930 = class135.Method932().Method1726(blockPos);
        final int n2 = n;
        final Object[] array2 = array;
        final Object[] array3 = array;
        final Class1763 class136 = method929;
        final float[] array4 = (float[])method930;
        final Class841 class137 = Class1464.Field14844;
        final float[] array5 = array4;
        Intrinsics.checkExpressionValueIsNotNull((Object)array5, "it");
        class137.put(blockPos, array5);
        final float[] array6 = (float[])method930;
        final Class1763 class138 = class136;
        final Object[] array7 = array3;
        array2[n2] = array6;
        array7[1] = b;
        final Object method931 = class138.Method1726(array7);
        Intrinsics.checkExpressionValueIsNotNull(method931, "rotator.taskR.doTask(rot\u2026ache[pos] = it }, silent)");
        return (Void)method931;
    }
    
    @NotNull
    @NotNull
    public static final Void Method5897(@NotNull @NotNull final BlockPos blockPos, @NotNull @NotNull final Class135 class135) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        Intrinsics.checkParameterIsNotNull((Object)class135, "rotator");
        return Method5896(blockPos, class135, false);
    }
    
    static {
        Field14844 = new Class841(1000);
        Field14845 = new Class841(1000);
    }
    
    private static String Method5898(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x66BF ^ 0x1A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
