//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import net.minecraft.client.model.*;
import org.spongepowered.asm.mixin.*;
import net.minecraft.util.*;
import net.minecraft.entity.item.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.renderer.entity.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import com.kisman.cc.mixin.mixins.accessor.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.injection.*;
import net.minecraft.entity.*;

@Mixin(value = { RenderEnderCrystal.class }, priority = 10000)
public class MixinRenderEnderCrystal extends Render
{
    @Final
    @Shadow
    private ModelBase Field13234;
    @Final
    @Shadow
    private ModelBase Field13235;
    @Final
    @Shadow
    private static ResourceLocation Field13236;
    
    @Shadow
    @Shadow
    @Nullable
    @Nullable
    protected ResourceLocation getEntityTexture(@NotNull @NotNull final EntityEnderCrystal entityEnderCrystal) {
        return null;
    }
    
    protected MixinRenderEnderCrystal(final RenderManager renderManager) {
        super(renderManager);
    }
    
    @Inject(method = { "<init>" }, at = { @At("RETURN") })
    @Inject(method = { "<init>" }, at = { @At("RETURN") })
    private void init(final RenderManager renderManager, final CallbackInfo callbackInfo) {
        ((AccessorRenderEnderCrystal)this).Method3251((ModelBase)new WazuyEmi1E8Qbbxmq0EXDYiIMAFUanLY(true));
        ((AccessorRenderEnderCrystal)this).Method3252((ModelBase)new WazuyEmi1E8Qbbxmq0EXDYiIMAFUanLY(false));
    }
    
