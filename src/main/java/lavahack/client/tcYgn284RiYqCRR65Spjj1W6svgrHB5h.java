//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.client.CPacketCloseWindow
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.network.play.client.CPacketCloseWindow;

public class tcYgn284RiYqCRR65Spjj1W6svgrHB5h
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field8040 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(tcYgn284RiYqCRR65Spjj1W6svgrHB5h::Method282, new Predicate[(int)242128824L ^ 0xE6E97B8]);
    private String Field8041 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public tcYgn284RiYqCRR65Spjj1W6svgrHB5h() {
        super("XCarry", "XCarry", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field8040);
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field8040);
    }

    private static void Method282(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketCloseWindow)) return;
        CPacketCloseWindow cPacketCloseWindow = (CPacketCloseWindow)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982();
        if (cPacketCloseWindow.windowId != tcYgn284RiYqCRR65Spjj1W6svgrHB5h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId) return;
        tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method158();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-594440053 ^ (long)-594440053);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-2021751197 ^ (long)-2021751140);
            int n2 = (int)((long)-1518522839 ^ (long)-1518522800) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)1946673308L ^ 0x7407FDF5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

