/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerLoggedInEvent
 *  net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerLoggedOutEvent
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package lavahack.client;

import lavahack.client.L2xmcmr9Tre1qBd8su5PcdMk38D1GW4H;
import lavahack.client.Mw1rH0enxHoGt2yOomU73geB3GiYFx8A;
import lavahack.client.WdF17rpDcljzldlz6kIRntB5TqnkfIw6;
import lavahack.client.Z59nFS7fzGt9MllssMcgOsEYj1a2guaH;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class bLiocnT95Bnf0KDTfpHfig9HoIv3dJMv {
    public static final bLiocnT95Bnf0KDTfpHfig9HoIv3dJMv Field11602 = new bLiocnT95Bnf0KDTfpHfig9HoIv3dJMv();
    private String Field11603 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private bLiocnT95Bnf0KDTfpHfig9HoIv3dJMv() {
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method3591(PlayerEvent.PlayerLoggedInEvent playerLoggedInEvent) {
        if (!(playerLoggedInEvent.player instanceof EntityPlayerMP)) return;
        L2xmcmr9Tre1qBd8su5PcdMk38D1GW4H.Field8524.sendTo((IMessage)new WdF17rpDcljzldlz6kIRntB5TqnkfIw6(Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7993, Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7994, Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7995), (EntityPlayerMP)playerLoggedInEvent.player);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method3592(PlayerEvent.PlayerLoggedOutEvent playerLoggedOutEvent) {
        if (!(playerLoggedOutEvent.player instanceof EntityPlayerMP)) return;
        Mw1rH0enxHoGt2yOomU73geB3GiYFx8A.Field9154.Field9156.remove(playerLoggedOutEvent.player);
    }

    private static String Method3593(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1053827010L ^ 0xC12FE03E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1800365267 ^ (long)-1800365102);
            int n2 = (int)1837548506L ^ 0x6D86C3D1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1033831818L ^ 0xC260F965) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

