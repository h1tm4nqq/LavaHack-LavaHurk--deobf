/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import lavahack.client.Class115;
import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class1249;
import lavahack.client.Class42;
import lavahack.client.Class44;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class493
extends Class1249 {
    private final Class44 Field10047 = this.Method23(new Class44("Astolfo", (Class42)this, true));
    private final Class44 Field10048 = this.Method23(new Class44("Color", (Class42)this, new Class2027(255, 255, 255, 255)));
    private String Field10049 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class493() {
        super("CrystalPerSecond", true);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2281(RenderGameOverlayEvent.Text text) {
        int n = this.Field10047.Method365() ? Class1172.Method4709(100, 100) : this.Field10048.Method339().Method3626();
        String string = "Crystal/Sec: " + TextFormatting.GRAY + Class115.Field8400.Field8403.Method3990();
        Class1178.Method4745(string, this.Method267(), this.Method268(), n);
        this.Method273(Class1178.Method4741(string));
        this.Method274(Class1178.Method4748());
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 54;
            cArray2[n] = (char)(cArray[n] ^ (0x4BF6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

