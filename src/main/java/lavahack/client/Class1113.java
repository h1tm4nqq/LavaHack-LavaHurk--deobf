//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import com.viaversion.viaversion.api.protocol.version.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/client/settings/EventSettingChange$ModeSetting;", "kotlin.jvm.PlatformType", "invoke" })
final class Class1113 implements Class254
{
    final Class778 Field13012;
    private String Field13013 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method979(final Object o) {
        this.Method4554((Class364)o);
    }
    
    public final void Method4554(final Class364 class364) {
        if (Intrinsics.areEqual((Object)class364.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (Object)Class778.Method3246(this.Field13012))) {
            if (Class778.Method3244().world != null) {
                Class778.Method3248(this.Field13012, true);
            }
            else {
                final Class1979 method7320 = Class1979.Method7320();
                Intrinsics.checkExpressionValueIsNotNull((Object)method7320, "ViaForge.getInstance()");
                final ProtocolVersion method7321 = ((Class2014)Class778.Method3246(this.Field13012).Method341()).Method7469();
                Intrinsics.checkExpressionValueIsNotNull((Object)method7321, "version.valEnum.version");
                method7320.Method7331(method7321.getVersion());
            }
        }
    }
    
    Class1113(final Class778 field13012) {
        this.Field13012 = field13012;
    }
    
    private static String Method4555(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4614 ^ 0xDB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
