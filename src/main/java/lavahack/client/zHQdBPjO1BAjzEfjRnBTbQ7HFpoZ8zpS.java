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
import lavahack.client.ADIF586Nr0L3HddvBETPsOnmnXQkvbXn;
import lavahack.client.GMX4zGkGCEBL3RzM3pAccbEOC6fgYiKM;
import lavahack.client.HQv69u03MmDc5JddqhzH80Lj7sen5Y1g;
import lavahack.client.LwZUS91bj5naxmiTjtsJTJv2vNP9ZO4U;
import lavahack.client.QpgBaCfOoQn5tSTArKxOEf86HiNmIZqt;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.i0A1zmXu5xZh0tT6upTRrJAS9eBA7AvD;
import lavahack.client.n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextFormatting;
import org.jetbrains.annotations.NotNull;

@GMX4zGkGCEBL3RzM3pAccbEOC6fgYiKM
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2={"Lcom/kisman/cc/features/module/client/FriendHighlight;", "Lcom/kisman/cc/features/module/Module;", "()V", "COLOR_FORMATTER", "Lcom/kisman/cc/util/minecraft/Formatter;", "cache", "Lcom/kisman/cc/util/collections/LimitedSortedMap;", "", "color", "Lcom/kisman/cc/settings/types/SettingArray;", "style", "modify", "line", "modifyLine", "kisman.cc"})
public final class zHQdBPjO1BAjzEfjRnBTbQ7HFpoZ8zpS
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private static final QpgBaCfOoQn5tSTArKxOEf86HiNmIZqt Field13030;
    private static final HQv69u03MmDc5JddqhzH80Lj7sen5Y1g Field13031;
    private static final HQv69u03MmDc5JddqhzH80Lj7sen5Y1g Field13032;
    private static final i0A1zmXu5xZh0tT6upTRrJAS9eBA7AvD Field13033;
    public static final zHQdBPjO1BAjzEfjRnBTbQ7HFpoZ8zpS Field13034;
    private String Field13035 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final String Method4564(@NotNull @NotNull String string) {
        String string2;
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"line");
        if (this.Method35() && zHQdBPjO1BAjzEfjRnBTbQ7HFpoZ8zpS.Method4566().player != null && zHQdBPjO1BAjzEfjRnBTbQ7HFpoZ8zpS.Method4566().world != null) {
            string2 = (String)Field13033.get(string);
            if (string2 != null) {
                return string2;
            }
            String string3 = this.Method4565(string);
            int n = (int)-1646491159L ^ 0x9DDC89E9;
            int n2 = (int)((long)1684764162 ^ (long)1684764162);
            String string4 = string3;
            int n3 = (int)((long)1232661476 ^ (long)1232661476);
            Map map = Field13033;
            String string5 = string;
            String string6 = string4;
            int n4 = (int)((long)-1337501672 ^ (long)-1337501672);
            map.put(string5, string6);
            string2 = string3;
            return string2;
        }
        string2 = string;
        return string2;
    }

    private final String Method4565(String string) {
        String string2 = string;
        n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI2 = n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086;
        Intrinsics.checkExpressionValueIsNotNull((Object)n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI2, (String)"FriendManager.instance");
        Iterator iterator = n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI2.Method3039().iterator();
        while (iterator.hasNext()) {
            String string3;
            String string4 = string3 = (String)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)string4, (String)"friend");
            string2 = StringsKt.replace((String)string2, (String)string4, (String)(((QpgBaCfOoQn5tSTArKxOEf86HiNmIZqt)Field13032.Method3886()).Method2769() + ((QpgBaCfOoQn5tSTArKxOEf86HiNmIZqt)Field13031.Method3886()).Method2769() + string3 + TextFormatting.RESET), (boolean)((long)-1418397274 ^ (long)-1418397273));
        }
        return string2;
    }

    private zHQdBPjO1BAjzEfjRnBTbQ7HFpoZ8zpS() {
        super("FriendHighlight", "Highlights your friends at tab, chat, nametags and other places", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8339);
    }

    static {
        zHQdBPjO1BAjzEfjRnBTbQ7HFpoZ8zpS zHQdBPjO1BAjzEfjRnBTbQ7HFpoZ8zpS2;
        Field13034 = zHQdBPjO1BAjzEfjRnBTbQ7HFpoZ8zpS2 = new zHQdBPjO1BAjzEfjRnBTbQ7HFpoZ8zpS();
        String string = TextFormatting.AQUA.getFriendlyName();
        Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"TextFormatting.AQUA.friendlyName");
        Field13030 = new QpgBaCfOoQn5tSTArKxOEf86HiNmIZqt(TextFormatting.AQUA, string, ADIF586Nr0L3HddvBETPsOnmnXQkvbXn.Field9559);
        Field13031 = new HQv69u03MmDc5JddqhzH80Lj7sen5Y1g("Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)zHQdBPjO1BAjzEfjRnBTbQ7HFpoZ8zpS2, Field13030, (List)LwZUS91bj5naxmiTjtsJTJv2vNP9ZO4U.Method6838()).Method3890();
        Field13032 = new HQv69u03MmDc5JddqhzH80Lj7sen5Y1g("Style", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)zHQdBPjO1BAjzEfjRnBTbQ7HFpoZ8zpS2, LwZUS91bj5naxmiTjtsJTJv2vNP9ZO4U.Method6837(), (List)LwZUS91bj5naxmiTjtsJTJv2vNP9ZO4U.Method6839()).Method3890();
        Field13033 = new i0A1zmXu5xZh0tT6upTRrJAS9eBA7AvD((int)((long)1186154184 ^ (long)1186154193) << 1);
    }

    public static final Minecraft Method4566() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method4567(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-690147666L ^ 0xD6DD2EAE;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)258846880L ^ 0xF6DB05F);
            int n2 = (int)904864518L ^ 0x35EF2343;
            cArray2[n] = (char)(cArray[n] ^ (((int)1180006055L ^ 0x465576D0) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

