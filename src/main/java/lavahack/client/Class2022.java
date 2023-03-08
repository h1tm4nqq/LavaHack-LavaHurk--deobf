//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.play.server.*;
import net.minecraft.util.math.*;
import net.minecraft.network.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "kotlin.jvm.PlatformType", "invoke" })
final class Class2022 implements Class254
{
    final Class538 Field17303;
    private int Field17304;
    
    @Override
    public void Method979(final Object o) {
        this.Method7481((Class544)o);
    }
    
    public final void Method7481(final Class544 class544) {
        Intrinsics.checkExpressionValueIsNotNull((Object)class544, "it");
        final Packet method982 = class544.Method982();
        if (method982 instanceof SPacketPlayerPosLook) {
            final Set flags = ((SPacketPlayerPosLook)method982).flags;
            double doubleValue;
            if (flags.contains(SPacketPlayerPosLook$EnumFlags.X)) {
                final double posX = Class538.Method2430().player.posX;
                final Vec3d method983 = Class538.Method2432(this.Field17303);
                final Double n = (method983 != null) ? Double.valueOf(method983.x) : null;
                if (n == null) {
                    Intrinsics.throwNpe();
                }
                doubleValue = posX + n;
            }
            else {
                final Vec3d method984 = Class538.Method2432(this.Field17303);
                final Double n2 = (method984 != null) ? Double.valueOf(method984.x) : null;
                if (n2 == null) {
                    Intrinsics.throwNpe();
                }
                doubleValue = n2;
            }
            final double n3 = doubleValue;
            double doubleValue2;
            if (flags.contains(SPacketPlayerPosLook$EnumFlags.Y)) {
                final double posY = Class538.Method2430().player.posY;
                final Vec3d method985 = Class538.Method2432(this.Field17303);
                final Double n4 = (method985 != null) ? Double.valueOf(method985.y) : null;
                if (n4 == null) {
                    Intrinsics.throwNpe();
                }
                doubleValue2 = posY + n4;
            }
            else {
                final Vec3d method986 = Class538.Method2432(this.Field17303);
                final Double n5 = (method986 != null) ? Double.valueOf(method986.y) : null;
                if (n5 == null) {
                    Intrinsics.throwNpe();
                }
                doubleValue2 = n5;
            }
            final double n6 = doubleValue2;
            double doubleValue3;
            if (flags.contains(SPacketPlayerPosLook$EnumFlags.Z)) {
                final double posZ = Class538.Method2430().player.posZ;
                final Vec3d method987 = Class538.Method2432(this.Field17303);
                final Double n7 = (method987 != null) ? Double.valueOf(method987.z) : null;
                if (n7 == null) {
                    Intrinsics.throwNpe();
                }
                doubleValue3 = posZ + n7;
            }
            else {
                final Vec3d method988 = Class538.Method2432(this.Field17303);
                final Double n8 = (method988 != null) ? Double.valueOf(method988.z) : null;
                if (n8 == null) {
                    Intrinsics.throwNpe();
                }
                doubleValue3 = n8;
            }
            final double n9 = doubleValue3;
            final double n10 = n3;
            final Vec3d method989 = Class538.Method2432(this.Field17303);
            final Double n11 = (method989 != null) ? Double.valueOf(method989.x) : null;
            if (n11 == null) {
                Intrinsics.throwNpe();
            }
            Label_0551: {
                if (n10 == n11) {
                    final double n12 = n6;
                    final Vec3d method990 = Class538.Method2432(this.Field17303);
                    final Double n13 = (method990 != null) ? Double.valueOf(method990.y) : null;
                    if (n13 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (n12 == n13) {
                        final double n14 = n9;
                        final Vec3d method991 = Class538.Method2432(this.Field17303);
                        final Double n15 = (method991 != null) ? Double.valueOf(method991.z) : null;
                        if (n15 == null) {
                            Intrinsics.throwNpe();
                        }
                        if (n14 == n15) {
                            break Label_0551;
                        }
                    }
                }
                Class538.Method2433(this.Field17303, new Vec3d(n3, n6, n9));
                final Class538 field17303 = this.Field17303;
                final String format = "Rollback set to (%.2f, %.2f, %.2f)";
                final Object[] args = new Object[3];
                final int n16 = 0;
                final Vec3d method992 = Class538.Method2432(this.Field17303);
                final Double n17 = (method992 != null) ? Double.valueOf(method992.x) : null;
                if (n17 == null) {
                    Intrinsics.throwNpe();
                }
                args[n16] = n17;
                final int n18 = 1;
                final Vec3d method993 = Class538.Method2432(this.Field17303);
                final Double n19 = (method993 != null) ? Double.valueOf(method993.y) : null;
                if (n19 == null) {
                    Intrinsics.throwNpe();
                }
                args[n18] = n19;
                final int n20 = 2;
                final Vec3d method994 = Class538.Method2432(this.Field17303);
                final Double n21 = (method994 != null) ? Double.valueOf(method994.z) : null;
                if (n21 == null) {
                    Intrinsics.throwNpe();
                }
                args[n20] = n21;
                final String format2 = String.format(format, args);
                Intrinsics.checkExpressionValueIsNotNull((Object)format2, "java.lang.String.format(\u2026z!!\n                    )");
                field17303.Method437(format2);
            }
            Class538.Method2435(this.Field17303, ((SPacketPlayerPosLook)method982).teleportId);
        }
    }
    
    Class2022(final Class538 field17303) {
        this.Field17303 = field17303;
    }
    
    private static String Method7482(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3CE ^ 0xAF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
