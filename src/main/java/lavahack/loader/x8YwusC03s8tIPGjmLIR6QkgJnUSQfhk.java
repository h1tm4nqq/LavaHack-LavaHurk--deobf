/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.loader;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JPanel;
import javax.swing.border.Border;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.loader.JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm;
import lavahack.loader.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0010H\u0016R$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0006j\b\u0012\u0004\u0012\u00020\u0001`\u0007X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR$\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0006j\b\u0012\u0004\u0012\u00020\u000b`\u0007X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2={"Lcom/kisman/cc/loader/gui/page/Page;", "Ljavax/swing/JPanel;", "pageName", "", "(Ljava/lang/String;)V", "colorableBorders", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getColorableBorders", "()Ljava/util/ArrayList;", "fontableElements", "Ljava/awt/Component;", "getFontableElements", "getPageName", "()Ljava/lang/String;", "init", "", "updateUI", "kisman.cc"})
public abstract class x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk
extends JPanel {
    @NotNull
    private final ArrayList Field14348;
    @NotNull
    private final ArrayList Field14349;
    @NotNull
    private final String Field14350;
    private String Field14351 = "TheKisDevs & LavaHack Development owns you";

    @NotNull
    @NotNull
    protected final ArrayList Method1569() {
        return this.Field14348;
    }

    @NotNull
    @NotNull
    protected final ArrayList Method1570() {
        return this.Field14349;
    }

    public abstract void Method1571();

    @Override
    public void updateUI() {
        if (this.Field14348 == null) return;
        if (this.Field14349 == null) {
            return;
        }
        for (Component component : this.Field14348) {
            JPanel jPanel = component;
            Intrinsics.checkExpressionValueIsNotNull((Object)jPanel, (String)"element");
            Border border = jPanel.getBorder();
            if (border == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.loader.gui.components.RoundedBorder");
            }
            ((JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm)border).Method7807(vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Method4799());
        }
        Iterator iterator = this.Field14349.iterator();
        while (iterator.hasNext()) {
            Component component;
            Component component2 = component = (Component)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)component2, (String)"element");
            component2.setFont(vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Method4802());
        }
    }

    @NotNull
    @NotNull
    public final String Method1572() {
        return this.Field14350;
    }

    public x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"pageName");
        this.Field14350 = string;
        this.Field14348 = new ArrayList();
        this.Field14349 = new ArrayList();
        this.setLayout(null);
    }

    private static String Method1573(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-776870904L ^ 0xD1B1E408;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-576867482 ^ (long)-576867431);
            int n2 = (int)((long)1281156196 ^ (long)1281156213) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)-856601446L ^ 0xCCF1081F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

