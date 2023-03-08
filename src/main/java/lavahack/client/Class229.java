//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import java.util.*;
import java.lang.reflect.*;
import net.minecraft.network.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "kotlin.jvm.PlatformType", "invoke" })
final class Class229 implements Class254
{
    final Class27 Field9002;
    private int Field9003;
    
    @Override
    public void Method979(final Object o) {
        this.Method1295((Class805)o);
    }
    
    public final void Method1295(final Class805 class805) {
        final Class44 method225 = Class27.Method225(this.Field9002);
        Intrinsics.checkExpressionValueIsNotNull((Object)method225, "cancellerState");
        if (method225.Method365()) {
            final HashMap method226 = Class27.Method226(this.Field9002);
            Intrinsics.checkExpressionValueIsNotNull((Object)class805, "it");
            if (method226.containsKey(class805.Method982().getClass())) {
                final Class44 value = Class27.Method226(this.Field9002).get(class805.Method982().getClass());
                if (value == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull((Object)value, "cancellerPacketsMap[it.packet::class.java]!!");
                if (value.Method365()) {
                    class805.Method158();
                }
            }
        }
        final Class44 method227 = Class27.Method227(this.Field9002);
        Intrinsics.checkExpressionValueIsNotNull((Object)method227, "loggerState");
        if (method227.Method365()) {
            final HashMap method228 = Class27.Method228(this.Field9002);
            Intrinsics.checkExpressionValueIsNotNull((Object)class805, "it");
            if (method228.containsKey(class805.Method982().getClass())) {
                final Class44 value2 = Class27.Method228(this.Field9002).get(class805.Method982().getClass());
                if (value2 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull((Object)value2, "loggerPacketsMap[it.packet::class.java]!!");
                if (value2.Method365()) {
                    String str = "---------------------" + class805.Method982().getClass().getSimpleName();
                    for (final Field field : class805.Method982().getClass().getFields()) {
                        final StringBuilder append = new StringBuilder().append(str).append("\n\t");
                        final Class27 field2 = this.Field9002;
                        final Packet method229 = class805.Method982();
                        Intrinsics.checkExpressionValueIsNotNull((Object)method229, "it.packet");
                        final Field field3 = field;
                        Intrinsics.checkExpressionValueIsNotNull((Object)field3, "field");
                        str = append.append(Class27.Method229(field2, method229, field3)).toString();
                    }
                    if (class805.cancelled) {
                        str += "\n\tCancelled";
                    }
                    Class1393.Method5508(str + "---------------------");
                }
            }
        }
    }
    
    Class229(final Class27 field9002) {
        this.Field9002 = field9002;
    }
    
    private static String Method1296(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2973 ^ 0xC6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
