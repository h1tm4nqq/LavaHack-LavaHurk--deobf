//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.world.WorldServer
 *  net.minecraftforge.common.DimensionManager
 *  net.minecraftforge.common.util.FakePlayer
 */
package lavahack.client;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.util.FakePlayer;
import org.jetbrains.annotations.NotNull;

public class WkbQDlL8of92dndhXcSyafZihQ4djLks
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    private String Field14235 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public WkbQDlL8of92dndhXcSyafZihQ4djLks() {
        super("locate");
    }

    @Override
    public String Method447() {
        return "";
    }

    @Override
    public String Method448() {
        return "";
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        if (stringArray.length < ((int)-764838038L ^ 0xD2697F6B)) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1882("[Locate] To few arguments");
            return;
        }
        if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.isSingleplayer()) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507().Method1882("[Locate] You are in single player");
            return;
        }
        WorldServer worldServer = DimensionManager.getWorld((int)((int)((long)780966108 ^ (long)780966108)));
        GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "FakePlayer");
        FakePlayer fakePlayer = new FakePlayer(worldServer, gameProfile);
        MinecraftServer minecraftServer = fakePlayer.server;
        if (minecraftServer == null) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507().Method1882("[Locate] Server is null");
            return;
        }
        EntityPlayer entityPlayer = minecraftServer.getPlayerList().getPlayers().stream().filter(arg_0 -> WkbQDlL8of92dndhXcSyafZihQ4djLks.Method5468(stringArray, arg_0)).findFirst().orElse(null);
        if (entityPlayer == null) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507().Method1882("[Locate] Could not locate " + stringArray[(int)277077948L ^ 0x1083DFBC]);
            return;
        }
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503().Method1882("[Locate] The location of " + entityPlayer.getName() + " is:  x: " + entityPlayer.posX + ", y: " + entityPlayer.posY + ", z:" + entityPlayer.posZ);
    }

    private static boolean Method5468(String[] stringArray, EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.getName().equalsIgnoreCase(stringArray[(int)111278408L ^ 0x6A1F948]);
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)3912038L ^ 0x3BB166;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-416025003 ^ (long)-416024918);
            int n2 = (int)((long)-567194236 ^ (long)-567194199);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-2092663771 ^ (long)-2092672072) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

