/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.MutablePropertyReference1
 *  kotlin.jvm.internal.MutablePropertyReference1Impl
 *  kotlin.jvm.internal.Reflection
 *  kotlin.properties.Delegates
 *  kotlin.properties.ReadWriteProperty
 *  kotlin.reflect.KDeclarationContainer
 *  kotlin.reflect.KProperty
 */
package lavahack.loader;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import lavahack.loader.Class1191;
import lavahack.loader.Class1402;
import lavahack.loader.Class1554;
import lavahack.loader.Class2166;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2={"Lcom/kisman/cc/loader/gui/page/pages/ConsolePage;", "Lcom/kisman/cc/loader/gui/page/Page;", "()V", "<set-?>", "Ljavax/swing/JPanel;", "chatPanel", "getChatPanel", "()Ljavax/swing/JPanel;", "setChatPanel", "(Ljavax/swing/JPanel;)V", "chatPanel$delegate", "Lkotlin/properties/ReadWriteProperty;", "logArea", "Ljavax/swing/JTextArea;", "init", "", "log", "data", "", "Companion", "kisman.cc"})
public final class Class1114
extends Class1402 {
    static final KProperty[] Field13014 = new KProperty[]{(KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl((KDeclarationContainer)Reflection.getOrCreateKotlinClass(Class1114.class), "chatPanel", "getChatPanel()Ljavax/swing/JPanel;"))};
    private final ReadWriteProperty Field13015 = Delegates.INSTANCE.notNull();
    private JTextArea Field13016;
    @Nullable
    private static Class1114 Field13017;
    public static final Class1554 Field13018;
    private String Field13019 = "TheKisDevs & LavaHack Development owns you";

    static {
        Field13018 = new Class1554(null);
    }

    private final JPanel Method4556() {
        return (JPanel)this.Field13015.getValue((Object)this, Field13014[0]);
    }

    private final void Method4557(JPanel jPanel) {
        this.Field13015.setValue((Object)this, Field13014[0], (Object)jPanel);
    }

    @Override
    public void Method1571() {
        JTextArea jTextArea;
        Field13017 = this;
        JTextArea jTextArea2 = new JTextArea();
        Class1114 class1114 = this;
        boolean bl = false;
        boolean bl2 = false;
        JTextArea jTextArea3 = jTextArea2;
        boolean bl3 = false;
        this.Method4557(new JPanel(new BorderLayout()));
        this.Method4556().setBounds(5, 5, 473, 317);
        this.Method4556().setPreferredSize(new Dimension(473, 317));
        this.Method4556().setBorder(new Class2166(20, Class1191.Method4799(), 2.0f));
        this.add(this.Method4556());
        Object object = this.Method1569();
        JPanel jPanel = this.Method4556();
        boolean bl4 = false;
        object.add(jPanel);
        jTextArea3.setWrapStyleWord(true);
        jTextArea3.setEditable(false);
        jTextArea3.setFocusable(false);
        this.Method4556().add(jTextArea3);
        object = this.Method1570();
        boolean bl5 = false;
        object.add(jTextArea3);
        object = new JScrollPane(jTextArea3);
        this.Method4556().add((Component)object);
        ((JScrollPane)object).setHorizontalScrollBarPolicy(32);
        ((JScrollPane)object).setVerticalScrollBarPolicy(22);
        class1114.Field13016 = jTextArea = jTextArea2;
    }

    public final void Method4558(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"data");
        JTextArea jTextArea = this.Field13016;
        if (jTextArea == null) {
            Intrinsics.throwNpe();
        }
        StringBuilder stringBuilder = new StringBuilder();
        JTextArea jTextArea2 = this.Field13016;
        if (jTextArea2 == null) {
            Intrinsics.throwNpe();
        }
        String string2 = jTextArea2.getText();
        Intrinsics.checkExpressionValueIsNotNull((Object)string2, (String)"logArea!!.text");
        CharSequence charSequence = string2;
        StringBuilder stringBuilder2 = stringBuilder;
        JTextArea jTextArea3 = jTextArea;
        boolean bl = false;
        boolean bl2 = charSequence.length() > 0;
        jTextArea3.append(stringBuilder2.append("").append(string).toString());
        JTextArea jTextArea4 = this.Field13016;
        if (jTextArea4 == null) {
            Intrinsics.throwNpe();
        }
        JTextArea jTextArea5 = this.Field13016;
        if (jTextArea5 == null) {
            Intrinsics.throwNpe();
        }
        JTextArea jTextArea6 = this.Field13016;
        if (jTextArea6 == null) {
            Intrinsics.throwNpe();
        }
        jTextArea4.setCaretPosition(jTextArea5.getLineStartOffset(jTextArea6.getLineCount() - 1));
    }

    public Class1114() {
        super("Console");
    }

    public static final Class1114 Method4559() {
        return Field13017;
    }

    public static final void Method4560(Class1114 class1114) {
        Field13017 = class1114;
    }

    private static String Method1573(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 230;
            cArray2[n] = (char)(cArray[n] ^ (0x66D7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

