/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.RayTraceResult$Type
 */
package lavahack.client;

import net.minecraft.util.math.RayTraceResult;

class tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$1 {
    static final int[] Field8881 = new int[RayTraceResult.Type.values().length];
    private int Field8882;

    static {
        tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$1.Field8881[RayTraceResult.Type.ENTITY.ordinal()] = (int)779735236L ^ 0x2E79D0C5;
        tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$1.Field8881[RayTraceResult.Type.BLOCK.ordinal()] = (int)((long)1390056935 ^ (long)1390056934) << 1;
        tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$1.Field8881[RayTraceResult.Type.MISS.ordinal()] = (int)-1953295003L ^ 0x8B931566;
    }
}

