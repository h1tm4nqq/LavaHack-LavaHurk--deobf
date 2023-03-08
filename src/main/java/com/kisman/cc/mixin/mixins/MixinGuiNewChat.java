//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import net.minecraft.client.gui.*;
import lavahack.client.*;
import java.util.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(value = { GuiNewChat.class }, priority = 10000)
public class MixinGuiNewChat
{
    @Shadow
    public boolean Field15554;
    private float Field15555;
    private int Field15556;
    private long Field15557;
    private float Field15558;
    private int Field15559;
    
    public MixinGuiNewChat() {
        this.Field15557 = System.currentTimeMillis();
    }
    
    @Shadow
    @Shadow
    public float Method6286() {
        return 0.0f;
    }
    
    private void Method6287(final long n) {
        if (this.Field15555 < 1.0f) {
            this.Field15555 += 0.004f * n;
        }
        this.Field15555 = (float)dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2118((double)this.Field15555, 0.0, 1.0);
    }
    
    @Inject(method = { "drawChat" }, at = { @At("HEAD") })
    @Inject(method = { "drawChat" }, at = { @At("HEAD") })
    private void Method6288(final CallbackInfo callbackInfo) {
        final om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz = (om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz)leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162("ChatModifier");
        if (om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz.Method35() && om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz.Method4012().Method365()) {
            final long currentTimeMillis = System.currentTimeMillis();
            final long n = currentTimeMillis - this.Field15557;
            this.Field15557 = currentTimeMillis;
            this.Method6287(n);
            final float n2;
            this.Field15558 = (float)dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2118((double)(1.0f - (n2 = this.Field15555 - 1.0f) * n2 * n2 * n2), 0.0, 1.0);
        }
    }
    
