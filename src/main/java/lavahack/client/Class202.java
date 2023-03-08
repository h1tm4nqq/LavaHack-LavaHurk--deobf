//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;

class Class202
{
    static final int[] Field8881;
    private int Field8882;
    
    static {
        (Field8881 = new int[RayTraceResult$Type.values().length])[RayTraceResult$Type.ENTITY.ordinal()] = 1;
        Class202.Field8881[RayTraceResult$Type.BLOCK.ordinal()] = 2;
        Class202.Field8881[RayTraceResult$Type.MISS.ordinal()] = 3;
    }
}
