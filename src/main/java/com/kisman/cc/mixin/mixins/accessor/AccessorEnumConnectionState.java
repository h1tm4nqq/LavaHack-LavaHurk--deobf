/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.EnumConnectionState
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package com.kisman.cc.mixin.mixins.accessor;

import java.util.Map;
import net.minecraft.network.EnumConnectionState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={EnumConnectionState.class})
public interface AccessorEnumConnectionState {
    @Accessor(value="directionMaps")
    @Accessor(value="directionMaps")
    public Map Method1048();
}

