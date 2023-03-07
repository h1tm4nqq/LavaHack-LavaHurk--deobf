//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.server.SPacketEffect
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.bZiUWDeb9iTD5vBgY6J7hAWBm6xzdKPD;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.network.play.server.SPacketEffect;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;

public class TNw6sVZUfNlRnzgpmt0sm4Ztq2t9A2L8
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field17278 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(TNw6sVZUfNlRnzgpmt0sm4Ztq2t9A2L8::Method7472, new Predicate[(int)((long)2121070293 ^ (long)2121070293)]);
    private String Field17279 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public TNw6sVZUfNlRnzgpmt0sm4Ztq2t9A2L8() {
        super("SoundCoordLogger", "log", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field17278);
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field17278);
    }

    private static void Method7472(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketEffect)) return;
        SPacketEffect sPacketEffect = (SPacketEffect)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
        switch (sPacketEffect.getSoundType()) {
            case 1023: {
                NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503().Method1886("Wither Spawned at " + bZiUWDeb9iTD5vBgY6J7hAWBm6xzdKPD.Method4533(new Vec3d((Vec3i)sPacketEffect.getSoundPos()), new boolean[(int)2113126775L ^ 0x7DF3C177]));
                return;
            }
            case 1028: {
                NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503().Method1886("Ender Dragon Spawned at " + bZiUWDeb9iTD5vBgY6J7hAWBm6xzdKPD.Method4533(new Vec3d((Vec3i)sPacketEffect.getSoundPos()), new boolean[(int)667999711L ^ 0x27D0DDDF]));
                return;
            }
            case 1038: {
                NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503().Method1886("End Portal Spawned at " + bZiUWDeb9iTD5vBgY6J7hAWBm6xzdKPD.Method4533(new Vec3d((Vec3i)sPacketEffect.getSoundPos()), new boolean[(int)269073462L ^ 0x1009BC36]));
                return;
            }
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1943331877 ^ (long)1943331877);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1535473506 ^ (long)-1535473567);
            int n2 = (int)-1452486092L ^ 0xA96CD203;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)2073201858 ^ (long)2073213707) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

