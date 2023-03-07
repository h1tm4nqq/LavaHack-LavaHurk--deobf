//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.client.renderer.entity.RenderPig
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.passive.EntityPig
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package lavahack.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPig;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityPig;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
public class bytZXCiYJ5pK4UOFMxsh71qJv1j843RT
extends RenderPig {
    private final Minecraft Field16311;
    private String Field16312 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public bytZXCiYJ5pK4UOFMxsh71qJv1j843RT(RenderManager renderManager, Minecraft minecraft) {
        super(renderManager);
        this.Field16311 = minecraft;
    }

    public void doRender(EntityPig entityPig, double d, double d2, double d3, float f, float f2) {
        if (this.Field16311.player.getRidingEntity() == entityPig) {
            d2 -= Double.longBitsToDouble((long)877562951 ^ 0x3FE00000344E8C47L);
        }
        super.doRender((EntityLiving)entityPig, d, d2, d3, f, f2);
    }

    public void doRender(EntityLiving entityLiving, double d, double d2, double d3, float f, float f2) {
        this.doRender((EntityPig)entityLiving, d, d2, d3, f, f2);
    }

    public void doRender(EntityLivingBase entityLivingBase, double d, double d2, double d3, float f, float f2) {
        this.doRender((EntityPig)entityLivingBase, d, d2, d3, f, f2);
    }

    public void doRender(Entity entity, double d, double d2, double d3, float f, float f2) {
        this.doRender((EntityPig)entity, d, d2, d3, f, f2);
    }
}

