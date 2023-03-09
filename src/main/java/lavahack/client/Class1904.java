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

import com.kisman.cc.util.Class2142;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1075;
import lavahack.client.Class1478;
import lavahack.client.Class1983;
import lavahack.client.Class2037;
import lavahack.client.Class357;
import lavahack.client.Class44;
import lavahack.client.Class501;
import lavahack.client.Class645;
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
public final class Class1904
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
        Class1075 class1075 = Class1075.Field12739;
        Intrinsics.checkExpressionValueIsNotNull((Object)class1075, (String)"CrystalModifier.instance");
        if (class1075.Method35() && entity instanceof EntityEnderCrystal) {
            Class1075.Field12744.containsKey(entity.entityId);
            Minecraft minecraft = Class2142.Field17803;
            Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"mc");
            float f7 = minecraft.getRenderPartialTicks();
            float f8 = (float)((EntityEnderCrystal)entity).innerRotation + f7;
            float f9 = MathHelper.sin((float)(f8 * Float.intBitsToFloat(1045220557))) / 2.0f + Float.intBitsToFloat(0x3F000000);
            f9 += f9 * f9;
            GlStateManager.pushMatrix();
            GlStateManager.scale((double)((double)2.0f * this.getScaleX() * this.getScaleModifier(entity.entityId, 0)), (double)((double)2.0f * this.getScaleY() * this.getScaleModifier(entity.entityId, 0)), (double)((double)2.0f * this.getScaleZ() * this.getScaleModifier(entity.entityId, 0)));
            GlStateManager.translate((double)this.getTranslateX(), (double)((double)Float.intBitsToFloat(-1090519040) + this.getTranslateY()), (double)this.getTranslateZ());
            if (this.needToRenderBase()) {
                this.Field16763.render(f6);
            }
            GlStateManager.scale((double)(this.getScaleX() * this.getScaleModifier(entity.entityId, 2)), (double)(this.getScaleY() * this.getScaleModifier(entity.entityId, 2)), (double)(this.getScaleZ() * this.getScaleModifier(entity.entityId, 2)));
            Class44 class44 = Class1075.Field12739.Field12778;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"CrystalModifier.instance.outsideSpinSpeed");
            GlStateManager.rotate((float)(f8 * class44.Method368()), (float)0.0f, (float)1.0f, (float)0.0f);
            double d = this.getTranslateX();
            float f10 = Float.intBitsToFloat(1061997773);
            Class44 class442 = Class1075.Field12739.Field12786;
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"CrystalModifier.instance.bounce");
            GlStateManager.translate((double)d, (double)((double)(f10 + f9 * class442.Method368()) + this.getTranslateY()), (double)this.getTranslateZ());
            GlStateManager.rotate((float)Float.intBitsToFloat(1114636288), (float)Float.intBitsToFloat(1060439169), (float)0.0f, (float)Float.intBitsToFloat(1060439169));
            Class44 class443 = Class1075.Field12739.Field12775;
            Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"CrystalModifier.instance.outsideCube");
            if (class443.Method341() != Class2037.Field17364) {
                ModelRenderer modelRenderer = this.getOutsideBox();
                if (modelRenderer == null) {
                    Intrinsics.throwNpe();
                }
                this.drawCube(modelRenderer, 2, f6);
            }
            GlStateManager.scale((double)((double)Float.intBitsToFloat(1063256064) * this.getScaleX() * this.getScaleModifier(entity.entityId, 3)), (double)((double)Float.intBitsToFloat(1063256064) * this.getScaleY() * this.getScaleModifier(entity.entityId, 3)), (double)((double)Float.intBitsToFloat(1063256064) * this.getScaleZ() * this.getScaleModifier(entity.entityId, 3)));
            GlStateManager.rotate((float)Float.intBitsToFloat(1114636288), (float)Float.intBitsToFloat(1060439169), (float)0.0f, (float)Float.intBitsToFloat(1060439169));
            Class44 class444 = Class1075.Field12739.Field12784;
            Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"CrystalModifier.instance.outsideSpinSpeed2");
            GlStateManager.rotate((float)(f8 * class444.Method368()), (float)0.0f, (float)1.0f, (float)0.0f);
            Class44 class445 = Class1075.Field12739.Field12781;
            Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"CrystalModifier.instance.outsideCube2");
            if (class445.Method341() != Class2037.Field17364) {
                ModelRenderer modelRenderer = this.getOutsideBox2();
                if (modelRenderer == null) {
                    Intrinsics.throwNpe();
                }
                this.drawCube(modelRenderer, 3, f6);
            }
            GlStateManager.scale((double)((double)Float.intBitsToFloat(1063256064) * this.getScaleX() * this.getScaleModifier(entity.entityId, 1)), (double)((double)Float.intBitsToFloat(1063256064) * this.getScaleY() * this.getScaleModifier(entity.entityId, 1)), (double)((double)Float.intBitsToFloat(1063256064) * this.getScaleZ() * this.getScaleModifier(entity.entityId, 1)));
            GlStateManager.rotate((float)Float.intBitsToFloat(1114636288), (float)Float.intBitsToFloat(1060439169), (float)0.0f, (float)Float.intBitsToFloat(1060439169));
            Class44 class446 = Class1075.Field12739.Field12772;
            Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"CrystalModifier.instance.insideSpinSpeed");
            GlStateManager.rotate((float)(f8 * class446.Method368()), (float)0.0f, (float)1.0f, (float)0.0f);
            Class44 class447 = Class1075.Field12739.Field12769;
            Intrinsics.checkExpressionValueIsNotNull((Object)class447, (String)"CrystalModifier.instance.insideCube");
            if (class447.Method341() != Class2037.Field17364) {
                ModelRenderer modelRenderer = this.getInsideBox();
                if (modelRenderer == null) {
                    Intrinsics.throwNpe();
                }
                this.drawCube(modelRenderer, 1, f6);
            }
            GlStateManager.popMatrix();
            if (!Class1075.Field12744.containsKey(entity.entityId)) return;
            Object v = Class1075.Field12744.get(entity.entityId);
            if (v == null) {
                Intrinsics.throwNpe();
            }
            Object e = ((List)v).get(0);
            if (e == null) {
                Intrinsics.throwNpe();
            }
            Class357 class357 = (Class357)e;
            Class44 class448 = Class1075.Field12739.Field12765;
            Intrinsics.checkExpressionValueIsNotNull((Object)class448, (String)"CrystalModifier.instance.baseFadeOutDelay");
            class357.Method1793(class448.Method369());
            Object v2 = Class1075.Field12744.get(entity.entityId);
            if (v2 == null) {
                Intrinsics.throwNpe();
            }
            Object e2 = ((List)v2).get(1);
            if (e2 == null) {
                Intrinsics.throwNpe();
            }
            Class357 class3572 = (Class357)e2;
            Class44 class449 = Class1075.Field12739.Field12773;
            Intrinsics.checkExpressionValueIsNotNull((Object)class449, (String)"CrystalModifier.instance.insideFadeOutDelay");
            class3572.Method1793(class449.Method369());
            Object v3 = Class1075.Field12744.get(entity.entityId);
            if (v3 == null) {
                Intrinsics.throwNpe();
            }
            Object e3 = ((List)v3).get(2);
            if (e3 == null) {
                Intrinsics.throwNpe();
            }
            Class357 class3573 = (Class357)e3;
            Class44 class4410 = Class1075.Field12739.Field12779;
            Intrinsics.checkExpressionValueIsNotNull((Object)class4410, (String)"CrystalModifier.instance.outsideFadeOutDelay");
            class3573.Method1793(class4410.Method369());
            Object v4 = Class1075.Field12744.get(entity.entityId);
            if (v4 == null) {
                Intrinsics.throwNpe();
            }
            Object e4 = ((List)v4).get(3);
            if (e4 == null) {
                Intrinsics.throwNpe();
            }
            Class357 class3574 = (Class357)e4;
            Class44 class4411 = Class1075.Field12739.Field12785;
            Intrinsics.checkExpressionValueIsNotNull((Object)class4411, (String)"CrystalModifier.instance.outsideFadeOutDelay2");
            class3574.Method1793(class4411.Method369());
            return;
        }
        super.render(entity, f, f2, f3, f4, f5, f6);
    }

    private final ModelRenderer getInsideBox() {
        Class44 class44 = Class1075.Field12739.Field12769;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"CrystalModifier.instance.insideCube");
        Enum enum_ = class44.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.render.CrystalModifier.CubeModes");
        }
        Class2037 class2037 = (Class2037)enum_;
        Class44 class442 = Class1075.Field12739.Field12770;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"CrystalModifier.instance.insideModel");
        Enum enum_2 = class442.Method341();
        if (enum_2 != null) return this.getRenderer(class2037, (Class645)enum_2);
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.render.CrystalModifier.ModelModes");
    }

    private final ModelRenderer getOutsideBox() {
        Class44 class44 = Class1075.Field12739.Field12775;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"CrystalModifier.instance.outsideCube");
        Enum enum_ = class44.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.render.CrystalModifier.CubeModes");
        }
        Class2037 class2037 = (Class2037)enum_;
        Class44 class442 = Class1075.Field12739.Field12776;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"CrystalModifier.instance.outsideModel");
        Enum enum_2 = class442.Method341();
        if (enum_2 != null) return this.getRenderer(class2037, (Class645)enum_2);
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.render.CrystalModifier.ModelModes");
    }

    private final ModelRenderer getOutsideBox2() {
        Class44 class44 = Class1075.Field12739.Field12781;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"CrystalModifier.instance.outsideCube2");
        Enum enum_ = class44.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.render.CrystalModifier.CubeModes");
        }
        Class2037 class2037 = (Class2037)enum_;
        Class44 class442 = Class1075.Field12739.Field12782;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"CrystalModifier.instance.outsideModel2");
        Enum enum_2 = class442.Method341();
        if (enum_2 != null) return this.getRenderer(class2037, (Class645)enum_2);
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.render.CrystalModifier.ModelModes");
    }

    private final void drawCube(ModelRenderer modelRenderer, int n, float f) {
        Class44 class44 = Class1075.Field12739.Field12746;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"CrystalModifier.instance.rubiksCrystal");
        if (class44.Method365()) {
            boolean bl;
            if (n == 2) {
                Class44 class442 = Class1075.Field12739.Field12750;
                Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"CrystalModifier.instance.rubiksCrystalOutside");
                bl = class442.Method365();
            } else if (n == 3) {
                Class44 class443 = Class1075.Field12739.Field12751;
                Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"CrystalModifier.instance.rubiksCrystalOutside2");
                bl = class443.Method365();
            } else {
                Class44 class444 = Class1075.Field12739.Field12749;
                Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"CrystalModifier.instance.rubiksCrystalInside");
                bl = class444.Method365();
            }
            if (bl) {
                this.drawRubiksBox(modelRenderer, f);
                return;
            }
        }
        modelRenderer.render(f);
    }

    private final void drawRubiksBox(ModelRenderer modelRenderer, float f) {
        Class44 class44 = Class1075.Field12739.Field12746;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"CrystalModifier.instance.rubiksCrystal");
        if (!class44.Method365()) {
            modelRenderer.render(f);
            return;
        }
        GlStateManager.scale((double)Double.longBitsToDouble((long)2144993710 ^ 0x3FD99999E6439834L), (double)Double.longBitsToDouble(4600877379321698714L), (double)Double.longBitsToDouble(4600877379321698714L));
        float f2 = f * (float)Double.longBitsToDouble(4605380978949069210L);
        long l = System.currentTimeMillis();
        if (l - (long)400 > Class1075.Field12741) {
            int[] nArray = Class501.Field10084[Class1075.Field12740];
            Quaternion[] quaternionArray = new Quaternion[]{Class501.Field10082[nArray[0]], Class501.Field10082[nArray[1]], Class501.Field10082[nArray[2]], Class501.Field10082[nArray[3]], Class501.Field10082[nArray[4]], Class501.Field10082[nArray[5]], Class501.Field10082[nArray[6]], Class501.Field10082[nArray[7]], Class501.Field10082[nArray[8]]};
            Class44 class442 = Class1075.Field12739.Field12747;
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"CrystalModifier.instance\u2026sCrystalRotationDirection");
            if (class442.Method341() == Class1478.Field14890) {
                Class501.Field10082[nArray[0]] = quaternionArray[6];
                Class501.Field10082[nArray[1]] = quaternionArray[3];
                Class501.Field10082[nArray[2]] = quaternionArray[0];
                Class501.Field10082[nArray[3]] = quaternionArray[7];
                Class501.Field10082[nArray[4]] = quaternionArray[4];
                Class501.Field10082[nArray[5]] = quaternionArray[1];
                Class501.Field10082[nArray[6]] = quaternionArray[8];
                Class501.Field10082[nArray[7]] = quaternionArray[5];
                Class501.Field10082[nArray[8]] = quaternionArray[2];
            } else {
                Class44 class443 = Class1075.Field12739.Field12747;
                Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"CrystalModifier.instance\u2026sCrystalRotationDirection");
                if (class443.Method341() == Class1478.Field14891) {
                    Class501.Field10082[nArray[0]] = quaternionArray[2];
                    Class501.Field10082[nArray[1]] = quaternionArray[5];
                    Class501.Field10082[nArray[2]] = quaternionArray[8];
                    Class501.Field10082[nArray[3]] = quaternionArray[1];
                    Class501.Field10082[nArray[4]] = quaternionArray[4];
                    Class501.Field10082[nArray[5]] = quaternionArray[7];
                    Class501.Field10082[nArray[6]] = quaternionArray[0];
                    Class501.Field10082[nArray[7]] = quaternionArray[3];
                    Class501.Field10082[nArray[8]] = quaternionArray[6];
                }
            }
            int[] nArray2 = Class501.Field10085[Class1075.Field12740];
            int n = -1;
            boolean bl = true;
            int n2 = -1;
            boolean bl2 = true;
            int n3 = -1;
            boolean bl3 = true;
            while (true) {
                Class501.Method2302(n, n2, n3, nArray2[0], nArray2[1], nArray2[2]);
                ++n3;
            }
        }
        int n = -1;
        boolean bl = true;
        int n4 = -1;
        boolean bl4 = true;
        int n5 = -1;
        boolean bl5 = true;
        while (true) {
            Class501.Method2300(modelRenderer, f2, n, n4, n5);
            ++n5;
        }
    }

    private final ModelRenderer getRenderer(Class2037 class2037, Class645 class645) {
        switch (Class1983.Field17123[class2037.ordinal()]) {
            case 1: {
                ModelRenderer modelRenderer;
                if (class645 == Class645.Field10783) {
                    modelRenderer = this.Field16759;
                    return modelRenderer;
                }
                modelRenderer = this.Field16760;
                return modelRenderer;
            }
            case 2: {
                ModelRenderer modelRenderer;
                if (class645 == Class645.Field10783) {
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
        Class44 class44 = Class1075.Field12739.Field12764;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"CrystalModifier.instance.base");
        if (!class44.Method365()) {
            return false;
        }
        Class44 class442 = Class1075.Field12739.Field12766;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"CrystalModifier.instance.alwaysBase");
        if (class442.Method365()) return true;
        if (this.Field16764) return true;
        return false;
    }

    private final double getTranslateX() {
        Class44 class44 = Class1075.Field12739.Field12758;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"CrystalModifier.instance.translate");
        if (!class44.Method365()) return 0.0;
        Class44 class442 = Class1075.Field12739.Field12759;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"CrystalModifier.instance.translateX");
        double d = class442.Method367();
        return d;
    }

    private final double getTranslateY() {
        Class44 class44 = Class1075.Field12739.Field12758;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"CrystalModifier.instance.translate");
        if (!class44.Method365()) return 0.0;
        Class44 class442 = Class1075.Field12739.Field12760;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"CrystalModifier.instance.translateY");
        double d = class442.Method367();
        return d;
    }

    private final double getTranslateZ() {
        Class44 class44 = Class1075.Field12739.Field12758;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"CrystalModifier.instance.translate");
        if (!class44.Method365()) return 0.0;
        Class44 class442 = Class1075.Field12739.Field12761;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"CrystalModifier.instance.translateZ");
        double d = class442.Method367();
        return d;
    }

    private final double getScaleX() {
        Class44 class44 = Class1075.Field12739.Field12753;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"CrystalModifier.instance.scale");
        if (!class44.Method365()) return 1.0;
        Class44 class442 = Class1075.Field12739.Field12754;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"CrystalModifier.instance.scaleX");
        double d = class442.Method367();
        return d;
    }

    private final double getScaleY() {
        Class44 class44 = Class1075.Field12739.Field12753;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"CrystalModifier.instance.scale");
        if (!class44.Method365()) return 1.0;
        Class44 class442 = Class1075.Field12739.Field12755;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"CrystalModifier.instance.scaleY");
        double d = class442.Method367();
        return d;
    }

    private final double getScaleZ() {
        Class44 class44 = Class1075.Field12739.Field12753;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"CrystalModifier.instance.scale");
        if (!class44.Method365()) return 1.0;
        Class44 class442 = Class1075.Field12739.Field12756;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"CrystalModifier.instance.scaleZ");
        double d = class442.Method367();
        return d;
    }

    private final double getScaleModifier(int n, int n2) {
        if (!Class1075.Field12744.containsKey(n)) {
            return 1.0;
        }
        switch (n2) {
            case 0: {
                Class44 class44 = Class1075.Field12739.Field12765;
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"CrystalModifier.instance.baseFadeOutDelay");
                if (class44.Method335() == 0) {
                    return 1.0;
                }
                Object v = Class1075.Field12744.get(n);
                if (v == null) {
                    Intrinsics.throwNpe();
                }
                Object e = ((List)v).get(0);
                if (e == null) {
                    Intrinsics.throwNpe();
                }
                double d = ((Class357)e).Method1796();
                return d;
            }
            case 1: {
                Class44 class44 = Class1075.Field12739.Field12773;
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"CrystalModifier.instance.insideFadeOutDelay");
                if (class44.Method335() == 0) {
                    return 1.0;
                }
                Object v = Class1075.Field12744.get(n);
                if (v == null) {
                    Intrinsics.throwNpe();
                }
                Object e = ((List)v).get(1);
                if (e == null) {
                    Intrinsics.throwNpe();
                }
                double d = ((Class357)e).Method1796();
                return d;
            }
            case 2: {
                Class44 class44 = Class1075.Field12739.Field12779;
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"CrystalModifier.instance.outsideFadeOutDelay");
                if (class44.Method335() == 0) {
                    return 1.0;
                }
                Object v = Class1075.Field12744.get(n);
                if (v == null) {
                    Intrinsics.throwNpe();
                }
                Object e = ((List)v).get(2);
                if (e == null) {
                    Intrinsics.throwNpe();
                }
                double d = ((Class357)e).Method1796();
                return d;
            }
            case 3: {
                Class44 class44 = Class1075.Field12739.Field12785;
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"CrystalModifier.instance.outsideFadeOutDelay2");
                if (class44.Method335() == 0) {
                    return 1.0;
                }
                Object v = Class1075.Field12744.get(n);
                if (v == null) {
                    Intrinsics.throwNpe();
                }
                Object e = ((List)v).get(3);
                if (e == null) {
                    Intrinsics.throwNpe();
                }
                double d = ((Class357)e).Method1796();
                return d;
            }
        }
        return 1.0;
    }

    public Class1904(boolean bl) {
        super(0.0f, bl);
        this.Field16764 = bl;
        this.Field16759 = new ModelRenderer((ModelBase)this, "cube").setTextureOffset(32, 0).addBox(Float.intBitsToFloat(-1065353216), Float.intBitsToFloat(-1065353216), Float.intBitsToFloat(-1065353216), 8, 8, 8);
        this.Field16760 = new ModelRenderer((ModelBase)this, "glass").setTextureOffset(32, 0).addBox(Float.intBitsToFloat(-1065353216), Float.intBitsToFloat(-1065353216), Float.intBitsToFloat(-1065353216), 8, 8, 8);
        this.Field16761 = new ModelRenderer((ModelBase)this, "cube").setTextureOffset(0, 0).addBox(Float.intBitsToFloat(-1065353216), Float.intBitsToFloat(-1065353216), Float.intBitsToFloat(-1065353216), 8, 8, 8);
        this.Field16762 = new ModelRenderer((ModelBase)this, "glass").setTextureOffset(0, 0).addBox(Float.intBitsToFloat(-1065353216), Float.intBitsToFloat(-1065353216), Float.intBitsToFloat(-1065353216), 8, 8, 8);
        this.Field16763 = new ModelRenderer((ModelBase)this, "base").setTextureOffset(0, 16).addBox(Float.intBitsToFloat(-1061158912), 0.0f, Float.intBitsToFloat(-1061158912), 12, 4, 12);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 154;
            cArray2[n] = (char)(cArray[n] ^ (0x76AB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

