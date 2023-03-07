//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.server.MinecraftServer
 */
package lavahack.client;

import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import net.minecraft.server.MinecraftServer;
import org.jetbrains.annotations.NotNull;

public class LRdTaqFvP6octuOsbjW0eaaIOTvdwDd3
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    private int Field12282;

    public LRdTaqFvP6octuOsbjW0eaaIOTvdwDd3() {
        super("isonline");
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        if (stringArray.length < ((int)110568743L ^ 0x6972526)) {
            return;
        }
        String string2 = stringArray[(int)-954484187L ^ 0xC71BBA25];
        MinecraftServer minecraftServer = LRdTaqFvP6octuOsbjW0eaaIOTvdwDd3.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getServer();
        if (minecraftServer == null || leqS0IyKEB621E1SrHdAcHHAUjScjmKi.isSingleplayer()) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1892("You are not in a server right now");
            return;
        }
        if (minecraftServer.getPlayerProfileCache().getGameProfileForUsername(string2) == null) {
            this.Method4025(string2);
            return;
        }
        this.Method4026(string2);
    }

    private void Method4025(String string) {
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1892(string + " is not online.");
    }

    private void Method4026(String string) {
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1892(string + " is online.");
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
        int n = (int)-1781221545L ^ 0x95D4B757;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-846290331L ^ 0xCD8EA29A);
            int n2 = (int)899511097L ^ 0x359D730E;
            cArray2[n] = (char)(cArray[n] ^ (((int)289887643L ^ 0x11475480) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

