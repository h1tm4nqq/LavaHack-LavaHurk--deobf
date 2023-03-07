//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketEntityAction$Action
 */
package lavahack.client;

import java.lang.invoke.LambdaMetafactory;
import lavahack.client.DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA;
import lavahack.client.DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs;
import lavahack.client.veyf9YVihv33TUGV0DuHJrqb7huCpMgR;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;

public final class DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10627 = new DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Off", (int)((long)-1197295782 ^ (long)-1197295782), DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method3228().Method7663((veyf9YVihv33TUGV0DuHJrqb7huCpMgR)LambdaMetafactory.metafactory(null, null, null, (Llavahack/client/Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC;)Ljava/lang/Object;, lambda$static$0(lavahack.client.Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC ), (Llavahack/client/Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC;)Ljava/lang/Void;)()));
    public static final /* enum */ DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10628 = new DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Packet", (int)494003027L ^ 0x1D71E352, DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method3228().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA.Method6095().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA.Method6094().player, CPacketEntityAction.Action.START_SNEAKING));
        DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA.Method6097().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA.Method6096().player, CPacketEntityAction.Action.STOP_SNEAKING));
        return null;
    }));
    public static final /* enum */ DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10629 = new DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Vanilla", (int)((long)1890972079 ^ (long)1890972078) << 1, DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method3228().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA.Method6089().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA.Method6088().player, CPacketEntityAction.Action.START_SNEAKING));
        DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA.Method6090().player.setSneaking((boolean)((long)-1301802115 ^ (long)-1301802116));
        DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA.Method6092().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA.Method6091().player, CPacketEntityAction.Action.STOP_SNEAKING));
        DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA.Method6093().player.setSneaking(((int)380966372L ^ 0x16B515E4) != 0);
        return null;
    }));
    private final hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs Field10630;
    private static final DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field10631;
    private String Field10632 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field10631.clone();
    }

    public static DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field10630 = var3_1;
    }

    public hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs Method2647() {
        return this.Field10630;
    }

    static {
        DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] dpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)-1304345687 ^ (long)-1304345686)];
        dpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)871339134L ^ 0x33EF947E] = Field10627;
        dpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-1267774142L ^ 0xB46F4D43] = Field10628;
        dpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)1528019024 ^ (long)1528019025) << 1] = Field10629;
        Field10631 = dpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method2650(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)74293083 ^ (long)74293083);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-599773128 ^ (long)-599772985);
            int n2 = ((int)-1887760462L ^ 0x8F7B0FB9) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-103063640 ^ (long)-103070745) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

