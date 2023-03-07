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
import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU;
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.fkTTLax3GqQNVxs965UlUc9rAN4iChSx$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0016\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2={"Lcom/kisman/cc/features/hud/modules/TwoBeeTwoTeeQueue;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "astolfo", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "color", "offsets", "prio", "prioValue", "", "regular", "regularValue", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "onEnable", "", "onRender", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "parseJson", "url", "Ljava/net/URL;", "params", "kisman.cc"})
public final class fkTTLax3GqQNVxs965UlUc9rAN4iChSx
extends qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12319 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Offsets", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x97B1A6432F52FC90L ^ 0xD7B1A6432F52FC90L), 0.0, Double.longBitsToDouble(0xC47C50A9C2AB6B34L ^ 0x846850A9C2AB6B34L), (boolean)((long)756988815 ^ (long)756988814)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12320 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Astolfo", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1650126432L ^ 0x625AEE61) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12321 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)1563284040 ^ (long)1563284151), (int)1318924718L ^ 0x4E9D3151, (int)((long)-755356081 ^ (long)-755355984), (int)729477914L ^ 0x2B7AF3E5)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12322 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Regular", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)730284765 ^ (long)730284764)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12323 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Prio", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1923928243L ^ 0x72ACD0B2) != 0));
    private final Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ Field12324;
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
        this.Field12324.Method2005(new fkTTLax3GqQNVxs965UlUc9rAN4iChSx$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this));
        int n = (int)((long)-106438112 ^ (long)-106438112);
        int n2 = (int)((long)-1170516978 ^ (long)-1170516978);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field12322;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"regular");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            int n3;
            String string = "Regular: " + TextFormatting.GRAY + this.Field12325;
            double d = this.Method267();
            double d2 = this.Method268();
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field12320;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"astolfo");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) {
                n3 = zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)132653702 ^ (long)132653727) << 2, ((int)-1945578440L ^ 0x8C08D421) << 2);
            } else {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field12321;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"color");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"color.colour");
                n3 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3626();
            }
            fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(string, d, d2, n3);
            int n4 = fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748();
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field12319;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"offsets");
            n += n4 + qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method335();
            n2 = fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741("Regular: " + this.Field12325);
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = this.Field12323;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"prio");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method365()) {
            int n5;
            String string = "Prio: " + TextFormatting.GRAY + this.Field12326;
            double d = this.Method267();
            double d3 = this.Method268() + (double)n;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = this.Field12320;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"astolfo");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method365()) {
                n5 = zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)974225900L ^ 0x3A1181F5) << 2, (int)((long)17480364 ^ (long)17480373) << 2);
            } else {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8 = this.Field12321;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8, (String)"color");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"color.colour");
                n5 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Method3626();
            }
            fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(string, d, d3, n5);
            n += fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748();
            n2 = HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU.Method4281(n2, fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741("Prio: " + this.Field12326));
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

    public fkTTLax3GqQNVxs965UlUc9rAN4iChSx() {
        super("2b2tQueue", "Shows regular/prio queues", ((int)-178622724L ^ 0xF55A6EFD) != 0);
        Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
        Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ2 = new Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ(this).Method2003();
        fkTTLax3GqQNVxs965UlUc9rAN4iChSx fkTTLax3GqQNVxs965UlUc9rAN4iChSx2 = this;
        int n = (int)-566764187L ^ 0xDE37DD65;
        int n2 = (int)((long)1823384694 ^ (long)1823384694);
        Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ3 = q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ2;
        int n3 = (int)((long)-1927708270 ^ (long)-1927708270);
        q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ3.Method2001().Method366(((int)860703894L ^ 0x334D4C97) != 0);
        fkTTLax3GqQNVxs965UlUc9rAN4iChSx2.Field12324 = q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ = q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ2;
        this.Field12325 = "Updating regular queue info";
        this.Field12326 = "Updating prio queue info";
    }

    public static final String Method4048(fkTTLax3GqQNVxs965UlUc9rAN4iChSx fkTTLax3GqQNVxs965UlUc9rAN4iChSx2) {
        return fkTTLax3GqQNVxs965UlUc9rAN4iChSx2.Field12325;
    }

    public static final void Method4049(fkTTLax3GqQNVxs965UlUc9rAN4iChSx fkTTLax3GqQNVxs965UlUc9rAN4iChSx2, String string) {
        fkTTLax3GqQNVxs965UlUc9rAN4iChSx2.Field12325 = string;
    }

    public static final String Method4050(fkTTLax3GqQNVxs965UlUc9rAN4iChSx fkTTLax3GqQNVxs965UlUc9rAN4iChSx2) {
        return fkTTLax3GqQNVxs965UlUc9rAN4iChSx2.Field12326;
    }

    public static final void Method4051(fkTTLax3GqQNVxs965UlUc9rAN4iChSx fkTTLax3GqQNVxs965UlUc9rAN4iChSx2, String string) {
        fkTTLax3GqQNVxs965UlUc9rAN4iChSx2.Field12326 = string;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)511258626 ^ (long)511258626);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1086434630L ^ 0x40C1ADB9);
            int n2 = ((int)-568597233L ^ 0xDE1BE56C) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)364504871L ^ 0x15B9EE18) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

