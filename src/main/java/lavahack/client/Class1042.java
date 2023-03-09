//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.gui.GuiPageButtonList$GuiResponder
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gui.GuiPageButtonList;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000eH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2={"Lcom/kisman/cc/gui/other/music/MusicGui$VolumeResponder;", "Lnet/minecraft/client/gui/GuiPageButtonList$GuiResponder;", "()V", "volume", "", "getVolume", "()I", "setVolume", "(I)V", "setEntryValue", "", "p0", "p1", "", "", "", "kisman.cc"})
public final class Class1042
implements GuiPageButtonList.GuiResponder {
    private int Field12592 = 100;
    private String Field12593 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final int getVolume() {
        return this.Field12592;
    }

    public final void setVolume(int n) {
        this.Field12592 = n;
    }

    public void setEntryValue(int n, float f) {
        this.Field12592 = (int)f;
    }

    public void setEntryValue(int n, boolean bl) {
    }

    public void setEntryValue(int n, @NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"p1");
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 200;
            cArray2[n] = (char)(cArray[n] ^ (0x7803 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

