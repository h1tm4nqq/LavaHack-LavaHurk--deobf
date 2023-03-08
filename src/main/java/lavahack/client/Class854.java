//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.player.*;
import net.minecraftforge.fml.common.network.simpleimpl.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.fml.common.gameevent.*;

public class Class854
{
    public static final Class854 Field11602;
    private String Field11603 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class854() {
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method3591(final PlayerEvent$PlayerLoggedInEvent playerEvent$PlayerLoggedInEvent) {
        if (playerEvent$PlayerLoggedInEvent.player instanceof EntityPlayerMP) {
            Class137.Field8524.sendTo((IMessage)new Class446(Class32.Field7993, Class32.Field7994, Class32.Field7995), (EntityPlayerMP)playerEvent$PlayerLoggedInEvent.player);
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method3592(final PlayerEvent$PlayerLoggedOutEvent playerEvent$PlayerLoggedOutEvent) {
        if (playerEvent$PlayerLoggedOutEvent.player instanceof EntityPlayerMP) {
            Class257.Field9154.Field9156.remove(playerEvent$PlayerLoggedOutEvent.player);
        }
    }
    
    static {
        Field11602 = new Class854();
    }
    
    private static String Method3593(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3130 ^ 0xB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
