//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.ranges.RangesKt
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import com.kisman.cc.util.Class2142;
import com.kisman.cc.util.Class886;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import lavahack.client.Class1580;
import lavahack.client.Class162;
import lavahack.client.Class1996;
import lavahack.client.Class263;
import lavahack.client.Class362;
import lavahack.client.Class42;
import lavahack.client.Class431;
import lavahack.client.Class44;
import lavahack.client.Class549;
import lavahack.client.Class726;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0002JF\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aJ\u001a\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002JX\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0006j\b\u0012\u0004\u0012\u00020\f`\b2\u0006\u0010\"\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0002J\u0006\u0010-\u001a\u00020\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0006j\b\u0012\u0004\u0012\u00020\f`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2={"Lcom/kisman/cc/settings/util/CharmsRewriteRendererPattern;", "", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "groups", "Ljava/util/ArrayList;", "Lcom/kisman/cc/settings/types/SettingGroup;", "Lkotlin/collections/ArrayList;", "getModule", "()Lcom/kisman/cc/features/module/Module;", "settings", "Lcom/kisman/cc/settings/CharmsRewriteSetting;", "doOptions", "", "entity", "Lnet/minecraft/entity/Entity;", "end", "", "mode", "Lcom/kisman/cc/util/enums/CharmsRewriteTypeModes;", "exclude", "doRender", "model", "Lnet/minecraft/client/model/ModelBase;", "limbSwing", "", "limbSwingAmount", "ageInTicks", "netHeadYaw", "headPitch", "scale", "getSettingByType", "Lcom/kisman/cc/settings/Setting;", "type", "Lcom/kisman/cc/util/enums/CharmsRewriteTypes;", "getSettingsByType", "Lcom/kisman/cc/util/enums/CharmsRewriteEntityTypes;", "group", "wireGroup", "modelGroup", "wireColorGroup", "modelColorGroup", "wireCrowdAlphaGroup", "modelCrowdAlphaGroup", "init", "kisman.cc"})
public final class Class1186 {
    private final ArrayList Field13376;
    private final ArrayList Field13377;
    @NotNull
    private final Class42 Field13378;
    private String Field13379 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Class1186 Method4772() {
        for (Object object : this.Field13377) {
            this.Field13378.Method23(((Class1580)object).Method6219());
        }
        Iterator iterator = this.Field13376.iterator();
        while (iterator.hasNext()) {
            Object object;
            object = (Class1996)iterator.next();
            this.Field13378.Method24((Class1996)object);
        }
        return this;
    }

