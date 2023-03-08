//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.util.text.*;
import kotlin.text.*;
import java.util.*;
import net.minecraft.client.*;

@Class794
@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u000e" }, d2 = { "Lcom/kisman/cc/features/module/client/FriendHighlight;", "Lcom/kisman/cc/features/module/Module;", "()V", "COLOR_FORMATTER", "Lcom/kisman/cc/util/minecraft/Formatter;", "cache", "Lcom/kisman/cc/util/collections/LimitedSortedMap;", "", "color", "Lcom/kisman/cc/settings/types/SettingArray;", "style", "modify", "line", "modifyLine", "kisman.cc" })
public final class Class1119 extends Class42
{
    private static final Class640 Field13030;
    private static final Class941 Field13031;
    private static final Class941 Field13032;
    private static final Class1674 Field13033;
    public static final Class1119 Field13034;
    private String Field13035 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final String Method4564(@NotNull @NotNull final String key) {
        Intrinsics.checkParameterIsNotNull((Object)key, "line");
        String s;
        if (this.Method35() && Method4566().player != null && Method4566().world != null) {
            if ((s = Class1119.Field13033.get(key)) == null) {
                final String method4565 = this.Method4565(key);
                Class1119.Field13033.put(key, method4565);
                s = method4565;
            }
        }
        else {
            s = key;
        }
        return s;
    }
    
    private final String Method4565(final String s) {
        String replace = s;
        final Class726 field11086 = Class726.Field11086;
        Intrinsics.checkExpressionValueIsNotNull((Object)field11086, "FriendManager.instance");
        for (final String str : field11086.Method3039()) {
            final String s2 = replace;
            final String s3 = str;
            Intrinsics.checkExpressionValueIsNotNull((Object)s3, "friend");
            replace = StringsKt.replace(s2, s3, new StringBuilder().append(((Class640)Class1119.Field13032.Method3886()).Method2769()).append(((Class640)Class1119.Field13031.Method3886()).Method2769()).append(str).append(TextFormatting.RESET).toString(), true);
        }
        return replace;
    }
    
    private Class1119() {
        super("FriendHighlight", "Highlights your friends at tab, chat, nametags and other places", Class97.Field8339);
    }
    
    static {
        final Class1119 class1119 = Field13034 = new Class1119();
        final TextFormatting aqua = TextFormatting.AQUA;
        final String getFriendlyName = TextFormatting.AQUA.getFriendlyName();
        Intrinsics.checkExpressionValueIsNotNull((Object)getFriendlyName, "TextFormatting.AQUA.friendlyName");
        Field13030 = new Class640(aqua, getFriendlyName, Class372.Field9559);
        Field13031 = new Class941("Color", class1119, Class1119.Field13030, Class1813.Method6838()).Method3890();
        Field13032 = new Class941("Style", class1119, Class1813.Method6837(), Class1813.Method6839()).Method3890();
        Field13033 = new Class1674(50);
    }
    
    public static final Minecraft Method4566() {
        return Class42.Field8052;
    }
    
    public static final void Method4567(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xEE ^ 0x45));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
