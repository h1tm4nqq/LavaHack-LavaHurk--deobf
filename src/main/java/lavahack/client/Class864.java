//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.IWorldEventListener
 *  net.minecraft.world.World
 *  net.minecraftforge.event.world.WorldEvent$Load
 *  net.minecraftforge.event.world.WorldEvent$Unload
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import lavahack.client.Class1479;
import lavahack.client.Class46;
import lavahack.client.Class542;
import lavahack.client.Class934;
import net.minecraft.world.IWorldEventListener;
import net.minecraft.world.World;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class864 {
    private String Field11642 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public void Method3652(WorldEvent.Load load) {
        World world = load.getWorld();
        if (!world.isRemote) return;
        if (world instanceof Class1479) return;
        Class934.Field11944.setWorldAndLoadRenderers(Class46.Field8122);
        Class864.Method3654(world, (IWorldEventListener)Class934.Field11944);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method3653(WorldEvent.Unload unload) {
        World world = unload.getWorld();
        if (!world.isRemote) return;
        Class864.Method3655(world, (IWorldEventListener)Class934.Field11944);
    }

    public static void Method3654(World world, IWorldEventListener iWorldEventListener) {
        if (world == null) return;
        if (iWorldEventListener == null) return;
        Class542.Field10314.debug("Adding world access to {}", (Object)world);
        world.addEventListener(iWorldEventListener);
    }

    public static void Method3655(World world, IWorldEventListener iWorldEventListener) {
        if (world == null) return;
        if (iWorldEventListener == null) return;
        Class542.Field10314.debug("Removing world access from {}", (Object)world);
        world.removeEventListener(iWorldEventListener);
    }

    private static String Method3656(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 87;
            cArray2[n] = (char)(cArray[n] ^ (0x2189 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

