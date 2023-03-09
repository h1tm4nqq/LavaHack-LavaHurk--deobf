/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.EnumConnectionState
 *  net.minecraft.network.EnumPacketDirection
 */
package lavahack.client;

import com.google.common.collect.BiMap;
import com.kisman.cc.mixin.mixins.accessor.AccessorEnumConnectionState;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1019;
import lavahack.client.Class1796;
import lavahack.client.Class1996;
import lavahack.client.Class229;
import lavahack.client.Class254;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class618;
import lavahack.client.Class97;
import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.EnumPacketDirection;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000RB\u0010\b\u001a6\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n\u0012\u0004\u0012\u00020\f0\tj\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000RB\u0010\u0013\u001a6\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n\u0012\u0004\u0012\u00020\f0\tj\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0005*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2={"Lcom/kisman/cc/features/module/player/PacketFeatures;", "Lcom/kisman/cc/features/module/Module;", "()V", "canceller", "Lcom/kisman/cc/settings/types/SettingGroup;", "kotlin.jvm.PlatformType", "cancellerCPackets", "cancellerPackets", "cancellerPacketsMap", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lnet/minecraft/network/Packet;", "Lcom/kisman/cc/settings/Setting;", "Lkotlin/collections/HashMap;", "cancellerSPackets", "cancellerState", "logger", "loggerCPackets", "loggerPackets", "loggerPacketsMap", "loggerSPackets", "loggerState", "receive", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "send", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "onDisable", "", "onEnable", "processField", "", "obj", "", "field", "Ljava/lang/reflect/Field;", "kisman.cc"})
public final class Class27
extends Class42 {
    private final Class1996 Field7919 = this.Method24(new Class1996(new Class44("Canceller", this)));
    private final Class44 Field7920;
    private final Class1996 Field7921;
    private final Class1996 Field7922;
    private final Class1996 Field7923;
    private final HashMap Field7924;
    private final Class1996 Field7925;
    private final Class44 Field7926;
    private final Class1996 Field7927;
    private final Class1996 Field7928;
    private final Class1996 Field7929;
    private final HashMap Field7930;
    private final Class618 Field7931;
    private final Class618 Field7932;
    private String Field7933 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field7931);
        Class1796.Field16242.Method706(this.Field7932);
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field7931);
        Class1796.Field16242.Method711(this.Field7932);
    }

    private final String Method224(Object object, Field field) {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append(field.getName()).append(": ");
        if (Intrinsics.areEqual(field.getType(), Integer.TYPE)) {
            string = String.valueOf(field.getInt(object));
            return stringBuilder.append(string).toString();
        }
        if (Intrinsics.areEqual(field.getType(), Short.TYPE)) {
            string = String.valueOf(field.getShort(object));
            return stringBuilder.append(string).toString();
        }
        if (Intrinsics.areEqual(field.getType(), Long.TYPE)) {
            string = String.valueOf(field.getLong(object));
            return stringBuilder.append(string).toString();
        }
        if (Intrinsics.areEqual(field.getType(), Double.TYPE)) {
            string = String.valueOf(field.getDouble(object));
            return stringBuilder.append(string).toString();
        }
        if (Intrinsics.areEqual(field.getType(), Float.TYPE)) {
            string = String.valueOf(field.getFloat(object));
            return stringBuilder.append(string).toString();
        }
        if (Intrinsics.areEqual(field.getType(), String.class)) {
            string = String.valueOf(field.get(object));
            return stringBuilder.append(string).toString();
        }
        if (!field.isEnumConstant()) {
            string = String.valueOf(field.get(object));
            return stringBuilder.append(string).toString();
        }
        Object object2 = field.get(object);
        if (object2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Enum<*>");
        }
        string = ((Enum)object2).name();
        return stringBuilder.append(string).toString();
    }

    public Class27() {
        super("PacketFeatures", "Cancels/logs minecraft packets :>", Class97.Field8341);
        Class44 class44 = new Class44("Canceller State", (Class42)this, false).Method355("State");
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Setting(\"Canceller State\u2026 false).setTitle(\"State\")");
        this.Field7920 = this.Method23(this.Field7919.Method7405(class44));
        this.Field7921 = this.Method24(this.Field7919.Method7406(new Class1996(new Class44("Packets", this))));
        this.Field7922 = this.Method24(this.Field7921.Method7406(new Class1996(new Class44("CPackets", this))));
        this.Field7923 = this.Method24(this.Field7921.Method7406(new Class1996(new Class44("SPackets", this))));
        this.Field7924 = new HashMap();
        this.Field7925 = this.Method24(new Class1996(new Class44("Logger", this)));
        Class44 class442 = new Class44("Logger State", (Class42)this, false).Method355("State");
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"Setting(\"Logger State\", \u2026 false).setTitle(\"State\")");
        this.Field7926 = this.Method23(this.Field7925.Method7405(class442));
        this.Field7927 = this.Method24(this.Field7925.Method7406(new Class1996(new Class44("Packets", this))));
        this.Field7928 = this.Method24(this.Field7927.Method7406(new Class1996(new Class44("CPackets", this))));
        this.Field7929 = this.Method24(this.Field7927.Method7406(new Class1996(new Class44("SPackets", this))));
        this.Field7930 = new HashMap();
        EnumConnectionState enumConnectionState = EnumConnectionState.PLAY;
        if (enumConnectionState == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorEnumConnectionState");
        }
        Map map = ((AccessorEnumConnectionState)enumConnectionState).Method1048();
        Iterator iterator = map.keySet().iterator();
        block0: while (true) {
            if (!iterator.hasNext()) {
                this.Field7931 = new Class618((Class254)new Class229(this), new Predicate[0]);
                this.Field7932 = new Class618((Class254)new Class1019(this), new Predicate[0]);
                return;
            }
            EnumPacketDirection enumPacketDirection = (EnumPacketDirection)iterator.next();
            Class1996 class1996 = null;
            Class1996 class19962 = null;
            if (enumPacketDirection == EnumPacketDirection.SERVERBOUND) {
                Class1996 class19963 = this.Field7922;
                Intrinsics.checkExpressionValueIsNotNull((Object)class19963, (String)"cancellerCPackets");
                class1996 = class19963;
                Class1996 class19964 = this.Field7928;
                Intrinsics.checkExpressionValueIsNotNull((Object)class19964, (String)"loggerCPackets");
                class19962 = class19964;
            } else {
                Class1996 class19965 = this.Field7923;
                Intrinsics.checkExpressionValueIsNotNull((Object)class19965, (String)"cancellerSPackets");
                class1996 = class19965;
                Class1996 class19966 = this.Field7929;
                Intrinsics.checkExpressionValueIsNotNull((Object)class19966, (String)"loggerSPackets");
                class19962 = class19966;
            }
            Object v = map.get(enumPacketDirection);
            if (v == null) {
                Intrinsics.throwNpe();
            }
            Iterator iterator2 = ((Set)((BiMap)v).values()).iterator();
            while (true) {
                if (!iterator2.hasNext()) continue block0;
                Class clazz = (Class)iterator2.next();
                Map map2 = this.Field7924;
                Class clazz2 = clazz;
                Intrinsics.checkExpressionValueIsNotNull((Object)clazz2, (String)"packet");
                Class clazz3 = clazz2;
                Class44 class443 = new Class44("Canceller " + clazz.getSimpleName(), (Class42)this, false).Method355(clazz.getSimpleName());
                Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"Setting(\"Canceller ${pac\u2026tTitle(packet.simpleName)");
                Class44 class444 = this.Method23(class1996.Method7405(class443));
                Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"register(cancellerGroup.\u2026itle(packet.simpleName)))");
                Class44 class445 = class444;
                boolean bl = false;
                map2.put(clazz3, class445);
                map2 = this.Field7930;
                clazz3 = clazz;
                Class44 class446 = new Class44("Logger " + clazz.getSimpleName(), (Class42)this, false).Method355(clazz.getSimpleName());
                Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"Setting(\"Logger ${packet\u2026tTitle(packet.simpleName)");
                Class44 class447 = this.Method23(class19962.Method7405(class446));
                Intrinsics.checkExpressionValueIsNotNull((Object)class447, (String)"register(loggerGroup.add\u2026itle(packet.simpleName)))");
                class445 = class447;
                bl = false;
                map2.put(clazz3, class445);
            }
            break;
        }
    }

    public static final Class44 Method225(Class27 class27) {
        return class27.Field7920;
    }

    public static final HashMap Method226(Class27 class27) {
        return class27.Field7924;
    }

    public static final Class44 Method227(Class27 class27) {
        return class27.Field7926;
    }

    public static final HashMap Method228(Class27 class27) {
        return class27.Field7930;
    }

    public static final String Method229(Class27 class27, Object object, Field field) {
        return class27.Method224(object, field);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 212;
            cArray2[n] = (char)(cArray[n] ^ (0x25D6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

