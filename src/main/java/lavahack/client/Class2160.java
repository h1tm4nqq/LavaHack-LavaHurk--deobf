//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.entity.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;
import net.minecraft.client.entity.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007\b\u0016?\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004?\u0006\u0002\u0010\u0005J\u0006\u0010\u0017\u001a\u00020\u0000R\u0011\u0010\u0003\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\tX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\tX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r?\u0006\u0018" }, d2 = { "Lcom/kisman/cc/util/entity/RotationSaver;", "", "()V", "entity", "Lnet/minecraft/entity/Entity;", "(Lnet/minecraft/entity/Entity;)V", "getEntity", "()Lnet/minecraft/entity/Entity;", "renderYawOffset", "", "getRenderYawOffset", "()F", "setRenderYawOffset", "(F)V", "rotationPitch", "getRotationPitch", "setRotationPitch", "rotationYaw", "getRotationYaw", "setRotationYaw", "rotationYawHead", "getRotationYawHead", "setRotationYawHead", "save", "kisman.cc" })
public final class Class2160
{
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
    
    public final void Method7786(final float field17870) {
        this.Field17870 = field17870;
    }
    
    public final float Method7787() {
        return this.Field17871;
    }
    
    public final void Method7788(final float field17871) {
        this.Field17871 = field17871;
    }
    
    public final float Method7789() {
        return this.Field17872;
    }
    
    public final void Method7790(final float field17872) {
        this.Field17872 = field17872;
    }
    
    public final float Method7791() {
        return this.Field17873;
    }
    
    public final void Method7792(final float field17873) {
        this.Field17873 = field17873;
    }
    
    @NotNull
    @NotNull
    public final Class2160 Method7793() {
        this.Field17870 = this.Field17874.rotationYaw;
        this.Field17871 = this.Field17874.rotationPitch;
        this.Field17872 = this.Field17874.getRotationYawHead();
        this.Field17873 = ((this.Field17874 instanceof EntityLivingBase) ? ((EntityLivingBase)this.Field17874).renderYawOffset : this.Field17874.rotationYaw);
        return this;
    }
    
    @NotNull
    @NotNull
    public final Entity Method7794() {
        return this.Field17874;
    }
    
    public Class2160(@NotNull @NotNull final Entity field17874) {
        Intrinsics.checkParameterIsNotNull((Object)field17874, "entity");
        this.Field17874 = field17874;
    }
    
    public Class2160() {
        final EntityPlayerSP player = Minecraft.getMinecraft().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player, "Minecraft.getMinecraft().player");
        this((Entity)player);
    }
    
    private static String Method7795(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x33F6 ^ 0x5A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
