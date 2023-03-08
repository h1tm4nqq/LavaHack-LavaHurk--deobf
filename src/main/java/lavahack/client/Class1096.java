//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e?\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010?\u0006\u0015" }, d2 = { "Lcom/kisman/cc/features/plugins/ModulePlugin;", "Lcom/kisman/cc/features/module/Module;", "config", "Lcom/kisman/cc/features/plugins/PluginConfig;", "(Lcom/kisman/cc/features/plugins/PluginConfig;)V", "getConfig", "()Lcom/kisman/cc/features/plugins/PluginConfig;", "loaded", "", "getLoaded", "()Z", "setLoaded", "(Z)V", "plugin", "Lcom/kisman/cc/features/plugins/Plugin;", "getPlugin", "()Lcom/kisman/cc/features/plugins/Plugin;", "load", "", "reload", "unload", "kisman.cc" })
public final class Class1096 extends Class42
{
    @NotNull
    private final Class906 Field12938;
    private boolean Field12939;
    @NotNull
    private final Class1669 Field12940;
    private int Field12941;
    
    @NotNull
    @NotNull
    public final Class906 Method4487() {
        return this.Field12938;
    }
    
    public final boolean Method27() {
        return this.Field12939;
    }
    
    public final void Method4488(final boolean field12939) {
        this.Field12939 = field12939;
    }
    
    public final void Method4489() {
        this.Field12938.Method3760();
        if (Minecraft.getMinecraft().player != null) {
            Class1393.Method5503().Method1886("Successful loaded " + this.Field12940.Method6438() + " plugin!");
        }
        this.Field12939 = true;
        Class1796.Method6788();
    }
    
    public final void Method4490() {
        this.Field12938.Method3761();
        if (Minecraft.getMinecraft().player != null) {
            Class1393.Method5503().Method1886("Successful unloaded " + this.Field12940.Method6438() + " plugin!");
        }
        this.Field12939 = false;
        Class1796.Method6788();
    }
    
    public final void Method4491() {
        this.Field12938.Method3761();
        this.Field12938.Method3760();
        if (Minecraft.getMinecraft().player != null) {
            Class1393.Method5503().Method1886("Successful reloaded " + this.Field12940.Method6438() + " plugin!");
        }
    }
    
    @NotNull
    @NotNull
    public final Class1669 Method4492() {
        return this.Field12940;
    }
    
    public Class1096(@NotNull @NotNull final Class1669 field12940) {
        Intrinsics.checkParameterIsNotNull((Object)field12940, "config");
        super(field12940.Method6438(), "Plugin", Class97.Field8347);
        this.Field12940 = field12940;
        final Class379 method1845 = Class379.Method1845();
        Intrinsics.checkExpressionValueIsNotNull((Object)method1845, "PluginManager.getInstance()");
        final Class906 field12941 = method1845.Method1851().get(this.Field12940);
        if (field12941 != null) {
            this.Field12938 = field12941;
            this.Field12939 = true;
            return;
        }
        throw new Class1635("Cant get plugin by plugin config!!!!!");
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6BE9 ^ 0x9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
