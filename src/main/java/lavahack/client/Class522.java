//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.NetworkManager
 *  net.minecraft.network.handshake.client.C00Handshake
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1936;
import lavahack.client.Class267;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.handshake.client.C00Handshake;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a8\u0006\t"}, d2={"Lcom/kisman/cc/pingbypass/server/nethandler/PingBypassNetHandler$Companion;", "", "()V", "onLogin", "", "manager", "Lnet/minecraft/network/NetworkManager;", "handshake", "Lnet/minecraft/network/handshake/client/C00Handshake;", "kisman.cc"})
public final class Class522 {
    private String Field10209 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method2389(@NotNull @NotNull NetworkManager networkManager, @Nullable @Nullable C00Handshake c00Handshake) {
        Intrinsics.checkParameterIsNotNull((Object)networkManager, (String)"manager");
        Class2142.Field17803.addScheduledTask(Class267.Method1442(Class267.Field9190, new Class1936(networkManager, c00Handshake)));
    }

    private Class522() {
    }

    public Class522(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method2390(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 34;
            cArray2[n] = (char)(cArray[n] ^ (0x136D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