    private final ArrayList Method4773(Class549 class549, Class1996 class1996, Class1996 class19962, Class1996 class19963, Class1996 class19964, Class1996 class19965, Class1996 class19966, Class1996 class19967) {
        ArrayList<Class1580> arrayList = new ArrayList<Class1580>();
        Class44 class44 = new Class44(class549.name() + " Mode", this.Field13378, Class431.Field9797).Method355("Mode");
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Setting(\"${type.name} Mo\u2026es.None).setTitle(\"Mode\")");
        Class44 class442 = class1996.Method7405(class44);
        arrayList.add(new Class1580(class442, class549, Class162.Field8648));
        Class44 class443 = new Class44(class549.name() + " Width", this.Field13378, 1.0, Double.longBitsToDouble((long)2116074244 ^ 0x3FB99999E7B9229EL), Double.longBitsToDouble(0x4014000000000000L), false).Method355("Width");
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"Setting(\"${type.name} Wi\u2026 false).setTitle(\"Width\")");
        arrayList.add(new Class1580(class1996.Method7405(class443), class549, Class162.Field8649));
        for (Class362 class362 : Class362.values()) {
            Class44 class444 = new Class44(class549.name() + " Wire " + class362.name(), this.Field13378, false).Method355(class362.name());
            Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"Setting(\"${type.name} Wi\u2026se).setTitle(option.name)");
            arrayList.add(new Class1580(class19962.Method7405(class444), class549, class362.Method1811(), class362));
        }
        Class44 class445 = new Class44(class549.name() + " Wire Crowd Alpha", this.Field13378, 1.0, Double.longBitsToDouble(4591870180066957722L), 1.0, false).Method355("Alpha");
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"Setting(\"${type.name} Wi\u2026 false).setTitle(\"Alpha\")");
        arrayList.add(new Class1580(class19966.Method7405(class445), class549, Class162.Field8657));
        Class44 class446 = new Class44(class549.name() + " Wire Crowd Alpha Range", this.Field13378, Double.longBitsToDouble(0x4024000000000000L), 1.0, Double.longBitsToDouble(0x4034000000000000L), false).Method355("Range");
        Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"Setting(\"${type.name} Wi\u2026 false).setTitle(\"Range\")");
        arrayList.add(new Class1580(class19966.Method7405(class446), class549, Class162.Field8658));
        Class44 class447 = new Class44(class549.name() + " Wire Custom Color", this.Field13378, false).Method355("Custom");
        Intrinsics.checkExpressionValueIsNotNull((Object)class447, (String)"Setting(\"${type.name} Wi\u2026false).setTitle(\"Custom\")");
        arrayList.add(new Class1580(class19964.Method7405(class447), class549, Class162.Field8659));
        Class44 class448 = new Class44(class549.name() + " Wire Color", this.Field13378, new Class2027(255, 255, 255, 255)).Method355("Custom");
        Intrinsics.checkExpressionValueIsNotNull((Object)class448, (String)"Setting(\"${type.name} Wi\u2026 255)).setTitle(\"Custom\")");
        arrayList.add(new Class1580(class19964.Method7405(class448), class549, Class162.Field8660));
        if (class549 == Class549.Field10328) {
            Class44 class449 = new Class44(class549.name() + " Wire Friend Color", this.Field13378, new Class2027(Color.CYAN)).Method355("Friend");
            Intrinsics.checkExpressionValueIsNotNull((Object)class449, (String)"Setting(\"${type.name} Wi\u2026CYAN)).setTitle(\"Friend\")");
            arrayList.add(new Class1580(class19964.Method7405(class449), class549, Class162.Field8661));
        }
        for (Class362 class362 : Class362.values()) {
            Class44 class4410 = new Class44(class549.name() + " Model " + class362.name(), this.Field13378, false).Method355(class362.name());
            Intrinsics.checkExpressionValueIsNotNull((Object)class4410, (String)"Setting(\"${type.name} Mo\u2026se).setTitle(option.name)");
            arrayList.add(new Class1580(class19963.Method7405(class4410), class549, class362.Method1812(), class362));
        }
        Class44 class4411 = new Class44(class549.name() + " Model Crowd Alpha", this.Field13378, 1.0, Double.longBitsToDouble((long)1177111509 ^ 0x3FB99999DFB0D24FL), 1.0, false).Method355("Crowd Alpha");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4411, (String)"Setting(\"${type.name} Mo\u2026).setTitle(\"Crowd Alpha\")");
        arrayList.add(new Class1580(class19967.Method7405(class4411), class549, Class162.Field8668));
        Class44 class4412 = new Class44(class549.name() + " Model Crowd Alpha Range", this.Field13378, Double.longBitsToDouble(0x4024000000000000L), 1.0, Double.longBitsToDouble((long)1371738312 ^ 0x4034000051C310C8L), false).Method355("Range");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4412, (String)"Setting(\"${type.name} Mo\u2026 false).setTitle(\"Range\")");
        arrayList.add(new Class1580(class19967.Method7405(class4412), class549, Class162.Field8669));
        Class44 class4413 = new Class44(class549.name() + " Model Custom Color", this.Field13378, false).Method355("Custom");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4413, (String)"Setting(\"${type.name} Mo\u2026false).setTitle(\"Custom\")");
        arrayList.add(new Class1580(class19965.Method7405(class4413), class549, Class162.Field8670));
        Class44 class4414 = new Class44(class549.name() + " Model Color", this.Field13378, new Class2027(255, 255, 255, 255)).Method355("Custom");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4414, (String)"Setting(\"${type.name} Mo\u2026 255)).setTitle(\"Custom\")");
        arrayList.add(new Class1580(class19965.Method7405(class4414), class549, Class162.Field8671));
        if (class549 == Class549.Field10328) {
            Class44 class4415 = new Class44(class549.name() + " Model Friend Color", this.Field13378, new Class2027(Color.CYAN)).Method355("Friend");
            Intrinsics.checkExpressionValueIsNotNull((Object)class4415, (String)"Setting(\"${type.name} Mo\u2026CYAN)).setTitle(\"Friend\")");
            arrayList.add(new Class1580(class19965.Method7405(class4415), class549, Class162.Field8672));
        }
        Class44 class4416 = new Class44(class549.name() + " No Hurt", this.Field13378, false).Method355("No Hurt");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4416, (String)"Setting(\"${type.name} No\u2026alse).setTitle(\"No Hurt\")");
        arrayList.add(new Class1580(class1996.Method7405(class4416), class549, Class162.Field8650));
        return arrayList;
    }

    private final Class44 Method4774(Class162 class162, Entity entity) {
        Class1580 class1580;
        Iterator iterator = this.Field13377.iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while ((class1580 = (Class1580)iterator.next()).Method6220() != Class549.Field10334.Method4123(entity) || class1580.Method6221() != class162);
        return class1580.Method6219();
    }

    public final void Method4775(@NotNull @NotNull Entity entity, @NotNull @NotNull ModelBase modelBase, float f, float f2, float f3, float f4, float f5, float f6) {
        block11: {
            block10: {
                Intrinsics.checkParameterIsNotNull((Object)entity, (String)"entity");
                Intrinsics.checkParameterIsNotNull((Object)modelBase, (String)"model");
                if (Class549.Field10334.Method4123(entity) == null) break block10;
                Class44 class44 = this.Method4774(Class162.Field8648, entity);
                if ((class44 != null ? class44.Method341() : null) != Class431.Field9797) break block11;
            }
            modelBase.render(entity, f, f2, f3, f4, f5, f6);
            return;
        }
        if (entity instanceof EntityLivingBase) {
            Class44 class44 = this.Method4774(Class162.Field8650, entity);
            if (class44 != null && class44.Method365()) {
                ((EntityLivingBase)entity).hurtTime = 0;
            }
        }
        GL11.glPushMatrix();
        GL11.glPushAttrib((int)1048575);
        Class263 class263 = Class263.Field9168;
        Class44 class44 = this.Method4774(Class162.Field8648, entity);
        if ((class44 != null ? class44.Method341() : null) == Class431.Field9799) {
            class263 = Class263.Field9167;
        }
        this.Method4776(entity, false, class263, false);
        if (class263 == Class263.Field9167) {
            GL11.glPolygonMode((int)1032, (int)6913);
        }
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4354);
        Class44 class442 = this.Method4774(Class162.Field8649, entity);
        Float f7 = class442 != null ? Float.valueOf(class442.Method368()) : null;
        if (f7 == null) {
            Intrinsics.throwNpe();
        }
        GL11.glLineWidth((float)f7.floatValue());
        modelBase.render(entity, f, f2, f3, f4, f5, f6);
        this.Method4776(entity, true, class263, false);
        Class263 class2632 = Class263.Field9168;
        Class44 class443 = this.Method4774(Class162.Field8648, entity);
        if ((class443 != null ? class443.Method341() : null) == Class431.Field9800) {
            class2632 = Class263.Field9167;
        }
        this.Method4776(entity, false, class2632, false);
        if (class2632 == Class263.Field9167) {
            GL11.glPolygonMode((int)1032, (int)6913);
        }
        modelBase.render(entity, f, f2, f3, f4, f5, f6);
        this.Method4776(entity, true, class2632, false);
        GL11.glPopAttrib();
        GL11.glPopMatrix();
    }

    private final void Method4776(Entity entity, boolean bl, Class263 class263, boolean bl2) {
        double d;
        double d2;
        for (Class1580 class1580 : this.Field13377) {
            boolean bl3;
            if (class1580.Method6222() == null) continue;
            if (bl2) {
                if (class1580.Method6221().Method1055() != class263) {
                    bl3 = true;
                    continue;
                }
                bl3 = false;
                continue;
            }
            if (class1580.Method6221().Method1055() == class263) {
                bl3 = true;
                continue;
            }
            bl3 = false;
        }
        if (bl) {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            return;
        }
        Class44 class44 = this.Method4774(class263 == Class263.Field9167 ? Class162.Field8659 : Class162.Field8670, entity);
        Boolean bl4 = class44 != null ? Boolean.valueOf(class44.Method365()) : null;
        if (bl4 == null) {
            Intrinsics.throwNpe();
        }
        if (bl4 == false) return;
        Class44 class442 = this.Method4774(class263 == Class263.Field9167 ? Class162.Field8657 : Class162.Field8668, entity);
        Double d3 = class442 != null ? Double.valueOf(class442.Method367()) : null;
        if (d3 == null) {
            Intrinsics.throwNpe();
        }
        if (d3 != 1.0) {
            double d4 = Class2142.Field17803.player.getDistanceSq(entity);
            Class44 class443 = this.Method4774(class263 == Class263.Field9167 ? Class162.Field8658 : Class162.Field8669, entity);
            Double d5 = class443 != null ? Double.valueOf(class443.Method367()) : null;
            if (d5 == null) {
                Intrinsics.throwNpe();
            }
            d2 = d4 / d5;
        } else {
            d2 = d = 1.0;
        }
        Class44 class444 = this.Method4774(class263 == Class263.Field9167 ? (entity instanceof EntityPlayer && Class726.Field11086.Method3042((EntityPlayer)entity) ? Class162.Field8661 : Class162.Field8660) : (entity instanceof EntityPlayer && Class726.Field11086.Method3042((EntityPlayer)entity) ? Class162.Field8672 : Class162.Field8671), entity);
        Class2027 class2027 = (Class2027)Class886.Method3714(class444 != null ? class444.Method339() : null);
        Class2027 class20272 = class2027;
        if (class2027 == null) return;
        Class2027 class20273 = class20272;
        boolean bl5 = false;
        boolean bl6 = false;
        Class2027 class20274 = class20273;
        boolean bl7 = false;
        class20274.Method3613(RangesKt.coerceIn((int)((int)((double)class20274.Method3631() * d)), (int)0, (int)255));
        Class2027 class20275 = class20273;
        class20272 = class20275;
        if (class20275 == null) return;
        class20272.Method3632();
    }

    @NotNull
    @NotNull
    public final Class42 Method4777() {
        return this.Field13378;
    }

    public Class1186(@NotNull @NotNull Class42 class42) {
        Intrinsics.checkParameterIsNotNull((Object)class42, (String)"module");
        this.Field13378 = class42;
        this.Field13376 = new ArrayList();
        this.Field13377 = new ArrayList();
        Class549[] class549Array = Class549.values();
        int n = class549Array.length;
        int n2 = 0;
        while (n2 < n) {
            Class549 class549 = class549Array[n2];
            Class1996 class1996 = new Class1996(new Class44(class549.name(), this.Field13378));
            Class1996 class19962 = class1996.Method7406(new Class1996(new Class44("Wire", this.Field13378)));
            Class1996 class19963 = class1996.Method7406(new Class1996(new Class44("Model", this.Field13378)));
            Class1996 class19964 = class19962.Method7406(new Class1996(new Class44("Color", this.Field13378)));
            Class1996 class19965 = class19963.Method7406(new Class1996(new Class44("Color", this.Field13378)));
            Class1996 class19966 = class19962.Method7406(new Class1996(new Class44("Crowd", this.Field13378)));
            Class1996 class19967 = class19963.Method7406(new Class1996(new Class44("Crowd", this.Field13378)));
            this.Field13376.add(class1996);
            this.Field13376.add(class19962);
            this.Field13376.add(class19963);
            this.Field13377.addAll(this.Method4773(class549, class1996, class19962, class19963, class19964, class19965, class19966, class19967));
            ++n2;
        }
    }

    private static String Method4778(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 31;
            cArray2[n] = (char)(cArray[n] ^ (0x519D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

