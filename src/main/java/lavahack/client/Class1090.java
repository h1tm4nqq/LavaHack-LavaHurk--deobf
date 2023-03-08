//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n?\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "event", "Lcom/kisman/cc/event/events/client/console/ConsoleMessageEvent;", "invoke" })
final class Class1090 implements Class254
{
    final Class264 Field12886;
    private String Field12887 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method979(final Object o) {
        this.Method4465((Class967)o);
    }
    
    public final void Method4465(@NotNull @NotNull final Class967 class967) {
        Intrinsics.checkParameterIsNotNull((Object)class967, "event");
        Class264.Method1437(this.Field12886).add(class967.Method3968());
    }
    
    Class1090(final Class264 field12886) {
        this.Field12886 = field12886;
    }
    
    private static String Method4466(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x72E ^ 0x14));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
