//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraftforge.client.event.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.util.text.*;
import net.minecraftforge.fml.common.eventhandler.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\n" }, d2 = { "Lcom/kisman/cc/features/hud/modules/CurrentConfig;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "astolfo", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "onRender", "", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "kisman.cc" })
public final class Class980 extends Class1249
{
    private final Class44 Field12190;
    private String Field12191 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method3991(@NotNull @NotNull final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        Intrinsics.checkParameterIsNotNull((Object)renderGameOverlayEvent$Text, "event");
        this.Method274((double)Class1178.Method4748());
        final String string = "Current Config" + TextFormatting.GRAY + ": " + ((Class1796.Field16250 != null) ? Class1796.Field16250 : "null");
        final double method267 = this.Method267();
        final double method268 = this.Method268();
        final Class44 field12190 = this.Field12190;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12190, "astolfo");
        Class1178.Method4745(string, method267, method268, field12190.Method365() ? Class1172.Method4709(100, 100) : -1);
        this.Method273((double)Class1178.Method4741(string));
    }
    
    public Class980() {
        super("CurrentConfig", "Shows your current config.", true);
        this.Field12190 = this.Method23(new Class44("Astolfo", (Class42)this, true));
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2B19 ^ 0x22));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
