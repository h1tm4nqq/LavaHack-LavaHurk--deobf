//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import net.minecraft.item.*;
import kotlin.*;
import com.kisman.cc.mixin.mixins.accessor.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.client.*;
import net.minecraft.client.network.*;
import net.minecraft.inventory.*;
import java.util.*;
import java.util.function.*;

@Class794
@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\b\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u000208H\u0016J\b\u0010:\u001a\u000208H\u0002J\b\u0010;\u001a\u000208H\u0002J\b\u0010<\u001a\u000208H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e?\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004?\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004?\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b@FX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0019\u0010!\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e?\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010$\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e?\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0'X\u0082\u0004?\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020\u001cX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001e\"\u0004\b-\u0010 R\u000e\u0010.\u001a\u00020/X\u0082\u0004?\u0006\u0002\n\u0000R\u001a\u00100\u001a\u00020\u0011X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0013\"\u0004\b2\u0010\u0015R\u0011\u00103\u001a\u000204?\u0006\b\n\u0000\u001a\u0004\b5\u00106?\u0006=" }, d2 = { "Lcom/kisman/cc/features/module/client/PingBypass;", "Lcom/kisman/cc/features/module/Module;", "()V", "friendSerializer", "Lcom/kisman/cc/features/pingbypass/serializer/friend/FriendSerializer;", "handled", "", "ip", "", "getIp", "()Ljava/lang/String;", "setIp", "(Ljava/lang/String;)V", "noRender", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "ping", "", "getPing", "()J", "setPing", "(J)V", "pings", "value", "port", "getPort", "setPort", "portInt", "", "getPortInt", "()I", "setPortInt", "(I)V", "positionRange", "getPositionRange", "()Lcom/kisman/cc/settings/Setting;", "protocol", "getProtocol", "receive", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "send", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "serverPing", "getServerPing", "setServerPing", "settingSerializer", "Lcom/kisman/cc/features/pingbypass/serializer/setting/SettingSerializer;", "startTime", "getStartTime", "setStartTime", "timer", "Lcom/kisman/cc/util/TimerUtils;", "getTimer", "()Lcom/kisman/cc/util/TimerUtils;", "onDisable", "", "onEnable", "reset", "resetSerializers", "update", "kisman.cc" })
public final class Class1409 extends Class42
{
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
        return Class1409.Field14365;
    }
    
    public final void Method5539(@NotNull @NotNull final String field14365) {
        Intrinsics.checkParameterIsNotNull((Object)field14365, "<set-?>");
        Class1409.Field14365 = field14365;
    }
    
    @NotNull
    @NotNull
    public final String Method5540() {
        return Class1409.Field14366;
    }
    
    public final void Method5541(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "value");
        final Integer value = Integer.valueOf(s);
        Intrinsics.checkExpressionValueIsNotNull((Object)value, "Integer.valueOf(value)");
        Class1409.Field14367 = value;
        Class1409.Field14366 = s;
    }
    
    public final int Method5542() {
        return Class1409.Field14367;
    }
    
    public final void Method5543(final int field14367) {
        Class1409.Field14367 = field14367;
    }
    
    @NotNull
    @NotNull
    public final Class650 Method5544() {
        return Class1409.Field14368;
    }
    
    public final long Method5545() {
        return Class1409.Field14369;
    }
    
    public final void Method5546(final long field14369) {
        Class1409.Field14369 = field14369;
    }
    
    public final int Method5547() {
        return Class1409.Field14370;
    }
    
    public final void Method5548(final int field14370) {
        Class1409.Field14370 = field14370;
    }
    
    public final long Method5549() {
        return Class1409.Field14371;
    }
    
    public final void Method5550(final long field14371) {
        Class1409.Field14371 = field14371;
    }
    
    public final Class44 Method5551() {
        return Class1409.Field14375;
    }
    
    public final Class44 Method5552() {
        return Class1409.Field14378;
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
        Class1796.Field16242.Method706(Class1409.Field14379);
        Class1796.Field16242.Method706(Class1409.Field14380);
    }
    
    @Override
    public void Method39() {
        super.Method39();
        this.Method5553();
        Class1796.Field16242.Method711(Class1409.Field14379);
        Class1796.Field16242.Method711(Class1409.Field14380);
    }
    
    private final void Method5553() {
        if (Method5555().player == null || Method5555().world == null) {
            return;
        }
        Class2150.Method7738();
        this.Method5554();
        Class1409.Field14368.Method2801();
    }
    
    private final void Method5554() {
        Class1409.Field14373.Method3052();
        Class1409.Field14374.Method6485();
    }
    
    @Override
    public void Method45() {
        final Class650 field14368 = Class1409.Field14368;
        final Class44 field14369 = Class1409.Field14376;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14369, "pings");
        if (field14368.Method2797(field14369.Method369())) {
            final Minecraft method5555 = Method5555();
            Intrinsics.checkExpressionValueIsNotNull((Object)method5555, "mc");
            final NetHandlerPlayClient getConnection = method5555.getConnection();
            if (getConnection != null) {
                final int n = 1;
                final int n2 = -1337;
                final int n3 = 1;
                final ClickType pickup = ClickType.PICKUP;
                final ItemStack EMPTY = ItemStack.EMPTY;
                final Container openContainer = Method5555().player.openContainer;
                if (openContainer == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorContainer");
                }
                final CPacketClickWindow cPacketClickWindow = new CPacketClickWindow(n, n2, n3, pickup, EMPTY, ((AccessorContainer)openContainer).Method3021());
                final CPacketKeepAlive cPacketKeepAlive = new CPacketKeepAlive(-1337L);
                Class1409.Field14369 = System.currentTimeMillis();
                Class1409.Field14372 = false;
                getConnection.sendPacket((Packet)cPacketClickWindow);
                getConnection.sendPacket((Packet)cPacketKeepAlive);
            }
            Class1409.Field14368.Method2801();
        }
    }
    
    private Class1409() {
        super("PingBypass", "Connects you to server via custom proxy", Class97.Field8339);
    }
    
    static {
        final Class1409 class1409 = Field14381 = new Class1409();
        Class1409.Field14365 = "";
        Class1409.Field14366 = "";
        Class1409.Field14367 = 1234;
        Field14368 = new Class650();
        Class1409.Field14370 = -1;
        Class1409.Field14371 = -1L;
        Field14373 = new Class730(new ArrayList());
        Field14374 = new Class1685();
        Field14375 = class1409.Method23(new Class44("Protocol", class1409, Class1963.Field17038));
        Field14376 = class1409.Method23(new Class44("Pings", class1409, Double.longBitsToDouble(4662219572839972864L), Double.longBitsToDouble((long)1952693874 ^ 0x407F40007463BE72L), Double.longBitsToDouble(4666723172467343360L), Class467.Field9943));
        Field14377 = class1409.Method23(new Class44("No Render", class1409, false));
        Field14378 = class1409.Method23(new Class44("Position Range", class1409, Double.longBitsToDouble((long)1104148389 ^ 0x4014000041CFF7A5L), 0.0, Double.longBitsToDouble((long)1328322212 ^ 0x40C388004F2C96A4L), true));
        class1409.Method44(Class1706.Field15894);
        Field14379 = new Class618((Class254)Class1339.Field14118, new Predicate[0]);
        Field14380 = new Class618(Class2146.Field17818, new Predicate[0]);
    }
    
    public static final Minecraft Method5555() {
        return Class42.Field8052;
    }
    
    public static final void Method5556(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final void Method5557(final Class1409 class1409) {
        class1409.Method5554();
    }
    
    public static final boolean Method5558(final Class1409 class1409) {
        return Class1409.Field14372;
    }
    
    public static final void Method5559(final Class1409 class1409, final boolean field14372) {
        Class1409.Field14372 = field14372;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x104B ^ 0x8A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
