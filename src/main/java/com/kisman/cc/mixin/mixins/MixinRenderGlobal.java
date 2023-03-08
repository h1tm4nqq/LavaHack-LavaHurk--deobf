//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.renderer.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.math.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import org.spongepowered.asm.mixin.injection.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.culling.*;
import lavahack.client.*;

@Mixin(value = { RenderGlobal.class }, priority = 10000)
public class MixinRenderGlobal
{
    @Inject(method = { "drawSelectionBox" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "drawSelectionBox" }, at = { @At("HEAD") }, cancellable = true)
    public void Method5343(final EntityPlayer entityPlayer, final RayTraceResult rayTraceResult, final int n, final float n2, final CallbackInfo callbackInfo) {
        if (o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Method35() && o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Field16387.Method365()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "renderEntities" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "renderEntities" }, at = { @At("HEAD") }, cancellable = true)
    public void Method5344(final Entity entity, final ICamera camera, final float n, final CallbackInfo callbackInfo) {
        MjqPPsIgrrFE8smKJhGdj08A51foRyqE.Method2090(true);
        final rOPHnAqIyTBxKFhFO4Zr2u1PEEPbBVYY.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf ylFSugLHQAjzunVBKfamPjSRsvHTy3jf = new rOPHnAqIyTBxKFhFO4Zr2u1PEEPbBVYY.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)ylFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        if (((rOPHnAqIyTBxKFhFO4Zr2u1PEEPbBVYY)ylFSugLHQAjzunVBKfamPjSRsvHTy3jf).Method159()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "renderEntities" }, at = { @At("RETURN") })
    @Inject(method = { "renderEntities" }, at = { @At("RETURN") })
    public void Method5345(final Entity entity, final ICamera camera, final float n, final CallbackInfo callbackInfo) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)new rOPHnAqIyTBxKFhFO4Zr2u1PEEPbBVYY.leqS0IyKEB621E1SrHdAcHHAUjScjmKi());
        MjqPPsIgrrFE8smKJhGdj08A51foRyqE.Method2090(false);
    }
}
