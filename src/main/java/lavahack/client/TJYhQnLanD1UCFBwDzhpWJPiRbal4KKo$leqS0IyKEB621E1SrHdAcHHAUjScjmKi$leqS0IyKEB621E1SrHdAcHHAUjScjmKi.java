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
import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import io.netty.util.concurrent.GenericFutureListener;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lavahack.client.PT7oVLihpFqxcjMFlyWXUkSu4ET7J2Ka;
import lavahack.client.TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo;
import lavahack.client.TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$1;
import lavahack.client.myVBgvqMM56TBmRqiljjSwV5NSQMObyg;
import lavahack.client.xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG;
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
final class TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements Runnable {
    final NetworkManager Field16972;
    final C00Handshake Field16973;
    private int Field16974;

    @Override
    public final void run() {
        Object object;
        if (xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG.Field8954.Method1254()) {
            object = new TextComponentString("This PingBypass is currently in use1");
            this.Field16972.sendPacket((Packet)new SPacketDisconnect((ITextComponent)object), (GenericFutureListener)new TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$1(this, (TextComponentString)object), new GenericFutureListener[(int)((long)-1972517833 ^ (long)-1972517833)]);
        }
        xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG.Field8954.Method1255(((int)-1062357766L ^ 0xC0ADB4FB) != 0);
        xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG.Field8954.Method1257(this.Field16972);
        if (this.Field16973 != null) {
            C00Handshake c00Handshake = this.Field16973;
            if (c00Handshake == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorC00Handshake");
            }
            if (((AccessorC00Handshake)c00Handshake).Method1992() != null) {
                Object object2;
                myVBgvqMM56TBmRqiljjSwV5NSQMObyg.Method5396("Joining other server...");
                C00Handshake c00Handshake2 = this.Field16973;
                if (c00Handshake2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorC00Handshake");
                }
                Object object3 = object = ((AccessorC00Handshake)c00Handshake2).Method1992();
                Intrinsics.checkExpressionValueIsNotNull((Object)object3, (String)"ipRaw");
                if (StringsKt.contains$default((CharSequence)((CharSequence)object3), (CharSequence)"\u0000FML\u0000", ((int)1306578973L ^ 0x4DE0D01D) != 0, (int)((int)((long)221110162 ^ (long)221110163) << 1), null)) {
                    String[] stringArray = new String[(int)((long)-1256179626 ^ (long)-1256179625)];
                    stringArray[(int)1962557185L ^ 0x74FA3F01] = "\u0000";
                    object2 = (String)StringsKt.split$default((CharSequence)((CharSequence)object), (String[])stringArray, ((int)-392693627L ^ 0xE897F885) != 0, (int)((int)1472262429L ^ 0x57C0F11D), (int)(((int)1112532928L ^ 0x424FE7C3) << 1), null).get((int)-1390641638L ^ 0xAD1C7E1A);
                } else {
                    object2 = object;
                }
                Object object4 = object2;
                C00Handshake c00Handshake3 = this.Field16973;
                if (c00Handshake3 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorC00Handshake");
                }
                int n = ((AccessorC00Handshake)c00Handshake3).Method1993();
                this.Field16972.setNetHandler((INetHandler)new TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo(this.Field16972));
                GuiScreen guiScreen = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.currentScreen;
                if (guiScreen == null) {
                    guiScreen = (GuiScreen)new GuiMainMenu();
                }
                C00Handshake c00Handshake4 = this.Field16973;
                if (c00Handshake4 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorC00Handshake");
                }
                Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.displayGuiScreen((GuiScreen)new GuiConnecting(guiScreen, Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803, (String)object4, ((AccessorC00Handshake)c00Handshake4).Method1993()));
                return;
            }
        }
        if (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world != null && Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player != null) {
            this.Field16972.setNetHandler((INetHandler)new TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo(this.Field16972));
            object = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.currentServerData;
            return;
        }
        this.Field16972.setNetHandler((INetHandler)new PT7oVLihpFqxcjMFlyWXUkSu4ET7J2Ka(this.Field16972));
    }

    TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(NetworkManager networkManager, C00Handshake c00Handshake) {
        this.Field16972 = networkManager;
        this.Field16973 = c00Handshake;
    }

    private static String Method7198(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)2097557236L ^ 0x7D062EF4;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-388987736 ^ (long)-388987817);
            int n2 = (int)((long)-1027936525 ^ (long)-1027936520);
            cArray2[n] = (char)(cArray[n] ^ (((int)1508313847L ^ 0x59E70AEE) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

