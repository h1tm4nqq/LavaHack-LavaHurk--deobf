//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006?\u0006\u0007" }, d2 = { "Lcom/kisman/cc/gui/MainGui$Companion;", "", "()V", "openGui", "", "bar", "Lcom/kisman/cc/gui/selectionbar/SelectionBar;", "kisman.cc" })
public final class Class429
{
    private String Field9792 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final void Method2058(@NotNull @NotNull final Class399 class399) {
        Intrinsics.checkParameterIsNotNull((Object)class399, "bar");
        Minecraft.getMinecraft().displayGuiScreen(class399.Method1968().Method4955());
    }
    
    private Class429() {
    }
    
    public Class429(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    private static String Method2059(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x35D7 ^ 0x67));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
