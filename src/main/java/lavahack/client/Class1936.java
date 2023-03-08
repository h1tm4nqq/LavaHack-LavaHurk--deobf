//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.network.handshake.client.*;
import net.minecraft.util.text.*;
import net.minecraft.network.play.server.*;
import io.netty.util.concurrent.*;
import kotlin.*;
import com.kisman.cc.mixin.mixins.accessor.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;
import net.minecraft.network.*;
import com.kisman.cc.util.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.*;
import net.minecraft.client.multiplayer.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "run" })
final class Class1936 implements Runnable
{
    final NetworkManager Field16972;
    final C00Handshake Field16973;
    private int Field16974;
    
    @Override
    public final void run() {
        if (Class218.Field8954.Method1254()) {
            final TextComponentString textComponentString = new TextComponentString("This PingBypass is currently in use1");
            this.Field16972.sendPacket((Packet)new SPacketDisconnect((ITextComponent)textComponentString), (GenericFutureListener)new Class875(this, textComponentString), new GenericFutureListener[0]);
        }
        Class218.Field8954.Method1255(true);
        Class218.Field8954.Method1257(this.Field16972);
        if (this.Field16973 != null) {
            final C00Handshake field16973 = this.Field16973;
            if (field16973 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorC00Handshake");
            }
            if (((AccessorC00Handshake)field16973).Method1992() != null) {
                Class1340.Method5396("Joining other server...");
                final C00Handshake field16974 = this.Field16973;
                if (field16974 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorC00Handshake");
                }
                final String method1992;
                final String s = method1992 = ((AccessorC00Handshake)field16974).Method1992();
                Intrinsics.checkExpressionValueIsNotNull((Object)method1992, "ipRaw");
                final String s2 = StringsKt.contains$default((CharSequence)method1992, (CharSequence)"\u0000FML\u0000", false, 2, (Object)null) ? StringsKt.split$default((CharSequence)s, new String[] { "\u0000" }, false, 0, 6, (Object)null).get(0) : s;
                final C00Handshake field16975 = this.Field16973;
                if (field16975 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorC00Handshake");
                }
                ((AccessorC00Handshake)field16975).Method1993();
                this.Field16972.setNetHandler((INetHandler)new Class737(this.Field16972));
                final Minecraft field16976 = Class2142.Field17803;
                GuiScreen currentScreen;
                if ((currentScreen = Class2142.Field17803.currentScreen) == null) {
                    currentScreen = (GuiScreen)new GuiMainMenu();
                }
                final Minecraft field16977 = Class2142.Field17803;
                final String s3 = s2;
                final C00Handshake field16978 = this.Field16973;
                if (field16978 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorC00Handshake");
                }
                field16976.displayGuiScreen((GuiScreen)new GuiConnecting(currentScreen, field16977, s3, ((AccessorC00Handshake)field16978).Method1993()));
                return;
            }
        }
        if (Class2142.Field17803.world == null || Class2142.Field17803.player == null) {
            this.Field16972.setNetHandler((INetHandler)new Class1524(this.Field16972));
        }
        else {
            this.Field16972.setNetHandler((INetHandler)new Class737(this.Field16972));
            final ServerData currentServerData = Class2142.Field17803.currentServerData;
        }
    }
    
    Class1936(final NetworkManager field16972, final C00Handshake field16973) {
        this.Field16972 = field16972;
        this.Field16973 = field16973;
    }
    
    private static String Method7198(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xC8 ^ 0xB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
