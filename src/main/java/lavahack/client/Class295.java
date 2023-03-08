//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraftforge.client.event.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import com.kisman.cc.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u0012H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\r0\rX\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e?\u0006\u0002\n\u0000?\u0006\u0017" }, d2 = { "Lcom/kisman/cc/features/hud/modules/TextRadar;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "astolfo", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "color", "friendHighlight", "limit", "offsets", "range", "targetHighlight", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "toRender", "", "", "onEnable", "", "onRender", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "update", "kisman.cc" })
public final class Class295 extends Class1249
{
    private final Class44 Field9280;
    private final Class44 Field9281;
    private final Class44 Field9282;
    private final Class44 Field9283;
    private final Class44 Field9284;
    private final Class44 Field9285;
    private final Class44 Field9286;
    private final Class411 Field9287;
    private List Field9288;
    private String Field9289 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method38() {
        super.Method38();
        this.Field9287.Method2004();
        this.Field9288.clear();
    }
    
    public void Method45() {
        this.Field9287.Method2005((Runnable)new Class1945(this));
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method1547(@NotNull @NotNull final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        Intrinsics.checkParameterIsNotNull((Object)renderGameOverlayEvent$Text, "event");
        this.Method273(0.0);
        this.Method274(0.0);
        int n = 0;
        for (final String s : this.Field9288) {
            final double method267 = this.Method267();
            final double method268 = this.Method268();
            final int n2 = n;
            final int method269 = Class1178.Method4748();
            final Class44 field9280 = this.Field9280;
            Intrinsics.checkExpressionValueIsNotNull((Object)field9280, "offsets");
            final double n3 = method268 + n2 * (method269 + field9280.Method335());
            final Class44 field9281 = this.Field9281;
            Intrinsics.checkExpressionValueIsNotNull((Object)field9281, "astolfo");
            int n4;
            if (field9281.Method365()) {
                n4 = Class1172.Method4709(100, 100);
            }
            else {
                final Class44 field9282 = this.Field9282;
                Intrinsics.checkExpressionValueIsNotNull((Object)field9282, "color");
                final Class2027 method270 = field9282.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)method270, "color.colour");
                n4 = method270.Method3626();
            }
            Class1178.Method4745(s, method267, n3, n4);
            this.Method273(Class1047.Method4282(this.Method269(), (double)Class1178.Method4741(s)));
            final int n5 = n + 1;
            final int method271 = Class1178.Method4748();
            final Class44 field9283 = this.Field9280;
            Intrinsics.checkExpressionValueIsNotNull((Object)field9283, "offsets");
            this.Method274((double)(n5 * (method271 + field9283.Method335())));
            ++n;
        }
    }
    
    public Class295() {
        super("TextRadar", "troll hack moment :sunglasses:", true);
        this.Field9280 = this.Method23(new Class44("Offsets", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)90390130 ^ 0x4014000005633E72L), true));
        this.Field9281 = this.Method23(new Class44("Astolfo", (Class42)this, true));
        this.Field9282 = this.Method23(new Class44("Color", (Class42)this, new Class2027(255, 0, 0, 0)));
        this.Field9283 = this.Method23(new Class44("Limit", (Class42)this, Double.longBitsToDouble((long)163098745 ^ 0x4024000009B8B079L), 1.0, Double.longBitsToDouble(4636737291354636288L), true));
        this.Field9284 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble(4621819117588971520L), 1.0, Double.longBitsToDouble(4636737291354636288L), true));
        this.Field9285 = this.Method23(new Class44("Friend Highlight", (Class42)this, true));
        this.Field9286 = this.Method23(new Class44("Target Highlight", (Class42)this, true));
        this.Field9287 = this.Method54();
        this.Field9288 = new ArrayList();
    }
    
    public static final Minecraft Method1548() {
        return Class1249.Field13656;
    }
    
    public static final void Method1549(final Minecraft field13656) {
        Class1249.Field13656 = field13656;
    }
    
    public static final Class44 Method1550(final Class295 class295) {
        return class295.Field9284;
    }
    
    public static final Class44 Method1551(final Class295 class295) {
        return class295.Field9283;
    }
    
    public static final Class44 Method1552(final Class295 class295) {
        return class295.Field9285;
    }
    
    public static final Class44 Method1553(final Class295 class295) {
        return class295.Field9286;
    }
    
    public static final List Method1554(final Class295 class295) {
        return class295.Field9288;
    }
    
    public static final void Method1555(final Class295 class295, final List field9288) {
        class295.Field9288 = field9288;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7ABC ^ 0xE4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
