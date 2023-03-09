/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Pair
 *  kotlin.TuplesKt
 *  kotlin.TypeCastException
 *  kotlin.collections.MapsKt
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 */
package lavahack.loader;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lavahack.loader.Class1027;
import lavahack.loader.Class1114;
import lavahack.loader.Class1272;
import lavahack.loader.Class1402;
import lavahack.loader.Class302;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0006\u0010-\u001a\u00020.\u001a\u0006\u0010/\u001a\u00020.\u001a\u000e\u00100\u001a\u00020.2\u0006\u00101\u001a\u000202\u001a\u0006\u00103\u001a\u00020.\"\u0011\u0010\u0000\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\"\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\"\u0011\u0010\u0010\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \"#\u0010!\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030#\u0012\u0006\u0012\u0004\u0018\u00010$0\"\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&\"\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u00064"}, d2={"accentColor", "Ljava/awt/Color;", "getAccentColor", "()Ljava/awt/Color;", "created", "", "getCreated", "()Z", "setCreated", "(Z)V", "currentFont", "Ljava/awt/Font;", "getCurrentFont", "()Ljava/awt/Font;", "setCurrentFont", "(Ljava/awt/Font;)V", "defaultFont", "getDefaultFont", "fontSize", "", "getFontSize", "()F", "fonts", "", "Lcom/kisman/cc/loader/gui/utils/LoaderFont;", "getFonts", "()Ljava/util/List;", "frame", "Ljavax/swing/JFrame;", "getFrame", "()Ljavax/swing/JFrame;", "setFrame", "(Ljavax/swing/JFrame;)V", "pages", "", "Ljava/lang/Class;", "Lcom/kisman/cc/loader/gui/page/Page;", "getPages", "()Ljava/util/Map;", "tabs", "Ljavax/swing/JTabbedPane;", "getTabs", "()Ljavax/swing/JTabbedPane;", "setTabs", "(Ljavax/swing/JTabbedPane;)V", "close", "", "create", "log", "data", "", "updateTabs", "kisman.cc"})
public final class Class1191 {
    @NotNull
    private static final Map Field13390 = MapsKt.mutableMapOf((Pair[])new Pair[]{TuplesKt.to(Class302.class, null), TuplesKt.to(Class1114.class, null), TuplesKt.to(Class1027.class, null)});
    @NotNull
    private static final List Field13391;
    @Nullable
    private static JFrame Field13392;
    @Nullable
    private static JTabbedPane Field13393;
    private static boolean Field13394;
    @NotNull
    private static final Font Field13395;
    private static final float Field13396;
    @NotNull
    private static Font Field13397;
    private String Field13398 = "TheKisDevs & LavaHack Development owns you";

    @NotNull
    @NotNull
    public static final Map Method4787() {
        return Field13390;
    }

    @NotNull
    @NotNull
    public static final List Method4788() {
        return Field13391;
    }

    @Nullable
    @Nullable
    public static final JFrame Method4789() {
        return Field13392;
    }

    public static final void Method4790(@Nullable @Nullable JFrame jFrame) {
        Field13392 = jFrame;
    }

    @Nullable
    @Nullable
    public static final JTabbedPane Method4791() {
        return Field13393;
    }

    public static final void Method4792(@Nullable @Nullable JTabbedPane jTabbedPane) {
        Field13393 = jTabbedPane;
    }

    public static final boolean Method4793() {
        return Field13394;
    }

    public static final void Method4794(boolean bl) {
        Field13394 = bl;
    }

