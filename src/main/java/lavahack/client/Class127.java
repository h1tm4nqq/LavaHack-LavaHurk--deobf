//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import baritone.api.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.function.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u00000\u0006R\u00020\u0007?\u0006\u0002\u0010\bR\u0018\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u00000\u0006R\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\f" }, d2 = { "Lcom/kisman/cc/features/module/client/baritone/BaritoneSetting;", "T", "", "lavahackSetting", "Lcom/kisman/cc/settings/Setting;", "baritoneSetting", "Lbaritone/api/Settings$Setting;", "Lbaritone/api/Settings;", "(Lcom/kisman/cc/settings/Setting;Lbaritone/api/Settings$Setting;)V", "onChange", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/client/settings/EventSettingChange;", "kisman.cc" })
public final class Class127
{
    private final Class618 Field8437;
    private final Class44 Field8438;
    private final Settings$Setting Field8439;
    private String Field8440 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class127(@NotNull @NotNull final Class44 field8438, @NotNull @NotNull final Settings$Setting field8439) {
        Intrinsics.checkParameterIsNotNull((Object)field8438, "lavahackSetting");
        Intrinsics.checkParameterIsNotNull((Object)field8439, "baritoneSetting");
        this.Field8438 = field8438;
        this.Field8439 = field8439;
        this.Field8437 = new Class618(new Class785(this), new Predicate[0]);
        Class1796.Field16242.Method706(this.Field8437);
    }
    
    public static final Class44 Method857(final Class127 class127) {
        return class127.Field8438;
    }
    
    public static final Settings$Setting Method858(final Class127 class127) {
        return class127.Field8439;
    }
    
    private static String Method859(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4CF3 ^ 0xE1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
