//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\f" }, d2 = { "Lcom/kisman/cc/features/module/movement/Phase;", "Lcom/kisman/cc/features/module/Module;", "()V", "autoDisable", "Lcom/kisman/cc/settings/Setting;", "getAutoDisable", "()Lcom/kisman/cc/settings/Setting;", "mode", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/util/enums/PhaseModes;", "update", "", "kisman.cc" })
public final class Class843 extends Class42
{
    private final Class1303 Field11573;
    @NotNull
    private final Class44 Field11574;
    private String Field11575 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class44 Method3573() {
        return this.Field11574;
    }
    
    public void Method45() {
        if (Method3574().player == null || Method3574().world == null) {
            return;
        }
        ((Class484)this.Field11573.Method341()).Method2245(this);
    }
    
    public Class843() {
        super("Phase", "crystalpvp.cc go brr", Class97.Field8340);
        this.Field11573 = new Class1303("Mode", (Class42)this, (Enum)Class484.Field10019).Method5303();
        final Class44 method23 = this.Method23(new Class44("Auto Disable", (Class42)this, false));
        if (method23 == null) {
            Intrinsics.throwNpe();
        }
        this.Field11574 = method23;
    }
    
    public static final Minecraft Method3574() {
        return Class42.Field8052;
    }
    
    public static final void Method3575(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5DD2 ^ 0x4B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
