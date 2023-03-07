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

import lavahack.client.Wk0rB5tCxaols7h6NITzxtpKMj2yHNue;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityLookHelper;
import net.minecraft.util.math.MathHelper;

public class YupX2HsEuHClak3p6ZEVrKr6HcDPylAS
extends EntityLookHelper {
    private String Field10607 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public YupX2HsEuHClak3p6ZEVrKr6HcDPylAS(EntityLiving entityLiving) {
        super(entityLiving);
    }

    public void onUpdateLook() {
        this.entity.rotationPitch = 0.0f;
        if (this.isLooking) {
            this.isLooking = (int)((long)382140090 ^ (long)382140090);
            double d = this.posX - this.entity.posX;
            double d2 = this.posY - (this.entity.posY + (double)this.entity.getEyeHeight());
            double d3 = this.posZ - this.entity.posZ;
            double d4 = MathHelper.sqrt((double)(d * d + d3 * d3));
            float f = (float)((double)YupX2HsEuHClak3p6ZEVrKr6HcDPylAS.tan(d3, d) * Double.longBitsToDouble(0xBB832F30753A703EL ^ 0xFBE5AF30753A703EL) / Double.longBitsToDouble(0xF7DA917CA2780AAL ^ 0x4F7488EC9E63ADB2L)) - Float.intBitsToFloat((int)762767174L ^ 0x6FC2E746);
            float f2 = (float)(-((double)YupX2HsEuHClak3p6ZEVrKr6HcDPylAS.tan(d2, d4) * Double.longBitsToDouble(0xFC05D30EDFE48DF3L ^ 0xBC63530EDFE48DF3L) / Double.longBitsToDouble((long)215694147 ^ 0x400921FB589F165BL)));
            this.entity.rotationPitch = this.updateRotation(this.entity.rotationPitch, f2, this.deltaLookPitch);
            this.entity.rotationYawHead = this.updateRotation(this.entity.rotationYawHead, f, this.deltaLookYaw);
        } else {
            this.entity.rotationYawHead = this.updateRotation(this.entity.rotationYawHead, this.entity.renderYawOffset, Float.intBitsToFloat(0x170B8466 ^ 0x562B8466));
        }
        float f = MathHelper.wrapDegrees((float)(this.entity.rotationYawHead - this.entity.renderYawOffset));
        if (this.entity.getNavigator().noPath()) return;
        if (f < Float.intBitsToFloat((int)((long)1585970598 ^ (long)-1676542554))) {
            this.entity.rotationYawHead = this.entity.renderYawOffset - Float.intBitsToFloat((int)672191186L ^ 0x6A86D2D2);
        }
        if (!(f > Float.intBitsToFloat((int)445172795L ^ 0x581ECC3B))) return;
        this.entity.rotationYawHead = this.entity.renderYawOffset + Float.intBitsToFloat((int)727899154L ^ 0x69F4DC12);
    }

    public static float tan(double d, double d2) {
        return Wk0rB5tCxaols7h6NITzxtpKMj2yHNue.Method4679(d, d2);
    }
}

