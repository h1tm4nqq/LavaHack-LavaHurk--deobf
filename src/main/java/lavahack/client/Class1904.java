//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.entity.item.*;
import com.kisman.cc.util.*;
import net.minecraft.util.math.*;
import net.minecraft.client.renderer.*;
import java.util.*;
import net.minecraft.client.*;
import org.lwjgl.util.vector.*;
import kotlin.*;
import net.minecraft.client.model.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0002J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u001dH\u0002J\b\u0010\"\u001a\u00020\u001dH\u0002J\b\u0010#\u001a\u00020\u001dH\u0002J\b\u0010$\u001a\u00020\u001dH\u0002J\b\u0010%\u001a\u00020\u0003H\u0002J@\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004?\u0006\u0002\n\u0000?\u0006." }, d2 = { "Lcom/kisman/cc/features/module/render/crystalmodifier/CrystalModelHandler;", "Lnet/minecraft/client/model/ModelEnderCrystal;", "renderBase", "", "(Z)V", "bottom", "Lnet/minecraft/client/model/ModelRenderer;", "kotlin.jvm.PlatformType", "insideCube", "insideGlass", "outsideCube", "outsideGlass", "drawCube", "", "cube", "cubeID", "", "scale", "", "drawRubiksBox", "getInsideBox", "getOutsideBox", "getOutsideBox2", "getRenderer", "tex", "Lcom/kisman/cc/features/module/render/CrystalModifier$CubeModes;", "model", "Lcom/kisman/cc/features/module/render/CrystalModifier$ModelModes;", "getScaleModifier", "", "entityID", "getScaleX", "getScaleY", "getScaleZ", "getTranslateX", "getTranslateY", "getTranslateZ", "needToRenderBase", "render", "entity", "Lnet/minecraft/entity/Entity;", "limbSwing", "limbSwingAmount", "ageInTicks", "netHeadYaw", "headPitch", "kisman.cc" })
public final class Class1904 extends ModelEnderCrystal
{
    private final ModelRenderer Field16759;
    private final ModelRenderer Field16760;
    private final ModelRenderer Field16761;
    private final ModelRenderer Field16762;
    private final ModelRenderer Field16763;
    private final boolean Field16764;
    private int Field16765;
    
