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
import lavahack.loader.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import lavahack.loader.QDCXH9agJwY6VzukEM6t94IC3iSpNB1w;
import lavahack.loader.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG;
import lavahack.loader.t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r;
import lavahack.loader.x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0006\u0010-\u001a\u00020.\u001a\u0006\u0010/\u001a\u00020.\u001a\u000e\u00100\u001a\u00020.2\u0006\u00101\u001a\u000202\u001a\u0006\u00103\u001a\u00020.\"\u0011\u0010\u0000\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\"\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\"\u0011\u0010\u0010\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \"#\u0010!\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030#\u0012\u0006\u0012\u0004\u0018\u00010$0\"\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&\"\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u00064"}, d2={"accentColor", "Ljava/awt/Color;", "getAccentColor", "()Ljava/awt/Color;", "created", "", "getCreated", "()Z", "setCreated", "(Z)V", "currentFont", "Ljava/awt/Font;", "getCurrentFont", "()Ljava/awt/Font;", "setCurrentFont", "(Ljava/awt/Font;)V", "defaultFont", "getDefaultFont", "fontSize", "", "getFontSize", "()F", "fonts", "", "Lcom/kisman/cc/loader/gui/utils/LoaderFont;", "getFonts", "()Ljava/util/List;", "frame", "Ljavax/swing/JFrame;", "getFrame", "()Ljavax/swing/JFrame;", "setFrame", "(Ljavax/swing/JFrame;)V", "pages", "", "Ljava/lang/Class;", "Lcom/kisman/cc/loader/gui/page/Page;", "getPages", "()Ljava/util/Map;", "tabs", "Ljavax/swing/JTabbedPane;", "getTabs", "()Ljavax/swing/JTabbedPane;", "setTabs", "(Ljavax/swing/JTabbedPane;)V", "close", "", "create", "log", "data", "", "updateTabs", "kisman.cc"})
public final class vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi {
    @NotNull
    private static final Map Field13390;
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
        x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk2;
        Object object;
        int n;
        Object object2;
        int n2;
        Collection collection;
        HashSet<IBONRcQCNUBg2NBpVpVQf61ykmVfU03E> hashSet = (HashSet<IBONRcQCNUBg2NBpVpVQf61ykmVfU03E>)((Object)Field13391);
        Object object3 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E("Default", Field13395);
        int n3 = (int)-234313902L ^ 0xF208A752;
        hashSet.add((IBONRcQCNUBg2NBpVpVQf61ykmVfU03E)object3);
        hashSet = new HashSet<IBONRcQCNUBg2NBpVpVQf61ykmVfU03E>();
        GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Intrinsics.checkExpressionValueIsNotNull((Object)graphicsEnvironment, (String)"GraphicsEnvironment.getLocalGraphicsEnvironment()");
        Font[] fontArray = graphicsEnvironment.getAllFonts();
        int n4 = fontArray.length;
        for (n3 = (int)((long)-2099995923 ^ (long)-2099995923); n3 < n4; ++n3) {
            Font font;
            String string;
            Object object4 = object3 = fontArray[n3];
            Intrinsics.checkExpressionValueIsNotNull((Object)object4, (String)"font");
            if (hashSet.contains(((Font)object4).getFontName())) continue;
            collection = Field13391;
            Intrinsics.checkExpressionValueIsNotNull((Object)((Font)object3).getFontName(), (String)"font.fontName");
            Object object5 = ((Font)object3).deriveFont(Field13396);
            int n5 = (int)-454962479L ^ 0xE4E1D2D1;
            n2 = (int)((long)338940573 ^ (long)338940573);
            object2 = object5;
            int n6 = (int)((long)-910187455 ^ (long)-910187455);
            GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont((Font)object2);
            Font font2 = object5;
            Intrinsics.checkExpressionValueIsNotNull((Object)font2, (String)"font.deriveFont(fontSize\u2026ment().registerFont(it) }");
            String string2 = string;
            object5 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E(string2, font);
            n5 = (int)931033197L ^ 0x377E706D;
            collection.add(object5);
            collection = hashSet;
            object5 = ((Font)object3).getFontName();
            n5 = (int)((long)-1913174488 ^ (long)-1913174488);
            collection.add(object5);
        }
        JFrame jFrame = Field13392 = new JFrame("LavaHack Loader | 2.0");
        if (jFrame == null) {
            Intrinsics.throwNpe();
        }
        jFrame.setSize((int)((long)-117140704 ^ (long)-117140643) << 2, ((int)1050643406L ^ 0x3E9F8BD7) << 4);
        object3 = new JPanel();
        ((Container)object3).setLayout(new GridLayout((int)((long)-1738361644 ^ (long)-1738361643), (int)((long)564390264 ^ (long)564390265)));
        Field13393 = new JTabbedPane();
        Object object6 = Field13390;
        int n7 = (int)-1382902177L ^ 0xAD92965F;
        Object object7 = object6;
        collection = new ArrayList(object6.size());
        int n8 = (int)((long)-646292069 ^ (long)-646292069);
        Map map = object7;
        n2 = (int)((long)-420980277 ^ (long)-420980277);
        object2 = map.entrySet().iterator();
        while (object2.hasNext()) {
            Map.Entry entry;
            Map.Entry entry2 = entry = (Map.Entry)object2.next();
            Collection collection2 = collection;
            n = (int)((long)-1816818155 ^ (long)-1816818155);
            object = Field13390;
            Object k = entry2.getKey();
            Object t = ((Class)entry2.getKey()).getDeclaredConstructor(new Class[(int)((long)-1018494889 ^ (long)-1018494889)]).newInstance(new Object[(int)-1637653479L ^ 0x9E636419]);
            if (t == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.loader.gui.page.Page");
            }
            x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk2 = (x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk)t;
            int n9 = (int)((long)-1584992952 ^ (long)-1584992952);
            object.put(k, x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk2);
            Object v = Field13390.get(entry2.getKey());
            if (v == null) {
                Intrinsics.throwNpe();
            }
            x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk3 = (x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk)v;
            collection2.add(x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk3);
        }
        object6 = (List)collection;
        n7 = (int)((long)-1189820984 ^ (long)-1189820984);
        object7 = object6.iterator();
        while (object7.hasNext()) {
            JTabbedPane jTabbedPane;
            collection = object7.next();
            x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk4 = (x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk)((Object)collection);
            int n10 = (int)872938115L ^ 0x3407FA83;
            if (Field13393 == null) {
                Intrinsics.throwNpe();
            }
            x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk5 = x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk4;
            object2 = x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk4.Method1572();
            int n11 = (int)1915098437L ^ 0x72261545;
            n = (int)-1598761790L ^ 0xA0B4D4C2;
            object = x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk5;
            int n12 = (int)1882518473L ^ 0x7034F3C9;
            ((x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk)object).Method1571();
            x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk2 = x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk5;
            jTabbedPane.addTab((String)object2, x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk2);
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
        jFrame3.setDefaultCloseOperation((int)((long)-1413056737 ^ (long)-1413056740));
        JFrame jFrame4 = Field13392;
        if (jFrame4 == null) {
            Intrinsics.throwNpe();
        }
        jFrame4.setResizable(((int)1745406921L ^ 0x6808CBC9) != 0);
        JFrame jFrame5 = Field13392;
        if (jFrame5 == null) {
            Intrinsics.throwNpe();
        }
        jFrame5.setVisible(((int)-287591883L ^ 0xEEDBB234) != 0);
        Field13394 = (int)((long)1644220236 ^ (long)1644220237);
    }

