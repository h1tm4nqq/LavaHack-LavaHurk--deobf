//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcp.MethodsReturnNonnullByDefault
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.RenderGlobal
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.chunk.ChunkRenderDispatcher
 *  net.minecraft.client.renderer.chunk.CompiledChunk
 *  net.minecraft.client.renderer.chunk.RenderChunk
 *  net.minecraft.client.renderer.chunk.VisGraph
 *  net.minecraft.client.renderer.culling.Frustum
 *  net.minecraft.client.renderer.culling.ICamera
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.client.renderer.texture.TextureMap
 *  net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher
 *  net.minecraft.client.resources.IResourceManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.profiler.Profiler
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.BlockRenderLayer
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.SoundCategory
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$MutableBlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.IWorldEventListener
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.util.vector.Vector3f
 */
package lavahack.client;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import lavahack.client.Class1040;
import lavahack.client.Class1057;
import lavahack.client.Class1208;
import lavahack.client.Class1209;
import lavahack.client.Class1278;
import lavahack.client.Class1314;
import lavahack.client.Class1467;
import lavahack.client.Class1479;
import lavahack.client.Class1531;
import lavahack.client.Class16;
import lavahack.client.Class1601;
import lavahack.client.Class1688;
import lavahack.client.Class2078;
import lavahack.client.Class2162;
import lavahack.client.Class32;
import lavahack.client.Class46;
import lavahack.client.Class989;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.chunk.ChunkRenderDispatcher;
import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.client.renderer.chunk.VisGraph;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.profiler.Profiler;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.IWorldEventListener;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.util.vector.Vector3f;

