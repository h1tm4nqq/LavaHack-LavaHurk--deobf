//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006?\u0006\n" }, d2 = { "Lcom/kisman/cc/util/enums/HandRewriteSlotMappings$Companion;", "", "()V", "defaultSlot", "Lcom/kisman/cc/util/enums/HandRewriteSlotMappings;", "getDefaultSlot", "()Lcom/kisman/cc/util/enums/HandRewriteSlotMappings;", "get", "slot", "", "kisman.cc" })
public final class Class2005
{
    private int Field17196;
    
    @NotNull
    @NotNull
    public final Class1051 Method7453() {
        return Class1051.Method4291();
    }
    
    @NotNull
    @NotNull
    public final Class1051 Method7454(final int n) {
        for (final Class1051 class1051 : Class1051.values()) {
            if (class1051.Method4289() == n) {
                return class1051;
            }
        }
        return this.Method7453();
    }
    
    private Class2005() {
    }
    
    public Class2005(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
