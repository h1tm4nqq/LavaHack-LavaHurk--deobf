//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.functions.*;
import com.kisman.cc.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n?\u0006\u0002\b\u0007" }, d2 = { "modifyColor", "Lcom/kisman/cc/util/Colour;", "color", "delay", "", "logic", "Lcom/kisman/cc/util/enums/FadeLogic;", "invoke" })
final class Class121 extends Lambda implements Function3
{
    final long Field8425;
    final float Field8426;
    final float Field8427;
    private int Field8428;
    
    public Object invoke(final Object o, final Object o2, final Object o3) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((Class2027)o, ((Number)o2).longValue(), (Class1480)o3);
    }
    
    @NotNull
    @NotNull
    public final Class2027 leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull final Class2027 class2027, final long b, @NotNull @NotNull final Class1480 class2028) {
        Intrinsics.checkParameterIsNotNull((Object)class2027, "color");
        Intrinsics.checkParameterIsNotNull((Object)class2028, "logic");
        Class2027 method3633;
        if (b == 0L) {
            method3633 = class2027;
        }
        else {
            float n = 0.0f;
            switch (Class1442.Field14755[class2028.ordinal()]) {
                case 1: {
                    n = (float)(Math.min(System.currentTimeMillis() - this.Field8425, b) / b);
                    break;
                }
                case 2: {
                    n = 1 - Math.min(this.Field8426, this.Field8427) / this.Field8427;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            Intrinsics.checkExpressionValueIsNotNull((Object)(method3633 = class2027.Method3633((int)(class2027.Field17324 * n))), "color.withAlpha((color.a * delta).toInt())");
        }
        return method3633;
    }
    
    Class121(final long field8425, final float field8426, final float field8427) {
        this.Field8425 = field8425;
        this.Field8426 = field8426;
        this.Field8427 = field8427;
        super(3);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6773 ^ 0xC1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
