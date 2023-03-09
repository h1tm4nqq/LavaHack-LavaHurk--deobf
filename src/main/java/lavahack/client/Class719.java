//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.entity.Entity
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.NotNull;

@SideOnly(value=Side.CLIENT)
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2={"Lcom/kisman/cc/util/entity/EntityVoid;", "Lnet/minecraft/entity/Entity;", "world", "Lnet/minecraft/world/World;", "id", "", "(Lnet/minecraft/world/World;I)V", "getId", "()I", "getWorld", "()Lnet/minecraft/world/World;", "entityInit", "", "readEntityFromNBT", "p0", "Lnet/minecraft/nbt/NBTTagCompound;", "writeEntityToNBT", "kisman.cc"})
public final class Class719
extends Entity {
    @NotNull
    private final World Field11074;
    private final int Field11075;
    private String Field11076 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    protected void entityInit() {
    }

    protected void readEntityFromNBT(@NotNull @NotNull NBTTagCompound nBTTagCompound) {
        Intrinsics.checkParameterIsNotNull((Object)nBTTagCompound, (String)"p0");
    }

    protected void writeEntityToNBT(@NotNull @NotNull NBTTagCompound nBTTagCompound) {
        Intrinsics.checkParameterIsNotNull((Object)nBTTagCompound, (String)"p0");
    }

    @NotNull
    @NotNull
    public final World getWorld() {
        return this.Field11074;
    }

    public final int getId() {
        return this.Field11075;
    }

    public Class719(@NotNull @NotNull World world, int n) {
        Intrinsics.checkParameterIsNotNull((Object)world, (String)"world");
        super(world);
        this.Field11074 = world;
        this.Field11075 = n;
        this.setEntityId(this.Field11075);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 49;
            cArray2[n] = (char)(cArray[n] ^ (0x4BB4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

