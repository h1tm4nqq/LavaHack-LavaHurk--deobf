//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.world.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.event.world.*;

public class Class864
{
    private String Field11642 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method3652(final WorldEvent$Load worldEvent$Load) {
        final World world = worldEvent$Load.getWorld();
        if (world.isRemote && !(world instanceof Class1479)) {
            Class934.Field11944.setWorldAndLoadRenderers(Class46.Field8122);
            Method3654(world, (IWorldEventListener)Class934.Field11944);
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method3653(final WorldEvent$Unload worldEvent$Unload) {
        final World world = worldEvent$Unload.getWorld();
        if (world.isRemote) {
            Method3655(world, (IWorldEventListener)Class934.Field11944);
        }
    }
    
    public static void Method3654(final World world, final IWorldEventListener worldEventListener) {
        if (world != null && worldEventListener != null) {
            Class542.Field10314.debug("Adding world access to {}", (Object)world);
            world.addEventListener(worldEventListener);
        }
    }
    
    public static void Method3655(final World world, final IWorldEventListener worldEventListener) {
        if (world != null && worldEventListener != null) {
            Class542.Field10314.debug("Removing world access from {}", (Object)world);
            world.removeEventListener(worldEventListener);
        }
    }
    
    private static String Method3656(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2189 ^ 0x57));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
