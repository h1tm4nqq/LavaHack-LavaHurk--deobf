//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.gui.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0016?\u0006\u0006" }, d2 = { "Lcom/kisman/cc/features/viaforge/gui/ViaForgeGui;", "Lcom/kisman/cc/gui/halq/HalqGui;", "()V", "setLastGui", "gui", "Lnet/minecraft/client/gui/GuiScreen;", "kisman.cc" })
public final class Class206 extends Class1419
{
    private String Field8897 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public Class206 Method1236(@NotNull @NotNull final GuiScreen guiScreen) {
        Intrinsics.checkParameterIsNotNull((Object)guiScreen, "gui");
        final Class1419 method1218 = super.Method1218(guiScreen);
        if (method1218 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.viaforge.gui.ViaForgeGui");
        }
        return (Class206)method1218;
    }
    
    public Class1419 Method1218(final GuiScreen guiScreen) {
        return this.Method1236(guiScreen);
    }
    
    public Class206() {
        super(true);
        this.ItyDJooi2U23sHYdNmIhbJFmcHy1UFNl.add(new Class20());
    }
    
    private static String Method1235(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x586B ^ 0xF6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
