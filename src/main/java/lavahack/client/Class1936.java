//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.GenericFutureListener
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 *  net.minecraft.client.gui.GuiMainMenu
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.multiplayer.GuiConnecting
 *  net.minecraft.network.INetHandler
 *  net.minecraft.network.NetworkManager
 *  net.minecraft.network.Packet
 *  net.minecraft.network.handshake.client.C00Handshake
 *  net.minecraft.network.play.server.SPacketDisconnect
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 */
package lavahack.client;

import com.kisman.cc.mixin.mixins.accessor.AccessorC00Handshake;
import com.kisman.cc.util.Class2142;
import io.netty.util.concurrent.GenericFutureListener;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lavahack.client.Class1340;
import lavahack.client.Class1524;
import lavahack.client.Class218;
import lavahack.client.Class737;
import lavahack.client.Class875;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.GuiConnecting;
import net.minecraft.network.INetHandler;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.handshake.client.C00Handshake;
import net.minecraft.network.play.server.SPacketDisconnect;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class Class1936
implements Runnable {
    final NetworkManager Field16972;
    final C00Handshake Field16973;
    private int Field16974;

    @Override
    public final void run() {
        Object object;
        if (Class218.Field8954.Method1254()) {
            object = new TextComponentString("This PingBypass is currently in use1");
            this.Field16972.sendPacket((Packet)new SPacketDisconnect((ITextComponent)object), (GenericFutureListener)new Class875(this, (TextComponentString)object), new GenericFutureListener[0]);
        }
        Class218.Field8954.Method1255(true);
        Class218.Field8954.Method1257(this.Field16972);
        if (this.Field16973 != null) {
            C00Handshake c00Handshake = this.Field16973;
            if (c00Handshake == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorC00Handshake");
            }
            if (((AccessorC00Handshake)c00Handshake).Method1992() != null) {
                Class1340.Method5396("Joining other server...");
                C00Handshake c00Handshake2 = this.Field16973;
                if (c00Handshake2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorC00Handshake");
                }
                Object object2 = object = ((AccessorC00Handshake)c00Handshake2).Method1992();
                Intrinsics.checkExpressionValueIsNotNull((Object)object2, (String)"ipRaw");
                Object object3 = StringsKt.contains$default((CharSequence)((CharSequence)object2), (CharSequence)"\u0000FML\u0000", (boolean)false, (int)2, null) ? (String)StringsKt.split$default((CharSequence)((CharSequence)object), (String[])new String[]{"\u0000"}, (boolean)false, (int)0, (int)6, null).get(0) : object;
                C00Handshake c00Handshake3 = this.Field16973;
                if (c00Handshake3 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorC00Handshake");
                }
                int n = ((AccessorC00Handshake)c00Handshake3).Method1993();
                this.Field16972.setNetHandler((INetHandler)new Class737(this.Field16972));
                GuiScreen guiScreen = Class2142.Field17803.currentScreen;
                if (guiScreen == null) {
                    guiScreen = (GuiScreen)new GuiMainMenu();
                }
                C00Handshake c00Handshake4 = this.Field16973;
                if (c00Handshake4 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorC00Handshake");
                }
                Class2142.Field17803.displayGuiScreen((GuiScreen)new GuiConnecting(guiScreen, Class2142.Field17803, (String)object3, ((AccessorC00Handshake)c00Handshake4).Method1993()));
                return;
            }
        }
        if (Class2142.Field17803.world != null && Class2142.Field17803.player != null) {
            this.Field16972.setNetHandler((INetHandler)new Class737(this.Field16972));
            object = Class2142.Field17803.currentServerData;
            return;
        }
        this.Field16972.setNetHandler((INetHandler)new Class1524(this.Field16972));
    }

    Class1936(NetworkManager networkManager, C00Handshake c00Handshake) {
        this.Field16972 = networkManager;
        this.Field16973 = c00Handshake;
    }

    private static String Method7198(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 11;
            cArray2[n] = (char)(cArray[n] ^ (0xC8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

