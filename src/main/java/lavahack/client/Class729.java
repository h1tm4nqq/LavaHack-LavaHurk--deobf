//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.network.NetHandlerLoginClient
 *  net.minecraft.client.settings.GameSettings
 *  net.minecraft.network.EnumConnectionState
 *  net.minecraft.network.INetHandler
 *  net.minecraft.network.NetworkManager
 *  net.minecraft.network.Packet
 *  net.minecraft.network.handshake.client.C00Handshake
 *  net.minecraft.network.login.client.CPacketLoginStart
 *  net.minecraft.util.Session
 */
package lavahack.client;

import java.net.InetAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1086;
import lavahack.client.Class1409;
import lavahack.client.Class1963;
import lavahack.client.Class44;
import net.minecraft.client.network.NetHandlerLoginClient;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.INetHandler;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.handshake.client.C00Handshake;
import net.minecraft.network.login.client.CPacketLoginStart;
import net.minecraft.util.Session;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"}, d2={"com/kisman/cc/features/pingbypass/gui/GuiConnectingPingBypass$connect$1", "Ljava/lang/Thread;", "run", "", "kisman.cc"})
public final class Class729
extends Thread {
    final Class1086 Field11095;
    final String Field11096;
    final int Field11097;
    final String Field11098;
    final int Field11099;
    private String Field11100 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void run() {
        InetAddress inetAddress = null;
        if (Class1086.access$getCancel$p(this.Field11095)) {
            return;
        }
        InetAddress inetAddress2 = inetAddress = InetAddress.getByName(this.Field11096);
        if (inetAddress2 == null) {
            Intrinsics.throwNpe();
        }
        GameSettings gameSettings = this.Field11095.mc.gameSettings;
        Intrinsics.checkExpressionValueIsNotNull((Object)gameSettings, (String)"mc.gameSettings");
        Class1086.access$setNetworkManager$p(this.Field11095, NetworkManager.createNetworkManagerAndConnect((InetAddress)inetAddress2, (int)this.Field11097, (boolean)gameSettings.isUsingNativeTransport()));
        NetworkManager networkManager = Class1086.access$getNetworkManager$p(this.Field11095);
        if (networkManager != null) {
            NetworkManager networkManager2 = Class1086.access$getNetworkManager$p(this.Field11095);
            if (networkManager2 == null) {
                Intrinsics.throwNpe();
            }
            networkManager.setNetHandler((INetHandler)new NetHandlerLoginClient(networkManager2, this.Field11095.mc, Class1086.access$getPreviousGuiScreen$p(this.Field11095)));
        }
        Class44 class44 = Class1409.Field14381.Method5551();
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"PingBypass.protocol");
        if (class44.Method341() == Class1963.Field17037 || Intrinsics.areEqual((Object)this.Field11096, (Object)this.Field11098) && this.Field11097 == this.Field11099) {
            NetworkManager networkManager3 = Class1086.access$getNetworkManager$p(this.Field11095);
            if (networkManager3 != null) {
                networkManager3.sendPacket((Packet)new C00Handshake(this.Field11098, this.Field11099, EnumConnectionState.LOGIN));
            }
        } else {
            NetworkManager networkManager4 = Class1086.access$getNetworkManager$p(this.Field11095);
            if (networkManager4 != null) {
                networkManager4.sendPacket((Packet)new C00Handshake(this.Field11098, this.Field11099, EnumConnectionState.PLAY));
            }
        }
        NetworkManager networkManager5 = Class1086.access$getNetworkManager$p(this.Field11095);
        if (networkManager5 == null) return;
        Session session = this.Field11095.mc.getSession();
        Intrinsics.checkExpressionValueIsNotNull((Object)session, (String)"mc.getSession()");
        networkManager5.sendPacket((Packet)new CPacketLoginStart(session.getProfile()));
    }

    Class729(Class1086 class1086, String string, int n, String string2, int n2, String string3) {
        this.Field11095 = class1086;
        this.Field11096 = string;
        this.Field11097 = n;
        this.Field11098 = string2;
        this.Field11099 = n2;
        super(string3);
    }

    private static String Method3047(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 23;
            cArray2[n] = (char)(cArray[n] ^ (0x5606 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

