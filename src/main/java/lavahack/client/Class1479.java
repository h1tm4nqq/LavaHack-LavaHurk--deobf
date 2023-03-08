//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.multiplayer.*;
import net.minecraft.client.*;
import net.minecraft.client.network.*;
import net.minecraft.tileentity.*;
import net.minecraft.block.state.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.world.biome.*;
import net.minecraft.init.*;
import net.minecraft.world.chunk.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import net.minecraft.item.*;
import net.minecraft.block.state.pattern.*;
import java.util.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;

public class Class1479 extends WorldClient
{
    private static final WorldSettings Field14894;
    private Class686 Field14895;
    public final Class16 Field14896;
    public boolean Field14897;
    public Class617 Field14898;
    public int Field14899;
    private String Field14900 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1479(final Class686 field14895) {
        super((NetHandlerPlayClient)null, Class1479.Field14894, 0, EnumDifficulty.PEACEFUL, Minecraft.getMinecraft().profiler);
        this.Field14896 = new Class16();
        this.Field14897 = false;
        this.Field14898 = Class617.Field10633;
        this.Field14899 = 0;
        this.Field14895 = field14895;
        final Iterator<TileEntity> iterator = field14895.Method2883().iterator();
        while (iterator.hasNext()) {
            this.initializeTileEntity(iterator.next());
        }
    }
    
    public IBlockState getBlockState(final BlockPos blockPos) {
        if (!this.Field14898.Method1104(this, blockPos.getY())) {
            return Blocks.AIR.getDefaultState();
        }
        return this.Field14895.Method2880(blockPos);
    }
    
    public boolean setBlockState(final BlockPos blockPos, final IBlockState blockState, final int n) {
        return this.Field14895.Method2881(blockPos, blockState);
    }
    
    public TileEntity getTileEntity(final BlockPos blockPos) {
        if (!this.Field14898.Method1104(this, blockPos.getY())) {
            return null;
        }
        return this.Field14895.Method2882(blockPos);
    }
    
    public void setTileEntity(final BlockPos blockPos, final TileEntity tileEntity) {
        this.Field14895.Method2884(blockPos, tileEntity);
        this.initializeTileEntity(tileEntity);
    }
    
    public void removeTileEntity(final BlockPos blockPos) {
        this.Field14895.Method2885(blockPos);
    }
    
    @SideOnly(Side.CLIENT)
    @SideOnly(Side.CLIENT)
    public int getLightFromNeighborsFor(final EnumSkyBlock enumSkyBlock, final BlockPos blockPos) {
        return 15;
    }
    
    public float getLightBrightness(final BlockPos blockPos) {
        return 1.0f;
    }
    
    public boolean isBlockNormalCube(final BlockPos blockPos, final boolean b) {
        return this.getBlockState(blockPos).isNormalCube();
    }
    
    public void calculateInitialSkylight() {
    }
    
    protected void calculateInitialWeather() {
    }
    
    public void setSpawnPoint(final BlockPos blockPos) {
    }
    
    public boolean isAirBlock(final BlockPos blockPos) {
        final IBlockState getBlockState = this.getBlockState(blockPos);
        return getBlockState.getBlock().isAir(getBlockState, (IBlockAccess)this, blockPos);
    }
    
    public Biome getBiome(final BlockPos blockPos) {
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
        return this.chunkProvider = (IChunkProvider)new Class1129(this);
    }
    
    public Entity getEntityByID(final int n) {
        return null;
    }
    
    public boolean isSideSolid(final BlockPos blockPos, final EnumFacing enumFacing) {
        return this.isSideSolid(blockPos, enumFacing, false);
    }
    
    public boolean isSideSolid(final BlockPos blockPos, final EnumFacing enumFacing, final boolean b) {
        return this.getBlockState(blockPos).isSideSolid((IBlockAccess)this, blockPos, enumFacing);
    }
    
    public void setSchematic(final Class686 field14895) {
        this.Field14895 = field14895;
    }
    
    public Class686 getSchematic() {
        return this.Field14895;
    }
    
    public void initializeTileEntity(final TileEntity tileEntity) {
        tileEntity.setWorld((World)this);
        tileEntity.getBlockType();
        tileEntity.invalidate();
        tileEntity.validate();
    }
    
    public void setIcon(final ItemStack itemStack) {
        this.Field14895.Method2890(itemStack);
    }
    
    public ItemStack getIcon() {
        return this.Field14895.Method2889();
    }
    
    public List getTileEntities() {
        return this.Field14895.Method2883();
    }
    
    public boolean toggleRendering() {
        return this.Field14897 = !this.Field14897;
    }
    
    public String getDebugDimensions() {
        return "WHL: " + this.getWidth() + " / " + this.getHeight() + " / " + this.getLength();
    }
    
    public int replaceBlock(final BlockStateMatcher blockStateMatcher, final Class2033 class2033, final Map map) {
        int n = 0;
        for (final Class16 class2034 : Class777.Method3239(0, 0, 0, this.getWidth(), this.getHeight(), this.getLength())) {
            final IBlockState method2880 = this.Field14895.Method2880(class2034);
            if (method2880.getBlock().hasTileEntity(method2880)) {
                continue;
            }
            if (!blockStateMatcher.apply(method2880)) {
                continue;
            }
            final IBlockState method2881 = class2033.Method7522(method2880, map);
            if (method2881.getBlock().hasTileEntity(method2881)) {
                continue;
            }
            if (!this.Field14895.Method2881(class2034, method2881)) {
                continue;
            }
            this.notifyBlockUpdate((BlockPos)class2034.add((Vec3i)this.Field14896), method2880, method2881, 3);
            ++n;
        }
        return n;
    }
    
    public boolean isInside(final BlockPos blockPos) {
        final int getX = blockPos.getX();
        final int getY = blockPos.getY();
        final int getZ = blockPos.getZ();
        return getX >= 0 && getY >= 0 && getZ >= 0 && getX < this.getWidth() && getY < this.getHeight() && getZ < this.getLength();
    }
    
    static {
        Field14894 = new WorldSettings(0L, GameType.CREATIVE, false, false, WorldType.FLAT);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x61FB ^ 0xC0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
