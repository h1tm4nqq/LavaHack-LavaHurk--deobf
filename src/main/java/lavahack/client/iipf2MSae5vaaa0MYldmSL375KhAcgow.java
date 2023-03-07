//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class iipf2MSae5vaaa0MYldmSL375KhAcgow
extends qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 {
    private String Field8243 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public iipf2MSae5vaaa0MYldmSL375KhAcgow() {
        super("Tps", "");
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method660(RenderGameOverlayEvent.Text text) {
        ScaledResolution scaledResolution = new ScaledResolution(leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
        String string = TextFormatting.WHITE + "TPS: " + TextFormatting.GRAY + leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16275.Method7398();
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(string, scaledResolution.getScaledWidth() - (int)((long)-444908970 ^ (long)-444908969) - fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(string), scaledResolution.getScaledHeight() - ((int)412135512L ^ 0x1890B05B) - fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() * ((int)((long)1968411230 ^ (long)1968411231) << 1), (int)838903614L ^ 0xCDFF58C1);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1026099115 ^ (long)-1026099115);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1435855839L ^ 0xAA6A94DE);
            int n2 = (int)((long)385121816 ^ (long)385121813);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-292457109 ^ (long)-292478332) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

