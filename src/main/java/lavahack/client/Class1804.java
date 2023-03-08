//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.fml.relauncher.*;
import net.minecraft.client.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.*;

@SideOnly(Side.CLIENT)
public class Class1804 extends RenderPig
{
    private final Minecraft Field16311;
    private String Field16312 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1804(final RenderManager renderManager, final Minecraft field16311) {
        super(renderManager);
        this.Field16311 = field16311;
    }
    
    public void doRender(final EntityPig entityPig, final double n, double n2, final double n3, final float n4, final float n5) {
        if (this.Field16311.player.getRidingEntity() == entityPig) {
            n2 -= Double.longBitsToDouble((long)877562951 ^ 0x3FE00000344E8C47L);
        }
        super.doRender((EntityLiving)entityPig, n, n2, n3, n4, n5);
    }
    
    public void doRender(final EntityLiving entityLiving, final double n, final double n2, final double n3, final float n4, final float n5) {
        this.doRender((EntityPig)entityLiving, n, n2, n3, n4, n5);
    }
    
    public void doRender(final EntityLivingBase entityLivingBase, final double n, final double n2, final double n3, final float n4, final float n5) {
        this.doRender((EntityPig)entityLivingBase, n, n2, n3, n4, n5);
    }
    
    public void doRender(final Entity entity, final double n, final double n2, final double n3, final float n4, final float n5) {
        this.doRender((EntityPig)entity, n, n2, n3, n4, n5);
    }
}
