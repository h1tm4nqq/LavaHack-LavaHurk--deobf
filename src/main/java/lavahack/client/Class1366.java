//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;
import net.minecraft.util.math.*;
import net.minecraft.client.*;
import kotlin.jvm.internal.*;
import net.minecraft.entity.player.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.entity.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007?\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012?\u0006\u0017" }, d2 = { "Lcom/kisman/cc/util/render/objects/world/TextOnBlockObject;", "Lcom/kisman/cc/util/render/objects/world/Abstract3dObject;", "text", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "color", "Lcom/kisman/cc/util/Colour;", "(Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;Lcom/kisman/cc/util/Colour;)V", "getColor", "()Lcom/kisman/cc/util/Colour;", "getPos", "()Lnet/minecraft/util/math/BlockPos;", "getText", "()Ljava/lang/String;", "type", "Lcom/kisman/cc/util/enums/Object3dTypes;", "getType", "()Lcom/kisman/cc/util/enums/Object3dTypes;", "draw", "", "ticks", "", "kisman.cc" })
public final class Class1366 extends Class199
{
    @NotNull
    private final Class760 Field14219;
    @NotNull
    private final String Field14220;
    @NotNull
    private final BlockPos Field14221;
    @NotNull
    private final Class2027 Field14222;
    private String Field14223 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    @Override
    public Class760 Method1184() {
        return this.Field14219;
    }
    
    @Override
    public void Method1186(final float n) {
        Class815.Method3433();
        final Vec3d vec3d = new Vec3d(this.Field14221.getX() + Double.longBitsToDouble((long)249991957 ^ 0x3FE000000EE69315L), this.Field14221.getY() + Double.longBitsToDouble((long)1495962266 ^ 0x3FE00000592A929AL), this.Field14221.getZ() + Double.longBitsToDouble(4602678819172646912L));
        final EntityPlayerSP player = Minecraft.getMinecraft().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player, "Minecraft.getMinecraft().player");
        this.Method1189(vec3d, (EntityPlayer)player, Float.intBitsToFloat(1050253722));
        GL11.glTranslated((double)(-(Class1178.Method4741(this.Field14220) / 2)), 0.0, 0.0);
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
    
    @NotNull
    @NotNull
    @Override
    public Class2027 Method1185() {
        return this.Field14222;
    }
    
    public Class1366(@NotNull @NotNull final String field14220, @NotNull @NotNull final BlockPos field14221, @NotNull @NotNull final Class2027 field14222) {
        Intrinsics.checkParameterIsNotNull((Object)field14220, "text");
        Intrinsics.checkParameterIsNotNull((Object)field14221, "pos");
        Intrinsics.checkParameterIsNotNull((Object)field14222, "color");
        this.Field14220 = field14220;
        this.Field14221 = field14221;
        this.Field14222 = field14222;
        this.Field14219 = Class760.Field11218;
    }
    
    private static String Method1191(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x777A ^ 0xFB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
