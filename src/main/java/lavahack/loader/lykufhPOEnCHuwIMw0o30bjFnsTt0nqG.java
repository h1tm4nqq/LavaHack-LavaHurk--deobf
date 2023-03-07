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
import lavahack.loader.JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm;
import lavahack.loader.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.loader.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
import lavahack.loader.x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2={"Lcom/kisman/cc/loader/gui/page/pages/ConsolePage;", "Lcom/kisman/cc/loader/gui/page/Page;", "()V", "<set-?>", "Ljavax/swing/JPanel;", "chatPanel", "getChatPanel", "()Ljavax/swing/JPanel;", "setChatPanel", "(Ljavax/swing/JPanel;)V", "chatPanel$delegate", "Lkotlin/properties/ReadWriteProperty;", "logArea", "Ljavax/swing/JTextArea;", "init", "", "log", "data", "", "Companion", "kisman.cc"})
public final class lykufhPOEnCHuwIMw0o30bjFnsTt0nqG
extends x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk {
    static final KProperty[] Field13014;
    private final ReadWriteProperty Field13015 = Delegates.INSTANCE.notNull();
    private JTextArea Field13016;
    @Nullable
    private static lykufhPOEnCHuwIMw0o30bjFnsTt0nqG Field13017;
    public static final lykufhPOEnCHuwIMw0o30bjFnsTt0nqG$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field13018;
    private String Field13019 = "TheKisDevs & LavaHack Development owns you";

    static {
        KProperty[] kPropertyArray = new KProperty[(int)1556817228L ^ 0x5CCB254D];
        kPropertyArray[(int)((long)1821189081 ^ (long)1821189081)] = (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl((KDeclarationContainer)Reflection.getOrCreateKotlinClass(lykufhPOEnCHuwIMw0o30bjFnsTt0nqG.class), "chatPanel", "getChatPanel()Ljavax/swing/JPanel;"));
        Field13014 = kPropertyArray;
        Field13018 = new lykufhPOEnCHuwIMw0o30bjFnsTt0nqG$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
    }

    private final JPanel Method4556() {
        return (JPanel)this.Field13015.getValue((Object)this, Field13014[(int)625246993L ^ 0x25448311]);
    }

    private final void Method4557(JPanel jPanel) {
        this.Field13015.setValue((Object)this, Field13014[(int)103959692L ^ 0x6324C8C], (Object)jPanel);
    }

    @Override
    public void Method1571() {
        JTextArea jTextArea;
        Field13017 = this;
        JTextArea jTextArea2 = new JTextArea();
        lykufhPOEnCHuwIMw0o30bjFnsTt0nqG lykufhPOEnCHuwIMw0o30bjFnsTt0nqG2 = this;
        int n = (int)1479561010L ^ 0x58304F32;
        int n2 = (int)((long)-384520559 ^ (long)-384520559);
        JTextArea jTextArea3 = jTextArea2;
        int n3 = (int)((long)1611614529 ^ (long)1611614529);
        this.Method4557(new JPanel(new BorderLayout()));
        this.Method4556().setBounds((int)-611735689L ^ 0xDB89A772, (int)107997923L ^ 0x66FEAE6, (int)59600667L ^ 0x38D6EC2, (int)-1472762126L ^ 0xA8376FCF);
        this.Method4556().setPreferredSize(new Dimension((int)((long)-1506022993 ^ (long)-1506023306), (int)1251148091L ^ 0x4A930006));
        this.Method4556().setBorder(new JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm(((int)988193991L ^ 0x3AE6A4C2) << 2, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Method4799(), 2.0f));
        this.add(this.Method4556());
        Object object = this.Method1569();
        JPanel jPanel = this.Method4556();
        int n4 = (int)((long)-7688971 ^ (long)-7688971);
        object.add(jPanel);
        jTextArea3.setWrapStyleWord((boolean)((long)1672887245 ^ (long)1672887244));
        jTextArea3.setEditable((boolean)((long)265105864 ^ (long)265105864));
        jTextArea3.setFocusable(((int)-1793007596L ^ 0x9520E014) != 0);
        this.Method4556().add(jTextArea3);
        object = this.Method1570();
        int n5 = (int)-182927554L ^ 0xF518BF3E;
        object.add(jTextArea3);
        object = new JScrollPane(jTextArea3);
        this.Method4556().add((Component)object);
        ((JScrollPane)object).setHorizontalScrollBarPolicy((int)((long)136072944 ^ (long)136072945) << 5);
        ((JScrollPane)object).setVerticalScrollBarPolicy(((int)-1067440534L ^ 0xC0602661) << 1);
        lykufhPOEnCHuwIMw0o30bjFnsTt0nqG2.Field13016 = jTextArea = jTextArea2;
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
        int n = (int)-1323243095L ^ 0xB120E9A9;
        int n2 = charSequence.length() > 0 ? (int)((long)820463191 ^ (long)820463190) : (int)1261376754L ^ 0x4B2F14F2;
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
        jTextArea4.setCaretPosition(jTextArea5.getLineStartOffset(jTextArea6.getLineCount() - (int)((long)-1246724719 ^ (long)-1246724720)));
    }

    public lykufhPOEnCHuwIMw0o30bjFnsTt0nqG() {
        super("Console");
    }

    public static final lykufhPOEnCHuwIMw0o30bjFnsTt0nqG Method4559() {
        return Field13017;
    }

    public static final void Method4560(lykufhPOEnCHuwIMw0o30bjFnsTt0nqG lykufhPOEnCHuwIMw0o30bjFnsTt0nqG2) {
        Field13017 = lykufhPOEnCHuwIMw0o30bjFnsTt0nqG2;
    }

    private static String Method1573(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-72529233L ^ 0xFBAD4AAF;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-2116572209L ^ 0x81D7AB30);
            int n2 = ((int)-2043948447L ^ 0x862BD212) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)664400326 ^ (long)664377105) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

