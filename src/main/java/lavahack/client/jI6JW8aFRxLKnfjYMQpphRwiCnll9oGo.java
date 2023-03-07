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
public final class jI6JW8aFRxLKnfjYMQpphRwiCnll9oGo {
    public static final int[] Field9847 = new int[RayTraceResult.Type.values().length];
    public static final int[] Field9848;
    private String Field9849 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        jI6JW8aFRxLKnfjYMQpphRwiCnll9oGo.Field9847[RayTraceResult.Type.ENTITY.ordinal()] = (int)-1098854667L ^ 0xBE80CEF4;
        jI6JW8aFRxLKnfjYMQpphRwiCnll9oGo.Field9847[RayTraceResult.Type.BLOCK.ordinal()] = ((int)225969404L ^ 0xD7804FD) << 1;
        jI6JW8aFRxLKnfjYMQpphRwiCnll9oGo.Field9847[RayTraceResult.Type.MISS.ordinal()] = (int)((long)-622327029 ^ (long)-622327032);
        Field9848 = new int[RayTraceResult.Type.values().length];
        jI6JW8aFRxLKnfjYMQpphRwiCnll9oGo.Field9848[RayTraceResult.Type.ENTITY.ordinal()] = (int)((long)-855257675 ^ (long)-855257676);
        jI6JW8aFRxLKnfjYMQpphRwiCnll9oGo.Field9848[RayTraceResult.Type.BLOCK.ordinal()] = (int)((long)-604571014 ^ (long)-604571013) << 1;
    }
}

