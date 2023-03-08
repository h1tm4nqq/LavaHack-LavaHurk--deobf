//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.entity.item.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b?\u0006\u0002\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015?\u0006\u0018" }, d2 = { "Lcom/kisman/cc/features/module/combat/autorer/BreakInfo;", "", "crystal", "Lnet/minecraft/entity/item/EntityEnderCrystal;", "selfDamage", "", "targetDamage", "ignoreDamageSync", "", "(Lnet/minecraft/entity/item/EntityEnderCrystal;FFZ)V", "getCrystal", "()Lnet/minecraft/entity/item/EntityEnderCrystal;", "setCrystal", "(Lnet/minecraft/entity/item/EntityEnderCrystal;)V", "getIgnoreDamageSync", "()Z", "setIgnoreDamageSync", "(Z)V", "getSelfDamage", "()F", "setSelfDamage", "(F)V", "getTargetDamage", "setTargetDamage", "kisman.cc" })
public final class Class885
{
    @Nullable
    private EntityEnderCrystal Field11718;
    private float Field11719;
    private float Field11720;
    private boolean Field11721;
    private int Field11722;
    
    @Nullable
    @Nullable
    public final EntityEnderCrystal Method3691() {
        return this.Field11718;
    }
    
    public final void Method3692(@Nullable @Nullable final EntityEnderCrystal field11718) {
        this.Field11718 = field11718;
    }
    
    public final float Method3693() {
        return this.Field11719;
    }
    
    public final void Method3694(final float field11719) {
        this.Field11719 = field11719;
    }
    
    public final float Method3695() {
        return this.Field11720;
    }
    
    public final void Method3696(final float field11720) {
        this.Field11720 = field11720;
    }
    
    public final boolean Method3697() {
        return this.Field11721;
    }
    
    public final void Method3698(final boolean field11721) {
        this.Field11721 = field11721;
    }
    
    public Class885(@Nullable @Nullable final EntityEnderCrystal field11718, final float field11719, final float field11720, final boolean field11721) {
        this.Field11718 = field11718;
        this.Field11719 = field11719;
        this.Field11720 = field11720;
        this.Field11721 = field11721;
    }
}
