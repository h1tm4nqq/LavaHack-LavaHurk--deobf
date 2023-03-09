//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.gui.ScaledResolution
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1047;
import lavahack.client.Class732;
import net.minecraft.client.gui.ScaledResolution;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/gui/halq/util/DraggableCoordsFixer$Companion;", "", "()V", "fix", "", "draggable", "Lcom/kisman/cc/gui/api/Draggable;", "kisman.cc"})
public final class Class556 {
    private int Field10368;

    public final void Method2466(@NotNull @NotNull Class732 class732) {
        Intrinsics.checkParameterIsNotNull((Object)class732, (String)"draggable");
        ScaledResolution scaledResolution = new ScaledResolution(Class2142.Field17803);
        class732.Method271(Class1047.Method4278(class732.Method267(), 0.0, (double)scaledResolution.getScaledWidth() - class732.Method269()));
        class732.Method272(Class1047.Method4278(class732.Method268(), 0.0, (double)scaledResolution.getScaledHeight() - class732.Method270()));
    }

    private Class556() {
    }

    public Class556(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method2467(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 46;
            cArray2[n] = (char)(cArray[n] ^ (0x29C6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

