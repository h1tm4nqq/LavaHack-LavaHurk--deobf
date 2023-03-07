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
public class EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN
extends BlockPos {
    public int Field7895;
    public int Field7896;
    public int Field7897;
    private String Field7898 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN() {
        this((int)951598074L ^ 0x38B83BFA, (int)((long)1647750874 ^ (long)1647750874), (int)((long)-1922780766 ^ (long)-1922780766));
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN(Entity entity) {
        this(entity.posX, entity.posY, entity.posZ);
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN(Vec3d vec3d) {
        this(vec3d.x, vec3d.y, vec3d.z);
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN(Vec3i vec3i) {
        this(vec3i.getX(), vec3i.getY(), vec3i.getZ());
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN(double d, double d2, double d3) {
        this(MathHelper.floor((double)d), MathHelper.floor((double)d2), MathHelper.floor((double)d3));
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN(int n, int n2, int n3) {
        super((int)((long)-680103987 ^ (long)-680103987), (int)((long)-261976096 ^ (long)-261976096), (int)((long)1862757297 ^ (long)1862757297));
        this.Field7895 = n;
        this.Field7896 = n2;
        this.Field7897 = n3;
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN set(Entity entity) {
        return this.set(entity.posX, entity.posY, entity.posZ);
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN set(Vec3d vec3d) {
        return this.set(vec3d.x, vec3d.y, vec3d.z);
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN set(Vec3i vec3i) {
        return this.set(vec3i.getX(), vec3i.getY(), vec3i.getZ());
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN set(double d, double d2, double d3) {
        return this.set(MathHelper.floor((double)d), MathHelper.floor((double)d2), MathHelper.floor((double)d3));
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN set(int n, int n2, int n3) {
        this.Field7895 = n;
        this.Field7896 = n2;
        this.Field7897 = n3;
        return this;
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN add(Vec3i vec3i) {
        return this.add(vec3i.getX(), vec3i.getY(), vec3i.getZ());
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN add(double d, double d2, double d3) {
        return this.add(MathHelper.floor((double)d), MathHelper.floor((double)d2), MathHelper.floor((double)d3));
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN add(int n, int n2, int n3) {
        return new EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN(this.Field7895 + n, this.Field7896 + n2, this.Field7897 + n3);
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN multiply(int n) {
        return new EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN(this.Field7895 * n, this.Field7896 * n, this.Field7897 * n);
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN subtract(Vec3i vec3i) {
        return this.subtract(vec3i.getX(), vec3i.getY(), vec3i.getZ());
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN subtract(double d, double d2, double d3) {
        return this.subtract(MathHelper.floor((double)d), MathHelper.floor((double)d2), MathHelper.floor((double)d3));
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN subtract(int n, int n2, int n3) {
        return new EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN(this.Field7895 - n, this.Field7896 - n2, this.Field7897 - n3);
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN up() {
        return this.up((int)((long)366966045 ^ (long)366966044));
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN up(int n) {
        return this.offset(EnumFacing.UP, n);
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN down() {
        return this.down((int)-1693915760L ^ 0x9B08E591);
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN down(int n) {
        return this.offset(EnumFacing.DOWN, n);
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN north() {
        return this.north((int)((long)-1955333589 ^ (long)-1955333590));
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN north(int n) {
        return this.offset(EnumFacing.NORTH, n);
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN south() {
        return this.south((int)-1315097775L ^ 0xB19D3350);
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN south(int n) {
        return this.offset(EnumFacing.SOUTH, n);
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN west() {
        return this.west((int)-935202359L ^ 0xC841F1C8);
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN west(int n) {
        return this.offset(EnumFacing.WEST, n);
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN east() {
        return this.east((int)((long)1803599918 ^ (long)1803599919));
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN east(int n) {
        return this.offset(EnumFacing.EAST, n);
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN offset(EnumFacing enumFacing) {
        return this.offset(enumFacing, (int)-960861690L ^ 0xC6BA6A07);
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN offset(EnumFacing enumFacing, int n) {
        return new EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN(this.Field7895 + enumFacing.getXOffset() * n, this.Field7896 + enumFacing.getYOffset() * n, this.Field7897 + enumFacing.getZOffset() * n);
    }

    public EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN crossProduct(Vec3i vec3i) {
        return new EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN(this.Field7896 * vec3i.getZ() - this.Field7897 * vec3i.getY(), this.Field7897 * vec3i.getX() - this.Field7895 * vec3i.getZ(), this.Field7895 * vec3i.getY() - this.Field7896 * vec3i.getX());
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

