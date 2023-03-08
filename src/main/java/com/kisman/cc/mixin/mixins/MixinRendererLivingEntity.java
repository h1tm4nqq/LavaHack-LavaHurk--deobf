//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import net.minecraft.client.model.*;
import net.minecraft.client.renderer.entity.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import org.spongepowered.asm.mixin.injection.*;
import net.minecraft.entity.*;
import net.minecraft.client.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.*;
import net.minecraft.util.*;
import javax.annotation.*;

@Mixin(value = { RenderLivingBase.class }, priority = 10)
public class MixinRendererLivingEntity extends Render
{
    @Shadow
    protected ModelBase Field16560;
    
    protected MixinRendererLivingEntity() {
        super((RenderManager)null);
    }
    
    @Inject(method = { "renderName(Lnet/minecraft/entity/Entity;DDD)V" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "renderName(Lnet/minecraft/entity/Entity;DDD)V" }, at = { @At("HEAD") }, cancellable = true)
    private void doRenderName(final Entity entity, final double n, final double n2, final double n3, final CallbackInfo callbackInfo) {
        final OvvNFVp1prZcFYv57XGirjG11JCXathw ovvNFVp1prZcFYv57XGirjG11JCXathw = new OvvNFVp1prZcFYv57XGirjG11JCXathw(entity, n, n, n3, "", 0.0);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)ovvNFVp1prZcFYv57XGirjG11JCXathw);
        if (ovvNFVp1prZcFYv57XGirjG11JCXathw.Method159()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "doRender(Lnet/minecraft/entity/EntityLivingBase;DDDFF)V" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "doRender(Lnet/minecraft/entity/EntityLivingBase;DDDFF)V" }, at = { @At("HEAD") }, cancellable = true)
    private void doDoRender(final EntityLivingBase entityLivingBase, final double n, final double n2, final double n3, final float n4, final float n5, final CallbackInfo callbackInfo) {
        final Minecraft getMinecraft = Minecraft.getMinecraft();
        if (getMinecraft.world != null && getMinecraft.player != null && uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu.Field17089.Method35() && uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu.Field17089.Field17086.Method365() && getMinecraft.player.getDistance((Entity)entityLivingBase) > uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu.Field17089.Field17087.Method335()) {
            callbackInfo.cancel();
        }
    }
    
    @Overwrite
    @Overwrite
    protected void renderModel(final EntityLivingBase p0, final float p1, final float p2, final float p3, final float p4, final float p5, final float p6) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: invokevirtual   com/kisman/cc/mixin/mixins/MixinRendererLivingEntity.isVisible:(Lnet/minecraft/entity/EntityLivingBase;)Z
        //     5: istore          8
        //     7: iload           8
        //     9: ifne            29
        //    12: aload_1        
        //    13: invokestatic    net/minecraft/client/Minecraft.getMinecraft:()Lnet/minecraft/client/Minecraft;
        //    16: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    19: invokevirtual   net/minecraft/entity/EntityLivingBase.isInvisibleToPlayer:(Lnet/minecraft/entity/player/EntityPlayer;)Z
        //    22: ifne            29
        //    25: iconst_1       
        //    26: goto            30
        //    29: iconst_0       
        //    30: istore          9
        //    32: iload           8
        //    34: ifne            42
        //    37: iload           9
        //    39: ifeq            123
        //    42: aload_0        
        //    43: aload_1        
        //    44: invokevirtual   com/kisman/cc/mixin/mixins/MixinRendererLivingEntity.bindEntityTexture:(Lnet/minecraft/entity/Entity;)Z
        //    47: ifne            51
        //    50: return         
        //    51: getstatic       lavahack/client/PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP.Field14113:Llavahack/client/PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP;
        //    54: invokevirtual   lavahack/client/PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP.Method35:()Z
        //    57: ifeq            85
        //    60: getstatic       lavahack/client/PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP.Field14113:Llavahack/client/PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP;
        //    63: invokevirtual   lavahack/client/PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP.Method5388:()Llavahack/client/RbKbhAXnZQkQqL8TiliRZ8uAfC3fffUO;
        //    66: aload_1        
        //    67: aload_0        
        //    68: aconst_null    
        //    69: fload_2        
        //    70: fload_3        
        //    71: fload           4
        //    73: fload           5
        //    75: fload           6
        //    77: fload           7
        //    79: invokevirtual   lavahack/client/RbKbhAXnZQkQqL8TiliRZ8uAfC3fffUO.Method4775:(Lnet/minecraft/entity/Entity;Lnet/minecraft/client/model/ModelBase;FFFFFF)V
        //    82: goto            123
        //    85: iload           9
        //    87: ifeq            96
        //    90: getstatic       net/minecraft/client/renderer/GlStateManager$Profile.TRANSPARENT_MODEL:Lnet/minecraft/client/renderer/GlStateManager$Profile;
        //    93: invokestatic    net/minecraft/client/renderer/GlStateManager.enableBlendProfile:(Lnet/minecraft/client/renderer/GlStateManager$Profile;)V
        //    96: aload_0        
        //    97: aconst_null    
        //    98: aload_1        
        //    99: fload_2        
        //   100: fload_3        
        //   101: fload           4
        //   103: fload           5
        //   105: fload           6
        //   107: fload           7
        //   109: invokevirtual   net/minecraft/client/model/ModelBase.render:(Lnet/minecraft/entity/Entity;FFFFFF)V
        //   112: iload           9
        //   114: ifeq            123
        //   117: getstatic       net/minecraft/client/renderer/GlStateManager$Profile.TRANSPARENT_MODEL:Lnet/minecraft/client/renderer/GlStateManager$Profile;
        //   120: invokestatic    net/minecraft/client/renderer/GlStateManager.disableBlendProfile:(Lnet/minecraft/client/renderer/GlStateManager$Profile;)V
        //   123: return         
        //   124: aload_0        
        //   125: aload_1        
        //   126: invokevirtual   com/kisman/cc/mixin/mixins/MixinRendererLivingEntity.isVisible:(Lnet/minecraft/entity/EntityLivingBase;)Z
        //   129: istore          8
        //   131: iload           8
        //   133: ifne            153
        //   136: aload_1        
        //   137: invokestatic    net/minecraft/client/Minecraft.getMinecraft:()Lnet/minecraft/client/Minecraft;
        //   140: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   143: invokevirtual   net/minecraft/entity/EntityLivingBase.isInvisibleToPlayer:(Lnet/minecraft/entity/player/EntityPlayer;)Z
        //   146: ifne            153
        //   149: iconst_1       
        //   150: goto            154
        //   153: iconst_0       
        //   154: istore          9
        //   156: iload           8
        //   158: ifne            166
        //   161: iload           9
        //   163: ifeq            247
        //   166: aload_0        
        //   167: aload_1        
        //   168: invokevirtual   com/kisman/cc/mixin/mixins/MixinRendererLivingEntity.bindEntityTexture:(Lnet/minecraft/entity/Entity;)Z
        //   171: ifne            175
        //   174: return         
        //   175: getstatic       lavahack/client/PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP.Field14113:Llavahack/client/PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP;
        //   178: invokevirtual   lavahack/client/PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP.Method35:()Z
        //   181: ifeq            209
        //   184: getstatic       lavahack/client/PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP.Field14113:Llavahack/client/PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP;
        //   187: invokevirtual   lavahack/client/PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP.Method5388:()Llavahack/client/RbKbhAXnZQkQqL8TiliRZ8uAfC3fffUO;
        //   190: aload_1        
        //   191: aload_0        
        //   192: aconst_null    
        //   193: fload_2        
        //   194: fload_3        
        //   195: fload           4
        //   197: fload           5
        //   199: fload           6
        //   201: fload           7
        //   203: invokevirtual   lavahack/client/RbKbhAXnZQkQqL8TiliRZ8uAfC3fffUO.Method4775:(Lnet/minecraft/entity/Entity;Lnet/minecraft/client/model/ModelBase;FFFFFF)V
        //   206: goto            247
        //   209: iload           9
        //   211: ifeq            220
        //   214: getstatic       net/minecraft/client/renderer/GlStateManager$Profile.TRANSPARENT_MODEL:Lnet/minecraft/client/renderer/GlStateManager$Profile;
        //   217: invokestatic    net/minecraft/client/renderer/GlStateManager.enableBlendProfile:(Lnet/minecraft/client/renderer/GlStateManager$Profile;)V
        //   220: aload_0        
        //   221: aconst_null    
        //   222: aload_1        
        //   223: fload_2        
        //   224: fload_3        
        //   225: fload           4
        //   227: fload           5
        //   229: fload           6
        //   231: fload           7
        //   233: invokevirtual   net/minecraft/client/model/ModelBase.render:(Lnet/minecraft/entity/Entity;FFFFFF)V
        //   236: iload           9
        //   238: ifeq            247
        //   241: getstatic       net/minecraft/client/renderer/GlStateManager$Profile.TRANSPARENT_MODEL:Lnet/minecraft/client/renderer/GlStateManager$Profile;
        //   244: invokestatic    net/minecraft/client/renderer/GlStateManager.disableBlendProfile:(Lnet/minecraft/client/renderer/GlStateManager$Profile;)V
        //   247: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0123 (coming from #0039).
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2183)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.Decompiler.decompile(Decompiler.java:70)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.decompile(Deobfuscator3000.java:538)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.decompileAndDeobfuscate(Deobfuscator3000.java:552)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.processMod(Deobfuscator3000.java:510)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.lambda$21(Deobfuscator3000.java:329)
        //     at java.base/java.lang.Thread.run(Thread.java:833)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    protected boolean isVisible(final EntityLivingBase entityLivingBase) {
        return !entityLivingBase.isInvisible() || this.renderOutlines;
    }
    
    @Nullable
    @Nullable
    protected ResourceLocation getEntityTexture(final EntityLivingBase entityLivingBase) {
        return null;
    }
    
    @Nullable
    @Nullable
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return this.getEntityTexture((EntityLivingBase)entity);
    }
}
