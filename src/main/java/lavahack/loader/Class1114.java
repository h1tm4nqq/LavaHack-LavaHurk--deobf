//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import kotlin.*;
import kotlin.reflect.*;
import javax.swing.border.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.properties.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002?\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e?\u0006\u0002\n\u0000?\u0006\u0014" }, d2 = { "Lcom/kisman/cc/loader/gui/page/pages/ConsolePage;", "Lcom/kisman/cc/loader/gui/page/Page;", "()V", "<set-?>", "Ljavax/swing/JPanel;", "chatPanel", "getChatPanel", "()Ljavax/swing/JPanel;", "setChatPanel", "(Ljavax/swing/JPanel;)V", "chatPanel$delegate", "Lkotlin/properties/ReadWriteProperty;", "logArea", "Ljavax/swing/JTextArea;", "init", "", "log", "data", "", "Companion", "kisman.cc" })
public final class Class1114 extends Class1402
{
    static final KProperty[] Field13014;
    private final ReadWriteProperty Field13015;
    private JTextArea Field13016;
    @Nullable
    private static Class1114 Field13017;
    public static final Class1554 Field13018;
    private String Field13019 = "TheKisDevs & LavaHack Development owns you";
    
    static {
        Field13014 = new KProperty[] { (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl((KDeclarationContainer)Reflection.getOrCreateKotlinClass((Class)Class1114.class), "chatPanel", "getChatPanel()Ljavax/swing/JPanel;")) };
        Field13018 = new Class1554(null);
    }
    
    private final JPanel Method4556() {
        return (JPanel)this.Field13015.getValue((Object)this, Class1114.Field13014[0]);
    }
    
    private final void Method4557(final JPanel panel) {
        this.Field13015.setValue((Object)this, Class1114.Field13014[0], (Object)panel);
    }
    
    @Override
    public void Method1571() {
        Class1114.Field13017 = this;
        final JTextArea textArea;
        final JTextArea field13016 = textArea = new JTextArea();
        this.Method4557(new JPanel(new BorderLayout()));
        this.Method4556().setBounds(5, 5, 473, 317);
        this.Method4556().setPreferredSize(new Dimension(473, 317));
        this.Method4556().setBorder(new Class2166(20, Class1191.Method4799(), 2.0f));
        this.add(this.Method4556());
        this.Method1569().add(this.Method4556());
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        textArea.setFocusable(false);
        this.Method4556().add(textArea);
        this.Method1570().add(textArea);
        final JScrollPane scrollPane = new JScrollPane(textArea);
        this.Method4556().add(scrollPane);
        scrollPane.setHorizontalScrollBarPolicy(32);
        scrollPane.setVerticalScrollBarPolicy(22);
        this.Field13016 = field13016;
    }
    
    public final void Method4558(@NotNull @NotNull final String str) {
        Intrinsics.checkParameterIsNotNull((Object)str, "data");
        final JTextArea field13016 = this.Field13016;
        if (field13016 == null) {
            Intrinsics.throwNpe();
        }
        final StringBuilder sb = new StringBuilder();
        final JTextArea field13017 = this.Field13016;
        if (field13017 == null) {
            Intrinsics.throwNpe();
        }
        final String text = field13017.getText();
        Intrinsics.checkExpressionValueIsNotNull((Object)text, "logArea!!.text");
        final String s = text;
        final StringBuilder sb2 = sb;
        final JTextArea textArea = field13016;
        final boolean b = s.length() > 0;
        textArea.append(sb2.append("").append(str).toString());
        final JTextArea field13018 = this.Field13016;
        if (field13018 == null) {
            Intrinsics.throwNpe();
        }
        final JTextArea field13019 = this.Field13016;
        if (field13019 == null) {
            Intrinsics.throwNpe();
        }
        final JTextArea field13020 = this.Field13016;
        if (field13020 == null) {
            Intrinsics.throwNpe();
        }
        field13018.setCaretPosition(field13019.getLineStartOffset(field13020.getLineCount() - 1));
    }
    
    public Class1114() {
        super("Console");
        this.Field13015 = Delegates.INSTANCE.notNull();
    }
    
    public static final Class1114 Method4559() {
        return Class1114.Field13017;
    }
    
    public static final void Method4560(final Class1114 field13017) {
        Class1114.Field13017 = field13017;
    }
    
    private static String Method1573(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x66D7 ^ 0xE6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
