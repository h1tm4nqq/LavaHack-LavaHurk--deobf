//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;

public class Class2144 extends Class42
{
    public Class44 Field17808;
    public Class44 Field17809;
    @Class873
    public static Class2144 Field17810;
    public int Field17811;
    private String Field17812 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2144() {
        super("CornerClip", "Phases slightly into the corner of a your surrounding to prevent crystal damage", Class97.Field8340);
        this.Field17808 = this.Method23(new Class44("Timeout", this, Double.longBitsToDouble(4617315517961601024L), 1.0, Double.longBitsToDouble(4621819117588971520L), false));
        this.Field17809 = this.Method23(new Class44("Auto Disable", this, false));
    }
    
    @Override
    public void Method45() {
        if (Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Method27()) {
            this.Method37();
            return;
        }
        if (Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getCollisionBoxes((Entity)Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityBoundingBox().grow(Double.longBitsToDouble(4576918229304087675L), 0.0, Double.longBitsToDouble((long)1619891228 ^ 0x3F847AE127238067L))).size() < 2) {
            Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(Method7722(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble(4599093953869259997L), Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble((long)1423593681 ^ 0x3FE65E356BA6BD40L)), Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Method7722(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble(4599093953869259997L), Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble(4604471251824340369L)));
            this.Method20();
            return;
        }
        if (Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % this.Field17808.Method335() == 0) {
            Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + MathHelper.clamp(Method7722(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble(4597850960372105740L), Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble(4605011683779624829L)) - Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Double.longBitsToDouble(-4639067904161800520L), Double.longBitsToDouble((long)1905286700 ^ 0x3F9EB8519A154094L)), Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + MathHelper.clamp(Method7722(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble(4597850960372105740L), Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble(4605011683779624829L)) - Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, Double.longBitsToDouble((long)1126303596 ^ 0xBF9EB851A8A719D4L), Double.longBitsToDouble(4584304132692975288L)));
            Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
            Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Method7722(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble(4597454643604897137L), Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble(4605110762971426980L)), Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Method7722(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble(4597454643604897137L), Math.floor(Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble(4605110762971426980L)), true));
            if (this.Field17809.Method365()) {
                ++this.Field17811;
            }
            else {
                this.Field17811 = 0;
            }
            this.Method20();
        }
    }
    
    private void Method20() {
        if (this.Field17811 >= 2 && this.Field17809.Method365()) {
            this.Field17811 = 0;
            this.Method37();
        }
    }
    
    private boolean Method27() {
        return Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindForward.isKeyDown() || Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindBack.isKeyDown() || Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindLeft.isKeyDown() || Class2144.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindRight.isKeyDown();
    }
    
    public static double Method7722(final double n, final double n2, final double n3) {
        return (n3 - n >= n - n2) ? n2 : n3;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x139C ^ 0x27));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
