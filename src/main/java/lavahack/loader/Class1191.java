//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;
import java.awt.*;
import kotlin.text.*;
import kotlin.*;
import kotlin.collections.*;
import javax.swing.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0006\u0010-\u001a\u00020.\u001a\u0006\u0010/\u001a\u00020.\u001a\u000e\u00100\u001a\u00020.2\u0006\u00101\u001a\u000202\u001a\u0006\u00103\u001a\u00020.\"\u0011\u0010\u0000\u001a\u00020\u00018F?\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\"\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\"\u0011\u0010\u0010\u001a\u00020\u000b?\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0011\u0010\u0012\u001a\u00020\u0013?\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017?\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \"#\u0010!\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030#\u0012\u0006\u0012\u0004\u0018\u00010$0\"?\u0006\b\n\u0000\u001a\u0004\b%\u0010&\"\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,?\u00064" }, d2 = { "accentColor", "Ljava/awt/Color;", "getAccentColor", "()Ljava/awt/Color;", "created", "", "getCreated", "()Z", "setCreated", "(Z)V", "currentFont", "Ljava/awt/Font;", "getCurrentFont", "()Ljava/awt/Font;", "setCurrentFont", "(Ljava/awt/Font;)V", "defaultFont", "getDefaultFont", "fontSize", "", "getFontSize", "()F", "fonts", "", "Lcom/kisman/cc/loader/gui/utils/LoaderFont;", "getFonts", "()Ljava/util/List;", "frame", "Ljavax/swing/JFrame;", "getFrame", "()Ljavax/swing/JFrame;", "setFrame", "(Ljavax/swing/JFrame;)V", "pages", "", "Ljava/lang/Class;", "Lcom/kisman/cc/loader/gui/page/Page;", "getPages", "()Ljava/util/Map;", "tabs", "Ljavax/swing/JTabbedPane;", "getTabs", "()Ljavax/swing/JTabbedPane;", "setTabs", "(Ljavax/swing/JTabbedPane;)V", "close", "", "create", "log", "data", "", "updateTabs", "kisman.cc" })
public final class Class1191
{
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
        return Class1191.Field13390;
    }
    
    @NotNull
    @NotNull
    public static final List Method4788() {
        return Class1191.Field13391;
    }
    
    @Nullable
    @Nullable
    public static final JFrame Method4789() {
        return Class1191.Field13392;
    }
    
    public static final void Method4790(@Nullable @Nullable final JFrame field13392) {
        Class1191.Field13392 = field13392;
    }
    
    @Nullable
    @Nullable
    public static final JTabbedPane Method4791() {
        return Class1191.Field13393;
    }
    
    public static final void Method4792(@Nullable @Nullable final JTabbedPane field13393) {
        Class1191.Field13393 = field13393;
    }
    
    public static final boolean Method4793() {
        return Class1191.Field13394;
    }
    
    public static final void Method4794(final boolean field13394) {
        Class1191.Field13394 = field13394;
    }
    
    public static final void Method4795() {
        Class1191.Field13391.add(new Class1272("Default", Class1191.Field13395));
        final HashSet<String> set = new HashSet<String>();
        final GraphicsEnvironment localGraphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Intrinsics.checkExpressionValueIsNotNull((Object)localGraphicsEnvironment, "GraphicsEnvironment.getLocalGraphicsEnvironment()");
        for (final Font font : localGraphicsEnvironment.getAllFonts()) {
            final HashSet<String> set2 = set;
            final Font font2 = font;
            Intrinsics.checkExpressionValueIsNotNull((Object)font2, "font");
            if (!set2.contains(font2.getFontName())) {
                final List list = Class1191.Field13391;
                final String fontName = font.getFontName();
                Intrinsics.checkExpressionValueIsNotNull((Object)fontName, "font.fontName");
                final Font deriveFont = font.deriveFont(Class1191.Field13396);
                final String s = fontName;
                GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(deriveFont);
                final Font font3 = deriveFont;
                final String s2 = s;
                final Font font4 = font3;
                Intrinsics.checkExpressionValueIsNotNull((Object)font4, "font.deriveFont(fontSize\u2026ment().registerFont(it) }");
                list.add(new Class1272(s2, font4));
                set.add(font.getFontName());
            }
        }
        Class1191.Field13392 = new JFrame("LavaHack Loader | 2.0");
        final JFrame field13392 = Class1191.Field13392;
        if (field13392 == null) {
            Intrinsics.throwNpe();
        }
        field13392.setSize(500, 400);
        final JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 1));
        Class1191.Field13393 = new JTabbedPane();
        final Map field13393;
        final ArrayList<Class1402> list2 = new ArrayList<Class1402>((field13393 = Class1191.Field13390).size());
        for (final Map.Entry<Object, V> entry : field13393.entrySet()) {
            final ArrayList<Class1402> list3 = list2;
            final Map.Entry<Object, V> entry2 = entry;
            final ArrayList<Class1402> list4 = list3;
            final Map field13394 = Class1191.Field13390;
            final Object key = entry2.getKey();
            final Class1402 instance = entry2.getKey().getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            if (instance == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.loader.gui.page.Page");
            }
            field13394.put(key, instance);
            final Object value = Class1191.Field13390.get(entry2.getKey());
            if (value == null) {
                Intrinsics.throwNpe();
            }
            list4.add((Class1402)value);
        }
        for (final Class1402 class1402 : list2) {
            final JTabbedPane field13395 = Class1191.Field13393;
            if (field13395 == null) {
                Intrinsics.throwNpe();
            }
            final String method1572 = class1402.Method1572();
            final Class1402 class1403 = class1402;
            final String title = method1572;
            final JTabbedPane tabbedPane = field13395;
            class1403.Method1571();
            tabbedPane.addTab(title, class1403);
        }
        final JTabbedPane field13396 = Class1191.Field13393;
        if (field13396 == null) {
            Intrinsics.throwNpe();
        }
        field13396.getFont();
        panel.add(Class1191.Field13393);
        final JFrame field13397 = Class1191.Field13392;
        if (field13397 == null) {
            Intrinsics.throwNpe();
        }
        field13397.add(panel, "Center");
        final JFrame field13398 = Class1191.Field13392;
        if (field13398 == null) {
            Intrinsics.throwNpe();
        }
        field13398.setDefaultCloseOperation(3);
        final JFrame field13399 = Class1191.Field13392;
        if (field13399 == null) {
            Intrinsics.throwNpe();
        }
        field13399.setResizable(false);
        final JFrame field13400 = Class1191.Field13392;
        if (field13400 == null) {
            Intrinsics.throwNpe();
        }
        field13400.setVisible(true);
        Class1191.Field13394 = true;
    }
    
    public static final void Method4796() {
        final JFrame field13392 = Class1191.Field13392;
        if (field13392 != null) {
            field13392.setVisible(false);
        }
    }
    
    public static final void Method4797(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "data");
        final Class1114 method6128 = Class1114.Field13018.Method6128();
        if (method6128 == null) {
            Intrinsics.throwNpe();
        }
        method6128.Method4558(s);
    }
    
    public static final void Method4798() {
        final JTabbedPane field13393 = Class1191.Field13393;
        if (field13393 == null) {
            Intrinsics.throwNpe();
        }
        field13393.setFont(Class1191.Field13397);
    }
    
    @NotNull
    @NotNull
    public static final Color Method4799() {
        Color color = null;
        final Iterator<Map.Entry<Object, Object>> iterator = UIManager.getDefaults().entrySet().iterator();
        while (iterator.hasNext()) {
            final Object key = iterator.next().getKey();
            if (StringsKt.contains$default((CharSequence)key.toString(), (CharSequence)"accent", false, 2, (Object)null)) {
                color = UIManager.getColor(key);
                if (Intrinsics.areEqual(key, (Object)"accent")) {
                    break;
                }
                continue;
            }
        }
        Color orange;
        if ((orange = color) == null) {
            Intrinsics.checkExpressionValueIsNotNull((Object)(orange = Color.ORANGE), "Color.ORANGE");
        }
        return orange;
    }
    
    @NotNull
    @NotNull
    public static final Font Method4800() {
        return Class1191.Field13395;
    }
    
    public static final float Method4801() {
        return Class1191.Field13396;
    }
    
    @NotNull
    @NotNull
    public static final Font Method4802() {
        return Class1191.Field13397;
    }
    
    public static final void Method4803(@NotNull @NotNull final Font field13397) {
        Intrinsics.checkParameterIsNotNull((Object)field13397, "<set-?>");
        Class1191.Field13397 = field13397;
    }
    
    static {
        Field13390 = MapsKt.mutableMapOf(new Pair[] { TuplesKt.to((Object)Class302.class, (Object)null), TuplesKt.to((Object)Class1114.class, (Object)null), TuplesKt.to((Object)Class1027.class, (Object)null) });
        Field13391 = new ArrayList();
        final Font font = new JLabel().getFont();
        if (font == null) {
            Intrinsics.throwNpe();
        }
        Field13395 = font;
        Field13396 = Class1191.Field13395.getSize2D();
        Class1191.Field13397 = Class1191.Field13395;
    }
    
    private static String Method4804(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3BDC ^ 0x55));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
