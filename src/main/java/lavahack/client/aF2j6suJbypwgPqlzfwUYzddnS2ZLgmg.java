/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.network.play.client.CPacketEntityAction$Action
 */
package lavahack.client;

import kotlin.Metadata;
import net.minecraft.network.play.client.CPacketEntityAction;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3)
public final class aF2j6suJbypwgPqlzfwUYzddnS2ZLgmg {
    public static final int[] Field17581 = new int[CPacketEntityAction.Action.values().length];
    private String Field17582 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        aF2j6suJbypwgPqlzfwUYzddnS2ZLgmg.Field17581[CPacketEntityAction.Action.START_SNEAKING.ordinal()] = (int)((long)1670003466 ^ (long)1670003467);
        aF2j6suJbypwgPqlzfwUYzddnS2ZLgmg.Field17581[CPacketEntityAction.Action.STOP_SNEAKING.ordinal()] = (int)((long)-1947118985 ^ (long)-1947118986) << 1;
        aF2j6suJbypwgPqlzfwUYzddnS2ZLgmg.Field17581[CPacketEntityAction.Action.START_SPRINTING.ordinal()] = (int)((long)628847110 ^ (long)628847109);
        aF2j6suJbypwgPqlzfwUYzddnS2ZLgmg.Field17581[CPacketEntityAction.Action.STOP_SPRINTING.ordinal()] = ((int)-1149383094L ^ 0xBB7DCE4B) << 2;
    }
}

