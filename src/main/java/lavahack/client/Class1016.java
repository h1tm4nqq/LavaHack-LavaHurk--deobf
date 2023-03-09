//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Class230;
import java.awt.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1893;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class753;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2={"Lcom/kisman/cc/features/module/Debug/GLScissorTest;", "Lcom/kisman/cc/features/module/Module;", "()V", "height", "", "opened", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "speed", "width", "y", "onRender", "", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "kisman.cc"})
public final class Class1016
extends Class42 {
    private final Class44 Field12413 = this.Method23(new Class44("Opened", (Class42)this, true));
    private final Class44 Field12414 = this.Method23(new Class44("Speed", (Class42)this, Double.longBitsToDouble((long)261955649 ^ 0x3FA999999604B9DBL), Double.longBitsToDouble(4576918229304087675L), Double.longBitsToDouble((long)165702367 ^ 0x3FC999999079F345L), false));
    private final double Field12415 = Double.longBitsToDouble(0x4024000000000000L);
    private final double Field12416 = Double.longBitsToDouble((long)2128199152 ^ 0x405900007ED9BDF0L);
    private final double Field12417 = Double.longBitsToDouble(4647503709213818880L);
    private String Field12418 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public final void Method4127(@NotNull @NotNull RenderGameOverlayEvent.Text text) {
        double d;
        Intrinsics.checkParameterIsNotNull((Object)text, (String)"event");
        Class753.drawRectWH(Double.longBitsToDouble((long)645984954 ^ 0x402400002680F2BAL), this.Field12415, Double.longBitsToDouble((long)1549862963 ^ 0x405900005C610833L), Double.longBitsToDouble((long)1496716806 ^ 0x402E000059361606L), -1);
        GL11.glPushMatrix();
        GL11.glEnable((int)3089);
        ScaledResolution scaledResolution = new ScaledResolution(Class1016.Method4128());
        int n = scaledResolution.getScaleFactor();
        double d2 = (double)scaledResolution.getScaledHeight() - (this.Field12415 + Double.longBitsToDouble(0x4024000000000000L)) - this.Field12417;
        Class44 class44 = this.Field12413;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"opened");
        if (class44.Method365()) {
            Class44 class442 = this.Field12414;
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"speed");
            d = Class230.Method1301(this.Field12417, this.Field12417, class442.Method367());
        } else {
            Class44 class443 = this.Field12414;
            Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"speed");
            d = Class230.Method1301(0.0, this.Field12417, class443.Method367());
        }
        double d3 = d;
        Class1893.Method7009(10, 10, (int)this.Field12416, (int)d3);
        double d4 = Double.longBitsToDouble(4648488871632306176L);
        double d5 = Double.longBitsToDouble((long)427367609 ^ 0x4082C00019791CB9L);
        Color color = Color.RED;
        Intrinsics.checkExpressionValueIsNotNull((Object)color, (String)"Color.RED");
        Class753.drawRectWH(1.0, 1.0, d4, d5, color.getRGB());
        GL11.glDisable((int)3089);
        GL11.glPopMatrix();
    }

    public Class1016() {
        super("GLScissorTest", "Test of GL11.glScissor() for gui animations.", Class97.Field8345);
    }

    public static final Minecraft Method4128() {
        return Class42.Field8052;
    }

    public static final void Method4129(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 116;
            cArray2[n] = (char)(cArray[n] ^ (0x3470 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

