//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import java.net.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.network.*;
import net.minecraft.network.*;
import net.minecraft.network.handshake.client.*;
import net.minecraft.network.login.client.*;
import net.minecraft.client.settings.*;
import net.minecraft.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016?\u0006\u0004" }, d2 = { "com/kisman/cc/features/pingbypass/gui/GuiConnectingPingBypass$connect$1", "Ljava/lang/Thread;", "run", "", "kisman.cc" })
public final class Class729 extends Thread
{
    final Class1086 Field11095;
    final String Field11096;
    final int Field11097;
    final String Field11098;
    final int Field11099;
    private String Field11100 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void run() {
        final InetAddress inetAddress = null;
        if (Class1086.access$getCancel$p(this.Field11095)) {
            return;
        }
        final InetAddress byName = InetAddress.getByName(this.Field11096);
        final Class1086 field11095 = this.Field11095;
        final InetAddress inetAddress2 = byName;
        if (inetAddress2 == null) {
            Intrinsics.throwNpe();
        }
        final int field11096 = this.Field11097;
        final GameSettings gameSettings = this.Field11095.mc.gameSettings;
        Intrinsics.checkExpressionValueIsNotNull((Object)gameSettings, "mc.gameSettings");
        Class1086.access$setNetworkManager$p(field11095, NetworkManager.createNetworkManagerAndConnect(inetAddress2, field11096, gameSettings.isUsingNativeTransport()));
        final NetworkManager access$getNetworkManager$p = Class1086.access$getNetworkManager$p(this.Field11095);
        if (access$getNetworkManager$p != null) {
            final NetworkManager access$getNetworkManager$p2 = Class1086.access$getNetworkManager$p(this.Field11095);
            if (access$getNetworkManager$p2 == null) {
                Intrinsics.throwNpe();
            }
            access$getNetworkManager$p.setNetHandler((INetHandler)new NetHandlerLoginClient(access$getNetworkManager$p2, this.Field11095.mc, Class1086.access$getPreviousGuiScreen$p(this.Field11095)));
        }
        final Class44 method5551 = Class1409.Field14381.Method5551();
        Intrinsics.checkExpressionValueIsNotNull((Object)method5551, "PingBypass.protocol");
        if (method5551.Method341() == Class1963.Field17037 || (Intrinsics.areEqual((Object)this.Field11096, (Object)this.Field11098) && this.Field11097 == this.Field11099)) {
            final NetworkManager access$getNetworkManager$p3 = Class1086.access$getNetworkManager$p(this.Field11095);
            if (access$getNetworkManager$p3 != null) {
                access$getNetworkManager$p3.sendPacket((Packet)new C00Handshake(this.Field11098, this.Field11099, EnumConnectionState.LOGIN));
            }
        }
        else {
            final NetworkManager access$getNetworkManager$p4 = Class1086.access$getNetworkManager$p(this.Field11095);
            if (access$getNetworkManager$p4 != null) {
                access$getNetworkManager$p4.sendPacket((Packet)new C00Handshake(this.Field11098, this.Field11099, EnumConnectionState.PLAY));
            }
        }
        final NetworkManager access$getNetworkManager$p5 = Class1086.access$getNetworkManager$p(this.Field11095);
        if (access$getNetworkManager$p5 != null) {
            final Session getSession = this.Field11095.mc.getSession();
            Intrinsics.checkExpressionValueIsNotNull((Object)getSession, "mc.getSession()");
            access$getNetworkManager$p5.sendPacket((Packet)new CPacketLoginStart(getSession.getProfile()));
        }
    }
    
    Class729(final Class1086 field11095, final String field11096, final int field11097, final String field11098, final int field11099, final String name) {
        this.Field11095 = field11095;
        this.Field11096 = field11096;
        this.Field11097 = field11097;
        this.Field11098 = field11098;
        this.Field11099 = field11099;
        super(name);
    }
    
    private static String Method3047(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5606 ^ 0x17));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
