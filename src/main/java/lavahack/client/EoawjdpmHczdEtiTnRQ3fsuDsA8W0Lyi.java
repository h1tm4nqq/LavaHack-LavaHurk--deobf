//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import lavahack.client.bswyLzHpeAZv7X9IKxiqd0ExgIBOww74;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EoawjdpmHczdEtiTnRQ3fsuDsA8W0Lyi
extends qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 {
    private final bswyLzHpeAZv7X9IKxiqd0ExgIBOww74 Field9924 = this.Method275();
    private String Field9925 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public EoawjdpmHczdEtiTnRQ3fsuDsA8W0Lyi() {
        super("ServerIp", "", ((int)1893943260L ^ 0x70E347DD) != 0);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2176(RenderGameOverlayEvent.Text text) {
        this.Method273(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741("Server: " + (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.isSingleplayer() ? "SingePlayer" : EoawjdpmHczdEtiTnRQ3fsuDsA8W0Lyi.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getCurrentServerData().serverIP.toLowerCase())));
        this.Method274(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748());
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745("Server: " + TextFormatting.GRAY + (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.isSingleplayer() ? "SingePlayer" : EoawjdpmHczdEtiTnRQ3fsuDsA8W0Lyi.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getCurrentServerData().serverIP.toLowerCase()), this.Method267(), this.Method268(), this.Field9924.Method2151().Method3626());
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1669287628L ^ 0x637F4ECC;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-780167280 ^ (long)-780167313);
            int n2 = (int)((long)1850513789 ^ (long)1850513836);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1559624751 ^ (long)-1559624294) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

