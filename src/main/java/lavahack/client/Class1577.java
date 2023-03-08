//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;
import java.util.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\n" }, d2 = { "Lcom/kisman/cc/websockets/command/CommandManager;", "", "()V", "commands", "", "Lcom/kisman/cc/websockets/command/commands/CapeCommand;", "execute", "", "line", "", "kisman.cc" })
public final class Class1577
{
    private static final List Field15395;
    public static final Class1577 Field15396;
    private String Field15397 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final boolean Method6215(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "line");
        if (s.length() == 0) {}
        if (StringsKt.isBlank((CharSequence)s)) {
            return false;
        }
        final List split$default = StringsKt.split$default((CharSequence)s, new String[] { " " }, false, 0, 6, (Object)null);
        boolean b = false;
        for (final Class311 class311 : Class1577.Field15395) {
            if (Intrinsics.areEqual((Object)class311.Method1591(), (Object)split$default.get(0))) {
                class311.Method1590(s, split$default);
                b = true;
            }
        }
        return b;
    }
    
    private Class1577() {
    }
    
    static {
        Field15396 = new Class1577();
        Field15395 = CollectionsKt.listOf((Object)Class311.Field9323);
    }
    
    private static String Method6216(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x8AE ^ 0x5C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
