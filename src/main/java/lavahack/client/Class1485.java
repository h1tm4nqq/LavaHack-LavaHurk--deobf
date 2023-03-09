//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class567;
import lavahack.client.Class97;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class Class1485
extends Class42 {
    private final Class44 Field14929 = this.Method23(new Class44("Tolerance", (Class42)this, Double.longBitsToDouble(4591870180066957722L), 0.0, 1.0, false));
    private boolean Field14930 = false;
    private boolean Field14931;
    private boolean Field14932;
    private boolean Field14933;
    private int Field14934;

    public Class1485() {
        super("NoFallExploit", Class97.Field8344);
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
    public void Method5940(TickEvent tickEvent) {
        if (!Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getMaterial().isSolid()) {
            return;
        }
        if (Class567.Method2507(Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - (double)((long)Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY), this.Field14929.Method367())) {
            this.Field14931 = Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSprinting();
            this.Field14932 = Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isJumping;
            this.Field14933 = Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSneaking();
            Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSprinting(true);
            Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setJumping(true);
            Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSneaking(true);
            this.Field14930 = true;
            return;
        }
        if (!this.Field14930) return;
        if (!Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) return;
        Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSneaking(this.Field14931);
        Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setJumping(this.Field14932);
        Class1485.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSneaking(this.Field14933);
        this.Field14930 = false;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 238;
            cArray2[n] = (char)(cArray[n] ^ (0x1BD4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

