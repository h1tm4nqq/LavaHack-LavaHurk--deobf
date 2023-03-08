//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;

public class Class1583
{
    public static final Class1583 Field15411;
    private final Minecraft Field15412;
    private String Field15413 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1583() {
        this.Field15412 = Minecraft.getMinecraft();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method6227(final TickEvent$RenderTickEvent tickEvent$RenderTickEvent) {
        final Class1479 field8122 = Class46.Field8122;
        Class46.Field8129 = ((field8122 != null) ? this.Method6228(field8122, 1.0f) : null);
    }
    
    private RayTraceResult Method6228(final Class1479 class1479, final float n) {
        final Entity getRenderViewEntity = this.Field15412.getRenderViewEntity();
        if (getRenderViewEntity == null) {
            return null;
        }
        final double n2 = this.Field15412.playerController.getBlockReachDistance();
        final double posX = getRenderViewEntity.posX;
        final double posY = getRenderViewEntity.posY;
        final double posZ = getRenderViewEntity.posZ;
        final Entity entity = getRenderViewEntity;
        entity.posX -= class1479.Field14896.Field7895;
        final Entity entity2 = getRenderViewEntity;
        entity2.posY -= class1479.Field14896.Field7896;
        final Entity entity3 = getRenderViewEntity;
        entity3.posZ -= class1479.Field14896.Field7897;
        final Vec3d getPositionEyes = getRenderViewEntity.getPositionEyes(n);
        final Vec3d getLook = getRenderViewEntity.getLook(n);
        final Vec3d add = getPositionEyes.add(getLook.x * n2, getLook.y * n2, getLook.z * n2);
        getRenderViewEntity.posX = posX;
        getRenderViewEntity.posY = posY;
        getRenderViewEntity.posZ = posZ;
        return class1479.rayTraceBlocks(getPositionEyes, add, false, false, true);
    }
    
    static {
        Field15411 = new Class1583();
    }
}
