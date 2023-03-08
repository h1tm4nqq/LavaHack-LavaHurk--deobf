//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.text.*;
import kotlin.jvm.internal.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b?\u0006\f" }, d2 = { "Lcom/kisman/cc/gui/mainmenu/gui/MainMenuController;", "", "()V", "elements", "Ljava/util/ArrayList;", "Lcom/kisman/cc/gui/mainmenu/gui/element/elements/TextElement;", "Lkotlin/collections/ArrayList;", "getElements", "()Ljava/util/ArrayList;", "draw", "", "init", "kisman.cc" })
public final class Class49
{
    @NotNull
    private final ArrayList Field8143;
    private String Field8144 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final ArrayList Method431() {
        return this.Field8143;
    }
    
    public final void Method432() {
        int n = 1;
        final Class1840 e = new Class1840(TextFormatting.WHITE.toString() + Class1796.Method6783() + " " + TextFormatting.GRAY + Class1796.Method6785(), 1.0, (double)n);
        this.Field8143.add(e);
        final Class379 method1845 = Class379.Method1845();
        Intrinsics.checkExpressionValueIsNotNull((Object)method1845, "PluginManager.getInstance()");
        final Map method1846 = method1845.Method1850();
        Intrinsics.checkExpressionValueIsNotNull((Object)method1846, "PluginManager.getInstance().configs");
        for (final Map.Entry<K, Object> entry : method1846.entrySet()) {
            ++n;
            final StringBuilder sb = new StringBuilder();
            final Class1669 value = entry.getValue();
            Intrinsics.checkExpressionValueIsNotNull((Object)value, "config.value");
            final StringBuilder append = sb.append(value.Method6439()).append(' ').append(TextFormatting.GRAY);
            final Class1669 value2 = entry.getValue();
            Intrinsics.checkExpressionValueIsNotNull((Object)value2, "config.value");
            this.Field8143.add(new Class1840(append.append(value2.Method6440()).toString(), 1.0, (n - 1) * e.Method2380() + n));
        }
    }
    
    public final void Method433() {
        final Iterator<Class1840> iterator = this.Field8143.iterator();
        while (iterator.hasNext()) {
            iterator.next().Method2379();
        }
    }
    
    public Class49() {
        this.Field8143 = new ArrayList();
    }
    
    private static String Method434(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x397B ^ 0xD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
