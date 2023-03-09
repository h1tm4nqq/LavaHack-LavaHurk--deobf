/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.server.SPacketPlayerListItem$Action
 */
package lavahack.client;

import net.minecraft.network.play.server.SPacketPlayerListItem;

class Class414 {
    static final int[] Field9716 = new int[SPacketPlayerListItem.Action.values().length];
    private int Field9717;

    static {
        Class414.Field9716[SPacketPlayerListItem.Action.ADD_PLAYER.ordinal()] = 1;
        Class414.Field9716[SPacketPlayerListItem.Action.REMOVE_PLAYER.ordinal()] = 2;
    }
}

