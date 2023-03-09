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
import lavahack.client.Class399;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/gui/MainGui$Companion;", "", "()V", "openGui", "", "bar", "Lcom/kisman/cc/gui/selectionbar/SelectionBar;", "kisman.cc"})
public final class Class429 {
    private String Field9792 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method2058(@NotNull @NotNull Class399 class399) {
        Intrinsics.checkParameterIsNotNull((Object)class399, (String)"bar");
        Minecraft.getMinecraft().displayGuiScreen(class399.Method1968().Method4955());
    }

    private Class429() {
    }

    public Class429(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method2059(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 103;
            cArray2[n] = (char)(cArray[n] ^ (0x35D7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

