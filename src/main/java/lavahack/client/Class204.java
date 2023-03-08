//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.client.*;
import net.minecraft.entity.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import kotlin.jvm.*;
import net.minecraft.world.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0016\u0018\u0000 02\u00020\u0001:\u000201BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e?\u0006\u0002\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0096\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e?\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e?\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\b\u001a\u00020\u0007X\u0096\u000e?\u0006\u000e\n\u0000\u001a\u0004\b.\u0010#\"\u0004\b/\u0010%?\u00062" }, d2 = { "Lcom/kisman/cc/features/module/combat/autorer/PlaceInfo;", "", "target", "Lnet/minecraft/entity/EntityLivingBase;", "blockPos", "Lnet/minecraft/util/math/BlockPos;", "selfDamage", "", "targetDamage", "side", "Lnet/minecraft/util/EnumFacing;", "hitVecOffset", "Lcom/kisman/cc/util/math/vectors/xyz/Vec3f;", "hitVec", "Lnet/minecraft/util/math/Vec3d;", "(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/util/math/BlockPos;FFLnet/minecraft/util/EnumFacing;Lcom/kisman/cc/util/math/vectors/xyz/Vec3f;Lnet/minecraft/util/math/Vec3d;)V", "getBlockPos", "()Lnet/minecraft/util/math/BlockPos;", "setBlockPos", "(Lnet/minecraft/util/math/BlockPos;)V", "getHitVec", "()Lnet/minecraft/util/math/Vec3d;", "setHitVec", "(Lnet/minecraft/util/math/Vec3d;)V", "getHitVecOffset", "()Lcom/kisman/cc/util/math/vectors/xyz/Vec3f;", "setHitVecOffset", "(Lcom/kisman/cc/util/math/vectors/xyz/Vec3f;)V", "mc", "Lnet/minecraft/client/Minecraft;", "getMc", "()Lnet/minecraft/client/Minecraft;", "setMc", "(Lnet/minecraft/client/Minecraft;)V", "getSelfDamage", "()F", "setSelfDamage", "(F)V", "getSide", "()Lnet/minecraft/util/EnumFacing;", "setSide", "(Lnet/minecraft/util/EnumFacing;)V", "getTarget", "()Lnet/minecraft/entity/EntityLivingBase;", "setTarget", "(Lnet/minecraft/entity/EntityLivingBase;)V", "getTargetDamage", "setTargetDamage", "Companion", "Mutable", "kisman.cc" })
public class Class204
{
    @NotNull
    private Minecraft Field8885;
    @Nullable
    private EntityLivingBase Field8886;
    @Nullable
    private BlockPos Field8887;
    private float Field8888;
    private float Field8889;
    @Nullable
    private EnumFacing Field8890;
    @Nullable
    private Class824 Field8891;
    @Nullable
    private Vec3d Field8892;
    @JvmField
    @NotNull
    public static final Class204 Field8893;
    public static final Class1500 Field8894;
    private int Field8895;
    
    @NotNull
    @NotNull
    public Minecraft Method1199() {
        return this.Field8885;
    }
    
    public void Method1200(@NotNull @NotNull final Minecraft field8885) {
        Intrinsics.checkParameterIsNotNull((Object)field8885, "<set-?>");
        this.Field8885 = field8885;
    }
    
    @Nullable
    @Nullable
    public EntityLivingBase Method1201() {
        return this.Field8886;
    }
    
    public void Method1202(@Nullable @Nullable final EntityLivingBase field8886) {
        this.Field8886 = field8886;
    }
    
    @Nullable
    @Nullable
    public BlockPos Method1203() {
        return this.Field8887;
    }
    
    public void Method1204(@Nullable @Nullable final BlockPos field8887) {
        this.Field8887 = field8887;
    }
    
    public float Method1205() {
        return this.Field8888;
    }
    
    public void Method1206(final float field8888) {
        this.Field8888 = field8888;
    }
    
    public float Method1207() {
        return this.Field8889;
    }
    
    public void Method1208(final float field8889) {
        this.Field8889 = field8889;
    }
    
    @Nullable
    @Nullable
    public EnumFacing Method1209() {
        return this.Field8890;
    }
    
    public void Method1210(@Nullable @Nullable final EnumFacing field8890) {
        this.Field8890 = field8890;
    }
    
    @Nullable
    @Nullable
    public Class824 Method1211() {
        return this.Field8891;
    }
    
    public void Method1212(@Nullable @Nullable final Class824 field8891) {
        this.Field8891 = field8891;
    }
    
    @Nullable
    @Nullable
    public Vec3d Method1213() {
        return this.Field8892;
    }
    
    public void Method1214(@Nullable @Nullable final Vec3d field8892) {
        this.Field8892 = field8892;
    }
    
    public Class204(@Nullable @Nullable final EntityLivingBase field8886, @Nullable @Nullable final BlockPos field8887, final float field8888, final float field8889, @Nullable @Nullable final EnumFacing field8890, @Nullable @Nullable final Class824 field8891, @Nullable @Nullable final Vec3d field8892) {
        this.Field8886 = field8886;
        this.Field8887 = field8887;
        this.Field8888 = field8888;
        this.Field8889 = field8889;
        this.Field8890 = field8890;
        this.Field8891 = field8891;
        this.Field8892 = field8892;
        final Minecraft getMinecraft = Minecraft.getMinecraft();
        Intrinsics.checkExpressionValueIsNotNull((Object)getMinecraft, "Minecraft.getMinecraft()");
        this.Field8885 = getMinecraft;
    }
    
    static {
        Field8894 = new Class1500((DefaultConstructorMarker)null);
        Field8893 = new Class204((EntityLivingBase)new Class128((World)null), BlockPos.ORIGIN, FloatCompanionObject.INSTANCE.getNaN(), FloatCompanionObject.INSTANCE.getNaN(), EnumFacing.UP, Class824.Field11512.Method4229(), Vec3d.ZERO);
    }
    
    private static String Method1215(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x124 ^ 0x1F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
