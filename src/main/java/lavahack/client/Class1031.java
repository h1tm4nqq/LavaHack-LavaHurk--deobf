//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraftforge.client.event.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.awt.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.function.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\b\u0010\r\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D?\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e?\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0019" }, d2 = { "Lcom/kisman/cc/features/hud/modules/PearlCooldown;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "astolfo", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "cooldownOnCC", "", "lastPearlTimestamp", "send", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "getCooldown", "getCurrentCooldown", "getXCoordByCooldown", "", "cooldown", "haveCooldown", "", "onDisable", "", "onEnable", "onRender", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "kisman.cc" })
public final class Class1031 extends Class1249
{
    private final Class44 Field12523;
    private final long Field12524 = 60000L;
    private long Field12525;
    private final Class618 Field12526;
    private String Field12527 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field12526);
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field12526);
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method4172(@NotNull @NotNull final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        Intrinsics.checkParameterIsNotNull((Object)renderGameOverlayEvent$Text, "event");
        final String s = "Pearl Cooldown";
        final double method267 = this.Method267();
        final double method268 = this.Method268();
        final Class44 field12523 = this.Field12523;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12523, "astolfo");
        Class1178.Method4745(s, method267, method268, field12523.Method365() ? Class1172.Method4709(100, 100) : -1);
        this.Method273(Class1178.Method4741("Pearl Cooldown"));
        this.Method274(Class1178.Method4748() + 2);
        final double method269 = this.Method267();
        final double n = this.Method268() + Class1178.Method4748() + 1;
        final double method270 = this.Method269();
        final double n2 = 1.0;
        final Color gray = Color.GRAY;
        Intrinsics.checkExpressionValueIsNotNull((Object)gray, "Color.GRAY");
        Class753.drawRectWH(method269, n, method270, n2, gray.getRGB());
        final double method271 = this.Method267();
        final double n3 = this.Method268() + Class1178.Method4748() + 1;
        final double method272 = this.Method4174(this.Method4175());
        final double n4 = 1.0;
        final Class44 field12524 = this.Field12523;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12524, "astolfo");
        Class753.drawRectWH(method271, n3, method272, n4, field12524.Method365() ? Class1172.Method4709(100, 100) : -1);
    }
    
    private final boolean Method4173() {
        return this.Method4175() >= this.Method4176();
    }
    
    private final double Method4174(final long n) {
        return this.Method4176() / n * this.Method269();
    }
    
    private final long Method4175() {
        return System.currentTimeMillis() - this.Field12525;
    }
    
    private final long Method4176() {
        return this.Field12524;
    }
    
    public Class1031() {
        super("PearlCooldown", "Shows your pearl cooldown, very helps on crystalpvp.cc", true);
        this.Field12523 = this.Method23(new Class44("Astolfo", this, false));
        this.Field12526 = new Class618(new Class1443(this), new Predicate[0]);
    }
    
    public static final boolean Method4177(final Class1031 class1031) {
        return class1031.Method4173();
    }
    
    public static final Minecraft Method4178() {
        return Class1249.Field13656;
    }
    
    public static final void Method4179(final Minecraft field13656) {
        Class1249.Field13656 = field13656;
    }
    
    public static final long Method4180(final Class1031 class1031) {
        return class1031.Field12525;
    }
    
    public static final void Method4181(final Class1031 class1031, final long field12525) {
        class1031.Field12525 = field12525;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x77ED ^ 0xEF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
