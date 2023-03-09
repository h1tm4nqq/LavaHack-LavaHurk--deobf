//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.ai.EntityLookHelper
 *  net.minecraft.util.math.MathHelper
 */
package lavahack.client;

import lavahack.client.Class1155;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityLookHelper;
import net.minecraft.util.math.MathHelper;

public class Class611
extends EntityLookHelper {
    private String Field10607 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class611(EntityLiving entityLiving) {
        super(entityLiving);
    }

    public void onUpdateLook() {
        this.entity.rotationPitch = 0.0f;
        if (this.isLooking) {
            this.isLooking = false;
            double d = this.posX - this.entity.posX;
            double d2 = this.posY - (this.entity.posY + (double)this.entity.getEyeHeight());
            double d3 = this.posZ - this.entity.posZ;
            double d4 = MathHelper.sqrt((double)(d * d + d3 * d3));
            float f = (float)((double)Class611.tan(d3, d) * Double.longBitsToDouble(4640537203540230144L) / Double.longBitsToDouble(4614256656552045848L)) - Float.intBitsToFloat(1119092736);
            float f2 = (float)(-((double)Class611.tan(d2, d4) * Double.longBitsToDouble(4640537203540230144L) / Double.longBitsToDouble((long)215694147 ^ 0x400921FB589F165BL)));
            this.entity.rotationPitch = this.updateRotation(this.entity.rotationPitch, f2, this.deltaLookPitch);
            this.entity.rotationYawHead = this.updateRotation(this.entity.rotationYawHead, f, this.deltaLookYaw);
        } else {
            this.entity.rotationYawHead = this.updateRotation(this.entity.rotationYawHead, this.entity.renderYawOffset, Float.intBitsToFloat(1092616192));
        }
        float f = MathHelper.wrapDegrees((float)(this.entity.rotationYawHead - this.entity.renderYawOffset));
        if (this.entity.getNavigator().noPath()) return;
        if (f < Float.intBitsToFloat(-1030356992)) {
            this.entity.rotationYawHead = this.entity.renderYawOffset - Float.intBitsToFloat(1117126656);
        }
        if (!(f > Float.intBitsToFloat(1117126656))) return;
        this.entity.rotationYawHead = this.entity.renderYawOffset + Float.intBitsToFloat(1117126656);
    }

    public static float tan(double d, double d2) {
        return Class1155.Method4679(d, d2);
    }
}

