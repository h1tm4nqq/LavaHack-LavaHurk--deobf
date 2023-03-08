//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import net.minecraft.client.multiplayer.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "kotlin.jvm.PlatformType", "arg", "Lorg/cubic/dynamictask/ArgumentFetcher;", "call" })
final class Class306 implements Class1471
{
    public static final Class306 Field9311;
    private int Field9312;
    
    public Object Method1564(final Class424 class424) {
        return this.Method1580(class424);
    }
    
    public final float[] Method1580(@NotNull @NotNull final Class424 class424) {
        Intrinsics.checkParameterIsNotNull((Object)class424, "arg");
        final Object method2054 = class424.Method2054(1);
        if (method2054 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RotationLogic");
        }
        float[] array = null;
        switch (Class948.Field12044[((Class1048)method2054).ordinal()]) {
            case 1: {
                final WorldClient world = Class1325.Method5367().world;
                final Object method2055 = class424.Method2054(0);
                Intrinsics.checkExpressionValueIsNotNull(method2055, "arg.fetch(0)");
                array = Class1568.Method6179(world.getEntityByID(((Number)method2055).intValue()));
                break;
            }
            case 2: {
                final WorldClient world2 = Class1325.Method5367().world;
                final Object method2056 = class424.Method2054(0);
                Intrinsics.checkExpressionValueIsNotNull(method2056, "arg.fetch(0)");
                array = Class1568.Method6163(world2.getEntityByID(((Number)method2056).intValue()));
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return array;
    }
    
    static {
        Field9311 = new Class306();
    }
    
    private static String Method1581(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2A3F ^ 0xBE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
