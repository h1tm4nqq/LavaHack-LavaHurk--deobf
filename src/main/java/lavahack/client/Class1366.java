//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1178;
import lavahack.client.Class199;
import lavahack.client.Class760;
import lavahack.client.Class815;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2={"Lcom/kisman/cc/util/render/objects/world/TextOnBlockObject;", "Lcom/kisman/cc/util/render/objects/world/Abstract3dObject;", "text", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "color", "Lcom/kisman/cc/util/Colour;", "(Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;Lcom/kisman/cc/util/Colour;)V", "getColor", "()Lcom/kisman/cc/util/Colour;", "getPos", "()Lnet/minecraft/util/math/BlockPos;", "getText", "()Ljava/lang/String;", "type", "Lcom/kisman/cc/util/enums/Object3dTypes;", "getType", "()Lcom/kisman/cc/util/enums/Object3dTypes;", "draw", "", "ticks", "", "kisman.cc"})
public final class Class1366
extends Class199 {
    @NotNull
    private final Class760 Field14219;
    @NotNull
    private final String Field14220;
    @NotNull
    private final BlockPos Field14221;
    @NotNull
    private final Class2027 Field14222;
    private String Field14223 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    @NotNull
    @NotNull
    public Class760 Method1184() {
        return this.Field14219;
    }

    @Override
    public void Method1186(float f) {
        Class815.Method3433();
        Vec3d vec3d = new Vec3d((double)this.Field14221.getX() + Double.longBitsToDouble((long)249991957 ^ 0x3FE000000EE69315L), (double)this.Field14221.getY() + Double.longBitsToDouble((long)1495962266 ^ 0x3FE00000592A929AL), (double)this.Field14221.getZ() + Double.longBitsToDouble(4602678819172646912L));
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"Minecraft.getMinecraft().player");
        this.Method1189(vec3d, (EntityPlayer)entityPlayerSP, Float.intBitsToFloat(1050253722));
        GL11.glTranslated((double)(-(Class1178.Method4741(this.Field14220) / 2)), (double)0.0, (double)0.0);
        Class1178.Method4745(this.Field14220, 0.0, 0.0, this.Method1185().Method3626());
        Class815.Method3434();
    }

    @NotNull
    @NotNull
    public final String Method5461() {
        return this.Field14220;
    }

    @NotNull
    @NotNull
    public final BlockPos Method5462() {
        return this.Field14221;
    }

    @Override
    @NotNull
    @NotNull
    public Class2027 Method1185() {
        return this.Field14222;
    }

    public Class1366(@NotNull @NotNull String string, @NotNull @NotNull BlockPos blockPos, @NotNull @NotNull Class2027 class2027) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"color");
        this.Field14220 = string;
        this.Field14221 = blockPos;
        this.Field14222 = class2027;
        this.Field14219 = Class760.Field11218;
    }

    private static String Method1191(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 251;
            cArray2[n] = (char)(cArray[n] ^ (0x777A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

