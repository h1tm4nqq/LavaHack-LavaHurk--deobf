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
import com.kisman.cc.util.Class650;
import java.util.ArrayList;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1339;
import lavahack.client.Class1393;
import lavahack.client.Class1685;
import lavahack.client.Class1706;
import lavahack.client.Class1796;
import lavahack.client.Class1963;
import lavahack.client.Class2146;
import lavahack.client.Class2150;
import lavahack.client.Class218;
import lavahack.client.Class254;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class618;
import lavahack.client.Class730;
import lavahack.client.Class794;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketClickWindow;
import net.minecraft.network.play.client.CPacketKeepAlive;
import org.jetbrains.annotations.NotNull;

@Class794
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u000208H\u0016J\b\u0010:\u001a\u000208H\u0002J\b\u0010;\u001a\u000208H\u0002J\b\u0010<\u001a\u000208H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0019\u0010!\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010$\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001e\"\u0004\b-\u0010 R\u000e\u0010.\u001a\u00020/X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00100\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0013\"\u0004\b2\u0010\u0015R\u0011\u00103\u001a\u000204\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106\u00a8\u0006="}, d2={"Lcom/kisman/cc/features/module/client/PingBypass;", "Lcom/kisman/cc/features/module/Module;", "()V", "friendSerializer", "Lcom/kisman/cc/features/pingbypass/serializer/friend/FriendSerializer;", "handled", "", "ip", "", "getIp", "()Ljava/lang/String;", "setIp", "(Ljava/lang/String;)V", "noRender", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "ping", "", "getPing", "()J", "setPing", "(J)V", "pings", "value", "port", "getPort", "setPort", "portInt", "", "getPortInt", "()I", "setPortInt", "(I)V", "positionRange", "getPositionRange", "()Lcom/kisman/cc/settings/Setting;", "protocol", "getProtocol", "receive", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "send", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "serverPing", "getServerPing", "setServerPing", "settingSerializer", "Lcom/kisman/cc/features/pingbypass/serializer/setting/SettingSerializer;", "startTime", "getStartTime", "setStartTime", "timer", "Lcom/kisman/cc/util/TimerUtils;", "getTimer", "()Lcom/kisman/cc/util/TimerUtils;", "onDisable", "", "onEnable", "reset", "resetSerializers", "update", "kisman.cc"})
public final class Class1409
extends Class42 {
    @NotNull
    private static String Field14365;
    @NotNull
    private static String Field14366;
    private static int Field14367;
    @NotNull
    private static final Class650 Field14368;
    private static long Field14369;
    private static int Field14370;
    private static long Field14371;
    private static boolean Field14372;
    private static final Class730 Field14373;
    private static final Class1685 Field14374;
    private static final Class44 Field14375;
    private static final Class44 Field14376;
    private static final Class44 Field14377;
    private static final Class44 Field14378;
    private static final Class618 Field14379;
    private static final Class618 Field14380;
    public static final Class1409 Field14381;
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
    public final Class650 Method5544() {
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

    public final Class44 Method5551() {
        return Field14375;
    }

    public final Class44 Method5552() {
        return Field14378;
    }

    @Override
    public void Method38() {
        if (Class218.Field8954.Method1262()) {
            Class1393.Method5504().Method1886("Cannot enable PingBypass module on PingBypass server!");
            this.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG = false;
            return;
        }
        super.Method38();
        this.Method5553();
        Class1796.Field16242.Method706(Field14379);
        Class1796.Field16242.Method706(Field14380);
    }

    @Override
    public void Method39() {
        super.Method39();
        this.Method5553();
        Class1796.Field16242.Method711(Field14379);
        Class1796.Field16242.Method711(Field14380);
    }

    private final void Method5553() {
        if (Class1409.Method5555().player == null) return;
        if (Class1409.Method5555().world == null) {
            return;
        }
        Class2150.Method7738();
        this.Method5554();
        Field14368.Method2801();
    }

    private final void Method5554() {
        Field14373.Method3052();
        Field14374.Method6485();
    }

    @Override
    public void Method45() {
        Class44 class44 = Field14376;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"pings");
        if (!Field14368.Method2797(class44.Method369())) return;
        Minecraft minecraft = Class1409.Method5555();
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"mc");
        NetHandlerPlayClient netHandlerPlayClient = minecraft.getConnection();
        if (netHandlerPlayClient != null) {
            Container container = Class1409.Method5555().player.openContainer;
            if (container == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorContainer");
            }
            CPacketClickWindow cPacketClickWindow = new CPacketClickWindow(1, -1337, 1, ClickType.PICKUP, ItemStack.EMPTY, ((AccessorContainer)container).Method3021());
            CPacketKeepAlive cPacketKeepAlive = new CPacketKeepAlive(-1337L);
            Field14369 = System.currentTimeMillis();
            Field14372 = false;
            netHandlerPlayClient.sendPacket((Packet)cPacketClickWindow);
            netHandlerPlayClient.sendPacket((Packet)cPacketKeepAlive);
        }
        Field14368.Method2801();
    }

    private Class1409() {
        super("PingBypass", "Connects you to server via custom proxy", Class97.Field8339);
    }

    static {
        Class1409 class1409;
        Field14381 = class1409 = new Class1409();
        Field14365 = "";
        Field14366 = "";
        Field14367 = 1234;
        Field14368 = new Class650();
        Field14370 = -1;
        Field14371 = -1L;
        Field14373 = new Class730(new ArrayList());
        Field14374 = new Class1685();
        Field14375 = class1409.Method23(new Class44("Protocol", (Class42)class1409, Class1963.Field17038));
        Field14376 = class1409.Method23(new Class44("Pings", (Class42)class1409, Double.longBitsToDouble(4662219572839972864L), Double.longBitsToDouble((long)1952693874 ^ 0x407F40007463BE72L), Double.longBitsToDouble(4666723172467343360L), Class467.Field9943));
        Field14377 = class1409.Method23(new Class44("No Render", (Class42)class1409, false));
        Field14378 = class1409.Method23(new Class44("Position Range", (Class42)class1409, Double.longBitsToDouble((long)1104148389 ^ 0x4014000041CFF7A5L), 0.0, Double.longBitsToDouble((long)1328322212 ^ 0x40C388004F2C96A4L), true));
        super.Method44(Class1706.Field15894);
        Field14379 = new Class618((Class254)Class1339.Field14118, new Predicate[0]);
        Field14380 = new Class618((Class254)Class2146.Field17818, new Predicate[0]);
    }

    public static final Minecraft Method5555() {
        return Class42.Field8052;
    }

    public static final void Method5556(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    public static final void Method5557(Class1409 class1409) {
        class1409.Method5554();
    }

    public static final boolean Method5558(Class1409 class1409) {
        Class1409 class14092 = class1409;
        return Field14372;
    }

    public static final void Method5559(Class1409 class1409, boolean bl) {
        Class1409 class14092 = class1409;
        Field14372 = bl;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 138;
            cArray2[n] = (char)(cArray[n] ^ (0x104B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

