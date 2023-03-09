//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.event.events.RenderEvent
 *  lavahack.client.AOGOereh29Orfn8LhjxmWQxXsft8Iamu
 *  lavahack.client.Ljc0gDTN8WkwPRHY480HpEkScGALG41A
 *  lavahack.client.NTNHCzPmoJl8G1Q0nyEeA4NVvUvnoqKF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
 *  lavahack.client.NTNHCzPmoJl8G1Q0nyEeA4NVvUvnoqKF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  lavahack.client.QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR
 *  lavahack.client.Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC
 *  lavahack.client.fTSdQpXXUsy7b26dtudQpgyKwlcDU58e
 *  lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  lavahack.client.o9lanP0gHU278cwDFs7XEsyWoBrJVe44
 *  lavahack.client.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.renderer.EntityRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 *  org.lwjgl.util.glu.Project
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Mutable
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.event.events.RenderEvent;
import com.google.common.base.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lavahack.client.AOGOereh29Orfn8LhjxmWQxXsft8Iamu;
import lavahack.client.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import lavahack.client.NTNHCzPmoJl8G1Q0nyEeA4NVvUvnoqKF;
import lavahack.client.QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR;
import lavahack.client.Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC;
import lavahack.client.fTSdQpXXUsy7b26dtudQpgyKwlcDU58e;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.o9lanP0gHU278cwDFs7XEsyWoBrJVe44;
import lavahack.client.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.util.glu.Project;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={EntityRenderer.class}, priority=10000)
public class MixinEntityRenderer {
    @Mutable
    @Shadow
    @Final
    public int[] Field17331;

