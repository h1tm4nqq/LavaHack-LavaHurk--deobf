//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import java.util.function.*;
import net.minecraft.entity.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004?\u0006\u0002\u0010\u0007BK\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004?\u0006\u0002\u0010\rJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0015" }, d2 = { "Lcom/kisman/cc/features/module/combat/autorer/AutoRerDamageSyncHandler;", "Lcom/kisman/cc/util/world/DamageSyncHandler;", "handler", "placeCheck", "Ljava/util/function/Supplier;", "", "breakCheck", "(Lcom/kisman/cc/util/world/DamageSyncHandler;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V", "state", "delay", "", "minOffset", "", "(Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V", "canBreak", "Lcom/kisman/cc/util/collections/Bind;", "", "damage", "target", "Lnet/minecraft/entity/Entity;", "canPlace", "kisman.cc" })
public final class Class2086 extends Class1648
{
    private final Supplier Field17524;
    private final Supplier Field17525;
    private String Field17526 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class1621 Method7623(final float f, @Nullable @Nullable final Entity entity) {
        if (entity != null) {
            final Boolean value = this.Field17524.get();
            Intrinsics.checkExpressionValueIsNotNull((Object)value, "placeCheck.get()");
            if (value) {
                return this.Method6396(f, entity);
            }
        }
        return new Class1621((Object)(entity != null), (Object)f);
    }
    
    @NotNull
    @NotNull
    public final Class1621 Method7624(final float f, @Nullable @Nullable final Entity entity) {
        if (entity != null) {
            final Boolean value = this.Field17525.get();
            Intrinsics.checkExpressionValueIsNotNull((Object)value, "breakCheck.get()");
            if (value) {
                return this.Method6396(f, entity);
            }
        }
        return new Class1621((Object)(entity != null), (Object)f);
    }
    
    public Class2086(@NotNull @NotNull final Supplier supplier, @NotNull @NotNull final Supplier supplier2, @NotNull @NotNull final Supplier supplier3, @NotNull @NotNull final Supplier field17524, @NotNull @NotNull final Supplier field17525) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, "state");
        Intrinsics.checkParameterIsNotNull((Object)supplier2, "delay");
        Intrinsics.checkParameterIsNotNull((Object)supplier3, "minOffset");
        Intrinsics.checkParameterIsNotNull((Object)field17524, "placeCheck");
        Intrinsics.checkParameterIsNotNull((Object)field17525, "breakCheck");
        super(supplier, supplier2, supplier3);
        this.Field17524 = field17524;
        this.Field17525 = field17525;
    }
    
    public Class2086(@NotNull @NotNull final Class1648 class1648, @NotNull @NotNull final Supplier supplier, @NotNull @NotNull final Supplier supplier2) {
        Intrinsics.checkParameterIsNotNull((Object)class1648, "handler");
        Intrinsics.checkParameterIsNotNull((Object)supplier, "placeCheck");
        Intrinsics.checkParameterIsNotNull((Object)supplier2, "breakCheck");
        this(class1648.Method6397(), class1648.Method6398(), class1648.Method6399(), supplier, supplier2);
    }
    
    private static String Method6400(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3EA ^ 0xF9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
