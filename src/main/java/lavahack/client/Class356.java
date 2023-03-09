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

import com.kisman.cc.util.Class2027;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1178;
import lavahack.client.Class1831;
import lavahack.client.Class199;
import lavahack.client.Class674;
import lavahack.client.Class760;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2={"Lcom/kisman/cc/util/render/objects/world/TextOnEntityObject;", "Lcom/kisman/cc/util/render/objects/world/Abstract3dObject;", "text", "", "entity", "Lnet/minecraft/entity/Entity;", "color", "Lcom/kisman/cc/util/Colour;", "(Ljava/lang/String;Lnet/minecraft/entity/Entity;Lcom/kisman/cc/util/Colour;)V", "getColor", "()Lcom/kisman/cc/util/Colour;", "getEntity", "()Lnet/minecraft/entity/Entity;", "getText", "()Ljava/lang/String;", "type", "Lcom/kisman/cc/util/enums/Object3dTypes;", "getType", "()Lcom/kisman/cc/util/enums/Object3dTypes;", "draw", "", "ticks", "", "kisman.cc"})
public final class Class356
extends Class199 {
    @NotNull
    private final Class760 Field9484;
    @NotNull
    private final String Field9485;
    @NotNull
    private final Entity Field9486;
    @NotNull
    private final Class2027 Field9487;
    private int Field9488;

    @Override
    @NotNull
    @NotNull
    public Class760 Method1184() {
        return this.Field9484;
    }

    @Override
    public void Method1186(float f) {
        Class674.Field10864.Method4042(Class1831.Field16464);
        AxisAlignedBB axisAlignedBB = this.Field9486.getEntityBoundingBox();
        Intrinsics.checkExpressionValueIsNotNull((Object)axisAlignedBB, (String)"entity.entityBoundingBox");
        Vec3d vec3d = axisAlignedBB.getCenter();
        Intrinsics.checkExpressionValueIsNotNull((Object)vec3d, (String)"entity.entityBoundingBox.center");
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"Minecraft.getMinecraft().player");
        this.Method1189(vec3d, (EntityPlayer)entityPlayerSP, 1.0f);
        GL11.glTranslated((double)(-(Class1178.Method4741(this.Field9485) / 2)), (double)0.0, (double)0.0);
        Class1178.Method4745(this.Field9485, 0.0, 0.0, this.Method1185().Method3626());
        Class674.Field10864.Method4043(Class1831.Field16464);
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
    public Class2027 Method1185() {
        return this.Field9487;
    }

    public Class356(@NotNull @NotNull String string, @NotNull @NotNull Entity entity, @NotNull @NotNull Class2027 class2027) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        Intrinsics.checkParameterIsNotNull((Object)entity, (String)"entity");
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"color");
        this.Field9485 = string;
        this.Field9486 = entity;
        this.Field9487 = class2027;
        this.Field9484 = Class760.Field11218;
    }

    private static String Method1191(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 134;
            cArray2[n] = (char)(cArray[n] ^ (0xB0F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

