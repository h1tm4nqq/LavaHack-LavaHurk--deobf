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
import lavahack.client.O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraft.util.math.Vec3d;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "kotlin.jvm.PlatformType", "invoke"})
final class O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    final O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6 Field17303;
    private int Field17304;

    @Override
    public void Method979(Object object) {
        this.Method7481((TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV)object);
    }

    public final void Method7481(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        Packet packet;
        block22: {
            double d;
            double d2;
            double d3;
            block21: {
                double d4;
                double d5;
                double d6;
                TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2 = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
                Intrinsics.checkExpressionValueIsNotNull((Object)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2, (String)"it");
                packet = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2.Method982();
                if (!(packet instanceof SPacketPlayerPosLook)) return;
                Set set = ((SPacketPlayerPosLook)packet).flags;
                if (set.contains(SPacketPlayerPosLook.EnumFlags.X)) {
                    double d7 = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2430().player.posX;
                    Vec3d vec3d = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2432(this.Field17303);
                    Double d8 = vec3d != null ? Double.valueOf(vec3d.x) : null;
                    if (d8 == null) {
                        Intrinsics.throwNpe();
                    }
                    d6 = d7 + d8;
                } else {
                    Vec3d vec3d = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2432(this.Field17303);
                    Double d9 = vec3d != null ? Double.valueOf(vec3d.x) : null;
                    if (d9 == null) {
                        Intrinsics.throwNpe();
                    }
                    d6 = d3 = d9.doubleValue();
                }
                if (set.contains(SPacketPlayerPosLook.EnumFlags.Y)) {
                    double d10 = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2430().player.posY;
                    Vec3d vec3d = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2432(this.Field17303);
                    Double d11 = vec3d != null ? Double.valueOf(vec3d.y) : null;
                    if (d11 == null) {
                        Intrinsics.throwNpe();
                    }
                    d5 = d10 + d11;
                } else {
                    Vec3d vec3d = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2432(this.Field17303);
                    Double d12 = vec3d != null ? Double.valueOf(vec3d.y) : null;
                    if (d12 == null) {
                        Intrinsics.throwNpe();
                    }
                    d5 = d2 = d12.doubleValue();
                }
                if (set.contains(SPacketPlayerPosLook.EnumFlags.Z)) {
                    double d13 = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2430().player.posZ;
                    Vec3d vec3d = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2432(this.Field17303);
                    Double d14 = vec3d != null ? Double.valueOf(vec3d.z) : null;
                    if (d14 == null) {
                        Intrinsics.throwNpe();
                    }
                    d4 = d13 + d14;
                } else {
                    Vec3d vec3d = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2432(this.Field17303);
                    Double d15 = vec3d != null ? Double.valueOf(vec3d.z) : null;
                    if (d15 == null) {
                        Intrinsics.throwNpe();
                    }
                    d4 = d15;
                }
                d = d4;
                Vec3d vec3d = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2432(this.Field17303);
                Double d16 = vec3d != null ? Double.valueOf(vec3d.x) : null;
                if (d16 == null) {
                    Intrinsics.throwNpe();
                }
                if (d3 != d16) break block21;
                Vec3d vec3d2 = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2432(this.Field17303);
                Double d17 = vec3d2 != null ? Double.valueOf(vec3d2.y) : null;
                if (d17 == null) {
                    Intrinsics.throwNpe();
                }
                if (d2 != d17) break block21;
                Vec3d vec3d3 = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2432(this.Field17303);
                Double d18 = vec3d3 != null ? Double.valueOf(vec3d3.z) : null;
                if (d18 == null) {
                    Intrinsics.throwNpe();
                }
                if (d == d18) break block22;
            }
            O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2433(this.Field17303, new Vec3d(d3, d2, d));
            Object[] objectArray = new Object[(int)((long)-1922669253 ^ (long)-1922669256)];
            int n = (int)((long)491174302 ^ (long)491174302);
            Vec3d vec3d = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2432(this.Field17303);
            Double d19 = vec3d != null ? Double.valueOf(vec3d.x) : null;
            if (d19 == null) {
                Intrinsics.throwNpe();
            }
            objectArray[n] = d19;
            int n2 = (int)((long)1091103683 ^ (long)1091103682);
            Vec3d vec3d4 = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2432(this.Field17303);
            Double d20 = vec3d4 != null ? Double.valueOf(vec3d4.y) : null;
            if (d20 == null) {
                Intrinsics.throwNpe();
            }
            objectArray[n2] = d20;
            int n3 = ((int)2134816250L ^ 0x7F3EB5FB) << 1;
            Vec3d vec3d5 = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2432(this.Field17303);
            Double d21 = vec3d5 != null ? Double.valueOf(vec3d5.z) : null;
            if (d21 == null) {
                Intrinsics.throwNpe();
            }
            objectArray[n3] = d21;
            String string = String.format("Rollback set to (%.2f, %.2f, %.2f)", objectArray);
            Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"java.lang.String.format(\u2026z!!\n                    )");
            this.Field17303.Method437(string);
        }
        O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2435(this.Field17303, ((SPacketPlayerPosLook)packet).teleportId);
    }

    O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6 o1wfrBba1z1C4gxnTtwfHkAxEr02HOc6) {
        this.Field17303 = o1wfrBba1z1C4gxnTtwfHkAxEr02HOc6;
    }

    private static String Method7482(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)965009608 ^ (long)965009608);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-734781548 ^ (long)-734781589);
            int n2 = (int)((long)523030778 ^ (long)523030613);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-2114464430 ^ (long)-2114464587) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

