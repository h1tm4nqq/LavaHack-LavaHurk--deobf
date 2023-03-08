//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.functions.*;
import net.minecraft.entity.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.reflect.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003?\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006?\u0006\u0002\b\u0007" }, d2 = { "<anonymous>", "", "p1", "Lnet/minecraft/entity/Entity;", "Lkotlin/ParameterName;", "name", "crystal", "invoke" })
final class Class960 extends FunctionReference implements Function1
{
    private int Field12091;
    
    public Object invoke(final Object o) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((Entity)o);
        return Unit.INSTANCE;
    }
    
    public final void leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull final Entity entity) {
        Intrinsics.checkParameterIsNotNull((Object)entity, "p1");
        Class1281.Method5178((Class1281)this.receiver, entity);
    }
    
    public final KDeclarationContainer getOwner() {
        return (KDeclarationContainer)Reflection.getOrCreateKotlinClass((Class)Class1281.class);
    }
    
    public final String getName() {
        return "breakCrystal";
    }
    
    public final String getSignature() {
        return "breakCrystal(Lnet/minecraft/entity/Entity;)V";
    }
    
    Class960(final Class1281 class1281) {
        super(1, (Object)class1281);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7253 ^ 0xF9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
