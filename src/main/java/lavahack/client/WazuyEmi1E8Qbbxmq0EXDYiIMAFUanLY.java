//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.NoWhenBranchMatchedException
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelEnderCrystal
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.util.math.MathHelper
 *  org.lwjgl.util.vector.Quaternion
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA;
import lavahack.client.SwOKjgBuZ4bcevFcd16aerJXflMi80gZ;
import lavahack.client.WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf;
import lavahack.client.WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.x8Xws6aXrjosbn9p5CeRkPtxMFV3E79F;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelEnderCrystal;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.util.vector.Quaternion;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0002J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u001dH\u0002J\b\u0010\"\u001a\u00020\u001dH\u0002J\b\u0010#\u001a\u00020\u001dH\u0002J\b\u0010$\u001a\u00020\u001dH\u0002J\b\u0010%\u001a\u00020\u0003H\u0002J@\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2={"Lcom/kisman/cc/features/module/render/crystalmodifier/CrystalModelHandler;", "Lnet/minecraft/client/model/ModelEnderCrystal;", "renderBase", "", "(Z)V", "bottom", "Lnet/minecraft/client/model/ModelRenderer;", "kotlin.jvm.PlatformType", "insideCube", "insideGlass", "outsideCube", "outsideGlass", "drawCube", "", "cube", "cubeID", "", "scale", "", "drawRubiksBox", "getInsideBox", "getOutsideBox", "getOutsideBox2", "getRenderer", "tex", "Lcom/kisman/cc/features/module/render/CrystalModifier$CubeModes;", "model", "Lcom/kisman/cc/features/module/render/CrystalModifier$ModelModes;", "getScaleModifier", "", "entityID", "getScaleX", "getScaleY", "getScaleZ", "getTranslateX", "getTranslateY", "getTranslateZ", "needToRenderBase", "render", "entity", "Lnet/minecraft/entity/Entity;", "limbSwing", "limbSwingAmount", "ageInTicks", "netHeadYaw", "headPitch", "kisman.cc"})
public final class WazuyEmi1E8Qbbxmq0EXDYiIMAFUanLY
extends ModelEnderCrystal {
    private final ModelRenderer Field16759;
    private final ModelRenderer Field16760;
    private final ModelRenderer Field16761;
    private final ModelRenderer Field16762;
    private final ModelRenderer Field16763;
    private final boolean Field16764;
    private int Field16765;

    public void render(@NotNull @NotNull Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        Intrinsics.checkParameterIsNotNull((Object)entity, (String)"entity");
        WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739;
        Intrinsics.checkExpressionValueIsNotNull((Object)wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf, (String)"CrystalModifier.instance");
        if (wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Method35() && entity instanceof EntityEnderCrystal) {
            WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12744.containsKey(entity.entityId);
            Minecraft minecraft = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803;
            Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"mc");
            float f7 = minecraft.getRenderPartialTicks();
            float f8 = (float)((EntityEnderCrystal)entity).innerRotation + f7;
            float f9 = MathHelper.sin((float)(f8 * Float.intBitsToFloat((int)583926182L ^ 0x1C82CD6B))) / 2.0f + Float.intBitsToFloat((int)1093560101L ^ 0x7E2E6725);
            f9 += f9 * f9;
            GlStateManager.pushMatrix();
            GlStateManager.scale((double)((double)2.0f * this.getScaleX() * this.getScaleModifier(entity.entityId, (int)((long)-512686533 ^ (long)-512686533))), (double)((double)2.0f * this.getScaleY() * this.getScaleModifier(entity.entityId, (int)((long)352889504 ^ (long)352889504))), (double)((double)2.0f * this.getScaleZ() * this.getScaleModifier(entity.entityId, (int)((long)364829263 ^ (long)364829263))));
            GlStateManager.translate((double)this.getTranslateX(), (double)((double)Float.intBitsToFloat(0x4FAD3CA5 ^ 0xF0AD3CA5) + this.getTranslateY()), (double)this.getTranslateZ());
            if (this.needToRenderBase()) {
                this.Field16763.render(f6);
            }
            GlStateManager.scale((double)(this.getScaleX() * this.getScaleModifier(entity.entityId, (int)((long)-752187550 ^ (long)-752187549) << 1)), (double)(this.getScaleY() * this.getScaleModifier(entity.entityId, ((int)184540321L ^ 0xAFFDCA0) << 1)), (double)(this.getScaleZ() * this.getScaleModifier(entity.entityId, (int)((long)-455482265 ^ (long)-455482266) << 1)));
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12778;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"CrystalModifier.instance.outsideSpinSpeed");
            GlStateManager.rotate((float)(f8 * qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method368()), (float)0.0f, (float)1.0f, (float)0.0f);
            double d = this.getTranslateX();
            float f10 = Float.intBitsToFloat((int)((long)343308988 ^ (long)725268081));
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12786;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"CrystalModifier.instance.bounce");
            GlStateManager.translate((double)d, (double)((double)(f10 + f9 * qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method368()) + this.getTranslateY()), (double)this.getTranslateZ());
            GlStateManager.rotate((float)Float.intBitsToFloat((int)((long)113345837 ^ (long)1152484653)), (float)Float.intBitsToFloat((int)((long)1651685398 ^ (long)1564982423)), (float)0.0f, (float)Float.intBitsToFloat((int)1585971443L ^ 0x61BD0472));
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12775;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"CrystalModifier.instance.outsideCube");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method341() != WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17364) {
                ModelRenderer modelRenderer = this.getOutsideBox();
                if (modelRenderer == null) {
                    Intrinsics.throwNpe();
                }
                this.drawCube(modelRenderer, ((int)-493542194L ^ 0xE29524CF) << 1, f6);
            }
            GlStateManager.scale((double)((double)Float.intBitsToFloat(0x2614DB39 ^ 0x1974DB39) * this.getScaleX() * this.getScaleModifier(entity.entityId, (int)587085537L ^ 0x22FE36E2)), (double)((double)Float.intBitsToFloat(0x58E709A7 ^ 0x678709A7) * this.getScaleY() * this.getScaleModifier(entity.entityId, (int)-1382265729L ^ 0xAD9C4C7C)), (double)((double)Float.intBitsToFloat(0x16BB10F6 ^ 0x29DB10F6) * this.getScaleZ() * this.getScaleModifier(entity.entityId, (int)-1530664586L ^ 0xA4C3E975)));
            GlStateManager.rotate((float)Float.intBitsToFloat(0xEB5A75 ^ 0x429B5A75), (float)Float.intBitsToFloat((int)((long)1163629039 ^ (long)2054067566)), (float)0.0f, (float)Float.intBitsToFloat((int)((long)91504216 ^ (long)977353433)));
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12784;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"CrystalModifier.instance.outsideSpinSpeed2");
            GlStateManager.rotate((float)(f8 * qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method368()), (float)0.0f, (float)1.0f, (float)0.0f);
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12781;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"CrystalModifier.instance.outsideCube2");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method341() != WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17364) {
                ModelRenderer modelRenderer = this.getOutsideBox2();
                if (modelRenderer == null) {
                    Intrinsics.throwNpe();
                }
                this.drawCube(modelRenderer, (int)-1765105407L ^ 0x96CAA102, f6);
            }
            GlStateManager.scale((double)((double)Float.intBitsToFloat(0x3265F1FF ^ 0xD05F1FF) * this.getScaleX() * this.getScaleModifier(entity.entityId, (int)117344857L ^ 0x6FE8A58)), (double)((double)Float.intBitsToFloat((int)((long)1439840137 ^ (long)1790064521)) * this.getScaleY() * this.getScaleModifier(entity.entityId, (int)-1318102659L ^ 0xB16F597C)), (double)((double)Float.intBitsToFloat((int)1452387317L ^ 0x69F1ABF5) * this.getScaleZ() * this.getScaleModifier(entity.entityId, (int)-2107682764L ^ 0x825F5035)));
            GlStateManager.rotate((float)Float.intBitsToFloat((int)((long)2069641110 ^ (long)959199126)), (float)Float.intBitsToFloat((int)((long)1913021877 ^ (long)1295212852)), (float)0.0f, (float)Float.intBitsToFloat(0x5E652BD8 ^ 0x61502F59));
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12772;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"CrystalModifier.instance.insideSpinSpeed");
            GlStateManager.rotate((float)(f8 * qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method368()), (float)0.0f, (float)1.0f, (float)0.0f);
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12769;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8, (String)"CrystalModifier.instance.insideCube");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8.Method341() != WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17364) {
                ModelRenderer modelRenderer = this.getInsideBox();
                if (modelRenderer == null) {
                    Intrinsics.throwNpe();
                }
                this.drawCube(modelRenderer, (int)((long)670105301 ^ (long)670105300), f6);
            }
            GlStateManager.popMatrix();
            if (!WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12744.containsKey(entity.entityId)) return;
            Object v = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12744.get(entity.entityId);
            if (v == null) {
                Intrinsics.throwNpe();
            }
            Object e = ((List)v).get((int)((long)52940161 ^ (long)52940161));
            if (e == null) {
                Intrinsics.throwNpe();
            }
            SwOKjgBuZ4bcevFcd16aerJXflMi80gZ swOKjgBuZ4bcevFcd16aerJXflMi80gZ = (SwOKjgBuZ4bcevFcd16aerJXflMi80gZ)e;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12765;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9, (String)"CrystalModifier.instance.baseFadeOutDelay");
            swOKjgBuZ4bcevFcd16aerJXflMi80gZ.Method1793(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9.Method369());
            Object v2 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12744.get(entity.entityId);
            if (v2 == null) {
                Intrinsics.throwNpe();
            }
            Object e2 = ((List)v2).get((int)-762072964L ^ 0xD293B07D);
            if (e2 == null) {
                Intrinsics.throwNpe();
            }
            SwOKjgBuZ4bcevFcd16aerJXflMi80gZ swOKjgBuZ4bcevFcd16aerJXflMi80gZ2 = (SwOKjgBuZ4bcevFcd16aerJXflMi80gZ)e2;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12773;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10, (String)"CrystalModifier.instance.insideFadeOutDelay");
            swOKjgBuZ4bcevFcd16aerJXflMi80gZ2.Method1793(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10.Method369());
            Object v3 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12744.get(entity.entityId);
            if (v3 == null) {
                Intrinsics.throwNpe();
            }
            Object e3 = ((List)v3).get((int)((long)-98637194 ^ (long)-98637193) << 1);
            if (e3 == null) {
                Intrinsics.throwNpe();
            }
            SwOKjgBuZ4bcevFcd16aerJXflMi80gZ swOKjgBuZ4bcevFcd16aerJXflMi80gZ3 = (SwOKjgBuZ4bcevFcd16aerJXflMi80gZ)e3;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12779;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11, (String)"CrystalModifier.instance.outsideFadeOutDelay");
            swOKjgBuZ4bcevFcd16aerJXflMi80gZ3.Method1793(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11.Method369());
            Object v4 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12744.get(entity.entityId);
            if (v4 == null) {
                Intrinsics.throwNpe();
            }
            Object e4 = ((List)v4).get((int)-264482471L ^ 0xF03C515A);
            if (e4 == null) {
                Intrinsics.throwNpe();
            }
            SwOKjgBuZ4bcevFcd16aerJXflMi80gZ swOKjgBuZ4bcevFcd16aerJXflMi80gZ4 = (SwOKjgBuZ4bcevFcd16aerJXflMi80gZ)e4;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12785;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12, (String)"CrystalModifier.instance.outsideFadeOutDelay2");
            swOKjgBuZ4bcevFcd16aerJXflMi80gZ4.Method1793(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12.Method369());
            return;
        }
        super.render(entity, f, f2, f3, f4, f5, f6);
    }

    private final ModelRenderer getInsideBox() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12769;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"CrystalModifier.instance.insideCube");
        Enum enum_ = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.render.CrystalModifier.CubeModes");
        }
        WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)enum_;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12770;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"CrystalModifier.instance.insideModel");
        Enum enum_2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method341();
        if (enum_2 != null) return this.getRenderer(wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)enum_2);
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.render.CrystalModifier.ModelModes");
    }

    private final ModelRenderer getOutsideBox() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12775;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"CrystalModifier.instance.outsideCube");
        Enum enum_ = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.render.CrystalModifier.CubeModes");
        }
        WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)enum_;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12776;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"CrystalModifier.instance.outsideModel");
        Enum enum_2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method341();
        if (enum_2 != null) return this.getRenderer(wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)enum_2);
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.render.CrystalModifier.ModelModes");
    }

    private final ModelRenderer getOutsideBox2() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12781;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"CrystalModifier.instance.outsideCube2");
        Enum enum_ = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.render.CrystalModifier.CubeModes");
        }
        WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)enum_;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12782;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"CrystalModifier.instance.outsideModel2");
        Enum enum_2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method341();
        if (enum_2 != null) return this.getRenderer(wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)enum_2);
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.render.CrystalModifier.ModelModes");
    }

    private final void drawCube(ModelRenderer modelRenderer, int n, float f) {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12746;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"CrystalModifier.instance.rubiksCrystal");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            boolean bl;
            if (n == ((int)246644572L ^ 0xEB37F5D) << 1) {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12750;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"CrystalModifier.instance.rubiksCrystalOutside");
                bl = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365();
            } else if (n == (int)((long)-1670354809 ^ (long)-1670354812)) {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12751;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"CrystalModifier.instance.rubiksCrystalOutside2");
                bl = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365();
            } else {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12749;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"CrystalModifier.instance.rubiksCrystalInside");
                bl = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365();
            }
            if (bl) {
                this.drawRubiksBox(modelRenderer, f);
                return;
            }
        }
        modelRenderer.render(f);
    }

    private final void drawRubiksBox(ModelRenderer modelRenderer, float f) {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12746;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"CrystalModifier.instance.rubiksCrystal");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            modelRenderer.render(f);
            return;
        }
        GlStateManager.scale((double)Double.longBitsToDouble((long)2144993710 ^ 0x3FD99999E6439834L), (double)Double.longBitsToDouble(0x655D5F64CC999160L ^ 0x5A84C6FD550008FAL), (double)Double.longBitsToDouble(0xD8286E344A5822C6L ^ 0xE7F1F7ADD3C1BB5CL));
        float f2 = f * (float)Double.longBitsToDouble(0x48166C90BDF5D6A6L ^ 0x77FFF509246C4F3CL);
        long l = System.currentTimeMillis();
        if (l - (long)(((int)1312203393L ^ 0x4E36A298) << 4) > WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12741) {
            int[] nArray = LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10084[WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12740];
            Quaternion[] quaternionArray = new Quaternion[(int)((long)716744307 ^ (long)716744314)];
            quaternionArray[(int)((long)374121862 ^ (long)374121862)] = LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[(int)((long)758674393 ^ (long)758674393)]];
            quaternionArray[(int)-539380388L ^ 0xDFD9B55D] = LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[(int)((long)277310120 ^ (long)277310121)]];
            quaternionArray[(int)((long)1427848930 ^ (long)1427848931) << 1] = LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[(int)((long)1162200298 ^ (long)1162200299) << 1]];
            quaternionArray[(int)-468268873L ^ 0xE416C8B4] = LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[(int)1485465009L ^ 0x588A65B2]];
            quaternionArray[((int)-1529699005L ^ 0xA4D2A542) << 2] = LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[((int)-1855239176L ^ 0x916B4BF9) << 2]];
            quaternionArray[(int)471568586L ^ 0x1C1B90CF] = LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[(int)-1088358188L ^ 0xBF20F8D1]];
            quaternionArray[((int)-1686564977L ^ 0x9B790F8C) << 1] = LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[(int)((long)1875758917 ^ (long)1875758918) << 1]];
            quaternionArray[(int)((long)-1950454859 ^ (long)-1950454862)] = LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[(int)-1718659419L ^ 0x998F56A2]];
            quaternionArray[((int)1707986517L ^ 0x65CDCE54) << 3] = LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[(int)((long)963147826 ^ (long)963147827) << 3]];
            Quaternion[] quaternionArray2 = quaternionArray;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12747;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"CrystalModifier.instance\u2026sCrystalRotationDirection");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method341() == WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field14890) {
                LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[(int)((long)8503157 ^ (long)8503157)]] = quaternionArray2[((int)-75051618L ^ 0xFB86CD9D) << 1];
                LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[(int)1517689364L ^ 0x5A761A15]] = quaternionArray2[(int)2009197009L ^ 0x77C1E9D2];
                LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[(int)((long)2014543077 ^ (long)2014543076) << 1]] = quaternionArray2[(int)((long)-1092606949 ^ (long)-1092606949)];
                LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[(int)-196101593L ^ 0xF44FBA24]] = quaternionArray2[(int)((long)-1367749448 ^ (long)-1367749441)];
                LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[(int)((long)143434031 ^ (long)143434030) << 2]] = quaternionArray2[((int)-1389840077L ^ 0xAD28B932) << 2];
                LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[(int)639653885L ^ 0x262057F8]] = quaternionArray2[(int)-1475550771L ^ 0xA80CE1CC];
                LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[((int)1468441849L ^ 0x5786A4FA) << 1]] = quaternionArray2[(int)((long)926097699 ^ (long)926097698) << 3];
                LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[(int)((long)171967274 ^ (long)171967277)]] = quaternionArray2[(int)((long)2145064298 ^ (long)2145064303)];
                LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[((int)-1612786385L ^ 0x9FDED52E) << 3]] = quaternionArray2[((int)1599783917L ^ 0x5F5AC3EC) << 1];
            } else {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12747;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"CrystalModifier.instance\u2026sCrystalRotationDirection");
                if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method341() == WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field14891) {
                    LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[(int)1140108660L ^ 0x43F4AD74]] = quaternionArray2[(int)((long)122831743 ^ (long)122831742) << 1];
                    LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[(int)-1045561031L ^ 0xC1AE0138]] = quaternionArray2[(int)((long)-807489365 ^ (long)-807489362)];
                    LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[((int)1744315377L ^ 0x67F823F0) << 1]] = quaternionArray2[((int)-62537266L ^ 0xFC45C1CF) << 3];
                    LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[(int)207314288L ^ 0xC5B5D73]] = quaternionArray2[(int)306506480L ^ 0x1244EAF1];
                    LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[((int)-1574328499L ^ 0xA229A74C) << 2]] = quaternionArray2[((int)-1536210133L ^ 0xA46F4B2A) << 2];
                    LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[(int)((long)2127032487 ^ (long)2127032482)]] = quaternionArray2[(int)-1317400535L ^ 0xB17A102E];
                    LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[(int)((long)1578379720 ^ (long)1578379723) << 1]] = quaternionArray2[(int)((long)35371006 ^ (long)35371006)];
                    LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[(int)((long)1452314620 ^ (long)1452314619)]] = quaternionArray2[(int)-323740536L ^ 0xECB41C8B];
                    LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[nArray[((int)640863871L ^ 0x2632CE7E) << 3]] = quaternionArray2[((int)1508528206L ^ 0x59EA504D) << 1];
                }
            }
            int[] nArray2 = LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10085[WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12740];
            int n = (int)187855511L ^ 0xF4CD8D68;
            int n2 = (int)780748756L ^ 0x2E8947D5;
            int n3 = (int)911288732L ^ 0xC9AED663;
            int n4 = (int)((long)1430403662 ^ (long)1430403663);
            int n5 = (int)1629298952L ^ 0x9EE2DEF7;
            int n6 = (int)((long)-748709986 ^ (long)-748709985);
            while (true) {
                LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Method2302(n, n3, n5, nArray2[(int)((long)-851959283 ^ (long)-851959283)], nArray2[(int)((long)-1042005386 ^ (long)-1042005385)], nArray2[((int)-1939739718L ^ 0x8C61EBBB) << 1]);
                ++n5;
            }
        }
        int n = (int)-1968878760L ^ 0x755AB4A7;
        int n7 = (int)((long)-1911328947 ^ (long)-1911328948);
        int n8 = (int)((long)1918827629 ^ (long)-1918827630);
        int n9 = (int)((long)-1536228428 ^ (long)-1536228427);
        int n10 = (int)((long)-2074606760 ^ (long)2074606759);
        int n11 = (int)-1624435348L ^ 0x9F2D156D;
        while (true) {
            LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Method2300(modelRenderer, f2, n, n8, n10);
            ++n10;
        }
    }

    private final ModelRenderer getRenderer(WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) {
        switch (x8Xws6aXrjosbn9p5CeRkPtxMFV3E79F.Field17123[wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.ordinal()]) {
            case 1: {
                ModelRenderer modelRenderer;
                if (wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf == WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field10783) {
                    modelRenderer = this.Field16759;
                    return modelRenderer;
                }
                modelRenderer = this.Field16760;
                return modelRenderer;
            }
            case 2: {
                ModelRenderer modelRenderer;
                if (wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf == WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field10783) {
                    modelRenderer = this.Field16761;
                    return modelRenderer;
                }
                modelRenderer = this.Field16762;
                return modelRenderer;
            }
            case 3: {
                return null;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean needToRenderBase() {
        int n;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12764;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"CrystalModifier.instance.base");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            n = (int)73516962L ^ 0x461C7A2;
            return n != 0;
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12766;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"CrystalModifier.instance.alwaysBase");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365() && !this.Field16764) {
            n = (int)((long)-726014603 ^ (long)-726014603);
            return n != 0;
        }
        n = (int)((long)890693806 ^ (long)890693807);
        return n != 0;
    }

    private final double getTranslateX() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12758;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"CrystalModifier.instance.translate");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return 0.0;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12759;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"CrystalModifier.instance.translateX");
        double d = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method367();
        return d;
    }

    private final double getTranslateY() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12758;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"CrystalModifier.instance.translate");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return 0.0;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12760;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"CrystalModifier.instance.translateY");
        double d = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method367();
        return d;
    }

    private final double getTranslateZ() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12758;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"CrystalModifier.instance.translate");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return 0.0;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12761;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"CrystalModifier.instance.translateZ");
        double d = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method367();
        return d;
    }

    private final double getScaleX() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12753;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"CrystalModifier.instance.scale");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return 1.0;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12754;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"CrystalModifier.instance.scaleX");
        double d = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method367();
        return d;
    }

    private final double getScaleY() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12753;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"CrystalModifier.instance.scale");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return 1.0;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12755;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"CrystalModifier.instance.scaleY");
        double d = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method367();
        return d;
    }

    private final double getScaleZ() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12753;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"CrystalModifier.instance.scale");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return 1.0;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12756;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"CrystalModifier.instance.scaleZ");
        double d = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method367();
        return d;
    }

    private final double getScaleModifier(int n, int n2) {
        if (!WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12744.containsKey(n)) {
            return 1.0;
        }
        switch (n2) {
            case 0: {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12765;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"CrystalModifier.instance.baseFadeOutDelay");
                if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335() == 0) {
                    return 1.0;
                }
                Object v = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12744.get(n);
                if (v == null) {
                    Intrinsics.throwNpe();
                }
                Object e = ((List)v).get((int)-353254925L ^ 0xEAF1C1F3);
                if (e == null) {
                    Intrinsics.throwNpe();
                }
                double d = ((SwOKjgBuZ4bcevFcd16aerJXflMi80gZ)e).Method1796();
                return d;
            }
            case 1: {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12773;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"CrystalModifier.instance.insideFadeOutDelay");
                if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method335() == 0) {
                    return 1.0;
                }
                Object v = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12744.get(n);
                if (v == null) {
                    Intrinsics.throwNpe();
                }
                Object e = ((List)v).get((int)((long)1166626845 ^ (long)1166626844));
                if (e == null) {
                    Intrinsics.throwNpe();
                }
                double d = ((SwOKjgBuZ4bcevFcd16aerJXflMi80gZ)e).Method1796();
                return d;
            }
            case 2: {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12779;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"CrystalModifier.instance.outsideFadeOutDelay");
                if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method335() == 0) {
                    return 1.0;
                }
                Object v = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12744.get(n);
                if (v == null) {
                    Intrinsics.throwNpe();
                }
                Object e = ((List)v).get((int)((long)878779614 ^ (long)878779615) << 1);
                if (e == null) {
                    Intrinsics.throwNpe();
                }
                double d = ((SwOKjgBuZ4bcevFcd16aerJXflMi80gZ)e).Method1796();
                return d;
            }
            case 3: {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12739.Field12785;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"CrystalModifier.instance.outsideFadeOutDelay2");
                if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method335() == 0) {
                    return 1.0;
                }
                Object v = WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12744.get(n);
                if (v == null) {
                    Intrinsics.throwNpe();
                }
                Object e = ((List)v).get((int)((long)137695048 ^ (long)137695051));
                if (e == null) {
                    Intrinsics.throwNpe();
                }
                double d = ((SwOKjgBuZ4bcevFcd16aerJXflMi80gZ)e).Method1796();
                return d;
            }
        }
        return 1.0;
    }

    public WazuyEmi1E8Qbbxmq0EXDYiIMAFUanLY(boolean bl) {
        super(0.0f, bl);
        this.Field16764 = bl;
        this.Field16759 = new ModelRenderer((ModelBase)this, "cube").setTextureOffset((int)((long)155349839 ^ (long)155349838) << 5, (int)1319651445L ^ 0x4EA84875).addBox(Float.intBitsToFloat((int)1617876775L ^ 0xA0EED727), Float.intBitsToFloat(0x5BBBF7CD ^ 0x9B3BF7CD), Float.intBitsToFloat((int)((long)1318288227 ^ (long)-1911325853)), (int)((long)720338090 ^ (long)720338091) << 3, ((int)284343511L ^ 0x10F2BCD6) << 3, ((int)138791385L ^ 0x845C9D8) << 3);
        this.Field16760 = new ModelRenderer((ModelBase)this, "glass").setTextureOffset(((int)-1455122369L ^ 0xA944983E) << 5, (int)-1259746303L ^ 0xB4E9CC01).addBox(Float.intBitsToFloat((int)((long)836249928 ^ (long)-245880504)), Float.intBitsToFloat((int)((long)326887930 ^ (long)-738465286)), Float.intBitsToFloat((int)((long)1228034861 ^ (long)-1984802003)), ((int)829098377L ^ 0x316B0988) << 3, (int)((long)1093501937 ^ (long)1093501936) << 3, (int)((long)958169643 ^ (long)958169642) << 3);
        this.Field16761 = new ModelRenderer((ModelBase)this, "cube").setTextureOffset((int)((long)-178264692 ^ (long)-178264692), (int)((long)1105038779 ^ (long)1105038779)).addBox(Float.intBitsToFloat((int)((long)683678205 ^ (long)-398452227)), Float.intBitsToFloat(0x4BF50AA8 ^ 0x8B750AA8), Float.intBitsToFloat((int)((long)1754274809 ^ (long)-1475339271)), ((int)-1625169553L ^ 0x9F21E16E) << 3, ((int)-229275674L ^ 0xF25587E7) << 3, (int)((long)616478745 ^ (long)616478744) << 3);
        this.Field16762 = new ModelRenderer((ModelBase)this, "glass").setTextureOffset((int)((long)-973416493 ^ (long)-973416493), (int)734709877L ^ 0x2BCAC875).addBox(Float.intBitsToFloat((int)((long)461760829 ^ (long)-620369603)), Float.intBitsToFloat((int)((long)1023770327 ^ (long)-41582889)), Float.intBitsToFloat((int)((long)53030510 ^ (long)-1012322706)), (int)((long)462021274 ^ (long)462021275) << 3, ((int)1103326105L ^ 0x41C36B98) << 3, ((int)834382148L ^ 0x31BBA945) << 3);
        this.Field16763 = new ModelRenderer((ModelBase)this, "base").setTextureOffset((int)969396052L ^ 0x39C7CF54, (int)((long)-589398306 ^ (long)-589398305) << 4).addBox(Float.intBitsToFloat((int)((long)1797633055 ^ (long)-1411009505)), 0.0f, Float.intBitsToFloat((int)((long)1789517328 ^ (long)-1435902448)), (int)((long)1016548117 ^ (long)1016548118) << 2, (int)((long)1258550311 ^ (long)1258550310) << 2, (int)((long)1227472925 ^ (long)1227472926) << 2);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)160492990L ^ 0x990EDBE;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)0xDCC2DD2 ^ (long)0xDCC2D2D);
            int n2 = (int)((long)-848579069 ^ (long)-848578994) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1108718866 ^ (long)-1108722619) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