    @Inject(method = { "doRender(Lnet/minecraft/entity/item/EntityEnderCrystal;DDDFF)V" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "doRender(Lnet/minecraft/entity/item/EntityEnderCrystal;DDDFF)V" }, at = { @At("HEAD") }, cancellable = true)
    public void IdoRender(final EntityEnderCrystal p0, final double p1, final double p2, final double p3, final float p4, final float p5, final CallbackInfo p6) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokevirtual   lavahack/client/PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP.Method35:()Z
        //     6: ifeq            107
        //     9: aload_1        
        //    10: getfield        net/minecraft/entity/item/EntityEnderCrystal.innerRotation:I
        //    13: i2f            
        //    14: fload           9
        //    16: fadd           
        //    17: fstore          11
        //    19: fload           11
        //    21: ldc             0.2
        //    23: fmul           
        //    24: invokestatic    net/minecraft/util/math/MathHelper.sin:(F)F
        //    27: fconst_2       
        //    28: fdiv           
        //    29: ldc             0.5
        //    31: fadd           
        //    32: fstore          12
        //    34: fload           12
        //    36: fload           12
        //    38: fload           12
        //    40: fmul           
        //    41: fadd           
        //    42: fstore          12
        //    44: invokestatic    org/lwjgl/opengl/GL11.glPushMatrix:()V
        //    47: dload_2        
        //    48: dload           4
        //    50: dload           6
        //    52: invokestatic    org/lwjgl/opengl/GL11.glTranslated:(DDD)V
        //    55: aload_0        
        //    56: aconst_null    
        //    57: invokevirtual   com/kisman/cc/mixin/mixins/MixinRenderEnderCrystal.bindTexture:(Lnet/minecraft/util/ResourceLocation;)V
        //    60: getstatic       lavahack/client/PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP.Field14113:Llavahack/client/PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP;
        //    63: invokevirtual   lavahack/client/PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP.Method5388:()Llavahack/client/RbKbhAXnZQkQqL8TiliRZ8uAfC3fffUO;
        //    66: aload_1        
        //    67: aload_1        
        //    68: invokevirtual   net/minecraft/entity/item/EntityEnderCrystal.shouldShowBottom:()Z
        //    71: ifeq            79
        //    74: aload_0        
        //    75: aconst_null    
        //    76: goto            81
        //    79: aload_0        
        //    80: aconst_null    
        //    81: fconst_0       
        //    82: fload           11
        //    84: ldc             3.0
        //    86: fmul           
        //    87: fload           12
        //    89: ldc             0.2
        //    91: fmul           
        //    92: fconst_0       
        //    93: fconst_0       
        //    94: ldc             0.0625
        //    96: invokevirtual   lavahack/client/RbKbhAXnZQkQqL8TiliRZ8uAfC3fffUO.Method4775:(Lnet/minecraft/entity/Entity;Lnet/minecraft/client/model/ModelBase;FFFFFF)V
        //    99: invokestatic    org/lwjgl/opengl/GL11.glPopMatrix:()V
        //   102: aload           10
        //   104: invokevirtual   org/spongepowered/asm/mixin/injection/callback/CallbackInfo.cancel:()V
        //   107: return         
        //   108: getstatic       lavahack/client/PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP.Field14113:Llavahack/client/PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP;
        //   111: invokevirtual   lavahack/client/PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP.Method35:()Z
        //   114: ifeq            215
        //   117: aload_1        
        //   118: getfield        net/minecraft/entity/item/EntityEnderCrystal.innerRotation:I
        //   121: i2f            
        //   122: fload           9
        //   124: fadd           
        //   125: fstore          11
        //   127: fload           11
        //   129: ldc             0.2
        //   131: fmul           
        //   132: invokestatic    net/minecraft/util/math/MathHelper.sin:(F)F
        //   135: fconst_2       
        //   136: fdiv           
        //   137: ldc             0.5
        //   139: fadd           
        //   140: fstore          12
        //   142: fload           12
        //   144: fload           12
        //   146: fload           12
        //   148: fmul           
        //   149: fadd           
        //   150: fstore          12
        //   152: invokestatic    org/lwjgl/opengl/GL11.glPushMatrix:()V
        //   155: dload_2        
        //   156: dload           4
        //   158: dload           6
        //   160: invokestatic    org/lwjgl/opengl/GL11.glTranslated:(DDD)V
        //   163: aload_0        
        //   164: aconst_null    
        //   165: invokevirtual   com/kisman/cc/mixin/mixins/MixinRenderEnderCrystal.bindTexture:(Lnet/minecraft/util/ResourceLocation;)V
        //   168: getstatic       lavahack/client/PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP.Field14113:Llavahack/client/PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP;
        //   171: invokevirtual   lavahack/client/PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP.Method5388:()Llavahack/client/RbKbhAXnZQkQqL8TiliRZ8uAfC3fffUO;
        //   174: aload_1        
        //   175: aload_1        
        //   176: invokevirtual   net/minecraft/entity/item/EntityEnderCrystal.shouldShowBottom:()Z
        //   179: ifeq            187
        //   182: aload_0        
        //   183: aconst_null    
        //   184: goto            189
        //   187: aload_0        
        //   188: aconst_null    
        //   189: fconst_0       
        //   190: fload           11
        //   192: ldc             3.0
        //   194: fmul           
        //   195: fload           12
        //   197: ldc             0.2
        //   199: fmul           
        //   200: fconst_0       
        //   201: fconst_0       
        //   202: ldc             0.0625
        //   204: invokevirtual   lavahack/client/RbKbhAXnZQkQqL8TiliRZ8uAfC3fffUO.Method4775:(Lnet/minecraft/entity/Entity;Lnet/minecraft/client/model/ModelBase;FFFFFF)V
        //   207: invokestatic    org/lwjgl/opengl/GL11.glPopMatrix:()V
        //   210: aload           10
        //   212: invokevirtual   org/spongepowered/asm/mixin/injection/callback/CallbackInfo.cancel:()V
        //   215: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0107 (coming from #0104).
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
    
    @Shadow
    @Shadow
    @Nullable
    @Nullable
    protected ResourceLocation getEntityTexture(@NotNull @NotNull final Entity entity) {
        return this.getEntityTexture((EntityEnderCrystal)entity);
    }
}
