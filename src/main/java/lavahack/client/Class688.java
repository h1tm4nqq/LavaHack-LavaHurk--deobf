/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import lavahack.client.Class517;
import net.minecraft.util.math.Vec3d;

public class Class688 {
    private final Vec3d Field10903;
    private final Vec3d Field10904;
    byte Field10905;
    final Class517 Field10906;
    private String Field10907 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class688(Class517 class517, Vec3d vec3d, Vec3d vec3d2) {
        this.Field10906 = class517;
        this.Field10903 = vec3d;
        this.Field10904 = vec3d2;
    }

    Vec3d Method2897() {
        return this.Field10903;
    }

    Vec3d Method2898() {
        return this.Field10904;
    }

    boolean Method2899() {
        this.Field10905 = (byte)(this.Field10905 + 1);
        if (this.Field10905 <= 20) return false;
        return true;
    }
}

