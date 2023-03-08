//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.gui.*;
import kotlin.*;
import net.minecraft.client.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.renderer.*;
import net.minecraft.init.*;
import net.minecraft.item.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003?\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016?\u0006\u000f" }, d2 = { "Lcom/kisman/cc/features/pingbypass/gui/GuiButtonPingBypassOptions;", "Lnet/minecraft/client/gui/GuiButton;", "id", "", "x", "y", "(III)V", "drawButton", "", "mc", "Lnet/minecraft/client/Minecraft;", "mouseX", "mouseY", "partialTicks", "", "kisman.cc" })
public final class Class1770 extends GuiButton
{
    private String Field16115 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void drawButton(@NotNull @NotNull final Minecraft minecraft, final int n, final int n2, final float n3) {
        Intrinsics.checkParameterIsNotNull((Object)minecraft, "mc");
        if (this.visible) {
            super.drawButton(minecraft, n, n2, n3);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            minecraft.renderItem.renderItemAndEffectIntoGUI(new ItemStack(Items.WRITABLE_BOOK), this.x + 2, this.y + 2);
        }
    }
    
    public Class1770(final int n, final int n2, final int n3) {
        super(n, n2, n3, 20, 20, "");
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x29AE ^ 0xF4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