    public void render(@NotNull @NotNull final Entity entity, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        Intrinsics.checkParameterIsNotNull((Object)entity, "entity");
        final Class1075 field12739 = Class1075.Field12739;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12739, "CrystalModifier.instance");
        if (field12739.Method35() && entity instanceof EntityEnderCrystal) {
            Class1075.Field12744.containsKey(entity.entityId);
            final Minecraft field12740 = Class2142.Field17803;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12740, "mc");
            final float n7 = ((EntityEnderCrystal)entity).innerRotation + field12740.getRenderPartialTicks();
            final float n8 = MathHelper.sin(n7 * Float.intBitsToFloat(1045220557)) / 2.0f + Float.intBitsToFloat(1056964608);
            final float n9 = n8 + n8 * n8;
            GlStateManager.pushMatrix();
            GlStateManager.scale(2.0f * this.getScaleX() * this.getScaleModifier(entity.entityId, 0), 2.0f * this.getScaleY() * this.getScaleModifier(entity.entityId, 0), 2.0f * this.getScaleZ() * this.getScaleModifier(entity.entityId, 0));
            GlStateManager.translate(this.getTranslateX(), Float.intBitsToFloat(-1090519040) + this.getTranslateY(), this.getTranslateZ());
            if (this.needToRenderBase()) {
                this.Field16763.render(n6);
            }
            GlStateManager.scale(this.getScaleX() * this.getScaleModifier(entity.entityId, 2), this.getScaleY() * this.getScaleModifier(entity.entityId, 2), this.getScaleZ() * this.getScaleModifier(entity.entityId, 2));
            final float n10 = n7;
            final Class44 field12741 = Class1075.Field12739.Field12778;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12741, "CrystalModifier.instance.outsideSpinSpeed");
            GlStateManager.rotate(n10 * field12741.Method368(), 0.0f, 1.0f, 0.0f);
            final double translateX = this.getTranslateX();
            final float intBitsToFloat = Float.intBitsToFloat(1061997773);
            final float n11 = n9;
            final Class44 field12742 = Class1075.Field12739.Field12786;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12742, "CrystalModifier.instance.bounce");
            GlStateManager.translate(translateX, intBitsToFloat + n11 * field12742.Method368() + this.getTranslateY(), this.getTranslateZ());
            GlStateManager.rotate(Float.intBitsToFloat(1114636288), Float.intBitsToFloat(1060439169), 0.0f, Float.intBitsToFloat(1060439169));
            final Class44 field12743 = Class1075.Field12739.Field12775;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12743, "CrystalModifier.instance.outsideCube");
            if (field12743.Method341() != Class2037.Field17364) {
                final ModelRenderer outsideBox = this.getOutsideBox();
                if (outsideBox == null) {
                    Intrinsics.throwNpe();
                }
                this.drawCube(outsideBox, 2, n6);
            }
            GlStateManager.scale(Float.intBitsToFloat(1063256064) * this.getScaleX() * this.getScaleModifier(entity.entityId, 3), Float.intBitsToFloat(1063256064) * this.getScaleY() * this.getScaleModifier(entity.entityId, 3), Float.intBitsToFloat(1063256064) * this.getScaleZ() * this.getScaleModifier(entity.entityId, 3));
            GlStateManager.rotate(Float.intBitsToFloat(1114636288), Float.intBitsToFloat(1060439169), 0.0f, Float.intBitsToFloat(1060439169));
            final float n12 = n7;
            final Class44 field12744 = Class1075.Field12739.Field12784;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12744, "CrystalModifier.instance.outsideSpinSpeed2");
            GlStateManager.rotate(n12 * field12744.Method368(), 0.0f, 1.0f, 0.0f);
            final Class44 field12745 = Class1075.Field12739.Field12781;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12745, "CrystalModifier.instance.outsideCube2");
            if (field12745.Method341() != Class2037.Field17364) {
                final ModelRenderer outsideBox2 = this.getOutsideBox2();
                if (outsideBox2 == null) {
                    Intrinsics.throwNpe();
                }
                this.drawCube(outsideBox2, 3, n6);
            }
            GlStateManager.scale(Float.intBitsToFloat(1063256064) * this.getScaleX() * this.getScaleModifier(entity.entityId, 1), Float.intBitsToFloat(1063256064) * this.getScaleY() * this.getScaleModifier(entity.entityId, 1), Float.intBitsToFloat(1063256064) * this.getScaleZ() * this.getScaleModifier(entity.entityId, 1));
            GlStateManager.rotate(Float.intBitsToFloat(1114636288), Float.intBitsToFloat(1060439169), 0.0f, Float.intBitsToFloat(1060439169));
            final float n13 = n7;
            final Class44 field12746 = Class1075.Field12739.Field12772;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12746, "CrystalModifier.instance.insideSpinSpeed");
            GlStateManager.rotate(n13 * field12746.Method368(), 0.0f, 1.0f, 0.0f);
            final Class44 field12747 = Class1075.Field12739.Field12769;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12747, "CrystalModifier.instance.insideCube");
            if (field12747.Method341() != Class2037.Field17364) {
                final ModelRenderer insideBox = this.getInsideBox();
                if (insideBox == null) {
                    Intrinsics.throwNpe();
                }
                this.drawCube(insideBox, 1, n6);
            }
            GlStateManager.popMatrix();
            if (Class1075.Field12744.containsKey(entity.entityId)) {
                final List<Object> value = Class1075.Field12744.get(entity.entityId);
                if (value == null) {
                    Intrinsics.throwNpe();
                }
                final Object value2 = value.get(0);
                if (value2 == null) {
                    Intrinsics.throwNpe();
                }
                final Class357 class357 = (Class357)value2;
                final Class44 field12748 = Class1075.Field12739.Field12765;
                Intrinsics.checkExpressionValueIsNotNull((Object)field12748, "CrystalModifier.instance.baseFadeOutDelay");
                class357.Method1793(field12748.Method369());
                final List<Object> value3 = Class1075.Field12744.get(entity.entityId);
                if (value3 == null) {
                    Intrinsics.throwNpe();
                }
                final Object value4 = value3.get(1);
                if (value4 == null) {
                    Intrinsics.throwNpe();
                }
                final Class357 class358 = (Class357)value4;
                final Class44 field12749 = Class1075.Field12739.Field12773;
                Intrinsics.checkExpressionValueIsNotNull((Object)field12749, "CrystalModifier.instance.insideFadeOutDelay");
                class358.Method1793(field12749.Method369());
                final List<Object> value5 = Class1075.Field12744.get(entity.entityId);
                if (value5 == null) {
                    Intrinsics.throwNpe();
                }
                final Object value6 = value5.get(2);
                if (value6 == null) {
                    Intrinsics.throwNpe();
                }
                final Class357 class359 = (Class357)value6;
                final Class44 field12750 = Class1075.Field12739.Field12779;
                Intrinsics.checkExpressionValueIsNotNull((Object)field12750, "CrystalModifier.instance.outsideFadeOutDelay");
                class359.Method1793(field12750.Method369());
                final List<Object> value7 = Class1075.Field12744.get(entity.entityId);
                if (value7 == null) {
                    Intrinsics.throwNpe();
                }
                final Object value8 = value7.get(3);
                if (value8 == null) {
                    Intrinsics.throwNpe();
                }
                final Class357 class360 = (Class357)value8;
                final Class44 field12751 = Class1075.Field12739.Field12785;
                Intrinsics.checkExpressionValueIsNotNull((Object)field12751, "CrystalModifier.instance.outsideFadeOutDelay2");
                class360.Method1793(field12751.Method369());
            }
        }
        else {
            super.render(entity, n, n2, n3, n4, n5, n6);
        }
    }
    
    private final ModelRenderer getInsideBox() {
        final Class44 field12769 = Class1075.Field12739.Field12769;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12769, "CrystalModifier.instance.insideCube");
        final Enum method341 = field12769.Method341();
        if (method341 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.render.CrystalModifier.CubeModes");
        }
        final Class2037 class2037 = (Class2037)method341;
        final Class44 field12770 = Class1075.Field12739.Field12770;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12770, "CrystalModifier.instance.insideModel");
        final Enum method342 = field12770.Method341();
        if (method342 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.render.CrystalModifier.ModelModes");
        }
        return this.getRenderer(class2037, (Class645)method342);
    }
    
    private final ModelRenderer getOutsideBox() {
        final Class44 field12775 = Class1075.Field12739.Field12775;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12775, "CrystalModifier.instance.outsideCube");
        final Enum method341 = field12775.Method341();
        if (method341 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.render.CrystalModifier.CubeModes");
        }
        final Class2037 class2037 = (Class2037)method341;
        final Class44 field12776 = Class1075.Field12739.Field12776;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12776, "CrystalModifier.instance.outsideModel");
        final Enum method342 = field12776.Method341();
        if (method342 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.render.CrystalModifier.ModelModes");
        }
        return this.getRenderer(class2037, (Class645)method342);
    }
    
    private final ModelRenderer getOutsideBox2() {
        final Class44 field12781 = Class1075.Field12739.Field12781;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12781, "CrystalModifier.instance.outsideCube2");
        final Enum method341 = field12781.Method341();
        if (method341 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.render.CrystalModifier.CubeModes");
        }
        final Class2037 class2037 = (Class2037)method341;
        final Class44 field12782 = Class1075.Field12739.Field12782;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12782, "CrystalModifier.instance.outsideModel2");
        final Enum method342 = field12782.Method341();
        if (method342 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.render.CrystalModifier.ModelModes");
        }
        return this.getRenderer(class2037, (Class645)method342);
    }
    
    private final void drawCube(final ModelRenderer modelRenderer, final int n, final float n2) {
        final Class44 field12746 = Class1075.Field12739.Field12746;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12746, "CrystalModifier.instance.rubiksCrystal");
        if (field12746.Method365()) {
            boolean b;
            if (n == 2) {
                final Class44 field12747 = Class1075.Field12739.Field12750;
                Intrinsics.checkExpressionValueIsNotNull((Object)field12747, "CrystalModifier.instance.rubiksCrystalOutside");
                b = field12747.Method365();
            }
            else if (n == 3) {
                final Class44 field12748 = Class1075.Field12739.Field12751;
                Intrinsics.checkExpressionValueIsNotNull((Object)field12748, "CrystalModifier.instance.rubiksCrystalOutside2");
                b = field12748.Method365();
            }
            else {
                final Class44 field12749 = Class1075.Field12739.Field12749;
                Intrinsics.checkExpressionValueIsNotNull((Object)field12749, "CrystalModifier.instance.rubiksCrystalInside");
                b = field12749.Method365();
            }
            if (b) {
                this.drawRubiksBox(modelRenderer, n2);
                return;
            }
        }
        modelRenderer.render(n2);
    }
    
    private final void drawRubiksBox(final ModelRenderer modelRenderer, final float n) {
        final Class44 field12746 = Class1075.Field12739.Field12746;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12746, "CrystalModifier.instance.rubiksCrystal");
        if (!field12746.Method365()) {
            modelRenderer.render(n);
            return;
        }
        GlStateManager.scale(Double.longBitsToDouble((long)2144993710 ^ 0x3FD99999E6439834L), Double.longBitsToDouble(4600877379321698714L), Double.longBitsToDouble(4600877379321698714L));
        final float n2 = n * (float)Double.longBitsToDouble(4605380978949069210L);
        if (System.currentTimeMillis() - 400 > Class1075.Field12741) {
            final int[] array = Class501.Field10084[Class1075.Field12740];
            final Quaternion[] array2 = { Class501.Field10082[array[0]], Class501.Field10082[array[1]], Class501.Field10082[array[2]], Class501.Field10082[array[3]], Class501.Field10082[array[4]], Class501.Field10082[array[5]], Class501.Field10082[array[6]], Class501.Field10082[array[7]], Class501.Field10082[array[8]] };
            final Class44 field12747 = Class1075.Field12739.Field12747;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12747, "CrystalModifier.instance\u2026sCrystalRotationDirection");
            if (field12747.Method341() == Class1478.Field14890) {
                Class501.Field10082[array[0]] = array2[6];
                Class501.Field10082[array[1]] = array2[3];
                Class501.Field10082[array[2]] = array2[0];
                Class501.Field10082[array[3]] = array2[7];
                Class501.Field10082[array[4]] = array2[4];
                Class501.Field10082[array[5]] = array2[1];
                Class501.Field10082[array[6]] = array2[8];
                Class501.Field10082[array[7]] = array2[5];
                Class501.Field10082[array[8]] = array2[2];
            }
            else {
                final Class44 field12748 = Class1075.Field12739.Field12747;
                Intrinsics.checkExpressionValueIsNotNull((Object)field12748, "CrystalModifier.instance\u2026sCrystalRotationDirection");
                if (field12748.Method341() == Class1478.Field14891) {
                    Class501.Field10082[array[0]] = array2[2];
                    Class501.Field10082[array[1]] = array2[5];
                    Class501.Field10082[array[2]] = array2[8];
                    Class501.Field10082[array[3]] = array2[1];
                    Class501.Field10082[array[4]] = array2[4];
                    Class501.Field10082[array[5]] = array2[7];
                    Class501.Field10082[array[6]] = array2[0];
                    Class501.Field10082[array[7]] = array2[3];
                    Class501.Field10082[array[8]] = array2[6];
                }
            }
            final int[] array3 = Class501.Field10085[Class1075.Field12740];
            final int n3 = -1;
            final int n4 = -1;
            int n5 = -1;
            while (true) {
                Class501.Method2302(n3, n4, n5, array3[0], array3[1], array3[2]);
                ++n5;
            }
        }
        else {
            final int n6 = -1;
            final int n7 = -1;
            int n8 = -1;
            while (true) {
                Class501.Method2300(modelRenderer, n2, n6, n7, n8);
                ++n8;
            }
        }
    }
    
    private final ModelRenderer getRenderer(final Class2037 class2037, final Class645 class2038) {
        ModelRenderer modelRenderer = null;
        switch (Class1983.Field17123[class2037.ordinal()]) {
            case 1: {
                modelRenderer = ((class2038 == Class645.Field10783) ? this.Field16759 : this.Field16760);
                break;
            }
            case 2: {
                modelRenderer = ((class2038 == Class645.Field10783) ? this.Field16761 : this.Field16762);
                break;
            }
            case 3: {
                modelRenderer = null;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return modelRenderer;
    }
    
    private final boolean needToRenderBase() {
        final Class44 field12764 = Class1075.Field12739.Field12764;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12764, "CrystalModifier.instance.base");
        boolean b;
        if (field12764.Method365()) {
            final Class44 field12765 = Class1075.Field12739.Field12766;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12765, "CrystalModifier.instance.alwaysBase");
            b = (field12765.Method365() || this.Field16764);
        }
        else {
            b = false;
        }
        return b;
    }
    
    private final double getTranslateX() {
        final Class44 field12758 = Class1075.Field12739.Field12758;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12758, "CrystalModifier.instance.translate");
        double method367;
        if (field12758.Method365()) {
            final Class44 field12759 = Class1075.Field12739.Field12759;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12759, "CrystalModifier.instance.translateX");
            method367 = field12759.Method367();
        }
        else {
            method367 = 0.0;
        }
        return method367;
    }
    
    private final double getTranslateY() {
        final Class44 field12758 = Class1075.Field12739.Field12758;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12758, "CrystalModifier.instance.translate");
        double method367;
        if (field12758.Method365()) {
            final Class44 field12759 = Class1075.Field12739.Field12760;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12759, "CrystalModifier.instance.translateY");
            method367 = field12759.Method367();
        }
        else {
            method367 = 0.0;
        }
        return method367;
    }
    
    private final double getTranslateZ() {
        final Class44 field12758 = Class1075.Field12739.Field12758;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12758, "CrystalModifier.instance.translate");
        double method367;
        if (field12758.Method365()) {
            final Class44 field12759 = Class1075.Field12739.Field12761;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12759, "CrystalModifier.instance.translateZ");
            method367 = field12759.Method367();
        }
        else {
            method367 = 0.0;
        }
        return method367;
    }
    
    private final double getScaleX() {
        final Class44 field12753 = Class1075.Field12739.Field12753;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12753, "CrystalModifier.instance.scale");
        double method367;
        if (field12753.Method365()) {
            final Class44 field12754 = Class1075.Field12739.Field12754;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12754, "CrystalModifier.instance.scaleX");
            method367 = field12754.Method367();
        }
        else {
            method367 = 1.0;
        }
        return method367;
    }
    
    private final double getScaleY() {
        final Class44 field12753 = Class1075.Field12739.Field12753;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12753, "CrystalModifier.instance.scale");
        double method367;
        if (field12753.Method365()) {
            final Class44 field12754 = Class1075.Field12739.Field12755;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12754, "CrystalModifier.instance.scaleY");
            method367 = field12754.Method367();
        }
        else {
            method367 = 1.0;
        }
        return method367;
    }
    
    private final double getScaleZ() {
        final Class44 field12753 = Class1075.Field12739.Field12753;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12753, "CrystalModifier.instance.scale");
        double method367;
        if (field12753.Method365()) {
            final Class44 field12754 = Class1075.Field12739.Field12756;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12754, "CrystalModifier.instance.scaleZ");
            method367 = field12754.Method367();
        }
        else {
            method367 = 1.0;
        }
        return method367;
    }
    
    private final double getScaleModifier(final int i, final int n) {
        double n2 = 0.0;
        if (Class1075.Field12744.containsKey(i)) {
            switch (n) {
                case 0: {
                    final Class44 field12765 = Class1075.Field12739.Field12765;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field12765, "CrystalModifier.instance.baseFadeOutDelay");
                    if (field12765.Method335() == 0) {
                        n2 = 1.0;
                        break;
                    }
                    final List<Object> value = Class1075.Field12744.get(i);
                    if (value == null) {
                        Intrinsics.throwNpe();
                    }
                    final Object value2 = value.get(0);
                    if (value2 == null) {
                        Intrinsics.throwNpe();
                    }
                    n2 = ((Class357)value2).Method1796();
                    break;
                }
                case 1: {
                    final Class44 field12766 = Class1075.Field12739.Field12773;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field12766, "CrystalModifier.instance.insideFadeOutDelay");
                    if (field12766.Method335() == 0) {
                        n2 = 1.0;
                        break;
                    }
                    final List<Object> value3 = Class1075.Field12744.get(i);
                    if (value3 == null) {
                        Intrinsics.throwNpe();
                    }
                    final Object value4 = value3.get(1);
                    if (value4 == null) {
                        Intrinsics.throwNpe();
                    }
                    n2 = ((Class357)value4).Method1796();
                    break;
                }
                case 2: {
                    final Class44 field12767 = Class1075.Field12739.Field12779;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field12767, "CrystalModifier.instance.outsideFadeOutDelay");
                    if (field12767.Method335() == 0) {
                        n2 = 1.0;
                        break;
                    }
                    final List<Object> value5 = Class1075.Field12744.get(i);
                    if (value5 == null) {
                        Intrinsics.throwNpe();
                    }
                    final Object value6 = value5.get(2);
                    if (value6 == null) {
                        Intrinsics.throwNpe();
                    }
                    n2 = ((Class357)value6).Method1796();
                    break;
                }
                case 3: {
                    final Class44 field12768 = Class1075.Field12739.Field12785;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field12768, "CrystalModifier.instance.outsideFadeOutDelay2");
                    if (field12768.Method335() == 0) {
                        n2 = 1.0;
                        break;
                    }
                    final List<Object> value7 = Class1075.Field12744.get(i);
                    if (value7 == null) {
                        Intrinsics.throwNpe();
                    }
                    final Object value8 = value7.get(3);
                    if (value8 == null) {
                        Intrinsics.throwNpe();
                    }
                    n2 = ((Class357)value8).Method1796();
                    break;
                }
                default: {
                    n2 = 1.0;
                    break;
                }
            }
        }
        else {
            n2 = 1.0;
        }
        return n2;
    }
    
    public Class1904(final boolean field16764) {
        super(0.0f, field16764);
        this.Field16764 = field16764;
        this.Field16759 = new ModelRenderer((ModelBase)this, "cube").setTextureOffset(32, 0).addBox(Float.intBitsToFloat(-1065353216), Float.intBitsToFloat(-1065353216), Float.intBitsToFloat(-1065353216), 8, 8, 8);
        this.Field16760 = new ModelRenderer((ModelBase)this, "glass").setTextureOffset(32, 0).addBox(Float.intBitsToFloat(-1065353216), Float.intBitsToFloat(-1065353216), Float.intBitsToFloat(-1065353216), 8, 8, 8);
        this.Field16761 = new ModelRenderer((ModelBase)this, "cube").setTextureOffset(0, 0).addBox(Float.intBitsToFloat(-1065353216), Float.intBitsToFloat(-1065353216), Float.intBitsToFloat(-1065353216), 8, 8, 8);
        this.Field16762 = new ModelRenderer((ModelBase)this, "glass").setTextureOffset(0, 0).addBox(Float.intBitsToFloat(-1065353216), Float.intBitsToFloat(-1065353216), Float.intBitsToFloat(-1065353216), 8, 8, 8);
        this.Field16763 = new ModelRenderer((ModelBase)this, "base").setTextureOffset(0, 16).addBox(Float.intBitsToFloat(-1061158912), 0.0f, Float.intBitsToFloat(-1061158912), 12, 4, 12);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x76AB ^ 0x9A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
