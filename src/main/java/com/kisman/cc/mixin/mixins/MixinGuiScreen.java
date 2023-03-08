//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import baritone.utils.accessor.*;
import net.minecraft.client.*;
import org.spongepowered.asm.mixin.*;
import java.util.*;
import net.minecraft.client.gui.*;
import net.minecraft.item.*;
import java.net.*;
import org.spongepowered.asm.mixin.gen.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ GuiScreen.class })
public abstract class MixinGuiScreen extends Gui implements IGuiScreen, GuiYesNoCallback
{
    @Shadow
    public Minecraft Field11546;
    
    @Shadow
    @Shadow
    protected void drawHoveringText(final List list, final int n, final int n2, final FontRenderer fontRenderer) {
    }
    
    @Shadow
    @Shadow
    public List getItemToolTip(final ItemStack itemStack) {
        return null;
    }
    
    @Invoker("openWebLink")
    @Invoker("openWebLink")
    public abstract void openLink(final URI p0);
    
    @Inject(method = { "drawDefaultBackground" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "drawDefaultBackground" }, at = { @At("HEAD") }, cancellable = true)
    public void drof(final CallbackInfo p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: getfield        lavahack/client/o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16379:Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //     6: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //     9: ifeq            32
        //    12: aload_0        
        //    13: aconst_null    
        //    14: getfield        net/minecraft/client/Minecraft.world:Lnet/minecraft/client/multiplayer/WorldClient;
        //    17: ifnull          32
        //    20: aload_0        
        //    21: aconst_null    
        //    22: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    25: ifnull          32
        //    28: aload_1        
        //    29: invokevirtual   org/spongepowered/asm/mixin/injection/callback/CallbackInfo.cancel:()V
        //    32: return         
        //    33: getstatic       lavahack/client/o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374:Llavahack/client/o9lanP0gHU278cwDFs7XEsyWoBrJVe44;
        //    36: getfield        lavahack/client/o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16379:Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //    39: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //    42: ifeq            65
        //    45: aload_0        
        //    46: aconst_null    
        //    47: getfield        net/minecraft/client/Minecraft.world:Lnet/minecraft/client/multiplayer/WorldClient;
        //    50: ifnull          65
        //    53: aload_0        
        //    54: aconst_null    
        //    55: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    58: ifnull          65
        //    61: aload_1        
        //    62: invokevirtual   org/spongepowered/asm/mixin/injection/callback/CallbackInfo.cancel:()V
        //    65: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0032 (coming from #0017).
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
    
    public void confirmClicked(final boolean b, final int n) {
    }
    
    @Inject(method = { "renderToolTip" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "renderToolTip" }, at = { @At("HEAD") }, cancellable = true)
    private void toolTipHook(final ItemStack p0, final int p1, final int p2, final CallbackInfo p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_1        
        //     5: iload_2        
        //     6: iload_3        
        //     7: invokespecial   lavahack/client/ahJMkUtzzEf7tJjbemx3021mGngs1J3z.<init>:(Lnet/minecraft/item/ItemStack;II)V
        //    10: astore          5
        //    12: getstatic       lavahack/client/leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242:Llavahack/client/zwWWWaEO7zKr7XG54ZhX4c3PejN1DTzJ;
        //    15: aload           5
        //    17: invokevirtual   lavahack/client/zwWWWaEO7zKr7XG54ZhX4c3PejN1DTzJ.Method715:(Ljava/lang/Object;)V
        //    20: aload           5
        //    22: invokevirtual   lavahack/client/ahJMkUtzzEf7tJjbemx3021mGngs1J3z.Method159:()Z
        //    25: ifne            63
        //    28: aload           5
        //    30: getfield        lavahack/client/ahJMkUtzzEf7tJjbemx3021mGngs1J3z.Field9201:I
        //    33: istore_2       
        //    34: aload           5
        //    36: getfield        lavahack/client/ahJMkUtzzEf7tJjbemx3021mGngs1J3z.Field9202:I
        //    39: istore_3       
        //    40: aload_1        
        //    41: invokestatic    net/minecraftforge/fml/client/config/GuiUtils.preItemToolTip:(Lnet/minecraft/item/ItemStack;)V
        //    44: aload_0        
        //    45: aload_0        
        //    46: aload_1        
        //    47: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiScreen.getItemToolTip:(Lnet/minecraft/item/ItemStack;)Ljava/util/List;
        //    50: iload_2        
        //    51: iload_3        
        //    52: aload_0        
        //    53: aconst_null    
        //    54: getfield        net/minecraft/client/Minecraft.fontRenderer:Lnet/minecraft/client/gui/FontRenderer;
        //    57: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiScreen.drawHoveringText:(Ljava/util/List;IILnet/minecraft/client/gui/FontRenderer;)V
        //    60: invokestatic    net/minecraftforge/fml/client/config/GuiUtils.postItemToolTip:()V
        //    63: aload           4
        //    65: invokevirtual   org/spongepowered/asm/mixin/injection/callback/CallbackInfo.cancel:()V
        //    68: return         
        //    69: new             Llavahack/client/ahJMkUtzzEf7tJjbemx3021mGngs1J3z;
        //    72: dup            
        //    73: aload_1        
        //    74: iload_2        
        //    75: iload_3        
        //    76: invokespecial   lavahack/client/ahJMkUtzzEf7tJjbemx3021mGngs1J3z.<init>:(Lnet/minecraft/item/ItemStack;II)V
        //    79: astore          5
        //    81: getstatic       lavahack/client/leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242:Llavahack/client/zwWWWaEO7zKr7XG54ZhX4c3PejN1DTzJ;
        //    84: aload           5
        //    86: invokevirtual   lavahack/client/zwWWWaEO7zKr7XG54ZhX4c3PejN1DTzJ.Method715:(Ljava/lang/Object;)V
        //    89: aload           5
        //    91: invokevirtual   lavahack/client/ahJMkUtzzEf7tJjbemx3021mGngs1J3z.Method159:()Z
        //    94: ifne            132
        //    97: aload           5
        //    99: getfield        lavahack/client/ahJMkUtzzEf7tJjbemx3021mGngs1J3z.Field9201:I
        //   102: istore_2       
        //   103: aload           5
        //   105: getfield        lavahack/client/ahJMkUtzzEf7tJjbemx3021mGngs1J3z.Field9202:I
        //   108: istore_3       
        //   109: aload_1        
        //   110: invokestatic    net/minecraftforge/fml/client/config/GuiUtils.preItemToolTip:(Lnet/minecraft/item/ItemStack;)V
        //   113: aload_0        
        //   114: aload_0        
        //   115: aload_1        
        //   116: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiScreen.getItemToolTip:(Lnet/minecraft/item/ItemStack;)Ljava/util/List;
        //   119: iload_2        
        //   120: iload_3        
        //   121: aload_0        
        //   122: aconst_null    
        //   123: getfield        net/minecraft/client/Minecraft.fontRenderer:Lnet/minecraft/client/gui/FontRenderer;
        //   126: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiScreen.drawHoveringText:(Ljava/util/List;IILnet/minecraft/client/gui/FontRenderer;)V
        //   129: invokestatic    net/minecraftforge/fml/client/config/GuiUtils.postItemToolTip:()V
        //   132: aload           4
        //   134: invokevirtual   org/spongepowered/asm/mixin/injection/callback/CallbackInfo.cancel:()V
        //   137: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0063 (coming from #0060).
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
}
