//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.ResourceLocation
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.ABhseIFL1PQVX4WAovmpeO8P6T0dQPpk;
import lavahack.client.qAMntBvpawO7voz5KoEzPRpFPYIb4WHt;
import lavahack.client.zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/gui/GuiBlur;", "", "()V", "blurred", "", "getBlurred", "()Z", "setBlurred", "(Z)V", "update", "", "kisman.cc"})
public final class rKs1CsXxd066Ydw4jACknxmhYI9RgJU8 {
    private boolean Field17305;
    private String Field17306 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final boolean Method7483() {
        return this.Field17305;
    }

    public final void Method7484(boolean bl) {
        this.Field17305 = bl;
    }

    public final void Method7485() {
        Minecraft minecraft = Minecraft.getMinecraft();
        if (minecraft.player == null) return;
        if (minecraft.world == null) {
            return;
        }
        if (minecraft.currentScreen instanceof zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4 || minecraft.currentScreen instanceof qAMntBvpawO7voz5KoEzPRpFPYIb4WHt || minecraft.currentScreen instanceof ABhseIFL1PQVX4WAovmpeO8P6T0dQPpk) {
            if (!this.Field17305) {
                minecraft.entityRenderer.loadShader(new ResourceLocation("shaders/post/blur.json"));
            }
        } else if (this.Field17305) {
            if (minecraft.player != null && minecraft.world != null) {
                minecraft.entityRenderer.getShaderGroup().deleteShaderGroup();
            }
        }
        if (!(minecraft.currentScreen instanceof zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4) && !(minecraft.currentScreen instanceof qAMntBvpawO7voz5KoEzPRpFPYIb4WHt)) {
            if (!(minecraft.currentScreen instanceof ABhseIFL1PQVX4WAovmpeO8P6T0dQPpk)) return;
        }
        if (this.Field17305) return;
    }

    private static String Method7486(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1673252095L ^ 0x9C443301;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-546762835L ^ 0xDF690F52);
            int n2 = (int)((long)-338158859 ^ (long)-338158916);
            cArray2[n] = (char)(cArray[n] ^ (((int)1057899989L ^ 0x3F0E40FE) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

