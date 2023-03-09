//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.text.TextFormatting
 */
package lavahack.client;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lavahack.client.Class1674;
import lavahack.client.Class1813;
import lavahack.client.Class372;
import lavahack.client.Class42;
import lavahack.client.Class640;
import lavahack.client.Class726;
import lavahack.client.Class794;
import lavahack.client.Class941;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextFormatting;
import org.jetbrains.annotations.NotNull;

@Class794
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2={"Lcom/kisman/cc/features/module/client/FriendHighlight;", "Lcom/kisman/cc/features/module/Module;", "()V", "COLOR_FORMATTER", "Lcom/kisman/cc/util/minecraft/Formatter;", "cache", "Lcom/kisman/cc/util/collections/LimitedSortedMap;", "", "color", "Lcom/kisman/cc/settings/types/SettingArray;", "style", "modify", "line", "modifyLine", "kisman.cc"})
public final class Class1119
extends Class42 {
    private static final Class640 Field13030;
    private static final Class941 Field13031;
    private static final Class941 Field13032;
    private static final Class1674 Field13033;
    public static final Class1119 Field13034;
    private String Field13035 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final String Method4564(@NotNull @NotNull String string) {
        String string2;
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"line");
        if (this.Method35() && Class1119.Method4566().player != null && Class1119.Method4566().world != null) {
            string2 = (String)Field13033.get(string);
            if (string2 != null) {
                return string2;
            }
            String string3 = this.Method4565(string);
            boolean bl = false;
            boolean bl2 = false;
            String string4 = string3;
            boolean bl3 = false;
            Map map = Field13033;
            String string5 = string;
            String string6 = string4;
            boolean bl4 = false;
            map.put(string5, string6);
            string2 = string3;
            return string2;
        }
        string2 = string;
        return string2;
    }

    private final String Method4565(String string) {
        String string2 = string;
        Class726 class726 = Class726.Field11086;
        Intrinsics.checkExpressionValueIsNotNull((Object)class726, (String)"FriendManager.instance");
        Iterator iterator = class726.Method3039().iterator();
        while (iterator.hasNext()) {
            String string3;
            String string4 = string3 = (String)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)string4, (String)"friend");
            string2 = StringsKt.replace((String)string2, (String)string4, (String)(((Class640)Field13032.Method3886()).Method2769() + ((Class640)Field13031.Method3886()).Method2769() + string3 + TextFormatting.RESET), (boolean)true);
        }
        return string2;
    }

    private Class1119() {
        super("FriendHighlight", "Highlights your friends at tab, chat, nametags and other places", Class97.Field8339);
    }

    static {
        Class1119 class1119;
        Field13034 = class1119 = new Class1119();
        String string = TextFormatting.AQUA.getFriendlyName();
        Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"TextFormatting.AQUA.friendlyName");
        Field13030 = new Class640(TextFormatting.AQUA, string, Class372.Field9559);
        Field13031 = new Class941("Color", (Class42)class1119, Field13030, (List)Class1813.Method6838()).Method3890();
        Field13032 = new Class941("Style", (Class42)class1119, Class1813.Method6837(), (List)Class1813.Method6839()).Method3890();
        Field13033 = new Class1674(50);
    }

    public static final Minecraft Method4566() {
        return Class42.Field8052;
    }

    public static final void Method4567(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 69;
            cArray2[n] = (char)(cArray[n] ^ (0xEE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

