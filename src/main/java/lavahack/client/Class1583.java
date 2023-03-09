//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$RenderTickEvent
 */
package lavahack.client;

import lavahack.client.Class1479;
import lavahack.client.Class46;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class Class1583 {
    public static final Class1583 Field15411 = new Class1583();
    private final Minecraft Field15412 = Minecraft.getMinecraft();
    private String Field15413 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Class1583() {
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6227(TickEvent.RenderTickEvent renderTickEvent) {
        Class1479 class1479 = Class46.Field8122;
        Class46.Field8129 = class1479 != null ? this.Method6228(class1479, 1.0f) : null;
    }

    private RayTraceResult Method6228(Class1479 class1479, float f) {
        Entity entity = this.Field15412.getRenderViewEntity();
        if (entity == null) {
            return null;
        }
        double d = this.Field15412.playerController.getBlockReachDistance();
        double d2 = entity.posX;
        double d3 = entity.posY;
        double d4 = entity.posZ;
        entity.posX -= (double)class1479.Field14896.Field7895;
        entity.posY -= (double)class1479.Field14896.Field7896;
        entity.posZ -= (double)class1479.Field14896.Field7897;
        Vec3d vec3d = entity.getPositionEyes(f);
        Vec3d vec3d2 = entity.getLook(f);
        Vec3d vec3d3 = vec3d.add(vec3d2.x * d, vec3d2.y * d, vec3d2.z * d);
        entity.posX = d2;
        entity.posY = d3;
        entity.posZ = d4;
        return class1479.rayTraceBlocks(vec3d, vec3d3, false, false, true);
    }
}

