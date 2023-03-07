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
import lavahack.client.HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00140\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2={"Lcom/kisman/cc/features/hud/modules/Coords;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "astolfo", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "coordSpoof", "nPosX", "", "nPosZ", "offsets", "posX", "posY", "posZ", "random", "Ljava/util/Random;", "rotationSpoof", "showCoords", "showRotation", "spoofs", "Lcom/kisman/cc/settings/types/SettingGroup;", "nextFloat", "", "coords", "", "onRender", "", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "kisman.cc"})
public final class XougVuvEqVieqZeOMmHPA5xBl85zbd78
extends qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 {
    private int Field11046;
    private int Field11047;
    private int Field11048;
    private int Field11049;
    private int Field11050;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11051 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Astolfo", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-331991674L ^ 0xEC363587) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11052 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Show Coords", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)513749024 ^ (long)513749025)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11053 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Show Rotation", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-535376896L ^ 0xE016CC01) != 0));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field11054 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Spoofs", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11055 = this.Method23(this.Field11054.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Coord Spoof", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)678265756L ^ 0x286D839C) != 0)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11056 = this.Method23(this.Field11054.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotation Spoof", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1381945748 ^ (long)-1381945748))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11057 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Offsets", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)731283192 ^ 0x401400002B967EF8L), ((int)2008427981L ^ 0x77B62DCC) != 0));
    private final Random Field11058 = new Random();
    private String Field11059 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public final void Method3002(@NotNull @NotNull RenderGameOverlayEvent.Text text) {
        String string;
        Intrinsics.checkParameterIsNotNull((Object)text, (String)"event");
        if (XougVuvEqVieqZeOMmHPA5xBl85zbd78.Method3004().player.dimension == 0) {
            this.Field11046 = (int)XougVuvEqVieqZeOMmHPA5xBl85zbd78.Method3004().player.posX;
            this.Field11047 = (int)XougVuvEqVieqZeOMmHPA5xBl85zbd78.Method3004().player.posZ;
            this.Field11048 = (int)(XougVuvEqVieqZeOMmHPA5xBl85zbd78.Method3004().player.posX / (double)((int)((long)-1760284551 ^ (long)-1760284552) << 3));
            this.Field11049 = (int)(XougVuvEqVieqZeOMmHPA5xBl85zbd78.Method3004().player.posZ / (double)((int)((long)-813363622 ^ (long)-813363621) << 3));
        } else if (XougVuvEqVieqZeOMmHPA5xBl85zbd78.Method3004().player.dimension == (int)((long)1314521371 ^ (long)-1314521372)) {
            this.Field11046 = (int)XougVuvEqVieqZeOMmHPA5xBl85zbd78.Method3004().player.posX;
            this.Field11047 = (int)XougVuvEqVieqZeOMmHPA5xBl85zbd78.Method3004().player.posZ;
            this.Field11048 = (int)(XougVuvEqVieqZeOMmHPA5xBl85zbd78.Method3004().player.posX * (double)(((int)-1650791192L ^ 0x9D9AECE9) << 3));
            this.Field11049 = (int)(XougVuvEqVieqZeOMmHPA5xBl85zbd78.Method3004().player.posZ * (double)(((int)-529309377L ^ 0xE073613E) << 3));
        }
        this.Field11050 = (int)XougVuvEqVieqZeOMmHPA5xBl85zbd78.Method3004().player.posY;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field11051;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"astolfo");
        int n = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365() ? zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)-1916974592 ^ (long)-1916974567) << 2, ((int)-1653033740L ^ 0x9D78B4ED) << 2) : (int)((long)-677532939 ^ (long)677532938);
        double d = 0.0;
        double d2 = 0.0;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field11052;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"showCoords");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) {
            string = TextFormatting.RESET + ((int)((long)-1337996166 ^ (long)-1337996175) << 3) + TextFormatting.GRAY + ": " + ((int)((long)636019339 ^ (long)636019342) << 3) + TextFormatting.RESET + (int)((float)this.Field11046 * this.Method3003(((int)669051763L ^ 0x27E0EB72) != 0)) + TextFormatting.GRAY + ")[" + TextFormatting.RESET + (int)((float)this.Field11048 * this.Method3003(((int)103259497L ^ 0x6279D68) != 0)) + TextFormatting.GRAY + "] " + TextFormatting.RESET + (char)((long)-1103456000 ^ (long)-1103455911) + TextFormatting.GRAY + ": " + (((int)-1737954835L ^ 0x9868E9E8) << 3) + TextFormatting.RESET + (int)((float)this.Field11050 * this.Method3003(((int)1496072046L ^ 0x592C3F6F) != 0)) + TextFormatting.GRAY + ") " + TextFormatting.RESET + ((int)((long)-1269518025 ^ (long)-1269518054) << 1) + TextFormatting.GRAY + ": " + ((int)((long)191955415 ^ (long)191955410) << 3) + TextFormatting.RESET + (int)((float)this.Field11047 * this.Method3003(((int)1212805862L ^ 0x4849F2E7) != 0)) + TextFormatting.GRAY + ")[" + TextFormatting.RESET + (int)((float)this.Field11049 * this.Method3003((boolean)((long)208337218 ^ (long)208337219))) + TextFormatting.GRAY + (char)((int)-1240802477L ^ 0xB60ADB0E);
            double d3 = fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(string);
            int n2 = (int)-587238021L ^ 0xDCFF757B;
            d = Math.max(d, d3);
            fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(string, this.Method267(), this.Method268() + this.Method270() - (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748(), n);
            int n3 = fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748();
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field11057;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"offsets");
            d2 += (double)(n3 + qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method335());
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field11053;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"showRotation");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365()) {
            string = TextFormatting.RESET + "Yaw" + TextFormatting.GRAY + ": " + (char)((int)-976204714L ^ 0xC5D04C0D) + TextFormatting.RESET + (int)(MathHelper.wrapDegrees((float)XougVuvEqVieqZeOMmHPA5xBl85zbd78.Method3004().player.rotationYaw) * this.Method3003((boolean)((long)-1468011876 ^ (long)-1468011876))) + TextFormatting.GRAY + "] " + TextFormatting.RESET + "Pitch" + TextFormatting.GRAY + ": " + (char)((long)-1967949976 ^ (long)-1967950029) + TextFormatting.RESET + (int)(XougVuvEqVieqZeOMmHPA5xBl85zbd78.Method3004().player.rotationPitch * this.Method3003((boolean)((long)658162152 ^ (long)658162152))) + TextFormatting.GRAY + (char)((int)1300547618L ^ 0x4D84C87F);
            d = HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU.Method4282(d, fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(string));
            fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(string, this.Method267(), this.Method268() + this.Method270() - (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() - d2, n);
            d2 += (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748();
        }
        this.Method273(d);
        this.Method274(d2);
    }

    private final float Method3003(boolean bl) {
        block3: {
            block2: {
                if (!bl) break block2;
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field11052;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"showCoords");
                if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) break block2;
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field11055;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"coordSpoof");
                if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) break block3;
            }
            if (bl) return 1.0f;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field11053;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"showRotation");
            if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365()) return 1.0f;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field11056;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"rotationSpoof");
            if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365()) return 1.0f;
        }
        float f = this.Field11058.nextFloat();
        return f;
    }

    public XougVuvEqVieqZeOMmHPA5xBl85zbd78() {
        super("Coords", "Show your current coords, rotations", (boolean)((long)-576076484 ^ (long)-576076483));
    }

    public static final Minecraft Method3004() {
        return qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2.Field13656;
    }

    public static final void Method3005(Minecraft minecraft) {
        qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2.Field13656 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1625965454 ^ (long)1625965454);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1081274297L ^ 0xBF8D10B8);
            int n2 = (int)-1720559181L ^ 0x9972599C;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1400401333L ^ 0xAC878724) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

