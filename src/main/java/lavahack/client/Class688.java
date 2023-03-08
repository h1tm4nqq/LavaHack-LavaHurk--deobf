//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;

public class Class688
{
    private final Vec3d Field10903;
    private final Vec3d Field10904;
    byte Field10905;
    final Class517 Field10906;
    private String Field10907 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class688(final Class517 field10906, final Vec3d field10907, final Vec3d field10908) {
        this.Field10906 = field10906;
        this.Field10903 = field10907;
        this.Field10904 = field10908;
    }
    
    Vec3d Method2897() {
        return this.Field10903;
    }
    
    Vec3d Method2898() {
        return this.Field10904;
    }
    
    boolean Method2899() {
        final byte field10905 = (byte)(this.Field10905 + 1);
        this.Field10905 = field10905;
        return field10905 > 20;
    }
}
