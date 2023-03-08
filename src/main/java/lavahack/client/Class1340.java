//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import com.kisman.cc.util.*;
import net.minecraft.util.text.*;
import net.minecraft.client.*;
import net.minecraft.client.network.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0004" }, d2 = { "disconnectFromMC", "", "reason", "", "kisman.cc" })
public final class Class1340
{
    private String Field14120 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static final void Method5396(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "reason");
        final Minecraft field17803 = Class2142.Field17803;
        Intrinsics.checkExpressionValueIsNotNull((Object)field17803, "mc");
        if (field17803.getConnection() != null) {
            final Minecraft field17804 = Class2142.Field17803;
            Intrinsics.checkExpressionValueIsNotNull((Object)field17804, "mc");
            final NetHandlerPlayClient getConnection = field17804.getConnection();
            if (getConnection == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull((Object)getConnection, "mc.connection!!");
            getConnection.getNetworkManager().closeChannel((ITextComponent)new TextComponentString(s));
        }
    }
    
    private static String Method5397(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6343 ^ 0x3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
