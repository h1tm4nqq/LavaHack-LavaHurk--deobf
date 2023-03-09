/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.gui.GuiScreen
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1419;
import lavahack.client.Class20;
import net.minecraft.client.gui.GuiScreen;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/features/viaforge/gui/ViaForgeGui;", "Lcom/kisman/cc/gui/halq/HalqGui;", "()V", "setLastGui", "gui", "Lnet/minecraft/client/gui/GuiScreen;", "kisman.cc"})
public final class Class206
extends Class1419 {
    private String Field8897 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public Class206 Method1236(@NotNull @NotNull GuiScreen guiScreen) {
        Intrinsics.checkParameterIsNotNull((Object)guiScreen, (String)"gui");
        Class1419 class1419 = super.Method1218(guiScreen);
        if (class1419 != null) return (Class206)class1419;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.viaforge.gui.ViaForgeGui");
    }

    @Override
    public Class1419 Method1218(GuiScreen guiScreen) {
        return this.Method1236(guiScreen);
    }

    public Class206() {
        super(true);
        this.ItyDJooi2U23sHYdNmIhbJFmcHy1UFNl.add(new Class20());
    }

    private static String Method1235(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 246;
            cArray2[n] = (char)(cArray[n] ^ (0x586B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

