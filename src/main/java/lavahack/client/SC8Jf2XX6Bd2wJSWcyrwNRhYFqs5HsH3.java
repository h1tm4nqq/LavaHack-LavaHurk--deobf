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

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class SC8Jf2XX6Bd2wJSWcyrwNRhYFqs5HsH3 {
    private Minecraft Field17162 = Minecraft.getMinecraft();
    private float[] Field17163;
    private DecimalFormat Field17164;
    private IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field17165;
    private float Field17166;
    private long Field17167;
    private String Field17168 = "";
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field17169 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method7402, new Predicate[(int)-806567139L ^ 0xCFECC31D]);
    private String Field17170 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public SC8Jf2XX6Bd2wJSWcyrwNRhYFqs5HsH3() {
        this.Field17163 = new float[((int)-39252292L ^ 0xFDA90EB9) << 1];
        this.Field17164 = new DecimalFormat("##.00##");
        this.Field17165 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
        this.Field17166 = Float.intBitsToFloat((int)((long)1167081734 ^ (long)70271238));
        this.Field17167 = 0xFFFFFFFFFFFFFFFFL & 0xFFFFFFFFFFFFFFFFL;
        MinecraftForge.EVENT_BUS.register((Object)this);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field17169);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7395(TickEvent.ClientTickEvent clientTickEvent) {
        double d;
        float f;
        float f2;
        long l = System.currentTimeMillis();
        if (this.Field17167 == (0xFFFFFFFFFFFFFFFFL & 0xFFFFFFFFFFFFFFFFL)) {
            this.Field17167 = l;
            return;
        }
        long l2 = l - this.Field17167;
        float f3 = l2 / (0x5009AA17L & 0x640401CL);
        if (f3 == 0.0f) {
            f3 = Float.intBitsToFloat((int)((long)1131303625 ^ (long)19288777));
        }
        if ((f2 = Float.intBitsToFloat(0x71A4746 ^ 0x43604746) / f3) > Float.intBitsToFloat((int)((long)51390246 ^ (long)1118840614))) {
            f2 = Float.intBitsToFloat((int)((long)598011224 ^ (long)1644490072));
        }
        System.arraycopy(this.Field17163, (int)((long)-192509508 ^ (long)-192509508), this.Field17163, (int)((long)1267970717 ^ (long)1267970716), this.Field17163.length - (int)((long)2000987921 ^ (long)2000987920));
        this.Field17163[(int)((long)438589444 ^ (long)438589444)] = f2;
        double d2 = 0.0;
        float[] fArray = this.Field17163;
        int n = fArray.length;
        for (int i = (int)((long)848574488 ^ (long)848574488); i < n; d2 += (double)f, ++i) {
            f = fArray[i];
        }
        d2 /= (double)this.Field17163.length;
        if (d > Double.longBitsToDouble((long)1902658368 ^ 0x4034000071684340L)) {
            d2 = Double.longBitsToDouble(0x9CD57E4CCA94749DL ^ 0xDCE17E4CCA94749DL);
        }
        f2 = Float.parseFloat(this.Field17164.format(d2));
        this.Field17167 = l;
    }

    public void Method7396() {
        Arrays.fill(this.Field17163, Float.intBitsToFloat(0x26D90646 ^ 0x67790646));
        this.Field17166 = Float.intBitsToFloat((int)((long)1481051113 ^ (long)434572265));
    }

    public float Method7397() {
        return Float.intBitsToFloat((int)((long)1879063714 ^ (long)832584866)) / this.Field17166;
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
        if (this.Field17162.player == null) return (int)((long)-213369482 ^ (long)-213369482);
        if (this.Field17162.world != null) return this.Field17162.player.connection.getPlayerInfo(this.Field17162.player.connection.getGameProfile().getId()).getResponseTime();
        return (int)((long)-213369482 ^ (long)-213369482);
    }

    private void Method7402(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        this.Field17165.Method2801();
    }

    private static String Method7403(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-90976823 ^ (long)-90976823);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-18663948 ^ (long)-18664181);
            int n2 = (int)((long)-1210107611 ^ (long)-1210107610) << 5;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1223409260 ^ (long)-1223409507) << 5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

