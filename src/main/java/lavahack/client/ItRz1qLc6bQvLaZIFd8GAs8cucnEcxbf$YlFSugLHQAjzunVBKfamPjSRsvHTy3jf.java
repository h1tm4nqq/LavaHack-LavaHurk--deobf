/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.ItRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "first", "Lcom/kisman/cc/features/hud/modules/BindList$Element;", "second", "compare"})
final class ItRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
implements Comparator {
    public static final ItRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field11033 = new ItRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf();
    private String Field11034 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public int compare(Object object, Object object2) {
        return this.Method2977((ItRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object, (ItRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object2);
    }

    public final int Method2977(@NotNull @NotNull ItRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi itRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, @NotNull @NotNull ItRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi itRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2) {
        int n;
        Intrinsics.checkParameterIsNotNull((Object)itRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (String)"first");
        Intrinsics.checkParameterIsNotNull((Object)itRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2, (String)"second");
        float f = fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(itRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2.Method1910()) - fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(itRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1910());
        if (f != 0.0f) {
            n = (int)f;
            return n;
        }
        n = itRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2.Method1910().compareTo(itRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1910());
        return n;
    }

    ItRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
    }

    private static String Method2978(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)25109399 ^ (long)25109399);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1509640515 ^ (long)-1509640638);
            int n2 = ((int)-403601039L ^ 0xE7F1895E) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)1531427511L ^ 0x5B47F672 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

