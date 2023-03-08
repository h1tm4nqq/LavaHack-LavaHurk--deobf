//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.network.play.server.*;

class Class414
{
    static final int[] Field9716;
    private int Field9717;
    
    static {
        (Field9716 = new int[SPacketPlayerListItem$Action.values().length])[SPacketPlayerListItem$Action.ADD_PLAYER.ordinal()] = 1;
        Class414.Field9716[SPacketPlayerListItem$Action.REMOVE_PLAYER.ordinal()] = 2;
    }
}
