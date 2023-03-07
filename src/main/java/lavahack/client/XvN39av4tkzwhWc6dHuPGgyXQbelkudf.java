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

import lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
import lavahack.client.YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo;
import lavahack.client.pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX;
import lavahack.client.sYSQwf2xD3nukbcGapT2KmEMESaueLHM;
import net.minecraft.world.IWorldEventListener;
import net.minecraft.world.World;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class XvN39av4tkzwhWc6dHuPGgyXQbelkudf {
    private String Field11642 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public void Method3652(WorldEvent.Load load) {
        World world = load.getWorld();
        if (!world.isRemote) return;
        if (world instanceof OP4La13R7rceTBm7QSP7XXXyRxZD1Op3) return;
        YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11944.setWorldAndLoadRenderers(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8122);
        XvN39av4tkzwhWc6dHuPGgyXQbelkudf.Method3654(world, (IWorldEventListener)YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11944);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method3653(WorldEvent.Unload unload) {
        World world = unload.getWorld();
        if (!world.isRemote) return;
        XvN39av4tkzwhWc6dHuPGgyXQbelkudf.Method3655(world, (IWorldEventListener)YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11944);
    }

    public static void Method3654(World world, IWorldEventListener iWorldEventListener) {
        if (world == null) return;
        if (iWorldEventListener == null) return;
        pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.debug("Adding world access to {}", (Object)world);
        world.addEventListener(iWorldEventListener);
    }

    public static void Method3655(World world, IWorldEventListener iWorldEventListener) {
        if (world == null) return;
        if (iWorldEventListener == null) return;
        pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.debug("Removing world access from {}", (Object)world);
        world.removeEventListener(iWorldEventListener);
    }

    private static String Method3656(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-287802413L ^ 0xEED87BD3;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)670075418 ^ (long)670075621);
            int n2 = (int)((long)442111155 ^ (long)442111204);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)498742538 ^ (long)498734211) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

