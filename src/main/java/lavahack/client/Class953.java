/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1456;
import lavahack.client.Class1612;
import lavahack.client.Class1996;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class817;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2={"Lcom/kisman/cc/features/module/render/blockesp/BlockImplementation;", "Lcom/kisman/cc/util/interfaces/IBlockImplementation;", "block", "Lcom/kisman/cc/util/enums/BlockESPBlocks;", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/util/enums/BlockESPBlocks;Lcom/kisman/cc/features/module/Module;)V", "getBlock", "()Lcom/kisman/cc/util/enums/BlockESPBlocks;", "group", "Lcom/kisman/cc/settings/types/SettingGroup;", "kotlin.jvm.PlatformType", "getModule", "()Lcom/kisman/cc/features/module/Module;", "renderer", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "process", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "valid", "", "kisman.cc"})
public final class Class953
implements Class817 {
    private final Class1996 Field12057;
    private final Class1612 Field12058;
    @NotNull
    private final Class1456 Field12059;
    @NotNull
    private final Class42 Field12060;
    private String Field12061 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public boolean Method3473(@NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        if (!this.Field12058.Method3790()) return false;
        if (!this.Field12059.Method5813().Method5352(blockPos)) return false;
        return true;
    }

    @Override
    public void Method3474(@NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        if (!this.Method3473(blockPos)) return;
        this.Field12058.Method3805(blockPos);
    }

    @NotNull
    @NotNull
    public final Class1456 Method3919() {
        return this.Field12059;
    }

    @NotNull
    @NotNull
    public final Class42 Method3920() {
        return this.Field12060;
    }

    public Class953(@NotNull @NotNull Class1456 class1456, @NotNull @NotNull Class42 class42) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)class1456), (String)"block");
        Intrinsics.checkParameterIsNotNull((Object)class42, (String)"module");
        this.Field12059 = class1456;
        this.Field12060 = class42;
        this.Field12057 = this.Field12060.Method24(new Class1996(new Class44(this.Field12059.toString(), this.Field12060)));
        Class1612 class1612 = (Class1612)new Class1612(this.Field12060).Method773(this.Field12059.name());
        Class1996 class1996 = this.Field12057;
        Intrinsics.checkExpressionValueIsNotNull((Object)class1996, (String)"group");
        this.Field12058 = ((Class1612)class1612.Method772(class1996)).Method3788().Method3789();
    }

    private static String Method3921(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 93;
            cArray2[n] = (char)(cArray[n] ^ (0x76FA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

