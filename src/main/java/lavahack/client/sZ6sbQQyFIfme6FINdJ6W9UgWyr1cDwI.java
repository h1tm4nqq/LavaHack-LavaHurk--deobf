//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.dxK4kwe0IKl7Q3qLJ0lRwtNXsjby1puz;
import lavahack.client.ohP0orxdq2P1v9VESBaGP1easnqKGTCb;
import lavahack.client.zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2={"Lcom/kisman/cc/gui/hudeditor/HalqHudGui;", "Lcom/kisman/cc/gui/halq/HalqGui;", "()V", "color", "Lcom/kisman/cc/util/Colour;", "getColor", "()Lcom/kisman/cc/util/Colour;", "setColor", "(Lcom/kisman/cc/util/Colour;)V", "settingsFrame", "Lcom/kisman/cc/gui/hudeditor/HudSettingsFrame;", "getSettingsFrame", "()Lcom/kisman/cc/gui/hudeditor/HudSettingsFrame;", "drawScreen", "", "mouseX", "", "mouseY", "partialTicks", "", "gui", "Lcom/kisman/cc/gui/selectionbar/SelectionBar$Guis;", "kisman.cc"})
public final class sZ6sbQQyFIfme6FINdJ6W9UgWyr1cDwI
extends zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4 {
    @NotNull
    private vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field16024 = new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)1323523229 ^ (long)1323523224) << 1, (int)((long)-1858811389 ^ (long)-1858811386) << 1, (int)((long)-97891085 ^ (long)-97891082) << 1, ((int)-1616447176L ^ 0x9FA6F96D) << 1);
    @NotNull
    private final dxK4kwe0IKl7Q3qLJ0lRwtNXsjby1puz Field16025;
    private int Field16026;

    @NotNull
    @NotNull
    public final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method6671() {
        return this.Field16024;
    }

    public final void Method6672(@NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2) {
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"<set-?>");
        this.Field16024 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
    }

    @NotNull
    @NotNull
    public final dxK4kwe0IKl7Q3qLJ0lRwtNXsjby1puz Method6673() {
        return this.Field16025;
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = this.Field16025.Method5387().Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"settingsFrame.colorSetting.colour");
        this.Field16024 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        super.drawScreen(n, n2, f);
    }

    @Override
    @NotNull
    @NotNull
    protected SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method1220() {
        return SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13594;
    }

    public sZ6sbQQyFIfme6FINdJ6W9UgWyr1cDwI() {
        super((boolean)((long)341894643 ^ (long)341894642));
        int n = (int)((long)-1693675151 ^ (long)-1693675138);
        this.Field14607.add(new ohP0orxdq2P1v9VESBaGP1easnqKGTCb((int)-1801605943L ^ 0x949DACC6, (int)((long)-1345981749 ^ (long)-1345981756), "Hud Editor"));
        this.Field16025 = new dxK4kwe0IKl7Q3qLJ0lRwtNXsjby1puz(n += (int)((long)1227668547 ^ (long)1227668676), (int)40925767L ^ 0x2707A48);
        this.Field14607.add(this.Field16025);
    }

    private static String Method1235(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-2000045109L ^ 0x88C9BBCB;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-657205210L ^ 0xD8D3D8D9);
            int n2 = (int)-1053625167L ^ 0xC132F4D4;
            cArray2[n] = (char)(cArray[n] ^ (((int)679982022L ^ 0x2887B3E1) << 8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