    public static final void Method4795() {
        Class1402 class1402;
        Object object;
        boolean bl;
        Object object2;
        boolean bl2;
        Collection collection;
        HashSet<Class1272> hashSet = (HashSet<Class1272>)((Object)Field13391);
        Object object3 = new Class1272("Default", Field13395);
        int n = 0;
        hashSet.add((Class1272)object3);
        hashSet = new HashSet<Class1272>();
        GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Intrinsics.checkExpressionValueIsNotNull((Object)graphicsEnvironment, (String)"GraphicsEnvironment.getLocalGraphicsEnvironment()");
        Font[] fontArray = graphicsEnvironment.getAllFonts();
        int n2 = fontArray.length;
        for (n = 0; n < n2; ++n) {
            Font font;
            String string;
            Object object4 = object3 = fontArray[n];
            Intrinsics.checkExpressionValueIsNotNull((Object)object4, (String)"font");
            if (hashSet.contains(((Font)object4).getFontName())) continue;
            collection = Field13391;
            Intrinsics.checkExpressionValueIsNotNull((Object)((Font)object3).getFontName(), (String)"font.fontName");
            Object object5 = ((Font)object3).deriveFont(Field13396);
            boolean bl3 = false;
            bl2 = false;
            object2 = object5;
            boolean bl4 = false;
            GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont((Font)object2);
            Font font2 = object5;
            Intrinsics.checkExpressionValueIsNotNull((Object)font2, (String)"font.deriveFont(fontSize\u2026ment().registerFont(it) }");
            String string2 = string;
            object5 = new Class1272(string2, font);
            bl3 = false;
            collection.add(object5);
            collection = hashSet;
            object5 = ((Font)object3).getFontName();
            bl3 = false;
            collection.add(object5);
        }
        JFrame jFrame = Field13392 = new JFrame("LavaHack Loader | 2.0");
        if (jFrame == null) {
            Intrinsics.throwNpe();
        }
        jFrame.setSize(500, 400);
        object3 = new JPanel();
        ((Container)object3).setLayout(new GridLayout(1, 1));
        Field13393 = new JTabbedPane();
        Object object6 = Field13390;
        boolean bl5 = false;
        Object object7 = object6;
        collection = new ArrayList(object6.size());
        boolean bl6 = false;
        Map map = object7;
        bl2 = false;
        object2 = map.entrySet().iterator();
        while (object2.hasNext()) {
            Map.Entry entry;
            Map.Entry entry2 = entry = (Map.Entry)object2.next();
            Collection collection2 = collection;
            bl = false;
            object = Field13390;
            Object k = entry2.getKey();
            Object t = ((Class)entry2.getKey()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (t == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.loader.gui.page.Page");
            }
            class1402 = (Class1402)t;
            boolean bl7 = false;
            object.put(k, class1402);
            Object v = Field13390.get(entry2.getKey());
            if (v == null) {
                Intrinsics.throwNpe();
            }
            Class1402 class14022 = (Class1402)v;
            collection2.add(class14022);
        }
        object6 = (List)collection;
        bl5 = false;
        object7 = object6.iterator();
        while (object7.hasNext()) {
            JTabbedPane jTabbedPane;
            collection = object7.next();
            Class1402 class14023 = (Class1402)((Object)collection);
            boolean bl8 = false;
            if (Field13393 == null) {
                Intrinsics.throwNpe();
            }
            Class1402 class14024 = class14023;
            object2 = class14023.Method1572();
            boolean bl9 = false;
            bl = false;
            object = class14024;
            boolean bl10 = false;
            ((Class1402)object).Method1571();
            class1402 = class14024;
            jTabbedPane.addTab((String)object2, class1402);
        }
        JTabbedPane jTabbedPane = Field13393;
        if (jTabbedPane == null) {
            Intrinsics.throwNpe();
        }
        jTabbedPane.getFont();
        ((Container)object3).add(Field13393);
        JFrame jFrame2 = Field13392;
        if (jFrame2 == null) {
            Intrinsics.throwNpe();
        }
        jFrame2.add((Component)object3, "Center");
        JFrame jFrame3 = Field13392;
        if (jFrame3 == null) {
            Intrinsics.throwNpe();
        }
        jFrame3.setDefaultCloseOperation(3);
        JFrame jFrame4 = Field13392;
        if (jFrame4 == null) {
            Intrinsics.throwNpe();
        }
        jFrame4.setResizable(false);
        JFrame jFrame5 = Field13392;
        if (jFrame5 == null) {
            Intrinsics.throwNpe();
        }
        jFrame5.setVisible(true);
        Field13394 = true;
    }

    public static final void Method4796() {
        JFrame jFrame = Field13392;
        if (jFrame == null) return;
        jFrame.setVisible(false);
    }

    public static final void Method4797(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"data");
        Class1114 class1114 = Class1114.Field13018.Method6128();
        if (class1114 == null) {
            Intrinsics.throwNpe();
        }
        class1114.Method4558(string);
    }

    public static final void Method4798() {
        JTabbedPane jTabbedPane = Field13393;
        if (jTabbedPane == null) {
            Intrinsics.throwNpe();
        }
        jTabbedPane.setFont(Field13397);
    }

    @NotNull
    @NotNull
    public static final Color Method4799() {
        Color color;
        Color color2 = null;
        Iterator iterator = UIManager.getDefaults().entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry;
            Map.Entry entry2 = entry = iterator.next();
            boolean bl = false;
            Object k = entry2.getKey();
            if (!StringsKt.contains$default((CharSequence)k.toString(), (CharSequence)"accent", (boolean)false, (int)2, null)) continue;
            color2 = UIManager.getColor(k);
            if (!Intrinsics.areEqual(k, (Object)"accent")) continue;
        }
        if ((color = color2) != null) {
            return color;
        }
        Color color3 = Color.ORANGE;
        color = color3;
        Intrinsics.checkExpressionValueIsNotNull((Object)color3, (String)"Color.ORANGE");
        return color;
    }

    @NotNull
    @NotNull
    public static final Font Method4800() {
        return Field13395;
    }

    public static final float Method4801() {
        return Field13396;
    }

    @NotNull
    @NotNull
    public static final Font Method4802() {
        return Field13397;
    }

    public static final void Method4803(@NotNull @NotNull Font font) {
        Intrinsics.checkParameterIsNotNull((Object)font, (String)"<set-?>");
        Field13397 = font;
    }

    static {
        boolean bl = false;
        Field13391 = new ArrayList();
        Font font = new JLabel().getFont();
        if (font == null) {
            Intrinsics.throwNpe();
        }
        Field13395 = font;
        Field13396 = Field13395.getSize2D();
        Field13397 = Field13395;
    }

    private static String Method4804(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 85;
            cArray2[n] = (char)(cArray[n] ^ (0x3BDC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

