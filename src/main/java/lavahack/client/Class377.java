//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1431;
import lavahack.client.Class1612;
import lavahack.client.Class1996;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class901;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016\u00a2\u0006\u0002\u0010\u0016R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0017"}, d2={"Lcom/kisman/cc/features/module/render/storageesp/TileEntityImplementation;", "Lcom/kisman/cc/util/interfaces/ITileEntityImplementation;", "tile", "Lcom/kisman/cc/util/enums/StorageESPTileEntities;", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/util/enums/StorageESPTileEntities;Lcom/kisman/cc/features/module/Module;)V", "group", "Lcom/kisman/cc/settings/types/SettingGroup;", "kotlin.jvm.PlatformType", "getModule", "()Lcom/kisman/cc/features/module/Module;", "renderer", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "getTile", "()Lcom/kisman/cc/util/enums/StorageESPTileEntities;", "process", "", "Lnet/minecraft/tileentity/TileEntity;", "callingFromDraw", "", "valid", "(Lnet/minecraft/tileentity/TileEntity;Ljava/lang/Boolean;)Z", "kisman.cc"})
public final class Class377
implements Class901 {
    private final Class1996 Field9584;
    private final Class1612 Field9585;
    @NotNull
    private final Class1431 Field9586;
    @NotNull
    private final Class42 Field9587;
    private String Field9588 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public boolean Method1835(@NotNull @NotNull TileEntity tileEntity, @Nullable @Nullable Boolean bl) {
        Intrinsics.checkParameterIsNotNull((Object)tileEntity, (String)"tile");
        if (!this.Field9585.Method3790()) return false;
        if (!this.Field9586.Method5718().Method6471(tileEntity)) return false;
        if (bl == null) return true;
        if (!this.Field9585.Method3792(bl)) return false;
        return true;
    }

    @Override
    public void Method1836(@NotNull @NotNull TileEntity tileEntity, boolean bl) {
        Intrinsics.checkParameterIsNotNull((Object)tileEntity, (String)"tile");
        if (!this.Method1835(tileEntity, bl)) return;
        BlockPos blockPos = tileEntity.getPos();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"tile.pos");
        this.Field9585.Method3805(blockPos);
    }

    @NotNull
    @NotNull
    public final Class1431 Method1837() {
        return this.Field9586;
    }

    @NotNull
    @NotNull
    public final Class42 Method1838() {
        return this.Field9587;
    }

    public Class377(@NotNull @NotNull Class1431 class1431, @NotNull @NotNull Class42 class42) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)class1431), (String)"tile");
        Intrinsics.checkParameterIsNotNull((Object)class42, (String)"module");
        this.Field9586 = class1431;
        this.Field9587 = class42;
        this.Field9584 = this.Field9587.Method24(new Class1996(new Class44(this.Field9586.name(), this.Field9587)));
        Class1612 class1612 = (Class1612)new Class1612(this.Field9587).Method773(this.Field9586.name());
        Class1996 class1996 = this.Field9584;
        Intrinsics.checkExpressionValueIsNotNull((Object)class1996, (String)"group");
        this.Field9585 = ((Class1612)class1612.Method772(class1996)).Method3788().Method3789();
    }

    private static String Method1839(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 43;
            cArray2[n] = (char)(cArray[n] ^ (0x13E1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

