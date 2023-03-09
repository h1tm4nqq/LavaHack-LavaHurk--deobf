//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.server.SPacketPlayerPosLook
 *  net.minecraft.network.play.server.SPacketPlayerPosLook$EnumFlags
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class254;
import lavahack.client.Class538;
import lavahack.client.Class544;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraft.util.math.Vec3d;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "kotlin.jvm.PlatformType", "invoke"})
final class Class2022
implements Class254 {
    final Class538 Field17303;
    private int Field17304;

    @Override
    public void Method979(Object object) {
        this.Method7481((Class544)object);
    }

    public final void Method7481(Class544 class544) {
        Packet packet;
        block22: {
            double d;
            double d2;
            double d3;
            block21: {
                double d4;
                double d5;
                double d6;
                Class544 class5442 = class544;
                Intrinsics.checkExpressionValueIsNotNull((Object)class5442, (String)"it");
                packet = class5442.Method982();
                if (!(packet instanceof SPacketPlayerPosLook)) return;
                Set set = ((SPacketPlayerPosLook)packet).flags;
                if (set.contains(SPacketPlayerPosLook.EnumFlags.X)) {
                    double d7 = Class538.Method2430().player.posX;
                    Vec3d vec3d = Class538.Method2432(this.Field17303);
                    Double d8 = vec3d != null ? Double.valueOf(vec3d.x) : null;
                    if (d8 == null) {
                        Intrinsics.throwNpe();
                    }
                    d6 = d7 + d8;
                } else {
                    Vec3d vec3d = Class538.Method2432(this.Field17303);
                    Double d9 = vec3d != null ? Double.valueOf(vec3d.x) : null;
                    if (d9 == null) {
                        Intrinsics.throwNpe();
                    }
                    d6 = d3 = d9.doubleValue();
                }
                if (set.contains(SPacketPlayerPosLook.EnumFlags.Y)) {
                    double d10 = Class538.Method2430().player.posY;
                    Vec3d vec3d = Class538.Method2432(this.Field17303);
                    Double d11 = vec3d != null ? Double.valueOf(vec3d.y) : null;
                    if (d11 == null) {
                        Intrinsics.throwNpe();
                    }
                    d5 = d10 + d11;
                } else {
                    Vec3d vec3d = Class538.Method2432(this.Field17303);
                    Double d12 = vec3d != null ? Double.valueOf(vec3d.y) : null;
                    if (d12 == null) {
                        Intrinsics.throwNpe();
                    }
                    d5 = d2 = d12.doubleValue();
                }
                if (set.contains(SPacketPlayerPosLook.EnumFlags.Z)) {
                    double d13 = Class538.Method2430().player.posZ;
                    Vec3d vec3d = Class538.Method2432(this.Field17303);
                    Double d14 = vec3d != null ? Double.valueOf(vec3d.z) : null;
                    if (d14 == null) {
                        Intrinsics.throwNpe();
                    }
                    d4 = d13 + d14;
                } else {
                    Vec3d vec3d = Class538.Method2432(this.Field17303);
                    Double d15 = vec3d != null ? Double.valueOf(vec3d.z) : null;
                    if (d15 == null) {
                        Intrinsics.throwNpe();
                    }
                    d4 = d15;
                }
                d = d4;
                Vec3d vec3d = Class538.Method2432(this.Field17303);
                Double d16 = vec3d != null ? Double.valueOf(vec3d.x) : null;
                if (d16 == null) {
                    Intrinsics.throwNpe();
                }
                if (d3 != d16) break block21;
                Vec3d vec3d2 = Class538.Method2432(this.Field17303);
                Double d17 = vec3d2 != null ? Double.valueOf(vec3d2.y) : null;
                if (d17 == null) {
                    Intrinsics.throwNpe();
                }
                if (d2 != d17) break block21;
                Vec3d vec3d3 = Class538.Method2432(this.Field17303);
                Double d18 = vec3d3 != null ? Double.valueOf(vec3d3.z) : null;
                if (d18 == null) {
                    Intrinsics.throwNpe();
                }
                if (d == d18) break block22;
            }
            Class538.Method2433(this.Field17303, new Vec3d(d3, d2, d));
            Object[] objectArray = new Object[3];
            Vec3d vec3d = Class538.Method2432(this.Field17303);
            Double d19 = vec3d != null ? Double.valueOf(vec3d.x) : null;
            if (d19 == null) {
                Intrinsics.throwNpe();
            }
            objectArray[0] = d19;
            Vec3d vec3d4 = Class538.Method2432(this.Field17303);
            Double d20 = vec3d4 != null ? Double.valueOf(vec3d4.y) : null;
            if (d20 == null) {
                Intrinsics.throwNpe();
            }
            objectArray[1] = d20;
            Vec3d vec3d5 = Class538.Method2432(this.Field17303);
            Double d21 = vec3d5 != null ? Double.valueOf(vec3d5.z) : null;
            if (d21 == null) {
                Intrinsics.throwNpe();
            }
            objectArray[2] = d21;
            String string = String.format("Rollback set to (%.2f, %.2f, %.2f)", objectArray);
            Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"java.lang.String.format(\u2026z!!\n                    )");
            this.Field17303.Method437(string);
        }
        Class538.Method2435(this.Field17303, ((SPacketPlayerPosLook)packet).teleportId);
    }

    Class2022(Class538 class538) {
        this.Field17303 = class538;
    }

    private static String Method7482(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 175;
            cArray2[n] = (char)(cArray[n] ^ (0x3CE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

