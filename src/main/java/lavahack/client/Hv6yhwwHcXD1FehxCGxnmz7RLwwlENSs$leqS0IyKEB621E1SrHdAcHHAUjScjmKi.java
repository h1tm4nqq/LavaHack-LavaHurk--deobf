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

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU;
import lavahack.client.im1xE6GdaECDr1Bz5yXpFIa9aY3EJSGz;
import net.minecraft.client.gui.ScaledResolution;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/gui/halq/util/DraggableCoordsFixer$Companion;", "", "()V", "fix", "", "draggable", "Lcom/kisman/cc/gui/api/Draggable;", "kisman.cc"})
public final class Hv6yhwwHcXD1FehxCGxnmz7RLwwlENSs$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    private int Field10368;

    public final void Method2466(@NotNull @NotNull im1xE6GdaECDr1Bz5yXpFIa9aY3EJSGz im1xE6GdaECDr1Bz5yXpFIa9aY3EJSGz2) {
        Intrinsics.checkParameterIsNotNull((Object)im1xE6GdaECDr1Bz5yXpFIa9aY3EJSGz2, (String)"draggable");
        ScaledResolution scaledResolution = new ScaledResolution(Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803);
        im1xE6GdaECDr1Bz5yXpFIa9aY3EJSGz2.Method271(HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU.Method4278(im1xE6GdaECDr1Bz5yXpFIa9aY3EJSGz2.Method267(), 0.0, (double)scaledResolution.getScaledWidth() - im1xE6GdaECDr1Bz5yXpFIa9aY3EJSGz2.Method269()));
        im1xE6GdaECDr1Bz5yXpFIa9aY3EJSGz2.Method272(HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU.Method4278(im1xE6GdaECDr1Bz5yXpFIa9aY3EJSGz2.Method268(), 0.0, (double)scaledResolution.getScaledHeight() - im1xE6GdaECDr1Bz5yXpFIa9aY3EJSGz2.Method270()));
    }

    private Hv6yhwwHcXD1FehxCGxnmz7RLwwlENSs$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    public Hv6yhwwHcXD1FehxCGxnmz7RLwwlENSs$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method2467(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1148783287 ^ (long)-1148783287);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1040597331L ^ 0x3E0641AC);
            int n2 = ((int)1256835926L ^ 0x4AE9CB41) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1231389601 ^ (long)-1231394628) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

