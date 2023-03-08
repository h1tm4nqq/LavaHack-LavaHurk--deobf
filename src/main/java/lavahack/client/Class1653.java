//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.input.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.entity.player.*;

public class Class1653 extends Class42
{
    private Class44 Field15678;
    private Class44 Field15679;
    private Class44 Field15680;
    private Class44 Field15681;
    private Class44 Field15682;
    private Class44 Field15683;
    private Class44 Field15684;
    private Class44 Field15685;
    private boolean Field15686;
    private String Field15687 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1653() {
        super("Teleport", "5b5t teleport exploit by zPrestige_", Class97.Field8344);
        this.Field15678 = new Class44("Force", this, 1.0, Double.longBitsToDouble(4591870180174331904L), Double.longBitsToDouble(4621819117588971520L), false);
        this.Field15679 = new Class44("Attempts", this, Double.longBitsToDouble((long)57330039 ^ 0x40240000036AC977L), 1.0, Double.longBitsToDouble(4626322717216342016L), true);
        this.Field15680 = new Class44("Distance", this, Double.longBitsToDouble(4617315517961601024L), 1.0, Double.longBitsToDouble((long)1828420739 ^ 0x404900006CFB7C83L), true);
        this.Field15681 = new Class44("Enemy Tp Key", this, 0);
        this.Field15682 = new Class44("One BlockKey", this, 0);
        this.Field15683 = new Class44("Hold", this, false);
        this.Field15684 = new Class44("Air Glide", this, false);
        this.Field15685 = new Class44("Vertical Glide Speed", this, 1.0, Double.longBitsToDouble((long)1857880414 ^ 0x3FB99999CEBD015EL), Double.longBitsToDouble(4636737291354636288L), Class467.Field9942);
        Class1653.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15678);
        Class1653.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15679);
        Class1653.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15680);
        Class1653.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15681);
        Class1653.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15682);
        Class1653.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15683);
        Class1653.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15684);
        Class1653.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15685);
    }
    
    @Override
    public void Method45() {
        if (Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field15681.Method337() != 0 && Keyboard.isKeyDown(this.Field15681.Method337())) {
            final EntityPlayer method1924 = Class394.Method1924(Float.intBitsToFloat(1128792064));
            if (method1924 == null) {
                Class1393.Method5504().Method1886("No target found unable to teleport((");
            }
            else {
                for (int i = 0; i < this.Field15679.Method335(); ++i) {
                    Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - this.Field15678.Method368() / Float.intBitsToFloat(1092616192), Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, false));
                    Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(method1924.posX, method1924.posY, method1924.posZ, true));
                }
            }
            return;
        }
        if (this.Field15684.Method365()) {
            Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble(-4646453807550688133L);
            final double posY = Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
            if (Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isKeyDown()) {
                for (int j = 0; j < this.Field15679.Method335(); ++j) {
                    Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, posY + this.Field15685.Method368() / Float.intBitsToFloat(1120403456), Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                }
            }
            if (Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindSneak.isKeyDown()) {
                for (int k = 0; k < this.Field15679.Method335(); ++k) {
                    Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, posY - this.Field15685.Method368() / Float.intBitsToFloat(1120403456), Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                }
            }
        }
        if (this.Field15682.Method337() != 0 && Keyboard.isKeyDown(this.Field15682.Method337())) {
            for (int l = 0; l < this.Field15679.Method335(); ++l) {
                Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - this.Field15678.Method368() / Float.intBitsToFloat(1092616192), Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, false));
                switch (Class680.Field10886[Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHorizontalFacing().ordinal()]) {
                    case 1: {
                        this.Method6408(0.0, 0.0, Double.longBitsToDouble(-4616189618054758400L));
                        break;
                    }
                    case 2: {
                        this.Method6408(1.0, 0.0, 0.0);
                        break;
                    }
                    case 3: {
                        this.Method6408(0.0, 0.0, 1.0);
                        break;
                    }
                    case 4: {
                        this.Method6408(Double.longBitsToDouble(-4616189618054758400L), 0.0, 0.0);
                        break;
                    }
                }
            }
        }
        if (Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindAttack.isKeyDown()) {
            if (!this.Field15686 || this.Field15683.Method365()) {
                for (int n = 0; n < this.Field15679.Method335(); ++n) {
                    Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - this.Field15678.Method368() / Float.intBitsToFloat(1092616192), Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, false));
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
                }
            }
        }
        else {
            this.Field15686 = false;
        }
    }
    
    private void Method6408(final double n, final double n2, final double n3) {
        Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + n, Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + n2, Class1653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + n3, true));
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x59A4 ^ 0x77));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
