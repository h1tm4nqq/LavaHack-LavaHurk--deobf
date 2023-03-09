/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.resources.IResourceManager
 *  net.minecraft.client.shader.ShaderGroup
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package com.kisman.cc.mixin.mixins.accessor;

import java.util.List;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.shader.ShaderGroup;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={ShaderGroup.class})
public interface AccessorShaderGroup {
    @Accessor(value="resourceManager")
    @Accessor(value="resourceManager")
    public IResourceManager Method5560();

    @Accessor(value="listShaders")
    @Accessor(value="listShaders")
    public List Method5561();

    @Accessor(value="listFramebuffers")
    @Accessor(value="listFramebuffers")
    public List Method5562();
}

