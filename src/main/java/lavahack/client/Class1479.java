//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.block.state.pattern.BlockStateMatcher
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.entity.Entity
 *  net.minecraft.init.Biomes
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.ItemStack
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.EnumDifficulty
 *  net.minecraft.world.EnumSkyBlock
 *  net.minecraft.world.GameType
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldSettings
 *  net.minecraft.world.WorldType
 *  net.minecraft.world.biome.Biome
 *  net.minecraft.world.chunk.IChunkProvider
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package lavahack.client;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lavahack.client.Class1129;
import lavahack.client.Class16;
import lavahack.client.Class2033;
import lavahack.client.Class617;
import lavahack.client.Class686;
import lavahack.client.Class777;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockStateMatcher;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.GameType;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Class1479
extends WorldClient {
    private static final WorldSettings Field14894 = new WorldSettings(0L, GameType.CREATIVE, false, false, WorldType.FLAT);
    private Class686 Field14895;
    public final Class16 Field14896 = new Class16();
    public boolean Field14897 = false;
    public Class617 Field14898 = Class617.Field10633;
    public int Field14899 = 0;
    private String Field14900 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1479(Class686 class686) {
        super(null, Field14894, 0, EnumDifficulty.PEACEFUL, Minecraft.getMinecraft().profiler);
        this.Field14895 = class686;
        Iterator iterator = class686.Method2883().iterator();
        while (iterator.hasNext()) {
            TileEntity tileEntity = (TileEntity)iterator.next();
            this.initializeTileEntity(tileEntity);
        }
    }

    public IBlockState getBlockState(BlockPos blockPos) {
        if (this.Field14898.Method1104(this, blockPos.getY())) return this.Field14895.Method2880(blockPos);
        return Blocks.AIR.getDefaultState();
    }

    public boolean setBlockState(BlockPos blockPos, IBlockState iBlockState, int n) {
        return this.Field14895.Method2881(blockPos, iBlockState);
    }

    public TileEntity getTileEntity(BlockPos blockPos) {
        if (this.Field14898.Method1104(this, blockPos.getY())) return this.Field14895.Method2882(blockPos);
        return null;
    }

    public void setTileEntity(BlockPos blockPos, TileEntity tileEntity) {
        this.Field14895.Method2884(blockPos, tileEntity);
        this.initializeTileEntity(tileEntity);
    }

    public void removeTileEntity(BlockPos blockPos) {
        this.Field14895.Method2885(blockPos);
    }

    @SideOnly(value=Side.CLIENT)
    @SideOnly(value=Side.CLIENT)
    public int getLightFromNeighborsFor(EnumSkyBlock enumSkyBlock, BlockPos blockPos) {
        return 15;
    }

    public float getLightBrightness(BlockPos blockPos) {
        return 1.0f;
    }

    public boolean isBlockNormalCube(BlockPos blockPos, boolean bl) {
        return this.getBlockState(blockPos).isNormalCube();
    }

    public void calculateInitialSkylight() {
    }

    protected void calculateInitialWeather() {
    }

    public void setSpawnPoint(BlockPos blockPos) {
    }

    public boolean isAirBlock(BlockPos blockPos) {
        IBlockState iBlockState = this.getBlockState(blockPos);
        return iBlockState.getBlock().isAir(iBlockState, (IBlockAccess)this, blockPos);
    }

    public Biome getBiome(BlockPos blockPos) {
        return Biomes.JUNGLE;
    }

    public int getWidth() {
        return this.Field14895.Method2891();
    }

    public int getLength() {
        return this.Field14895.Method2892();
    }

    public int getHeight() {
        return this.Field14895.Method2893();
    }

    public IChunkProvider createChunkProvider() {
        this.chunkProvider = new Class1129(this);
        return this.chunkProvider;
    }

    public Entity getEntityByID(int n) {
        return null;
    }

    public boolean isSideSolid(BlockPos blockPos, EnumFacing enumFacing) {
        return this.isSideSolid(blockPos, enumFacing, false);
    }

    public boolean isSideSolid(BlockPos blockPos, EnumFacing enumFacing, boolean bl) {
        return this.getBlockState(blockPos).isSideSolid((IBlockAccess)this, blockPos, enumFacing);
    }

    public void setSchematic(Class686 class686) {
        this.Field14895 = class686;
    }

    public Class686 getSchematic() {
        return this.Field14895;
    }

    public void initializeTileEntity(TileEntity tileEntity) {
        tileEntity.setWorld((World)this);
        tileEntity.getBlockType();
        tileEntity.invalidate();
        tileEntity.validate();
    }

    public void setIcon(ItemStack itemStack) {
        this.Field14895.Method2890(itemStack);
    }

    public ItemStack getIcon() {
        return this.Field14895.Method2889();
    }

    public List getTileEntities() {
        return this.Field14895.Method2883();
    }

    public boolean toggleRendering() {
        this.Field14897 = !this.Field14897;
        return this.Field14897;
    }

    public String getDebugDimensions() {
        return "WHL: " + this.getWidth() + " / " + this.getHeight() + " / " + this.getLength();
    }

    public int replaceBlock(BlockStateMatcher blockStateMatcher, Class2033 class2033, Map map) {
        int n = 0;
        Iterator iterator = Class777.Method3239(0, 0, 0, this.getWidth(), this.getHeight(), this.getLength()).iterator();
        while (iterator.hasNext()) {
            IBlockState iBlockState;
            Class16 class16 = (Class16)((Object)iterator.next());
            IBlockState iBlockState2 = this.Field14895.Method2880(class16);
            if (iBlockState2.getBlock().hasTileEntity(iBlockState2) || !blockStateMatcher.apply(iBlockState2) || (iBlockState = class2033.Method7522(iBlockState2, map)).getBlock().hasTileEntity(iBlockState) || !this.Field14895.Method2881(class16, iBlockState)) continue;
            this.notifyBlockUpdate(class16.add((Vec3i)this.Field14896), iBlockState2, iBlockState, 3);
            ++n;
        }
        return n;
    }

    public boolean isInside(BlockPos blockPos) {
        int n = blockPos.getX();
        int n2 = blockPos.getY();
        int n3 = blockPos.getZ();
        if (n < 0) return false;
        if (n2 < 0) return false;
        if (n3 < 0) return false;
        if (n >= this.getWidth()) return false;
        if (n2 >= this.getHeight()) return false;
        if (n3 >= this.getLength()) return false;
        return true;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 192;
            cArray2[n] = (char)(cArray[n] ^ (0x61FB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

