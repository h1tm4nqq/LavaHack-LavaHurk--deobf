//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import java.util.*;
import net.minecraftforge.client.event.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.util.text.*;
import net.minecraft.util.math.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00140\u0014X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u001d" }, d2 = { "Lcom/kisman/cc/features/hud/modules/Coords;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "astolfo", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "coordSpoof", "nPosX", "", "nPosZ", "offsets", "posX", "posY", "posZ", "random", "Ljava/util/Random;", "rotationSpoof", "showCoords", "showRotation", "spoofs", "Lcom/kisman/cc/settings/types/SettingGroup;", "nextFloat", "", "coords", "", "onRender", "", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "kisman.cc" })
public final class Class715 extends Class1249
{
    private int Field11046;
    private int Field11047;
    private int Field11048;
    private int Field11049;
    private int Field11050;
    private final Class44 Field11051;
    private final Class44 Field11052;
    private final Class44 Field11053;
    private final Class1996 Field11054;
    private final Class44 Field11055;
    private final Class44 Field11056;
    private final Class44 Field11057;
    private final Random Field11058;
    private String Field11059 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method3002(@NotNull @NotNull final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        Intrinsics.checkParameterIsNotNull((Object)renderGameOverlayEvent$Text, "event");
        if (Method3004().player.dimension == 0) {
            this.Field11046 = (int)Method3004().player.posX;
            this.Field11047 = (int)Method3004().player.posZ;
            this.Field11048 = (int)(Method3004().player.posX / 8);
            this.Field11049 = (int)(Method3004().player.posZ / 8);
        }
        else if (Method3004().player.dimension == -1) {
            this.Field11046 = (int)Method3004().player.posX;
            this.Field11047 = (int)Method3004().player.posZ;
            this.Field11048 = (int)(Method3004().player.posX * 8);
            this.Field11049 = (int)(Method3004().player.posZ * 8);
        }
        this.Field11050 = (int)Method3004().player.posY;
        final Class44 field11051 = this.Field11051;
        Intrinsics.checkExpressionValueIsNotNull((Object)field11051, "astolfo");
        final int n = field11051.Method365() ? Class1172.Method4709(100, 100) : -1;
        double a = 0.0;
        double n2 = 0.0;
        final Class44 field11052 = this.Field11052;
        Intrinsics.checkExpressionValueIsNotNull((Object)field11052, "showCoords");
        if (field11052.Method365()) {
            final String string = new StringBuilder().append(TextFormatting.RESET).append('X').append(TextFormatting.GRAY).append(": ").append('(').append(TextFormatting.RESET).append((int)(this.Field11046 * this.Method3003(true))).append(TextFormatting.GRAY).append(")[").append(TextFormatting.RESET).append((int)(this.Field11048 * this.Method3003(true))).append(TextFormatting.GRAY).append("] ").append(TextFormatting.RESET).append('Y').append(TextFormatting.GRAY).append(": ").append('(').append(TextFormatting.RESET).append((int)(this.Field11050 * this.Method3003(true))).append(TextFormatting.GRAY).append(") ").append(TextFormatting.RESET).append('Z').append(TextFormatting.GRAY).append(": ").append('(').append(TextFormatting.RESET).append((int)(this.Field11047 * this.Method3003(true))).append(TextFormatting.GRAY).append(")[").append(TextFormatting.RESET).append((int)(this.Field11049 * this.Method3003(true))).append(TextFormatting.GRAY).append(']').toString();
            a = Math.max(a, Class1178.Method4741(string));
            Class1178.Method4745(string, this.Method267(), this.Method268() + this.Method270() - Class1178.Method4748(), n);
            final double n3 = n2;
            final int method4748 = Class1178.Method4748();
            final Class44 field11053 = this.Field11057;
            Intrinsics.checkExpressionValueIsNotNull((Object)field11053, "offsets");
            n2 = n3 + (method4748 + field11053.Method335());
        }
        final Class44 field11054 = this.Field11053;
        Intrinsics.checkExpressionValueIsNotNull((Object)field11054, "showRotation");
        if (field11054.Method365()) {
            final String string2 = TextFormatting.RESET + "Yaw" + TextFormatting.GRAY + ": " + '[' + TextFormatting.RESET + (int)(MathHelper.wrapDegrees(Method3004().player.rotationYaw) * this.Method3003(false)) + TextFormatting.GRAY + "] " + TextFormatting.RESET + "Pitch" + TextFormatting.GRAY + ": " + '[' + TextFormatting.RESET + (int)(Method3004().player.rotationPitch * this.Method3003(false)) + TextFormatting.GRAY + ']';
            a = Class1047.Method4282(a, (double)Class1178.Method4741(string2));
            Class1178.Method4745(string2, this.Method267(), this.Method268() + this.Method270() - Class1178.Method4748() - n2, n);
            n2 += Class1178.Method4748();
        }
        this.Method273(a);
        this.Method274(n2);
    }
    
    private final float Method3003(final boolean b) {
        if (b) {
            final Class44 field11052 = this.Field11052;
            Intrinsics.checkExpressionValueIsNotNull((Object)field11052, "showCoords");
            if (field11052.Method365()) {
                final Class44 field11053 = this.Field11055;
                Intrinsics.checkExpressionValueIsNotNull((Object)field11053, "coordSpoof");
                if (field11053.Method365()) {
                    return this.Field11058.nextFloat();
                }
            }
        }
        if (!b) {
            final Class44 field11054 = this.Field11053;
            Intrinsics.checkExpressionValueIsNotNull((Object)field11054, "showRotation");
            if (field11054.Method365()) {
                final Class44 field11055 = this.Field11056;
                Intrinsics.checkExpressionValueIsNotNull((Object)field11055, "rotationSpoof");
                if (field11055.Method365()) {
                    return this.Field11058.nextFloat();
                }
            }
        }
        return 1.0f;
        nextFloat = this.Field11058.nextFloat();
        return nextFloat;
    }
    
    public Class715() {
        super("Coords", "Show your current coords, rotations", true);
        this.Field11051 = this.Method23(new Class44("Astolfo", (Class42)this, true));
        this.Field11052 = this.Method23(new Class44("Show Coords", (Class42)this, true));
        this.Field11053 = this.Method23(new Class44("Show Rotation", (Class42)this, true));
        this.Field11054 = this.Method24(new Class1996(new Class44("Spoofs", (Class42)this)));
        this.Field11055 = this.Method23(this.Field11054.Method7405(new Class44("Coord Spoof", (Class42)this, false)));
        this.Field11056 = this.Method23(this.Field11054.Method7405(new Class44("Rotation Spoof", (Class42)this, false)));
        this.Field11057 = this.Method23(new Class44("Offsets", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)731283192 ^ 0x401400002B967EF8L), true));
        this.Field11058 = new Random();
    }
    
    public static final Minecraft Method3004() {
        return Class1249.Field13656;
    }
    
    public static final void Method3005(final Minecraft field13656) {
        Class1249.Field13656 = field13656;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x55BC ^ 0x2F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
