//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MsPlJFiJVMhX3xvgRVXIup7vDIzzV5L4
extends qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8022 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Astolfo", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1841592868 ^ (long)-1841592867)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8023 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Color", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)-825364454L ^ 0x31320FE5)));
    private String Field8024 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public MsPlJFiJVMhX3xvgRVXIup7vDIzzV5L4() {
        super("Welcomer", (boolean)((long)139983281 ^ (long)139983280));
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method276(RenderGameOverlayEvent.Text text) {
        int n = this.Field8022.Method365() ? zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)-1309502946L ^ 0xB1F29207) << 2, (int)((long)-164221156 ^ (long)-164221179) << 2) : this.Field8023.Method339().Method3626();
        this.Method273(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741("Welcome to " + leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6783() + ", " + MsPlJFiJVMhX3xvgRVXIup7vDIzzV5L4.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getName() + "!"));
        this.Method274(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748());
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745("Welcome to " + leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6783() + ", " + MsPlJFiJVMhX3xvgRVXIup7vDIzzV5L4.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getName() + "!", this.Method267(), this.Method268(), n);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1253969064 ^ (long)1253969064);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-385691992 ^ (long)-385692073);
            int n2 = (int)1592404749L ^ 0x5EEA2B28;
            cArray2[n] = (char)(cArray[n] ^ (((int)140764312L ^ 0x863F505) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

