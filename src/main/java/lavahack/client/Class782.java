/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class2152;
import lavahack.client.Class433;
import lavahack.client.Class568;
import lavahack.client.Class670;
import lavahack.client.Class758;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0006j\b\u0012\u0004\u0012\u00020\u0001`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2={"Lcom/kisman/cc/util/render/customfont/SizechangeableFontRenderer;", "Lcom/kisman/cc/util/render/customfont/ExtendedFontRenderer;", "font", "Ljava/awt/Font;", "(Ljava/awt/Font;)V", "fonts", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "max", "Ljava/util/function/Supplier;", "", "min", "size", "getCurrentFont", "Lcom/kisman/cc/util/render/customfont/CustomFontRenderer;", "kisman.cc"})
public final class Class782
extends Class670 {
    private final ArrayList Field11296;
    private final Supplier Field11297;
    private final Supplier Field11298;
    private final Supplier Field11299;
    private int Field11300;

    @Override
    @NotNull
    @NotNull
    public Class433 Method2852() {
        Class670 class670;
        Integer n;
        Iterator iterator = this.Field11296.iterator();
        do {
            if (!iterator.hasNext()) {
                Font font = this.Method2854();
                Object t = this.Field11297.get();
                Intrinsics.checkExpressionValueIsNotNull(t, (String)"size.get()");
                Font font2 = font.deriveFont(((Number)t).intValue());
                Intrinsics.checkExpressionValueIsNotNull((Object)font2, (String)"this.font.deriveFont(size.get())");
                class670 = new Class670(font2);
                this.Field11296.add(class670);
                return class670.Method2852();
            }
            class670 = (Class670)iterator.next();
            n = (Integer)this.Field11297.get();
        } while (n == null || class670.Method2854().getSize() != n.intValue());
        return class670.Method2852();
    }

    public Class782(@NotNull @NotNull Font font) {
        Intrinsics.checkParameterIsNotNull((Object)font, (String)"font");
        super(font);
        this.Field11296 = new ArrayList();
        this.Field11297 = new Class758(font);
        this.Field11298 = Class2152.Field17847;
        this.Field11299 = Class568.Field10420;
        int n = ((Number)this.Field11298.get()).intValue();
        Object t = this.Field11299.get();
        Intrinsics.checkExpressionValueIsNotNull(t, (String)"max.get()");
        int n2 = ((Number)t).intValue();
        if (n > n2) return;
        while (true) {
            Font font2 = font.deriveFont(n);
            Intrinsics.checkExpressionValueIsNotNull((Object)font2, (String)"font.deriveFont(i)");
            this.Field11296.add(new Class670(font2));
            if (n == n2) return;
            ++n;
        }
    }

    private static String Method2855(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 105;
            cArray2[n] = (char)(cArray[n] ^ (0xE34 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

