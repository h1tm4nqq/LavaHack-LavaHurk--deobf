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

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.mZKglU52NJKeleKf9WRZyyfpIeAgybGE;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class BgbJ6SQdvGpipuP2TAZQ95KNN5du7a2N
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14929 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Tolerance", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xC46AB1A315338E28L ^ 0xFBD3283A8CAA17B2L), 0.0, 1.0, ((int)836031199L ^ 0x31D4D2DF) != 0));
    private boolean Field14930 = (int)63266509L ^ 0x3C55ECD;
    private boolean Field14931;
    private boolean Field14932;
    private boolean Field14933;
    private int Field14934;

    public BgbJ6SQdvGpipuP2TAZQ95KNN5du7a2N() {
        super("NoFallExploit", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
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
        if (!BgbJ6SQdvGpipuP2TAZQ95KNN5du7a2N.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(BgbJ6SQdvGpipuP2TAZQ95KNN5du7a2N.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, BgbJ6SQdvGpipuP2TAZQ95KNN5du7a2N.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, BgbJ6SQdvGpipuP2TAZQ95KNN5du7a2N.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getMaterial().isSolid()) {
            return;
        }
        if (mZKglU52NJKeleKf9WRZyyfpIeAgybGE.Method2507(BgbJ6SQdvGpipuP2TAZQ95KNN5du7a2N.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - (double)((long)BgbJ6SQdvGpipuP2TAZQ95KNN5du7a2N.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY), this.Field14929.Method367())) {
            this.Field14931 = BgbJ6SQdvGpipuP2TAZQ95KNN5du7a2N.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSprinting();
            this.Field14932 = BgbJ6SQdvGpipuP2TAZQ95KNN5du7a2N.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isJumping;
            this.Field14933 = BgbJ6SQdvGpipuP2TAZQ95KNN5du7a2N.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSneaking();
            BgbJ6SQdvGpipuP2TAZQ95KNN5du7a2N.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSprinting(((int)2016676293L ^ 0x783409C4) != 0);
            BgbJ6SQdvGpipuP2TAZQ95KNN5du7a2N.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setJumping(((int)1806113217L ^ 0x6BA719C0) != 0);
            BgbJ6SQdvGpipuP2TAZQ95KNN5du7a2N.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSneaking((boolean)((long)-568877979 ^ (long)-568877980));
            this.Field14930 = (int)1634931064L ^ 0x61731179;
            return;
        }
        if (!this.Field14930) return;
        if (!BgbJ6SQdvGpipuP2TAZQ95KNN5du7a2N.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) return;
        BgbJ6SQdvGpipuP2TAZQ95KNN5du7a2N.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSneaking(this.Field14931);
        BgbJ6SQdvGpipuP2TAZQ95KNN5du7a2N.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setJumping(this.Field14932);
        BgbJ6SQdvGpipuP2TAZQ95KNN5du7a2N.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSneaking(this.Field14933);
        this.Field14930 = (int)((long)-1417654959 ^ (long)-1417654959);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)828819123L ^ 0x3166C6B3;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1967264562 ^ (long)1967264717);
            int n2 = ((int)-1560161939L ^ 0xA301D11A) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-501762544 ^ (long)-501763867) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

