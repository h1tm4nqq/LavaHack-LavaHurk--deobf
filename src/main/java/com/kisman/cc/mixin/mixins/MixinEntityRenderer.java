//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import net.minecraft.client.renderer.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.entity.*;
import com.google.common.base.*;
import org.spongepowered.asm.mixin.injection.*;
import net.minecraft.util.math.*;
import net.minecraft.client.*;
import org.lwjgl.util.glu.*;
import baritone.api.*;
import baritone.api.event.events.*;
import java.util.*;
import lavahack.client.*;

@Mixin(value = { EntityRenderer.class }, priority = 10000)
public class MixinEntityRenderer
{
    @Mutable
    @Shadow
    @Final
    public int[] Field17331;
    
    @Inject(method = { "setupFog" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "setupFog" }, at = { @At("HEAD") }, cancellable = true)
    public void Method7496(final int n, final float n2, final CallbackInfo callbackInfo) {
        final fTSdQpXXUsy7b26dtudQpgyKwlcDU58e ftSdQpXXUsy7b26dtudQpgyKwlcDU58e = new fTSdQpXXUsy7b26dtudQpgyKwlcDU58e();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)ftSdQpXXUsy7b26dtudQpgyKwlcDU58e);
        if (ftSdQpXXUsy7b26dtudQpgyKwlcDU58e.Method159()) {
            callbackInfo.cancel();
        }
    }
    
    @Redirect(method = { "getMouseOver" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/WorldClient;getEntitiesInAABBexcluding(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;Lcom/google/common/base/Predicate;)Ljava/util/List;"))
    @Redirect(method = { "getMouseOver" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/WorldClient;getEntitiesInAABBexcluding(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;Lcom/google/common/base/Predicate;)Ljava/util/List;"))
    public List Method7497(final WorldClient worldClient, final Entity entity, final AxisAlignedBB axisAlignedBB, final Predicate predicate) {
        final QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR qmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR = new QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)qmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR);
        if (qmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR.Method159()) {
            return new ArrayList();
        }
        return worldClient.getEntitiesInAABBexcluding(entity, axisAlignedBB, predicate);
    }
    
    @Inject(method = { "hurtCameraEffect" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "hurtCameraEffect" }, at = { @At("HEAD") }, cancellable = true)
    private void Method7498(final float n, final CallbackInfo callbackInfo) {
        if (o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Method35() && o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Field16376.Method365()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "updateLightmap" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "updateLightmap" }, at = { @At("HEAD") }, cancellable = true)
    private void Method7499(final float n, final CallbackInfo callbackInfo) {
        final NTNHCzPmoJl8G1Q0nyEeA4NVvUvnoqKF.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf ylFSugLHQAjzunVBKfamPjSRsvHTy3jf = new NTNHCzPmoJl8G1Q0nyEeA4NVvUvnoqKF.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)ylFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        if (((NTNHCzPmoJl8G1Q0nyEeA4NVvUvnoqKF)ylFSugLHQAjzunVBKfamPjSRsvHTy3jf).Method159()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "updateLightmap" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/texture/DynamicTexture;updateDynamicTexture()V", shift = At.Shift.BEFORE) })
    @Inject(method = { "updateLightmap" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/texture/DynamicTexture;updateDynamicTexture()V", shift = At.Shift.BEFORE) })
    private void Method7500(final float n, final CallbackInfo callbackInfo) {
        final NTNHCzPmoJl8G1Q0nyEeA4NVvUvnoqKF.leqS0IyKEB621E1SrHdAcHHAUjScjmKi leqS0IyKEB621E1SrHdAcHHAUjScjmKi = new NTNHCzPmoJl8G1Q0nyEeA4NVvUvnoqKF.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this.Field17331);
        lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
        if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method159()) {
            this.Field17331 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1107();
        }
    }
    
    @Redirect(method = { "orientCamera" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/WorldClient;rayTraceBlocks(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/RayTraceResult;"), expect = 0)
    @Redirect(method = { "orientCamera" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/WorldClient;rayTraceBlocks(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/RayTraceResult;"), expect = 0)
    private RayTraceResult Method7501(final WorldClient worldClient, final Vec3d vec3d, final Vec3d vec3d2) {
        final AOGOereh29Orfn8LhjxmWQxXsft8Iamu aogOereh29Orfn8LhjxmWQxXsft8Iamu = new AOGOereh29Orfn8LhjxmWQxXsft8Iamu();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)aogOereh29Orfn8LhjxmWQxXsft8Iamu);
        if (aogOereh29Orfn8LhjxmWQxXsft8Iamu.Method159()) {
            return null;
        }
        return worldClient.rayTraceBlocks(vec3d, vec3d2);
    }
    
    @Redirect(method = { "setupCameraTransform" }, at = @At(value = "INVOKE", target = "Lorg/lwjgl/util/glu/Project;gluPerspective(FFFF)V"))
    @Redirect(method = { "setupCameraTransform" }, at = @At(value = "INVOKE", target = "Lorg/lwjgl/util/glu/Project;gluPerspective(FFFF)V"))
    private void Method7502(final float n, final float n2, final float n3, final float n4) {
        final Ljc0gDTN8WkwPRHY480HpEkScGALG41A ljc0gDTN8WkwPRHY480HpEkScGALG41A = new Ljc0gDTN8WkwPRHY480HpEkScGALG41A(Minecraft.getMinecraft().displayWidth / (float)Minecraft.getMinecraft().displayHeight);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)ljc0gDTN8WkwPRHY480HpEkScGALG41A);
        Project.gluPerspective(n, ljc0gDTN8WkwPRHY480HpEkScGALG41A.Method7186(), n3, n4);
    }
    
    @Redirect(method = { "renderWorldPass" }, at = @At(value = "INVOKE", target = "Lorg/lwjgl/util/glu/Project;gluPerspective(FFFF)V"))
    @Redirect(method = { "renderWorldPass" }, at = @At(value = "INVOKE", target = "Lorg/lwjgl/util/glu/Project;gluPerspective(FFFF)V"))
    private void Method7503(final float n, final float n2, final float n3, final float n4) {
        final Ljc0gDTN8WkwPRHY480HpEkScGALG41A ljc0gDTN8WkwPRHY480HpEkScGALG41A = new Ljc0gDTN8WkwPRHY480HpEkScGALG41A(Minecraft.getMinecraft().displayWidth / (float)Minecraft.getMinecraft().displayHeight);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)ljc0gDTN8WkwPRHY480HpEkScGALG41A);
        Project.gluPerspective(n, ljc0gDTN8WkwPRHY480HpEkScGALG41A.Method7186(), n3, n4);
    }
    
    @Redirect(method = { "renderCloudsCheck" }, at = @At(value = "INVOKE", target = "Lorg/lwjgl/util/glu/Project;gluPerspective(FFFF)V"))
    @Redirect(method = { "renderCloudsCheck" }, at = @At(value = "INVOKE", target = "Lorg/lwjgl/util/glu/Project;gluPerspective(FFFF)V"))
    private void Method7504(final float n, final float n2, final float n3, final float n4) {
        final Ljc0gDTN8WkwPRHY480HpEkScGALG41A ljc0gDTN8WkwPRHY480HpEkScGALG41A = new Ljc0gDTN8WkwPRHY480HpEkScGALG41A(Minecraft.getMinecraft().displayWidth / (float)Minecraft.getMinecraft().displayHeight);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)ljc0gDTN8WkwPRHY480HpEkScGALG41A);
        Project.gluPerspective(n, ljc0gDTN8WkwPRHY480HpEkScGALG41A.Method7186(), n3, n4);
    }
    
    @Inject(method = { "renderWorldPass" }, at = { @At(value = "INVOKE_STRING", target = "Lnet/minecraft/profiler/Profiler;endStartSection(Ljava/lang/String;)V", args = { "ldc=hand" }) })
    @Inject(method = { "renderWorldPass" }, at = { @At(value = "INVOKE_STRING", target = "Lnet/minecraft/profiler/Profiler;endStartSection(Ljava/lang/String;)V", args = { "ldc=hand" }) })
    private void Method7505(final int n, final float n2, final long n3, final CallbackInfo callbackInfo) {
        final Iterator<IBaritone> iterator = BaritoneAPI.getProvider().getAllBaritones().iterator();
        while (iterator.hasNext()) {
            iterator.next().getGameEventHandler().onRenderPass(new RenderEvent(n2));
        }
    }
    
    @Inject(method = { "applyBobbing" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "applyBobbing" }, at = { @At("HEAD") }, cancellable = true)
    private void Method7506(final float n, final CallbackInfo callbackInfo) {
        final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(n);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV);
        if (vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method159()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "renderHand" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "renderHand" }, at = { @At("HEAD") }, cancellable = true)
    private void Method7507(final float n, final int n2, final CallbackInfo callbackInfo) {
        final Minecraft getMinecraft = Minecraft.getMinecraft();
        if (getMinecraft.player == null || getMinecraft.world == null) {
            return;
        }
        if (!getMinecraft.player.getHeldItemMainhand().isEmpty) {
            return;
        }
        if (Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16641.Method365()) {
            callbackInfo.cancel();
        }
    }
}
