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
public final class RAmrx1XwuYiH2lhbXcpWmBrbN4Wx35PV {
    public static final int[] Field12475 = new int[RayTraceResult.Type.values().length];
    public static final int[] Field12476;
    private String Field12477 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        RAmrx1XwuYiH2lhbXcpWmBrbN4Wx35PV.Field12475[RayTraceResult.Type.MISS.ordinal()] = (int)-6405594L ^ 0xFF9E4227;
        RAmrx1XwuYiH2lhbXcpWmBrbN4Wx35PV.Field12475[RayTraceResult.Type.BLOCK.ordinal()] = (int)((long)-256845063 ^ (long)-256845064) << 1;
        RAmrx1XwuYiH2lhbXcpWmBrbN4Wx35PV.Field12475[RayTraceResult.Type.ENTITY.ordinal()] = (int)((long)-1884477547 ^ (long)-1884477546);
        Field12476 = new int[RayTraceResult.Type.values().length];
        RAmrx1XwuYiH2lhbXcpWmBrbN4Wx35PV.Field12476[RayTraceResult.Type.ENTITY.ordinal()] = (int)-237144904L ^ 0xF1DD74B9;
        RAmrx1XwuYiH2lhbXcpWmBrbN4Wx35PV.Field12476[RayTraceResult.Type.BLOCK.ordinal()] = ((int)1217325849L ^ 0x488EEB18) << 1;
        RAmrx1XwuYiH2lhbXcpWmBrbN4Wx35PV.Field12476[RayTraceResult.Type.MISS.ordinal()] = (int)1653097873L ^ 0x62884592;
    }
}

