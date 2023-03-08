//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.entity.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t?\u0006\u0002\u0010\u000b?\u0006\f" }, d2 = { "Lcom/kisman/cc/event/events/RenderEntityEvent$All$Pre;", "Lcom/kisman/cc/event/events/RenderEntityEvent$All;", "entity", "Lnet/minecraft/entity/Entity;", "x", "", "y", "z", "yaw", "", "partialTicks", "(Lnet/minecraft/entity/Entity;DDDFF)V", "kisman.cc" })
public final class Class1906 extends Class2123
{
    private int Field16771;
    
    public Class1906(@NotNull @NotNull final Entity entity, final double n, final double n2, final double n3, final float n4, final float n5) {
        Intrinsics.checkParameterIsNotNull((Object)entity, "entity");
        super(entity, n, n2, n3, n4, n5, null);
    }
    
    private static String Method170(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2AB8 ^ 0x7D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
