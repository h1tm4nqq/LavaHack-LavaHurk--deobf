//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.awt.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.player.*;
import com.kisman.cc.util.*;
import kotlin.ranges.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0002JF\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aJ\u001a\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002JX\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0006j\b\u0012\u0004\u0012\u00020\f`\b2\u0006\u0010\"\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0002J\u0006\u0010-\u001a\u00020\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004?\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0006j\b\u0012\u0004\u0012\u00020\f`\bX\u0082\u0004?\u0006\u0002\n\u0000?\u0006." }, d2 = { "Lcom/kisman/cc/settings/util/CharmsRewriteRendererPattern;", "", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "groups", "Ljava/util/ArrayList;", "Lcom/kisman/cc/settings/types/SettingGroup;", "Lkotlin/collections/ArrayList;", "getModule", "()Lcom/kisman/cc/features/module/Module;", "settings", "Lcom/kisman/cc/settings/CharmsRewriteSetting;", "doOptions", "", "entity", "Lnet/minecraft/entity/Entity;", "end", "", "mode", "Lcom/kisman/cc/util/enums/CharmsRewriteTypeModes;", "exclude", "doRender", "model", "Lnet/minecraft/client/model/ModelBase;", "limbSwing", "", "limbSwingAmount", "ageInTicks", "netHeadYaw", "headPitch", "scale", "getSettingByType", "Lcom/kisman/cc/settings/Setting;", "type", "Lcom/kisman/cc/util/enums/CharmsRewriteTypes;", "getSettingsByType", "Lcom/kisman/cc/util/enums/CharmsRewriteEntityTypes;", "group", "wireGroup", "modelGroup", "wireColorGroup", "modelColorGroup", "wireCrowdAlphaGroup", "modelCrowdAlphaGroup", "init", "kisman.cc" })
public final class Class1186
{
    private final ArrayList Field13376;
    private final ArrayList Field13377;
    @NotNull
    private final Class42 Field13378;
    private String Field13379 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class1186 Method4772() {
        final Iterator<Class1580> iterator = this.Field13377.iterator();
        while (iterator.hasNext()) {
            this.Field13378.Method23(iterator.next().Method6219());
        }
        final Iterator<Class1996> iterator2 = this.Field13376.iterator();
        while (iterator2.hasNext()) {
            this.Field13378.Method24(iterator2.next());
        }
        return this;
    }
    
