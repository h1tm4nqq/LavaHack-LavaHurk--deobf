//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import com.viaversion.viaversion.api.protocol.version.*;
import java.util.function.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e?\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\r" }, d2 = { "Lcom/kisman/cc/features/module/client/ViaForgeModule;", "Lcom/kisman/cc/features/module/Module;", "()V", "changed", "", "settingChange", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/client/settings/EventSettingChange$ModeSetting;", "version", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/features/viaforge/protocol/ProtocolCollection;", "update", "", "kisman.cc" })
public final class Class778 extends Class42
{
    private final Class1303 Field11289;
    private boolean Field11290;
    private final Class618 Field11291;
    private String Field11292 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method45() {
        if (Method3244().world == null && this.Field11290) {
            final Class1979 method7320 = Class1979.Method7320();
            Intrinsics.checkExpressionValueIsNotNull((Object)method7320, "ViaForge.getInstance()");
            final ProtocolVersion method7321 = ((Class2014)this.Field11289.Method341()).Method7469();
            Intrinsics.checkExpressionValueIsNotNull((Object)method7321, "version.valEnum.version");
            method7320.Method7331(method7321.getVersion());
            this.Field11290 = false;
        }
    }
    
    public Class778() {
        super("ViaForge", "Implementation of viaforge version selector", Class97.Field8339);
        this.Field11289 = new Class1303("Version", (Class42)this, (Enum)Class2014.Field17263).Method5303();
        this.Field11291 = new Class618((Class254)new Class1113(this), new Predicate[0]);
        super.Method21(true);
        super.Field8062 = false;
        Class1796.Field16242.Method706(this.Field11291);
    }
    
    public static final Minecraft Method3244() {
        return Class42.Field8052;
    }
    
    public static final void Method3245(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final Class1303 Method3246(final Class778 class778) {
        return class778.Field11289;
    }
    
    public static final boolean Method3247(final Class778 class778) {
        return class778.Field11290;
    }
    
    public static final void Method3248(final Class778 class778, final boolean field11290) {
        class778.Field11290 = field11290;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x19E8 ^ 0xBC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
