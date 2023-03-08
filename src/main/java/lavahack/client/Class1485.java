//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.util.math.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class1485 extends Class42
{
    private final Class44 Field14929;
    private boolean Field14930;
    private boolean Field14931;
    private boolean Field14932;
    private boolean Field14933;
    private int Field14934;
    
    public Class1485() {
        super("NoFallExploit", Class97.Field8344);
        this.Field14929 = this.Method23(new Class44("Tolerance", this, Double.longBitsToDouble(4591870180066957722L), 0.0, 1.0, false));
        this.Field14930 = false;
    }
    
    @Override
    public void Method38() {
        super.Method38();
        MinecraftForge.EVENT_BUS.register((Object)this);
    }
    
    @Override
    public void Method39() {
        super.Method39();
        MinecraftForge.EVENT_BUS.unregister((Object)this);
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method5940(final TickEvent tickEvent) {
        if (!Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getMaterial().isSolid()) {
            return;
        }
        if (Class567.Method2507(Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - (long)Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, this.Field14929.Method367())) {
            this.Field14931 = Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSprinting();
            this.Field14932 = Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isJumping;
            this.Field14933 = Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSneaking();
            Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSprinting(true);
            Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setJumping(true);
            Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSneaking(true);
            this.Field14930 = true;
            return;
        }
        if (this.Field14930 && Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
            Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSneaking(this.Field14931);
            Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setJumping(this.Field14932);
            Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSneaking(this.Field14933);
            this.Field14930 = false;
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1BD4 ^ 0xEE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
