//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.player.*;
import net.minecraft.util.text.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class1676 extends Class42
{
    private Class44 Field15810;
    private String Field15811 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1676() {
        super("TotemPopCounter", "totem pops count!", Class97.Field8343);
        this.Field15810 = new Class44("Target", this, Class439.Field9836);
        Class1676.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15810);
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method6468(final Class1102 class1102) {
        if (class1102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi() instanceof EntityPlayer) {
            final boolean method3042 = Class1796.Field16241.Field16256.Method3042((EntityPlayer)class1102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi());
            if (method3042 && this.Field15810.Method359().equals("Only Other Players")) {
                return;
            }
            if (!method3042 && this.Field15810.Method359().equals("Only Friends")) {
                return;
            }
            Class1393.Method5507().Method1886((method3042 ? TextFormatting.AQUA : TextFormatting.GRAY) + class1102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi().getName() + TextFormatting.GRAY + " was popped totem!");
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x70B2 ^ 0xAC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
