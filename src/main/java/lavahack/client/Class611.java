//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.ai.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;

public class Class611 extends EntityLookHelper
{
    private String Field10607 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class611(final EntityLiving entityLiving) {
        super(entityLiving);
    }
    
    public void onUpdateLook() {
        this.entity.rotationPitch = 0.0f;
        if (this.isLooking) {
            this.isLooking = false;
            final double n = this.posX - this.entity.posX;
            final double n2 = this.posY - (this.entity.posY + this.entity.getEyeHeight());
            final double n3 = this.posZ - this.entity.posZ;
            final double n4 = MathHelper.sqrt(n * n + n3 * n3);
            final float n5 = (float)(tan(n3, n) * Double.longBitsToDouble(4640537203540230144L) / Double.longBitsToDouble(4614256656552045848L)) - Float.intBitsToFloat(1119092736);
            this.entity.rotationPitch = this.updateRotation(this.entity.rotationPitch, (float)(-(tan(n2, n4) * Double.longBitsToDouble(4640537203540230144L) / Double.longBitsToDouble((long)215694147 ^ 0x400921FB589F165BL))), this.deltaLookPitch);
            this.entity.rotationYawHead = this.updateRotation(this.entity.rotationYawHead, n5, this.deltaLookYaw);
        }
        else {
            this.entity.rotationYawHead = this.updateRotation(this.entity.rotationYawHead, this.entity.renderYawOffset, Float.intBitsToFloat(1092616192));
        }
        final float wrapDegrees = MathHelper.wrapDegrees(this.entity.rotationYawHead - this.entity.renderYawOffset);
        if (!this.entity.getNavigator().noPath()) {
            if (wrapDegrees < Float.intBitsToFloat(-1030356992)) {
                this.entity.rotationYawHead = this.entity.renderYawOffset - Float.intBitsToFloat(1117126656);
            }
            if (wrapDegrees > Float.intBitsToFloat(1117126656)) {
                this.entity.rotationYawHead = this.entity.renderYawOffset + Float.intBitsToFloat(1117126656);
            }
        }
    }
    
    public static float tan(final double n, final double n2) {
        return Class1155.Method4679(n, n2);
    }
}
