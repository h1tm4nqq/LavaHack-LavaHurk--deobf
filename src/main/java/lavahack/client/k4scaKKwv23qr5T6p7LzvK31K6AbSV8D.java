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
import lavahack.client.BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.k4scaKKwv23qr5T6p7LzvK31K6AbSV8D$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000fH\u0007R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2={"Lcom/kisman/cc/features/module/render/PopCharmsRewrite;", "Lcom/kisman/cc/features/module/Module;", "()V", "pops", "Ljava/util/ArrayList;", "Lcom/kisman/cc/features/module/render/PopCharmsRewrite$Pop;", "Lkotlin/collections/ArrayList;", "self", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "onPop", "", "event", "Lcom/kisman/cc/event/events/subscribe/TotemPopEvent;", "onRenderWorld", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "Pop", "kisman.cc"})
public final class k4scaKKwv23qr5T6p7LzvK31K6AbSV8D
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16479 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Self", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1615744411L ^ 0x9FB1B265) != 0));
    private final ArrayList Field16480 = new ArrayList();
    private String Field16481 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public final void Method6927(@NotNull @NotNull RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, (String)"event");
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method6928(@NotNull @NotNull BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh brWsHdiLAwYGSB35z3ypQAx8eRulUOBh) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)brWsHdiLAwYGSB35z3ypQAx8eRulUOBh), (String)"event");
        if (!(brWsHdiLAwYGSB35z3ypQAx8eRulUOBh.leqS0IyKEB621E1SrHdAcHHAUjScjmKi() instanceof EntityPlayer)) return;
        if (Intrinsics.areEqual((Object)brWsHdiLAwYGSB35z3ypQAx8eRulUOBh.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(), (Object)k4scaKKwv23qr5T6p7LzvK31K6AbSV8D.Method6929().player)) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field16479;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"self");
            if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
                return;
            }
        }
        Entity entity = brWsHdiLAwYGSB35z3ypQAx8eRulUOBh.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
        if (entity == null) {
            throw new TypeCastException("null cannot be cast to non-null type net.minecraft.entity.player.EntityPlayer");
        }
        this.Field16480.add(new k4scaKKwv23qr5T6p7LzvK31K6AbSV8D$leqS0IyKEB621E1SrHdAcHHAUjScjmKi((EntityPlayer)entity));
    }

    public k4scaKKwv23qr5T6p7LzvK31K6AbSV8D() {
        super("PopCharmsRewrite", "Like Charms but for pops or idk xD", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
    }

    public static final Minecraft Method6929() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method6930(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)421978886L ^ 0x1926E306;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-154921438L ^ 0xF6C416DD);
            int n2 = (int)-1284413589L ^ 0xB3716736;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1569208751 ^ (long)-1569226284) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

