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
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK;
import lavahack.client.WKrkcHk4xNIl957OiVzz4uUHftElYfcd;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.rQ5lrztQK8V9kw3Btd6Tv2vQoIi5o18Z;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016\u00a2\u0006\u0002\u0010\u0016R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0017"}, d2={"Lcom/kisman/cc/features/module/render/storageesp/TileEntityImplementation;", "Lcom/kisman/cc/util/interfaces/ITileEntityImplementation;", "tile", "Lcom/kisman/cc/util/enums/StorageESPTileEntities;", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/util/enums/StorageESPTileEntities;Lcom/kisman/cc/features/module/Module;)V", "group", "Lcom/kisman/cc/settings/types/SettingGroup;", "kotlin.jvm.PlatformType", "getModule", "()Lcom/kisman/cc/features/module/Module;", "renderer", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "getTile", "()Lcom/kisman/cc/util/enums/StorageESPTileEntities;", "process", "", "Lnet/minecraft/tileentity/TileEntity;", "callingFromDraw", "", "valid", "(Lnet/minecraft/tileentity/TileEntity;Ljava/lang/Boolean;)Z", "kisman.cc"})
public final class T9g0jeLq0v1889IjzjfPZDEB60aTemz3
implements WKrkcHk4xNIl957OiVzz4uUHftElYfcd {
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field9584;
    private final MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK Field9585;
    @NotNull
    private final rQ5lrztQK8V9kw3Btd6Tv2vQoIi5o18Z Field9586;
    @NotNull
    private final WjjBVRrUqJUKhloA7ANknrTEODhuGa0J Field9587;
    private String Field9588 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public boolean Method1835(@NotNull @NotNull TileEntity tileEntity, @Nullable @Nullable Boolean bl) {
        int n;
        Intrinsics.checkParameterIsNotNull((Object)tileEntity, (String)"tile");
        if (this.Field9585.Method3790() && this.Field9586.Method5718().Method6471(tileEntity) && (bl == null || this.Field9585.Method3792(bl))) {
            n = (int)((long)1729136831 ^ (long)1729136830);
            return n != 0;
        }
        n = (int)403235069L ^ 0x1808E0FD;
        return n != 0;
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
    public final rQ5lrztQK8V9kw3Btd6Tv2vQoIi5o18Z Method1837() {
        return this.Field9586;
    }

    @NotNull
    @NotNull
    public final WjjBVRrUqJUKhloA7ANknrTEODhuGa0J Method1838() {
        return this.Field9587;
    }

    public T9g0jeLq0v1889IjzjfPZDEB60aTemz3(@NotNull @NotNull rQ5lrztQK8V9kw3Btd6Tv2vQoIi5o18Z rQ5lrztQK8V9kw3Btd6Tv2vQoIi5o18Z2, @NotNull @NotNull WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)rQ5lrztQK8V9kw3Btd6Tv2vQoIi5o18Z2), (String)"tile");
        Intrinsics.checkParameterIsNotNull((Object)wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, (String)"module");
        this.Field9586 = rQ5lrztQK8V9kw3Btd6Tv2vQoIi5o18Z2;
        this.Field9587 = wjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
        this.Field9584 = this.Field9587.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(this.Field9586.name(), this.Field9587)));
        MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK = (MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK)new MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK(this.Field9587).Method773(this.Field9586.name());
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2 = this.Field9584;
        Intrinsics.checkExpressionValueIsNotNull((Object)xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2, (String)"group");
        this.Field9585 = ((MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK)mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method772(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2)).Method3788().Method3789();
    }

    private static String Method1839(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)741187006L ^ 0x2C2D9DBE;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1484512897L ^ 0xA7842180);
            int n2 = (int)-50247659L ^ 0xFD01483E;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1354154836 ^ (long)1354158261) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

