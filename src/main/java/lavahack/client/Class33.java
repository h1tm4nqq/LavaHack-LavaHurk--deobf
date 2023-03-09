//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class1249;
import lavahack.client.Class1796;
import lavahack.client.Class42;
import lavahack.client.Class44;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class33
extends Class1249 {
    private final Class44 Field8022 = this.Method23(new Class44("Astolfo", (Class42)this, true));
    private final Class44 Field8023 = this.Method23(new Class44("Color", (Class42)this, "Color", new Class2027(-1)));
    private String Field8024 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class33() {
        super("Welcomer", true);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method276(RenderGameOverlayEvent.Text text) {
        int n = this.Field8022.Method365() ? Class1172.Method4709(100, 100) : this.Field8023.Method339().Method3626();
        this.Method273(Class1178.Method4741("Welcome to " + Class1796.Method6783() + ", " + Class33.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getName() + "!"));
        this.Method274(Class1178.Method4748());
        Class1178.Method4745("Welcome to " + Class1796.Method6783() + ", " + Class33.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getName() + "!", this.Method267(), this.Method268(), n);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 37;
            cArray2[n] = (char)(cArray[n] ^ (0x233A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

