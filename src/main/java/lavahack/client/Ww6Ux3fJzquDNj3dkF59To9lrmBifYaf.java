//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.init.MobEffects
 *  net.minecraft.network.play.client.CPacketPlayer
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.network.play.client.CPacketPlayer;

public class Ww6Ux3fJzquDNj3dkF59To9lrmBifYaf
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10821 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Ticks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1826685873 ^ 0x403200006CE103B1L), 1.0, Double.longBitsToDouble(0x52970371DF42E758L ^ 0x12FE0371DF42E758L), ((int)-2094396454L ^ 0x832A0BDB) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10822 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Timer", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1001913323 ^ 0x3FFCCCCCF77B3726L), 1.0, Double.longBitsToDouble((long)1010252471 ^ 0x400800003C373AB7L), ((int)-875775744L ^ 0xCBCCB900) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10823 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("While Speed Effect", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)238100038 ^ (long)238100038)));
    private int Field10824 = (int)((long)1116468188 ^ (long)1116468188);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field10825 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method2839, new Predicate[(int)1029828065L ^ 0x3D61EDE1]);
    private int Field10826;

    public Ww6Ux3fJzquDNj3dkF59To9lrmBifYaf() {
        super("TickShift", "boobs", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field10825);
        this.Field10824 = (int)((long)445970270 ^ (long)445970270);
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field10825);
        Ww6Ux3fJzquDNj3dkF59To9lrmBifYaf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = Float.intBitsToFloat((int)((long)1954649539 ^ (long)919180739));
    }

    @Override
    public void Method45() {
        if (Ww6Ux3fJzquDNj3dkF59To9lrmBifYaf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Ww6Ux3fJzquDNj3dkF59To9lrmBifYaf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field10823.Method365() && Ww6Ux3fJzquDNj3dkF59To9lrmBifYaf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive(MobEffects.SPEED)) {
            this.Field10824 = (int)((long)1333915143 ^ (long)1333915143);
            Ww6Ux3fJzquDNj3dkF59To9lrmBifYaf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = Float.intBitsToFloat((int)((long)2092874738 ^ (long)1056357362));
            return;
        }
        if (this.Field10824 <= 0) {
            this.Field10824 = (int)1898828666L ^ 0x712DD37A;
        }
        Ww6Ux3fJzquDNj3dkF59To9lrmBifYaf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = Float.intBitsToFloat((int)((long)387104284 ^ (long)1432010268));
        if (this.Field10824 > 0 && PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6651((EntityLivingBase)Ww6Ux3fJzquDNj3dkF59To9lrmBifYaf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) {
            this.Field10824 -= (int)-718293036L ^ 0xD52FB7D5;
            Ww6Ux3fJzquDNj3dkF59To9lrmBifYaf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = (float)(Double.longBitsToDouble(0x87CC04754E0AB115L ^ 0xC78504754E0AB115L) / this.Field10822.Method367());
        }
        if (!PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6651((EntityLivingBase)Ww6Ux3fJzquDNj3dkF59To9lrmBifYaf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) {
            this.Field10824 += (int)((long)-1390221719 ^ (long)-1390221720);
        }
        if (this.Field10824 < this.Field10821.Method335()) return;
        this.Field10824 = this.Field10821.Method335();
    }

    private void Method2839(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketPlayer)) return;
        this.Field10824 -= (int)((long)1088998801 ^ (long)1088998800);
        if (this.Field10824 > 0) return;
        this.Field10824 = (int)374064025L ^ 0x164BC399;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1486236464L ^ 0x58962B30;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1831046538L ^ 0x92DC7289);
            int n2 = (int)1352682073L ^ 0x50A04AA2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1598433085 ^ (long)1598434020) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