    private final ArrayList Method4773(final Class549 class549, final Class1996 class550, final Class1996 class551, final Class1996 class552, final Class1996 class553, final Class1996 class554, final Class1996 class555, final Class1996 class556) {
        final ArrayList<Class1580> list = new ArrayList<Class1580>();
        final Class44 method355 = new Class44(class549.name() + " Mode", this.Field13378, Class431.Field9797).Method355("Mode");
        Intrinsics.checkExpressionValueIsNotNull((Object)method355, "Setting(\"${type.name} Mo\u2026es.None).setTitle(\"Mode\")");
        list.add(new Class1580(class550.Method7405(method355), class549, Class162.Field8648));
        final ArrayList<Class1580> list2 = list;
        final Class44 method356 = new Class44(class549.name() + " Width", this.Field13378, 1.0, Double.longBitsToDouble((long)2116074244 ^ 0x3FB99999E7B9229EL), Double.longBitsToDouble(4617315517961601024L), false).Method355("Width");
        Intrinsics.checkExpressionValueIsNotNull((Object)method356, "Setting(\"${type.name} Wi\u2026 false).setTitle(\"Width\")");
        list2.add(new Class1580(class550.Method7405(method356), class549, Class162.Field8649));
        for (final Class362 class557 : Class362.values()) {
            final ArrayList<Class1580> list3 = list;
            final Class44 method357 = new Class44(class549.name() + " Wire " + class557.name(), this.Field13378, false).Method355(class557.name());
            Intrinsics.checkExpressionValueIsNotNull((Object)method357, "Setting(\"${type.name} Wi\u2026se).setTitle(option.name)");
            list3.add(new Class1580(class551.Method7405(method357), class549, class557.Method1811(), class557));
        }
        final ArrayList<Class1580> list4 = list;
        final Class44 method358 = new Class44(class549.name() + " Wire Crowd Alpha", this.Field13378, 1.0, Double.longBitsToDouble(4591870180066957722L), 1.0, false).Method355("Alpha");
        Intrinsics.checkExpressionValueIsNotNull((Object)method358, "Setting(\"${type.name} Wi\u2026 false).setTitle(\"Alpha\")");
        list4.add(new Class1580(class555.Method7405(method358), class549, Class162.Field8657));
        final ArrayList<Class1580> list5 = list;
        final Class44 method359 = new Class44(class549.name() + " Wire Crowd Alpha Range", this.Field13378, Double.longBitsToDouble(4621819117588971520L), 1.0, Double.longBitsToDouble(4626322717216342016L), false).Method355("Range");
        Intrinsics.checkExpressionValueIsNotNull((Object)method359, "Setting(\"${type.name} Wi\u2026 false).setTitle(\"Range\")");
        list5.add(new Class1580(class555.Method7405(method359), class549, Class162.Field8658));
        final ArrayList<Class1580> list6 = list;
        final Class44 method360 = new Class44(class549.name() + " Wire Custom Color", this.Field13378, false).Method355("Custom");
        Intrinsics.checkExpressionValueIsNotNull((Object)method360, "Setting(\"${type.name} Wi\u2026false).setTitle(\"Custom\")");
        list6.add(new Class1580(class553.Method7405(method360), class549, Class162.Field8659));
        final ArrayList<Class1580> list7 = list;
        final Class44 method361 = new Class44(class549.name() + " Wire Color", this.Field13378, new Class2027(255, 255, 255, 255)).Method355("Custom");
        Intrinsics.checkExpressionValueIsNotNull((Object)method361, "Setting(\"${type.name} Wi\u2026 255)).setTitle(\"Custom\")");
        list7.add(new Class1580(class553.Method7405(method361), class549, Class162.Field8660));
        if (class549 == Class549.Field10328) {
            final ArrayList<Class1580> list8 = list;
            final Class44 method362 = new Class44(class549.name() + " Wire Friend Color", this.Field13378, new Class2027(Color.CYAN)).Method355("Friend");
            Intrinsics.checkExpressionValueIsNotNull((Object)method362, "Setting(\"${type.name} Wi\u2026CYAN)).setTitle(\"Friend\")");
            list8.add(new Class1580(class553.Method7405(method362), class549, Class162.Field8661));
        }
        for (final Class362 class558 : Class362.values()) {
            final ArrayList<Class1580> list9 = list;
            final Class44 method363 = new Class44(class549.name() + " Model " + class558.name(), this.Field13378, false).Method355(class558.name());
            Intrinsics.checkExpressionValueIsNotNull((Object)method363, "Setting(\"${type.name} Mo\u2026se).setTitle(option.name)");
            list9.add(new Class1580(class552.Method7405(method363), class549, class558.Method1812(), class558));
        }
        final ArrayList<Class1580> list10 = list;
        final Class44 method364 = new Class44(class549.name() + " Model Crowd Alpha", this.Field13378, 1.0, Double.longBitsToDouble((long)1177111509 ^ 0x3FB99999DFB0D24FL), 1.0, false).Method355("Crowd Alpha");
        Intrinsics.checkExpressionValueIsNotNull((Object)method364, "Setting(\"${type.name} Mo\u2026).setTitle(\"Crowd Alpha\")");
        list10.add(new Class1580(class556.Method7405(method364), class549, Class162.Field8668));
        final ArrayList<Class1580> list11 = list;
        final Class44 method365 = new Class44(class549.name() + " Model Crowd Alpha Range", this.Field13378, Double.longBitsToDouble(4621819117588971520L), 1.0, Double.longBitsToDouble((long)1371738312 ^ 0x4034000051C310C8L), false).Method355("Range");
        Intrinsics.checkExpressionValueIsNotNull((Object)method365, "Setting(\"${type.name} Mo\u2026 false).setTitle(\"Range\")");
        list11.add(new Class1580(class556.Method7405(method365), class549, Class162.Field8669));
        final ArrayList<Class1580> list12 = list;
        final Class44 method366 = new Class44(class549.name() + " Model Custom Color", this.Field13378, false).Method355("Custom");
        Intrinsics.checkExpressionValueIsNotNull((Object)method366, "Setting(\"${type.name} Mo\u2026false).setTitle(\"Custom\")");
        list12.add(new Class1580(class554.Method7405(method366), class549, Class162.Field8670));
        final ArrayList<Class1580> list13 = list;
        final Class44 method367 = new Class44(class549.name() + " Model Color", this.Field13378, new Class2027(255, 255, 255, 255)).Method355("Custom");
        Intrinsics.checkExpressionValueIsNotNull((Object)method367, "Setting(\"${type.name} Mo\u2026 255)).setTitle(\"Custom\")");
        list13.add(new Class1580(class554.Method7405(method367), class549, Class162.Field8671));
        if (class549 == Class549.Field10328) {
            final ArrayList<Class1580> list14 = list;
            final Class44 method368 = new Class44(class549.name() + " Model Friend Color", this.Field13378, new Class2027(Color.CYAN)).Method355("Friend");
            Intrinsics.checkExpressionValueIsNotNull((Object)method368, "Setting(\"${type.name} Mo\u2026CYAN)).setTitle(\"Friend\")");
            list14.add(new Class1580(class554.Method7405(method368), class549, Class162.Field8672));
        }
        final ArrayList<Class1580> list15 = list;
        final Class44 method369 = new Class44(class549.name() + " No Hurt", this.Field13378, false).Method355("No Hurt");
        Intrinsics.checkExpressionValueIsNotNull((Object)method369, "Setting(\"${type.name} No\u2026alse).setTitle(\"No Hurt\")");
        list15.add(new Class1580(class550.Method7405(method369), class549, Class162.Field8650));
        return list;
    }
    
