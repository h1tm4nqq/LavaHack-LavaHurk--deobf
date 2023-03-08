//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import net.minecraft.client.gui.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u007f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0005?\u0006\u0002\u0010\u0012J\u0006\u0010\u001d\u001a\u00020\u0006R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0005?\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005?\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005?\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005?\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R#\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r?\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005?\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014j\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#?\u0006$" }, d2 = { "Lcom/kisman/cc/gui/selectionbar/SelectionBar$Guis;", "", "displayName", "", "gui0", "Lkotlin/Function0;", "Lnet/minecraft/client/gui/GuiScreen;", "check0", "", "open0", "", "close0", "init0", "Lkotlin/Function2;", "", "additions0", "", "Lcom/kisman/cc/gui/selectionbar/element/IElement;", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "getAdditions0", "()Lkotlin/jvm/functions/Function0;", "getCheck0", "getClose0", "getDisplayName", "()Ljava/lang/String;", "getGui0", "getInit0", "()Lkotlin/jvm/functions/Function2;", "getOpen0", "gui", "ClickGui", "PingBypassGui", "CSGOGui", "HudEditor", "Music", "Console", "kisman.cc" })
public enum Class1233
{
    Field13591("ClickGui", 0, "Click Gui", (Function0)Class2048.Field17395, (Function0)null, (Function0)Class2065.Field17437, (Function0)Class2064.Field17435, (Function2)Class2062.Field17423, (Function0)Class1138.Field13155, 4, (DefaultConstructorMarker)null), 
    Field13592("PingBypassGui", 1, "Ping Bypass", (Function0)Class1139.Field13157, (Function0)Class1145.Field13172, (Function0)null, (Function0)null, (Function2)null, (Function0)null, 120, (DefaultConstructorMarker)null), 
    Field13593("CSGOGui", 2, "CSGO Gui", (Function0)Class1146.Field13174, (Function0)Class1142.Field13162, (Function0)null, (Function0)null, (Function2)null, (Function0)null, 120, (DefaultConstructorMarker)null), 
    Field13594("HudEditor", 3, "Hud Editor", (Function0)Class1143.Field13164, (Function0)null, (Function0)null, (Function0)null, (Function2)null, (Function0)null, 124, (DefaultConstructorMarker)null), 
    Field13595("Music", 4, "Music", (Function0)Class1148.Field13189, (Function0)null, (Function0)null, (Function0)null, (Function2)null, (Function0)null, 124, (DefaultConstructorMarker)null), 
    Field13596("Console", 5, "Console", (Function0)Class1149.Field13191, (Function0)null, (Function0)null, (Function0)null, (Function2)null, (Function0)null, 124, (DefaultConstructorMarker)null);
    
    private static final Class1233[] Field13597;
    @NotNull
    private final String Field13598;
    @NotNull
    private final Function0 Field13599;
    @NotNull
    private final Function0 Field13600;
    @NotNull
    private final Function0 Field13601;
    @NotNull
    private final Function0 Field13602;
    @NotNull
    private final Function2 Field13603;
    @NotNull
    private final Function0 Field13604;
    private String Field13605 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final GuiScreen Method4955() {
        GuiScreen guiScreen;
        if (this.Field13600.invoke()) {
            guiScreen = (GuiScreen)this.Field13599.invoke();
        }
        else {
            final Class1419 field16262 = Class1796.Field16241.Field16262;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16262, "Kisman.instance.halqGui");
            guiScreen = field16262;
        }
        return guiScreen;
    }
    
    @NotNull
    @NotNull
    public final String Method4956() {
        return this.Field13598;
    }
    
    @NotNull
    @NotNull
    public final Function0 Method4957() {
        return this.Field13599;
    }
    
    @NotNull
    @NotNull
    public final Function0 Method4958() {
        return this.Field13600;
    }
    
    @NotNull
    @NotNull
    public final Function0 Method4959() {
        return this.Field13601;
    }
    
    @NotNull
    @NotNull
    public final Function0 Method4960() {
        return this.Field13602;
    }
    
    @NotNull
    @NotNull
    public final Function2 Method4961() {
        return this.Field13603;
    }
    
    @NotNull
    @NotNull
    public final Function0 Method4962() {
        return this.Field13604;
    }
    
    private Class1233(final String name, final int ordinal, final String field13598, final Function0 field13599, final Function0 field13600, final Function0 field13601, final Function0 field13602, final Function2 field13603, final Function0 field13604) {
        this.Field13598 = field13598;
        this.Field13599 = field13599;
        this.Field13600 = field13600;
        this.Field13601 = field13601;
        this.Field13602 = field13602;
        this.Field13603 = field13603;
        this.Field13604 = field13604;
    }
    
    Class1233(final String s, final int n, final String s2, final Function0 function0, Function0 function2, Function0 function3, Function0 function4, Function2 function5, Function0 function6, final int n2, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 0x4) != 0x0) {
            function2 = (Function0)Class1141.Field13159;
        }
        if ((n2 & 0x8) != 0x0) {
            function3 = (Function0)Class2056.Field17408;
        }
        if ((n2 & 0x10) != 0x0) {
            function4 = (Function0)Class2053.Field17403;
        }
        if ((n2 & 0x20) != 0x0) {
            function5 = (Function2)Class2052.Field17401;
        }
        if ((n2 & 0x40) != 0x0) {
            function6 = (Function0)Class2050.Field17399;
        }
        this(s, n, s2, function0, function2, function3, function4, function5, function6);
    }
    
    private static String Method4963(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1650 ^ 0xB9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
