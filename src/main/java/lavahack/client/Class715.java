//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1047;
import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class1249;
import lavahack.client.Class1996;
import lavahack.client.Class42;
import lavahack.client.Class44;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00140\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2={"Lcom/kisman/cc/features/hud/modules/Coords;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "astolfo", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "coordSpoof", "nPosX", "", "nPosZ", "offsets", "posX", "posY", "posZ", "random", "Ljava/util/Random;", "rotationSpoof", "showCoords", "showRotation", "spoofs", "Lcom/kisman/cc/settings/types/SettingGroup;", "nextFloat", "", "coords", "", "onRender", "", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "kisman.cc"})
public final class Class715
extends Class1249 {
    private int Field11046;
    private int Field11047;
    private int Field11048;
    private int Field11049;
    private int Field11050;
    private final Class44 Field11051 = this.Method23(new Class44("Astolfo", (Class42)this, true));
    private final Class44 Field11052 = this.Method23(new Class44("Show Coords", (Class42)this, true));
    private final Class44 Field11053 = this.Method23(new Class44("Show Rotation", (Class42)this, true));
    private final Class1996 Field11054 = this.Method24(new Class1996(new Class44("Spoofs", this)));
    private final Class44 Field11055 = this.Method23(this.Field11054.Method7405(new Class44("Coord Spoof", (Class42)this, false)));
    private final Class44 Field11056 = this.Method23(this.Field11054.Method7405(new Class44("Rotation Spoof", (Class42)this, false)));
    private final Class44 Field11057 = this.Method23(new Class44("Offsets", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)731283192 ^ 0x401400002B967EF8L), true));
    private final Random Field11058 = new Random();
    private String Field11059 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public final void Method3002(@NotNull @NotNull RenderGameOverlayEvent.Text text) {
        String string;
        Intrinsics.checkParameterIsNotNull((Object)text, (String)"event");
        if (Class715.Method3004().player.dimension == 0) {
            this.Field11046 = (int)Class715.Method3004().player.posX;
            this.Field11047 = (int)Class715.Method3004().player.posZ;
            this.Field11048 = (int)(Class715.Method3004().player.posX / (double)8);
            this.Field11049 = (int)(Class715.Method3004().player.posZ / (double)8);
        } else if (Class715.Method3004().player.dimension == -1) {
            this.Field11046 = (int)Class715.Method3004().player.posX;
            this.Field11047 = (int)Class715.Method3004().player.posZ;
            this.Field11048 = (int)(Class715.Method3004().player.posX * (double)8);
            this.Field11049 = (int)(Class715.Method3004().player.posZ * (double)8);
        }
        this.Field11050 = (int)Class715.Method3004().player.posY;
        Class44 class44 = this.Field11051;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"astolfo");
        int n = class44.Method365() ? Class1172.Method4709(100, 100) : -1;
        double d = 0.0;
        double d2 = 0.0;
        Class44 class442 = this.Field11052;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"showCoords");
        if (class442.Method365()) {
            string = TextFormatting.RESET + 'X' + TextFormatting.GRAY + ": " + '(' + TextFormatting.RESET + (int)((float)this.Field11046 * this.Method3003(true)) + TextFormatting.GRAY + ")[" + TextFormatting.RESET + (int)((float)this.Field11048 * this.Method3003(true)) + TextFormatting.GRAY + "] " + TextFormatting.RESET + 'Y' + TextFormatting.GRAY + ": " + '(' + TextFormatting.RESET + (int)((float)this.Field11050 * this.Method3003(true)) + TextFormatting.GRAY + ") " + TextFormatting.RESET + 'Z' + TextFormatting.GRAY + ": " + '(' + TextFormatting.RESET + (int)((float)this.Field11047 * this.Method3003(true)) + TextFormatting.GRAY + ")[" + TextFormatting.RESET + (int)((float)this.Field11049 * this.Method3003(true)) + TextFormatting.GRAY + ']';
            double d3 = Class1178.Method4741(string);
            boolean bl = false;
            d = Math.max(d, d3);
            Class1178.Method4745(string, this.Method267(), this.Method268() + this.Method270() - (double)Class1178.Method4748(), n);
            int n2 = Class1178.Method4748();
            Class44 class443 = this.Field11057;
            Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"offsets");
            d2 += (double)(n2 + class443.Method335());
        }
        Class44 class444 = this.Field11053;
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"showRotation");
        if (class444.Method365()) {
            string = TextFormatting.RESET + "Yaw" + TextFormatting.GRAY + ": " + '[' + TextFormatting.RESET + (int)(MathHelper.wrapDegrees((float)Class715.Method3004().player.rotationYaw) * this.Method3003(false)) + TextFormatting.GRAY + "] " + TextFormatting.RESET + "Pitch" + TextFormatting.GRAY + ": " + '[' + TextFormatting.RESET + (int)(Class715.Method3004().player.rotationPitch * this.Method3003(false)) + TextFormatting.GRAY + ']';
            d = Class1047.Method4282(d, Class1178.Method4741(string));
            Class1178.Method4745(string, this.Method267(), this.Method268() + this.Method270() - (double)Class1178.Method4748() - d2, n);
            d2 += (double)Class1178.Method4748();
        }
        this.Method273(d);
        this.Method274(d2);
    }

    private final float Method3003(boolean bl) {
        block3: {
            block2: {
                if (!bl) break block2;
                Class44 class44 = this.Field11052;
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"showCoords");
                if (!class44.Method365()) break block2;
                Class44 class442 = this.Field11055;
                Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"coordSpoof");
                if (class442.Method365()) break block3;
            }
            if (bl) return 1.0f;
            Class44 class44 = this.Field11053;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"showRotation");
            if (!class44.Method365()) return 1.0f;
            Class44 class443 = this.Field11056;
            Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"rotationSpoof");
            if (!class443.Method365()) return 1.0f;
        }
        float f = this.Field11058.nextFloat();
        return f;
    }

    public Class715() {
        super("Coords", "Show your current coords, rotations", true);
    }

    public static final Minecraft Method3004() {
        return Class1249.Field13656;
    }

    public static final void Method3005(Minecraft minecraft) {
        Class1249.Field13656 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 47;
            cArray2[n] = (char)(cArray[n] ^ (0x55BC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

