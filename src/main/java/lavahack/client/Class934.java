//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.fml.relauncher.*;
import mcp.*;
import net.minecraft.client.*;
import net.minecraft.profiler.*;
import net.minecraft.client.renderer.entity.*;
import com.google.common.collect.*;
import net.minecraft.client.resources.*;
import net.minecraft.client.multiplayer.*;
import javax.annotation.*;
import net.minecraft.world.*;
import net.minecraftforge.client.event.*;
import net.minecraft.client.entity.*;
import net.minecraft.entity.player.*;
import net.minecraftforge.fml.common.eventhandler.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.client.renderer.culling.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.tileentity.*;
import java.util.*;
import org.lwjgl.util.vector.*;
import net.minecraft.client.renderer.chunk.*;
import net.minecraft.client.renderer.*;
import net.minecraft.util.math.*;
import net.minecraft.block.state.*;
import net.minecraft.util.*;

@SideOnly(Side.CLIENT)
@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class Class934 extends RenderGlobal
{
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
    private final Class16 Field11955;
    private Class1479 Field11956;
    private Set Field11957;
    private Set Field11958;
    private List Field11959;
    private Class1601 Field11960;
    private double Field11961;
    private double Field11962;
    private double Field11963;
    private int Field11964;
    private int Field11965;
    private int Field11966;
    private double Field11967;
    private double Field11968;
    private double Field11969;
    private double Field11970;
    private double Field11971;
    private ChunkRenderDispatcher Field11972;
    private Class989 Field11973;
    private Class2078 Field11974;
    private int Field11975;
    private int Field11976;
    private int Field11977;
    private int Field11978;
    private int Field11979;
    private boolean Field11980;
    private Class1688 Field11981;
    private double Field11982;
    private double Field11983;
    private double Field11984;
    private boolean Field11985;
    private int Field11986;
    private String Field11987 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class934(final Minecraft field11952) {
        super(field11952);
        this.Field11955 = new Class16();
        this.Field11957 = Sets.newLinkedHashSet();
        this.Field11958 = Sets.newLinkedHashSet();
        this.Field11959 = Lists.newArrayListWithCapacity(69696);
        this.Field11960 = null;
        this.Field11961 = Double.longBitsToDouble((long)2121743250 ^ 0x7E773B93L);
        this.Field11962 = Double.longBitsToDouble(1L);
        this.Field11963 = Double.longBitsToDouble(1L);
        this.Field11964 = Integer.MIN_VALUE;
        this.Field11965 = Integer.MIN_VALUE;
        this.Field11966 = Integer.MIN_VALUE;
        this.Field11967 = Double.longBitsToDouble((long)1699853876 ^ 0x6551B635L);
        this.Field11968 = Double.longBitsToDouble((long)2071882542 ^ 0x7B7E6B2FL);
        this.Field11969 = Double.longBitsToDouble(1L);
        this.Field11970 = Double.longBitsToDouble(1L);
        this.Field11971 = Double.longBitsToDouble(1L);
        this.Field11972 = null;
        this.Field11973 = null;
        this.Field11975 = -1;
        this.Field11980 = false;
        this.Field11985 = true;
        this.Field11986 = 0;
        this.Field11952 = field11952;
        this.Field11953 = field11952.profiler;
        this.Field11954 = field11952.getRenderManager();
        GlStateManager.glTexParameteri(3553, 10242, 10497);
        GlStateManager.glTexParameteri(3553, 10243, 10497);
        GlStateManager.bindTexture(0);
        this.Field11980 = OpenGlHelper.useVbo();
        if (this.Field11980) {
            this.initVbo();
        }
        else {
            this.initList();
        }
    }
    
    private void initVbo() {
        this.Field11974 = (Class2078)new Class1278();
        this.Field11981 = (Class1688)new Class1208(this);
    }
    
    private void initList() {
        this.Field11974 = (Class2078)new Class1040();
        this.Field11981 = (Class1688)new Class1209(this);
    }
    
    public void onResourceManagerReload(final IResourceManager resourceManager) {
    }
    
    public void makeEntityOutlineShader() {
    }
    
    public void renderEntityOutlineFramebuffer() {
    }
    
    protected boolean isRenderEntityOutlines() {
        return false;
    }
    
    public void setWorldAndLoadRenderers(@Nullable @Nullable final WorldClient worldClient) {
        if (worldClient instanceof Class1479) {
            this.setWorldAndLoadRenderers((Class1479)worldClient);
        }
        else {
            this.setWorldAndLoadRenderers(null);
        }
    }
    
    public void setWorldAndLoadRenderers(@Nullable @Nullable final Class1479 field11956) {
        if (this.Field11956 != null) {
            this.Field11956.removeEventListener((IWorldEventListener)this);
        }
        this.Field11961 = Double.longBitsToDouble(1L);
        this.Field11962 = Double.longBitsToDouble((long)7707010 ^ 0x759983L);
        this.Field11963 = Double.longBitsToDouble(1L);
        this.Field11964 = Integer.MIN_VALUE;
        this.Field11965 = Integer.MIN_VALUE;
        this.Field11966 = Integer.MIN_VALUE;
        this.Field11954.setWorld((World)field11956);
        if ((this.Field11956 = field11956) != null) {
            field11956.addEventListener((IWorldEventListener)this);
            this.loadRenderers();
        }
        else {
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
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void onRenderWorldLast(final RenderWorldLastEvent renderWorldLastEvent) {
        final EntityPlayerSP entityPlayerSP = (this.Field11952.getRenderViewEntity() instanceof EntityPlayerSP) ? this.Field11952.getRenderViewEntity() : this.Field11952.player;
        if (entityPlayerSP != null) {
            this.Field11953.startSection("schematica");
            Class46.Method421((EntityPlayer)entityPlayerSP, renderWorldLastEvent.getPartialTicks());
            final Class1479 field8122 = Class46.Field8122;
            final boolean b = field8122 != null && field8122.Field14897;
            this.Field11953.startSection("schematic");
            this.Field11953.endStartSection("guide");
            if (Class46.Field8117) {
                GlStateManager.pushMatrix();
                this.renderOverlay(field8122, b);
                GlStateManager.popMatrix();
            }
            this.Field11953.endSection();
            this.Field11953.endSection();
        }
    }
    
    private void renderSchematic(final Class1479 field11956, final float n) {
        if (this.Field11956 != field11956) {
            this.Field11956 = field11956;
            this.loadRenderers();
        }
        Class934.Field11951.Method5848(Class46.Field8119).Method5858((double)this.Field11956.Field14896.Field7895, (double)this.Field11956.Field14896.Field7896, (double)this.Field11956.Field14896.Field7897);
        if (OpenGlHelper.shadersSupported && Class32.Field7975) {
            GL20.glUseProgram(Class934.Field11950.Method4312());
            GL20.glUniform1f(GL20.glGetUniformLocation(Class934.Field11950.Method4312(), (CharSequence)"alpha_multiplier"), Class32.Field7976);
        }
        this.renderWorld(n, System.nanoTime() + 1000000000 / Math.max(Minecraft.getDebugFPS(), 30));
        if (OpenGlHelper.shadersSupported && Class32.Field7975) {
            GL20.glUseProgram(0);
        }
    }
    
    private void renderOverlay(final Class1479 class1479, final boolean b) {
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        GL11.glEnable(2848);
        final Class2162 instance = Class2162.getInstance();
        instance.setTranslation(-Class46.Field8119.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, -Class46.Field8119.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, -Class46.Field8119.Field15157);
        instance.setDelta(Class32.Field7979);
        if (Class46.Field8117) {
            instance.beginQuads();
            instance.drawCuboid((BlockPos)Class46.Field8123, 63, 1069481984);
            instance.drawCuboid((BlockPos)Class46.Field8124, 63, 1056964799);
            instance.draw();
        }
        instance.beginLines();
        if (Class46.Field8117) {
            instance.drawCuboid((BlockPos)Class46.Field8123, 63, 1069481984);
            instance.drawCuboid((BlockPos)Class46.Field8124, 63, 1056964799);
            instance.drawCuboid((BlockPos)Class46.Field8125, (BlockPos)Class46.Field8126, 63, 2130755328);
        }
        if (b) {
            this.Field11955.set(class1479.Field14896.Field7895 + class1479.getWidth() - 1, class1479.Field14896.Field7896 + class1479.getHeight() - 1, class1479.Field14896.Field7897 + class1479.getLength() - 1);
            instance.drawCuboid((BlockPos)class1479.Field14896, (BlockPos)this.Field11955, 63, 2143223999);
        }
        instance.draw();
        GlStateManager.depthMask(false);
        this.Field11974.renderOverlay();
        GlStateManager.depthMask(true);
        GL11.glDisable(2848);
        GlStateManager.disableBlend();
        GlStateManager.enableTexture2D();
    }
    
    private void renderWorld(final float n, final long n2) {
        GlStateManager.enableCull();
        this.Field11953.endStartSection("culling");
        final Frustum frustum = new Frustum();
        final Entity getRenderViewEntity = this.Field11952.getRenderViewEntity();
        final double ylFSugLHQAjzunVBKfamPjSRsvHTy3jf = Class934.Field11951.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        final double uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = Class934.Field11951.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        final double field15157 = Class934.Field11951.Field15157;
        frustum.setPosition(ylFSugLHQAjzunVBKfamPjSRsvHTy3jf, uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, field15157);
        GlStateManager.shadeModel(7425);
        this.Field11953.endStartSection("prepareterrain");
        this.Field11952.getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
        RenderHelper.disableStandardItemLighting();
        this.Field11953.endStartSection("terrain_setup");
        this.setupTerrain(getRenderViewEntity, n, (ICamera)frustum, this.Field11986++, this.isInsideWorld(ylFSugLHQAjzunVBKfamPjSRsvHTy3jf, uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, field15157));
        this.Field11953.endStartSection("updatechunks");
        this.updateChunks(n2 / 2L);
        this.Field11953.endStartSection("terrain");
        GlStateManager.matrixMode(5888);
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        this.renderBlockLayer(BlockRenderLayer.SOLID, n, 2, getRenderViewEntity);
        this.renderBlockLayer(BlockRenderLayer.CUTOUT_MIPPED, n, 2, getRenderViewEntity);
        this.Field11952.getTextureManager().getTexture(TextureMap.LOCATION_BLOCKS_TEXTURE).setBlurMipmap(false, false);
        this.renderBlockLayer(BlockRenderLayer.CUTOUT, n, 2, getRenderViewEntity);
        this.Field11952.getTextureManager().getTexture(TextureMap.LOCATION_BLOCKS_TEXTURE).restoreLastBlurMipmap();
        GlStateManager.disableBlend();
        GlStateManager.shadeModel(7424);
        GlStateManager.alphaFunc(516, Float.intBitsToFloat(1036831949));
        GlStateManager.matrixMode(5888);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        this.Field11953.endStartSection("entities");
        RenderHelper.enableStandardItemLighting();
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        this.renderEntities(getRenderViewEntity, (ICamera)frustum, n);
        GlStateManager.disableBlend();
        RenderHelper.disableStandardItemLighting();
        this.disableLightmap();
        GlStateManager.matrixMode(5888);
        GlStateManager.popMatrix();
        GlStateManager.enableCull();
        GlStateManager.alphaFunc(516, Float.intBitsToFloat(1036831949));
        this.Field11952.getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
        GlStateManager.shadeModel(7425);
        GlStateManager.depthMask(false);
        GlStateManager.pushMatrix();
        this.Field11953.endStartSection("translucent");
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        this.renderBlockLayer(BlockRenderLayer.TRANSLUCENT, n, 2, getRenderViewEntity);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
        GlStateManager.depthMask(true);
        GlStateManager.shadeModel(7424);
        GlStateManager.enableCull();
    }
    
    private boolean isInsideWorld(final double n, final double n2, final double n3) {
        return n >= Double.longBitsToDouble(-4616189618054758400L) && n2 >= Double.longBitsToDouble((long)2124215529 ^ 0xBFF000007E9CF4E9L) && n3 >= Double.longBitsToDouble(-4616189618054758400L) && n <= this.Field11956.getWidth() && n2 <= this.Field11956.getHeight() && n3 <= this.Field11956.getLength();
    }
    
    private void disableLightmap() {
        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GlStateManager.disableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
    }
    
    public void refresh() {
        this.loadRenderers();
    }
    
    public void loadRenderers() {
        if (this.Field11956 != null) {
            if (this.Field11972 == null) {
                this.Field11972 = new ChunkRenderDispatcher(5);
            }
            if (this.Field11973 == null) {
                this.Field11973 = new Class989(5);
            }
            this.Field11985 = true;
            this.Field11975 = Class32.Field7980;
            final boolean field11980 = this.Field11980;
            this.Field11980 = OpenGlHelper.useVbo();
            if (field11980 && !this.Field11980) {
                this.initList();
            }
            else if (!field11980 && this.Field11980) {
                this.initVbo();
            }
            if (this.Field11960 != null) {
                this.Field11960.deleteGlResources();
            }
            this.stopChunkUpdates();
            (this.Field11960 = new Class1601((World)this.Field11956, this.Field11975, (RenderGlobal)this, this.Field11981)).updateChunkPositions(Class934.Field11951.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, Class934.Field11951.Field15157);
        }
    }
    
    protected void stopChunkUpdates() {
        this.Field11957.clear();
        this.Field11958.clear();
        this.Field11972.stopChunkUpdates();
        this.Field11973.stopChunkUpdates();
    }
    
    public void createBindEntityOutlineFbs(final int n, final int n2) {
    }
    
    public void renderEntities(final Entity entity, final ICamera camera, final float n) {
        this.Field11953.startSection("prepare");
        TileEntityRendererDispatcher.instance.prepare((World)this.Field11956, this.Field11952.getTextureManager(), this.Field11952.fontRenderer, entity, this.Field11952.objectMouseOver, n);
        this.Field11954.cacheActiveRenderInfo((World)this.Field11956, this.Field11952.fontRenderer, entity, this.Field11952.pointedEntity, this.Field11952.gameSettings, n);
        this.Field11976 = 0;
        this.Field11977 = 0;
        this.Field11978 = 0;
        this.Field11979 = 0;
        final double ylFSugLHQAjzunVBKfamPjSRsvHTy3jf = Class934.Field11951.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        final double uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = Class934.Field11951.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        final double field15157 = Class934.Field11951.Field15157;
        TileEntityRendererDispatcher.staticPlayerX = ylFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        TileEntityRendererDispatcher.staticPlayerY = uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        TileEntityRendererDispatcher.staticPlayerZ = field15157;
        TileEntityRendererDispatcher.instance.entityX = ylFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        TileEntityRendererDispatcher.instance.entityY = uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        TileEntityRendererDispatcher.instance.entityZ = field15157;
        this.Field11954.setRenderPosition(ylFSugLHQAjzunVBKfamPjSRsvHTy3jf, uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, field15157);
        this.Field11952.entityRenderer.enableLightmap();
        this.Field11953.endStartSection("blockentities");
        RenderHelper.enableStandardItemLighting();
        TileEntityRendererDispatcher.instance.preDrawBatch();
        final Iterator<Class1314> iterator = this.Field11959.iterator();
        while (iterator.hasNext()) {
            for (final TileEntity tileEntity : iterator.next().Field14045.getCompiledChunk().getTileEntities()) {
                final AxisAlignedBB renderBoundingBox = tileEntity.getRenderBoundingBox();
                ++this.Field11978;
                if (tileEntity.shouldRenderInPass(0)) {
                    if (!camera.isBoundingBoxInFrustum(renderBoundingBox)) {
                        continue;
                    }
                    if (!this.Field11952.world.isAirBlock(tileEntity.getPos().add((Vec3i)this.Field11956.Field14896))) {
                        continue;
                    }
                    TileEntityRendererDispatcher.instance.render(tileEntity, n, -1);
                    ++this.Field11979;
                }
            }
        }
        TileEntityRendererDispatcher.instance.drawBatch(0);
        this.Field11952.entityRenderer.disableLightmap();
        this.Field11953.endSection();
    }
    
    public String getDebugInfoRenders() {
        return String.format("C: %d/%d %sD: %d, %s", this.getRenderedChunks(), this.Field11960.renderChunks.length, this.Field11952.renderChunksMany ? "(s) " : "", this.Field11975, this.Field11972.getDebugInfo());
    }
    
    protected int getRenderedChunks() {
        int n = 0;
        final Iterator<Class1314> iterator = (Iterator<Class1314>)this.Field11959.iterator();
        while (iterator.hasNext()) {
            final CompiledChunk compiledChunk = iterator.next().Field14045.compiledChunk;
            if (compiledChunk != CompiledChunk.DUMMY && !compiledChunk.isEmpty()) {
                ++n;
            }
        }
        return n;
    }
    
    public String getDebugInfoEntities() {
        return String.format("E: %d/%d", this.Field11977, this.Field11976);
    }
    
    public String getDebugInfoTileEntities() {
        return String.format("TE: %d/%d", this.Field11979, this.Field11978);
    }
    
    public void setupTerrain(final Entity entity, final double n, final ICamera camera, final int n2, final boolean b) {
        if (Class32.Field7980 != this.Field11975 || this.Field11980 != OpenGlHelper.useVbo()) {
            this.loadRenderers();
        }
        this.Field11953.startSection("camera");
        final double ylFSugLHQAjzunVBKfamPjSRsvHTy3jf = Class934.Field11951.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        final double uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = Class934.Field11951.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        final double field15157 = Class934.Field11951.Field15157;
        final double n3 = ylFSugLHQAjzunVBKfamPjSRsvHTy3jf - this.Field11961;
        final double n4 = uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV - this.Field11962;
        final double n5 = field15157 - this.Field11963;
        final int field15158 = MathHelper.floor(ylFSugLHQAjzunVBKfamPjSRsvHTy3jf) >> 4;
        final int field15159 = MathHelper.floor(uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) >> 4;
        final int field15160 = MathHelper.floor(field15157) >> 4;
        if (this.Field11964 != field15158 || this.Field11965 != field15159 || this.Field11966 != field15160 || n3 * n3 + n4 * n4 + n5 * n5 > Double.longBitsToDouble(4625196817309499392L)) {
            this.Field11961 = ylFSugLHQAjzunVBKfamPjSRsvHTy3jf;
            this.Field11962 = uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
            this.Field11963 = field15157;
            this.Field11964 = field15158;
            this.Field11965 = field15159;
            this.Field11966 = field15160;
            this.Field11960.updateChunkPositions(ylFSugLHQAjzunVBKfamPjSRsvHTy3jf, field15157);
        }
        this.Field11953.endStartSection("renderlistcamera");
        this.Field11974.initialize(ylFSugLHQAjzunVBKfamPjSRsvHTy3jf, uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, field15157);
        this.Field11953.endStartSection("culling");
        final BlockPos blockPos = new BlockPos(ylFSugLHQAjzunVBKfamPjSRsvHTy3jf, uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV + entity.getEyeHeight(), field15157);
        final RenderChunk getRenderChunk = this.Field11960.getRenderChunk(blockPos);
        final Class1467 renderOverlay = this.Field11960.getRenderOverlay(blockPos);
        this.Field11985 = (this.Field11985 || !this.Field11957.isEmpty() || ylFSugLHQAjzunVBKfamPjSRsvHTy3jf != this.Field11967 || uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV != this.Field11968 || field15157 != this.Field11969 || entity.rotationPitch != this.Field11970 || entity.rotationYaw != this.Field11971);
        this.Field11967 = ylFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.Field11968 = uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.Field11969 = field15157;
        this.Field11970 = entity.rotationPitch;
        this.Field11971 = entity.rotationYaw;
        this.Field11953.endStartSection("update");
        if (this.Field11985) {
            this.Field11985 = false;
            this.Field11959 = Lists.newArrayListWithCapacity(69696);
            final LinkedList linkedList = Lists.newLinkedList();
            boolean renderChunksMany = this.Field11952.renderChunksMany;
            if (getRenderChunk == null) {
                final int n6 = (blockPos.getY() > 0) ? 248 : 8;
                for (int i = -this.Field11975; i <= this.Field11975; ++i) {
                    for (int j = -this.Field11975; j <= this.Field11975; ++j) {
                        final BlockPos blockPos2 = new BlockPos((i << 4) + 8, n6, (j << 4) + 8);
                        final RenderChunk getRenderChunk2 = this.Field11960.getRenderChunk(blockPos);
                        final Class1467 renderOverlay2 = this.Field11960.getRenderOverlay(blockPos2);
                        if (getRenderChunk2 != null && camera.isBoundingBoxInFrustum(getRenderChunk2.boundingBox)) {
                            getRenderChunk2.setFrameIndex(n2);
                            renderOverlay2.setFrameIndex(n2);
                            linkedList.add(new Class1314(this, getRenderChunk2, renderOverlay2, (EnumFacing)null, 0));
                        }
                    }
                }
            }
            else {
                final Class1314 e = new Class1314(this, getRenderChunk, renderOverlay, (EnumFacing)null, 0);
                final Set visibleSides = this.getVisibleSides(blockPos);
                if (visibleSides.size() == 1) {
                    final Vector3f getViewVector = this.getViewVector(entity, n);
                    visibleSides.remove(EnumFacing.getFacingFromVector(getViewVector.x, getViewVector.y, getViewVector.z).getOpposite());
                }
                if (visibleSides.isEmpty()) {}
                if (b && this.Field11956.getBlockState(blockPos).isOpaqueCube()) {
                    renderChunksMany = false;
                }
                getRenderChunk.setFrameIndex(n2);
                renderOverlay.setFrameIndex(n2);
                linkedList.add(e);
            }
            this.Field11953.startSection("iteration");
            while (!linkedList.isEmpty()) {
                final Class1314 class1314 = linkedList.poll();
                final RenderChunk field15161 = class1314.Field14045;
                final EnumFacing field15162 = class1314.Field14047;
                this.Field11959.add(class1314);
                for (final EnumFacing enumFacing : EnumFacing.VALUES) {
                    final RenderChunk neighborRenderChunk = this.getNeighborRenderChunk(blockPos, field15161, enumFacing);
                    final Class1467 neighborRenderOverlay = this.getNeighborRenderOverlay(blockPos, field15161, enumFacing);
                    if ((!renderChunksMany || !class1314.Field14048.contains(enumFacing.getOpposite())) && (!renderChunksMany || field15162 == null || field15161.getCompiledChunk().isVisible(field15162.getOpposite(), enumFacing)) && neighborRenderChunk != null && neighborRenderChunk.setFrameIndex(n2) && camera.isBoundingBoxInFrustum(neighborRenderChunk.boundingBox)) {
                        final Class1314 e2 = new Class1314(this, neighborRenderChunk, neighborRenderOverlay, enumFacing, class1314.Field14049 + 1);
                        e2.Field14048.addAll(class1314.Field14048);
                        e2.Field14048.add(enumFacing);
                        linkedList.add(e2);
                    }
                }
            }
            this.Field11953.endSection();
        }
        this.Field11953.endStartSection("rebuild");
        final Set field15163 = this.Field11957;
        final Set field15164 = this.Field11958;
        this.Field11957 = Sets.newLinkedHashSet();
        this.Field11958 = Sets.newLinkedHashSet();
        for (final Class1314 class1315 : this.Field11959) {
            final RenderChunk field15165 = class1315.Field14045;
            final Class1467 field15166 = class1315.Field14046;
            if (field15165.needsUpdate() || field15163.contains(field15165)) {
                this.Field11985 = true;
                this.Field11957.add(field15165);
            }
            if (field15166.needsUpdate() || field15164.contains(field15166)) {
                this.Field11985 = true;
                this.Field11958.add(field15166);
            }
        }
        this.Field11957.addAll(field15163);
        this.Field11958.addAll(field15164);
        this.Field11953.endSection();
    }
    
    private Set getVisibleSides(final BlockPos blockPos) {
        final VisGraph visGraph = new VisGraph();
        final BlockPos blockPos2 = new BlockPos(blockPos.getX() & 0xFFFFFFF0, blockPos.getY() & 0xFFFFFFF0, blockPos.getZ() & 0xFFFFFFF0);
        for (final BlockPos$MutableBlockPos blockPos$MutableBlockPos : BlockPos.getAllInBoxMutable(blockPos2, blockPos2.add(15, 15, 15))) {
            if (this.Field11956.getBlockState((BlockPos)blockPos$MutableBlockPos).isOpaqueCube()) {
                visGraph.setOpaqueCube((BlockPos)blockPos$MutableBlockPos);
            }
        }
        return visGraph.getVisibleFacings(blockPos);
    }
    
    private RenderChunk getNeighborRenderChunk(final BlockPos blockPos, final RenderChunk renderChunk, final EnumFacing enumFacing) {
        final BlockPos getBlockPosOffset16 = renderChunk.getBlockPosOffset16(enumFacing);
        if (MathHelper.abs(blockPos.getX() - getBlockPosOffset16.getX()) > this.Field11975 * 16) {
            return null;
        }
        if (getBlockPosOffset16.getY() < 0 || getBlockPosOffset16.getY() >= 256) {
            return null;
        }
        if (MathHelper.abs(blockPos.getZ() - getBlockPosOffset16.getZ()) > this.Field11975 * 16) {
            return null;
        }
        return this.Field11960.getRenderChunk(blockPos);
    }
    
    private Class1467 getNeighborRenderOverlay(final BlockPos blockPos, final RenderChunk renderChunk, final EnumFacing enumFacing) {
        final BlockPos getBlockPosOffset16 = renderChunk.getBlockPosOffset16(enumFacing);
        if (MathHelper.abs(blockPos.getX() - getBlockPosOffset16.getX()) > this.Field11975 * 16) {
            return null;
        }
        if (getBlockPosOffset16.getY() < 0 || getBlockPosOffset16.getY() >= 256) {
            return null;
        }
        if (MathHelper.abs(blockPos.getZ() - getBlockPosOffset16.getZ()) > this.Field11975 * 16) {
            return null;
        }
        return this.Field11960.getRenderOverlay(getBlockPosOffset16);
    }
    
    protected Vector3f getViewVector(final Entity entity, final double n) {
        return super.getViewVector(entity, n);
    }
    
    public int renderBlockLayer(final BlockRenderLayer obj, final double n, final int n2, final Entity entity) {
        RenderHelper.disableStandardItemLighting();
        if (obj == BlockRenderLayer.TRANSLUCENT) {
            this.Field11953.startSection("translucent_sort");
            final double ylFSugLHQAjzunVBKfamPjSRsvHTy3jf = Class934.Field11951.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
            final double uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = Class934.Field11951.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
            final double field15157 = Class934.Field11951.Field15157;
            final double n3 = ylFSugLHQAjzunVBKfamPjSRsvHTy3jf - this.Field11982;
            final double n4 = uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV - this.Field11983;
            final double n5 = field15157 - this.Field11984;
            if (n3 * n3 + n4 * n4 + n5 * n5 > 1.0) {
                this.Field11982 = ylFSugLHQAjzunVBKfamPjSRsvHTy3jf;
                this.Field11983 = uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
                this.Field11984 = field15157;
                int n6 = 0;
                for (final Class1314 class1314 : this.Field11959) {
                    if (class1314.Field14045.compiledChunk.isLayerStarted(obj)) {
                        ++n6;
                        this.Field11972.updateTransparencyLater(class1314.Field14045);
                        this.Field11973.updateTransparencyLater((RenderChunk)class1314.Field14046);
                    }
                }
            }
            this.Field11953.endSection();
        }
        this.Field11953.startSection("filterempty");
        int n7 = 0;
        final boolean b = obj == BlockRenderLayer.TRANSLUCENT;
        final int n8 = 0;
        for (int size = this.Field11959.size(), n9 = 1, i = n8; i != size; i += n9) {
            final Class1314 class1315 = this.Field11959.get(i);
            final RenderChunk field15158 = class1315.Field14045;
            final Class1467 field15159 = class1315.Field14046;
            if (!field15158.getCompiledChunk().isLayerEmpty(obj)) {
                ++n7;
                this.Field11974.addRenderChunk(field15158, obj);
            }
        }
        this.Field11953.endStartSection("render_" + obj);
        this.renderBlockLayer(obj);
        this.Field11953.endSection();
        return n7;
    }
    
    private void renderBlockLayer(final BlockRenderLayer blockRenderLayer) {
        this.Field11952.entityRenderer.enableLightmap();
        this.Field11974.renderChunkLayer(blockRenderLayer);
        this.Field11952.entityRenderer.disableLightmap();
    }
    
    public void updateClouds() {
    }
    
    public void renderSky(final float n, final int n2) {
    }
    
    public void renderClouds(final float n, final int n2, final double n3, final double n4, final double n5) {
    }
    
    public boolean hasCloudFog(final double n, final double n2, final double n3, final float n4) {
        return false;
    }
    
    public void updateChunks(final long n) {
        this.Field11985 |= this.Field11972.runChunkUploads(n);
        final Iterator<RenderChunk> iterator = (Iterator<RenderChunk>)this.Field11957.iterator();
        while (iterator.hasNext()) {
            final RenderChunk renderChunk = iterator.next();
            if (!this.Field11972.updateChunkLater(renderChunk)) {
                break;
            }
            renderChunk.clearNeedsUpdate();
            iterator.remove();
            if (n - System.nanoTime() < 0L) {
                break;
            }
        }
        this.Field11985 |= this.Field11973.runChunkUploads(n);
        final Iterator<Class1467> iterator2 = (Iterator<Class1467>)this.Field11958.iterator();
        while (iterator2.hasNext()) {
            final Class1467 class1467 = iterator2.next();
            if (!this.Field11973.updateChunkLater((RenderChunk)class1467)) {
                break;
            }
            class1467.clearNeedsUpdate();
            iterator2.remove();
            if (n - System.nanoTime() < 0L) {
                break;
            }
        }
    }
    
    public void renderWorldBorder(final Entity entity, final float n) {
    }
    
    public void drawBlockDamageTexture(final Tessellator tessellator, final BufferBuilder bufferBuilder, final Entity entity, final float n) {
    }
    
    public void drawSelectionBox(final EntityPlayer entityPlayer, final RayTraceResult rayTraceResult, final int n, final float n2) {
    }
    
    public void notifyBlockUpdate(final World world, final BlockPos blockPos, final IBlockState blockState, final IBlockState blockState2, final int n) {
        final int getX = blockPos.getX();
        final int getY = blockPos.getY();
        final int getZ = blockPos.getZ();
        this.markBlocksForUpdate(getX - 1, getY - 1, getZ - 1, getX + 1, getY + 1, getZ + 1, (n & 0x8) != 0x0);
    }
    
    public void notifyLightSet(final BlockPos blockPos) {
        final int getX = blockPos.getX();
        final int getY = blockPos.getY();
        final int getZ = blockPos.getZ();
        this.markBlocksForUpdate(getX - 1, getY - 1, getZ - 1, getX + 1, getY + 1, getZ + 1, true);
    }
    
    public void markBlockRangeForRenderUpdate(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.markBlocksForUpdate(n - 1, n2 - 1, n3 - 1, n4 + 1, n5 + 1, n6 + 1, true);
    }
    
    private void markBlocksForUpdate(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final boolean b) {
        if (this.Field11956 == null) {
            return;
        }
        final Class16 field14896 = this.Field11956.Field14896;
        this.Field11960.markBlocksForUpdate(n - field14896.Field7895, n2 - field14896.Field7896, n3 - field14896.Field7897, n4 - field14896.Field7895, n5 - field14896.Field7896, n6 - field14896.Field7897, b);
    }
    
    public void playRecord(final SoundEvent soundEvent, final BlockPos blockPos) {
    }
    
    public void playSoundToAllNearExcept(final EntityPlayer entityPlayer, final SoundEvent soundEvent, final SoundCategory soundCategory, final double n, final double n2, final double n3, final float n4, final float n5) {
    }
    
    public void spawnParticle(final int n, final boolean b, final double n2, final double n3, final double n4, final double n5, final double n6, final double n7, final int... array) {
    }
    
    public void spawnParticle(final int n, final boolean b, final boolean b2, final double n2, final double n3, final double n4, final double n5, final double n6, final double n7, final int... array) {
    }
    
    public void onEntityAdded(final Entity entity) {
    }
    
    public void onEntityRemoved(final Entity entity) {
    }
    
    public void deleteAllDisplayLists() {
    }
    
    public void broadcastSound(final int n, final BlockPos blockPos, final int n2) {
    }
    
    public void playEvent(final EntityPlayer entityPlayer, final int n, final BlockPos blockPos, final int n2) {
    }
    
    public void sendBlockBreakProgress(final int n, final BlockPos blockPos, final int n2) {
    }
    
    public boolean hasNoChunkUpdates() {
        return this.Field11957.isEmpty() && !this.Field11972.hasNoChunkUpdates();
    }
    
    public void setDisplayListEntitiesDirty() {
        this.Field11985 = true;
    }
    
    public void updateTileEntities(final Collection collection, final Collection collection2) {
    }
    
    static {
        Field11949 = 2;
        Field11948 = 69696;
        Field11947 = 16;
        Field11946 = 66;
        Field11945 = 32;
        Field11944 = new Class934(Minecraft.getMinecraft());
        Field11950 = new Class1057("schematica", (String)null, "shaders/alpha.frag");
        Field11951 = new Class1531();
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3E7E ^ 0xA5));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
