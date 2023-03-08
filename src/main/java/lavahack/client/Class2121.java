//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.entity.*;
import net.minecraft.client.entity.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086\bJ\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\f\u001a\u00020\u0005H\u0086\bJ)\u0010\r\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0086\b?\u0006\u0012" }, d2 = { "Lcom/kisman/cc/features/module/combat/autorer/PlaceInfo$Mutable;", "Lcom/kisman/cc/features/module/combat/autorer/PlaceInfo;", "target", "Lnet/minecraft/entity/EntityLivingBase;", "minDamage", "", "(Lnet/minecraft/entity/EntityLivingBase;F)V", "clear", "", "player", "Lnet/minecraft/client/entity/EntityPlayerSP;", "takeValid", "damage", "update", "blockPos", "Lnet/minecraft/util/math/BlockPos;", "selfDamage", "targetDamage", "kisman.cc" })
public final class Class2121 extends Class204
{
    private String Field17656 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final void Method7659(@NotNull @NotNull final EntityLivingBase entityLivingBase, @NotNull @NotNull final BlockPos blockPos, final float n, final float n2) {
        Intrinsics.checkParameterIsNotNull((Object)entityLivingBase, "target");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "blockPos");
        this.Method1202(entityLivingBase);
        this.Method1204(blockPos);
        this.Method1206(n);
        this.Method1208(n2);
    }
    
    public final void Method7660(@NotNull @NotNull final EntityPlayerSP entityPlayerSP) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayerSP, "player");
        final BlockPos ORIGIN = BlockPos.ORIGIN;
        Intrinsics.checkExpressionValueIsNotNull((Object)ORIGIN, "BlockPos.ORIGIN");
        final BlockPos blockPos = ORIGIN;
        final float max_VALUE = FloatCompanionObject.INSTANCE.getMAX_VALUE();
        final float method1207 = this.Method1207();
        this.Method1202((EntityLivingBase)entityPlayerSP);
        this.Method1204(blockPos);
        this.Method1206(max_VALUE);
        this.Method1208(method1207);
    }
    
    @Nullable
    @Nullable
    public final Class2121 Method7661(final float n) {
        final Class2121 class2121 = this;
        if ((Intrinsics.areEqual((Object)this.Method1201(), (Object)this.Method1199().player) ^ true) && this.Method1205() != FloatCompanionObject.INSTANCE.getMAX_VALUE() && this.Method1207() != n) {}
        return null;
    }
    
    public Class2121(@NotNull @NotNull final EntityLivingBase entityLivingBase, final float n) {
        Intrinsics.checkParameterIsNotNull((Object)entityLivingBase, "target");
        super(entityLivingBase, BlockPos.ORIGIN, FloatCompanionObject.INSTANCE.getMAX_VALUE(), n, EnumFacing.UP, Class824.Field11512.Method4229(), Vec3d.ZERO);
    }
    
    private static String Method1215(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3030 ^ 0xAD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
