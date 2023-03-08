//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import java.awt.*;
import baritone.api.*;
import com.kisman.cc.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n?\u0006\u0002\b\u0006" }, d2 = { "<anonymous>", "", "T", "it", "Lcom/kisman/cc/event/events/client/settings/EventSettingChange;", "kotlin.jvm.PlatformType", "invoke" })
final class Class785 implements Class254
{
    final Class127 Field11306;
    private String Field11307 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method979(final Object o) {
        this.Method3271((Class445)o);
    }
    
    public final void Method3271(final Class445 class445) {
        if (Intrinsics.areEqual((Object)class445.Field9851, (Object)Class127.Method857(this.Field11306))) {
            final Object value = Class127.Method858(this.Field11306).value;
            if (value instanceof Boolean) {
                Class127.Method858(this.Field11306).value = Class127.Method857(this.Field11306).Method365();
            }
            else {
                if (!(value instanceof Float)) {
                    if (!(value instanceof Double)) {
                        if (!(value instanceof Integer)) {
                            if (value instanceof Color) {
                                final Settings$Setting method858 = Class127.Method858(this.Field11306);
                                final Class2027 method859 = Class127.Method857(this.Field11306).Method339();
                                Intrinsics.checkExpressionValueIsNotNull((Object)method859, "lavahackSetting.colour");
                                method858.value = method859.Method3625();
                            }
                            return;
                        }
                    }
                }
                Class127.Method858(this.Field11306).value = Class127.Method857(this.Field11306).Method367();
            }
        }
    }
    
    Class785(final Class127 field11306) {
        this.Field11306 = field11306;
    }
    
    private static String Method3272(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5C88 ^ 0xA6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
