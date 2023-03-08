//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import net.minecraftforge.client.event.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.entity.player.*;
import kotlin.*;
import net.minecraft.entity.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005?\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000fH\u0007R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0011" }, d2 = { "Lcom/kisman/cc/features/module/render/PopCharmsRewrite;", "Lcom/kisman/cc/features/module/Module;", "()V", "pops", "Ljava/util/ArrayList;", "Lcom/kisman/cc/features/module/render/PopCharmsRewrite$Pop;", "Lkotlin/collections/ArrayList;", "self", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "onPop", "", "event", "Lcom/kisman/cc/event/events/subscribe/TotemPopEvent;", "onRenderWorld", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "Pop", "kisman.cc" })
public final class Class1836 extends Class42
{
    private final Class44 Field16479;
    private final ArrayList Field16480;
    private String Field16481 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method6927(@NotNull @NotNull final RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, "event");
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method6928(@NotNull @NotNull final Class1102 class1102) {
        Intrinsics.checkParameterIsNotNull((Object)class1102, "event");
        if (class1102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi() instanceof EntityPlayer) {
            if (Intrinsics.areEqual((Object)class1102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(), (Object)Method6929().player)) {
                final Class44 field16479 = this.Field16479;
                Intrinsics.checkExpressionValueIsNotNull((Object)field16479, "self");
                if (!field16479.Method365()) {
                    return;
                }
            }
            final ArrayList field16480 = this.Field16480;
            final Entity leqS0IyKEB621E1SrHdAcHHAUjScjmKi = class1102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
            if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi == null) {
                throw new TypeCastException("null cannot be cast to non-null type net.minecraft.entity.player.EntityPlayer");
            }
            field16480.add(new Class1032((EntityPlayer)leqS0IyKEB621E1SrHdAcHHAUjScjmKi));
        }
    }
    
    public Class1836() {
        super("PopCharmsRewrite", "Like Charms but for pops or idk xD", Class97.Field8342);
        this.Field16479 = this.Method23(new Class44("Self", this, false));
        this.Field16480 = new ArrayList();
    }
    
    public static final Minecraft Method6929() {
        return Class42.Field8052;
    }
    
    public static final void Method6930(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4785 ^ 0x5D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
