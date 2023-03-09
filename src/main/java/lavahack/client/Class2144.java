//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.util.math.MathHelper
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class873;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.math.MathHelper;

public class Class2144
extends Class42 {
    public Class44 Field17808 = this.Method23(new Class44("Timeout", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 1.0, Double.longBitsToDouble(0x4024000000000000L), false));
    public Class44 Field17809 = this.Method23(new Class44("Auto Disable", (Class42)this, false));
    @Class873
    public static Class2144 Field17810;
    public int Field17811;
    private String Field17812 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class2144() {
        super("CornerClip", "Phases slightly into the corner of a your surrounding to prevent crystal damage", Class97.Field8340);
    }

    @Override
    public void Method45() {
        if (Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Method27()) {
            this.Method37();
            return;
        }
        if (Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getCollisionBoxes((Entity)Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityBoundingBox().grow(Double.longBitsToDouble(4576918229304087675L), 0.0, Double.longBitsToDouble((long)1619891228 ^ 0x3F847AE127238067L))).size() < 2) {
            double d = Class2144.Method7722(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble(4599093953869259997L), Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble((long)1423593681 ^ 0x3FE65E356BA6BD40L));
            double d2 = Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
            double d3 = Class2144.Method7722(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble(4599093953869259997L), Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble(4604471251824340369L));
            Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(d, d2, d3);
            this.Method20();
            return;
        }
        if (Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % this.Field17808.Method335() != 0) return;
        double d = Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + MathHelper.clamp((double)(Class2144.Method7722(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble(4597850960372105740L), Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble(4605011683779624829L)) - Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX), (double)Double.longBitsToDouble(-4639067904161800520L), (double)Double.longBitsToDouble((long)1905286700 ^ 0x3F9EB8519A154094L));
        double d4 = Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        double d5 = Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + MathHelper.clamp((double)(Class2144.Method7722(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble(4597850960372105740L), Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble(4605011683779624829L)) - Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), (double)Double.longBitsToDouble((long)1126303596 ^ 0xBF9EB851A8A719D4L), (double)Double.longBitsToDouble(4584304132692975288L));
        Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(d, d4, d5);
        Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
        double d6 = Class2144.Method7722(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble(4597454643604897137L), Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble(4605110762971426980L));
        double d7 = Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        double d8 = Class2144.Method7722(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble(4597454643604897137L), Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble(4605110762971426980L));
        Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d6, d7, d8, true));
        this.Field17811 = this.Field17809.Method365() ? ++this.Field17811 : 0;
        this.Method20();
    }

    private void Method20() {
        if (this.Field17811 < 2) return;
        if (!this.Field17809.Method365()) return;
        this.Field17811 = 0;
        this.Method37();
    }

    private boolean Method27() {
        if (Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindForward.isKeyDown()) return true;
        if (Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindBack.isKeyDown()) return true;
        if (Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindLeft.isKeyDown()) return true;
        if (Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindRight.isKeyDown()) return true;
        return false;
    }

    public static double Method7722(double d, double d2, double d3) {
        double d4;
        double d5 = d3 - d;
        double d6 = d - d2;
        if (d5 >= d6) {
            d4 = d2;
            return d4;
        }
        d4 = d3;
        return d4;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 39;
            cArray2[n] = (char)(cArray[n] ^ (0x139C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

