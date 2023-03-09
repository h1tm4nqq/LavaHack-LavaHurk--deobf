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
import lavahack.client.Class1393;
import lavahack.client.Class158;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.util.FakePlayer;
import org.jetbrains.annotations.NotNull;

public class Class1371
extends Class158 {
    private String Field14235 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1371() {
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
        if (stringArray.length < 1) {
            Class1393.Method5504().Method1882("[Locate] To few arguments");
            return;
        }
        if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.isSingleplayer()) {
            Class1393.Method5507().Method1882("[Locate] You are in single player");
            return;
        }
        WorldServer worldServer = DimensionManager.getWorld((int)0);
        GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "FakePlayer");
        FakePlayer fakePlayer = new FakePlayer(worldServer, gameProfile);
        MinecraftServer minecraftServer = fakePlayer.server;
        if (minecraftServer == null) {
            Class1393.Method5507().Method1882("[Locate] Server is null");
            return;
        }
        EntityPlayer entityPlayer = minecraftServer.getPlayerList().getPlayers().stream().filter(arg_0 -> Class1371.Method5468(stringArray, arg_0)).findFirst().orElse(null);
        if (entityPlayer == null) {
            Class1393.Method5507().Method1882("[Locate] Could not locate " + stringArray[0]);
            return;
        }
        Class1393.Method5503().Method1882("[Locate] The location of " + entityPlayer.getName() + " is:  x: " + entityPlayer.posX + ", y: " + entityPlayer.posY + ", z:" + entityPlayer.posZ);
    }

    private static boolean Method5468(String[] stringArray, EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.getName().equalsIgnoreCase(stringArray[0]);
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 45;
            cArray2[n] = (char)(cArray[n] ^ (0x4F3A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

