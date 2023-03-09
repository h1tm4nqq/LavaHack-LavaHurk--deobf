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
import lavahack.client.Class1796;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Mouse;

public class Class1071
extends Class42 {
    private long Field12720;
    private long Field12721;
    private double Field12722;
    private double Field12723;
    private double Field12724;
    private double Field12725;
    private String Field12726 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1071() {
        super("AutoClicker", "clicks automatically", Class97.Field8338);
        Class1796.Field16241.Field16258.Method7569(new Class44("MinCPS", (Class42)this, Double.longBitsToDouble(0x4020000000000000L), 1.0, Double.longBitsToDouble((long)654114475 ^ 0x4034000026FCFEABL), false));
        Class1796.Field16241.Field16258.Method7569(new Class44("MaxCPS", (Class42)this, Double.longBitsToDouble(4622945017495814144L), 1.0, Double.longBitsToDouble(0x4034000000000000L), false));
    }

    @Override
    public void Method45() {
        if (!Mouse.isButtonDown((int)0)) return;
        if (!((double)(System.currentTimeMillis() - this.Field12720) > this.Field12722 * Double.longBitsToDouble(4652007308841189376L))) {
            if (!((double)(System.currentTimeMillis() - this.Field12721) > this.Field12723 * Double.longBitsToDouble((long)1806435970 ^ 0x408F40006BAC0682L))) return;
            KeyBinding.setKeyBindState((int)Class1071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindAttack.getKeyCode(), (boolean)false);
            this.Method20();
            return;
        }
        this.Field12720 = System.currentTimeMillis();
        if (this.Field12721 < this.Field12720) {
            this.Field12721 = this.Field12720;
        }
        int n = Class1071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindAttack.getKeyCode();
        KeyBinding.setKeyBindState((int)n, (boolean)true);
        KeyBinding.onTick((int)n);
        this.Method20();
    }

    @Override
    public void Method38() {
        this.Method20();
    }

    private void Method20() {
        this.Field12724 = Class1796.Field16241.Field16258.Method7572(this, "MinCPS").Method367();
        this.Field12725 = Class1796.Field16241.Field16258.Method7572(this, "MaxCPS").Method367();
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 44;
            cArray2[n] = (char)(cArray[n] ^ (0x27D6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

