//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import javax.swing.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import java.util.*;
import javax.swing.border.*;
import java.awt.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0010H\u0016R$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0006j\b\u0012\u0004\u0012\u00020\u0001`\u0007X\u0084\u0004?\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR$\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0006j\b\u0012\u0004\u0012\u00020\u000b`\u0007X\u0084\u0004?\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e?\u0006\u0012" }, d2 = { "Lcom/kisman/cc/loader/gui/page/Page;", "Ljavax/swing/JPanel;", "pageName", "", "(Ljava/lang/String;)V", "colorableBorders", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getColorableBorders", "()Ljava/util/ArrayList;", "fontableElements", "Ljava/awt/Component;", "getFontableElements", "getPageName", "()Ljava/lang/String;", "init", "", "updateUI", "kisman.cc" })
public abstract class Class1402 extends JPanel
{
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
        if (this.Field14348 == null || this.Field14349 == null) {
            return;
        }
        for (final JPanel panel : this.Field14348) {
            Intrinsics.checkExpressionValueIsNotNull((Object)panel, "element");
            final Border border = panel.getBorder();
            if (border == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.loader.gui.components.RoundedBorder");
            }
            ((Class2166)border).Method7807(Class1191.Method4799());
        }
        for (final Component component : this.Field14349) {
            Intrinsics.checkExpressionValueIsNotNull((Object)component, "element");
            component.setFont(Class1191.Method4802());
        }
    }
    
    @NotNull
    @NotNull
    public final String Method1572() {
        return this.Field14350;
    }
    
    public Class1402(@NotNull @NotNull final String field14350) {
        Intrinsics.checkParameterIsNotNull((Object)field14350, "pageName");
        this.Field14350 = field14350;
        this.Field14348 = new ArrayList();
        this.Field14349 = new ArrayList();
        this.setLayout(null);
    }
    
    private static String Method1573(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4485 ^ 0x88));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
