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
public final class Class2092 {
    public static final int[] Field17546 = new int[RayTraceResult.Type.values().length];
    private String Field17547 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class2092.Field17546[RayTraceResult.Type.ENTITY.ordinal()] = 1;
        Class2092.Field17546[RayTraceResult.Type.BLOCK.ordinal()] = 2;
    }
}

