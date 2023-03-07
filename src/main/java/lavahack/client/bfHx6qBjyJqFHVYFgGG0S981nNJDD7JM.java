//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.internal.ThreadLocalRandom
 *  net.minecraft.client.settings.KeyBinding
 *  org.lwjgl.input.Mouse
 */
package lavahack.client;

import io.netty.util.internal.ThreadLocalRandom;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Mouse;

public class bfHx6qBjyJqFHVYFgGG0S981nNJDD7JM
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private long Field12720;
    private long Field12721;
    private double Field12722;
    private double Field12723;
    private double Field12724;
    private double Field12725;
    private String Field12726 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public bfHx6qBjyJqFHVYFgGG0S981nNJDD7JM() {
        super("AutoClicker", "clicks automatically", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7569(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("MinCPS", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x9AB603BBF71A9184L ^ 0xDA9603BBF71A9184L), 1.0, Double.longBitsToDouble((long)654114475 ^ 0x4034000026FCFEABL), (boolean)((long)-2135337031 ^ (long)-2135337031)));
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7569(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("MaxCPS", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x4A91ED8D406FC03DL ^ 0xAB9ED8D406FC03DL), 1.0, Double.longBitsToDouble(0x2AAD27B68F097C50L ^ 0x6A9927B68F097C50L), (boolean)((long)-1166058123 ^ (long)-1166058123)));
    }

    @Override
    public void Method45() {
        if (!Mouse.isButtonDown((int)((int)-2078413248L ^ 0x841DEE40))) return;
        if (!((double)(System.currentTimeMillis() - this.Field12720) > this.Field12722 * Double.longBitsToDouble(0x8AE6F54B9640A5D4L ^ 0xCA69B54B9640A5D4L))) {
            if (!((double)(System.currentTimeMillis() - this.Field12721) > this.Field12723 * Double.longBitsToDouble((long)1806435970 ^ 0x408F40006BAC0682L))) return;
            KeyBinding.setKeyBindState((int)bfHx6qBjyJqFHVYFgGG0S981nNJDD7JM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindAttack.getKeyCode(), ((int)752096507L ^ 0x2CD414FB) != 0);
            this.Method20();
            return;
        }
        this.Field12720 = System.currentTimeMillis();
        if (this.Field12721 < this.Field12720) {
            this.Field12721 = this.Field12720;
        }
        int n = bfHx6qBjyJqFHVYFgGG0S981nNJDD7JM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindAttack.getKeyCode();
        KeyBinding.setKeyBindState((int)n, ((int)-1697155232L ^ 0x9AD77761) != 0);
        KeyBinding.onTick((int)n);
        this.Method20();
    }

    @Override
    public void Method38() {
        this.Method20();
    }

    private void Method20() {
        this.Field12724 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7572(this, "MinCPS").Method367();
        this.Field12725 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7572(this, "MaxCPS").Method367();
        if (this.Field12724 >= this.Field12725) {
            this.Field12725 = this.Field12724 + 1.0;
        }
        this.Field12722 = 1.0 / ThreadLocalRandom.current().nextDouble(this.Field12724 - Double.longBitsToDouble((long)643647736 ^ 0x3FC99999BFC4D162L), this.Field12725);
        this.Field12723 = this.Field12722 / ThreadLocalRandom.current().nextDouble(this.Field12724, this.Field12725);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-359882040 ^ (long)-359882040);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)676906799 ^ (long)676906960);
            int n2 = (int)((long)208584695 ^ (long)208584700) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)1718968332L ^ 0x667573E7) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

