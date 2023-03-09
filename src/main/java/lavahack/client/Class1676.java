//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import lavahack.client.Class1102;
import lavahack.client.Class1393;
import lavahack.client.Class1796;
import lavahack.client.Class42;
import lavahack.client.Class439;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class1676
extends Class42 {
    private Class44 Field15810 = new Class44("Target", (Class42)this, Class439.Field9836);
    private String Field15811 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1676() {
        super("TotemPopCounter", "totem pops count!", Class97.Field8343);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15810);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6468(Class1102 class1102) {
        if (!(class1102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi() instanceof EntityPlayer)) return;
        boolean bl = Class1796.Field16241.Field16256.Method3042((EntityPlayer)class1102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi());
        if (bl && this.Field15810.Method359().equals("Only Other Players")) {
            return;
        }
        if (!bl && this.Field15810.Method359().equals("Only Friends")) {
            return;
        }
        Class1393.Method5507().Method1886((bl ? TextFormatting.AQUA : TextFormatting.GRAY) + class1102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi().getName() + TextFormatting.GRAY + " was popped totem!");
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 172;
            cArray2[n] = (char)(cArray[n] ^ (0x70B2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

