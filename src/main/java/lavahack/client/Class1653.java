//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import lavahack.client.Class1393;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class680;
import lavahack.client.Class97;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import org.lwjgl.input.Keyboard;

public class Class1653
extends Class42 {
    private Class44 Field15678 = new Class44("Force", (Class42)this, 1.0, Double.longBitsToDouble(4591870180174331904L), Double.longBitsToDouble(0x4024000000000000L), false);
    private Class44 Field15679 = new Class44("Attempts", (Class42)this, Double.longBitsToDouble((long)57330039 ^ 0x40240000036AC977L), 1.0, Double.longBitsToDouble(0x4034000000000000L), true);
    private Class44 Field15680 = new Class44("Distance", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 1.0, Double.longBitsToDouble((long)1828420739 ^ 0x404900006CFB7C83L), true);
    private Class44 Field15681 = new Class44("Enemy Tp Key", (Class42)this, 0);
    private Class44 Field15682 = new Class44("One BlockKey", (Class42)this, 0);
    private Class44 Field15683 = new Class44("Hold", (Class42)this, false);
    private Class44 Field15684 = new Class44("Air Glide", (Class42)this, false);
    private Class44 Field15685 = new Class44("Vertical Glide Speed", (Class42)this, 1.0, Double.longBitsToDouble((long)1857880414 ^ 0x3FB99999CEBD015EL), Double.longBitsToDouble(4636737291354636288L), Class467.Field9942);
    private boolean Field15686;
    private String Field15687 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1653() {
        super("Teleport", "5b5t teleport exploit by zPrestige_", Class97.Field8344);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15678);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15679);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15680);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15681);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15682);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15683);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15684);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15685);
    }

    @Override
    public void Method45() {
        if (Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field15681.Method337() != 0 && Keyboard.isKeyDown((int)this.Field15681.Method337())) {
            EntityPlayer entityPlayer = Class394.Method1924(Float.intBitsToFloat(1128792064));
            if (entityPlayer == null) {
                Class1393.Method5504().Method1886("No target found unable to teleport((");
                return;
            }
            int n = 0;
            while (n < this.Field15679.Method335()) {
                Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - (double)(this.Field15678.Method368() / Float.intBitsToFloat(1092616192)), Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, false));
                Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, true));
                ++n;
            }
            return;
        }
        if (this.Field15684.Method365()) {
            int n;
            Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble(-4646453807550688133L);
            double d = Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
            if (Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isKeyDown()) {
                for (n = 0; n < this.Field15679.Method335(); ++n) {
                    Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, d + (double)(this.Field15685.Method368() / Float.intBitsToFloat(1120403456)), Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                }
            }
            if (Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindSneak.isKeyDown()) {
                for (n = 0; n < this.Field15679.Method335(); ++n) {
                    Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, d - (double)(this.Field15685.Method368() / Float.intBitsToFloat(1120403456)), Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                }
            }
        }
        if (this.Field15682.Method337() != 0 && Keyboard.isKeyDown((int)this.Field15682.Method337())) {
            block15: for (int i = 0; i < this.Field15679.Method335(); ++i) {
                Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - (double)(this.Field15678.Method368() / Float.intBitsToFloat(1092616192)), Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, false));
                switch (Class680.Field10886[Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHorizontalFacing().ordinal()]) {
                    case 1: {
                        this.Method6408(0.0, 0.0, Double.longBitsToDouble(-4616189618054758400L));
                        continue block15;
                    }
                    case 2: {
                        this.Method6408(1.0, 0.0, 0.0);
                        continue block15;
                    }
                    case 3: {
                        this.Method6408(0.0, 0.0, 1.0);
                        continue block15;
                    }
                    case 4: {
                        this.Method6408(Double.longBitsToDouble(-4616189618054758400L), 0.0, 0.0);
                        continue block15;
                    }
                }
            }
        }
        if (!Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindAttack.isKeyDown()) {
            this.Field15686 = false;
            return;
        }
        if (this.Field15686) {
            if (!this.Field15683.Method365()) return;
        }
        int n = 0;
        while (n < this.Field15679.Method335()) {
            Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - (double)(this.Field15678.Method368() / Float.intBitsToFloat(1092616192)), Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, false));
            switch (Class680.Field10886[Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHorizontalFacing().ordinal()]) {
                case 1: {
                    this.Method6408(0.0, 0.0, -this.Field15680.Method335());
                    break;
                }
                case 2: {
                    this.Method6408(this.Field15680.Method335(), 0.0, 0.0);
                    break;
                }
                case 3: {
                    this.Method6408(0.0, 0.0, this.Field15680.Method335());
                    break;
                }
                case 4: {
                    this.Method6408(-this.Field15680.Method335(), 0.0, 0.0);
                    break;
                }
            }
            this.Field15686 = true;
            ++n;
        }
    }

    private void Method6408(double d, double d2, double d3) {
        Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + d, Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + d2, Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + d3, true));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 119;
            cArray2[n] = (char)(cArray[n] ^ (0x59A4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

