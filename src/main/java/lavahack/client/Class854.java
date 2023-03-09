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

import lavahack.client.Class137;
import lavahack.client.Class257;
import lavahack.client.Class32;
import lavahack.client.Class446;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class Class854 {
    public static final Class854 Field11602 = new Class854();
    private String Field11603 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Class854() {
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method3591(PlayerEvent.PlayerLoggedInEvent playerLoggedInEvent) {
        if (!(playerLoggedInEvent.player instanceof EntityPlayerMP)) return;
        Class137.Field8524.sendTo((IMessage)new Class446(Class32.Field7993, Class32.Field7994, Class32.Field7995), (EntityPlayerMP)playerLoggedInEvent.player);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method3592(PlayerEvent.PlayerLoggedOutEvent playerLoggedOutEvent) {
        if (!(playerLoggedOutEvent.player instanceof EntityPlayerMP)) return;
        Class257.Field9154.Field9156.remove(playerLoggedOutEvent.player);
    }

    private static String Method3593(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 11;
            cArray2[n] = (char)(cArray[n] ^ (0x3130 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

