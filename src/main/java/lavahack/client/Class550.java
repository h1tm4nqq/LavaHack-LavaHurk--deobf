//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraftforge.client.event.*;
import kotlin.jvm.internal.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.awt.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/features/module/Debug/FallbackableFontTest;", "Lcom/kisman/cc/features/module/Module;", "()V", "font", "Lcom/kisman/cc/util/render/customfont/FallbackableFont;", "getFont", "()Lcom/kisman/cc/util/render/customfont/FallbackableFont;", "onRender", "", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "kisman.cc" })
public final class Class550 extends Class42
{
    @NotNull
    private final Class1354 Field10339;
    private String Field10340 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class1354 Method2459() {
        return this.Field10339;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method2460(@NotNull @NotNull final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        Intrinsics.checkParameterIsNotNull((Object)renderGameOverlayEvent$Text, "event");
        this.Field10339.Method759("\u041f\u0440\u0438\u0432\u0435\u0442 uww!", Double.longBitsToDouble(4636737291354636288L), Double.longBitsToDouble((long)993502834 ^ 0x405900003B37A672L), -1, true);
    }
    
    public Class550() {
        super("FallbackableFontTest", "Test of fallback fonts", Class97.Field8345);
        final Font method4739 = Class1178.Method4739("comfortaa-bold", 18);
        Intrinsics.checkExpressionValueIsNotNull((Object)method4739, "CustomFontUtil.getFontTTF(\"comfortaa-bold\", 18)");
        final Font method4740 = Class1178.Method4739("futura-normal", 18);
        Intrinsics.checkExpressionValueIsNotNull((Object)method4740, "CustomFontUtil.getFontTTF(\"futura-normal\", 18)");
        this.Field10339 = new Class1354(method4739, method4740);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7C4F ^ 0xBD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
