//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.gameevent.*;
import kotlin.jvm.internal.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.client.event.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0017J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\rH\u0017R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006?\u0006\u000e" }, d2 = { "Lcom/kisman/cc/features/subsystem/SubSystem;", "Lme/zero/alpine/listener/Listenable;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "init", "", "renderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "update", "Lnet/minecraftforge/fml/common/gameevent/TickEvent$ClientTickEvent;", "kisman.cc" })
public abstract class Class166 implements Class1320
{
    @NotNull
    private final String Field8697;
    private String Field8698 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final void Method1060() {
        MinecraftForge.EVENT_BUS.register((Object)this);
        Class1796.Field16242.Method705((Class1320)this);
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method1061(@NotNull @NotNull final TickEvent$ClientTickEvent tickEvent$ClientTickEvent) {
        Intrinsics.checkParameterIsNotNull((Object)tickEvent$ClientTickEvent, "event");
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method1062(@NotNull @NotNull final RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, "event");
    }
    
    @NotNull
    @NotNull
    public final String Method1063() {
        return this.Field8697;
    }
    
    public Class166(@NotNull @NotNull final String field8697) {
        Intrinsics.checkParameterIsNotNull((Object)field8697, "name");
        this.Field8697 = field8697;
    }
    
    private static String Method1064(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6CC7 ^ 0xCB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
