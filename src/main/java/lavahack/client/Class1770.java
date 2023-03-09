//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemStack
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00a8\u0006\u000f"}, d2={"Lcom/kisman/cc/features/pingbypass/gui/GuiButtonPingBypassOptions;", "Lnet/minecraft/client/gui/GuiButton;", "id", "", "x", "y", "(III)V", "drawButton", "", "mc", "Lnet/minecraft/client/Minecraft;", "mouseX", "mouseY", "partialTicks", "", "kisman.cc"})
public final class Class1770
extends GuiButton {
    private String Field16115 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void drawButton(@NotNull @NotNull Minecraft minecraft, int n, int n2, float f) {
        Intrinsics.checkParameterIsNotNull((Object)minecraft, (String)"mc");
        if (!this.visible) return;
        super.drawButton(minecraft, n, n2, f);
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        minecraft.renderItem.renderItemAndEffectIntoGUI(new ItemStack(Items.WRITABLE_BOOK), this.x + 2, this.y + 2);
    }

    public Class1770(int n, int n2, int n3) {
        super(n, n2, n3, 20, 20, "");
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 244;
            cArray2[n] = (char)(cArray[n] ^ (0x29AE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

