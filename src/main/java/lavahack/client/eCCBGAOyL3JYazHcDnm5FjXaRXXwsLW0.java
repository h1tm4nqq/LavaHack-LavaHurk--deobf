//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.client.CPacketPlayer
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.network.play.client.CPacketPlayer;

public class eCCBGAOyL3JYazHcDnm5FjXaRXXwsLW0
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private boolean Field16601 = (int)((long)708160438 ^ (long)708160438);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16602 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method6971, new Predicate[(int)-116527521L ^ 0xF90DEE5F]);
    private String Field16603 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public eCCBGAOyL3JYazHcDnm5FjXaRXXwsLW0() {
        super("Ghost", "Allows you to walk after death, after disabling you are respawn", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field16602);
        this.Field16601 = (int)-1935901467L ^ 0x8C9C7CE5;
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field16602);
        if (eCCBGAOyL3JYazHcDnm5FjXaRXXwsLW0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null) {
            eCCBGAOyL3JYazHcDnm5FjXaRXXwsLW0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.respawnPlayer();
        }
        this.Field16601 = (int)1386343183L ^ 0x52A1EB0F;
    }

    @Override
    public void Method45() {
        if (eCCBGAOyL3JYazHcDnm5FjXaRXXwsLW0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (eCCBGAOyL3JYazHcDnm5FjXaRXXwsLW0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (eCCBGAOyL3JYazHcDnm5FjXaRXXwsLW0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() != 0.0f) return;
        eCCBGAOyL3JYazHcDnm5FjXaRXXwsLW0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setHealth(Float.intBitsToFloat((int)((long)1733052072 ^ (long)653018792)));
        eCCBGAOyL3JYazHcDnm5FjXaRXXwsLW0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isDead = (int)536110166L ^ 0x1FF46456;
        this.Field16601 = (int)-438059447L ^ 0xE5E3BE48;
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.displayGuiScreen(null);
        eCCBGAOyL3JYazHcDnm5FjXaRXXwsLW0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPositionAndUpdate(eCCBGAOyL3JYazHcDnm5FjXaRXXwsLW0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, eCCBGAOyL3JYazHcDnm5FjXaRXXwsLW0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, eCCBGAOyL3JYazHcDnm5FjXaRXXwsLW0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
    }

    private void Method6971(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        if (!this.Field16601) return;
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketPlayer)) return;
        tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method158();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1394079174 ^ (long)-1394079174);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)2082324131L ^ 0x7C1DBE5C);
            int n2 = (int)-1192906464L ^ 0xB8E5B15F;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1786163073 ^ (long)-1786152870) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

