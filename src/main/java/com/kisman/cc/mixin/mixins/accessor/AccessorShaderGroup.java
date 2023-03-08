//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.accessor;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.shader.*;
import net.minecraft.client.resources.*;
import org.spongepowered.asm.mixin.gen.*;
import java.util.*;

@Mixin({ ShaderGroup.class })
public interface AccessorShaderGroup
{
    @Accessor("resourceManager")
    @Accessor("resourceManager")
    IResourceManager Method5560();
    
    @Accessor("listShaders")
    @Accessor("listShaders")
    List Method5561();
    
    @Accessor("listFramebuffers")
    @Accessor("listFramebuffers")
    List Method5562();
}
