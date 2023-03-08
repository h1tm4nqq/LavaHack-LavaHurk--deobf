//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006?\u0006\n" }, d2 = { "Lcom/kisman/cc/util/net/discord/DiscordWebhookSender$Companion;", "", "()V", "send", "", "webhook", "", "color", "Lcom/kisman/cc/util/Colour;", "title", "kisman.cc" })
public final class Class1922
{
    private String Field16932 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final void Method7174(@NotNull @NotNull final String s, @NotNull @NotNull final Class2027 class2027, @NotNull @NotNull final String s2) {
        Intrinsics.checkParameterIsNotNull((Object)s, "webhook");
        Intrinsics.checkParameterIsNotNull((Object)class2027, "color");
        Intrinsics.checkParameterIsNotNull((Object)s2, "title");
        final Class1073 class2028 = new Class1073(s);
        class2028.Method4341(new Class1215().Method4907(class2027.Method3625()).Method4904(s2));
        class2028.Method4342();
    }
    
    private Class1922() {
    }
    
    public Class1922(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    private static String Method7175(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5704 ^ 0x8E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
