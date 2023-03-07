//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u0017\u001a\u00020\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r\u00a8\u0006\u0018"}, d2={"Lcom/kisman/cc/util/entity/RotationSaver;", "", "()V", "entity", "Lnet/minecraft/entity/Entity;", "(Lnet/minecraft/entity/Entity;)V", "getEntity", "()Lnet/minecraft/entity/Entity;", "renderYawOffset", "", "getRenderYawOffset", "()F", "setRenderYawOffset", "(F)V", "rotationPitch", "getRotationPitch", "setRotationPitch", "rotationYaw", "getRotationYaw", "setRotationYaw", "rotationYawHead", "getRotationYawHead", "setRotationYawHead", "save", "kisman.cc"})
public final class JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU {
    private float Field17870;
    private float Field17871;
    private float Field17872;
    private float Field17873;
    @NotNull
    private final Entity Field17874;
    private String Field17875 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final float Method7785() {
        return this.Field17870;
    }

    public final void Method7786(float f) {
        this.Field17870 = f;
    }

    public final float Method7787() {
        return this.Field17871;
    }

    public final void Method7788(float f) {
        this.Field17871 = f;
    }

    public final float Method7789() {
        return this.Field17872;
    }

    public final void Method7790(float f) {
        this.Field17872 = f;
    }

    public final float Method7791() {
        return this.Field17873;
    }

    public final void Method7792(float f) {
        this.Field17873 = f;
    }

    @NotNull
    @NotNull
    public final JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU Method7793() {
        this.Field17870 = this.Field17874.rotationYaw;
        this.Field17871 = this.Field17874.rotationPitch;
        this.Field17872 = this.Field17874.getRotationYawHead();
        this.Field17873 = this.Field17874 instanceof EntityLivingBase ? ((EntityLivingBase)this.Field17874).renderYawOffset : this.Field17874.rotationYaw;
        return this;
    }

    @NotNull
    @NotNull
    public final Entity Method7794() {
        return this.Field17874;
    }

    public JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU(@NotNull @NotNull Entity entity) {
        Intrinsics.checkParameterIsNotNull((Object)entity, (String)"entity");
        this.Field17874 = entity;
    }

    public JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU() {
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"Minecraft.getMinecraft().player");
        this((Entity)entityPlayerSP);
    }

    private static String Method7795(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-999473928 ^ (long)-999473928);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-155681191 ^ (long)-155681114);
            int n2 = (int)((long)1280452983 ^ (long)1280452954) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1146395107L ^ 0x44548018) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

