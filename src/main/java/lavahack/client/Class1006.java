//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.util.text.*;
import com.kisman.cc.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import kotlin.*;
import java.net.*;
import com.google.gson.*;
import java.io.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0016\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0018" }, d2 = { "Lcom/kisman/cc/features/hud/modules/TwoBeeTwoTeeQueue;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "astolfo", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "color", "offsets", "prio", "prioValue", "", "regular", "regularValue", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "onEnable", "", "onRender", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "parseJson", "url", "Ljava/net/URL;", "params", "kisman.cc" })
public final class Class1006 extends Class1249
{
    private final Class44 Field12319;
    private final Class44 Field12320;
    private final Class44 Field12321;
    private final Class44 Field12322;
    private final Class44 Field12323;
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
    public final void Method4046(@NotNull @NotNull final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        Intrinsics.checkParameterIsNotNull((Object)renderGameOverlayEvent$Text, "event");
        this.Field12324.Method2005(new Class660(this));
        int n = 0;
        int n2 = 0;
        final Class44 field12322 = this.Field12322;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12322, "regular");
        if (field12322.Method365()) {
            final String string = "Regular: " + TextFormatting.GRAY + this.Field12325;
            final double method267 = this.Method267();
            final double method268 = this.Method268();
            final Class44 field12323 = this.Field12320;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12323, "astolfo");
            int n3;
            if (field12323.Method365()) {
                n3 = Class1172.Method4709(100, 100);
            }
            else {
                final Class44 field12324 = this.Field12321;
                Intrinsics.checkExpressionValueIsNotNull((Object)field12324, "color");
                final Class2027 method269 = field12324.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)method269, "color.colour");
                n3 = method269.Method3626();
            }
            Class1178.Method4745(string, method267, method268, n3);
            final int n4 = n;
            final int method270 = Class1178.Method4748();
            final Class44 field12325 = this.Field12319;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12325, "offsets");
            n = n4 + (method270 + field12325.Method335());
            n2 = Class1178.Method4741("Regular: " + this.Field12325);
        }
        final Class44 field12326 = this.Field12323;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12326, "prio");
        if (field12326.Method365()) {
            final String string2 = "Prio: " + TextFormatting.GRAY + this.Field12326;
            final double method271 = this.Method267();
            final double n5 = this.Method268() + n;
            final Class44 field12327 = this.Field12320;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12327, "astolfo");
            int n6;
            if (field12327.Method365()) {
                n6 = Class1172.Method4709(100, 100);
            }
            else {
                final Class44 field12328 = this.Field12321;
                Intrinsics.checkExpressionValueIsNotNull((Object)field12328, "color");
                final Class2027 method272 = field12328.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)method272, "color.colour");
                n6 = method272.Method3626();
            }
            Class1178.Method4745(string2, method271, n5, n6);
            n += Class1178.Method4748();
            n2 = Class1047.Method4281(n2, Class1178.Method4741("Prio: " + this.Field12326));
        }
        this.Method273(n2);
        this.Method274(n);
    }
    
    @NotNull
    @NotNull
    public final String Method4047(@NotNull @NotNull final URL url, @NotNull @NotNull final String s) throws IOException {
        Intrinsics.checkParameterIsNotNull((Object)url, "url");
        Intrinsics.checkParameterIsNotNull((Object)s, "params");
        final URLConnection openConnection = url.openConnection();
        if (openConnection == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        final HttpURLConnection httpURLConnection = (HttpURLConnection)openConnection;
        httpURLConnection.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
        httpURLConnection.connect();
        final JsonElement parse = new JsonParser().parse((Reader)new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream())));
        Intrinsics.checkExpressionValueIsNotNull((Object)parse, "root");
        final JsonElement value = parse.getAsJsonObject().get(s);
        Intrinsics.checkExpressionValueIsNotNull((Object)value, "`object`.get(params)");
        final String asString = value.getAsString();
        Intrinsics.checkExpressionValueIsNotNull((Object)asString, "`object`.get(params).asString");
        return asString;
    }
    
    public Class1006() {
        super("2b2tQueue", "Shows regular/prio queues", true);
        this.Field12319 = this.Method23(new Class44("Offsets", this, Double.longBitsToDouble(4611686018427387904L), 0.0, Double.longBitsToDouble(4617315517961601024L), true));
        this.Field12320 = this.Method23(new Class44("Astolfo", this, true));
        this.Field12321 = this.Method23(new Class44("Color", this, new Class2027(255, 255, 255, 255)));
        this.Field12322 = this.Method23(new Class44("Regular", this, true));
        this.Field12323 = this.Method23(new Class44("Prio", this, true));
        final Class411 method2003 = new Class411(this).Method2003();
        method2003.Method2001().Method366(true);
        this.Field12324 = method2003;
        this.Field12325 = "Updating regular queue info";
        this.Field12326 = "Updating prio queue info";
    }
    
    public static final String Method4048(final Class1006 class1006) {
        return class1006.Field12325;
    }
    
    public static final void Method4049(final Class1006 class1006, final String field12325) {
        class1006.Field12325 = field12325;
    }
    
    public static final String Method4050(final Class1006 class1006) {
        return class1006.Field12326;
    }
    
    public static final void Method4051(final Class1006 class1006, final String field12326) {
        class1006.Field12326 = field12326;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x127E ^ 0xC6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