    @Inject(method = { "drawChat" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;pushMatrix()V", ordinal = 0, shift = At.Shift.AFTER) })
    @Inject(method = { "drawChat" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;pushMatrix()V", ordinal = 0, shift = At.Shift.AFTER) })
    private void Method6289(final CallbackInfo p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: getfield        lavahack/client/leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16254:Llavahack/client/mDTIPR1uuF6FwDF9avyOpCAmGZCUXBgn;
        //     6: ldc             "ChatModifier"
        //     8: invokevirtual   lavahack/client/mDTIPR1uuF6FwDF9avyOpCAmGZCUXBgn.Method1162:(Ljava/lang/String;)Llavahack/client/WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
        //    11: checkcast       Llavahack/client/om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz;
        //    14: astore_2       
        //    15: aload_2        
        //    16: invokevirtual   lavahack/client/om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz.Method35:()Z
        //    19: ifeq            85
        //    22: aload_2        
        //    23: invokevirtual   lavahack/client/om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz.Method4012:()Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //    26: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //    29: ifeq            85
        //    32: fconst_1       
        //    33: fstore_3       
        //    34: aload_0        
        //    35: fload_3        
        //    36: ldc             9.0
        //    38: ldc             9.0
        //    40: aload_0        
        //    41: getfield        com/kisman/cc/mixin/mixins/MixinGuiNewChat.Field15558:F
        //    44: fmul           
        //    45: fsub           
        //    46: aload_0        
        //    47: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiNewChat.Method6286:()F
        //    50: fmul           
        //    51: fadd           
        //    52: fstore_3       
        //    53: iconst_0       
        //    54: istore          4
        //    56: aload_2        
        //    57: invokevirtual   lavahack/client/om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz.Method4013:()Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //    60: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //    63: ifeq            75
        //    66: aload_2        
        //    67: invokevirtual   lavahack/client/om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz.Method4014:()Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //    70: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method335:()I
        //    73: istore          4
        //    75: fconst_0       
        //    76: fload_3        
        //    77: iload           4
        //    79: i2f            
        //    80: fsub           
        //    81: fconst_0       
        //    82: invokestatic    net/minecraft/client/renderer/GlStateManager.translate:(FFF)V
        //    85: return         
        //    86: getstatic       lavahack/client/leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241:Llavahack/client/leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        //    89: getfield        lavahack/client/leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16254:Llavahack/client/mDTIPR1uuF6FwDF9avyOpCAmGZCUXBgn;
        //    92: ldc             "ChatModifier"
        //    94: invokevirtual   lavahack/client/mDTIPR1uuF6FwDF9avyOpCAmGZCUXBgn.Method1162:(Ljava/lang/String;)Llavahack/client/WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
        //    97: checkcast       Llavahack/client/om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz;
        //   100: astore_2       
        //   101: aload_2        
        //   102: invokevirtual   lavahack/client/om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz.Method35:()Z
        //   105: ifeq            171
        //   108: aload_2        
        //   109: invokevirtual   lavahack/client/om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz.Method4012:()Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //   112: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //   115: ifeq            171
        //   118: fconst_1       
        //   119: fstore_3       
        //   120: aload_0        
        //   121: fload_3        
        //   122: ldc             9.0
        //   124: ldc             9.0
        //   126: aload_0        
        //   127: getfield        com/kisman/cc/mixin/mixins/MixinGuiNewChat.Field15558:F
        //   130: fmul           
        //   131: fsub           
        //   132: aload_0        
        //   133: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiNewChat.Method6286:()F
        //   136: fmul           
        //   137: fadd           
        //   138: fstore_3       
        //   139: iconst_0       
        //   140: istore          4
        //   142: aload_2        
        //   143: invokevirtual   lavahack/client/om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz.Method4013:()Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //   146: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //   149: ifeq            161
        //   152: aload_2        
        //   153: invokevirtual   lavahack/client/om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz.Method4014:()Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //   156: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method335:()I
        //   159: istore          4
        //   161: fconst_0       
        //   162: fload_3        
        //   163: iload           4
        //   165: i2f            
        //   166: fsub           
        //   167: fconst_0       
        //   168: invokestatic    net/minecraft/client/renderer/GlStateManager.translate:(FFF)V
        //   171: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0085 (coming from #0082).
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
    
    @ModifyArg(method = { "drawChat" }, at = @At(value = "INVOKE", target = "Ljava/util/List;get(I)Ljava/lang/Object;", ordinal = 0, remap = false), index = 0)
    @ModifyArg(method = { "drawChat" }, at = @At(value = "INVOKE", target = "Ljava/util/List;get(I)Ljava/lang/Object;", ordinal = 0, remap = false), index = 0)
    private int Method6290(final int field15559) {
        return this.Field15559 = field15559;
    }
    
    @Redirect(method = { "drawChat" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiNewChat;drawRect(IIIII)V"))
    @Redirect(method = { "drawChat" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiNewChat;drawRect(IIIII)V"))
    private void Method6291(final int n, final int n2, final int n3, final int n4, final int n5) {
        if (o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Field16381.Method365()) {
            return;
        }
        Gui.drawRect(n, n2, n3, n4, n5);
    }
    
    @Redirect(method = { "drawChat" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/FontRenderer;drawStringWithShadow(Ljava/lang/String;FFI)I"))
    @Redirect(method = { "drawChat" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/FontRenderer;drawStringWithShadow(Ljava/lang/String;FFI)I"))
    private int Method6292(final FontRenderer fontRenderer, final String s, final float n, final float n2, final int n3) {
        final om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz = (om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz)leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162("ChatModifier");
        int rgb = n3;
        int n4 = (int)n2;
        if (this.Field15559 <= this.Field15556 && om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz.Method35() && om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz.Method4012().Method365()) {
            final int n5 = (int)(((int)n2 >> 24 & 0xFF) * this.Field15558);
            n4 = (((int)n2 & 0xFFFFFF) | n5 << 24);
            rgb = zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4729(n3, n5).getRGB();
        }
        if (om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz.Method35() && om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz.Method4015().Method365()) {
            return fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(s, (double)n, (double)n4, rgb);
        }
        return fontRenderer.drawStringWithShadow(s, n, (float)n4, rgb);
    }
    
    @Inject(method = { "printChatMessageWithOptionalDeletion" }, at = { @At("HEAD") })
    @Inject(method = { "printChatMessageWithOptionalDeletion" }, at = { @At("HEAD") })
    private void Method6293(final CallbackInfo callbackInfo) {
        this.Field15555 = 0.0f;
    }
    
    @ModifyVariable(method = { "setChatLine" }, at = @At("STORE"), ordinal = 0)
    @ModifyVariable(method = { "setChatLine" }, at = @At("STORE"), ordinal = 0)
    private List Method6294(final List list) {
        this.Field15556 = list.size() - 1;
        return list;
    }
    
    @ModifyVariable(method = { "getChatComponent" }, at = @At(value = "STORE", ordinal = 0), ordinal = 4)
    @ModifyVariable(method = { "getChatComponent" }, at = @At(value = "STORE", ordinal = 0), ordinal = 4)
    private int Method6295(final int n) {
        return n + 1;
    }
}
