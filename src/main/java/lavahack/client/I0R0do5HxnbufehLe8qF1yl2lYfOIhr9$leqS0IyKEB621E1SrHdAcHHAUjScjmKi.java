//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/gui/MainGui$Companion;", "", "()V", "openGui", "", "bar", "Lcom/kisman/cc/gui/selectionbar/SelectionBar;", "kisman.cc"})
public final class I0R0do5HxnbufehLe8qF1yl2lYfOIhr9$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    private String Field9792 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method2058(@NotNull @NotNull SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6 skQeqyCOChLN1lnQfJFyi0gfpNl3LBi6) {
        Intrinsics.checkParameterIsNotNull((Object)skQeqyCOChLN1lnQfJFyi0gfpNl3LBi6, (String)"bar");
        Minecraft.getMinecraft().displayGuiScreen(skQeqyCOChLN1lnQfJFyi0gfpNl3LBi6.Method1968().Method4955());
    }

    private I0R0do5HxnbufehLe8qF1yl2lYfOIhr9$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    public I0R0do5HxnbufehLe8qF1yl2lYfOIhr9$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method2059(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)475295547 ^ (long)475295547);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1871412650L ^ 0x6F8B7D55);
            int n2 = (int)2021459462L ^ 0x787D0661;
            cArray2[n] = (char)(cArray[n] ^ ((int)939239949L ^ 0x37FB9FDA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

