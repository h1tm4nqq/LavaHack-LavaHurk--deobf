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
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.Mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.Mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.EnumPacketDirection;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000RB\u0010\b\u001a6\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n\u0012\u0004\u0012\u00020\f0\tj\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000RB\u0010\u0013\u001a6\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n\u0012\u0004\u0012\u00020\f0\tj\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0005*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2={"Lcom/kisman/cc/features/module/player/PacketFeatures;", "Lcom/kisman/cc/features/module/Module;", "()V", "canceller", "Lcom/kisman/cc/settings/types/SettingGroup;", "kotlin.jvm.PlatformType", "cancellerCPackets", "cancellerPackets", "cancellerPacketsMap", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lnet/minecraft/network/Packet;", "Lcom/kisman/cc/settings/Setting;", "Lkotlin/collections/HashMap;", "cancellerSPackets", "cancellerState", "logger", "loggerCPackets", "loggerPackets", "loggerPacketsMap", "loggerSPackets", "loggerState", "receive", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "send", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "onDisable", "", "onEnable", "processField", "", "obj", "", "field", "Ljava/lang/reflect/Field;", "kisman.cc"})
public final class Mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field7919 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Canceller", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field7920;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field7921;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field7922;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field7923;
    private final HashMap Field7924;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field7925;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field7926;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field7927;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field7928;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field7929;
    private final HashMap Field7930;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field7931;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field7932;
    private String Field7933 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field7931);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field7932);
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field7931);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field7932);
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

    public Mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP() {
        super("PacketFeatures", "Cancels/logs minecraft packets :>", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8341);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Canceller State", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)277150286L ^ 0x1084FA4E) != 0).Method355("State");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"Setting(\"Canceller State\u2026 false).setTitle(\"State\")");
        this.Field7920 = this.Method23(this.Field7919.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2));
        this.Field7921 = this.Method24(this.Field7919.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packets", this))));
        this.Field7922 = this.Method24(this.Field7921.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CPackets", this))));
        this.Field7923 = this.Method24(this.Field7921.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SPackets", this))));
        this.Field7924 = new HashMap();
        this.Field7925 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Logger", this)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Logger State", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1775160144 ^ (long)1775160144)).Method355("State");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"Setting(\"Logger State\", \u2026 false).setTitle(\"State\")");
        this.Field7926 = this.Method23(this.Field7925.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3));
        this.Field7927 = this.Method24(this.Field7925.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packets", this))));
        this.Field7928 = this.Method24(this.Field7927.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CPackets", this))));
        this.Field7929 = this.Method24(this.Field7927.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SPackets", this))));
        this.Field7930 = new HashMap();
        EnumConnectionState enumConnectionState = EnumConnectionState.PLAY;
        if (enumConnectionState == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorEnumConnectionState");
        }
        Map map = ((AccessorEnumConnectionState)enumConnectionState).Method1048();
        Iterator iterator = map.keySet().iterator();
        block0: while (true) {
            if (!iterator.hasNext()) {
                this.Field7931 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)new Mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this), new Predicate[(int)-1948832537L ^ 0x8BD72CE7]);
                this.Field7932 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)new Mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this), new Predicate[(int)((long)-378305789 ^ (long)-378305789)]);
                return;
            }
            EnumPacketDirection enumPacketDirection = (EnumPacketDirection)iterator.next();
            xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2 = null;
            xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3 = null;
            if (enumPacketDirection == EnumPacketDirection.SERVERBOUND) {
                xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl4 = this.Field7922;
                Intrinsics.checkExpressionValueIsNotNull((Object)xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl4, (String)"cancellerCPackets");
                xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2 = xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl4;
                xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl5 = this.Field7928;
                Intrinsics.checkExpressionValueIsNotNull((Object)xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl5, (String)"loggerCPackets");
                xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3 = xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl5;
            } else {
                xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl6 = this.Field7923;
                Intrinsics.checkExpressionValueIsNotNull((Object)xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl6, (String)"cancellerSPackets");
                xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2 = xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl6;
                xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl7 = this.Field7929;
                Intrinsics.checkExpressionValueIsNotNull((Object)xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl7, (String)"loggerSPackets");
                xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3 = xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl7;
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
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Canceller " + clazz.getSimpleName(), (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1661491623 ^ (long)1661491623)).Method355(clazz.getSimpleName());
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"Setting(\"Canceller ${pac\u2026tTitle(packet.simpleName)");
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Method23(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4));
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"register(cancellerGroup.\u2026itle(packet.simpleName)))");
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5;
                int n = (int)1689881038L ^ 0x64B989CE;
                map2.put(clazz3, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6);
                map2 = this.Field7930;
                clazz3 = clazz;
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Logger " + clazz.getSimpleName(), (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-789335370L ^ 0xD0F3B2B6) != 0).Method355(clazz.getSimpleName());
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"Setting(\"Logger ${packet\u2026tTitle(packet.simpleName)");
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8 = this.Method23(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7));
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8, (String)"register(loggerGroup.add\u2026itle(packet.simpleName)))");
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8;
                n = (int)-744307908L ^ 0xD3A2C33C;
                map2.put(clazz3, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6);
            }
            break;
        }
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method225(Mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP) {
        return mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP.Field7920;
    }

    public static final HashMap Method226(Mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP) {
        return mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP.Field7924;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method227(Mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP) {
        return mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP.Field7926;
    }

    public static final HashMap Method228(Mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP) {
        return mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP.Field7930;
    }

    public static final String Method229(Mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP, Object object, Field field) {
        return mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP.Method224(object, field);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1535521362L ^ 0xA479CDAE;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-918370728L ^ 0xC942C6A7);
            int n2 = ((int)-390012174L ^ 0xE8C0E2C7) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)429338436 ^ (long)429342127) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

