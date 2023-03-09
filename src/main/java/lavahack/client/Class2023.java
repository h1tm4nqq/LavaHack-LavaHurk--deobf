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
import lavahack.client.Class1419;
import lavahack.client.Class2004;
import lavahack.client.Class264;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/gui/GuiBlur;", "", "()V", "blurred", "", "getBlurred", "()Z", "setBlurred", "(Z)V", "update", "", "kisman.cc"})
public final class Class2023 {
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
        if (minecraft.currentScreen instanceof Class1419 || minecraft.currentScreen instanceof Class2004 || minecraft.currentScreen instanceof Class264) {
            if (!this.Field17305) {
                minecraft.entityRenderer.loadShader(new ResourceLocation("shaders/post/blur.json"));
            }
        } else if (this.Field17305) {
            if (minecraft.player != null && minecraft.world != null) {
                minecraft.entityRenderer.getShaderGroup().deleteShaderGroup();
            }
        }
        if (!(minecraft.currentScreen instanceof Class1419) && !(minecraft.currentScreen instanceof Class2004)) {
            if (!(minecraft.currentScreen instanceof Class264)) return;
        }
        if (this.Field17305) return;
    }

    private static String Method7486(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 73;
            cArray2[n] = (char)(cArray[n] ^ (0xA56 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

