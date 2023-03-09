//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.function.Predicate;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class544;
import lavahack.client.Class618;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class Class1993 {
    private Minecraft Field17162 = Minecraft.getMinecraft();
    private float[] Field17163;
    private DecimalFormat Field17164;
    private Class650 Field17165;
    private float Field17166;
    private long Field17167 = -1L;
    private String Field17168 = "";
    @Class1801
    private final Class618 Field17169 = new Class618(this::Method7402, new Predicate[0]);
    private String Field17170 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1993() {
        this.Field17163 = new float[10];
        this.Field17164 = new DecimalFormat("##.00##");
        this.Field17165 = new Class650();
        this.Field17166 = Float.intBitsToFloat(1101004800);
        MinecraftForge.EVENT_BUS.register((Object)this);
        Class1796.Field16242.Method706(this.Field17169);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7395(TickEvent.ClientTickEvent clientTickEvent) {
        double d;
        float f;
        float f2;
        long l = System.currentTimeMillis();
        if (this.Field17167 == -1L) {
            this.Field17167 = l;
            return;
        }
        long l2 = l - this.Field17167;
        float f3 = l2 / 20L;
        if (f3 == 0.0f) {
            f3 = Float.intBitsToFloat(1112014848);
        }
        if ((f2 = Float.intBitsToFloat(1148846080) / f3) > Float.intBitsToFloat(1101004800)) {
            f2 = Float.intBitsToFloat(1101004800);
        }
        System.arraycopy(this.Field17163, 0, this.Field17163, 1, this.Field17163.length - 1);
        this.Field17163[0] = f2;
        double d2 = 0.0;
        float[] fArray = this.Field17163;
        int n = fArray.length;
        for (int i = 0; i < n; d2 += (double)f, ++i) {
            f = fArray[i];
        }
        d2 /= (double)this.Field17163.length;
        if (d > Double.longBitsToDouble((long)1902658368 ^ 0x4034000071684340L)) {
            d2 = Double.longBitsToDouble(0x4034000000000000L);
        }
        f2 = Float.parseFloat(this.Field17164.format(d2));
        this.Field17167 = l;
    }

    public void Method7396() {
        Arrays.fill(this.Field17163, Float.intBitsToFloat(1101004800));
        this.Field17166 = Float.intBitsToFloat(1101004800);
    }

    public float Method7397() {
        return Float.intBitsToFloat(1101004800) / this.Field17166;
    }

    public float Method7398() {
        return this.Field17166;
    }

    public String Method7399() {
        return this.Field17168;
    }

    public void Method7400(String string) {
        this.Field17168 = string;
    }

    public int Method7401() {
        if (this.Field17162.player == null) return 0;
        if (this.Field17162.world != null) return this.Field17162.player.connection.getPlayerInfo(this.Field17162.player.connection.getGameProfile().getId()).getResponseTime();
        return 0;
    }

    private void Method7402(Class544 class544) {
        this.Field17165.Method2801();
    }

    private static String Method7403(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 96;
            cArray2[n] = (char)(cArray[n] ^ (0x2120 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

