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

import lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
import lavahack.client.sYSQwf2xD3nukbcGapT2KmEMESaueLHM;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class z8ClnaMpLA5YZqxeNNf3PF4lWaFrcs6B {
    public static final z8ClnaMpLA5YZqxeNNf3PF4lWaFrcs6B Field15411 = new z8ClnaMpLA5YZqxeNNf3PF4lWaFrcs6B();
    private final Minecraft Field15412 = Minecraft.getMinecraft();
    private String Field15413 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private z8ClnaMpLA5YZqxeNNf3PF4lWaFrcs6B() {
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6227(TickEvent.RenderTickEvent renderTickEvent) {
        OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8122;
        sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8129 = oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 != null ? this.Method6228(oP4La13R7rceTBm7QSP7XXXyRxZD1Op3, 1.0f) : null;
    }

    private RayTraceResult Method6228(OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3, float f) {
        Entity entity = this.Field15412.getRenderViewEntity();
        if (entity == null) {
            return null;
        }
        double d = this.Field15412.playerController.getBlockReachDistance();
        double d2 = entity.posX;
        double d3 = entity.posY;
        double d4 = entity.posZ;
        entity.posX -= (double)oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14896.Field7895;
        entity.posY -= (double)oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14896.Field7896;
        entity.posZ -= (double)oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14896.Field7897;
        Vec3d vec3d = entity.getPositionEyes(f);
        Vec3d vec3d2 = entity.getLook(f);
        Vec3d vec3d3 = vec3d.add(vec3d2.x * d, vec3d2.y * d, vec3d2.z * d);
        entity.posX = d2;
        entity.posY = d3;
        entity.posZ = d4;
        return oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.rayTraceBlocks(vec3d, vec3d3, ((int)-894118115L ^ 0xCAB4D71D) != 0, ((int)-396638864L ^ 0xE85BC570) != 0, ((int)688309748L ^ 0x2906C5F5) != 0);
    }
}

