//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;
import net.minecraft.client.gui.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006?\u0006\u0007" }, d2 = { "Lcom/kisman/cc/gui/halq/util/DraggableCoordsFixer$Companion;", "", "()V", "fix", "", "draggable", "Lcom/kisman/cc/gui/api/Draggable;", "kisman.cc" })
public final class Class556
{
    private int Field10368;
    
    public final void Method2466(@NotNull @NotNull final Class732 class732) {
        Intrinsics.checkParameterIsNotNull((Object)class732, "draggable");
        final ScaledResolution scaledResolution = new ScaledResolution(Class2142.Field17803);
        class732.Method271(Class1047.Method4278(class732.Method267(), 0.0, scaledResolution.getScaledWidth() - class732.Method269()));
        class732.Method272(Class1047.Method4278(class732.Method268(), 0.0, scaledResolution.getScaledHeight() - class732.Method270()));
    }
    
    private Class556() {
    }
    
    public Class556(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    private static String Method2467(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x29C6 ^ 0x2E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
