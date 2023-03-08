//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraftforge.client.event.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraftforge.fml.common.eventhandler.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\n" }, d2 = { "Lcom/kisman/cc/features/module/render/EntityESPRewrite;", "Lcom/kisman/cc/features/module/Module;", "()V", "pattern", "Lcom/kisman/cc/settings/util/EntityESPRendererPattern;", "onEnable", "", "onRenderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "kisman.cc" })
public final class Class1379 extends Class42
{
    private final Class818 Field14254;
    private String Field14255 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method38() {
        super.Method38();
        this.Field14254.Method3477();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method5482(@NotNull @NotNull final RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, "event");
        this.Field14254.Method3478(renderWorldLastEvent.getPartialTicks());
    }
    
    public Class1379() {
        super("EntityESPRewrite", Class97.Field8342);
        (this.Field14254 = new Class818(this)).Method3475();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xE11 ^ 0x32));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
