//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.util.*;

public class Class16 extends BlockPos
{
    public int Field7895;
    public int Field7896;
    public int Field7897;
    private String Field7898 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class16() {
        this(0, 0, 0);
    }
    
    public Class16(final Entity entity) {
        this(entity.posX, entity.posY, entity.posZ);
    }
    
    public Class16(final Vec3d vec3d) {
        this(vec3d.x, vec3d.y, vec3d.z);
    }
    
    public Class16(final Vec3i vec3i) {
        this(vec3i.getX(), vec3i.getY(), vec3i.getZ());
    }
    
    public Class16(final double n, final double n2, final double n3) {
        this(MathHelper.floor(n), MathHelper.floor(n2), MathHelper.floor(n3));
    }
    
    public Class16(final int field7895, final int field7896, final int field7897) {
        super(0, 0, 0);
        this.Field7895 = field7895;
        this.Field7896 = field7896;
        this.Field7897 = field7897;
    }
    
    public Class16 set(final Entity entity) {
        return this.set(entity.posX, entity.posY, entity.posZ);
    }
    
    public Class16 set(final Vec3d vec3d) {
        return this.set(vec3d.x, vec3d.y, vec3d.z);
    }
    
    public Class16 set(final Vec3i vec3i) {
        return this.set(vec3i.getX(), vec3i.getY(), vec3i.getZ());
    }
    
    public Class16 set(final double n, final double n2, final double n3) {
        return this.set(MathHelper.floor(n), MathHelper.floor(n2), MathHelper.floor(n3));
    }
    
    public Class16 set(final int field7895, final int field7896, final int field7897) {
        this.Field7895 = field7895;
        this.Field7896 = field7896;
        this.Field7897 = field7897;
        return this;
    }
    
    public Class16 add(final Vec3i vec3i) {
        return this.add(vec3i.getX(), vec3i.getY(), vec3i.getZ());
    }
    
    public Class16 add(final double n, final double n2, final double n3) {
        return this.add(MathHelper.floor(n), MathHelper.floor(n2), MathHelper.floor(n3));
    }
    
    public Class16 add(final int n, final int n2, final int n3) {
        return new Class16(this.Field7895 + n, this.Field7896 + n2, this.Field7897 + n3);
    }
    
    public Class16 multiply(final int n) {
        return new Class16(this.Field7895 * n, this.Field7896 * n, this.Field7897 * n);
    }
    
    public Class16 subtract(final Vec3i vec3i) {
        return this.subtract(vec3i.getX(), vec3i.getY(), vec3i.getZ());
    }
    
    public Class16 subtract(final double n, final double n2, final double n3) {
        return this.subtract(MathHelper.floor(n), MathHelper.floor(n2), MathHelper.floor(n3));
    }
    
    public Class16 subtract(final int n, final int n2, final int n3) {
        return new Class16(this.Field7895 - n, this.Field7896 - n2, this.Field7897 - n3);
    }
    
    public Class16 up() {
        return this.up(1);
    }
    
    public Class16 up(final int n) {
        return this.offset(EnumFacing.UP, n);
    }
    
    public Class16 down() {
        return this.down(1);
    }
    
    public Class16 down(final int n) {
        return this.offset(EnumFacing.DOWN, n);
    }
    
    public Class16 north() {
        return this.north(1);
    }
    
    public Class16 north(final int n) {
        return this.offset(EnumFacing.NORTH, n);
    }
    
    public Class16 south() {
        return this.south(1);
    }
    
    public Class16 south(final int n) {
        return this.offset(EnumFacing.SOUTH, n);
    }
    
    public Class16 west() {
        return this.west(1);
    }
    
    public Class16 west(final int n) {
        return this.offset(EnumFacing.WEST, n);
    }
    
    public Class16 east() {
        return this.east(1);
    }
    
    public Class16 east(final int n) {
        return this.offset(EnumFacing.EAST, n);
    }
    
    public Class16 offset(final EnumFacing enumFacing) {
        return this.offset(enumFacing, 1);
    }
    
    public Class16 offset(final EnumFacing enumFacing, final int n) {
        return new Class16(this.Field7895 + enumFacing.getXOffset() * n, this.Field7896 + enumFacing.getYOffset() * n, this.Field7897 + enumFacing.getZOffset() * n);
    }
    
    public Class16 crossProduct(final Vec3i vec3i) {
        return new Class16(this.Field7896 * vec3i.getZ() - this.Field7897 * vec3i.getY(), this.Field7897 * vec3i.getX() - this.Field7895 * vec3i.getZ(), this.Field7895 * vec3i.getY() - this.Field7896 * vec3i.getX());
    }
    
    public BlockPos toImmutable() {
        return new BlockPos((Vec3i)this);
    }
    
    public int getX() {
        return this.Field7895;
    }
    
    public int getY() {
        return this.Field7896;
    }
    
    public int getZ() {
        return this.Field7897;
    }
    
    public BlockPos crossProduct(final Vec3i vec3i) {
        return this.crossProduct(vec3i);
    }
    
    public BlockPos offset(final EnumFacing enumFacing, final int n) {
        return this.offset(enumFacing, n);
    }
    
    public BlockPos offset(final EnumFacing enumFacing) {
        return this.offset(enumFacing);
    }
    
    public BlockPos east(final int n) {
        return this.east(n);
    }
    
    public BlockPos east() {
        return this.east();
    }
    
    public BlockPos west(final int n) {
        return this.west(n);
    }
    
    public BlockPos west() {
        return this.west();
    }
    
    public BlockPos south(final int n) {
        return this.south(n);
    }
    
    public BlockPos south() {
        return this.south();
    }
    
    public BlockPos north(final int n) {
        return this.north(n);
    }
    
    public BlockPos north() {
        return this.north();
    }
    
    public BlockPos down(final int n) {
        return this.down(n);
    }
    
    public BlockPos down() {
        return this.down();
    }
    
    public BlockPos up(final int n) {
        return this.up(n);
    }
    
    public BlockPos up() {
        return this.up();
    }
    
    public BlockPos subtract(final Vec3i vec3i) {
        return this.subtract(vec3i);
    }
    
    public BlockPos add(final Vec3i vec3i) {
        return this.add(vec3i);
    }
    
    public BlockPos add(final int n, final int n2, final int n3) {
        return this.add(n, n2, n3);
    }
    
    public BlockPos add(final double n, final double n2, final double n3) {
        return this.add(n, n2, n3);
    }
    
    public Vec3i crossProduct(final Vec3i vec3i) {
        return (Vec3i)this.crossProduct(vec3i);
    }
}
