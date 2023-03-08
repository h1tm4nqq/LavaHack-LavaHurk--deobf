//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.entity.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.math.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007?\u0006\u0002\u0010\bR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014?\u0006\u0015" }, d2 = { "Lcom/kisman/cc/features/module/combat/autocrystalpvp/PlaceInfo;", "", "target", "Lnet/minecraft/entity/Entity;", "pos", "Lnet/minecraft/util/math/BlockPos;", "damage", "", "(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/BlockPos;F)V", "getDamage", "()F", "setDamage", "(F)V", "getPos", "()Lnet/minecraft/util/math/BlockPos;", "setPos", "(Lnet/minecraft/util/math/BlockPos;)V", "getTarget", "()Lnet/minecraft/entity/Entity;", "setTarget", "(Lnet/minecraft/entity/Entity;)V", "kisman.cc" })
public final class Class387
{
    @NotNull
    private Entity Field9621;
    @NotNull
    private BlockPos Field9622;
    private float Field9623;
    private String Field9624 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Entity Method1864() {
        return this.Field9621;
    }
    
    public final void Method1865(@NotNull @NotNull final Entity field9621) {
        Intrinsics.checkParameterIsNotNull((Object)field9621, "<set-?>");
        this.Field9621 = field9621;
    }
    
    @NotNull
    @NotNull
    public final BlockPos Method1866() {
        return this.Field9622;
    }
    
    public final void Method1867(@NotNull @NotNull final BlockPos field9622) {
        Intrinsics.checkParameterIsNotNull((Object)field9622, "<set-?>");
        this.Field9622 = field9622;
    }
    
    public final float Method1868() {
        return this.Field9623;
    }
    
    public final void Method1869(final float field9623) {
        this.Field9623 = field9623;
    }
    
    public Class387(@NotNull @NotNull final Entity field9621, @NotNull @NotNull final BlockPos field9622, final float field9623) {
        Intrinsics.checkParameterIsNotNull((Object)field9621, "target");
        Intrinsics.checkParameterIsNotNull((Object)field9622, "pos");
        this.Field9621 = field9621;
        this.Field9622 = field9622;
        this.Field9623 = field9623;
    }
    
    private static String Method1870(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5D59 ^ 0xFC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
