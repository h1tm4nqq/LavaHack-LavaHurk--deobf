//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.Vec3d
 */
package com.kisman.cc.util;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

public class Class1421 {
    private String Field14617 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static Vec3d Method5676(Entity entity, float f) {
        return new Vec3d(entity.lastTickPosX, entity.lastTickPosY, entity.lastTickPosZ).add(Class1421.Method5677(entity, f));
    }

    public static Vec3d Method5677(Entity entity, double d) {
        return Class1421.Method5678(entity, d, d, d);
    }

    public static Vec3d Method5678(Entity entity, double d, double d2, double d3) {
        return new Vec3d((entity.posX - entity.lastTickPosX) * d, (entity.posY - entity.lastTickPosY) * d2, (entity.posZ - entity.lastTickPosZ) * d3);
    }

    public static Vec3d Method5679(Entity entity, float f) {
        return new Vec3d(entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)f, entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)f, entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)f);
    }

    public static boolean Method5680(double d, double d2, double d3) {
        double d4 = d + d3;
        double d5 = d - d3;
        if (d2 > d4) return false;
        if (d2 < d5) return false;
        return true;
    }
}

