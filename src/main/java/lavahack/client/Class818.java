//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.AxisAlignedBB
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1269;
import lavahack.client.Class1363;
import lavahack.client.Class1612;
import lavahack.client.Class1711;
import lavahack.client.Class1745;
import lavahack.client.Class1996;
import lavahack.client.Class2007;
import lavahack.client.Class2145;
import lavahack.client.Class411;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class582;
import lavahack.client.Class815;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001!B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J0\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0006j\b\u0012\u0004\u0012\u00020\u000e`\b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0002J\u0006\u0010\u001f\u001a\u00020\u0012J\u0006\u0010 \u001a\u00020\u0012R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0006j\b\u0012\u0004\u0012\u00020\n`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0006j\b\u0012\u0004\u0012\u00020\u000e`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2={"Lcom/kisman/cc/settings/util/EntityESPRendererPattern;", "", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "entities", "Ljava/util/ArrayList;", "Lnet/minecraft/entity/Entity;", "Lkotlin/collections/ArrayList;", "groups", "Lcom/kisman/cc/settings/types/SettingGroup;", "getModule", "()Lcom/kisman/cc/features/module/Module;", "settings", "Lcom/kisman/cc/settings/EntityESPSetting;", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "draw", "", "ticks", "", "drawEntity", "entity", "getSettingByType", "typeS", "Lcom/kisman/cc/settings/util/EntityESPRendererPattern$SettingTypes;", "typeE", "Lcom/kisman/cc/util/enums/EntityESPTypes;", "getSettingsByType", "group", "patternGroup", "init", "onEnable", "SettingTypes", "kisman.cc"})
public final class Class818 {
    private final ArrayList Field11490;
    private final ArrayList Field11491;
    private final Class411 Field11492;
    private ArrayList Field11493;
    @NotNull
    private final Class42 Field11494;
    private String Field11495 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method3475() {
        for (Object object : this.Field11490) {
            this.Field11494.Method24((Class1996)object);
        }
        Iterator iterator = this.Field11491.iterator();
        while (iterator.hasNext()) {
            Object object;
            object = (Class2145)iterator.next();
            if (((Class2145)object).Method7723() != null) {
                this.Field11494.Method23(((Class2145)object).Method7723());
                continue;
            }
            if (((Class2145)object).Method7724() == null) continue;
            ((Class2145)object).Method7724().Method3789();
        }
    }

    private final ArrayList Method3476(Class1269 class1269, Class1996 class1996, Class1996 class19962) {
        Class44 class44 = new Class44(class1269.name() + " Mode", this.Field11494, Class1745.Field16010);
        Class1612 class1612 = ((Class1612)((Class1612)((Class1612)new Class1612(this.Field11494).Method772(class19962)).Method771(new Class1711(class44))).Method773(class1269.name() + " Cubic")).Method3788();
        Object[] objectArray = new Class2145[3];
        objectArray[0] = new Class2145(class1996.Method7405(class44), null, class1269, Class2007.Field17206);
        Class44 class442 = new Class44(class1269.name() + " Box1 Color", this.Field11494, class1269.name() + " Box1 Color", new Class2027(255, 255, 255, 255)).Method313(new Class1363(class44));
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"Setting(\"${typeE.name} B\u2026 == EntityESPModes.Box1 }");
        objectArray[1] = new Class2145(class1996.Method7405(class442), null, class1269, Class2007.Field17207);
        objectArray[2] = new Class2145(null, class1612, class1269, Class2007.Field17208);
        return new ArrayList(CollectionsKt.listOf((Object[])objectArray));
    }

    public final void Method3477() {
        this.Field11492.Method2004();
    }

    public final void Method3478(float f) {
        Minecraft minecraft = Minecraft.getMinecraft();
        this.Field11492.Method2005(new Class582(this, minecraft));
        Iterator iterator = this.Field11493.iterator();
        while (iterator.hasNext()) {
            Entity entity;
            Entity entity2 = entity = (Entity)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)entity2, (String)"entity");
            this.Method3479(f, entity2);
        }
    }

    private final void Method3479(float f, Entity entity) {
        Class44 class44;
        Class2145 class2145 = this.Method3481(Class2007.Field17206, entity);
        if (class2145 == null) {
            Intrinsics.throwNpe();
        }
        Class44 class442 = class2145.Method7723();
        if (class442 == null) {
            Intrinsics.throwNpe();
        }
        if ((class44 = class442).Method341() == Class1745.Field16010) return;
        Enum enum_ = class44.Method341();
        if (enum_ == Class1745.Field16010) {
            entity.glowing = false;
            return;
        }
        if (enum_ == Class1745.Field16011) {
            entity.glowing = true;
            return;
        }
        if (enum_ == Class1745.Field16012) {
            entity.glowing = false;
            Class2145 class21452 = this.Method3481(Class2007.Field17207, entity);
            if (class21452 == null) {
                Intrinsics.throwNpe();
            }
            Class44 class443 = class21452.Method7723();
            if (class443 == null) {
                Intrinsics.throwNpe();
            }
            Class2027 class2027 = class443.Method339();
            Class815.Method3466(entity, class2027.Field17325, class2027.Field17326, class2027.Field17327, 1.0f, f);
            return;
        }
        if (enum_ != Class1745.Field16013) return;
        entity.glowing = false;
        Class2145 class21453 = this.Method3481(Class2007.Field17208, entity);
        if (class21453 == null) {
            Intrinsics.throwNpe();
        }
        Class1612 class1612 = class21453.Method7724();
        if (class1612 == null) {
            Intrinsics.throwNpe();
        }
        AxisAlignedBB axisAlignedBB = entity.getEntityBoundingBox();
        Intrinsics.checkExpressionValueIsNotNull((Object)axisAlignedBB, (String)"entity.entityBoundingBox");
        class1612.Method3804(axisAlignedBB);
    }

    private final Class2145 Method3480(Class2007 class2007, Class1269 class1269) {
        Class2145 class2145;
        Iterator iterator = this.Field11491.iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while ((class2145 = (Class2145)iterator.next()).Method7725() != class1269 || class2145.Method7726() != class2007);
        return class2145;
    }

    private final Class2145 Method3481(Class2007 class2007, Entity entity) {
        return this.Method3480(class2007, Class1269.Field13736.Method7776(entity));
    }

    @NotNull
    @NotNull
    public final Class42 Method3482() {
        return this.Field11494;
    }

    public Class818(@NotNull @NotNull Class42 class42) {
        Intrinsics.checkParameterIsNotNull((Object)class42, (String)"module");
        this.Field11494 = class42;
        this.Field11490 = new ArrayList();
        this.Field11491 = new ArrayList();
        this.Field11492 = new Class411(this.Field11494);
        this.Field11493 = new ArrayList();
        Class1269[] class1269Array = Class1269.values();
        int n = class1269Array.length;
        int n2 = 0;
        while (n2 < n) {
            Class1269 class1269 = class1269Array[n2];
            Class1996 class1996 = new Class1996(new Class44(class1269.name(), this.Field11494));
            Class1996 class19962 = class1996.Method7406(new Class1996(new Class44("Cubic Renderer", this.Field11494)));
            this.Field11490.add(class1996);
            this.Field11490.add(class19962);
            this.Field11491.addAll(this.Method3476(class1269, class1996, class19962));
            ++n2;
        }
    }

    public static final Class2145 Method3483(Class818 class818, Class2007 class2007, Class1269 class1269) {
        return class818.Method3480(class2007, class1269);
    }

    public static final ArrayList Method3484(Class818 class818) {
        return class818.Field11493;
    }

    public static final void Method3485(Class818 class818, ArrayList arrayList) {
        class818.Field11493 = arrayList;
    }

    private static String Method3486(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 211;
            cArray2[n] = (char)(cArray[n] ^ (0x5857 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

