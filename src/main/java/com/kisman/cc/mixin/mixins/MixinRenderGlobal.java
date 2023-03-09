/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.MjqPPsIgrrFE8smKJhGdj08A51foRyqE
 *  lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  lavahack.client.o9lanP0gHU278cwDFs7XEsyWoBrJVe44
 *  lavahack.client.rOPHnAqIyTBxKFhFO4Zr2u1PEEPbBVYY$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
 *  lavahack.client.rOPHnAqIyTBxKFhFO4Zr2u1PEEPbBVYY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  net.minecraft.client.renderer.RenderGlobal
 *  net.minecraft.client.renderer.culling.ICamera
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.RayTraceResult
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.MjqPPsIgrrFE8smKJhGdj08A51foRyqE;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.o9lanP0gHU278cwDFs7XEsyWoBrJVe44;
import lavahack.client.rOPHnAqIyTBxKFhFO4Zr2u1PEEPbBVYY;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.RayTraceResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={RenderGlobal.class}, priority=10000)
public class MixinRenderGlobal {
    @Inject(method={"drawSelectionBox"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"drawSelectionBox"}, at={@At(value="HEAD")}, cancellable=true)
    public void Method5343(EntityPlayer entityPlayer, RayTraceResult rayTraceResult, int n, float f, CallbackInfo callbackInfo) {
        if (!o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Method35()) return;
        if (!o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Field16387.Method365()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"renderEntities"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"renderEntities"}, at={@At(value="HEAD")}, cancellable=true)
    public void Method5344(Entity entity, ICamera iCamera, float f, CallbackInfo callbackInfo) {
        MjqPPsIgrrFE8smKJhGdj08A51foRyqE.Method2090((boolean)true);
        rOPHnAqIyTBxKFhFO4Zr2u1PEEPbBVYY.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf ylFSugLHQAjzunVBKfamPjSRsvHTy3jf = new rOPHnAqIyTBxKFhFO4Zr2u1PEEPbBVYY.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)ylFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        if (!ylFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method159()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"renderEntities"}, at={@At(value="RETURN")})
    @Inject(method={"renderEntities"}, at={@At(value="RETURN")})
    public void Method5345(Entity entity, ICamera iCamera, float f, CallbackInfo callbackInfo) {
        rOPHnAqIyTBxKFhFO4Zr2u1PEEPbBVYY.leqS0IyKEB621E1SrHdAcHHAUjScjmKi leqS0IyKEB621E1SrHdAcHHAUjScjmKi2 = new rOPHnAqIyTBxKFhFO4Zr2u1PEEPbBVYY.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)leqS0IyKEB621E1SrHdAcHHAUjScjmKi2);
        MjqPPsIgrrFE8smKJhGdj08A51foRyqE.Method2090((boolean)false);
    }
}

