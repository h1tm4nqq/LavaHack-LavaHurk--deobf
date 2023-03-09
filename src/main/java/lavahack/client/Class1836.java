//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1032;
import lavahack.client.Class1102;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000fH\u0007R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2={"Lcom/kisman/cc/features/module/render/PopCharmsRewrite;", "Lcom/kisman/cc/features/module/Module;", "()V", "pops", "Ljava/util/ArrayList;", "Lcom/kisman/cc/features/module/render/PopCharmsRewrite$Pop;", "Lkotlin/collections/ArrayList;", "self", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "onPop", "", "event", "Lcom/kisman/cc/event/events/subscribe/TotemPopEvent;", "onRenderWorld", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "Pop", "kisman.cc"})
public final class Class1836
extends Class42 {
    private final Class44 Field16479 = this.Method23(new Class44("Self", (Class42)this, false));
    private final ArrayList Field16480 = new ArrayList();
    private String Field16481 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public final void Method6927(@NotNull @NotNull RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, (String)"event");
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method6928(@NotNull @NotNull Class1102 class1102) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)class1102), (String)"event");
        if (!(class1102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi() instanceof EntityPlayer)) return;
        if (Intrinsics.areEqual((Object)class1102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(), (Object)Class1836.Method6929().player)) {
            Class44 class44 = this.Field16479;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"self");
            if (!class44.Method365()) {
                return;
            }
        }
        Entity entity = class1102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
        if (entity == null) {
            throw new TypeCastException("null cannot be cast to non-null type net.minecraft.entity.player.EntityPlayer");
        }
        this.Field16480.add(new Class1032((EntityPlayer)entity));
    }

    public Class1836() {
        super("PopCharmsRewrite", "Like Charms but for pops or idk xD", Class97.Field8342);
    }

    public static final Minecraft Method6929() {
        return Class42.Field8052;
    }

    public static final void Method6930(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 93;
            cArray2[n] = (char)(cArray[n] ^ (0x4785 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

