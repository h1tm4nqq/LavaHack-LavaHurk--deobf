//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.util.math.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3)
public final class Class443
{
    public static final int[] Field9847;
    public static final int[] Field9848;
    private String Field9849 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    static {
        (Field9847 = new int[RayTraceResult$Type.values().length])[RayTraceResult$Type.ENTITY.ordinal()] = 1;
        Class443.Field9847[RayTraceResult$Type.BLOCK.ordinal()] = 2;
        Class443.Field9847[RayTraceResult$Type.MISS.ordinal()] = 3;
        (Field9848 = new int[RayTraceResult$Type.values().length])[RayTraceResult$Type.ENTITY.ordinal()] = 1;
        Class443.Field9848[RayTraceResult$Type.BLOCK.ordinal()] = 2;
    }
}
