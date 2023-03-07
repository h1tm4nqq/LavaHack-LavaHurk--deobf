/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU;
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u0012H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2={"Lcom/kisman/cc/features/hud/modules/TextRadar;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "astolfo", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "color", "friendHighlight", "limit", "offsets", "range", "targetHighlight", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "toRender", "", "", "onEnable", "", "onRender", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "update", "kisman.cc"})
public final class yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7
extends qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9280 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Offsets", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)90390130 ^ 0x4014000005633E72L), ((int)190609425L ^ 0xB5C7810) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9281 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Astolfo", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)268396524 ^ (long)268396525)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9282 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)-455876727L ^ 0xE4D3DF76, (int)1130049142L ^ 0x435B2E76, (int)((long)-1610179406 ^ (long)-1610179406), (int)((long)309005354 ^ (long)309005354))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9283 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Limit", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)163098745 ^ 0x4024000009B8B079L), 1.0, Double.longBitsToDouble(0xD5415859C885B1DDL ^ 0x95185859C885B1DDL), ((int)222042738L ^ 0xD3C1A73) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9284 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x6AFE6B252E87B88AL ^ 0x2ADA6B252E87B88AL), 1.0, Double.longBitsToDouble(0x2329CDD932E51CEAL ^ 0x6370CDD932E51CEAL), (boolean)((long)1061324864 ^ (long)1061324865)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9285 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Friend Highlight", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1994653082 ^ (long)-1994653081)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9286 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Target Highlight", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1021707410L ^ 0xC319FB6F) != 0));
    private final Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ Field9287 = this.Method54();
    private List Field9288;
    private String Field9289 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        this.Field9287.Method2004();
        this.Field9288.clear();
    }

    @Override
    public void Method45() {
        this.Field9287.Method2005(new yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this));
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method1547(@NotNull @NotNull RenderGameOverlayEvent.Text text) {
        Intrinsics.checkParameterIsNotNull((Object)text, (String)"event");
        this.Method273(0.0);
        this.Method274(0.0);
        int n = (int)-1099060210L ^ 0xBE7DAC0E;
        Iterator iterator = ((Iterable)this.Field9288).iterator();
        while (iterator.hasNext()) {
            int n2;
            String string = (String)iterator.next();
            double d = this.Method267();
            double d2 = this.Method268();
            int n3 = fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748();
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field9280;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"offsets");
            double d3 = d2 + (double)(n * (n3 + qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335()));
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field9281;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"astolfo");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) {
                n2 = zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)372515572 ^ (long)372515565) << 2, (int)((long)-935691534 ^ (long)-935691541) << 2);
            } else {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field9282;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"color");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"color.colour");
                n2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3626();
            }
            fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(string, d, d3, n2);
            this.Method273(HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU.Method4282(this.Method269(), fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(string)));
            int n4 = n + (int)((long)956775060 ^ (long)956775061);
            int n5 = fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748();
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field9280;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"offsets");
            this.Method274(n4 * (n5 + qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method335()));
            ++n;
        }
    }

    public yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7() {
        super("TextRadar", "troll hack moment :sunglasses:", ((int)-1310987421L ^ 0xB1DBEB62) != 0);
        List list;
        yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7 yfIb7cpKDRJSSAnlQISuS3ekytKO7VO72 = this;
        int n = (int)-843302092L ^ 0xCDBC3B34;
        yfIb7cpKDRJSSAnlQISuS3ekytKO7VO72.Field9288 = list = (List)new ArrayList();
    }

    public static final Minecraft Method1548() {
        return qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2.Field13656;
    }

    public static final void Method1549(Minecraft minecraft) {
        qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2.Field13656 = minecraft;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method1550(yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7 yfIb7cpKDRJSSAnlQISuS3ekytKO7VO72) {
        return yfIb7cpKDRJSSAnlQISuS3ekytKO7VO72.Field9284;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method1551(yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7 yfIb7cpKDRJSSAnlQISuS3ekytKO7VO72) {
        return yfIb7cpKDRJSSAnlQISuS3ekytKO7VO72.Field9283;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method1552(yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7 yfIb7cpKDRJSSAnlQISuS3ekytKO7VO72) {
        return yfIb7cpKDRJSSAnlQISuS3ekytKO7VO72.Field9285;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method1553(yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7 yfIb7cpKDRJSSAnlQISuS3ekytKO7VO72) {
        return yfIb7cpKDRJSSAnlQISuS3ekytKO7VO72.Field9286;
    }

    public static final List Method1554(yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7 yfIb7cpKDRJSSAnlQISuS3ekytKO7VO72) {
        return yfIb7cpKDRJSSAnlQISuS3ekytKO7VO72.Field9288;
    }

    public static final void Method1555(yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7 yfIb7cpKDRJSSAnlQISuS3ekytKO7VO72, List list) {
        yfIb7cpKDRJSSAnlQISuS3ekytKO7VO72.Field9288 = list;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1419290882 ^ (long)1419290882);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)626273542L ^ 0x25542DF9);
            int n2 = (int)((long)-657324167 ^ (long)-657324224) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1162349507 ^ (long)1162351980) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

