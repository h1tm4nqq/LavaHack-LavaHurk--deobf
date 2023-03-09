/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.util.math.RayTraceResult$Type
 */
package lavahack.client;

import kotlin.Metadata;
import net.minecraft.util.math.RayTraceResult;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3)
public final class Class1023 {
    public static final int[] Field12475 = new int[RayTraceResult.Type.values().length];
    public static final int[] Field12476;
    private String Field12477 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1023.Field12475[RayTraceResult.Type.MISS.ordinal()] = 1;
        Class1023.Field12475[RayTraceResult.Type.BLOCK.ordinal()] = 2;
        Class1023.Field12475[RayTraceResult.Type.ENTITY.ordinal()] = 3;
        Field12476 = new int[RayTraceResult.Type.values().length];
        Class1023.Field12476[RayTraceResult.Type.ENTITY.ordinal()] = 1;
        Class1023.Field12476[RayTraceResult.Type.BLOCK.ordinal()] = 2;
        Class1023.Field12476[RayTraceResult.Type.MISS.ordinal()] = 3;
    }
}

