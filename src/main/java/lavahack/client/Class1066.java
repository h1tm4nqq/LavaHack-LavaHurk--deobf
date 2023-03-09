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
import lavahack.client.Class1612;
import lavahack.client.Class1996;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class693;
import lavahack.client.Class817;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2={"Lcom/kisman/cc/features/module/render/xray/BlockImplementation;", "Lcom/kisman/cc/util/interfaces/IBlockImplementation;", "block", "Lcom/kisman/cc/util/enums/XRayBlocks;", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/util/enums/XRayBlocks;Lcom/kisman/cc/features/module/Module;)V", "getBlock", "()Lcom/kisman/cc/util/enums/XRayBlocks;", "group", "Lcom/kisman/cc/settings/types/SettingGroup;", "kotlin.jvm.PlatformType", "getModule", "()Lcom/kisman/cc/features/module/Module;", "renderer", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "process", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "valid", "", "kisman.cc"})
public final class Class1066
implements Class817 {
    private final Class1996 Field12698;
    private final Class1612 Field12699;
    @NotNull
    private final Class693 Field12700;
    @NotNull
    private final Class42 Field12701;
    private String Field12702 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public boolean Method3473(@NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        if (!this.Field12699.Method3790()) return false;
        if (!this.Field12700.Method2906().Method6698(blockPos)) return false;
        return true;
    }

    @Override
    public void Method3474(@NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        if (!this.Method3473(blockPos)) return;
        this.Field12699.Method3805(blockPos);
    }

    @NotNull
    @NotNull
    public final Class693 Method4325() {
        return this.Field12700;
    }

    @NotNull
    @NotNull
    public final Class42 Method4326() {
        return this.Field12701;
    }

    public Class1066(@NotNull @NotNull Class693 class693, @NotNull @NotNull Class42 class42) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)class693), (String)"block");
        Intrinsics.checkParameterIsNotNull((Object)class42, (String)"module");
        this.Field12700 = class693;
        this.Field12701 = class42;
        this.Field12698 = this.Field12701.Method24(new Class1996(new Class44(this.Field12700.name(), this.Field12701)));
        Class1612 class1612 = (Class1612)new Class1612(this.Field12701).Method773(this.Field12700.name());
        Class1996 class1996 = this.Field12698;
        Intrinsics.checkExpressionValueIsNotNull((Object)class1996, (String)"group");
        this.Field12699 = ((Class1612)class1612.Method772(class1996)).Method3788().Method3789();
    }

    private static String Method4327(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 40;
            cArray2[n] = (char)(cArray[n] ^ (0x4551 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

