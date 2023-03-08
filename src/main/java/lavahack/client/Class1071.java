//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.input.*;
import net.minecraft.client.settings.*;
import io.netty.util.internal.*;

public class Class1071 extends Class42
{
    private long Field12720;
    private long Field12721;
    private double Field12722;
    private double Field12723;
    private double Field12724;
    private double Field12725;
    private String Field12726 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1071() {
        super("AutoClicker", "clicks automatically", Class97.Field8338);
        Class1796.Field16241.Field16258.Method7569(new Class44("MinCPS", this, Double.longBitsToDouble(4620693217682128896L), 1.0, Double.longBitsToDouble((long)654114475 ^ 0x4034000026FCFEABL), false));
        Class1796.Field16241.Field16258.Method7569(new Class44("MaxCPS", this, Double.longBitsToDouble(4622945017495814144L), 1.0, Double.longBitsToDouble(4626322717216342016L), false));
    }
    
    @Override
    public void Method45() {
        if (Mouse.isButtonDown(0)) {
            if (System.currentTimeMillis() - this.Field12720 > this.Field12722 * Double.longBitsToDouble(4652007308841189376L)) {
                this.Field12720 = System.currentTimeMillis();
                if (this.Field12721 < this.Field12720) {
                    this.Field12721 = this.Field12720;
                }
                final int getKeyCode = Class1071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindAttack.getKeyCode();
                KeyBinding.setKeyBindState(getKeyCode, true);
                KeyBinding.onTick(getKeyCode);
                this.Method20();
            }
            else if (System.currentTimeMillis() - this.Field12721 > this.Field12723 * Double.longBitsToDouble((long)1806435970 ^ 0x408F40006BAC0682L)) {
                KeyBinding.setKeyBindState(Class1071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindAttack.getKeyCode(), false);
                this.Method20();
            }
        }
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
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x27D6 ^ 0x2C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
