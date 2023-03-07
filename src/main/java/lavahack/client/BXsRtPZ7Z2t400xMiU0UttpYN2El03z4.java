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

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.math.MathHelper;

public class BXsRtPZ7Z2t400xMiU0UttpYN2El03z4
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17808 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Timeout", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x25C5F79C86AB6187L ^ 0x65D1F79C86AB6187L), 1.0, Double.longBitsToDouble(0x9FDA873AEB3D0B62L ^ 0xDFFE873AEB3D0B62L), ((int)-15479452L ^ 0xFF13CD64) != 0));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17809 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Auto Disable", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)891739585 ^ (long)891739585)));
    @tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua
    public static BXsRtPZ7Z2t400xMiU0UttpYN2El03z4 Field17810;
    public int Field17811;
    private String Field17812 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public BXsRtPZ7Z2t400xMiU0UttpYN2El03z4() {
        super("CornerClip", "Phases slightly into the corner of a your surrounding to prevent crystal damage", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340);
    }

    @Override
    public void Method45() {
        if (mc.player == null) return;
        if (mc.world == null) {
            return;
        }
        if (this.Method27()) {
            this.Method37();
            return;
        }
        if (mc.world.getCollisionBoxes((Entity)mc.player, mc.player.getEntityBoundingBox().grow(Double.longBitsToDouble(0x14C877F481131894L ^ 0x2B4C0D15C6BD0CEFL), 0.0, Double.longBitsToDouble((long)1619891228 ^ 0x3F847AE127238067L))).size() < (int)((long)7489790 ^ (long)7489791) << 1) {
            double d = BXsRtPZ7Z2t400xMiU0UttpYN2El03z4.Method7722(mc.player.posX, Math.floor(mc.player.posX) + Double.longBitsToDouble(0x1F6293AA043C6450L ^ 0x20B1D03F853A408DL), Math.floor(mc.player.posX) + Double.longBitsToDouble((long)1423593681 ^ 0x3FE65E356BA6BD40L));
            double d2 = mc.player.posY;
            double d3 = BXsRtPZ7Z2t400xMiU0UttpYN2El03z4.Method7722(mc.player.posZ, Math.floor(mc.player.posZ) + Double.longBitsToDouble(0xC305C75CF3806932L ^ 0xFCD684C972864DEFL), Math.floor(mc.player.posZ) + Double.longBitsToDouble(0x137BF7A73E316ED9L ^ 0x2C9DA992014D8348L));
            mc.player.setPosition(d, d2, d3);
            this.Method20();
            return;
        }
        if (mc.player.ticksExisted % this.Field17808.Method335() != 0) return;
        double d = mc.player.posX + MathHelper.clamp((double)(BXsRtPZ7Z2t400xMiU0UttpYN2El03z4.Method7722(mc.player.posX, Math.floor(mc.player.posX) + Double.longBitsToDouble(0xEAA48B855A5F8E2BL ^ 0xD56A5293DD748C27L), Math.floor(mc.player.posX) + Double.longBitsToDouble(0x93438D809117917AL ^ 0xACABC43ACF22AE07L)) - mc.player.posX), (double)Double.longBitsToDouble(0xA1A4AF817106CB76L ^ 0x1E3A17D09A83D5CEL), (double)Double.longBitsToDouble((long)1905286700 ^ 0x3F9EB8519A154094L));
        double d4 = mc.player.posY;
        double d5 = mc.player.posZ + MathHelper.clamp((double)(BXsRtPZ7Z2t400xMiU0UttpYN2El03z4.Method7722(mc.player.posZ, Math.floor(mc.player.posZ) + Double.longBitsToDouble(0x40B852D500066885L ^ 0x7F768BC3872D6A89L), Math.floor(mc.player.posZ) + Double.longBitsToDouble(0xC3DEF2AF096B074CL ^ 0xFC36BB15575E3831L)) - mc.player.posZ), (double)Double.longBitsToDouble((long)1126303596 ^ 0xBF9EB851A8A719D4L), (double)Double.longBitsToDouble(0xF4A6A26C3E3EF8C2L ^ 0xCB381A3DD5BBE67AL));
        mc.player.setPosition(d, d4, d5);
        mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(mc.player.posX, mc.player.posY, mc.player.posZ, ((int)-770977663L ^ 0xD20BD080) != 0));
        double d6 = BXsRtPZ7Z2t400xMiU0UttpYN2El03z4.Method7722(mc.player.posX, Math.floor(mc.player.posX) + Double.longBitsToDouble(0xC07800F4E17E9416L ^ 0xFFB570573674A967L), Math.floor(mc.player.posX) + Double.longBitsToDouble(0xFFB9B65B52B65C65L ^ 0xC051158C588B2CC1L));
        double d7 = mc.player.posY;
        double d8 = BXsRtPZ7Z2t400xMiU0UttpYN2El03z4.Method7722(mc.player.posZ, Math.floor(mc.player.posZ) + Double.longBitsToDouble(0x132834D464ABFAB7L ^ 0x2CE54477B3A1C7C6L), Math.floor(mc.player.posZ) + Double.longBitsToDouble(0xCB6C2EDAB30218B1L ^ 0xF4848D0DB93F6815L));
        mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d6, d7, d8, (boolean)((long)-1078873378 ^ (long)-1078873377)));
        this.Field17811 = this.Field17809.Method365() ? (this.Field17811 += (int)((long)2068777091 ^ (long)2068777090)) : (int)-1370809886L ^ 0xAE4B19E2;
        this.Method20();
    }

    private void Method20() {
        if (this.Field17811 < ((int)677527910L ^ 0x28624167) << 1) return;
        if (!this.Field17809.Method365()) return;
        this.Field17811 = (int)-2111352734L ^ 0x82275062;
        this.Method37();
    }

    private boolean Method27() {
        int n;
        if (!(mc.gameSettings.keyBindForward.isKeyDown() || mc.gameSettings.keyBindBack.isKeyDown() || mc.gameSettings.keyBindLeft.isKeyDown() || mc.gameSettings.keyBindRight.isKeyDown())) {
            n = (int)((long)-503848278 ^ (long)-503848278);
            return n != 0;
        }
        n = (int)((long)433138383 ^ (long)433138382);
        return n != 0;
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
        int n = (int)1053068655L ^ 0x3EC48D6F;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1684959637 ^ (long)1684959594);
            int n2 = (int)((long)-226637594 ^ (long)-226637631);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-803313705 ^ (long)-803314896) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

