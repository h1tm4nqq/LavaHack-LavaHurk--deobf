//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import net.minecraftforge.common.*;
import java.util.*;
import com.mojang.authlib.*;
import net.minecraftforge.common.util.*;
import java.util.function.*;
import net.minecraft.server.*;
import net.minecraft.entity.player.*;

public class Class1371 extends Class158
{
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
    public void Method443(@NotNull @NotNull final String s, @NotNull @NotNull final String[] array) {
        if (array.length < 1) {
            Class1393.Method5504().Method1882("[Locate] To few arguments");
            return;
        }
        if (Class1371.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.isSingleplayer()) {
            Class1393.Method5507().Method1882("[Locate] You are in single player");
            return;
        }
        final MinecraftServer server = new FakePlayer(DimensionManager.getWorld(0), new GameProfile(UUID.randomUUID(), "FakePlayer")).server;
        if (server == null) {
            Class1393.Method5507().Method1882("[Locate] Server is null");
            return;
        }
        final EntityPlayer entityPlayer = (EntityPlayer)server.getPlayerList().getPlayers().stream().filter(Class1371::Method5468).findFirst().orElse(null);
        if (entityPlayer == null) {
            Class1393.Method5507().Method1882("[Locate] Could not locate " + array[0]);
            return;
        }
        Class1393.Method5503().Method1882("[Locate] The location of " + entityPlayer.getName() + " is:  x: " + entityPlayer.posX + ", y: " + entityPlayer.posY + ", z:" + entityPlayer.posZ);
    }
    
    private static boolean Method5468(final String[] array, final EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.getName().equalsIgnoreCase(array[0]);
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4F3A ^ 0x2D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
