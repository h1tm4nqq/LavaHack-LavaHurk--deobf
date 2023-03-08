//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import net.minecraftforge.fml.relauncher.*;
import kotlin.*;
import net.minecraft.world.*;
import org.jetbrains.annotations.*;
import net.minecraft.nbt.*;
import kotlin.jvm.internal.*;

@SideOnly(Side.CLIENT)
@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014R\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n?\u0006\u0011" }, d2 = { "Lcom/kisman/cc/util/entity/EntityVoid;", "Lnet/minecraft/entity/Entity;", "world", "Lnet/minecraft/world/World;", "id", "", "(Lnet/minecraft/world/World;I)V", "getId", "()I", "getWorld", "()Lnet/minecraft/world/World;", "entityInit", "", "readEntityFromNBT", "p0", "Lnet/minecraft/nbt/NBTTagCompound;", "writeEntityToNBT", "kisman.cc" })
public final class Class719 extends Entity
{
    @NotNull
    private final World Field11074;
    private final int Field11075;
    private String Field11076 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    protected void entityInit() {
    }
    
    protected void readEntityFromNBT(@NotNull @NotNull final NBTTagCompound nbtTagCompound) {
        Intrinsics.checkParameterIsNotNull((Object)nbtTagCompound, "p0");
    }
    
    protected void writeEntityToNBT(@NotNull @NotNull final NBTTagCompound nbtTagCompound) {
        Intrinsics.checkParameterIsNotNull((Object)nbtTagCompound, "p0");
    }
    
    @NotNull
    @NotNull
    public final World getWorld() {
        return this.Field11074;
    }
    
    public final int getId() {
        return this.Field11075;
    }
    
    public Class719(@NotNull @NotNull final World field11074, final int field11075) {
        Intrinsics.checkParameterIsNotNull((Object)field11074, "world");
        super(field11074);
        this.Field11074 = field11074;
        this.setEntityId(this.Field11075 = field11075);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4BB4 ^ 0x31));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
