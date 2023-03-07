//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.pq70OGmwu3FWE691ok4mh7c14dWb0wv6;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qq8aSEIUqQ1gwjYnzJAmwtOPzc5ybZwN;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0015"}, d2={"Lcom/kisman/cc/features/plugins/ModulePlugin;", "Lcom/kisman/cc/features/module/Module;", "config", "Lcom/kisman/cc/features/plugins/PluginConfig;", "(Lcom/kisman/cc/features/plugins/PluginConfig;)V", "getConfig", "()Lcom/kisman/cc/features/plugins/PluginConfig;", "loaded", "", "getLoaded", "()Z", "setLoaded", "(Z)V", "plugin", "Lcom/kisman/cc/features/plugins/Plugin;", "getPlugin", "()Lcom/kisman/cc/features/plugins/Plugin;", "load", "", "reload", "unload", "kisman.cc"})
public final class UagvqGIEzb2jHSJdAWy6KqFmlBds2Tn8
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    @NotNull
    private final qq8aSEIUqQ1gwjYnzJAmwtOPzc5ybZwN Field12938;
    private boolean Field12939;
    @NotNull
    private final gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3 Field12940;
    private int Field12941;

    @NotNull
    @NotNull
    public final qq8aSEIUqQ1gwjYnzJAmwtOPzc5ybZwN Method4487() {
        return this.Field12938;
    }

    public final boolean Method27() {
        return this.Field12939;
    }

    public final void Method4488(boolean bl) {
        this.Field12939 = bl;
    }

    public final void Method4489() {
        this.Field12938.Method3760();
        if (Minecraft.getMinecraft().player != null) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503().Method1886("Successful loaded " + this.Field12940.Method6438() + " plugin!");
        }
        this.Field12939 = (int)1324629921L ^ 0x4EF43FA0;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6788();
    }

    public final void Method4490() {
        this.Field12938.Method3761();
        if (Minecraft.getMinecraft().player != null) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503().Method1886("Successful unloaded " + this.Field12940.Method6438() + " plugin!");
        }
        this.Field12939 = (int)431156541L ^ 0x19B2ED3D;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6788();
    }

    public final void Method4491() {
        this.Field12938.Method3761();
        this.Field12938.Method3760();
        if (Minecraft.getMinecraft().player == null) return;
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503().Method1886("Successful reloaded " + this.Field12940.Method6438() + " plugin!");
    }

    @NotNull
    @NotNull
    public final gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3 Method4492() {
        return this.Field12940;
    }

    public UagvqGIEzb2jHSJdAWy6KqFmlBds2Tn8(@NotNull @NotNull gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3 gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32) {
        Intrinsics.checkParameterIsNotNull((Object)gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32, (String)"config");
        super(gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32.Method6438(), "Plugin", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8347);
        this.Field12940 = gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32;
        S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a s0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a = S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a.Method1845();
        Intrinsics.checkExpressionValueIsNotNull((Object)s0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a, (String)"PluginManager.getInstance()");
        qq8aSEIUqQ1gwjYnzJAmwtOPzc5ybZwN qq8aSEIUqQ1gwjYnzJAmwtOPzc5ybZwN2 = (qq8aSEIUqQ1gwjYnzJAmwtOPzc5ybZwN)s0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a.Method1851().get(this.Field12940);
        if (qq8aSEIUqQ1gwjYnzJAmwtOPzc5ybZwN2 == null) throw (Throwable)new pq70OGmwu3FWE691ok4mh7c14dWb0wv6("Cant get plugin by plugin config!!!!!");
        this.Field12938 = qq8aSEIUqQ1gwjYnzJAmwtOPzc5ybZwN2;
        this.Field12939 = (int)595314466L ^ 0x237BC723;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1678371497 ^ (long)1678371497);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-2072412481 ^ (long)-2072412608);
            int n2 = (int)1267770492L ^ 0x4B90A475;
            cArray2[n] = (char)(cArray[n] ^ ((int)-2114748280L ^ 0x81F3EB61 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

