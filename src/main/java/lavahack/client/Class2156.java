//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.entity.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006?\u0006\u0007" }, d2 = { "Lcom/kisman/cc/util/enums/EntityESPTypes$Companion;", "", "()V", "get", "Lcom/kisman/cc/util/enums/EntityESPTypes;", "entity", "Lnet/minecraft/entity/Entity;", "kisman.cc" })
public final class Class2156
{
    private String Field17856 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Nullable
    @Nullable
    public final Class1269 Method7776(@NotNull @NotNull final Entity entity) {
        Intrinsics.checkParameterIsNotNull((Object)entity, "entity");
        for (final Class1269 class1269 : Class1269.values()) {
            if (class1269.Method5102().isInstance(entity)) {
                return class1269;
            }
        }
        return null;
    }
    
    private Class2156() {
    }
    
    public Class2156(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    private static String Method7777(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6325 ^ 0x76));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
