//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.function.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0000H\u0016J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017R\u0011\u0010\u0005\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n?\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004?\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\b?\u0006\u0018" }, d2 = { "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "Lcom/kisman/cc/settings/util/AbstractPattern;", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "delay", "Lcom/kisman/cc/settings/Setting;", "getDelay", "()Lcom/kisman/cc/settings/Setting;", "group_", "Lcom/kisman/cc/settings/types/SettingGroup;", "getGroup_", "()Lcom/kisman/cc/settings/types/SettingGroup;", "handler", "Lcom/kisman/cc/util/thread/kisman/ThreadHandler;", "multiThread", "getMultiThread", "init", "preInit", "reset", "", "update", "task", "Ljava/lang/Runnable;", "kisman.cc" })
public final class Class411 extends Class91
{
    @NotNull
    private final Class1996 Field9702;
    @NotNull
    private final Class44 Field9703;
    @NotNull
    private final Class44 Field9704;
    private final Class511 Field9705;
    private String Field9706 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class1996 Method1999() {
        return this.Field9702;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method2000() {
        return this.Field9703;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method2001() {
        return this.Field9704;
    }
    
    @NotNull
    @NotNull
    public Class411 Method2002() {
        if (this.Method769() != null) {
            final Class1996 method769 = this.Method769();
            if (method769 != null) {
                method769.Method7406(this.Field9702);
            }
        }
        return this;
    }
    
    @Override
    public Object Method778() {
        return this.Method2002();
    }
    
    @NotNull
    @NotNull
    public Class411 Method2003() {
        this.Method780().Method24(this.Field9702);
        this.Method780().Method23(this.Field9703);
        this.Method780().Method23(this.Field9704);
        return this;
    }
    
    @Override
    public Object Method779() {
        return this.Method2003();
    }
    
    public final void Method2004() {
        this.Field9705.Method2360();
    }
    
    public final void Method2005(@NotNull @NotNull final Runnable runnable) {
        Intrinsics.checkParameterIsNotNull((Object)runnable, "task");
        this.Field9705.Method2361(runnable);
    }
    
    public Class411(@NotNull @NotNull final Class42 class42) {
        Intrinsics.checkParameterIsNotNull((Object)class42, "module");
        super(class42);
        this.Field9702 = this.Method776(new Class1996(new Class44("Multi Thread", class42)));
        this.Field9703 = this.Method775(this.Field9702.Method7405(new Class44("Delay", class42, Double.longBitsToDouble(4624633867356078080L), 0.0, Double.longBitsToDouble(4636737291354636288L), Class467.Field9943)));
        this.Field9704 = this.Method775(this.Field9702.Method7405(new Class44("Multi Thread", class42, false)));
        this.Field9705 = new Class511((Supplier)new Class1265(this), new Class974(this));
    }
    
    private static String Method781(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x76C9 ^ 0x94));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
