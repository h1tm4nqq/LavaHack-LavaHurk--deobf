//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.server.MinecraftServer
 */
package lavahack.client;

import lavahack.client.Class1393;
import lavahack.client.Class158;
import net.minecraft.server.MinecraftServer;
import org.jetbrains.annotations.NotNull;

public class Class995
extends Class158 {
    private int Field12282;

    public Class995() {
        super("isonline");
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        if (stringArray.length < 1) {
            return;
        }
        String string2 = stringArray[0];
        MinecraftServer minecraftServer = Class995.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getServer();
        if (minecraftServer == null || leqS0IyKEB621E1SrHdAcHHAUjScjmKi.isSingleplayer()) {
            Class1393.Method5505().Method1892("You are not in a server right now");
            return;
        }
        if (minecraftServer.getPlayerProfileCache().getGameProfileForUsername(string2) == null) {
            this.Method4025(string2);
            return;
        }
        this.Method4026(string2);
    }

    private void Method4025(String string) {
        Class1393.Method5505().Method1892(string + " is not online.");
    }

    private void Method4026(String string) {
        Class1393.Method5505().Method1892(string + " is online.");
    }

    @Override
    public String Method447() {
        return "checked wether a player is online or not";
    }

    @Override
    public String Method448() {
        return "isonline";
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 55;
            cArray2[n] = (char)(cArray[n] ^ (0x46C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

