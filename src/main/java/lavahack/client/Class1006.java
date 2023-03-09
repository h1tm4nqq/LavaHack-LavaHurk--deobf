/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.kisman.cc.util.Class2027;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1047;
import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class1249;
import lavahack.client.Class411;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class660;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0016\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2={"Lcom/kisman/cc/features/hud/modules/TwoBeeTwoTeeQueue;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "astolfo", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "color", "offsets", "prio", "prioValue", "", "regular", "regularValue", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "onEnable", "", "onRender", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "parseJson", "url", "Ljava/net/URL;", "params", "kisman.cc"})
public final class Class1006
extends Class1249 {
    private final Class44 Field12319 = this.Method23(new Class44("Offsets", (Class42)this, Double.longBitsToDouble(0x4000000000000000L), 0.0, Double.longBitsToDouble(0x4014000000000000L), true));
    private final Class44 Field12320 = this.Method23(new Class44("Astolfo", (Class42)this, true));
    private final Class44 Field12321 = this.Method23(new Class44("Color", (Class42)this, new Class2027(255, 255, 255, 255)));
    private final Class44 Field12322 = this.Method23(new Class44("Regular", (Class42)this, true));
    private final Class44 Field12323 = this.Method23(new Class44("Prio", (Class42)this, true));
    private final Class411 Field12324;
    private String Field12325;
    private String Field12326;
    private String Field12327 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        this.Field12324.Method2004();
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method4046(@NotNull @NotNull RenderGameOverlayEvent.Text text) {
        Intrinsics.checkParameterIsNotNull((Object)text, (String)"event");
        this.Field12324.Method2005(new Class660(this));
        int n = 0;
        int n2 = 0;
        Class44 class44 = this.Field12322;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"regular");
        if (class44.Method365()) {
            int n3;
            String string = "Regular: " + TextFormatting.GRAY + this.Field12325;
            double d = this.Method267();
            double d2 = this.Method268();
            Class44 class442 = this.Field12320;
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"astolfo");
            if (class442.Method365()) {
                n3 = Class1172.Method4709(100, 100);
            } else {
                Class44 class443 = this.Field12321;
                Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"color");
                Class2027 class2027 = class443.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"color.colour");
                n3 = class2027.Method3626();
            }
            Class1178.Method4745(string, d, d2, n3);
            int n4 = Class1178.Method4748();
            Class44 class444 = this.Field12319;
            Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"offsets");
            n += n4 + class444.Method335();
            n2 = Class1178.Method4741("Regular: " + this.Field12325);
        }
        Class44 class445 = this.Field12323;
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"prio");
        if (class445.Method365()) {
            int n5;
            String string = "Prio: " + TextFormatting.GRAY + this.Field12326;
            double d = this.Method267();
            double d3 = this.Method268() + (double)n;
            Class44 class446 = this.Field12320;
            Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"astolfo");
            if (class446.Method365()) {
                n5 = Class1172.Method4709(100, 100);
            } else {
                Class44 class447 = this.Field12321;
                Intrinsics.checkExpressionValueIsNotNull((Object)class447, (String)"color");
                Class2027 class2027 = class447.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"color.colour");
                n5 = class2027.Method3626();
            }
            Class1178.Method4745(string, d, d3, n5);
            n += Class1178.Method4748();
            n2 = Class1047.Method4281(n2, Class1178.Method4741("Prio: " + this.Field12326));
        }
        this.Method273(n2);
        this.Method274(n);
    }

    @NotNull
    @NotNull
    public final String Method4047(@NotNull @NotNull URL uRL, @NotNull @NotNull String string) throws IOException {
        JsonElement jsonElement;
        Intrinsics.checkParameterIsNotNull((Object)uRL, (String)"url");
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"params");
        URLConnection uRLConnection = uRL.openConnection();
        if (uRLConnection == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRLConnection;
        httpURLConnection.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
        httpURLConnection.connect();
        JsonParser jsonParser = new JsonParser();
        JsonElement jsonElement2 = jsonElement = jsonParser.parse(new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream())));
        Intrinsics.checkExpressionValueIsNotNull((Object)jsonElement2, (String)"root");
        JsonObject jsonObject = jsonElement2.getAsJsonObject();
        JsonElement jsonElement3 = jsonObject.get(string);
        Intrinsics.checkExpressionValueIsNotNull((Object)jsonElement3, (String)"`object`.get(params)");
        String string2 = jsonElement3.getAsString();
        Intrinsics.checkExpressionValueIsNotNull((Object)string2, (String)"`object`.get(params).asString");
        return string2;
    }

    public Class1006() {
        super("2b2tQueue", "Shows regular/prio queues", true);
        Class411 class411;
        Class411 class4112 = new Class411(this).Method2003();
        Class1006 class1006 = this;
        boolean bl = false;
        boolean bl2 = false;
        Class411 class4113 = class4112;
        boolean bl3 = false;
        class4113.Method2001().Method366(true);
        class1006.Field12324 = class411 = class4112;
        this.Field12325 = "Updating regular queue info";
        this.Field12326 = "Updating prio queue info";
    }

    public static final String Method4048(Class1006 class1006) {
        return class1006.Field12325;
    }

    public static final void Method4049(Class1006 class1006, String string) {
        class1006.Field12325 = string;
    }

    public static final String Method4050(Class1006 class1006) {
        return class1006.Field12326;
    }

    public static final void Method4051(Class1006 class1006, String string) {
        class1006.Field12326 = string;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 198;
            cArray2[n] = (char)(cArray[n] ^ (0x127E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

