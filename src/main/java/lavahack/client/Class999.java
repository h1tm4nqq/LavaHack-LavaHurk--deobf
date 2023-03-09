/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.item.EntityEnderCrystal
 */
package lavahack.client;

import net.minecraft.entity.item.EntityEnderCrystal;

class Class999 {
    private final EntityEnderCrystal Field12291;
    private final double Field12292;
    private final double Field12293;
    private String Field12294 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class999(EntityEnderCrystal entityEnderCrystal, double d, double d2) {
        this.Field12291 = entityEnderCrystal;
        this.Field12292 = d;
        this.Field12293 = d2;
    }

    public EntityEnderCrystal Method4036() {
        return this.Field12291;
    }

    public double Method4037() {
        return this.Field12292;
    }

    public double Method4038() {
        return this.Field12293;
    }

    public Class999 Method4039(Class999 class999) {
        Class999 class9992;
        if (class999.Field12292 > this.Field12292) {
            class9992 = class999;
            return class9992;
        }
        class9992 = this;
        return class9992;
    }
}

