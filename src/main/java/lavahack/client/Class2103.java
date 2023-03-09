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
public final class Class2103 {
    public static final int[] Field17581 = new int[CPacketEntityAction.Action.values().length];
    private String Field17582 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class2103.Field17581[CPacketEntityAction.Action.START_SNEAKING.ordinal()] = 1;
        Class2103.Field17581[CPacketEntityAction.Action.STOP_SNEAKING.ordinal()] = 2;
        Class2103.Field17581[CPacketEntityAction.Action.START_SPRINTING.ordinal()] = 3;
        Class2103.Field17581[CPacketEntityAction.Action.STOP_SPRINTING.ordinal()] = 4;
    }
}

