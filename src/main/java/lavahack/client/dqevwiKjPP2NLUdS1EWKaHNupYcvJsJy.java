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

import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy$1;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import org.lwjgl.input.Keyboard;

public class dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15678 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Force", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble(0xCA7D5510B4E15B07L ^ 0xF5C4CC8914E15B07L), Double.longBitsToDouble(0xA224052B07D59FC3L ^ 0xE200052B07D59FC3L), (boolean)((long)1319225977 ^ (long)1319225977));
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15679 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Attempts", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)57330039 ^ 0x40240000036AC977L), 1.0, Double.longBitsToDouble(0x103E545EF4070535L ^ 0x500A545EF4070535L), (boolean)((long)1102394789 ^ (long)1102394788));
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15680 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Distance", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x29F912654E52F841L ^ 0x69ED12654E52F841L), 1.0, Double.longBitsToDouble((long)1828420739 ^ 0x404900006CFB7C83L), ((int)795700611L ^ 0x2F6D6D82) != 0);
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15681 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Enemy Tp Key", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (int)833063407L ^ 0x31A789EF);
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15682 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("One BlockKey", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (int)2045964796L ^ 0x79F2F1FC);
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15683 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Hold", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-2146530930 ^ (long)-2146530930));
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15684 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Air Glide", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-792226164 ^ (long)-792226164));
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15685 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Vertical Glide Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble((long)1857880414 ^ 0x3FB99999CEBD015EL), Double.longBitsToDouble(0xE83BE8806D80F0B9L ^ 0xA862E8806D80F0B9L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9942);
    private boolean Field15686;
    private String Field15687 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy() {
        super("Teleport", "5b5t teleport exploit by zPrestige_", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
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
        if (dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field15681.Method337() != 0 && Keyboard.isKeyDown((int)this.Field15681.Method337())) {
            EntityPlayer entityPlayer = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1924(Float.intBitsToFloat(0x65DDAF43 ^ 0x2695AF43));
            if (entityPlayer == null) {
                NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1886("No target found unable to teleport((");
                return;
            }
            int n = (int)((long)163494160 ^ (long)163494160);
            while (n < this.Field15679.Method335()) {
                dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - (double)(this.Field15678.Method368() / Float.intBitsToFloat((int)1034738638L ^ 0x7C8CDBCE)), dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, (boolean)((long)1445715368 ^ (long)1445715368)));
                dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, ((int)-1655311729L ^ 0x9D55F28E) != 0));
                ++n;
            }
            return;
        }
        if (this.Field15684.Method365()) {
            int n;
            dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble(0x9768A63B4D6DA030L ^ 0x28ECDCDA0AC3B44BL);
            double d = dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
            if (dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isKeyDown()) {
                for (n = (int)((long)-1801119228 ^ (long)-1801119228); n < this.Field15679.Method335(); ++n) {
                    dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, d + (double)(this.Field15685.Method368() / Float.intBitsToFloat((int)((long)42595193 ^ (long)1078063993))), dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                }
            }
            if (dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindSneak.isKeyDown()) {
                for (n = (int)-1250952697L ^ 0xB56FFA07; n < this.Field15679.Method335(); ++n) {
                    dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, d - (double)(this.Field15685.Method368() / Float.intBitsToFloat((int)((long)1019441813 ^ (long)2114679445))), dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                }
            }
        }
        if (this.Field15682.Method337() != 0 && Keyboard.isKeyDown((int)this.Field15682.Method337())) {
            block15: for (int i = (int)-1569771981L ^ 0xA26F2E33; i < this.Field15679.Method335(); ++i) {
                dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - (double)(this.Field15678.Method368() / Float.intBitsToFloat(0x4BEFAB3D ^ 0xACFAB3D)), dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, ((int)-2057659323L ^ 0x855A9C45) != 0));
                switch (dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy$1.Field10886[dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHorizontalFacing().ordinal()]) {
                    case 1: {
                        this.Method6408(0.0, 0.0, Double.longBitsToDouble(0xFAD69E8BEBDCF54AL ^ 0x45269E8BEBDCF54AL));
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
                        this.Method6408(Double.longBitsToDouble(0xB24E46A3A6C015AAL ^ 0xDBE46A3A6C015AAL), 0.0, 0.0);
                        continue block15;
                    }
                }
            }
        }
        if (!dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindAttack.isKeyDown()) {
            this.Field15686 = (int)((long)-1458675025 ^ (long)-1458675025);
            return;
        }
        if (this.Field15686) {
            if (!this.Field15683.Method365()) return;
        }
        int n = (int)-1146051638L ^ 0xBBB0A3CA;
        while (n < this.Field15679.Method335()) {
            dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - (double)(this.Field15678.Method368() / Float.intBitsToFloat((int)((long)1442478467 ^ (long)349862275))), dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, ((int)16952043L ^ 0x102AAEB) != 0));
            switch (dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy$1.Field10886[dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHorizontalFacing().ordinal()]) {
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
            this.Field15686 = (int)1166719344L ^ 0x458AB971;
            ++n;
        }
    }

    private void Method6408(double d, double d2, double d3) {
        dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + d, dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + d2, dqevwiKjPP2NLUdS1EWKaHNupYcvJsJy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + d3, (boolean)((long)-1774139298 ^ (long)-1774139297)));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)2003088686L ^ 0x7764B52E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1466935048L ^ 0xA8905807);
            int n2 = (int)((long)1125502952 ^ (long)1125502879);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1973511295 ^ (long)1973514774) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