    @Inject(method={"setupFog"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"setupFog"}, at={@At(value="HEAD")}, cancellable=true)
    public void Method7496(int n, float f, CallbackInfo callbackInfo) {
        fTSdQpXXUsy7b26dtudQpgyKwlcDU58e fTSdQpXXUsy7b26dtudQpgyKwlcDU58e2 = new fTSdQpXXUsy7b26dtudQpgyKwlcDU58e();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)fTSdQpXXUsy7b26dtudQpgyKwlcDU58e2);
        if (!fTSdQpXXUsy7b26dtudQpgyKwlcDU58e2.Method159()) return;
        callbackInfo.cancel();
    }

    @Redirect(method={"getMouseOver"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/multiplayer/WorldClient;getEntitiesInAABBexcluding(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;Lcom/google/common/base/Predicate;)Ljava/util/List;"))
    @Redirect(method={"getMouseOver"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/multiplayer/WorldClient;getEntitiesInAABBexcluding(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;Lcom/google/common/base/Predicate;)Ljava/util/List;"))
    public List Method7497(WorldClient worldClient, Entity entity, AxisAlignedBB axisAlignedBB, Predicate predicate) {
        QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR qmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR = new QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)qmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR);
        if (!qmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR.Method159()) return worldClient.getEntitiesInAABBexcluding(entity, axisAlignedBB, predicate);
        return new ArrayList();
    }

    @Inject(method={"hurtCameraEffect"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"hurtCameraEffect"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method7498(float f, CallbackInfo callbackInfo) {
        if (!o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Method35()) return;
        if (!o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Field16376.Method365()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"updateLightmap"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"updateLightmap"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method7499(float f, CallbackInfo callbackInfo) {
        NTNHCzPmoJl8G1Q0nyEeA4NVvUvnoqKF.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf ylFSugLHQAjzunVBKfamPjSRsvHTy3jf = new NTNHCzPmoJl8G1Q0nyEeA4NVvUvnoqKF.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)ylFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        if (!ylFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method159()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"updateLightmap"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/texture/DynamicTexture;updateDynamicTexture()V", shift=At.Shift.BEFORE)})
    @Inject(method={"updateLightmap"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/texture/DynamicTexture;updateDynamicTexture()V", shift=At.Shift.BEFORE)})
    private void Method7500(float f, CallbackInfo callbackInfo) {
        NTNHCzPmoJl8G1Q0nyEeA4NVvUvnoqKF.leqS0IyKEB621E1SrHdAcHHAUjScjmKi leqS0IyKEB621E1SrHdAcHHAUjScjmKi2 = new NTNHCzPmoJl8G1Q0nyEeA4NVvUvnoqKF.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this.Field17331);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)leqS0IyKEB621E1SrHdAcHHAUjScjmKi2);
        if (!leqS0IyKEB621E1SrHdAcHHAUjScjmKi2.Method159()) return;
        this.Field17331 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi2.Method1107();
    }

    @Redirect(method={"orientCamera"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/multiplayer/WorldClient;rayTraceBlocks(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/RayTraceResult;"), expect=0)
    @Redirect(method={"orientCamera"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/multiplayer/WorldClient;rayTraceBlocks(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/RayTraceResult;"), expect=0)
    private RayTraceResult Method7501(WorldClient worldClient, Vec3d vec3d, Vec3d vec3d2) {
        AOGOereh29Orfn8LhjxmWQxXsft8Iamu aOGOereh29Orfn8LhjxmWQxXsft8Iamu = new AOGOereh29Orfn8LhjxmWQxXsft8Iamu();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)aOGOereh29Orfn8LhjxmWQxXsft8Iamu);
        if (!aOGOereh29Orfn8LhjxmWQxXsft8Iamu.Method159()) return worldClient.rayTraceBlocks(vec3d, vec3d2);
        return null;
    }

    @Redirect(method={"setupCameraTransform"}, at=@At(value="INVOKE", target="Lorg/lwjgl/util/glu/Project;gluPerspective(FFFF)V"))
    @Redirect(method={"setupCameraTransform"}, at=@At(value="INVOKE", target="Lorg/lwjgl/util/glu/Project;gluPerspective(FFFF)V"))
    private void Method7502(float f, float f2, float f3, float f4) {
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A ljc0gDTN8WkwPRHY480HpEkScGALG41A = new Ljc0gDTN8WkwPRHY480HpEkScGALG41A((float)Minecraft.getMinecraft().displayWidth / (float)Minecraft.getMinecraft().displayHeight);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)ljc0gDTN8WkwPRHY480HpEkScGALG41A);
        Project.gluPerspective((float)f, (float)ljc0gDTN8WkwPRHY480HpEkScGALG41A.Method7186(), (float)f3, (float)f4);
    }

    @Redirect(method={"renderWorldPass"}, at=@At(value="INVOKE", target="Lorg/lwjgl/util/glu/Project;gluPerspective(FFFF)V"))
    @Redirect(method={"renderWorldPass"}, at=@At(value="INVOKE", target="Lorg/lwjgl/util/glu/Project;gluPerspective(FFFF)V"))
    private void Method7503(float f, float f2, float f3, float f4) {
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A ljc0gDTN8WkwPRHY480HpEkScGALG41A = new Ljc0gDTN8WkwPRHY480HpEkScGALG41A((float)Minecraft.getMinecraft().displayWidth / (float)Minecraft.getMinecraft().displayHeight);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)ljc0gDTN8WkwPRHY480HpEkScGALG41A);
        Project.gluPerspective((float)f, (float)ljc0gDTN8WkwPRHY480HpEkScGALG41A.Method7186(), (float)f3, (float)f4);
    }

    @Redirect(method={"renderCloudsCheck"}, at=@At(value="INVOKE", target="Lorg/lwjgl/util/glu/Project;gluPerspective(FFFF)V"))
    @Redirect(method={"renderCloudsCheck"}, at=@At(value="INVOKE", target="Lorg/lwjgl/util/glu/Project;gluPerspective(FFFF)V"))
    private void Method7504(float f, float f2, float f3, float f4) {
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A ljc0gDTN8WkwPRHY480HpEkScGALG41A = new Ljc0gDTN8WkwPRHY480HpEkScGALG41A((float)Minecraft.getMinecraft().displayWidth / (float)Minecraft.getMinecraft().displayHeight);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)ljc0gDTN8WkwPRHY480HpEkScGALG41A);
        Project.gluPerspective((float)f, (float)ljc0gDTN8WkwPRHY480HpEkScGALG41A.Method7186(), (float)f3, (float)f4);
    }

    @Inject(method={"renderWorldPass"}, at={@At(value="INVOKE_STRING", target="Lnet/minecraft/profiler/Profiler;endStartSection(Ljava/lang/String;)V", args={"ldc=hand"})})
    @Inject(method={"renderWorldPass"}, at={@At(value="INVOKE_STRING", target="Lnet/minecraft/profiler/Profiler;endStartSection(Ljava/lang/String;)V", args={"ldc=hand"})})
    private void Method7505(int n, float f, long l, CallbackInfo callbackInfo) {
        Iterator iterator = BaritoneAPI.getProvider().getAllBaritones().iterator();
        while (iterator.hasNext()) {
            IBaritone iBaritone = (IBaritone)iterator.next();
            iBaritone.getGameEventHandler().onRenderPass(new RenderEvent(f));
        }
    }

    @Inject(method={"applyBobbing"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"applyBobbing"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method7506(float f, CallbackInfo callbackInfo) {
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(f);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2);
        if (!vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method159()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"renderHand"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"renderHand"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method7507(float f, int n, CallbackInfo callbackInfo) {
        Minecraft minecraft = Minecraft.getMinecraft();
        if (minecraft.player == null) return;
        if (minecraft.world == null) {
            return;
        }
        if (!minecraft.player.getHeldItemMainhand().isEmpty) {
            return;
        }
        if (!Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16641.Method365()) return;
        callbackInfo.cancel();
    }
}

