//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.network.NetHandlerPlayClient
 *  net.minecraft.inventory.ClickType
 *  net.minecraft.inventory.Container
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketClickWindow
 *  net.minecraft.network.play.client.CPacketKeepAlive
 */
package lavahack.client;

import com.kisman.cc.mixin.mixins.accessor.AccessorContainer;
import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.ArrayList;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Ae54RnIwbg7SoWtuZ7PlwALpmfX3oW19;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.GMX4zGkGCEBL3RzM3pAccbEOC6fgYiKM;
import lavahack.client.HgENA9hIACLwL9pxmOjZq1Q6z5yrTsa6;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.PUEvqz0Yhx2nMzEMkA760LC8xbWmYt77;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ$1;
import lavahack.client.XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.nKWdlEU3333EJhWdhz5amNYJ5b0i1ijm;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketClickWindow;
import net.minecraft.network.play.client.CPacketKeepAlive;
import org.jetbrains.annotations.NotNull;

@GMX4zGkGCEBL3RzM3pAccbEOC6fgYiKM
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u000208H\u0016J\b\u0010:\u001a\u000208H\u0002J\b\u0010;\u001a\u000208H\u0002J\b\u0010<\u001a\u000208H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0019\u0010!\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010$\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001e\"\u0004\b-\u0010 R\u000e\u0010.\u001a\u00020/X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00100\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0013\"\u0004\b2\u0010\u0015R\u0011\u00103\u001a\u000204\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106\u00a8\u0006="}, d2={"Lcom/kisman/cc/features/module/client/PingBypass;", "Lcom/kisman/cc/features/module/Module;", "()V", "friendSerializer", "Lcom/kisman/cc/features/pingbypass/serializer/friend/FriendSerializer;", "handled", "", "ip", "", "getIp", "()Ljava/lang/String;", "setIp", "(Ljava/lang/String;)V", "noRender", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "ping", "", "getPing", "()J", "setPing", "(J)V", "pings", "value", "port", "getPort", "setPort", "portInt", "", "getPortInt", "()I", "setPortInt", "(I)V", "positionRange", "getPositionRange", "()Lcom/kisman/cc/settings/Setting;", "protocol", "getProtocol", "receive", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "send", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "serverPing", "getServerPing", "setServerPing", "settingSerializer", "Lcom/kisman/cc/features/pingbypass/serializer/setting/SettingSerializer;", "startTime", "getStartTime", "setStartTime", "timer", "Lcom/kisman/cc/util/TimerUtils;", "getTimer", "()Lcom/kisman/cc/util/TimerUtils;", "onDisable", "", "onEnable", "reset", "resetSerializers", "update", "kisman.cc"})
public final class XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    @NotNull
    private static String Field14365;
    @NotNull
    private static String Field14366;
    private static int Field14367;
    @NotNull
    private static final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field14368;
    private static long Field14369;
    private static int Field14370;
    private static long Field14371;
    private static boolean Field14372;
    private static final Ae54RnIwbg7SoWtuZ7PlwALpmfX3oW19 Field14373;
    private static final HgENA9hIACLwL9pxmOjZq1Q6z5yrTsa6 Field14374;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14375;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14376;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14377;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14378;
    private static final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field14379;
    private static final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field14380;
    public static final XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ Field14381;
    private String Field14382 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final String Method5538() {
        return Field14365;
    }

    public final void Method5539(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"<set-?>");
        Field14365 = string;
    }

    @NotNull
    @NotNull
    public final String Method5540() {
        return Field14366;
    }

    public final void Method5541(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"value");
        Integer n = Integer.valueOf(string);
        Intrinsics.checkExpressionValueIsNotNull((Object)n, (String)"Integer.valueOf(value)");
        Field14367 = n;
        Field14366 = string;
    }

    public final int Method5542() {
        return Field14367;
    }

    public final void Method5543(int n) {
        Field14367 = n;
    }

    @NotNull
    @NotNull
    public final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Method5544() {
        return Field14368;
    }

    public final long Method5545() {
        return Field14369;
    }

    public final void Method5546(long l) {
        Field14369 = l;
    }

    public final int Method5547() {
        return Field14370;
    }

    public final void Method5548(int n) {
        Field14370 = n;
    }

    public final long Method5549() {
        return Field14371;
    }

    public final void Method5550(long l) {
        Field14371 = l;
    }

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method5551() {
        return Field14375;
    }

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method5552() {
        return Field14378;
    }

    @Override
    public void Method38() {
        if (xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG.Field8954.Method1262()) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1886("Cannot enable PingBypass module on PingBypass server!");
            this.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG = (int)((long)1210174213 ^ (long)1210174213);
            return;
        }
        super.Method38();
        this.Method5553();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(Field14379);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(Field14380);
    }

    @Override
    public void Method39() {
        super.Method39();
        this.Method5553();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(Field14379);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(Field14380);
    }

    private final void Method5553() {
        if (XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Method5555().player == null) return;
        if (XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Method5555().world == null) {
            return;
        }
        nKWdlEU3333EJhWdhz5amNYJ5b0i1ijm.Method7738();
        this.Method5554();
        Field14368.Method2801();
    }

    private final void Method5554() {
        Field14373.Method3052();
        Field14374.Method6485();
    }

    @Override
    public void Method45() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Field14376;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"pings");
        if (!Field14368.Method2797(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method369())) return;
        Minecraft minecraft = XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Method5555();
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"mc");
        NetHandlerPlayClient netHandlerPlayClient = minecraft.getConnection();
        if (netHandlerPlayClient != null) {
            Container container = XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Method5555().player.openContainer;
            if (container == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorContainer");
            }
            CPacketClickWindow cPacketClickWindow = new CPacketClickWindow((int)-1932169812L ^ 0x8CD56DAD, (int)((long)-9777471 ^ (long)9778182), (int)((long)-941577144 ^ (long)-941577143), ClickType.PICKUP, ItemStack.EMPTY, ((AccessorContainer)container).Method3021());
            CPacketKeepAlive cPacketKeepAlive = new CPacketKeepAlive(0xFFFFFFFFFFFFFAD7L & 0xFFFFFFFFFFFFFBE7L);
            Field14369 = System.currentTimeMillis();
            Field14372 = (int)((long)872509830 ^ (long)872509830);
            netHandlerPlayClient.sendPacket((Packet)cPacketClickWindow);
            netHandlerPlayClient.sendPacket((Packet)cPacketKeepAlive);
        }
        Field14368.Method2801();
    }

    private XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ() {
        super("PingBypass", "Connects you to server via custom proxy", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8339);
    }

    static {
        XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ xAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ;
        Field14381 = xAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ = new XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ();
        Field14365 = "";
        Field14366 = "";
        Field14367 = (int)((long)-60915677 ^ (long)-60915126) << 1;
        Field14368 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
        Field14370 = (int)((long)345152944 ^ (long)-345152945);
        Field14371 = 0xFFFFFFFFFFFFFFFFL & 0xFFFFFFFFFFFFFFFFL;
        Field14373 = new Ae54RnIwbg7SoWtuZ7PlwALpmfX3oW19(new ArrayList());
        Field14374 = new HgENA9hIACLwL9pxmOjZq1Q6z5yrTsa6();
        Field14375 = xAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Protocol", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)xAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ, PUEvqz0Yhx2nMzEMkA760LC8xbWmYt77.Field17038));
        Field14376 = xAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Pings", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)xAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ, Double.longBitsToDouble(0x94D00D32A4FCB9CEL ^ 0xD4638532A4FCB9CEL), Double.longBitsToDouble((long)1952693874 ^ 0x407F40007463BE72L), Double.longBitsToDouble(0x6FBD58867AB08CA4L ^ 0x2F7ED0867AB08CA4L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943));
        Field14377 = xAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("No Render", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)xAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ, (boolean)((long)-1138630110 ^ (long)-1138630110)));
        Field14378 = xAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Position Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)xAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ, Double.longBitsToDouble((long)1104148389 ^ 0x4014000041CFF7A5L), 0.0, Double.longBitsToDouble((long)1328322212 ^ 0x40C388004F2C96A4L), (boolean)((long)735607002 ^ (long)735607003)));
        super.Method44(XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ$1.Field15894);
        Field14379 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field14118, new Predicate[(int)1489718309L ^ 0x58CB4C25]);
        Field14380 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17818, new Predicate[(int)-849504609L ^ 0xCD5D969F]);
    }

    public static final Minecraft Method5555() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method5556(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final void Method5557(XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ xAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ) {
        xAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Method5554();
    }

    public static final boolean Method5558(XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ xAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ) {
        XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ xAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ2 = xAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ;
        return Field14372;
    }

    public static final void Method5559(XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ xAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ, boolean bl) {
        XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ xAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ2 = xAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ;
        Field14372 = bl;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1408656918L ^ 0xAC0999EA;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-975108995L ^ 0xC5E10482);
            int n2 = ((int)-1972444124L ^ 0x8A6EE461) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)1735937718L ^ 0x67785EFD ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