    private final Class44 Method4774(final Class162 class162, final Entity entity) {
        for (final Class1580 class163 : this.Field13377) {
            if (class163.Method6220() == Class549.Field10334.Method4123(entity) && class163.Method6221() == class162) {
                return class163.Method6219();
            }
        }
        return null;
    }
    
    public final void Method4775(@NotNull @NotNull final Entity entity, @NotNull @NotNull final ModelBase modelBase, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        Intrinsics.checkParameterIsNotNull((Object)entity, "entity");
        Intrinsics.checkParameterIsNotNull((Object)modelBase, "model");
        if (Class549.Field10334.Method4123(entity) != null) {
            final Class44 method4774 = this.Method4774(Class162.Field8648, entity);
            if (((method4774 != null) ? method4774.Method341() : null) != Class431.Field9797) {
                if (entity instanceof EntityLivingBase) {
                    final Class44 method4775 = this.Method4774(Class162.Field8650, entity);
                    if (method4775 != null) {
                        if (method4775.Method365()) {
                            ((EntityLivingBase)entity).hurtTime = 0;
                        }
                    }
                }
                GL11.glPushMatrix();
                GL11.glPushAttrib(1048575);
                Class263 class263 = Class263.Field9168;
                final Class44 method4776 = this.Method4774(Class162.Field8648, entity);
                if (((method4776 != null) ? method4776.Method341() : null) == Class431.Field9799) {
                    class263 = Class263.Field9167;
                }
                this.Method4776(entity, false, class263, false);
                if (class263 == Class263.Field9167) {
                    GL11.glPolygonMode(1032, 6913);
                }
                GL11.glEnable(2848);
                GL11.glHint(3154, 4354);
                final Class44 method4777 = this.Method4774(Class162.Field8649, entity);
                final Float n7 = (method4777 != null) ? Float.valueOf(method4777.Method368()) : null;
                if (n7 == null) {
                    Intrinsics.throwNpe();
                }
                GL11.glLineWidth((float)n7);
                modelBase.render(entity, n, n2, n3, n4, n5, n6);
                this.Method4776(entity, true, class263, false);
                Class263 class264 = Class263.Field9168;
                final Class44 method4778 = this.Method4774(Class162.Field8648, entity);
                if (((method4778 != null) ? method4778.Method341() : null) == Class431.Field9800) {
                    class264 = Class263.Field9167;
                }
                this.Method4776(entity, false, class264, false);
                if (class264 == Class263.Field9167) {
                    GL11.glPolygonMode(1032, 6913);
                }
                modelBase.render(entity, n, n2, n3, n4, n5, n6);
                this.Method4776(entity, true, class264, false);
                GL11.glPopAttrib();
                GL11.glPopMatrix();
                return;
            }
        }
        modelBase.render(entity, n, n2, n3, n4, n5, n6);
    }
    
