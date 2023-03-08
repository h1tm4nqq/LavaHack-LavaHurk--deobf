//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import net.minecraft.server.*;

public class Class995 extends Class158
{
    private int Field12282;
    
    public Class995() {
        super("isonline");
    }
    
    public void Method443(@NotNull @NotNull final String s, @NotNull @NotNull final String[] array) {
        if (array.length < 1) {
            return;
        }
        final String s2 = array[0];
        final MinecraftServer getServer = Class995.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getServer();
        if (getServer == null || Class995.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.isSingleplayer()) {
            Class1393.Method5505().Method1892("You are not in a server right now");
            return;
        }
        if (getServer.getPlayerProfileCache().getGameProfileForUsername(s2) == null) {
            this.Method4025(s2);
        }
        else {
            this.Method4026(s2);
        }
    }
    
    private void Method4025(final String str) {
        Class1393.Method5505().Method1892(str + " is not online.");
    }
    
    private void Method4026(final String str) {
        Class1393.Method5505().Method1892(str + " is online.");
    }
    
    public String Method447() {
        return "checked wether a player is online or not";
    }
    
    public String Method448() {
        return "isonline";
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x46C ^ 0x37));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
