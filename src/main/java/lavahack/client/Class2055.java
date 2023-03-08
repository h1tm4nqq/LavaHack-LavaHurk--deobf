//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class2055 extends Class42
{
    private final Class44 Field17406;
    private String Field17407 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2055() {
        super("ObjectMouseOver", Class97.Field8345, true);
        this.Field17406 = this.Method23(new Class44("Range", this, Double.longBitsToDouble(4617315517961601024L), 1.0, Double.longBitsToDouble((long)1709093911 ^ 0x4049000065DEB417L), false));
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method7574(final RenderWorldLastEvent renderWorldLastEvent) {
        if (Class2055.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class2055.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        Class1036.Method4206();
        final float rotationYaw = Class2055.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        final float intBitsToFloat = Float.intBitsToFloat(1135869952);
        return (void)((rotationYaw % intBitsToFloat + intBitsToFloat) % intBitsToFloat);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2E94 ^ 0x1C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
