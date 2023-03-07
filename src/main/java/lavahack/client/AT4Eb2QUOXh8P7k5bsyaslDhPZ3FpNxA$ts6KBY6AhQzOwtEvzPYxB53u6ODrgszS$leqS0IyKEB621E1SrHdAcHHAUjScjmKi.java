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
import lavahack.client.AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA;
import lavahack.client.AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import lavahack.client.AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs;
import lavahack.client.veyf9YVihv33TUGV0DuHJrqb7huCpMgR;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;

final class AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field16720 = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("None", (int)1391173651L ^ 0x52EBA013, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method5351().Method7663((veyf9YVihv33TUGV0DuHJrqb7huCpMgR)LambdaMetafactory.metafactory(null, null, null, (Llavahack/client/Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC;)Ljava/lang/Object;, lambda$static$0(lavahack.client.Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC ), (Llavahack/client/Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC;)Ljava/lang/Void;)()));
    public static final /* enum */ AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field16721 = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Vanilla", (int)((long)1624523808 ^ (long)1624523809), AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method5351().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (((Boolean)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)-1891115671 ^ (long)-1891115672))).booleanValue()) {
            return null;
        }
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method4118().player.connection.sendPacket((Packet)new CPacketHeldItemChange(((Integer)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)-1906145L ^ 0xFFE2EA1F)).intValue()));
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method4119().player.inventory.currentItem = (Integer)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)337796493L ^ 0x14225D8D);
        return null;
    }));
    public static final /* enum */ AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field16722 = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Packet", (int)((long)291581802 ^ (long)291581803) << 1, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method5351().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method4116().player.connection.sendPacket((Packet)new CPacketHeldItemChange(((Integer)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)1378011373L ^ 0x5222C8ED)).intValue()));
        if ((Boolean)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)1841347822 ^ (long)1841347823)) == false) return null;
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method4117().playerController.updateController();
        return null;
    }));
    public static final /* enum */ AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field16723 = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Silent", (int)((long)-1447516902 ^ (long)-1447516903), AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method5351().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method4113().player.connection.sendPacket((Packet)new CPacketHeldItemChange(((Integer)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)-1710263886L ^ 0x9A0F71B2)).intValue()));
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method4114().player.inventory.currentItem = (Integer)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)1784055849 ^ (long)1784055849));
        if ((Boolean)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)-449431959 ^ (long)-449431960)) == false) return null;
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method4115().playerController.updateController();
        return null;
    }));
    private final hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs Field16724;
    private static final AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field16725;
    private int Field16726;

    public static AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field16725.clone();
    }

    public static AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field16724 = var3_1;
    }

    public void Method7027(int n, boolean bl, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41A aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41A) {
        if (AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method4111(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Field12376).Method341() != aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41A) {
            return;
        }
        if (AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method4112().player.inventory.currentItem == n) {
            return;
        }
        Object[] objectArray = new Object[((int)1257939604L ^ 0x4AFAA295) << 1];
        objectArray[(int)((long)-1512883470 ^ (long)-1512883470)] = n;
        objectArray[(int)1431926485L ^ 0x555976D4] = bl;
        this.Field16724.Method1726(objectArray);
    }

    static {
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)1313203173 ^ (long)1313203172) << 2];
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-894441415L ^ 0xCAAFE839] = Field16720;
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)456433256L ^ 0x1B349E69] = Field16721;
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)762091188L ^ 0x2D6C96B5) << 1] = Field16722;
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)289841820L ^ 0x1146A29F] = Field16723;
        Field16725 = aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method7031(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-284438807 ^ (long)-284438807);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1456955506L ^ 0xA9289F71);
            int n2 = ((int)1311283242L ^ 0x4E28982F) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)216772940 ^ (long)216760707) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

