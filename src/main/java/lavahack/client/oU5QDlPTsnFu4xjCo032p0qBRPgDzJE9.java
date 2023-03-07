//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.Vec3i
 *  org.lwjgl.input.Mouse
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3i;
import org.lwjgl.input.Mouse;

public class oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field16207 = new oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
    private String Field16208 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9() {
        super("SelectionPlacer", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
    }

    @Override
    public void Method45() {
        if (oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method862(this.Field16207)) {
            this.Method20();
        }
        if (!oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method862(this.Field16207)) {
            return;
        }
        oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = new oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf((Vec3i)this.Field16207.Field8442, (Vec3i)this.Field16207.Field8443, null);
        this.Method6768(oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
    }

    private void Method6768(oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) {
        if (!oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method5995(oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)) {
            return;
        }
        if (!(oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem).getItem() instanceof ItemBlock)) {
            return;
        }
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method5996(oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), EnumHand.MAIN_HAND, (boolean)((long)-587908979 ^ (long)-587908979), ((int)924553710L ^ 0x371B91EE) != 0);
    }

    private void Method20() {
        if (!Mouse.isButtonDown((int)((int)((long)613746051 ^ (long)613746051)))) {
            return;
        }
        oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method863(this.Field16207, oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos());
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-762453959 ^ (long)-762453959);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)310007756L ^ 0x127A5733);
            int n2 = (int)-979901347L ^ 0xC597E456;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)180638330 ^ (long)180631649) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

