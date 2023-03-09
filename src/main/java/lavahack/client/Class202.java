/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.RayTraceResult$Type
 */
package lavahack.client;

import net.minecraft.util.math.RayTraceResult;

class Class202 {
    static final int[] Field8881 = new int[RayTraceResult.Type.values().length];
    private int Field8882;

    static {
        Class202.Field8881[RayTraceResult.Type.ENTITY.ordinal()] = 1;
        Class202.Field8881[RayTraceResult.Type.BLOCK.ordinal()] = 2;
        Class202.Field8881[RayTraceResult.Type.MISS.ordinal()] = 3;
    }
}

