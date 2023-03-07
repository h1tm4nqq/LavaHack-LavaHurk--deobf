//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.gui.GuiSlider$FormatHelper
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gui.GuiSlider;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/gui/other/music/MusicGui$VolumeFormatter;", "Lnet/minecraft/client/gui/GuiSlider$FormatHelper;", "()V", "getText", "", "id", "", "name", "value", "", "kisman.cc"})
public final class qc9FwVpWiqRQho5VXPrDfJ5nrkFdG0Ld$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements GuiSlider.FormatHelper {
    private String Field8947 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public String getText(int n, @NotNull @NotNull String string, float f) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        return string + ": " + (int)f + (char)((int)1104987163L ^ 0x41DCC43E);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1178180935 ^ (long)1178180935);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-507421746L ^ 0xE1C15B31);
            int n2 = (int)((long)-1880370154 ^ (long)-1880370027);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)2057430648 ^ (long)2057420179) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

