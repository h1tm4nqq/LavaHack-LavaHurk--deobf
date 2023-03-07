/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.server.SPacketPlayerListItem$Action
 */
package lavahack.client;

import net.minecraft.network.play.server.SPacketPlayerListItem;

class f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$1 {
    static final int[] Field9716 = new int[SPacketPlayerListItem.Action.values().length];
    private int Field9717;

    static {
        f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$1.Field9716[SPacketPlayerListItem.Action.ADD_PLAYER.ordinal()] = (int)751501458L ^ 0x2CCB0093;
        f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$1.Field9716[SPacketPlayerListItem.Action.REMOVE_PLAYER.ordinal()] = (int)((long)407425847 ^ (long)407425846) << 1;
    }
}

