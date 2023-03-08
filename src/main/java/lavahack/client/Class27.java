//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.lang.reflect.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import com.kisman.cc.mixin.mixins.accessor.*;
import net.minecraft.network.*;
import com.google.common.collect.*;
import java.util.function.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000RB\u0010\b\u001a6\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n\u0012\u0004\u0012\u00020\f0\tj\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\f0\fX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000RB\u0010\u0013\u001a6\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n\u0012\u0004\u0012\u00020\f0\tj\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0005*\u0004\u0018\u00010\f0\fX\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017X\u0082\u0004?\u0006\u0002\n\u0000?\u0006$" }, d2 = { "Lcom/kisman/cc/features/module/player/PacketFeatures;", "Lcom/kisman/cc/features/module/Module;", "()V", "canceller", "Lcom/kisman/cc/settings/types/SettingGroup;", "kotlin.jvm.PlatformType", "cancellerCPackets", "cancellerPackets", "cancellerPacketsMap", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lnet/minecraft/network/Packet;", "Lcom/kisman/cc/settings/Setting;", "Lkotlin/collections/HashMap;", "cancellerSPackets", "cancellerState", "logger", "loggerCPackets", "loggerPackets", "loggerPacketsMap", "loggerSPackets", "loggerState", "receive", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "send", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "onDisable", "", "onEnable", "processField", "", "obj", "", "field", "Ljava/lang/reflect/Field;", "kisman.cc" })
public final class Class27 extends Class42
{
    private final Class1996 Field7919;
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
    
    private final String Method224(final Object o, final Field field) {
        final StringBuilder append = new StringBuilder().append(field.getName()).append(": ");
        String str;
        if (Intrinsics.areEqual((Object)field.getType(), (Object)Integer.TYPE)) {
            str = String.valueOf(field.getInt(o));
        }
        else if (Intrinsics.areEqual((Object)field.getType(), (Object)Short.TYPE)) {
            str = String.valueOf(field.getShort(o));
        }
        else if (Intrinsics.areEqual((Object)field.getType(), (Object)Long.TYPE)) {
            str = String.valueOf(field.getLong(o));
        }
        else if (Intrinsics.areEqual((Object)field.getType(), (Object)Double.TYPE)) {
            str = String.valueOf(field.getDouble(o));
        }
        else if (Intrinsics.areEqual((Object)field.getType(), (Object)Float.TYPE)) {
            str = String.valueOf(field.getFloat(o));
        }
        else if (Intrinsics.areEqual((Object)field.getType(), (Object)String.class)) {
            str = String.valueOf(field.get(o));
        }
        else if (field.isEnumConstant()) {
            final Object value = field.get(o);
            if (value == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Enum<*>");
            }
            str = ((Enum)value).name();
        }
        else {
            str = String.valueOf(field.get(o));
        }
        return append.append(str).toString();
    }
    