@SideOnly(value=Side.CLIENT)
@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class Class934
extends RenderGlobal {
    public static final Class934 Field11944;
    public static final int Field11945;
    public static final int Field11946;
    public static final int Field11947;
    public static final int Field11948;
    public static final int Field11949;
    private static final Class1057 Field11950;
    private static final Class1531 Field11951;
    private final Minecraft Field11952;
    private final Profiler Field11953;
    private final RenderManager Field11954;
    private final Class16 Field11955 = new Class16();
    private Class1479 Field11956;
    private Set Field11957 = Sets.newLinkedHashSet();
    private Set Field11958 = Sets.newLinkedHashSet();
    private List Field11959 = Lists.newArrayListWithCapacity(69696);
    private Class1601 Field11960 = null;
    private double Field11961 = Double.longBitsToDouble((long)2121743250 ^ 0x7E773B93L);
    private double Field11962 = Double.longBitsToDouble(1L);
    private double Field11963 = Double.longBitsToDouble(1L);
    private int Field11964 = Integer.MIN_VALUE;
    private int Field11965 = Integer.MIN_VALUE;
    private int Field11966 = Integer.MIN_VALUE;
    private double Field11967 = Double.longBitsToDouble((long)1699853876 ^ 0x6551B635L);
    private double Field11968 = Double.longBitsToDouble((long)2071882542 ^ 0x7B7E6B2FL);
    private double Field11969 = Double.longBitsToDouble(1L);
    private double Field11970 = Double.longBitsToDouble(1L);
    private double Field11971 = Double.longBitsToDouble(1L);
    private ChunkRenderDispatcher Field11972 = null;
    private Class989 Field11973 = null;
    private Class2078 Field11974;
    private int Field11975 = -1;
    private int Field11976;
    private int Field11977;
    private int Field11978;
    private int Field11979;
    private boolean Field11980 = false;
    private Class1688 Field11981;
    private double Field11982;
    private double Field11983;
    private double Field11984;
    private boolean Field11985 = true;
    private int Field11986 = 0;
    private String Field11987 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class934(Minecraft minecraft) {
        super(minecraft);
        this.Field11952 = minecraft;
        this.Field11953 = minecraft.profiler;
        this.Field11954 = minecraft.getRenderManager();
        GlStateManager.glTexParameteri((int)3553, (int)10242, (int)10497);
        GlStateManager.glTexParameteri((int)3553, (int)10243, (int)10497);
        GlStateManager.bindTexture((int)0);
        this.Field11980 = OpenGlHelper.useVbo();
        if (this.Field11980) {
            this.initVbo();
            return;
        }
        this.initList();
    }

    private void initVbo() {
        this.Field11974 = new Class1278();
        this.Field11981 = new Class1208(this);
    }

    private void initList() {
        this.Field11974 = new Class1040();
        this.Field11981 = new Class1209(this);
    }

    public void onResourceManagerReload(IResourceManager iResourceManager) {
    }

    public void makeEntityOutlineShader() {
    }

    public void renderEntityOutlineFramebuffer() {
    }

    protected boolean isRenderEntityOutlines() {
        return false;
    }

    public void setWorldAndLoadRenderers(@Nullable @Nullable WorldClient worldClient) {
        if (worldClient instanceof Class1479) {
            this.setWorldAndLoadRenderers((Class1479)worldClient);
            return;
        }
        this.setWorldAndLoadRenderers(null);
    }

    public void setWorldAndLoadRenderers(@Nullable @Nullable Class1479 class1479) {
        if (this.Field11956 != null) {
            this.Field11956.removeEventListener((IWorldEventListener)this);
        }
        this.Field11961 = Double.longBitsToDouble(1L);
        this.Field11962 = Double.longBitsToDouble((long)7707010 ^ 0x759983L);
        this.Field11963 = Double.longBitsToDouble(1L);
        this.Field11964 = Integer.MIN_VALUE;
        this.Field11965 = Integer.MIN_VALUE;
        this.Field11966 = Integer.MIN_VALUE;
        this.Field11954.setWorld((World)class1479);
        this.Field11956 = class1479;
        if (class1479 != null) {
            class1479.addEventListener((IWorldEventListener)this);
            this.loadRenderers();
            return;
        }
        this.Field11957.clear();
        this.Field11958.clear();
        this.Field11959.clear();
        if (this.Field11960 != null) {
            this.Field11960.deleteGlResources();
        }
        this.Field11960 = null;
        if (this.Field11972 != null) {
            this.Field11972.stopWorkerThreads();
        }
        this.Field11972 = null;
        if (this.Field11973 != null) {
            this.Field11973.stopWorkerThreads();
        }
        this.Field11973 = null;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void onRenderWorldLast(RenderWorldLastEvent renderWorldLastEvent) {
        EntityPlayerSP entityPlayerSP = this.Field11952.getRenderViewEntity() instanceof EntityPlayerSP ? (EntityPlayerSP)this.Field11952.getRenderViewEntity() : this.Field11952.player;
        if (entityPlayerSP == null) return;
        this.Field11953.startSection("schematica");
        Class46.Method421((EntityPlayer)entityPlayerSP, renderWorldLastEvent.getPartialTicks());
        Class1479 class1479 = Class46.Field8122;
        boolean bl = class1479 != null && class1479.Field14897;
        this.Field11953.startSection("schematic");
        this.Field11953.endStartSection("guide");
        if (!Class46.Field8117) {
        } else {
            GlStateManager.pushMatrix();
            this.renderOverlay(class1479, bl);
            GlStateManager.popMatrix();
        }
        this.Field11953.endSection();
        this.Field11953.endSection();
    }

    private void renderSchematic(Class1479 class1479, float f) {
        if (this.Field11956 != class1479) {
            this.Field11956 = class1479;
            this.loadRenderers();
        }
        Field11951.Method5848(Class46.Field8119).Method5858(this.Field11956.Field14896.Field7895, this.Field11956.Field14896.Field7896, this.Field11956.Field14896.Field7897);
        if (OpenGlHelper.shadersSupported && Class32.Field7975) {
            GL20.glUseProgram((int)Field11950.Method4312());
            GL20.glUniform1f((int)GL20.glGetUniformLocation((int)Field11950.Method4312(), (CharSequence)"alpha_multiplier"), (float)Class32.Field7976);
        }
        int n = Math.max(Minecraft.getDebugFPS(), 30);
        this.renderWorld(f, System.nanoTime() + (long)(1000000000 / n));
        if (!OpenGlHelper.shadersSupported) return;
        if (!Class32.Field7975) return;
        GL20.glUseProgram((int)0);
    }

    private void renderOverlay(Class1479 class1479, boolean bl) {
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        GL11.glEnable((int)2848);
        Class2162 class2162 = Class2162.getInstance();
        class2162.setTranslation(-Class46.Field8119.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, -Class46.Field8119.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, -Class46.Field8119.Field15157);
        class2162.setDelta(Class32.Field7979);
        if (Class46.Field8117) {
            class2162.beginQuads();
            class2162.drawCuboid(Class46.Field8123, 63, 1069481984);
            class2162.drawCuboid(Class46.Field8124, 63, 1056964799);
            class2162.draw();
        }
        class2162.beginLines();
        if (Class46.Field8117) {
            class2162.drawCuboid(Class46.Field8123, 63, 1069481984);
            class2162.drawCuboid(Class46.Field8124, 63, 1056964799);
            class2162.drawCuboid(Class46.Field8125, Class46.Field8126, 63, 2130755328);
        }
        if (bl) {
            this.Field11955.set(class1479.Field14896.Field7895 + class1479.getWidth() - 1, class1479.Field14896.Field7896 + class1479.getHeight() - 1, class1479.Field14896.Field7897 + class1479.getLength() - 1);
            class2162.drawCuboid(class1479.Field14896, this.Field11955, 63, 2143223999);
        }
        class2162.draw();
        GlStateManager.depthMask((boolean)false);
        this.Field11974.renderOverlay();
        GlStateManager.depthMask((boolean)true);
        GL11.glDisable((int)2848);
        GlStateManager.disableBlend();
        GlStateManager.enableTexture2D();
    }

    private void renderWorld(float f, long l) {
        GlStateManager.enableCull();
        this.Field11953.endStartSection("culling");
        Frustum frustum = new Frustum();
        Entity entity = this.Field11952.getRenderViewEntity();
        double d = Class934.Field11951.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        double d2 = Class934.Field11951.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        double d3 = Class934.Field11951.Field15157;
        frustum.setPosition(d, d2, d3);
        GlStateManager.shadeModel((int)7425);
        this.Field11953.endStartSection("prepareterrain");
        this.Field11952.getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
        RenderHelper.disableStandardItemLighting();
        this.Field11953.endStartSection("terrain_setup");
        this.setupTerrain(entity, f, (ICamera)frustum, this.Field11986++, this.isInsideWorld(d, d2, d3));
        this.Field11953.endStartSection("updatechunks");
        this.updateChunks(l / 2L);
        this.Field11953.endStartSection("terrain");
        GlStateManager.matrixMode((int)5888);
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        this.renderBlockLayer(BlockRenderLayer.SOLID, f, 2, entity);
        this.renderBlockLayer(BlockRenderLayer.CUTOUT_MIPPED, f, 2, entity);
        this.Field11952.getTextureManager().getTexture(TextureMap.LOCATION_BLOCKS_TEXTURE).setBlurMipmap(false, false);
        this.renderBlockLayer(BlockRenderLayer.CUTOUT, f, 2, entity);
        this.Field11952.getTextureManager().getTexture(TextureMap.LOCATION_BLOCKS_TEXTURE).restoreLastBlurMipmap();
        GlStateManager.disableBlend();
        GlStateManager.shadeModel((int)7424);
        GlStateManager.alphaFunc((int)516, (float)Float.intBitsToFloat(0x3DCCCCCD));
        GlStateManager.matrixMode((int)5888);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        this.Field11953.endStartSection("entities");
        RenderHelper.enableStandardItemLighting();
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        this.renderEntities(entity, (ICamera)frustum, f);
        GlStateManager.disableBlend();
        RenderHelper.disableStandardItemLighting();
        this.disableLightmap();
        GlStateManager.matrixMode((int)5888);
        GlStateManager.popMatrix();
        GlStateManager.enableCull();
        GlStateManager.alphaFunc((int)516, (float)Float.intBitsToFloat(0x3DCCCCCD));
        this.Field11952.getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
        GlStateManager.shadeModel((int)7425);
        GlStateManager.depthMask((boolean)false);
        GlStateManager.pushMatrix();
        this.Field11953.endStartSection("translucent");
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        this.renderBlockLayer(BlockRenderLayer.TRANSLUCENT, f, 2, entity);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
        GlStateManager.depthMask((boolean)true);
        GlStateManager.shadeModel((int)7424);
        GlStateManager.enableCull();
    }

    private boolean isInsideWorld(double d, double d2, double d3) {
        if (!(d >= Double.longBitsToDouble(-4616189618054758400L))) return false;
        if (!(d2 >= Double.longBitsToDouble((long)2124215529 ^ 0xBFF000007E9CF4E9L))) return false;
        if (!(d3 >= Double.longBitsToDouble(-4616189618054758400L))) return false;
        if (!(d <= (double)this.Field11956.getWidth())) return false;
        if (!(d2 <= (double)this.Field11956.getHeight())) return false;
        if (!(d3 <= (double)this.Field11956.getLength())) return false;
        return true;
    }

    private void disableLightmap() {
        GlStateManager.setActiveTexture((int)OpenGlHelper.lightmapTexUnit);
        GlStateManager.disableTexture2D();
        GlStateManager.setActiveTexture((int)OpenGlHelper.defaultTexUnit);
    }

    public void refresh() {
        this.loadRenderers();
    }

    public void loadRenderers() {
        if (this.Field11956 == null) return;
        if (this.Field11972 == null) {
            this.Field11972 = new ChunkRenderDispatcher(5);
        }
        if (this.Field11973 == null) {
            this.Field11973 = new Class989(5);
        }
        this.Field11985 = true;
        this.Field11975 = Class32.Field7980;
        boolean bl = this.Field11980;
        this.Field11980 = OpenGlHelper.useVbo();
        if (bl && !this.Field11980) {
            this.initList();
        } else if (!bl && this.Field11980) {
            this.initVbo();
        }
        if (this.Field11960 != null) {
            this.Field11960.deleteGlResources();
        }
        this.stopChunkUpdates();
        this.Field11960 = new Class1601((World)this.Field11956, this.Field11975, this, this.Field11981);
        double d = Class934.Field11951.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        double d2 = Class934.Field11951.Field15157;
        this.Field11960.updateChunkPositions(d, d2);
    }

    protected void stopChunkUpdates() {
        this.Field11957.clear();
        this.Field11958.clear();
        this.Field11972.stopChunkUpdates();
        this.Field11973.stopChunkUpdates();
    }

    public void createBindEntityOutlineFbs(int n, int n2) {
    }

    public void renderEntities(Entity entity, ICamera iCamera, float f) {
        boolean bl = false;
        this.Field11953.startSection("prepare");
        TileEntityRendererDispatcher.instance.prepare((World)this.Field11956, this.Field11952.getTextureManager(), this.Field11952.fontRenderer, entity, this.Field11952.objectMouseOver, f);
        this.Field11954.cacheActiveRenderInfo((World)this.Field11956, this.Field11952.fontRenderer, entity, this.Field11952.pointedEntity, this.Field11952.gameSettings, f);
        this.Field11976 = 0;
        this.Field11977 = 0;
        this.Field11978 = 0;
        this.Field11979 = 0;
        double d = Class934.Field11951.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        double d2 = Class934.Field11951.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        double d3 = Class934.Field11951.Field15157;
        TileEntityRendererDispatcher.staticPlayerX = d;
        TileEntityRendererDispatcher.staticPlayerY = d2;
        TileEntityRendererDispatcher.staticPlayerZ = d3;
        TileEntityRendererDispatcher.instance.entityX = d;
        TileEntityRendererDispatcher.instance.entityY = d2;
        TileEntityRendererDispatcher.instance.entityZ = d3;
        this.Field11954.setRenderPosition(d, d2, d3);
        this.Field11952.entityRenderer.enableLightmap();
        this.Field11953.endStartSection("blockentities");
        RenderHelper.enableStandardItemLighting();
        TileEntityRendererDispatcher.instance.preDrawBatch();
        Iterator iterator = this.Field11959.iterator();
        block0: while (true) {
            if (!iterator.hasNext()) {
                TileEntityRendererDispatcher.instance.drawBatch(0);
                this.Field11952.entityRenderer.disableLightmap();
                this.Field11953.endSection();
                return;
            }
            Class1314 class1314 = (Class1314)iterator.next();
            Iterator iterator2 = class1314.Field14045.getCompiledChunk().getTileEntities().iterator();
            while (true) {
                if (!iterator2.hasNext()) continue block0;
                TileEntity tileEntity = (TileEntity)iterator2.next();
                AxisAlignedBB axisAlignedBB = tileEntity.getRenderBoundingBox();
                ++this.Field11978;
                if (!tileEntity.shouldRenderInPass(0) || !iCamera.isBoundingBoxInFrustum(axisAlignedBB) || !this.Field11952.world.isAirBlock(tileEntity.getPos().add((Vec3i)this.Field11956.Field14896))) continue;
                TileEntityRendererDispatcher.instance.render(tileEntity, f, -1);
                ++this.Field11979;
            }
            break;
        }
    }

    public String getDebugInfoRenders() {
        int n = this.Field11960.renderChunks.length;
        int n2 = this.getRenderedChunks();
        return String.format("C: %d/%d %sD: %d, %s", n2, n, this.Field11952.renderChunksMany ? "(s) " : "", this.Field11975, this.Field11972.getDebugInfo());
    }

    protected int getRenderedChunks() {
        int n = 0;
        Iterator iterator = this.Field11959.iterator();
        while (iterator.hasNext()) {
            Class1314 class1314 = (Class1314)iterator.next();
            CompiledChunk compiledChunk = class1314.Field14045.compiledChunk;
            if (compiledChunk == CompiledChunk.DUMMY || compiledChunk.isEmpty()) continue;
            ++n;
        }
        return n;
    }

    public String getDebugInfoEntities() {
        return String.format("E: %d/%d", this.Field11977, this.Field11976);
    }

    public String getDebugInfoTileEntities() {
        return String.format("TE: %d/%d", this.Field11979, this.Field11978);
    }

    public void setupTerrain(Entity entity, double d, ICamera iCamera, int n, boolean bl) {
        EnumFacing[] enumFacingArray;
        Collection<Class1314> collection;
        if (Class32.Field7980 != this.Field11975 || this.Field11980 != OpenGlHelper.useVbo()) {
            this.loadRenderers();
        }
        this.Field11953.startSection("camera");
        double d2 = Class934.Field11951.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        double d3 = Class934.Field11951.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        double d4 = Class934.Field11951.Field15157;
        double d5 = d2 - this.Field11961;
        double d6 = d3 - this.Field11962;
        double d7 = d4 - this.Field11963;
        int n2 = MathHelper.floor((double)d2) >> 4;
        int n3 = MathHelper.floor((double)d3) >> 4;
        int n4 = MathHelper.floor((double)d4) >> 4;
        if (this.Field11964 != n2 || this.Field11965 != n3 || this.Field11966 != n4 || d5 * d5 + d6 * d6 + d7 * d7 > Double.longBitsToDouble(0x4030000000000000L)) {
            this.Field11961 = d2;
            this.Field11962 = d3;
            this.Field11963 = d4;
            this.Field11964 = n2;
            this.Field11965 = n3;
            this.Field11966 = n4;
            this.Field11960.updateChunkPositions(d2, d4);
        }
        this.Field11953.endStartSection("renderlistcamera");
        this.Field11974.initialize(d2, d3, d4);
        this.Field11953.endStartSection("culling");
        BlockPos blockPos = new BlockPos(d2, d3 + (double)entity.getEyeHeight(), d4);
        RenderChunk renderChunk = this.Field11960.getRenderChunk(blockPos);
        Class1467 class1467 = this.Field11960.getRenderOverlay(blockPos);
        this.Field11985 = this.Field11985 || !this.Field11957.isEmpty() || d2 != this.Field11967 || d3 != this.Field11968 || d4 != this.Field11969 || (double)entity.rotationPitch != this.Field11970 || (double)entity.rotationYaw != this.Field11971;
        this.Field11967 = d2;
        this.Field11968 = d3;
        this.Field11969 = d4;
        this.Field11970 = entity.rotationPitch;
        this.Field11971 = entity.rotationYaw;
        this.Field11953.endStartSection("update");
        if (this.Field11985) {
            EnumFacing enumFacing;
            int n5;
            this.Field11985 = false;
            this.Field11959 = Lists.newArrayListWithCapacity(69696);
            collection = Lists.newLinkedList();
            boolean bl2 = this.Field11952.renderChunksMany;
            if (renderChunk != null) {
                n5 = 0;
                Class1314 class1314 = new Class1314(this, renderChunk, class1467, null, 0);
                Set set = this.getVisibleSides(blockPos);
                if (set.size() == 1) {
                    enumFacingArray = this.getViewVector(entity, d);
                    enumFacing = EnumFacing.getFacingFromVector((float)enumFacingArray.x, (float)enumFacingArray.y, (float)enumFacingArray.z).getOpposite();
                    set.remove(enumFacing);
                }
                if (set.isEmpty()) {
                    n5 = 1;
                }
                if (bl && this.Field11956.getBlockState(blockPos).isOpaqueCube()) {
                    bl2 = false;
                }
                renderChunk.setFrameIndex(n);
                class1467.setFrameIndex(n);
                ((LinkedList)collection).add(class1314);
            } else {
                n5 = blockPos.getY() > 0 ? 248 : 8;
                for (int i = -this.Field11975; i <= this.Field11975; ++i) {
                    for (int j = -this.Field11975; j <= this.Field11975; ++j) {
                        enumFacingArray = new BlockPos((i << 4) + 8, n5, (j << 4) + 8);
                        enumFacing = this.Field11960.getRenderChunk(blockPos);
                        Class1467 class14672 = this.Field11960.getRenderOverlay((BlockPos)enumFacingArray);
                        if (enumFacing == null || !iCamera.isBoundingBoxInFrustum(enumFacing.boundingBox)) continue;
                        enumFacing.setFrameIndex(n);
                        class14672.setFrameIndex(n);
                        ((LinkedList)collection).add(new Class1314(this, (RenderChunk)enumFacing, class14672, null, 0));
                    }
                }
            }
            this.Field11953.startSection("iteration");
            while (!((AbstractCollection)collection).isEmpty()) {
                Class1314 class1314 = (Class1314)((LinkedList)collection).poll();
                RenderChunk renderChunk2 = class1314.Field14045;
                EnumFacing enumFacing2 = class1314.Field14047;
                this.Field11959.add(class1314);
                for (EnumFacing enumFacing3 : EnumFacing.VALUES) {
                    RenderChunk renderChunk3 = this.getNeighborRenderChunk(blockPos, renderChunk2, enumFacing3);
                    Class1467 class14673 = this.getNeighborRenderOverlay(blockPos, renderChunk2, enumFacing3);
                    if (bl2 && class1314.Field14048.contains(enumFacing3.getOpposite()) || bl2 && enumFacing2 != null && !renderChunk2.getCompiledChunk().isVisible(enumFacing2.getOpposite(), enumFacing3) || renderChunk3 == null || !renderChunk3.setFrameIndex(n) || !iCamera.isBoundingBoxInFrustum(renderChunk3.boundingBox)) continue;
                    Class1314 class13142 = new Class1314(this, renderChunk3, class14673, enumFacing3, class1314.Field14049 + 1);
                    class13142.Field14048.addAll(class1314.Field14048);
                    class13142.Field14048.add(enumFacing3);
                    ((LinkedList)collection).add(class13142);
                }
            }
            this.Field11953.endSection();
        }
        this.Field11953.endStartSection("rebuild");
        collection = this.Field11957;
        Set set = this.Field11958;
        this.Field11957 = Sets.newLinkedHashSet();
        this.Field11958 = Sets.newLinkedHashSet();
        Iterator iterator = this.Field11959.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Field11957.addAll(collection);
                this.Field11958.addAll(set);
                this.Field11953.endSection();
                return;
            }
            Class1314 class1314 = (Class1314)iterator.next();
            RenderChunk renderChunk4 = class1314.Field14045;
            enumFacingArray = class1314.Field14046;
            if (renderChunk4.needsUpdate() || collection.contains(renderChunk4)) {
                this.Field11985 = true;
                this.Field11957.add(renderChunk4);
            }
            if (!enumFacingArray.needsUpdate() && !set.contains(enumFacingArray)) continue;
            this.Field11985 = true;
            this.Field11958.add(enumFacingArray);
        }
    }

    private Set getVisibleSides(BlockPos blockPos) {
        VisGraph visGraph = new VisGraph();
        BlockPos blockPos2 = new BlockPos(blockPos.getX() & 0xFFFFFFF0, blockPos.getY() & 0xFFFFFFF0, blockPos.getZ() & 0xFFFFFFF0);
        Iterator iterator = BlockPos.getAllInBoxMutable((BlockPos)blockPos2, (BlockPos)blockPos2.add(15, 15, 15)).iterator();
        while (iterator.hasNext()) {
            BlockPos.MutableBlockPos mutableBlockPos = (BlockPos.MutableBlockPos)iterator.next();
            if (!this.Field11956.getBlockState((BlockPos)mutableBlockPos).isOpaqueCube()) continue;
            visGraph.setOpaqueCube((BlockPos)mutableBlockPos);
        }
        return visGraph.getVisibleFacings(blockPos);
    }

    private RenderChunk getNeighborRenderChunk(BlockPos blockPos, RenderChunk renderChunk, EnumFacing enumFacing) {
        BlockPos blockPos2 = renderChunk.getBlockPosOffset16(enumFacing);
        if (MathHelper.abs((int)(blockPos.getX() - blockPos2.getX())) > this.Field11975 * 16) {
            return null;
        }
        if (blockPos2.getY() < 0) return null;
        if (blockPos2.getY() >= 256) {
            return null;
        }
        if (MathHelper.abs((int)(blockPos.getZ() - blockPos2.getZ())) <= this.Field11975 * 16) return this.Field11960.getRenderChunk(blockPos);
        return null;
    }

    private Class1467 getNeighborRenderOverlay(BlockPos blockPos, RenderChunk renderChunk, EnumFacing enumFacing) {
        BlockPos blockPos2 = renderChunk.getBlockPosOffset16(enumFacing);
        if (MathHelper.abs((int)(blockPos.getX() - blockPos2.getX())) > this.Field11975 * 16) {
            return null;
        }
        if (blockPos2.getY() < 0) return null;
        if (blockPos2.getY() >= 256) {
            return null;
        }
        if (MathHelper.abs((int)(blockPos.getZ() - blockPos2.getZ())) <= this.Field11975 * 16) return this.Field11960.getRenderOverlay(blockPos2);
        return null;
    }

    protected Vector3f getViewVector(Entity entity, double d) {
        return super.getViewVector(entity, d);
    }

    public int renderBlockLayer(BlockRenderLayer blockRenderLayer, double d, int n, Entity entity) {
        RenderHelper.disableStandardItemLighting();
        if (blockRenderLayer == BlockRenderLayer.TRANSLUCENT) {
            this.Field11953.startSection("translucent_sort");
            double d2 = Class934.Field11951.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
            double d3 = Class934.Field11951.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
            double d4 = Class934.Field11951.Field15157;
            double d5 = d2 - this.Field11982;
            double d6 = d3 - this.Field11983;
            double d7 = d4 - this.Field11984;
            if (d5 * d5 + d6 * d6 + d7 * d7 > 1.0) {
                this.Field11982 = d2;
                this.Field11983 = d3;
                this.Field11984 = d4;
                int n2 = 0;
                for (Class1314 class1314 : this.Field11959) {
                    if (!class1314.Field14045.compiledChunk.isLayerStarted(blockRenderLayer)) continue;
                    ++n2;
                    this.Field11972.updateTransparencyLater(class1314.Field14045);
                    this.Field11973.updateTransparencyLater(class1314.Field14046);
                }
            }
            this.Field11953.endSection();
        }
        this.Field11953.startSection("filterempty");
        int n3 = 0;
        boolean bl = blockRenderLayer == BlockRenderLayer.TRANSLUCENT;
        int n4 = 0;
        int n5 = this.Field11959.size();
        int n6 = 1;
        int n7 = n4;
        while (true) {
            if (n7 == n5) {
                this.Field11953.endStartSection("render_" + blockRenderLayer);
                this.renderBlockLayer(blockRenderLayer);
                this.Field11953.endSection();
                return n3;
            }
            Class1314 class1314 = (Class1314)this.Field11959.get(n7);
            RenderChunk renderChunk = class1314.Field14045;
            Class1467 class1467 = class1314.Field14046;
            if (!renderChunk.getCompiledChunk().isLayerEmpty(blockRenderLayer)) {
                ++n3;
                this.Field11974.addRenderChunk(renderChunk, blockRenderLayer);
            }
            n7 += n6;
        }
    }

    private void renderBlockLayer(BlockRenderLayer blockRenderLayer) {
        this.Field11952.entityRenderer.enableLightmap();
        this.Field11974.renderChunkLayer(blockRenderLayer);
        this.Field11952.entityRenderer.disableLightmap();
    }

    public void updateClouds() {
    }

    public void renderSky(float f, int n) {
    }

    public void renderClouds(float f, int n, double d, double d2, double d3) {
    }

    public boolean hasCloudFog(double d, double d2, double d3, float f) {
        return false;
    }

    public void updateChunks(long l) {
        long l2;
        Object object;
        this.Field11985 |= this.Field11972.runChunkUploads(l);
        Iterator iterator = this.Field11957.iterator();
        while (iterator.hasNext() && this.Field11972.updateChunkLater((RenderChunk)(object = (RenderChunk)iterator.next()))) {
            object.clearNeedsUpdate();
            iterator.remove();
            long l3 = l - System.nanoTime();
            if (l3 >= 0L) continue;
        }
        this.Field11985 |= this.Field11973.runChunkUploads(l);
        object = this.Field11958.iterator();
        do {
            if (!object.hasNext()) return;
            Class1467 class1467 = (Class1467)((Object)object.next());
            if (!this.Field11973.updateChunkLater(class1467)) {
                return;
            }
            class1467.clearNeedsUpdate();
            object.remove();
        } while ((l2 = l - System.nanoTime()) >= 0L);
    }

    public void renderWorldBorder(Entity entity, float f) {
    }

    public void drawBlockDamageTexture(Tessellator tessellator, BufferBuilder bufferBuilder, Entity entity, float f) {
    }

    public void drawSelectionBox(EntityPlayer entityPlayer, RayTraceResult rayTraceResult, int n, float f) {
    }

    public void notifyBlockUpdate(World world, BlockPos blockPos, IBlockState iBlockState, IBlockState iBlockState2, int n) {
        int n2 = blockPos.getX();
        int n3 = blockPos.getY();
        int n4 = blockPos.getZ();
        this.markBlocksForUpdate(n2 - 1, n3 - 1, n4 - 1, n2 + 1, n3 + 1, n4 + 1, (n & 8) != 0);
    }

    public void notifyLightSet(BlockPos blockPos) {
        int n = blockPos.getX();
        int n2 = blockPos.getY();
        int n3 = blockPos.getZ();
        this.markBlocksForUpdate(n - 1, n2 - 1, n3 - 1, n + 1, n2 + 1, n3 + 1, true);
    }

    public void markBlockRangeForRenderUpdate(int n, int n2, int n3, int n4, int n5, int n6) {
        this.markBlocksForUpdate(n - 1, n2 - 1, n3 - 1, n4 + 1, n5 + 1, n6 + 1, true);
    }

    private void markBlocksForUpdate(int n, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        if (this.Field11956 == null) {
            return;
        }
        Class16 class16 = this.Field11956.Field14896;
        this.Field11960.markBlocksForUpdate(n - class16.Field7895, n2 - class16.Field7896, n3 - class16.Field7897, n4 - class16.Field7895, n5 - class16.Field7896, n6 - class16.Field7897, bl);
    }

    public void playRecord(SoundEvent soundEvent, BlockPos blockPos) {
    }

    public void playSoundToAllNearExcept(EntityPlayer entityPlayer, SoundEvent soundEvent, SoundCategory soundCategory, double d, double d2, double d3, float f, float f2) {
    }

    public void spawnParticle(int n, boolean bl, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
    }

    public void spawnParticle(int n, boolean bl, boolean bl2, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
    }

    public void onEntityAdded(Entity entity) {
    }

    public void onEntityRemoved(Entity entity) {
    }

    public void deleteAllDisplayLists() {
    }

    public void broadcastSound(int n, BlockPos blockPos, int n2) {
    }

    public void playEvent(EntityPlayer entityPlayer, int n, BlockPos blockPos, int n2) {
    }

    public void sendBlockBreakProgress(int n, BlockPos blockPos, int n2) {
    }

    public boolean hasNoChunkUpdates() {
        if (!this.Field11957.isEmpty()) return false;
        if (this.Field11972.hasNoChunkUpdates()) return false;
        return true;
    }

    public void setDisplayListEntitiesDirty() {
        this.Field11985 = true;
    }

    public void updateTileEntities(Collection collection, Collection collection2) {
    }

    static {
        Field11949 = 2;
        Field11948 = 69696;
        Field11947 = 16;
        Field11946 = 66;
        Field11945 = 32;
        Field11944 = new Class934(Minecraft.getMinecraft());
        Field11950 = new Class1057("schematica", null, "shaders/alpha.frag");
        Field11951 = new Class1531();
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 165;
            cArray2[n] = (char)(cArray[n] ^ (0x3E7E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