    public static final void Method4796() {
        JFrame jFrame = Field13392;
        if (jFrame == null) return;
        jFrame.setVisible(((int)-1079121434L ^ 0xBFADE9E6) != 0);
    }

    public static final void Method4797(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"data");
        lykufhPOEnCHuwIMw0o30bjFnsTt0nqG lykufhPOEnCHuwIMw0o30bjFnsTt0nqG2 = lykufhPOEnCHuwIMw0o30bjFnsTt0nqG.Field13018.Method6128();
        if (lykufhPOEnCHuwIMw0o30bjFnsTt0nqG2 == null) {
            Intrinsics.throwNpe();
        }
        lykufhPOEnCHuwIMw0o30bjFnsTt0nqG2.Method4558(string);
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
            int n = (int)((long)317020906 ^ (long)317020906);
            Object k = entry2.getKey();
            if (!StringsKt.contains$default((CharSequence)k.toString(), (CharSequence)"accent", ((int)-587734313L ^ 0xDCF7E2D7) != 0, (int)(((int)-1514371881L ^ 0xA5BC84D6) << 1), null)) continue;
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
        Pair[] pairArray = new Pair[(int)((long)1857532201 ^ (long)1857532202)];
        pairArray[(int)((long)-242218715 ^ (long)-242218715)] = TuplesKt.to(QDCXH9agJwY6VzukEM6t94IC3iSpNB1w.class, null);
        pairArray[(int)-188292930L ^ 0xF4C6E0BF] = TuplesKt.to(lykufhPOEnCHuwIMw0o30bjFnsTt0nqG.class, null);
        pairArray[(int)((long)461650357 ^ (long)461650356) << 1] = TuplesKt.to(t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r.class, null);
        Field13390 = MapsKt.mutableMapOf((Pair[])pairArray);
        int n = (int)-1836820463L ^ 0x92845811;
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
        int n = (int)-1715503545L ^ 0x99BF7E47;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1935338938 ^ (long)-1935338823);
            int n2 = (int)1815117092L ^ 0x6C307D71;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1943095709L ^ 0x8C2EB894) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

