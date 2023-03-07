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
import lavahack.client.Ab69MuVR4kkxksx2osBQ0WtXZNaXCgoI;
import lavahack.client.DXjKqX0c7P4em579SJwxKJk7QIiAoRBF;
import lavahack.client.EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN;
import lavahack.client.FXIV2uxTxkBHu5oAcCoArKJnBgEZqFSz;
import lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
import lavahack.client.SC3jYtFgw6fOrGxZqyA1modQPfsOxQG2;
import lavahack.client.UOp9aIVeGSZJn6Z2lXodUWEdtB61Dcql;
import lavahack.client.YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$1;
import lavahack.client.YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$2;
import lavahack.client.YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.Z59nFS7fzGt9MllssMcgOsEYj1a2guaH;
import lavahack.client.a9CGzjfBsN79tJcFsESk8MLpiTk6Tbrr;
import lavahack.client.aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC;
import lavahack.client.kbuMZ0Vk1NB4aprfqPTBCSEfDcvc4xWX;
import lavahack.client.ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU;
import lavahack.client.ppgCVXcfiSfr3inPtq2TIUtq3zK7pHww;
import lavahack.client.sYSQwf2xD3nukbcGapT2KmEMESaueLHM;
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
public class YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo
extends RenderGlobal {
    public static final YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo Field11944;
    public static final int Field11945;
    public static final int Field11946;
    public static final int Field11947;
    public static final int Field11948;
    public static final int Field11949;
    private static final SC3jYtFgw6fOrGxZqyA1modQPfsOxQG2 Field11950;
    private static final DXjKqX0c7P4em579SJwxKJk7QIiAoRBF Field11951;
    private final Minecraft Field11952;
    private final Profiler Field11953;
    private final RenderManager Field11954;
    private final EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN Field11955 = new EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN();
    private OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 Field11956;
    private Set Field11957 = Sets.newLinkedHashSet();
    private Set Field11958 = Sets.newLinkedHashSet();
    private List Field11959 = Lists.newArrayListWithCapacity(((int)1154522380L ^ 0x44D0994D) << 6);
    private Ab69MuVR4kkxksx2osBQ0WtXZNaXCgoI Field11960 = null;
    private double Field11961 = Double.longBitsToDouble((long)2121743250 ^ 0x7E773B93L);
    private double Field11962 = Double.longBitsToDouble(0x4B8C8B82ADABA5D3L ^ 0x4B8C8B82ADABA5D2L);
    private double Field11963 = Double.longBitsToDouble(0xC6E8E2C432685F63L ^ 0xC6E8E2C432685F62L);
    private int Field11964 = (int)-2087222313L ^ 0x39783D7;
    private int Field11965 = (int)-407930283L ^ 0x67AF7A55;
    private int Field11966 = (int)((long)-1366914180 ^ (long)780569468);
    private double Field11967 = Double.longBitsToDouble((long)1699853876 ^ 0x6551B635L);
    private double Field11968 = Double.longBitsToDouble((long)2071882542 ^ 0x7B7E6B2FL);
    private double Field11969 = Double.longBitsToDouble(0xF949D90DFB282900L ^ 0xF949D90DFB282901L);
    private double Field11970 = Double.longBitsToDouble(0xC33FCA1F8EA64114L ^ 0xC33FCA1F8EA64115L);
    private double Field11971 = Double.longBitsToDouble(0xF943E4377F11E0E6L ^ 0xF943E4377F11E0E7L);
    private ChunkRenderDispatcher Field11972 = null;
    private ppgCVXcfiSfr3inPtq2TIUtq3zK7pHww Field11973 = null;
    private UOp9aIVeGSZJn6Z2lXodUWEdtB61Dcql Field11974;
    private int Field11975 = (int)((long)-1715826951 ^ (long)1715826950);
    private int Field11976;
    private int Field11977;
    private int Field11978;
    private int Field11979;
    private boolean Field11980 = (int)((long)1179799846 ^ (long)1179799846);
    private a9CGzjfBsN79tJcFsESk8MLpiTk6Tbrr Field11981;
    private double Field11982;
    private double Field11983;
    private double Field11984;
    private boolean Field11985 = (int)((long)-1378585642 ^ (long)-1378585641);
    private int Field11986 = (int)((long)-739188355 ^ (long)-739188355);
    private String Field11987 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo(Minecraft minecraft) {
        super(minecraft);
        this.Field11952 = minecraft;
        this.Field11953 = minecraft.profiler;
        this.Field11954 = minecraft.getRenderManager();
        GlStateManager.glTexParameteri((int)((int)((long)-1752264642 ^ (long)-1752261153)), (int)((int)((long)-1432363846 ^ (long)-1432368965) << 1), (int)((int)((long)-639213497 ^ (long)-639219386)));
        GlStateManager.glTexParameteri((int)((int)((long)379603071 ^ (long)379602334)), (int)((int)-272200034L ^ 0xEFC6A69D), (int)((int)-1995795442L ^ 0x890ABD0F));
        GlStateManager.bindTexture((int)((int)((long)1031394908 ^ (long)1031394908)));
        this.Field11980 = OpenGlHelper.useVbo();
        if (this.Field11980) {
            this.initVbo();
            return;
        }
        this.initList();
    }

    private void initVbo() {
        this.Field11974 = new kbuMZ0Vk1NB4aprfqPTBCSEfDcvc4xWX();
        this.Field11981 = new YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$1(this);
    }

    private void initList() {
        this.Field11974 = new FXIV2uxTxkBHu5oAcCoArKJnBgEZqFSz();
        this.Field11981 = new YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$2(this);
    }

    public void onResourceManagerReload(IResourceManager iResourceManager) {
    }

    public void makeEntityOutlineShader() {
    }

    public void renderEntityOutlineFramebuffer() {
    }

    protected boolean isRenderEntityOutlines() {
        return (int)((long)263786867 ^ (long)263786867) != 0;
    }

    public void setWorldAndLoadRenderers(@Nullable @Nullable WorldClient worldClient) {
        if (worldClient instanceof OP4La13R7rceTBm7QSP7XXXyRxZD1Op3) {
            this.setWorldAndLoadRenderers((OP4La13R7rceTBm7QSP7XXXyRxZD1Op3)worldClient);
            return;
        }
        this.setWorldAndLoadRenderers(null);
    }

    public void setWorldAndLoadRenderers(@Nullable @Nullable OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3) {
        if (this.Field11956 != null) {
            this.Field11956.removeEventListener((IWorldEventListener)this);
        }
        this.Field11961 = Double.longBitsToDouble(0xE55A07986A07E66CL ^ 0xE55A07986A07E66DL);
        this.Field11962 = Double.longBitsToDouble((long)7707010 ^ 0x759983L);
        this.Field11963 = Double.longBitsToDouble(0x40450BBABFD4A8ACL ^ 0x40450BBABFD4A8ADL);
        this.Field11964 = (int)((long)-898405804 ^ (long)1249077844);
        this.Field11965 = (int)((long)-149903268 ^ (long)1997580380);
        this.Field11966 = (int)1349120750L ^ 0xD069F2EE;
        this.Field11954.setWorld((World)oP4La13R7rceTBm7QSP7XXXyRxZD1Op3);
        this.Field11956 = oP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
        if (oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 != null) {
            oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.addEventListener((IWorldEventListener)this);
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
        sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Method421((EntityPlayer)entityPlayerSP, renderWorldLastEvent.getPartialTicks());
        OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8122;
        boolean bl = oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 != null && oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14897 ? (int)((long)1433416782 ^ (long)1433416783) : (int)953691673L ^ 0x38D82E19;
        this.Field11953.startSection("schematic");
        this.Field11953.endStartSection("guide");
        if (!sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8117) {
        } else {
            GlStateManager.pushMatrix();
            this.renderOverlay(oP4La13R7rceTBm7QSP7XXXyRxZD1Op3, bl);
            GlStateManager.popMatrix();
        }
        this.Field11953.endSection();
        this.Field11953.endSection();
    }

    private void renderSchematic(OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3, float f) {
        if (this.Field11956 != oP4La13R7rceTBm7QSP7XXXyRxZD1Op3) {
            this.Field11956 = oP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
            this.loadRenderers();
        }
        Field11951.Method5848(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8119).Method5858(this.Field11956.Field14896.Field7895, this.Field11956.Field14896.Field7896, this.Field11956.Field14896.Field7897);
        if (OpenGlHelper.shadersSupported && Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7975) {
            GL20.glUseProgram((int)Field11950.Method4312());
            GL20.glUniform1f((int)GL20.glGetUniformLocation((int)Field11950.Method4312(), (CharSequence)"alpha_multiplier"), (float)Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7976);
        }
        int n = Math.max(Minecraft.getDebugFPS(), ((int)1925647897L ^ 0x72C70E16) << 1);
        this.renderWorld(f, System.nanoTime() + (long)((((int)1238503536L ^ 0x49CFDD15) << 9) / n));
        if (!OpenGlHelper.shadersSupported) return;
        if (!Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7975) return;
        GL20.glUseProgram((int)((int)((long)1976713544 ^ (long)1976713544)));
    }

    private void renderOverlay(OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3, boolean bl) {
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate((int)((int)((long)-1533773256 ^ (long)-1533772871) << 1), (int)((int)-467763815L ^ 0xE41E7E9A), (int)((int)((long)1449043797 ^ (long)1449043796)), (int)((int)1203946889L ^ 0x47C2C589));
        GL11.glEnable((int)(((int)1251395318L ^ 0x4A96C6AF) << 5));
        ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU2 = ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU.getInstance();
        ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU2.setTranslation(-sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8119.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, -sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8119.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, -sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8119.Field15157);
        ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU2.setDelta(Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7979);
        if (sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8117) {
            ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU2.beginQuads();
            ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU2.drawCuboid(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8123, (int)((long)-2046868405 ^ (long)-2046868364), ((int)-1055531147L ^ 0xC115E0CA) << 16);
            ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU2.drawCuboid(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8124, (int)((long)1085106485 ^ (long)1085106442), (int)((long)-1518673867 ^ (long)-1703223158));
            ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU2.draw();
        }
        ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU2.beginLines();
        if (sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8117) {
            ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU2.drawCuboid(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8123, (int)((long)1648349012 ^ (long)1648349035), ((int)-1805846275L ^ 0x945CC742) << 16);
            ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU2.drawCuboid(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8124, (int)((long)-1816063109 ^ (long)-1816063164), (int)-1478696515L ^ 0x98DCE102);
            ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU2.drawCuboid(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8125, sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8126, (int)2040728652L ^ 0x79A30C73, (int)((long)740984503 ^ (long)743802376) << 8);
        }
        if (bl) {
            this.Field11955.set(oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14896.Field7895 + oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getWidth() - ((int)-1905630307L ^ 0x8E6A639C), oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14896.Field7896 + oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getHeight() - (int)((long)-1177028211 ^ (long)-1177028212), oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14896.Field7897 + oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getLength() - (int)((long)-817826154 ^ (long)-817826153));
            ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU2.drawCuboid(oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14896, this.Field11955, (int)378608107L ^ 0x169119D4, (int)((long)1315354027 ^ (long)836351252));
        }
        ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU2.draw();
        GlStateManager.depthMask(((int)-1264301198L ^ 0xB4A44B72) != 0);
        this.Field11974.renderOverlay();
        GlStateManager.depthMask((boolean)((long)1459284016 ^ (long)1459284017));
        GL11.glDisable((int)((int)((long)-355258363 ^ (long)-355258276) << 5));
        GlStateManager.disableBlend();
        GlStateManager.enableTexture2D();
    }

    private void renderWorld(float f, long l) {
        GlStateManager.enableCull();
        this.Field11953.endStartSection("culling");
        Frustum frustum = new Frustum();
        Entity entity = this.Field11952.getRenderViewEntity();
        double d = YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11951.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        double d2 = YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11951.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        double d3 = YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11951.Field15157;
        frustum.setPosition(d, d2, d3);
        GlStateManager.shadeModel((int)((int)((long)-1026563852 ^ (long)-1026556427)));
        this.Field11953.endStartSection("prepareterrain");
        this.Field11952.getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
        RenderHelper.disableStandardItemLighting();
        this.Field11953.endStartSection("terrain_setup");
        int n = this.Field11986;
        this.Field11986 = n + (int)((long)-1959516670 ^ (long)-1959516669);
        this.setupTerrain(entity, f, (ICamera)frustum, n, this.isInsideWorld(d, d2, d3));
        this.Field11953.endStartSection("updatechunks");
        this.updateChunks(l / (0x8A32082L & 0x5400020BL));
        this.Field11953.endStartSection("terrain");
        GlStateManager.matrixMode((int)(((int)-1500051464L ^ 0xA69707EF) << 8));
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate((int)((int)((long)-981829830 ^ (long)-981829957) << 1), (int)((int)1907917350L ^ 0x71B88125), (int)((int)-33384999L ^ 0xFE0295D8), (int)((int)((long)972767294 ^ (long)972767294)));
        this.renderBlockLayer(BlockRenderLayer.SOLID, f, (int)((long)-1379702384 ^ (long)-1379702383) << 1, entity);
        this.renderBlockLayer(BlockRenderLayer.CUTOUT_MIPPED, f, (int)((long)-575556537 ^ (long)-575556538) << 1, entity);
        this.Field11952.getTextureManager().getTexture(TextureMap.LOCATION_BLOCKS_TEXTURE).setBlurMipmap(((int)1591505429L ^ 0x5EDC7215) != 0, ((int)380211593L ^ 0x16A99189) != 0);
        this.renderBlockLayer(BlockRenderLayer.CUTOUT, f, (int)((long)-1707215096 ^ (long)-1707215095) << 1, entity);
        this.Field11952.getTextureManager().getTexture(TextureMap.LOCATION_BLOCKS_TEXTURE).restoreLastBlurMipmap();
        GlStateManager.disableBlend();
        GlStateManager.shadeModel((int)(((int)1974109246L ^ 0x75AA8423) << 8));
        GlStateManager.alphaFunc((int)((int)((long)926102601 ^ (long)926102728) << 2), (float)Float.intBitsToFloat((int)1234641896L ^ 0x745BEF25));
        GlStateManager.matrixMode((int)((int)((long)166445731 ^ (long)166445748) << 8));
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        this.Field11953.endStartSection("entities");
        RenderHelper.enableStandardItemLighting();
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate((int)((int)((long)613823550 ^ (long)613823935) << 1), (int)((int)((long)-134564096 ^ (long)-134564861)), (int)((int)164836038L ^ 0x9D332C7), (int)((int)58240973L ^ 0x378AFCD));
        this.renderEntities(entity, (ICamera)frustum, f);
        GlStateManager.disableBlend();
        RenderHelper.disableStandardItemLighting();
        this.disableLightmap();
        GlStateManager.matrixMode((int)((int)((long)-1446025781 ^ (long)-1446025764) << 8));
        GlStateManager.popMatrix();
        GlStateManager.enableCull();
        GlStateManager.alphaFunc((int)((int)((long)1980123441 ^ (long)1980123568) << 2), (float)Float.intBitsToFloat((int)((long)447821857 ^ (long)662566124)));
        this.Field11952.getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
        GlStateManager.shadeModel((int)((int)((long)1312339121 ^ (long)1312336304)));
        GlStateManager.depthMask((boolean)((long)-1480852392 ^ (long)-1480852392));
        GlStateManager.pushMatrix();
        this.Field11953.endStartSection("translucent");
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate((int)(((int)672479903L ^ 0x28153B1E) << 1), (int)((int)((long)-1570488166 ^ (long)-1570487399)), (int)((int)((long)17375076 ^ (long)17375077)), (int)((int)((long)-300967964 ^ (long)-300967964)));
        this.renderBlockLayer(BlockRenderLayer.TRANSLUCENT, f, (int)((long)-1925408375 ^ (long)-1925408376) << 1, entity);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
        GlStateManager.depthMask(((int)1094250764L ^ 0x4138F10D) != 0);
        GlStateManager.shadeModel((int)((int)((long)-934284991 ^ (long)-934284964) << 8));
        GlStateManager.enableCull();
    }

    private boolean isInsideWorld(double d, double d2, double d3) {
        int n;
        if (d >= Double.longBitsToDouble(0x5E0E13EED27E5FC6L ^ 0xE1FE13EED27E5FC6L) && d2 >= Double.longBitsToDouble((long)2124215529 ^ 0xBFF000007E9CF4E9L) && d3 >= Double.longBitsToDouble(0x97D262B146C1937EL ^ 0x282262B146C1937EL) && d <= (double)this.Field11956.getWidth() && d2 <= (double)this.Field11956.getHeight() && d3 <= (double)this.Field11956.getLength()) {
            n = (int)996560583L ^ 0x3B664EC6;
            return n != 0;
        }
        n = (int)((long)-177106796 ^ (long)-177106796);
        return n != 0;
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
            this.Field11972 = new ChunkRenderDispatcher((int)((long)-1044251541 ^ (long)-1044251538));
        }
        if (this.Field11973 == null) {
            this.Field11973 = new ppgCVXcfiSfr3inPtq2TIUtq3zK7pHww((int)315866376L ^ 0x12D3BD0D);
        }
        this.Field11985 = (int)((long)-1691050526 ^ (long)-1691050525);
        this.Field11975 = Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7980;
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
        this.Field11960 = new Ab69MuVR4kkxksx2osBQ0WtXZNaXCgoI((World)this.Field11956, this.Field11975, this, this.Field11981);
        double d = YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11951.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        double d2 = YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11951.Field15157;
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
        int n = (int)((long)-1036117035 ^ (long)-1036117035);
        this.Field11953.startSection("prepare");
        TileEntityRendererDispatcher.instance.prepare((World)this.Field11956, this.Field11952.getTextureManager(), this.Field11952.fontRenderer, entity, this.Field11952.objectMouseOver, f);
        this.Field11954.cacheActiveRenderInfo((World)this.Field11956, this.Field11952.fontRenderer, entity, this.Field11952.pointedEntity, this.Field11952.gameSettings, f);
        this.Field11976 = (int)1999657486L ^ 0x77305A0E;
        this.Field11977 = (int)-462125249L ^ 0xE474873F;
        this.Field11978 = (int)-1447916843L ^ 0xA9B28AD5;
        this.Field11979 = (int)527750838L ^ 0x1F74D6B6;
        double d = YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11951.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        double d2 = YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11951.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        double d3 = YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11951.Field15157;
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
                TileEntityRendererDispatcher.instance.drawBatch((int)((long)-2129693702 ^ (long)-2129693702));
                this.Field11952.entityRenderer.disableLightmap();
                this.Field11953.endSection();
                return;
            }
            YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)iterator.next();
            Iterator iterator2 = ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14045.getCompiledChunk().getTileEntities().iterator();
            while (true) {
                if (!iterator2.hasNext()) continue block0;
                TileEntity tileEntity = (TileEntity)iterator2.next();
                AxisAlignedBB axisAlignedBB = tileEntity.getRenderBoundingBox();
                this.Field11978 += (int)((long)2020358311 ^ (long)2020358310);
                if (!tileEntity.shouldRenderInPass((int)-102193529L ^ 0xF9E8A687) || !iCamera.isBoundingBoxInFrustum(axisAlignedBB) || !this.Field11952.world.isAirBlock(tileEntity.getPos().add((Vec3i)this.Field11956.Field14896))) continue;
                TileEntityRendererDispatcher.instance.render(tileEntity, f, (int)((long)1218276632 ^ (long)-1218276633));
                this.Field11979 += (int)911841192L ^ 0x365997A9;
            }
            break;
        }
    }

    public String getDebugInfoRenders() {
        int n = this.Field11960.renderChunks.length;
        int n2 = this.getRenderedChunks();
        Object[] objectArray = new Object[(int)((long)-707429528 ^ (long)-707429523)];
        objectArray[(int)2021391067L ^ 0x787BFADB] = n2;
        objectArray[(int)76426511L ^ 0x48E2D0E] = n;
        objectArray[((int)-1871305596L ^ 0x90762485) << 1] = this.Field11952.renderChunksMany ? "(s) " : "";
        objectArray[(int)310770285L ^ 0x1285FA6E] = this.Field11975;
        objectArray[((int)-15555004L ^ 0xFF12A645) << 2] = this.Field11972.getDebugInfo();
        return String.format("C: %d/%d %sD: %d, %s", objectArray);
    }

    protected int getRenderedChunks() {
        int n = (int)-469297794L ^ 0xE407157E;
        Iterator iterator = this.Field11959.iterator();
        while (iterator.hasNext()) {
            YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)iterator.next();
            CompiledChunk compiledChunk = ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14045.compiledChunk;
            if (compiledChunk == CompiledChunk.DUMMY || compiledChunk.isEmpty()) continue;
            ++n;
        }
        return n;
    }

    public String getDebugInfoEntities() {
        Object[] objectArray = new Object[((int)1732281066L ^ 0x674082EB) << 1];
        objectArray[(int)((long)-272080255 ^ (long)-272080255)] = this.Field11977;
        objectArray[(int)((long)-717924888 ^ (long)-717924887)] = this.Field11976;
        return String.format("E: %d/%d", objectArray);
    }

    public String getDebugInfoTileEntities() {
        Object[] objectArray = new Object[((int)312273863L ^ 0x129CEBC6) << 1];
        objectArray[(int)((long)1775019966 ^ (long)1775019966)] = this.Field11979;
        objectArray[(int)-1516963875L ^ 0xA594F7DC] = this.Field11978;
        return String.format("TE: %d/%d", objectArray);
    }

    public void setupTerrain(Entity entity, double d, ICamera iCamera, int n, boolean bl) {
        BlockPos blockPos;
        Collection<YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi> collection;
        if (Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7980 != this.Field11975 || this.Field11980 != OpenGlHelper.useVbo()) {
            this.loadRenderers();
        }
        this.Field11953.startSection("camera");
        double d2 = YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11951.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        double d3 = YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11951.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        double d4 = YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11951.Field15157;
        double d5 = d2 - this.Field11961;
        double d6 = d3 - this.Field11962;
        double d7 = d4 - this.Field11963;
        int n2 = MathHelper.floor((double)d2) >> (((int)-1763192368L ^ 0x96E7D1D1) << 2);
        int n3 = MathHelper.floor((double)d3) >> ((int)((long)1350758435 ^ (long)1350758434) << 2);
        int n4 = MathHelper.floor((double)d4) >> ((int)((long)-1714224940 ^ (long)-1714224939) << 2);
        if (this.Field11964 != n2 || this.Field11965 != n3 || this.Field11966 != n4 || d5 * d5 + d6 * d6 + d7 * d7 > Double.longBitsToDouble(0xB20728C82EFAD72EL ^ 0xF23728C82EFAD72EL)) {
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
        BlockPos blockPos2 = new BlockPos(d2, d3 + (double)entity.getEyeHeight(), d4);
        RenderChunk renderChunk = this.Field11960.getRenderChunk(blockPos2);
        aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC2 = this.Field11960.getRenderOverlay(blockPos2);
        this.Field11985 = this.Field11985 || !this.Field11957.isEmpty() || d2 != this.Field11967 || d3 != this.Field11968 || d4 != this.Field11969 || (double)entity.rotationPitch != this.Field11970 || (double)entity.rotationYaw != this.Field11971 ? (int)((long)-363084702 ^ (long)-363084701) : (int)1771990397L ^ 0x699E6D7D;
        this.Field11967 = d2;
        this.Field11968 = d3;
        this.Field11969 = d4;
        this.Field11970 = entity.rotationPitch;
        this.Field11971 = entity.rotationYaw;
        this.Field11953.endStartSection("update");
        if (this.Field11985) {
            EnumFacing enumFacing;
            int n5;
            this.Field11985 = (int)((long)-1852679655 ^ (long)-1852679655);
            this.Field11959 = Lists.newArrayListWithCapacity(((int)-1654987590L ^ 0x9D5AE0FB) << 6);
            collection = Lists.newLinkedList();
            int n6 = this.Field11952.renderChunksMany;
            if (renderChunk != null) {
                n5 = (int)((long)1369428180 ^ (long)1369428180);
                YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = new YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this, renderChunk, aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC2, null, (int)((long)786635288 ^ (long)786635288));
                Set set = this.getVisibleSides(blockPos2);
                if (set.size() == (int)((long)1118718871 ^ (long)1118718870)) {
                    blockPos = this.getViewVector(entity, d);
                    enumFacing = EnumFacing.getFacingFromVector((float)blockPos.x, (float)blockPos.y, (float)blockPos.z).getOpposite();
                    set.remove(enumFacing);
                }
                if (set.isEmpty()) {
                    n5 = (int)-1080929465L ^ 0xBF925346;
                }
                if (bl && this.Field11956.getBlockState(blockPos2).isOpaqueCube()) {
                    n6 = (int)((long)-567851193 ^ (long)-567851193);
                }
                renderChunk.setFrameIndex(n);
                aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC2.setFrameIndex(n);
                ((LinkedList)collection).add(ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
            } else {
                n5 = blockPos2.getY() > 0 ? ((int)-629729017L ^ 0xDA771918) << 3 : (int)((long)-832039282 ^ (long)-832039281) << 3;
                for (int i = -this.Field11975; i <= this.Field11975; ++i) {
                    for (int j = -this.Field11975; j <= this.Field11975; ++j) {
                        blockPos = new BlockPos((i << ((int)((long)-1587538027 ^ (long)-1587538028) << 2)) + (((int)-1568280425L ^ 0xA285F096) << 3), n5, (j << ((int)((long)1046411051 ^ (long)1046411050) << 2)) + (((int)-1986557071L ^ 0x89978B70) << 3));
                        enumFacing = this.Field11960.getRenderChunk(blockPos2);
                        aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC3 = this.Field11960.getRenderOverlay(blockPos);
                        if (enumFacing == null || !iCamera.isBoundingBoxInFrustum(enumFacing.boundingBox)) continue;
                        enumFacing.setFrameIndex(n);
                        aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC3.setFrameIndex(n);
                        ((LinkedList)collection).add(new YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this, (RenderChunk)enumFacing, aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC3, null, (int)((long)-367961474 ^ (long)-367961474)));
                    }
                }
            }
            this.Field11953.startSection("iteration");
            while (!((AbstractCollection)collection).isEmpty()) {
                YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)((LinkedList)collection).poll();
                RenderChunk renderChunk2 = ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14045;
                EnumFacing enumFacing2 = ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14047;
                this.Field11959.add(ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
                blockPos = EnumFacing.VALUES;
                int n7 = ((EnumFacing[])blockPos).length;
                for (int i = (int)-1469323998L ^ 0xA86BE522; i < n7; ++i) {
                    EnumFacing enumFacing3 = blockPos[i];
                    RenderChunk renderChunk3 = this.getNeighborRenderChunk(blockPos2, renderChunk2, enumFacing3);
                    aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC4 = this.getNeighborRenderOverlay(blockPos2, renderChunk2, enumFacing3);
                    if (n6 != 0 && ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14048.contains(enumFacing3.getOpposite()) || n6 != 0 && enumFacing2 != null && !renderChunk2.getCompiledChunk().isVisible(enumFacing2.getOpposite(), enumFacing3) || renderChunk3 == null || !renderChunk3.setFrameIndex(n) || !iCamera.isBoundingBoxInFrustum(renderChunk3.boundingBox)) continue;
                    YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2 = new YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this, renderChunk3, aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC4, enumFacing3, ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14049 + ((int)1644079240L ^ 0x61FEA889));
                    ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2.Field14048.addAll(ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14048);
                    ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2.Field14048.add(enumFacing3);
                    ((LinkedList)collection).add(ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2);
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
            YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)iterator.next();
            RenderChunk renderChunk4 = ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14045;
            blockPos = ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14046;
            if (renderChunk4.needsUpdate() || collection.contains(renderChunk4)) {
                this.Field11985 = (int)((long)-562604457 ^ (long)-562604458);
                this.Field11957.add(renderChunk4);
            }
            if (!blockPos.needsUpdate() && !set.contains(blockPos)) continue;
            this.Field11985 = (int)-1464653868L ^ 0xA8B327D5;
            this.Field11958.add(blockPos);
        }
    }

    private Set getVisibleSides(BlockPos blockPos) {
        VisGraph visGraph = new VisGraph();
        BlockPos blockPos2 = new BlockPos(blockPos.getX() & (int)((long)1430469955 ^ (long)-1430469965), blockPos.getY() & ((int)654311802L ^ 0xD8FFFE8A), blockPos.getZ() & ((int)392138451L ^ 0xE8A07123));
        Iterator iterator = BlockPos.getAllInBoxMutable((BlockPos)blockPos2, (BlockPos)blockPos2.add((int)258077792L ^ 0xF61F46F, (int)-1776599391L ^ 0x961B3EAE, (int)2048160119L ^ 0x7A147178)).iterator();
        while (iterator.hasNext()) {
            BlockPos.MutableBlockPos mutableBlockPos = (BlockPos.MutableBlockPos)iterator.next();
            if (!this.Field11956.getBlockState((BlockPos)mutableBlockPos).isOpaqueCube()) continue;
            visGraph.setOpaqueCube((BlockPos)mutableBlockPos);
        }
        return visGraph.getVisibleFacings(blockPos);
    }

    private RenderChunk getNeighborRenderChunk(BlockPos blockPos, RenderChunk renderChunk, EnumFacing enumFacing) {
        BlockPos blockPos2 = renderChunk.getBlockPosOffset16(enumFacing);
        if (MathHelper.abs((int)(blockPos.getX() - blockPos2.getX())) > this.Field11975 * ((int)((long)204402439 ^ (long)204402438) << 4)) {
            return null;
        }
        if (blockPos2.getY() < 0) return null;
        if (blockPos2.getY() >= ((int)-1200839392L ^ 0xB86CA521) << 8) {
            return null;
        }
        if (MathHelper.abs((int)(blockPos.getZ() - blockPos2.getZ())) <= this.Field11975 * ((int)((long)-2121393073 ^ (long)-2121393074) << 4)) return this.Field11960.getRenderChunk(blockPos);
        return null;
    }

    private aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC getNeighborRenderOverlay(BlockPos blockPos, RenderChunk renderChunk, EnumFacing enumFacing) {
        BlockPos blockPos2 = renderChunk.getBlockPosOffset16(enumFacing);
        if (MathHelper.abs((int)(blockPos.getX() - blockPos2.getX())) > this.Field11975 * ((int)((long)-141432740 ^ (long)-141432739) << 4)) {
            return null;
        }
        if (blockPos2.getY() < 0) return null;
        if (blockPos2.getY() >= (int)((long)1081797119 ^ (long)1081797118) << 8) {
            return null;
        }
        if (MathHelper.abs((int)(blockPos.getZ() - blockPos2.getZ())) <= this.Field11975 * ((int)((long)1300558182 ^ (long)1300558183) << 4)) return this.Field11960.getRenderOverlay(blockPos2);
        return null;
    }

    protected Vector3f getViewVector(Entity entity, double d) {
        return super.getViewVector(entity, d);
    }

    public int renderBlockLayer(BlockRenderLayer blockRenderLayer, double d, int n, Entity entity) {
        RenderHelper.disableStandardItemLighting();
        if (blockRenderLayer == BlockRenderLayer.TRANSLUCENT) {
            this.Field11953.startSection("translucent_sort");
            double d2 = YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11951.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
            double d3 = YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11951.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
            double d4 = YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11951.Field15157;
            double d5 = d2 - this.Field11982;
            double d6 = d3 - this.Field11983;
            double d7 = d4 - this.Field11984;
            if (d5 * d5 + d6 * d6 + d7 * d7 > 1.0) {
                this.Field11982 = d2;
                this.Field11983 = d3;
                this.Field11984 = d4;
                int n2 = (int)((long)97374381 ^ (long)97374381);
                for (YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi : this.Field11959) {
                    if (!ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14045.compiledChunk.isLayerStarted(blockRenderLayer)) continue;
                    ++n2;
                    int cfr_ignored_0 = (int)((long)-1805508149 ^ (long)-1805508156);
                    this.Field11972.updateTransparencyLater(ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14045);
                    this.Field11973.updateTransparencyLater(ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14046);
                }
            }
            this.Field11953.endSection();
        }
        this.Field11953.startSection("filterempty");
        int n3 = (int)299005009L ^ 0x11D27451;
        int n4 = blockRenderLayer == BlockRenderLayer.TRANSLUCENT ? (int)((long)286162171 ^ (long)286162170) : (int)((long)96805282 ^ (long)96805282);
        int n5 = (int)-452320919L ^ 0xE50A2169;
        int n6 = this.Field11959.size();
        int n7 = (int)((long)365552375 ^ (long)365552374);
        int n8 = n5;
        while (true) {
            if (n8 == n6) {
                this.Field11953.endStartSection("render_" + blockRenderLayer);
                this.renderBlockLayer(blockRenderLayer);
                this.Field11953.endSection();
                return n3;
            }
            YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field11959.get(n8);
            RenderChunk renderChunk = ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14045;
            aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC2 = ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14046;
            if (!renderChunk.getCompiledChunk().isLayerEmpty(blockRenderLayer)) {
                ++n3;
                this.Field11974.addRenderChunk(renderChunk, blockRenderLayer);
            }
            n8 += n7;
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
        return ((int)454468373L ^ 0x1B16A315) != 0;
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
            aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC2 = (aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC)((Object)object.next());
            if (!this.Field11973.updateChunkLater(aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC2)) {
                return;
            }
            aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC2.clearNeedsUpdate();
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
        this.markBlocksForUpdate(n2 - ((int)-209432826L ^ 0xF3844F07), n3 - (int)((long)934146003 ^ (long)934146002), n4 - ((int)-312337387L ^ 0xED621C14), n2 + ((int)-1491574634L ^ 0xA7186097), n3 + (int)((long)-1959041174 ^ (long)-1959041173), n4 + ((int)1902491822L ^ 0x7165B8AF), ((n & ((int)1071087077L ^ 0x3FD77DE4) << 3) != 0 ? (int)((long)929824882 ^ (long)929824883) : (int)((long)-1751953313 ^ (long)-1751953313)) != 0);
    }

    public void notifyLightSet(BlockPos blockPos) {
        int n = blockPos.getX();
        int n2 = blockPos.getY();
        int n3 = blockPos.getZ();
        this.markBlocksForUpdate(n - (int)((long)633034225 ^ (long)633034224), n2 - (int)((long)1647828564 ^ (long)1647828565), n3 - (int)((long)-939542055 ^ (long)-939542056), n + (int)((long)1046364193 ^ (long)1046364192), n2 + ((int)2030457215L ^ 0x7906517E), n3 + ((int)-1594148283L ^ 0xA0FB3A44), (boolean)((long)-1595663827 ^ (long)-1595663828));
    }

    public void markBlockRangeForRenderUpdate(int n, int n2, int n3, int n4, int n5, int n6) {
        this.markBlocksForUpdate(n - ((int)-1283725220L ^ 0xB37BE85D), n2 - (int)((long)2017877361 ^ (long)2017877360), n3 - (int)((long)1527028948 ^ (long)1527028949), n4 + ((int)-367210542L ^ 0xEA1CCFD3), n5 + (int)((long)-1951310714 ^ (long)-1951310713), n6 + ((int)-1822390430L ^ 0x93608763), ((int)678879032L ^ 0x2876DF39) != 0);
    }

    private void markBlocksForUpdate(int n, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        if (this.Field11956 == null) {
            return;
        }
        EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN = this.Field11956.Field14896;
        this.Field11960.markBlocksForUpdate(n - eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7895, n2 - eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7896, n3 - eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7897, n4 - eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7895, n5 - eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7896, n6 - eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7897, bl);
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
        int n;
        if (this.Field11957.isEmpty() && !this.Field11972.hasNoChunkUpdates()) {
            n = (int)-233849279L ^ 0xF20FBE40;
            return n != 0;
        }
        n = (int)((long)-1763947894 ^ (long)-1763947894);
        return n != 0;
    }

    public void setDisplayListEntitiesDirty() {
        this.Field11985 = (int)18467911L ^ 0x119CC46;
    }

    public void updateTileEntities(Collection collection, Collection collection2) {
    }

    static {
        Field11949 = ((int)334162387L ^ 0x13EAE9D2) << 1;
        Field11948 = (int)((long)14608275 ^ (long)14607314) << 6;
        Field11947 = ((int)-414879582L ^ 0xE74570A3) << 4;
        Field11946 = (int)((long)-750909611 ^ (long)-750909580) << 1;
        Field11945 = (int)((long)1436146393 ^ (long)1436146392) << 5;
        Field11944 = new YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo(Minecraft.getMinecraft());
        Field11950 = new SC3jYtFgw6fOrGxZqyA1modQPfsOxQG2("schematica", null, "shaders/alpha.frag");
        Field11951 = new DXjKqX0c7P4em579SJwxKJk7QIiAoRBF();
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1782734985 ^ (long)-1782734985);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-2115203587L ^ 0x81EC8D02);
            int n2 = (int)-1552459522L ^ 0xA377585B;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)631722286 ^ (long)631721489) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

