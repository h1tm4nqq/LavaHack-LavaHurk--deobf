//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketHeldItemChange
 */
package lavahack.client;

import java.lang.invoke.LambdaMetafactory;
import lavahack.client.FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N;
import lavahack.client.hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs;
import lavahack.client.veyf9YVihv33TUGV0DuHJrqb7huCpMgR;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;

public final class FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11026 = new FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("None", (int)632888979L ^ 0x25B91E93, FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N.Method7049().Method7663((veyf9YVihv33TUGV0DuHJrqb7huCpMgR)LambdaMetafactory.metafactory(null, null, null, (Llavahack/client/Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC;)Ljava/lang/Object;, lambda$static$0(lavahack.client.Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC ), (Llavahack/client/Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC;)Ljava/lang/Void;)()));
    public static final /* enum */ FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11027 = new FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Normal", (int)((long)765899646 ^ (long)765899647), FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N.Method7049().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (((Boolean)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)-373317505L ^ 0xE9BFA07E)).booleanValue()) {
            return null;
        }
        FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N.Method7050().player.connection.sendPacket((Packet)new CPacketHeldItemChange(((Integer)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)-1121664225L ^ 0xBD24C31F)).intValue()));
        FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N.Method7050().player.inventory.currentItem = (Integer)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)335068491L ^ 0x13F8BD4B);
        return null;
    }));
    public static final /* enum */ FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11028 = new FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Silent", ((int)186092501L ^ 0xB178BD4) << 1, FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N.Method7049().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N.Method7050().player.connection.sendPacket((Packet)new CPacketHeldItemChange(((Integer)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)1642041727 ^ (long)1642041727))).intValue()));
        FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N.Method7050().player.inventory.currentItem = (Integer)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)1127454403L ^ 0x433396C3);
        return null;
    }));
    public static final /* enum */ FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11029 = new FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Packet", (int)2136318183L ^ 0x7F55A0E4, FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N.Method7049().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N.Method7050().player.connection.sendPacket((Packet)new CPacketHeldItemChange(((Integer)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)1156002941L ^ 0x44E7347D)).intValue()));
        return null;
    }));
    private final hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs Field11030;
    private static final FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field11031;
    private String Field11032 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field11031.clone();
    }

    public static FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field11030 = var3_1;
    }

    public hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs Method2972() {
        return this.Field11030;
    }

    static {
        FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] fKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[((int)1762552312L ^ 0x690E69F9) << 2];
        fKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)2053644144L ^ 0x7A681F70] = Field11026;
        fKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)1192890222 ^ (long)1192890223)] = Field11027;
        fKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)1728220902L ^ 0x67028EE7) << 1] = Field11028;
        fKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)993889528 ^ (long)993889531)] = Field11029;
        Field11031 = fKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method2976(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-13544325 ^ (long)-13544325);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1682873266L ^ 0x9BB164B1);
            int n2 = (int)-878756959L ^ 0xCB9F3B02;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1859204431L ^ 0x912E9194 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

