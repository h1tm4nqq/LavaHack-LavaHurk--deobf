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
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.Vec3d
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L;
import lavahack.client.aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.hwbJeWGSYQEaA0HrWcfNQtu6aIugGkDT;
import lavahack.client.hwbJeWGSYQEaA0HrWcfNQtu6aIugGkDT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2={"Lcom/kisman/cc/util/render/objects/world/TextOnEntityObject;", "Lcom/kisman/cc/util/render/objects/world/Abstract3dObject;", "text", "", "entity", "Lnet/minecraft/entity/Entity;", "color", "Lcom/kisman/cc/util/Colour;", "(Ljava/lang/String;Lnet/minecraft/entity/Entity;Lcom/kisman/cc/util/Colour;)V", "getColor", "()Lcom/kisman/cc/util/Colour;", "getEntity", "()Lnet/minecraft/entity/Entity;", "getText", "()Ljava/lang/String;", "type", "Lcom/kisman/cc/util/enums/Object3dTypes;", "getType", "()Lcom/kisman/cc/util/enums/Object3dTypes;", "draw", "", "ticks", "", "kisman.cc"})
public final class kJu6afFsHYhOb919PAgABlDsdvjKBH5E
extends hwbJeWGSYQEaA0HrWcfNQtu6aIugGkDT {
    @NotNull
    private final Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L Field9484;
    @NotNull
    private final String Field9485;
    @NotNull
    private final Entity Field9486;
    @NotNull
    private final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field9487;
    private int Field9488;

    @Override
    @NotNull
    @NotNull
    public Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L Method1184() {
        return this.Field9484;
    }

    @Override
    public void Method1186(float f) {
        hwbJeWGSYQEaA0HrWcfNQtu6aIugGkDT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10864.Method4042(aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi.Field16464);
        AxisAlignedBB axisAlignedBB = this.Field9486.getEntityBoundingBox();
        Intrinsics.checkExpressionValueIsNotNull((Object)axisAlignedBB, (String)"entity.entityBoundingBox");
        Vec3d vec3d = axisAlignedBB.getCenter();
        Intrinsics.checkExpressionValueIsNotNull((Object)vec3d, (String)"entity.entityBoundingBox.center");
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"Minecraft.getMinecraft().player");
        this.Method1189(vec3d, (EntityPlayer)entityPlayerSP, 1.0f);
        GL11.glTranslated((double)(-(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(this.Field9485) / (((int)821361123L ^ 0x30F4F9E2) << 1))), (double)0.0, (double)0.0);
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(this.Field9485, 0.0, 0.0, this.Method1185().Method3626());
        hwbJeWGSYQEaA0HrWcfNQtu6aIugGkDT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10864.Method4043(aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi.Field16464);
    }

    @NotNull
    @NotNull
    public final String Method1790() {
        return this.Field9485;
    }

    @NotNull
    @NotNull
    public final Entity Method1791() {
        return this.Field9486;
    }

    @Override
    @NotNull
    @NotNull
    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method1185() {
        return this.Field9487;
    }

    public kJu6afFsHYhOb919PAgABlDsdvjKBH5E(@NotNull @NotNull String string, @NotNull @NotNull Entity entity, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        Intrinsics.checkParameterIsNotNull((Object)entity, (String)"entity");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"color");
        this.Field9485 = string;
        this.Field9486 = entity;
        this.Field9487 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        this.Field9484 = Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L.Field11218;
    }

    private static String Method1191(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)80354307 ^ (long)80354307);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-96174356L ^ 0xFA447E13);
            int n2 = ((int)321943260L ^ 0x1330769F) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-680054329 ^ (long)-680052024) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

