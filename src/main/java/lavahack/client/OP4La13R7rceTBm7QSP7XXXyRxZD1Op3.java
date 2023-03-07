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
import lavahack.client.EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN;
import lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.R0tzo2JwCqB4MX2EYSwSBvyXNUT9Eatx;
import lavahack.client.l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4;
import lavahack.client.meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU;
import lavahack.client.rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1;
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

public class OP4La13R7rceTBm7QSP7XXXyRxZD1Op3
extends WorldClient {
    private static final WorldSettings Field14894 = new WorldSettings(0L, GameType.CREATIVE, (boolean)((long)-1234250907 ^ (long)-1234250907), (boolean)((long)-510689558 ^ (long)-510689558), WorldType.FLAT);
    private meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU Field14895;
    public final EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN Field14896 = new EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN();
    public boolean Field14897 = (int)((long)689081851 ^ (long)689081851);
    public OP4La13R7rceTBm7QSP7XXXyRxZD1Op3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field14898 = OP4La13R7rceTBm7QSP7XXXyRxZD1Op3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10633;
    public int Field14899 = (int)((long)-1281102183 ^ (long)-1281102183);
    private String Field14900 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public OP4La13R7rceTBm7QSP7XXXyRxZD1Op3(meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2) {
        super(null, Field14894, (int)-1935820439L ^ 0x8C9DB969, EnumDifficulty.PEACEFUL, Minecraft.getMinecraft().profiler);
        this.Field14895 = meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2;
        Iterator iterator = meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2883().iterator();
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
        return (int)-258958639L ^ 0xF0909ADE;
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
        this.chunkProvider = new R0tzo2JwCqB4MX2EYSwSBvyXNUT9Eatx(this);
        return this.chunkProvider;
    }

    public Entity getEntityByID(int n) {
        return null;
    }

    public boolean isSideSolid(BlockPos blockPos, EnumFacing enumFacing) {
        return this.isSideSolid(blockPos, enumFacing, ((int)-247611949L ^ 0xF13DBDD3) != 0);
    }

    public boolean isSideSolid(BlockPos blockPos, EnumFacing enumFacing, boolean bl) {
        return this.getBlockState(blockPos).isSideSolid((IBlockAccess)this, blockPos, enumFacing);
    }

    public void setSchematic(meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2) {
        this.Field14895 = meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2;
    }

    public meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU getSchematic() {
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
        this.Field14897 = !this.Field14897 ? (int)((long)1939336055 ^ (long)1939336054) : (int)775160408L ^ 0x2E340258;
        return this.Field14897;
    }

    public String getDebugDimensions() {
        return "WHL: " + this.getWidth() + " / " + this.getHeight() + " / " + this.getLength();
    }

    public int replaceBlock(BlockStateMatcher blockStateMatcher, rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1 rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD12, Map map) {
        int n = (int)276911200L ^ 0x10815460;
        Iterator iterator = l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4.Method3239((int)((long)-1025540329 ^ (long)-1025540329), (int)828914866L ^ 0x31683CB2, (int)((long)1412132216 ^ (long)1412132216), this.getWidth(), this.getHeight(), this.getLength()).iterator();
        while (iterator.hasNext()) {
            IBlockState iBlockState;
            EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN = (EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN)((Object)iterator.next());
            IBlockState iBlockState2 = this.Field14895.Method2880(eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN);
            if (iBlockState2.getBlock().hasTileEntity(iBlockState2) || !blockStateMatcher.apply(iBlockState2) || (iBlockState = rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD12.Method7522(iBlockState2, map)).getBlock().hasTileEntity(iBlockState) || !this.Field14895.Method2881(eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN, iBlockState)) continue;
            this.notifyBlockUpdate(eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.add((Vec3i)this.Field14896), iBlockState2, iBlockState, (int)((long)-2116688679 ^ (long)-2116688678));
            ++n;
        }
        return n;
    }

    public boolean isInside(BlockPos blockPos) {
        int n;
        int n2 = blockPos.getX();
        int n3 = blockPos.getY();
        int n4 = blockPos.getZ();
        if (n2 >= 0 && n3 >= 0 && n4 >= 0 && n2 < this.getWidth() && n3 < this.getHeight() && n4 < this.getLength()) {
            n = (int)((long)-357490320 ^ (long)-357490319);
            return n != 0;
        }
        n = (int)1824907932L ^ 0x6CC5E29C;
        return n != 0;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)2097275153 ^ (long)2097275153);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-607315547L ^ 0xDBCD195A);
            int n2 = (int)((long)-1361165172 ^ (long)-1361165169) << 6;
            cArray2[n] = (char)(cArray[n] ^ ((int)-901028075L ^ 0xCA4B06EE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

