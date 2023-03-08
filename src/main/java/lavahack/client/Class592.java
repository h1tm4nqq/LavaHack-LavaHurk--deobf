//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.client.event.*;

@Class1887
@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/features/module/render/Shaders;", "Lcom/kisman/cc/features/module/Module;", "()V", "renderer", "Lcom/kisman/cc/settings/util/ShadersRendererPattern;", "onRenderHand", "", "event", "Lnet/minecraftforge/client/event/RenderHandEvent;", "onRenderWorld", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "kisman.cc" })
public final class Class592 extends Class42
{
    private final Class1482 Field10525;
    private int Field10526;
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method2570(@NotNull @NotNull final RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, "event");
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method2571(@NotNull @NotNull final RenderHandEvent renderHandEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderHandEvent, "event");
        renderHandEvent.setCanceled(this.Field10525.Method5928());
    }
    
    public Class592() {
        super("Shaders", "Uhhhh", Class97.Field8342);
        this.Field10525 = new Class1482((Class42)this).Method5925();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6CDD ^ 0xF7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
