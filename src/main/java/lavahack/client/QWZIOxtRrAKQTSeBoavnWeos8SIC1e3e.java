//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class QWZIOxtRrAKQTSeBoavnWeos8SIC1e3e
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private int Field9774;
    private String Field9775 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public QWZIOxtRrAKQTSeBoavnWeos8SIC1e3e() {
        super("TowerTest", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    @Override
    public void Method38() {
        if (QWZIOxtRrAKQTSeBoavnWeos8SIC1e3e.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && QWZIOxtRrAKQTSeBoavnWeos8SIC1e3e.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            this.Field9774 = (int)QWZIOxtRrAKQTSeBoavnWeos8SIC1e3e.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
            QWZIOxtRrAKQTSeBoavnWeos8SIC1e3e.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
            return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        this.Field9774 = (int)-1001141357L ^ 0xC453CB93;
    }

    @Override
    public void Method45() {
        if (QWZIOxtRrAKQTSeBoavnWeos8SIC1e3e.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (QWZIOxtRrAKQTSeBoavnWeos8SIC1e3e.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if ((int)QWZIOxtRrAKQTSeBoavnWeos8SIC1e3e.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY <= this.Field9774) {
            return;
        }
        BlockPos blockPos = new BlockPos(QWZIOxtRrAKQTSeBoavnWeos8SIC1e3e.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, QWZIOxtRrAKQTSeBoavnWeos8SIC1e3e.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, QWZIOxtRrAKQTSeBoavnWeos8SIC1e3e.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        if (QWZIOxtRrAKQTSeBoavnWeos8SIC1e3e.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)QWZIOxtRrAKQTSeBoavnWeos8SIC1e3e.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(new BlockPos(QWZIOxtRrAKQTSeBoavnWeos8SIC1e3e.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, QWZIOxtRrAKQTSeBoavnWeos8SIC1e3e.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, QWZIOxtRrAKQTSeBoavnWeos8SIC1e3e.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ).down(), EnumHand.MAIN_HAND, (boolean)((long)-35994938 ^ (long)-35994938), (boolean)((long)296482814 ^ (long)296482814));
        }
        if (QWZIOxtRrAKQTSeBoavnWeos8SIC1e3e.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
            QWZIOxtRrAKQTSeBoavnWeos8SIC1e3e.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
            this.Field9774 = blockPos.getY();
            return;
        }
        QWZIOxtRrAKQTSeBoavnWeos8SIC1e3e.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble(0x608046169864AD5FL ^ 0xDF51AD9386DCFCB3L);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1654876651 ^ (long)-1654876651);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1022126952L ^ 0x3CEC6B97);
            int n2 = (int)((long)-776466962 ^ (long)-776467003);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1684942117 ^ (long)1684953246) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

