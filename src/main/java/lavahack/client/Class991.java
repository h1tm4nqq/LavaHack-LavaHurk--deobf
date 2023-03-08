//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraftforge.client.event.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import kotlin.random.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.function.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0019\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0019\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007?\u0006\u0016" }, d2 = { "Lcom/kisman/cc/features/module/misc/ChatModifier;", "Lcom/kisman/cc/features/module/Module;", "()V", "animation", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "getAnimation", "()Lcom/kisman/cc/settings/Setting;", "antiSpamBypass", "autoGlobal", "customY", "getCustomY", "customYVal", "getCustomYVal", "greenText", "suffix", "ttf", "getTtf", "onChat", "", "event", "Lnet/minecraftforge/client/event/ClientChatEvent;", "kisman.cc" })
public final class Class991 extends Class42
{
    private final Class44 Field12242;
    private final Class44 Field12243;
    private final Class44 Field12244;
    private final Class44 Field12245;
    private final Class44 Field12246;
    private final Class44 Field12247;
    private final Class44 Field12248;
    private final Class44 Field12249;
    private int Field12250;
    
    public final Class44 Method4012() {
        return this.Field12242;
    }
    
    public final Class44 Method4013() {
        return this.Field12247;
    }
    
    public final Class44 Method4014() {
        return this.Field12248;
    }
    
    public final Class44 Method4015() {
        return this.Field12249;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method4016(@NotNull @NotNull final ClientChatEvent clientChatEvent) {
        Intrinsics.checkParameterIsNotNull((Object)clientChatEvent, "event");
        if (!ArraysKt.contains(new Object[] { '/', '.', ',', ';', ':', '-', '+', Class1796.Field16241.Field16272.Field17386 }, (Object)clientChatEvent.getMessage().charAt(0))) {
            final Class44 field12246 = this.Field12246;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12246, "greenText");
            if (field12246.Method365()) {
                clientChatEvent.setMessage("> " + clientChatEvent.getMessage());
            }
            final Class44 field12247 = this.Field12245;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12247, "autoGlobal");
            if (field12247.Method365()) {
                clientChatEvent.setMessage('!' + clientChatEvent.getMessage());
            }
            final Class44 field12248 = this.Field12243;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12248, "suffix");
            if (field12248.Method365()) {
                clientChatEvent.setMessage(clientChatEvent.getMessage() + " | " + Class1796.Method6783() + " own you and all");
            }
            final Class44 field12249 = this.Field12244;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12249, "antiSpamBypass");
            if (field12249.Method365()) {
                clientChatEvent.setMessage(clientChatEvent.getMessage() + " | " + Random.Default.nextInt());
            }
        }
    }
    
    public Class991() {
        super("ChatModifier", "Chat features", Class97.Field8343);
        this.Field12242 = this.Method23(new Class44("Animation", (Class42)this, false));
        this.Field12243 = this.Method23(new Class44("Suffix", (Class42)this, false));
        this.Field12244 = this.Method23(new Class44("Anti Spam Bypass", (Class42)this, false));
        this.Field12245 = this.Method23(new Class44("Auto Global", (Class42)this, false));
        this.Field12246 = this.Method23(new Class44("Green Text", (Class42)this, false));
        this.Field12247 = this.Method23(new Class44("Custom Y", (Class42)this, false));
        this.Field12248 = this.Method23(new Class44("Custom Y Value", (Class42)this, Double.longBitsToDouble((long)414189446 ^ 0x4049000018B00786L), 0.0, Double.longBitsToDouble(4636737291354636288L), true).Method313((Supplier)new Class259(this)));
        this.Field12249 = this.Method23(new Class44("TTF", (Class42)this, false));
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3363 ^ 0x60));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
