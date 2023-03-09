/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.text.TextFormatting
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1669;
import lavahack.client.Class1796;
import lavahack.client.Class1840;
import lavahack.client.Class379;
import net.minecraft.util.text.TextFormatting;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/gui/mainmenu/gui/MainMenuController;", "", "()V", "elements", "Ljava/util/ArrayList;", "Lcom/kisman/cc/gui/mainmenu/gui/element/elements/TextElement;", "Lkotlin/collections/ArrayList;", "getElements", "()Ljava/util/ArrayList;", "draw", "", "init", "kisman.cc"})
public final class Class49 {
    @NotNull
    private final ArrayList Field8143 = new ArrayList();
    private String Field8144 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final ArrayList Method431() {
        return this.Field8143;
    }

    public final void Method432() {
        int n = 1;
        Class1840 class1840 = new Class1840(TextFormatting.WHITE.toString() + Class1796.Method6783() + " " + TextFormatting.GRAY + Class1796.Method6785(), 1.0, n);
        this.Field8143.add(class1840);
        Class379 class379 = Class379.Method1845();
        Intrinsics.checkExpressionValueIsNotNull((Object)class379, (String)"PluginManager.getInstance()");
        Map map = class379.Method1850();
        Intrinsics.checkExpressionValueIsNotNull((Object)map, (String)"PluginManager.getInstance().configs");
        Object object = map;
        boolean bl = false;
        Iterator iterator = object.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            ++n;
            StringBuilder stringBuilder = new StringBuilder();
            Object v = entry.getValue();
            Intrinsics.checkExpressionValueIsNotNull(v, (String)"config.value");
            StringBuilder stringBuilder2 = stringBuilder.append(((Class1669)v).Method6439()).append(' ').append(TextFormatting.GRAY);
            Object v2 = entry.getValue();
            Intrinsics.checkExpressionValueIsNotNull(v2, (String)"config.value");
            object = new Class1840(stringBuilder2.append(((Class1669)v2).Method6440()).toString(), 1.0, (double)(n - 1) * class1840.Method2380() + (double)n);
            this.Field8143.add(object);
        }
    }

    public final void Method433() {
        Iterator iterator = this.Field8143.iterator();
        while (iterator.hasNext()) {
            Class1840 class1840 = (Class1840)iterator.next();
            class1840.Method2379();
        }
    }

    private static String Method434(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 13;
            cArray2[n] = (char)(cArray[n] ^ (0x397B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

