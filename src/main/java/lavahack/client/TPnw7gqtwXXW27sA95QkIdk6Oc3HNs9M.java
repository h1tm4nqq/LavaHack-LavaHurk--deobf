/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.I7F8iz7oQorkIm5qDcfi8iw0hGUOnlSO;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class TPnw7gqtwXXW27sA95QkIdk6Oc3HNs9M
extends qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10047 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Astolfo", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1937996584 ^ (long)1937996585)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10048 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)-11879333 ^ (long)-11879260), (int)((long)-223122705 ^ (long)-223122928), (int)((long)-1462023405 ^ (long)-1462023188), (int)-2130520489L ^ 0x8102D6A8)));
    private String Field10049 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public TPnw7gqtwXXW27sA95QkIdk6Oc3HNs9M() {
        super("CrystalPerSecond", ((int)-1950303638L ^ 0x8BC0BA6B) != 0);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2281(RenderGameOverlayEvent.Text text) {
        int n = this.Field10047.Method365() ? zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)558788434L ^ 0x214E6F4B) << 2, ((int)1516394359L ^ 0x5A62576E) << 2) : this.Field10048.Method339().Method3626();
        String string = "Crystal/Sec: " + TextFormatting.GRAY + I7F8iz7oQorkIm5qDcfi8iw0hGUOnlSO.Field8400.Field8403.Method3990();
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(string, this.Method267(), this.Method268(), n);
        this.Method273(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(string));
        this.Method274(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748());
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1583969548 ^ (long)1583969548);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1274235150 ^ (long)-1274235379);
            int n2 = ((int)-395955301L ^ 0xE8663380) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1892306126L ^ 0x8F3596C9) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