    public Class27() {
        super("PacketFeatures", "Cancels/logs minecraft packets :>", Class97.Field8341);
        this.Field7919 = this.Method24(new Class1996(new Class44("Canceller", this)));
        final Class1996 field7919 = this.Field7919;
        final Class44 method355 = new Class44("Canceller State", this, false).Method355("State");
        Intrinsics.checkExpressionValueIsNotNull((Object)method355, "Setting(\"Canceller State\u2026 false).setTitle(\"State\")");
        this.Field7920 = this.Method23(field7919.Method7405(method355));
        this.Field7921 = this.Method24(this.Field7919.Method7406(new Class1996(new Class44("Packets", this))));
        this.Field7922 = this.Method24(this.Field7921.Method7406(new Class1996(new Class44("CPackets", this))));
        this.Field7923 = this.Method24(this.Field7921.Method7406(new Class1996(new Class44("SPackets", this))));
        this.Field7924 = new HashMap();
        this.Field7925 = this.Method24(new Class1996(new Class44("Logger", this)));
        final Class1996 field7920 = this.Field7925;
        final Class44 method356 = new Class44("Logger State", this, false).Method355("State");
        Intrinsics.checkExpressionValueIsNotNull((Object)method356, "Setting(\"Logger State\", \u2026 false).setTitle(\"State\")");
        this.Field7926 = this.Method23(field7920.Method7405(method356));
        this.Field7927 = this.Method24(this.Field7925.Method7406(new Class1996(new Class44("Packets", this))));
        this.Field7928 = this.Method24(this.Field7927.Method7406(new Class1996(new Class44("CPackets", this))));
        this.Field7929 = this.Method24(this.Field7927.Method7406(new Class1996(new Class44("SPackets", this))));
        this.Field7930 = new HashMap();
        final EnumConnectionState play = EnumConnectionState.PLAY;
        if (play == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorEnumConnectionState");
        }
        final Map method357 = ((AccessorEnumConnectionState)play).Method1048();
        for (final EnumPacketDirection enumPacketDirection : method357.keySet()) {
            Class1996 class1996;
            Class1996 class1997;
            if (enumPacketDirection == EnumPacketDirection.SERVERBOUND) {
                final Class1996 field7921 = this.Field7922;
                Intrinsics.checkExpressionValueIsNotNull((Object)field7921, "cancellerCPackets");
                class1996 = field7921;
                final Class1996 field7922 = this.Field7928;
                Intrinsics.checkExpressionValueIsNotNull((Object)field7922, "loggerCPackets");
                class1997 = field7922;
            }
            else {
                final Class1996 field7923 = this.Field7923;
                Intrinsics.checkExpressionValueIsNotNull((Object)field7923, "cancellerSPackets");
                class1996 = field7923;
                final Class1996 field7924 = this.Field7929;
                Intrinsics.checkExpressionValueIsNotNull((Object)field7924, "loggerSPackets");
                class1997 = field7924;
            }
            final V value = method357.get(enumPacketDirection);
            if (value == null) {
                Intrinsics.throwNpe();
            }
            for (final Class clazz : (Set)((BiMap)value).values()) {
                final HashMap hashMap = this.Field7924;
                final Class clazz2 = clazz;
                Intrinsics.checkExpressionValueIsNotNull((Object)clazz2, "packet");
                final Class clazz3 = clazz2;
                final Class1996 class1998 = class1996;
                final Class44 method358 = new Class44("Canceller " + clazz.getSimpleName(), this, false).Method355(clazz.getSimpleName());
                Intrinsics.checkExpressionValueIsNotNull((Object)method358, "Setting(\"Canceller ${pac\u2026tTitle(packet.simpleName)");
                final Class44 method359 = this.Method23(class1998.Method7405(method358));
                Intrinsics.checkExpressionValueIsNotNull((Object)method359, "register(cancellerGroup.\u2026itle(packet.simpleName)))");
                hashMap.put(clazz3, method359);
                final HashMap hashMap2 = this.Field7930;
                final Class clazz4 = clazz;
                final Class1996 class1999 = class1997;
                final Class44 method360 = new Class44("Logger " + clazz.getSimpleName(), this, false).Method355(clazz.getSimpleName());
                Intrinsics.checkExpressionValueIsNotNull((Object)method360, "Setting(\"Logger ${packet\u2026tTitle(packet.simpleName)");
                final Class44 method361 = this.Method23(class1999.Method7405(method360));
                Intrinsics.checkExpressionValueIsNotNull((Object)method361, "register(loggerGroup.add\u2026itle(packet.simpleName)))");
                hashMap2.put(clazz4, method361);
            }
        }
        this.Field7931 = new Class618((Class254)new Class229(this), new Predicate[0]);
        this.Field7932 = new Class618((Class254)new Class1019(this), new Predicate[0]);
    }
    
    public static final Class44 Method225(final Class27 class27) {
        return class27.Field7920;
    }
    
    public static final HashMap Method226(final Class27 class27) {
        return class27.Field7924;
    }
    
    public static final Class44 Method227(final Class27 class27) {
        return class27.Field7926;
    }
    
    public static final HashMap Method228(final Class27 class27) {
        return class27.Field7930;
    }
    
    public static final String Method229(final Class27 class27, final Object o, final Field field) {
        return class27.Method224(o, field);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x25D6 ^ 0xD4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
