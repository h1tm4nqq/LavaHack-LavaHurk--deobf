//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import net.minecraft.util.text.*;
import net.minecraft.client.network.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0006\u0010\u0007\u001a\u00020\u0003\u001a\u0006\u0010\b\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004?\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e?\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\t" }, d2 = { "dotTimer", "Lcom/kisman/cc/util/TimerUtils;", "dots", "", "undTimer", "disconnect", "", "getDots", "getUnderscore", "kisman.cc" })
public final class Class2150
{
    private static final Class650 Field17842;
    private static final Class650 Field17843;
    private static String Field17844;
    private String Field17845 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static final void Method7738() {
        final NetHandlerPlayClient connection = Class2142.Field17803.player.connection;
        Intrinsics.checkExpressionValueIsNotNull((Object)connection, "mc.player.connection");
        connection.getNetworkManager().closeChannel((ITextComponent)new TextComponentString("kill yourself"));
    }
    
    @NotNull
    @NotNull
    public static final String Method7739() {
        if (Class2150.Field17842.Method2797(500L)) {
            Class2150.Field17844 += ".";
            Class2150.Field17842.Method2801();
        }
        if (Class2150.Field17844.length() > 3) {
            Class2150.Field17844 = "";
        }
        return Class2150.Field17844;
    }
    
    @NotNull
    @NotNull
    public static final String Method7740() {
        String s;
        if (!Class2150.Field17843.Method2797(500L)) {
            s = "_";
        }
        else {
            if (Class2150.Field17843.Method2797(1000L)) {
                Class2150.Field17843.Method2801();
            }
            s = "";
        }
        return s;
    }
    
    static {
        Field17842 = new Class650();
        Field17843 = new Class650();
        Class2150.Field17844 = "";
    }
    
    private static String Method7741(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2797 ^ 0x58));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
