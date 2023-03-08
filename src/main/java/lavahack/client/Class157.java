//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;

@Deprecated
public class Class157 extends Class42
{
    private final Class44 Field8616;
    private final Class44 Field8617;
    private String Field8618 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class157() {
        super("FovModifier", Class97.Field8342, true);
        this.Field8616 = this.Method23(new Class44("SettingFOV", this, 1.0, 0.0, Double.longBitsToDouble(4621819117588971520L), false));
        this.Field8617 = this.Method23(new Class44("Static", this, true));
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method1054(final FOVUpdateEvent fovUpdateEvent) {
        fovUpdateEvent.setNewfov(this.Field8617.Method365() ? this.Field8616.Method368() : (fovUpdateEvent.getFov() * this.Field8616.Method368()));
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5F18 ^ 0xCF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
