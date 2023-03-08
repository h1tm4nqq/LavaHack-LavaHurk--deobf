//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraftforge.client.event.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.gui.*;
import com.kisman.cc.util.*;
import java.awt.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D?\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D?\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082D?\u0006\u0002\n\u0000?\u0006\u000f" }, d2 = { "Lcom/kisman/cc/features/module/Debug/GLScissorTest;", "Lcom/kisman/cc/features/module/Module;", "()V", "height", "", "opened", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "speed", "width", "y", "onRender", "", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "kisman.cc" })
public final class Class1016 extends Class42
{
    private final Class44 Field12413;
    private final Class44 Field12414;
    private final double Field12415 = 10.0;
    private final double Field12416 = 100.0;
    private final double Field12417 = 500.0;
    private String Field12418 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method4127(@NotNull @NotNull final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        Intrinsics.checkParameterIsNotNull((Object)renderGameOverlayEvent$Text, "event");
        Class753.drawRectWH(Double.longBitsToDouble((long)645984954 ^ 0x402400002680F2BAL), this.Field12415, Double.longBitsToDouble((long)1549862963 ^ 0x405900005C610833L), Double.longBitsToDouble((long)1496716806 ^ 0x402E000059361606L), -1);
        GL11.glPushMatrix();
        GL11.glEnable(3089);
        final ScaledResolution scaledResolution = new ScaledResolution(Method4128());
        scaledResolution.getScaleFactor();
        final double n = scaledResolution.getScaledHeight() - (this.Field12415 + Double.longBitsToDouble(4621819117588971520L)) - this.Field12417;
        final Class44 field12413 = this.Field12413;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12413, "opened");
        double n2;
        if (field12413.Method365()) {
            final double field12414 = this.Field12417;
            final double field12415 = this.Field12417;
            final Class44 field12416 = this.Field12414;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12416, "speed");
            n2 = Class230.Method1301(field12414, field12415, field12416.Method367());
        }
        else {
            final double n3 = 0.0;
            final double field12417 = this.Field12417;
            final Class44 field12418 = this.Field12414;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12418, "speed");
            n2 = Class230.Method1301(n3, field12417, field12418.Method367());
        }
        Class1893.Method7009(10, 10, (int)this.Field12416, (int)n2);
        final double n4 = 1.0;
        final double n5 = 1.0;
        final double longBitsToDouble = Double.longBitsToDouble(4648488871632306176L);
        final double longBitsToDouble2 = Double.longBitsToDouble((long)427367609 ^ 0x4082C00019791CB9L);
        final Color red = Color.RED;
        Intrinsics.checkExpressionValueIsNotNull((Object)red, "Color.RED");
        Class753.drawRectWH(n4, n5, longBitsToDouble, longBitsToDouble2, red.getRGB());
        GL11.glDisable(3089);
        GL11.glPopMatrix();
    }
    
    public Class1016() {
        super("GLScissorTest", "Test of GL11.glScissor() for gui animations.", Class97.Field8345);
        this.Field12413 = this.Method23(new Class44("Opened", this, true));
        this.Field12414 = this.Method23(new Class44("Speed", this, Double.longBitsToDouble((long)261955649 ^ 0x3FA999999604B9DBL), Double.longBitsToDouble(4576918229304087675L), Double.longBitsToDouble((long)165702367 ^ 0x3FC999999079F345L), false));
    }
    
    public static final Minecraft Method4128() {
        return Class42.Field8052;
    }
    
    public static final void Method4129(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3470 ^ 0x74));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
