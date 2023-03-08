//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.util;

import net.minecraft.entity.*;
import net.minecraft.util.math.*;

public class Class1421
{
    private String Field14617 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static Vec3d Method5676(final Entity entity, final float n) {
        return new Vec3d(entity.lastTickPosX, entity.lastTickPosY, entity.lastTickPosZ).add(Method5677(entity, n));
    }
    
    public static Vec3d Method5677(final Entity entity, final double n) {
        return Method5678(entity, n, n, n);
    }
    
    public static Vec3d Method5678(final Entity entity, final double n, final double n2, final double n3) {
        return new Vec3d((entity.posX - entity.lastTickPosX) * n, (entity.posY - entity.lastTickPosY) * n2, (entity.posZ - entity.lastTickPosZ) * n3);
    }
    
    public static Vec3d Method5679(final Entity entity, final float n) {
        return new Vec3d(entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * n, entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * n, entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * n);
    }
    
    public static boolean Method5680(final double n, final double n2, final double n3) {
        final double n4 = n + n3;
        final double n5 = n - n3;
        return n2 <= n4 && n2 >= n5;
    }
}
