//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.util.math.*;
import java.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004?\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/features/module/combat/autorer/PlaceInfo$Companion;", "", "()V", "INVALID", "Lcom/kisman/cc/features/module/combat/autorer/PlaceInfo;", "INVALID$annotations", "getElementFromListByPos", "list", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "kisman.cc" })
public final class Class1500
{
    private int Field15038;
    
    @Nullable
    @Nullable
    public final Class204 Method6018(@NotNull @NotNull final List list, @NotNull @NotNull final BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)list, "list");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        for (final Class204 next : (List<Object>)list) {
            if (Intrinsics.areEqual((Object)next.Method1203(), (Object)blockPos)) {
                return next;
            }
        }
        return null;
    }
    
    private Class1500() {
    }
    
    public Class1500(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    private static String Method6019(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4BE6 ^ 0xF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