    private final void Method4776(final Entity entity, final boolean b, final Class263 class263, final boolean b2) {
        for (final Class1580 class264 : this.Field13377) {
            if (class264.Method6222() != null) {
                if (b2) {
                    if (class264.Method6221().Method1055() != class263) {
                        continue;
                    }
                    continue;
                }
                else {
                    if (class264.Method6221().Method1055() == class263) {
                        continue;
                    }
                    continue;
                }
            }
        }
        if (!b) {
            final Class44 method4774 = this.Method4774((class263 == Class263.Field9167) ? Class162.Field8659 : Class162.Field8670, entity);
            final Boolean b3 = (method4774 != null) ? Boolean.valueOf(method4774.Method365()) : null;
            if (b3 == null) {
                Intrinsics.throwNpe();
            }
            if (b3) {
                final Class44 method4775 = this.Method4774((class263 == Class263.Field9167) ? Class162.Field8657 : Class162.Field8668, entity);
                final Double n = (method4775 != null) ? Double.valueOf(method4775.Method367()) : null;
                if (n == null) {
                    Intrinsics.throwNpe();
                }
                double n3;
                if (n != 1.0) {
                    final double getDistanceSq = Class2142.Field17803.player.getDistanceSq(entity);
                    final Class44 method4776 = this.Method4774((class263 == Class263.Field9167) ? Class162.Field8658 : Class162.Field8669, entity);
                    final Double n2 = (method4776 != null) ? Double.valueOf(method4776.Method367()) : null;
                    if (n2 == null) {
                        Intrinsics.throwNpe();
                    }
                    n3 = getDistanceSq / n2;
                }
                else {
                    n3 = 1.0;
                }
                final double n4 = n3;
                final Class44 method4777 = this.Method4774((class263 == Class263.Field9167) ? ((entity instanceof EntityPlayer && Class726.Field11086.Method3042((EntityPlayer)entity)) ? Class162.Field8661 : Class162.Field8660) : ((entity instanceof EntityPlayer && Class726.Field11086.Method3042((EntityPlayer)entity)) ? Class162.Field8672 : Class162.Field8671), entity);
                final Class2027 class265 = (Class2027)Class886.Method3714((Object)((method4777 != null) ? method4777.Method339() : null));
                if (class265 != null) {
                    final Class2027 class267;
                    final Class2027 class266 = class267 = class265;
                    class267.Method3613(RangesKt.coerceIn((int)(class267.Method3631() * n4), 0, 255));
                    final Class2027 class268 = class266;
                    if (class268 != null) {
                        class268.Method3632();
                    }
                }
            }
        }
        else {
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
    }
    
    @NotNull
    @NotNull
    public final Class42 Method4777() {
        return this.Field13378;
    }
    
    public Class1186(@NotNull @NotNull final Class42 field13378) {
        Intrinsics.checkParameterIsNotNull((Object)field13378, "module");
        this.Field13378 = field13378;
        this.Field13376 = new ArrayList();
        this.Field13377 = new ArrayList();
        for (final Class549 class549 : Class549.values()) {
            final Class1996 e = new Class1996(new Class44(class549.name(), this.Field13378));
            final Class1996 method7406 = e.Method7406(new Class1996(new Class44("Wire", this.Field13378)));
            final Class1996 method7407 = e.Method7406(new Class1996(new Class44("Model", this.Field13378)));
            final Class1996 method7408 = method7406.Method7406(new Class1996(new Class44("Color", this.Field13378)));
            final Class1996 method7409 = method7407.Method7406(new Class1996(new Class44("Color", this.Field13378)));
            final Class1996 method7410 = method7406.Method7406(new Class1996(new Class44("Crowd", this.Field13378)));
            final Class1996 method7411 = method7407.Method7406(new Class1996(new Class44("Crowd", this.Field13378)));
            this.Field13376.add(e);
            this.Field13376.add(method7406);
            this.Field13376.add(method7407);
            this.Field13377.addAll(this.Method4773(class549, e, method7406, method7407, method7408, method7409, method7410, method7411));
        }
    }
    
    private static String Method4778(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x519D ^ 0x1F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
