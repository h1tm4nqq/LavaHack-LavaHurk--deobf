//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.function.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import java.util.*;
import net.minecraft.client.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001!B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J0\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0006j\b\u0012\u0004\u0012\u00020\u000e`\b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0002J\u0006\u0010\u001f\u001a\u00020\u0012J\u0006\u0010 \u001a\u00020\u0012R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e?\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0006j\b\u0012\u0004\u0012\u00020\n`\bX\u0082\u0004?\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0006j\b\u0012\u0004\u0012\u00020\u000e`\bX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\"" }, d2 = { "Lcom/kisman/cc/settings/util/EntityESPRendererPattern;", "", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "entities", "Ljava/util/ArrayList;", "Lnet/minecraft/entity/Entity;", "Lkotlin/collections/ArrayList;", "groups", "Lcom/kisman/cc/settings/types/SettingGroup;", "getModule", "()Lcom/kisman/cc/features/module/Module;", "settings", "Lcom/kisman/cc/settings/EntityESPSetting;", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "draw", "", "ticks", "", "drawEntity", "entity", "getSettingByType", "typeS", "Lcom/kisman/cc/settings/util/EntityESPRendererPattern$SettingTypes;", "typeE", "Lcom/kisman/cc/util/enums/EntityESPTypes;", "getSettingsByType", "group", "patternGroup", "init", "onEnable", "SettingTypes", "kisman.cc" })
public final class Class818
{
    private final ArrayList Field11490;
    private final ArrayList Field11491;
    private final Class411 Field11492;
    private ArrayList Field11493;
    @NotNull
    private final Class42 Field11494;
    private String Field11495 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final void Method3475() {
        final Iterator<Class1996> iterator = this.Field11490.iterator();
        while (iterator.hasNext()) {
            this.Field11494.Method24((Class1996)iterator.next());
        }
        for (final Class2145 class2145 : this.Field11491) {
            if (class2145.Method7723() != null) {
                this.Field11494.Method23(class2145.Method7723());
            }
            else {
                if (class2145.Method7724() == null) {
                    continue;
                }
                class2145.Method7724().Method3789();
            }
        }
    }
    
    private final ArrayList Method3476(final Class1269 class1269, final Class1996 class1270, final Class1996 class1271) {
        final Class44 class1272 = new Class44(class1269.name() + " Mode", this.Field11494, (Enum)Class1745.Field16010);
        final Class1612 method3788 = ((Class1612)((Class1612)((Class1612)new Class1612(this.Field11494).Method772(class1271)).Method771((Supplier)new Class1711(class1272))).Method773(class1269.name() + " Cubic")).Method3788();
        final Class2145[] array = { new Class2145(class1270.Method7405(class1272), (Class1612)null, class1269, Class2007.Field17206), null, null };
        final int n = 1;
        final Class44 method3789 = new Class44(class1269.name() + " Box1 Color", this.Field11494, class1269.name() + " Box1 Color", new Class2027(255, 255, 255, 255)).Method313((Supplier)new Class1363(class1272));
        Intrinsics.checkExpressionValueIsNotNull((Object)method3789, "Setting(\"${typeE.name} B\u2026 == EntityESPModes.Box1 }");
        array[n] = new Class2145(class1270.Method7405(method3789), (Class1612)null, class1269, Class2007.Field17207);
        array[2] = new Class2145((Class44)null, method3788, class1269, Class2007.Field17208);
        return new ArrayList(CollectionsKt.listOf((Object[])array));
    }
    
    public final void Method3477() {
        this.Field11492.Method2004();
    }
    
    public final void Method3478(final float n) {
        this.Field11492.Method2005((Runnable)new Class582(this, Minecraft.getMinecraft()));
        for (final Entity entity : this.Field11493) {
            Intrinsics.checkExpressionValueIsNotNull((Object)entity, "entity");
            this.Method3479(n, entity);
        }
    }
    
    private final void Method3479(final float n, final Entity entity) {
        final Class2145 method3481 = this.Method3481(Class2007.Field17206, entity);
        if (method3481 == null) {
            Intrinsics.throwNpe();
        }
        final Class44 method3482 = method3481.Method7723();
        if (method3482 == null) {
            Intrinsics.throwNpe();
        }
        final Class44 class44 = method3482;
        if (class44.Method341() != Class1745.Field16010) {
            final Enum method3483 = class44.Method341();
            if (method3483 == Class1745.Field16010) {
                entity.glowing = false;
            }
            else if (method3483 == Class1745.Field16011) {
                entity.glowing = true;
            }
            else if (method3483 == Class1745.Field16012) {
                entity.glowing = false;
                final Class2145 method3484 = this.Method3481(Class2007.Field17207, entity);
                if (method3484 == null) {
                    Intrinsics.throwNpe();
                }
                final Class44 method3485 = method3484.Method7723();
                if (method3485 == null) {
                    Intrinsics.throwNpe();
                }
                final Class2027 method3486 = method3485.Method339();
                Class815.Method3466(entity, method3486.Field17325, method3486.Field17326, method3486.Field17327, 1.0f, n);
            }
            else if (method3483 == Class1745.Field16013) {
                entity.glowing = false;
                final Class2145 method3487 = this.Method3481(Class2007.Field17208, entity);
                if (method3487 == null) {
                    Intrinsics.throwNpe();
                }
                final Class1612 method3488 = method3487.Method7724();
                if (method3488 == null) {
                    Intrinsics.throwNpe();
                }
                final AxisAlignedBB getEntityBoundingBox = entity.getEntityBoundingBox();
                Intrinsics.checkExpressionValueIsNotNull((Object)getEntityBoundingBox, "entity.entityBoundingBox");
                method3488.Method3804(getEntityBoundingBox);
            }
        }
    }
    
    private final Class2145 Method3480(final Class2007 class2007, final Class1269 class2008) {
        for (final Class2145 class2009 : this.Field11491) {
            if (class2009.Method7725() == class2008 && class2009.Method7726() == class2007) {
                return class2009;
            }
        }
        return null;
    }
    
    private final Class2145 Method3481(final Class2007 class2007, final Entity entity) {
        return this.Method3480(class2007, Class1269.Field13736.Method7776(entity));
    }
    
    @NotNull
    @NotNull
    public final Class42 Method3482() {
        return this.Field11494;
    }
    
    public Class818(@NotNull @NotNull final Class42 field11494) {
        Intrinsics.checkParameterIsNotNull((Object)field11494, "module");
        this.Field11494 = field11494;
        this.Field11490 = new ArrayList();
        this.Field11491 = new ArrayList();
        this.Field11492 = new Class411(this.Field11494);
        this.Field11493 = new ArrayList();
        for (final Class1269 class1269 : Class1269.values()) {
            final Class1996 e = new Class1996(new Class44(class1269.name(), this.Field11494));
            final Class1996 method7406 = e.Method7406(new Class1996(new Class44("Cubic Renderer", this.Field11494)));
            this.Field11490.add(e);
            this.Field11490.add(method7406);
            this.Field11491.addAll(this.Method3476(class1269, e, method7406));
        }
    }
    
    public static final Class2145 Method3483(final Class818 class818, final Class2007 class819, final Class1269 class820) {
        return class818.Method3480(class819, class820);
    }
    
    public static final ArrayList Method3484(final Class818 class818) {
        return class818.Field11493;
    }
    
    public static final void Method3485(final Class818 class818, final ArrayList field11493) {
        class818.Field11493 = field11493;
    }
    
    private static String Method3486(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5857 ^ 0xD3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
