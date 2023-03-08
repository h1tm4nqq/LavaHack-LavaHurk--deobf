//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.network.*;
import net.minecraft.network.handshake.client.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b?\u0006\t" }, d2 = { "Lcom/kisman/cc/pingbypass/server/nethandler/PingBypassNetHandler$Companion;", "", "()V", "onLogin", "", "manager", "Lnet/minecraft/network/NetworkManager;", "handshake", "Lnet/minecraft/network/handshake/client/C00Handshake;", "kisman.cc" })
public final class Class522
{
    private String Field10209 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final void Method2389(@NotNull @NotNull final NetworkManager networkManager, @Nullable @Nullable final C00Handshake c00Handshake) {
        Intrinsics.checkParameterIsNotNull((Object)networkManager, "manager");
        Class2142.Field17803.addScheduledTask(Class267.Method1442(Class267.Field9190, (Runnable)new Class1936(networkManager, c00Handshake)));
    }
    
    private Class522() {
    }
    
    public Class522(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    private static String Method2390(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x136D ^ 0x22));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
