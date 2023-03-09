/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  lavahack.client.SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  net.minecraft.client.gui.GuiScreen
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1138;
import lavahack.client.Class1139;
import lavahack.client.Class1141;
import lavahack.client.Class1142;
import lavahack.client.Class1143;
import lavahack.client.Class1145;
import lavahack.client.Class1146;
import lavahack.client.Class1148;
import lavahack.client.Class1149;
import lavahack.client.Class1419;
import lavahack.client.Class1796;
import lavahack.client.Class2048;
import lavahack.client.Class2050;
import lavahack.client.Class2052;
import lavahack.client.Class2053;
import lavahack.client.Class2056;
import lavahack.client.Class2062;
import lavahack.client.Class2064;
import lavahack.client.Class2065;
import lavahack.client.SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6;
import net.minecraft.client.gui.GuiScreen;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u007f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0005\u00a2\u0006\u0002\u0010\u0012J\u0006\u0010\u001d\u001a\u00020\u0006R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R#\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014j\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#\u00a8\u0006$"}, d2={"Lcom/kisman/cc/gui/selectionbar/SelectionBar$Guis;", "", "displayName", "", "gui0", "Lkotlin/Function0;", "Lnet/minecraft/client/gui/GuiScreen;", "check0", "", "open0", "", "close0", "init0", "Lkotlin/Function2;", "", "additions0", "", "Lcom/kisman/cc/gui/selectionbar/element/IElement;", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "getAdditions0", "()Lkotlin/jvm/functions/Function0;", "getCheck0", "getClose0", "getDisplayName", "()Ljava/lang/String;", "getGui0", "getInit0", "()Lkotlin/jvm/functions/Function2;", "getOpen0", "gui", "ClickGui", "PingBypassGui", "CSGOGui", "HudEditor", "Music", "Console", "kisman.cc"})
public final class Class1233
extends Enum {
    public static final /* enum */ Class1233 Field13591;
    public static final /* enum */ Class1233 Field13592;
    public static final /* enum */ Class1233 Field13593;
    public static final /* enum */ Class1233 Field13594;
    public static final /* enum */ Class1233 Field13595;
    public static final /* enum */ Class1233 Field13596;
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

    static {
        Class1233[] class1233Array = new Class1233[6];
        Class1233[] class1233Array2 = class1233Array;
        class1233Array[0] = Field13591 = new Class1233("ClickGui", 0, "Click Gui", (Function0)Class2048.Field17395, null, (Function0)Class2065.Field17437, (Function0)Class2064.Field17435, (Function2)Class2062.Field17423, (Function0)Class1138.Field13155, 4, null);
        class1233Array[1] = Field13592 = new Class1233("PingBypassGui", 1, "Ping Bypass", (Function0)Class1139.Field13157, (Function0)Class1145.Field13172, null, null, null, null, 120, null);
        class1233Array[2] = Field13593 = new Class1233("CSGOGui", 2, "CSGO Gui", (Function0)Class1146.Field13174, (Function0)Class1142.Field13162, null, null, null, null, 120, null);
        class1233Array[3] = Field13594 = new Class1233("HudEditor", 3, "Hud Editor", (Function0)Class1143.Field13164, null, null, null, null, null, 124, null);
        class1233Array[4] = Field13595 = new Class1233("Music", 4, "Music", (Function0)Class1148.Field13189, null, null, null, null, null, 124, null);
        class1233Array[5] = Field13596 = new Class1233("Console", 5, "Console", (Function0)Class1149.Field13191, null, null, null, null, null, 124, null);
        Field13597 = class1233Array;
    }

    @NotNull
    @NotNull
    public final GuiScreen Method4955() {
        GuiScreen guiScreen;
        if (((Boolean)this.Field13600.invoke()).booleanValue()) {
            guiScreen = (GuiScreen)this.Field13599.invoke();
            return guiScreen;
        }
        Class1419 class1419 = Class1796.Field16241.Field16262;
        Intrinsics.checkExpressionValueIsNotNull((Object)((Object)class1419), (String)"Kisman.instance.halqGui");
        guiScreen = class1419;
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

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1233(Function0 function0, Function0 function02, Function0 function03, Function2 function2, Function0 function04) {
        void var9_7;
        void var8_6;
        void var2_-1;
        void var1_-1;
        this.Field13598 = function0;
        this.Field13599 = function02;
        this.Field13600 = function03;
        this.Field13601 = function2;
        this.Field13602 = function04;
        this.Field13603 = var8_6;
        this.Field13604 = var9_7;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    Class1233(Function0 function02, Function0 function03, Function0 function04, Function2 function2, Function0 function05, int object, DefaultConstructorMarker defaultConstructorMarker) {
        void var9_10;
        void var1_-1;
        void var10_11;
        if ((var10_11 & 4) != 0) {
            function04 = Class1141.Field13159;
        }
        if ((var10_11 & 8) != 0) {
            function2 = Class2056.Field17408;
        }
        if ((var10_11 & 0x10) != 0) {
            function05 = Class2053.Field17403;
        }
        if ((var10_11 & 0x20) != 0) {
            object = (Object)Class2052.Field17401;
        }
        if ((var10_11 & 0x40) != 0) {
            Function0 function06 = Class2050.Field17399;
        }
        this((String)var1_-1, (int)function0, (String)function02, function03, function04, (Function0)function2, function05, (Function2)object, (Function0)var9_10);
    }

    public static Class1233[] values() {
        return (SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field13597.clone();
    }

    public static Class1233 valueOf(String string) {
        return Enum.valueOf(Class1233.class, string);
    }

    private static String Method4963(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 185;
            cArray2[n] = (char)(cArray[n] ^ (0x1650 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

