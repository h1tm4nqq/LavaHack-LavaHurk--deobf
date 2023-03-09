//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 */
package lavahack.client;

import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Class16
extends BlockPos {
    public int Field7895;
    public int Field7896;
    public int Field7897;
    private String Field7898 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class16() {
        this(0, 0, 0);
    }

    public Class16(Entity entity) {
        this(entity.posX, entity.posY, entity.posZ);
    }

    public Class16(Vec3d vec3d) {
        this(vec3d.x, vec3d.y, vec3d.z);
    }

    public Class16(Vec3i vec3i) {
        this(vec3i.getX(), vec3i.getY(), vec3i.getZ());
    }

    public Class16(double d, double d2, double d3) {
        this(MathHelper.floor((double)d), MathHelper.floor((double)d2), MathHelper.floor((double)d3));
    }

    public Class16(int n, int n2, int n3) {
        super(0, 0, 0);
        this.Field7895 = n;
        this.Field7896 = n2;
        this.Field7897 = n3;
    }

    public Class16 set(Entity entity) {
        return this.set(entity.posX, entity.posY, entity.posZ);
    }

    public Class16 set(Vec3d vec3d) {
        return this.set(vec3d.x, vec3d.y, vec3d.z);
    }

    public Class16 set(Vec3i vec3i) {
        return this.set(vec3i.getX(), vec3i.getY(), vec3i.getZ());
    }

    public Class16 set(double d, double d2, double d3) {
        return this.set(MathHelper.floor((double)d), MathHelper.floor((double)d2), MathHelper.floor((double)d3));
    }

    public Class16 set(int n, int n2, int n3) {
        this.Field7895 = n;
        this.Field7896 = n2;
        this.Field7897 = n3;
        return this;
    }

    public Class16 add(Vec3i vec3i) {
        return this.add(vec3i.getX(), vec3i.getY(), vec3i.getZ());
    }

    public Class16 add(double d, double d2, double d3) {
        return this.add(MathHelper.floor((double)d), MathHelper.floor((double)d2), MathHelper.floor((double)d3));
    }

    public Class16 add(int n, int n2, int n3) {
        return new Class16(this.Field7895 + n, this.Field7896 + n2, this.Field7897 + n3);
    }

    public Class16 multiply(int n) {
        return new Class16(this.Field7895 * n, this.Field7896 * n, this.Field7897 * n);
    }

    public Class16 subtract(Vec3i vec3i) {
        return this.subtract(vec3i.getX(), vec3i.getY(), vec3i.getZ());
    }

    public Class16 subtract(double d, double d2, double d3) {
        return this.subtract(MathHelper.floor((double)d), MathHelper.floor((double)d2), MathHelper.floor((double)d3));
    }

    public Class16 subtract(int n, int n2, int n3) {
        return new Class16(this.Field7895 - n, this.Field7896 - n2, this.Field7897 - n3);
    }

    public Class16 up() {
        return this.up(1);
    }

    public Class16 up(int n) {
        return this.offset(EnumFacing.UP, n);
    }

    public Class16 down() {
        return this.down(1);
    }

    public Class16 down(int n) {
        return this.offset(EnumFacing.DOWN, n);
    }

    public Class16 north() {
        return this.north(1);
    }

    public Class16 north(int n) {
        return this.offset(EnumFacing.NORTH, n);
    }

    public Class16 south() {
        return this.south(1);
    }

    public Class16 south(int n) {
        return this.offset(EnumFacing.SOUTH, n);
    }

    public Class16 west() {
        return this.west(1);
    }

    public Class16 west(int n) {
        return this.offset(EnumFacing.WEST, n);
    }

    public Class16 east() {
        return this.east(1);
    }

    public Class16 east(int n) {
        return this.offset(EnumFacing.EAST, n);
    }

    public Class16 offset(EnumFacing enumFacing) {
        return this.offset(enumFacing, 1);
    }

    public Class16 offset(EnumFacing enumFacing, int n) {
        return new Class16(this.Field7895 + enumFacing.getXOffset() * n, this.Field7896 + enumFacing.getYOffset() * n, this.Field7897 + enumFacing.getZOffset() * n);
    }

    public Class16 crossProduct(Vec3i vec3i) {
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

    public BlockPos crossProduct(Vec3i vec3i) {
        return this.crossProduct(vec3i);
    }

    public BlockPos offset(EnumFacing enumFacing, int n) {
        return this.offset(enumFacing, n);
    }

    public BlockPos offset(EnumFacing enumFacing) {
        return this.offset(enumFacing);
    }

    public BlockPos east(int n) {
        return this.east(n);
    }

    public BlockPos east() {
        return this.east();
    }

    public BlockPos west(int n) {
        return this.west(n);
    }

    public BlockPos west() {
        return this.west();
    }

    public BlockPos south(int n) {
        return this.south(n);
    }

    public BlockPos south() {
        return this.south();
    }

    public BlockPos north(int n) {
        return this.north(n);
    }

    public BlockPos north() {
        return this.north();
    }

    public BlockPos down(int n) {
        return this.down(n);
    }

    public BlockPos down() {
        return this.down();
    }

    public BlockPos up(int n) {
        return this.up(n);
    }

    public BlockPos up() {
        return this.up();
    }

    public BlockPos subtract(Vec3i vec3i) {
        return this.subtract(vec3i);
    }

    public BlockPos add(Vec3i vec3i) {
        return this.add(vec3i);
    }

    public BlockPos add(int n, int n2, int n3) {
        return this.add(n, n2, n3);
    }

    public BlockPos add(double d, double d2, double d3) {
        return this.add(d, d2, d3);
    }

    public Vec3i crossProduct(Vec3i vec3i) {
        return this.crossProduct(vec3i);
    }
}

