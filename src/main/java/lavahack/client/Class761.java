//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.input.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.item.*;
import net.minecraft.util.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import net.minecraft.client.entity.*;

public class Class761 extends Class42
{
    private final Class44 Field11221;
    private final Class44 Field11222;
    private final Class44 Field11223;
    private final Class44 Field11224;
    private final Class44 Field11225;
    private final Class44 Field11226;
    private final Class44 Field11227;
    private final Class44 Field11228;
    private int Field11229;
    
    public Class761() {
        super("BoatFly", Class97.Field8340);
        this.Field11221 = this.Method23(new Class44("Speed", (Class42)this, Double.longBitsToDouble((long)49188194 ^ 0x4000000002EE8D62L), 0.0, Double.longBitsToDouble((long)750398485 ^ 0x402400002CBA2C15L), true));
        this.Field11222 = this.Method23(new Class44("Vertical Speed", (Class42)this, 1.0, 0.0, Double.longBitsToDouble((long)642360368 ^ 0x402400002649A430L), true));
        this.Field11223 = this.Method23(new Class44("Down Key", (Class42)this, 29).Method314(this.Field11222.Method335() != 0));
        this.Field11224 = this.Method23(new Class44("Glide Speed", (Class42)this, 0.0, Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble((long)768212119 ^ 0x402400002DC9FC97L), true));
        this.Field11225 = this.Method23(new Class44("Static Y", (Class42)this, true));
        this.Field11226 = this.Method23(new Class44("Hover", (Class42)this, false));
        this.Field11227 = this.Method23(new Class44("Bypass", (Class42)this, false));
        this.Field11228 = this.Method23(new Class44("Extra Calc", (Class42)this, false));
    }
    
    public void Method45() {
        if (Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ridingEntity == null) {
            return;
        }
        super.Method43("[" + this.Field11221.Method335() + "]");
        final Entity ridingEntity = Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ridingEntity;
        if (Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isKeyDown()) {
            ridingEntity.motionY = this.Field11222.Method367();
        }
        else if (!this.Field11223.Method308() && Keyboard.isKeyDown(this.Field11223.Method337())) {
            ridingEntity.motionY = -this.Field11222.Method367();
        }
        else if (this.Field11225.Method365()) {
            ridingEntity.motionY = 0.0;
        }
        else {
            ridingEntity.motionY = ((this.Field11226.Method365() && Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % 2 == 0) ? this.Field11224.Method367() : (-this.Field11224.Method367()));
        }
        if (Class1917.Method7159()) {
            if (!this.Field11228.Method365()) {
                final double[] method7150 = Class1917.Method7150(this.Field11221.Method367());
                ridingEntity.motionX = method7150[0];
                ridingEntity.motionZ = method7150[1];
            }
            else {
                final float method7151 = Class1917.Method7148();
                final EntityPlayerSP player = Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
                player.motionX -= MathHelper.sin(method7151) * this.Field11221.Method368();
                final EntityPlayerSP player2 = Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
                player2.motionZ += MathHelper.cos(method7151) * this.Field11221.Method368();
            }
        }
        else {
            ridingEntity.motionX = 0.0;
            ridingEntity.motionZ = 0.0;
        }
        if (this.Field11227.Method365() && Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % 4 == 0 && Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ridingEntity instanceof EntityBoat) {
            Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.interactWithEntity((EntityPlayer)Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ridingEntity, EnumHand.MAIN_HAND);
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7E49 ^ 0xF1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
