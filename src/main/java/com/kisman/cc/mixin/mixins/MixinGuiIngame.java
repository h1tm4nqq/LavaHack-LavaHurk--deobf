//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import net.minecraft.client.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.client.gui.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import org.spongepowered.asm.mixin.*;
import net.minecraft.client.entity.*;
import org.spongepowered.asm.mixin.injection.*;
import lavahack.client.*;

@Mixin(value = { GuiIngame.class }, priority = 10000)
public class MixinGuiIngame extends Gui
{
    @Shadow
    @Final
    public Minecraft Field9696;
    
    @Shadow
    @Shadow
    protected void renderHotbarItem(final int n, final int n2, final float n3, final EntityPlayer entityPlayer, final ItemStack itemStack) {
    }
    
    @Shadow
    @Shadow
    public FontRenderer getFontRenderer() {
        return null;
    }
    
    @Inject(method = { "renderPortal" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "renderPortal" }, at = { @At("HEAD") }, cancellable = true)
    protected void antiPortal(final float n, final ScaledResolution scaledResolution, final CallbackInfo callbackInfo) {
        final DitR6vZ79qQrTZ031J7xzQQWKdUckNea.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = new DitR6vZ79qQrTZ031J7xzQQWKdUckNea.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV);
        if (vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method159()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "renderPumpkinOverlay" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "renderPumpkinOverlay" }, at = { @At("HEAD") }, cancellable = true)
    protected void renderPumpkinOverlayHook(final ScaledResolution scaledResolution, final CallbackInfo callbackInfo) {
        final DitR6vZ79qQrTZ031J7xzQQWKdUckNea.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS = new DitR6vZ79qQrTZ031J7xzQQWKdUckNea.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS);
        if (ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method159()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "renderPotionEffects" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "renderPotionEffects" }, at = { @At("HEAD") }, cancellable = true)
    protected void renderPotionEffectsHook(final ScaledResolution scaledResolution, final CallbackInfo callbackInfo) {
        final DitR6vZ79qQrTZ031J7xzQQWKdUckNea.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = new DitR6vZ79qQrTZ031J7xzQQWKdUckNea.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
        if (uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method159()) {
            callbackInfo.cancel();
        }
    }
    
    @Overwrite
    @Overwrite
    protected void renderHotbar(final ScaledResolution p0, final float p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   lavahack/client/qCjATt5pHVCmSQECehNpwU2XG9jgy37X.Method35:()Z
        //     4: ifeq            889
        //     7: new             Ljava/awt/Color;
        //    10: dup            
        //    11: bipush          31
        //    13: bipush          31
        //    15: bipush          31
        //    17: sipush          152
        //    20: invokespecial   java/awt/Color.<init>:(IIII)V
        //    23: astore_3       
        //    24: aload_0        
        //    25: aconst_null    
        //    26: invokevirtual   net/minecraft/client/Minecraft.getRenderViewEntity:()Lnet/minecraft/entity/Entity;
        //    29: instanceof      Lnet/minecraft/entity/player/EntityPlayer;
        //    32: ifeq            886
        //    35: fconst_1       
        //    36: fconst_1       
        //    37: fconst_1       
        //    38: fconst_1       
        //    39: invokestatic    net/minecraft/client/renderer/GlStateManager.color:(FFFF)V
        //    42: aload_0        
        //    43: aconst_null    
        //    44: invokevirtual   net/minecraft/client/Minecraft.getTextureManager:()Lnet/minecraft/client/renderer/texture/TextureManager;
        //    47: getstatic       net/minecraft/client/gui/GuiIngame.WIDGETS_TEX_PATH:Lnet/minecraft/util/ResourceLocation;
        //    50: invokevirtual   net/minecraft/client/renderer/texture/TextureManager.bindTexture:(Lnet/minecraft/util/ResourceLocation;)V
        //    53: aload_0        
        //    54: aconst_null    
        //    55: invokevirtual   net/minecraft/client/Minecraft.getRenderViewEntity:()Lnet/minecraft/entity/Entity;
        //    58: checkcast       Lnet/minecraft/entity/player/EntityPlayer;
        //    61: astore          4
        //    63: aload           4
        //    65: invokevirtual   net/minecraft/entity/player/EntityPlayer.getHeldItemOffhand:()Lnet/minecraft/item/ItemStack;
        //    68: astore          5
        //    70: aload           4
        //    72: invokevirtual   net/minecraft/entity/player/EntityPlayer.getPrimaryHand:()Lnet/minecraft/util/EnumHandSide;
        //    75: invokevirtual   net/minecraft/util/EnumHandSide.opposite:()Lnet/minecraft/util/EnumHandSide;
        //    78: astore          6
        //    80: aload_1        
        //    81: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledWidth:()I
        //    84: iconst_2       
        //    85: idiv           
        //    86: istore          7
        //    88: aload_0        
        //    89: getfield        com/kisman/cc/mixin/mixins/MixinGuiIngame.zLevel:F
        //    92: fstore          8
        //    94: aload_0        
        //    95: ldc             -90.0
        //    97: putfield        com/kisman/cc/mixin/mixins/MixinGuiIngame.zLevel:F
        //   100: iload           7
        //   102: bipush          91
        //   104: isub           
        //   105: i2d            
        //   106: aload_1        
        //   107: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //   110: bipush          22
        //   112: isub           
        //   113: i2d            
        //   114: ldc2_w          182.0
        //   117: ldc2_w          22.0
        //   120: aload_3        
        //   121: invokevirtual   java/awt/Color.getRGB:()I
        //   124: invokestatic    lavahack/client/hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH:(DDDDI)V
        //   127: iconst_4       
        //   128: newarray        D
        //   130: dup            
        //   131: iconst_0       
        //   132: iload           7
        //   134: bipush          91
        //   136: isub           
        //   137: aload           4
        //   139: getfield        net/minecraft/entity/player/EntityPlayer.inventory:Lnet/minecraft/entity/player/InventoryPlayer;
        //   142: getfield        net/minecraft/entity/player/InventoryPlayer.currentItem:I
        //   145: bipush          20
        //   147: imul           
        //   148: iadd           
        //   149: i2d            
        //   150: dastore        
        //   151: dup            
        //   152: iconst_1       
        //   153: aload_1        
        //   154: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //   157: bipush          22
        //   159: isub           
        //   160: i2d            
        //   161: dastore        
        //   162: dup            
        //   163: iconst_2       
        //   164: ldc2_w          22.0
        //   167: dastore        
        //   168: dup            
        //   169: iconst_3       
        //   170: ldc2_w          22.0
        //   173: dastore        
        //   174: astore          9
        //   176: new             Llavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3;
        //   179: dup            
        //   180: new             Llavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0;
        //   183: dup            
        //   184: iconst_2       
        //   185: newarray        D
        //   187: dup            
        //   188: iconst_0       
        //   189: aload           9
        //   191: iconst_0       
        //   192: daload         
        //   193: dastore        
        //   194: dup            
        //   195: iconst_1       
        //   196: aload           9
        //   198: iconst_1       
        //   199: daload         
        //   200: dastore        
        //   201: iconst_2       
        //   202: newarray        D
        //   204: dup            
        //   205: iconst_0       
        //   206: aload           9
        //   208: iconst_0       
        //   209: daload         
        //   210: aload           9
        //   212: iconst_2       
        //   213: daload         
        //   214: dadd           
        //   215: dastore        
        //   216: dup            
        //   217: iconst_1       
        //   218: aload           9
        //   220: iconst_1       
        //   221: daload         
        //   222: dastore        
        //   223: iconst_2       
        //   224: newarray        D
        //   226: dup            
        //   227: iconst_0       
        //   228: aload           9
        //   230: iconst_0       
        //   231: daload         
        //   232: aload           9
        //   234: iconst_2       
        //   235: daload         
        //   236: dadd           
        //   237: dastore        
        //   238: dup            
        //   239: iconst_1       
        //   240: aload           9
        //   242: iconst_1       
        //   243: daload         
        //   244: aload           9
        //   246: iconst_3       
        //   247: daload         
        //   248: dadd           
        //   249: dastore        
        //   250: iconst_2       
        //   251: newarray        D
        //   253: dup            
        //   254: iconst_0       
        //   255: aload           9
        //   257: iconst_0       
        //   258: daload         
        //   259: dastore        
        //   260: dup            
        //   261: iconst_1       
        //   262: aload           9
        //   264: iconst_1       
        //   265: daload         
        //   266: aload           9
        //   268: iconst_3       
        //   269: daload         
        //   270: dadd           
        //   271: dastore        
        //   272: invokespecial   lavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0.<init>:([D[D[D[D)V
        //   275: aload_3        
        //   276: iconst_1       
        //   277: invokestatic    lavahack/client/zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4728:(Ljava/awt/Color;I)Ljava/awt/Color;
        //   280: invokestatic    lavahack/client/qCjATt5pHVCmSQECehNpwU2XG9jgy37X.Method2247:()Ljava/awt/Color;
        //   283: iconst_1       
        //   284: invokespecial   lavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3.<init>:(Llavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0;Ljava/awt/Color;Ljava/awt/Color;Z)V
        //   287: invokestatic    lavahack/client/hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawAbstract:(Llavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3;)V
        //   290: aload           5
        //   292: invokevirtual   net/minecraft/item/ItemStack.isEmpty:()Z
        //   295: ifne            576
        //   298: aconst_null    
        //   299: getfield        lavahack/client/qCjATt5pHVCmSQECehNpwU2XG9jgy37X.Field10027:Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //   302: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //   305: ifne            338
        //   308: aload_0        
        //   309: iload           7
        //   311: bipush          91
        //   313: isub           
        //   314: bipush          29
        //   316: isub           
        //   317: aload_1        
        //   318: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //   321: bipush          23
        //   323: isub           
        //   324: bipush          24
        //   326: bipush          22
        //   328: bipush          29
        //   330: bipush          24
        //   332: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.drawTexturedModalRect:(IIIIII)V
        //   335: goto            576
        //   338: aload           6
        //   340: getstatic       net/minecraft/util/EnumHandSide.LEFT:Lnet/minecraft/util/EnumHandSide;
        //   343: if_acmpne       389
        //   346: iconst_4       
        //   347: newarray        D
        //   349: dup            
        //   350: iconst_0       
        //   351: iload           7
        //   353: bipush          91
        //   355: isub           
        //   356: bipush          29
        //   358: isub           
        //   359: i2d            
        //   360: dastore        
        //   361: dup            
        //   362: iconst_1       
        //   363: aload_1        
        //   364: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //   367: bipush          22
        //   369: isub           
        //   370: i2d            
        //   371: dastore        
        //   372: dup            
        //   373: iconst_2       
        //   374: ldc2_w          22.0
        //   377: dastore        
        //   378: dup            
        //   379: iconst_3       
        //   380: ldc2_w          22.0
        //   383: dastore        
        //   384: astore          10
        //   386: goto            429
        //   389: iconst_4       
        //   390: newarray        D
        //   392: dup            
        //   393: iconst_0       
        //   394: iload           7
        //   396: bipush          91
        //   398: iadd           
        //   399: bipush          7
        //   401: iadd           
        //   402: i2d            
        //   403: dastore        
        //   404: dup            
        //   405: iconst_1       
        //   406: aload_1        
        //   407: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //   410: bipush          22
        //   412: isub           
        //   413: i2d            
        //   414: dastore        
        //   415: dup            
        //   416: iconst_2       
        //   417: ldc2_w          22.0
        //   420: dastore        
        //   421: dup            
        //   422: iconst_3       
        //   423: ldc2_w          22.0
        //   426: dastore        
        //   427: astore          10
        //   429: aload           10
        //   431: iconst_0       
        //   432: daload         
        //   433: aload           10
        //   435: iconst_1       
        //   436: daload         
        //   437: aload           10
        //   439: iconst_2       
        //   440: daload         
        //   441: aload           10
        //   443: iconst_3       
        //   444: daload         
        //   445: aload_3        
        //   446: invokevirtual   java/awt/Color.getRGB:()I
        //   449: invokestatic    lavahack/client/hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH:(DDDDI)V
        //   452: aconst_null    
        //   453: getfield        lavahack/client/qCjATt5pHVCmSQECehNpwU2XG9jgy37X.Field10028:Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //   456: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //   459: ifeq            576
        //   462: new             Llavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3;
        //   465: dup            
        //   466: new             Llavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0;
        //   469: dup            
        //   470: iconst_2       
        //   471: newarray        D
        //   473: dup            
        //   474: iconst_0       
        //   475: aload           10
        //   477: iconst_0       
        //   478: daload         
        //   479: dastore        
        //   480: dup            
        //   481: iconst_1       
        //   482: aload           10
        //   484: iconst_1       
        //   485: daload         
        //   486: dastore        
        //   487: iconst_2       
        //   488: newarray        D
        //   490: dup            
        //   491: iconst_0       
        //   492: aload           10
        //   494: iconst_0       
        //   495: daload         
        //   496: aload           10
        //   498: iconst_2       
        //   499: daload         
        //   500: dadd           
        //   501: dastore        
        //   502: dup            
        //   503: iconst_1       
        //   504: aload           10
        //   506: iconst_1       
        //   507: daload         
        //   508: dastore        
        //   509: iconst_2       
        //   510: newarray        D
        //   512: dup            
        //   513: iconst_0       
        //   514: aload           10
        //   516: iconst_0       
        //   517: daload         
        //   518: aload           10
        //   520: iconst_2       
        //   521: daload         
        //   522: dadd           
        //   523: dastore        
        //   524: dup            
        //   525: iconst_1       
        //   526: aload           10
        //   528: iconst_1       
        //   529: daload         
        //   530: aload           10
        //   532: iconst_3       
        //   533: daload         
        //   534: dadd           
        //   535: dastore        
        //   536: iconst_2       
        //   537: newarray        D
        //   539: dup            
        //   540: iconst_0       
        //   541: aload           10
        //   543: iconst_0       
        //   544: daload         
        //   545: dastore        
        //   546: dup            
        //   547: iconst_1       
        //   548: aload           10
        //   550: iconst_1       
        //   551: daload         
        //   552: aload           10
        //   554: iconst_3       
        //   555: daload         
        //   556: dadd           
        //   557: dastore        
        //   558: invokespecial   lavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0.<init>:([D[D[D[D)V
        //   561: aload_3        
        //   562: iconst_1       
        //   563: invokestatic    lavahack/client/zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4728:(Ljava/awt/Color;I)Ljava/awt/Color;
        //   566: invokestatic    lavahack/client/qCjATt5pHVCmSQECehNpwU2XG9jgy37X.Method2247:()Ljava/awt/Color;
        //   569: iconst_1       
        //   570: invokespecial   lavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3.<init>:(Llavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0;Ljava/awt/Color;Ljava/awt/Color;Z)V
        //   573: invokestatic    lavahack/client/hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawAbstract:(Llavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3;)V
        //   576: aload_0        
        //   577: fload           8
        //   579: putfield        com/kisman/cc/mixin/mixins/MixinGuiIngame.zLevel:F
        //   582: invokestatic    net/minecraft/client/renderer/GlStateManager.enableRescaleNormal:()V
        //   585: invokestatic    net/minecraft/client/renderer/GlStateManager.enableBlend:()V
        //   588: getstatic       net/minecraft/client/renderer/GlStateManager$SourceFactor.SRC_ALPHA:Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;
        //   591: getstatic       net/minecraft/client/renderer/GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA:Lnet/minecraft/client/renderer/GlStateManager$DestFactor;
        //   594: getstatic       net/minecraft/client/renderer/GlStateManager$SourceFactor.ONE:Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;
        //   597: getstatic       net/minecraft/client/renderer/GlStateManager$DestFactor.ZERO:Lnet/minecraft/client/renderer/GlStateManager$DestFactor;
        //   600: invokestatic    net/minecraft/client/renderer/GlStateManager.tryBlendFuncSeparate:(Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;Lnet/minecraft/client/renderer/GlStateManager$DestFactor;Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;Lnet/minecraft/client/renderer/GlStateManager$DestFactor;)V
        //   603: invokestatic    net/minecraft/client/renderer/RenderHelper.enableGUIStandardItemLighting:()V
        //   606: iconst_0       
        //   607: istore          10
        //   609: iload           10
        //   611: bipush          9
        //   613: if_icmpge       675
        //   616: iload           7
        //   618: bipush          90
        //   620: isub           
        //   621: iload           10
        //   623: bipush          20
        //   625: imul           
        //   626: iadd           
        //   627: iconst_2       
        //   628: iadd           
        //   629: istore          11
        //   631: aload_1        
        //   632: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //   635: bipush          16
        //   637: isub           
        //   638: iconst_3       
        //   639: isub           
        //   640: istore          12
        //   642: aload_0        
        //   643: iload           11
        //   645: iload           12
        //   647: fload_2        
        //   648: aload           4
        //   650: aload           4
        //   652: getfield        net/minecraft/entity/player/EntityPlayer.inventory:Lnet/minecraft/entity/player/InventoryPlayer;
        //   655: getfield        net/minecraft/entity/player/InventoryPlayer.mainInventory:Lnet/minecraft/util/NonNullList;
        //   658: iload           10
        //   660: invokevirtual   net/minecraft/util/NonNullList.get:(I)Ljava/lang/Object;
        //   663: checkcast       Lnet/minecraft/item/ItemStack;
        //   666: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.renderHotbarItem:(IIFLnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)V
        //   669: iinc            10, 1
        //   672: goto            609
        //   675: aload           5
        //   677: invokevirtual   net/minecraft/item/ItemStack.isEmpty:()Z
        //   680: ifne            743
        //   683: aload_1        
        //   684: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //   687: bipush          16
        //   689: isub           
        //   690: iconst_3       
        //   691: isub           
        //   692: istore          10
        //   694: aload           6
        //   696: getstatic       net/minecraft/util/EnumHandSide.LEFT:Lnet/minecraft/util/EnumHandSide;
        //   699: if_acmpne       724
        //   702: aload_0        
        //   703: iload           7
        //   705: bipush          91
        //   707: isub           
        //   708: bipush          26
        //   710: isub           
        //   711: iload           10
        //   713: fload_2        
        //   714: aload           4
        //   716: aload           5
        //   718: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.renderHotbarItem:(IIFLnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)V
        //   721: goto            743
        //   724: aload_0        
        //   725: iload           7
        //   727: bipush          91
        //   729: iadd           
        //   730: bipush          10
        //   732: iadd           
        //   733: iload           10
        //   735: fload_2        
        //   736: aload           4
        //   738: aload           5
        //   740: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.renderHotbarItem:(IIFLnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)V
        //   743: aload_0        
        //   744: aconst_null    
        //   745: getfield        net/minecraft/client/Minecraft.gameSettings:Lnet/minecraft/client/settings/GameSettings;
        //   748: getfield        net/minecraft/client/settings/GameSettings.attackIndicator:I
        //   751: iconst_2       
        //   752: if_icmpne       877
        //   755: aload_0        
        //   756: aconst_null    
        //   757: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   760: fconst_0       
        //   761: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.getCooledAttackStrength:(F)F
        //   764: fstore          13
        //   766: fload           13
        //   768: fconst_1       
        //   769: fcmpg          
        //   770: ifge            877
        //   773: aload_1        
        //   774: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //   777: bipush          20
        //   779: isub           
        //   780: istore          11
        //   782: iload           7
        //   784: bipush          91
        //   786: iadd           
        //   787: bipush          6
        //   789: iadd           
        //   790: istore          12
        //   792: aload           6
        //   794: getstatic       net/minecraft/util/EnumHandSide.RIGHT:Lnet/minecraft/util/EnumHandSide;
        //   797: if_acmpne       810
        //   800: iload           7
        //   802: bipush          91
        //   804: isub           
        //   805: bipush          22
        //   807: isub           
        //   808: istore          12
        //   810: aload_0        
        //   811: aconst_null    
        //   812: invokevirtual   net/minecraft/client/Minecraft.getTextureManager:()Lnet/minecraft/client/renderer/texture/TextureManager;
        //   815: getstatic       net/minecraft/client/gui/Gui.ICONS:Lnet/minecraft/util/ResourceLocation;
        //   818: invokevirtual   net/minecraft/client/renderer/texture/TextureManager.bindTexture:(Lnet/minecraft/util/ResourceLocation;)V
        //   821: fload           13
        //   823: ldc_w           19.0
        //   826: fmul           
        //   827: f2i            
        //   828: istore          14
        //   830: fconst_1       
        //   831: fconst_1       
        //   832: fconst_1       
        //   833: fconst_1       
        //   834: invokestatic    net/minecraft/client/renderer/GlStateManager.color:(FFFF)V
        //   837: aload_0        
        //   838: iload           12
        //   840: iload           11
        //   842: iconst_0       
        //   843: bipush          94
        //   845: bipush          18
        //   847: bipush          18
        //   849: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.drawTexturedModalRect:(IIIIII)V
        //   852: aload_0        
        //   853: iload           12
        //   855: iload           11
        //   857: bipush          18
        //   859: iadd           
        //   860: iload           14
        //   862: isub           
        //   863: bipush          18
        //   865: bipush          112
        //   867: iload           14
        //   869: isub           
        //   870: bipush          18
        //   872: iload           14
        //   874: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.drawTexturedModalRect:(IIIIII)V
        //   877: invokestatic    net/minecraft/client/renderer/RenderHelper.disableStandardItemLighting:()V
        //   880: invokestatic    net/minecraft/client/renderer/GlStateManager.disableRescaleNormal:()V
        //   883: invokestatic    net/minecraft/client/renderer/GlStateManager.disableBlend:()V
        //   886: goto            1399
        //   889: aload_0        
        //   890: aconst_null    
        //   891: invokevirtual   net/minecraft/client/Minecraft.getRenderViewEntity:()Lnet/minecraft/entity/Entity;
        //   894: instanceof      Lnet/minecraft/entity/player/EntityPlayer;
        //   897: ifeq            1399
        //   900: fconst_1       
        //   901: fconst_1       
        //   902: fconst_1       
        //   903: fconst_1       
        //   904: invokestatic    net/minecraft/client/renderer/GlStateManager.color:(FFFF)V
        //   907: aload_0        
        //   908: aconst_null    
        //   909: invokevirtual   net/minecraft/client/Minecraft.getTextureManager:()Lnet/minecraft/client/renderer/texture/TextureManager;
        //   912: getstatic       net/minecraft/client/gui/GuiIngame.WIDGETS_TEX_PATH:Lnet/minecraft/util/ResourceLocation;
        //   915: invokevirtual   net/minecraft/client/renderer/texture/TextureManager.bindTexture:(Lnet/minecraft/util/ResourceLocation;)V
        //   918: aload_0        
        //   919: aconst_null    
        //   920: invokevirtual   net/minecraft/client/Minecraft.getRenderViewEntity:()Lnet/minecraft/entity/Entity;
        //   923: checkcast       Lnet/minecraft/entity/player/EntityPlayer;
        //   926: astore_3       
        //   927: aload_3        
        //   928: invokevirtual   net/minecraft/entity/player/EntityPlayer.getHeldItemOffhand:()Lnet/minecraft/item/ItemStack;
        //   931: astore          4
        //   933: aload_3        
        //   934: invokevirtual   net/minecraft/entity/player/EntityPlayer.getPrimaryHand:()Lnet/minecraft/util/EnumHandSide;
        //   937: invokevirtual   net/minecraft/util/EnumHandSide.opposite:()Lnet/minecraft/util/EnumHandSide;
        //   940: astore          5
        //   942: aload_1        
        //   943: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledWidth:()I
        //   946: iconst_2       
        //   947: idiv           
        //   948: istore          6
        //   950: aload_0        
        //   951: getfield        com/kisman/cc/mixin/mixins/MixinGuiIngame.zLevel:F
        //   954: fstore          7
        //   956: aload_0        
        //   957: ldc             -90.0
        //   959: putfield        com/kisman/cc/mixin/mixins/MixinGuiIngame.zLevel:F
        //   962: aload_0        
        //   963: iload           6
        //   965: bipush          91
        //   967: isub           
        //   968: aload_1        
        //   969: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //   972: bipush          22
        //   974: isub           
        //   975: iconst_0       
        //   976: iconst_0       
        //   977: sipush          182
        //   980: bipush          22
        //   982: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.drawTexturedModalRect:(IIIIII)V
        //   985: aload_0        
        //   986: iload           6
        //   988: bipush          91
        //   990: isub           
        //   991: iconst_1       
        //   992: isub           
        //   993: aload_3        
        //   994: getfield        net/minecraft/entity/player/EntityPlayer.inventory:Lnet/minecraft/entity/player/InventoryPlayer;
        //   997: getfield        net/minecraft/entity/player/InventoryPlayer.currentItem:I
        //  1000: bipush          20
        //  1002: imul           
        //  1003: iadd           
        //  1004: aload_1        
        //  1005: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //  1008: bipush          22
        //  1010: isub           
        //  1011: iconst_1       
        //  1012: isub           
        //  1013: iconst_0       
        //  1014: bipush          22
        //  1016: bipush          24
        //  1018: bipush          22
        //  1020: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.drawTexturedModalRect:(IIIIII)V
        //  1023: aload           4
        //  1025: invokevirtual   net/minecraft/item/ItemStack.isEmpty:()Z
        //  1028: ifne            1093
        //  1031: aload           5
        //  1033: getstatic       net/minecraft/util/EnumHandSide.LEFT:Lnet/minecraft/util/EnumHandSide;
        //  1036: if_acmpne       1069
        //  1039: aload_0        
        //  1040: iload           6
        //  1042: bipush          91
        //  1044: isub           
        //  1045: bipush          29
        //  1047: isub           
        //  1048: aload_1        
        //  1049: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //  1052: bipush          23
        //  1054: isub           
        //  1055: bipush          24
        //  1057: bipush          22
        //  1059: bipush          29
        //  1061: bipush          24
        //  1063: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.drawTexturedModalRect:(IIIIII)V
        //  1066: goto            1093
        //  1069: aload_0        
        //  1070: iload           6
        //  1072: bipush          91
        //  1074: iadd           
        //  1075: aload_1        
        //  1076: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //  1079: bipush          23
        //  1081: isub           
        //  1082: bipush          53
        //  1084: bipush          22
        //  1086: bipush          29
        //  1088: bipush          24
        //  1090: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.drawTexturedModalRect:(IIIIII)V
        //  1093: aload_0        
        //  1094: fload           7
        //  1096: putfield        com/kisman/cc/mixin/mixins/MixinGuiIngame.zLevel:F
        //  1099: invokestatic    net/minecraft/client/renderer/GlStateManager.enableRescaleNormal:()V
        //  1102: invokestatic    net/minecraft/client/renderer/GlStateManager.enableBlend:()V
        //  1105: getstatic       net/minecraft/client/renderer/GlStateManager$SourceFactor.SRC_ALPHA:Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;
        //  1108: getstatic       net/minecraft/client/renderer/GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA:Lnet/minecraft/client/renderer/GlStateManager$DestFactor;
        //  1111: getstatic       net/minecraft/client/renderer/GlStateManager$SourceFactor.ONE:Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;
        //  1114: getstatic       net/minecraft/client/renderer/GlStateManager$DestFactor.ZERO:Lnet/minecraft/client/renderer/GlStateManager$DestFactor;
        //  1117: invokestatic    net/minecraft/client/renderer/GlStateManager.tryBlendFuncSeparate:(Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;Lnet/minecraft/client/renderer/GlStateManager$DestFactor;Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;Lnet/minecraft/client/renderer/GlStateManager$DestFactor;)V
        //  1120: invokestatic    net/minecraft/client/renderer/RenderHelper.enableGUIStandardItemLighting:()V
        //  1123: iconst_0       
        //  1124: istore          8
        //  1126: iload           8
        //  1128: bipush          9
        //  1130: if_icmpge       1190
        //  1133: iload           6
        //  1135: bipush          90
        //  1137: isub           
        //  1138: iload           8
        //  1140: bipush          20
        //  1142: imul           
        //  1143: iadd           
        //  1144: iconst_2       
        //  1145: iadd           
        //  1146: istore          9
        //  1148: aload_1        
        //  1149: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //  1152: bipush          16
        //  1154: isub           
        //  1155: iconst_3       
        //  1156: isub           
        //  1157: istore          10
        //  1159: aload_0        
        //  1160: iload           9
        //  1162: iload           10
        //  1164: fload_2        
        //  1165: aload_3        
        //  1166: aload_3        
        //  1167: getfield        net/minecraft/entity/player/EntityPlayer.inventory:Lnet/minecraft/entity/player/InventoryPlayer;
        //  1170: getfield        net/minecraft/entity/player/InventoryPlayer.mainInventory:Lnet/minecraft/util/NonNullList;
        //  1173: iload           8
        //  1175: invokevirtual   net/minecraft/util/NonNullList.get:(I)Ljava/lang/Object;
        //  1178: checkcast       Lnet/minecraft/item/ItemStack;
        //  1181: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.renderHotbarItem:(IIFLnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)V
        //  1184: iinc            8, 1
        //  1187: goto            1126
        //  1190: aload           4
        //  1192: invokevirtual   net/minecraft/item/ItemStack.isEmpty:()Z
        //  1195: ifne            1256
        //  1198: aload_1        
        //  1199: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //  1202: bipush          16
        //  1204: isub           
        //  1205: iconst_3       
        //  1206: isub           
        //  1207: istore          8
        //  1209: aload           5
        //  1211: getstatic       net/minecraft/util/EnumHandSide.LEFT:Lnet/minecraft/util/EnumHandSide;
        //  1214: if_acmpne       1238
        //  1217: aload_0        
        //  1218: iload           6
        //  1220: bipush          91
        //  1222: isub           
        //  1223: bipush          26
        //  1225: isub           
        //  1226: iload           8
        //  1228: fload_2        
        //  1229: aload_3        
        //  1230: aload           4
        //  1232: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.renderHotbarItem:(IIFLnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)V
        //  1235: goto            1256
        //  1238: aload_0        
        //  1239: iload           6
        //  1241: bipush          91
        //  1243: iadd           
        //  1244: bipush          10
        //  1246: iadd           
        //  1247: iload           8
        //  1249: fload_2        
        //  1250: aload_3        
        //  1251: aload           4
        //  1253: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.renderHotbarItem:(IIFLnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)V
        //  1256: aload_0        
        //  1257: aconst_null    
        //  1258: getfield        net/minecraft/client/Minecraft.gameSettings:Lnet/minecraft/client/settings/GameSettings;
        //  1261: getfield        net/minecraft/client/settings/GameSettings.attackIndicator:I
        //  1264: iconst_2       
        //  1265: if_icmpne       1390
        //  1268: aload_0        
        //  1269: aconst_null    
        //  1270: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1273: fconst_0       
        //  1274: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.getCooledAttackStrength:(F)F
        //  1277: fstore          11
        //  1279: fload           11
        //  1281: fconst_1       
        //  1282: fcmpg          
        //  1283: ifge            1390
        //  1286: aload_1        
        //  1287: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //  1290: bipush          20
        //  1292: isub           
        //  1293: istore          9
        //  1295: iload           6
        //  1297: bipush          91
        //  1299: iadd           
        //  1300: bipush          6
        //  1302: iadd           
        //  1303: istore          10
        //  1305: aload           5
        //  1307: getstatic       net/minecraft/util/EnumHandSide.RIGHT:Lnet/minecraft/util/EnumHandSide;
        //  1310: if_acmpne       1323
        //  1313: iload           6
        //  1315: bipush          91
        //  1317: isub           
        //  1318: bipush          22
        //  1320: isub           
        //  1321: istore          10
        //  1323: aload_0        
        //  1324: aconst_null    
        //  1325: invokevirtual   net/minecraft/client/Minecraft.getTextureManager:()Lnet/minecraft/client/renderer/texture/TextureManager;
        //  1328: getstatic       net/minecraft/client/gui/Gui.ICONS:Lnet/minecraft/util/ResourceLocation;
        //  1331: invokevirtual   net/minecraft/client/renderer/texture/TextureManager.bindTexture:(Lnet/minecraft/util/ResourceLocation;)V
        //  1334: fload           11
        //  1336: ldc_w           19.0
        //  1339: fmul           
        //  1340: f2i            
        //  1341: istore          12
        //  1343: fconst_1       
        //  1344: fconst_1       
        //  1345: fconst_1       
        //  1346: fconst_1       
        //  1347: invokestatic    net/minecraft/client/renderer/GlStateManager.color:(FFFF)V
        //  1350: aload_0        
        //  1351: iload           10
        //  1353: iload           9
        //  1355: iconst_0       
        //  1356: bipush          94
        //  1358: bipush          18
        //  1360: bipush          18
        //  1362: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.drawTexturedModalRect:(IIIIII)V
        //  1365: aload_0        
        //  1366: iload           10
        //  1368: iload           9
        //  1370: bipush          18
        //  1372: iadd           
        //  1373: iload           12
        //  1375: isub           
        //  1376: bipush          18
        //  1378: bipush          112
        //  1380: iload           12
        //  1382: isub           
        //  1383: bipush          18
        //  1385: iload           12
        //  1387: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.drawTexturedModalRect:(IIIIII)V
        //  1390: invokestatic    net/minecraft/client/renderer/RenderHelper.disableStandardItemLighting:()V
        //  1393: invokestatic    net/minecraft/client/renderer/GlStateManager.disableRescaleNormal:()V
        //  1396: invokestatic    net/minecraft/client/renderer/GlStateManager.disableBlend:()V
        //  1399: return         
        //  1400: aconst_null    
        //  1401: invokevirtual   lavahack/client/qCjATt5pHVCmSQECehNpwU2XG9jgy37X.Method35:()Z
        //  1404: ifeq            2289
        //  1407: new             Ljava/awt/Color;
        //  1410: dup            
        //  1411: bipush          31
        //  1413: bipush          31
        //  1415: bipush          31
        //  1417: sipush          152
        //  1420: invokespecial   java/awt/Color.<init>:(IIII)V
        //  1423: astore_3       
        //  1424: aload_0        
        //  1425: aconst_null    
        //  1426: invokevirtual   net/minecraft/client/Minecraft.getRenderViewEntity:()Lnet/minecraft/entity/Entity;
        //  1429: instanceof      Lnet/minecraft/entity/player/EntityPlayer;
        //  1432: ifeq            2286
        //  1435: fconst_1       
        //  1436: fconst_1       
        //  1437: fconst_1       
        //  1438: fconst_1       
        //  1439: invokestatic    net/minecraft/client/renderer/GlStateManager.color:(FFFF)V
        //  1442: aload_0        
        //  1443: aconst_null    
        //  1444: invokevirtual   net/minecraft/client/Minecraft.getTextureManager:()Lnet/minecraft/client/renderer/texture/TextureManager;
        //  1447: getstatic       net/minecraft/client/gui/GuiIngame.WIDGETS_TEX_PATH:Lnet/minecraft/util/ResourceLocation;
        //  1450: invokevirtual   net/minecraft/client/renderer/texture/TextureManager.bindTexture:(Lnet/minecraft/util/ResourceLocation;)V
        //  1453: aload_0        
        //  1454: aconst_null    
        //  1455: invokevirtual   net/minecraft/client/Minecraft.getRenderViewEntity:()Lnet/minecraft/entity/Entity;
        //  1458: checkcast       Lnet/minecraft/entity/player/EntityPlayer;
        //  1461: astore          4
        //  1463: aload           4
        //  1465: invokevirtual   net/minecraft/entity/player/EntityPlayer.getHeldItemOffhand:()Lnet/minecraft/item/ItemStack;
        //  1468: astore          5
        //  1470: aload           4
        //  1472: invokevirtual   net/minecraft/entity/player/EntityPlayer.getPrimaryHand:()Lnet/minecraft/util/EnumHandSide;
        //  1475: invokevirtual   net/minecraft/util/EnumHandSide.opposite:()Lnet/minecraft/util/EnumHandSide;
        //  1478: astore          6
        //  1480: aload_1        
        //  1481: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledWidth:()I
        //  1484: iconst_2       
        //  1485: idiv           
        //  1486: istore          7
        //  1488: aload_0        
        //  1489: getfield        com/kisman/cc/mixin/mixins/MixinGuiIngame.zLevel:F
        //  1492: fstore          8
        //  1494: aload_0        
        //  1495: ldc             -90.0
        //  1497: putfield        com/kisman/cc/mixin/mixins/MixinGuiIngame.zLevel:F
        //  1500: iload           7
        //  1502: bipush          91
        //  1504: isub           
        //  1505: i2d            
        //  1506: aload_1        
        //  1507: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //  1510: bipush          22
        //  1512: isub           
        //  1513: i2d            
        //  1514: ldc2_w          182.0
        //  1517: ldc2_w          22.0
        //  1520: aload_3        
        //  1521: invokevirtual   java/awt/Color.getRGB:()I
        //  1524: invokestatic    lavahack/client/hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH:(DDDDI)V
        //  1527: iconst_4       
        //  1528: newarray        D
        //  1530: dup            
        //  1531: iconst_0       
        //  1532: iload           7
        //  1534: bipush          91
        //  1536: isub           
        //  1537: aload           4
        //  1539: getfield        net/minecraft/entity/player/EntityPlayer.inventory:Lnet/minecraft/entity/player/InventoryPlayer;
        //  1542: getfield        net/minecraft/entity/player/InventoryPlayer.currentItem:I
        //  1545: bipush          20
        //  1547: imul           
        //  1548: iadd           
        //  1549: i2d            
        //  1550: dastore        
        //  1551: dup            
        //  1552: iconst_1       
        //  1553: aload_1        
        //  1554: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //  1557: bipush          22
        //  1559: isub           
        //  1560: i2d            
        //  1561: dastore        
        //  1562: dup            
        //  1563: iconst_2       
        //  1564: ldc2_w          22.0
        //  1567: dastore        
        //  1568: dup            
        //  1569: iconst_3       
        //  1570: ldc2_w          22.0
        //  1573: dastore        
        //  1574: astore          9
        //  1576: new             Llavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3;
        //  1579: dup            
        //  1580: new             Llavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0;
        //  1583: dup            
        //  1584: iconst_2       
        //  1585: newarray        D
        //  1587: dup            
        //  1588: iconst_0       
        //  1589: aload           9
        //  1591: iconst_0       
        //  1592: daload         
        //  1593: dastore        
        //  1594: dup            
        //  1595: iconst_1       
        //  1596: aload           9
        //  1598: iconst_1       
        //  1599: daload         
        //  1600: dastore        
        //  1601: iconst_2       
        //  1602: newarray        D
        //  1604: dup            
        //  1605: iconst_0       
        //  1606: aload           9
        //  1608: iconst_0       
        //  1609: daload         
        //  1610: aload           9
        //  1612: iconst_2       
        //  1613: daload         
        //  1614: dadd           
        //  1615: dastore        
        //  1616: dup            
        //  1617: iconst_1       
        //  1618: aload           9
        //  1620: iconst_1       
        //  1621: daload         
        //  1622: dastore        
        //  1623: iconst_2       
        //  1624: newarray        D
        //  1626: dup            
        //  1627: iconst_0       
        //  1628: aload           9
        //  1630: iconst_0       
        //  1631: daload         
        //  1632: aload           9
        //  1634: iconst_2       
        //  1635: daload         
        //  1636: dadd           
        //  1637: dastore        
        //  1638: dup            
        //  1639: iconst_1       
        //  1640: aload           9
        //  1642: iconst_1       
        //  1643: daload         
        //  1644: aload           9
        //  1646: iconst_3       
        //  1647: daload         
        //  1648: dadd           
        //  1649: dastore        
        //  1650: iconst_2       
        //  1651: newarray        D
        //  1653: dup            
        //  1654: iconst_0       
        //  1655: aload           9
        //  1657: iconst_0       
        //  1658: daload         
        //  1659: dastore        
        //  1660: dup            
        //  1661: iconst_1       
        //  1662: aload           9
        //  1664: iconst_1       
        //  1665: daload         
        //  1666: aload           9
        //  1668: iconst_3       
        //  1669: daload         
        //  1670: dadd           
        //  1671: dastore        
        //  1672: invokespecial   lavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0.<init>:([D[D[D[D)V
        //  1675: aload_3        
        //  1676: iconst_1       
        //  1677: invokestatic    lavahack/client/zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4728:(Ljava/awt/Color;I)Ljava/awt/Color;
        //  1680: invokestatic    lavahack/client/qCjATt5pHVCmSQECehNpwU2XG9jgy37X.Method2247:()Ljava/awt/Color;
        //  1683: iconst_1       
        //  1684: invokespecial   lavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3.<init>:(Llavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0;Ljava/awt/Color;Ljava/awt/Color;Z)V
        //  1687: invokestatic    lavahack/client/hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawAbstract:(Llavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3;)V
        //  1690: aload           5
        //  1692: invokevirtual   net/minecraft/item/ItemStack.isEmpty:()Z
        //  1695: ifne            1976
        //  1698: aconst_null    
        //  1699: getfield        lavahack/client/qCjATt5pHVCmSQECehNpwU2XG9jgy37X.Field10027:Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //  1702: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //  1705: ifne            1738
        //  1708: aload_0        
        //  1709: iload           7
        //  1711: bipush          91
        //  1713: isub           
        //  1714: bipush          29
        //  1716: isub           
        //  1717: aload_1        
        //  1718: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //  1721: bipush          23
        //  1723: isub           
        //  1724: bipush          24
        //  1726: bipush          22
        //  1728: bipush          29
        //  1730: bipush          24
        //  1732: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.drawTexturedModalRect:(IIIIII)V
        //  1735: goto            1976
        //  1738: aload           6
        //  1740: getstatic       net/minecraft/util/EnumHandSide.LEFT:Lnet/minecraft/util/EnumHandSide;
        //  1743: if_acmpne       1789
        //  1746: iconst_4       
        //  1747: newarray        D
        //  1749: dup            
        //  1750: iconst_0       
        //  1751: iload           7
        //  1753: bipush          91
        //  1755: isub           
        //  1756: bipush          29
        //  1758: isub           
        //  1759: i2d            
        //  1760: dastore        
        //  1761: dup            
        //  1762: iconst_1       
        //  1763: aload_1        
        //  1764: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //  1767: bipush          22
        //  1769: isub           
        //  1770: i2d            
        //  1771: dastore        
        //  1772: dup            
        //  1773: iconst_2       
        //  1774: ldc2_w          22.0
        //  1777: dastore        
        //  1778: dup            
        //  1779: iconst_3       
        //  1780: ldc2_w          22.0
        //  1783: dastore        
        //  1784: astore          10
        //  1786: goto            1829
        //  1789: iconst_4       
        //  1790: newarray        D
        //  1792: dup            
        //  1793: iconst_0       
        //  1794: iload           7
        //  1796: bipush          91
        //  1798: iadd           
        //  1799: bipush          7
        //  1801: iadd           
        //  1802: i2d            
        //  1803: dastore        
        //  1804: dup            
        //  1805: iconst_1       
        //  1806: aload_1        
        //  1807: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //  1810: bipush          22
        //  1812: isub           
        //  1813: i2d            
        //  1814: dastore        
        //  1815: dup            
        //  1816: iconst_2       
        //  1817: ldc2_w          22.0
        //  1820: dastore        
        //  1821: dup            
        //  1822: iconst_3       
        //  1823: ldc2_w          22.0
        //  1826: dastore        
        //  1827: astore          10
        //  1829: aload           10
        //  1831: iconst_0       
        //  1832: daload         
        //  1833: aload           10
        //  1835: iconst_1       
        //  1836: daload         
        //  1837: aload           10
        //  1839: iconst_2       
        //  1840: daload         
        //  1841: aload           10
        //  1843: iconst_3       
        //  1844: daload         
        //  1845: aload_3        
        //  1846: invokevirtual   java/awt/Color.getRGB:()I
        //  1849: invokestatic    lavahack/client/hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH:(DDDDI)V
        //  1852: aconst_null    
        //  1853: getfield        lavahack/client/qCjATt5pHVCmSQECehNpwU2XG9jgy37X.Field10028:Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //  1856: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //  1859: ifeq            1976
        //  1862: new             Llavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3;
        //  1865: dup            
        //  1866: new             Llavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0;
        //  1869: dup            
        //  1870: iconst_2       
        //  1871: newarray        D
        //  1873: dup            
        //  1874: iconst_0       
        //  1875: aload           10
        //  1877: iconst_0       
        //  1878: daload         
        //  1879: dastore        
        //  1880: dup            
        //  1881: iconst_1       
        //  1882: aload           10
        //  1884: iconst_1       
        //  1885: daload         
        //  1886: dastore        
        //  1887: iconst_2       
        //  1888: newarray        D
        //  1890: dup            
        //  1891: iconst_0       
        //  1892: aload           10
        //  1894: iconst_0       
        //  1895: daload         
        //  1896: aload           10
        //  1898: iconst_2       
        //  1899: daload         
        //  1900: dadd           
        //  1901: dastore        
        //  1902: dup            
        //  1903: iconst_1       
        //  1904: aload           10
        //  1906: iconst_1       
        //  1907: daload         
        //  1908: dastore        
        //  1909: iconst_2       
        //  1910: newarray        D
        //  1912: dup            
        //  1913: iconst_0       
        //  1914: aload           10
        //  1916: iconst_0       
        //  1917: daload         
        //  1918: aload           10
        //  1920: iconst_2       
        //  1921: daload         
        //  1922: dadd           
        //  1923: dastore        
        //  1924: dup            
        //  1925: iconst_1       
        //  1926: aload           10
        //  1928: iconst_1       
        //  1929: daload         
        //  1930: aload           10
        //  1932: iconst_3       
        //  1933: daload         
        //  1934: dadd           
        //  1935: dastore        
        //  1936: iconst_2       
        //  1937: newarray        D
        //  1939: dup            
        //  1940: iconst_0       
        //  1941: aload           10
        //  1943: iconst_0       
        //  1944: daload         
        //  1945: dastore        
        //  1946: dup            
        //  1947: iconst_1       
        //  1948: aload           10
        //  1950: iconst_1       
        //  1951: daload         
        //  1952: aload           10
        //  1954: iconst_3       
        //  1955: daload         
        //  1956: dadd           
        //  1957: dastore        
        //  1958: invokespecial   lavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0.<init>:([D[D[D[D)V
        //  1961: aload_3        
        //  1962: iconst_1       
        //  1963: invokestatic    lavahack/client/zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4728:(Ljava/awt/Color;I)Ljava/awt/Color;
        //  1966: invokestatic    lavahack/client/qCjATt5pHVCmSQECehNpwU2XG9jgy37X.Method2247:()Ljava/awt/Color;
        //  1969: iconst_1       
        //  1970: invokespecial   lavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3.<init>:(Llavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0;Ljava/awt/Color;Ljava/awt/Color;Z)V
        //  1973: invokestatic    lavahack/client/hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawAbstract:(Llavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3;)V
        //  1976: aload_0        
        //  1977: fload           8
        //  1979: putfield        com/kisman/cc/mixin/mixins/MixinGuiIngame.zLevel:F
        //  1982: invokestatic    net/minecraft/client/renderer/GlStateManager.enableRescaleNormal:()V
        //  1985: invokestatic    net/minecraft/client/renderer/GlStateManager.enableBlend:()V
        //  1988: getstatic       net/minecraft/client/renderer/GlStateManager$SourceFactor.SRC_ALPHA:Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;
        //  1991: getstatic       net/minecraft/client/renderer/GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA:Lnet/minecraft/client/renderer/GlStateManager$DestFactor;
        //  1994: getstatic       net/minecraft/client/renderer/GlStateManager$SourceFactor.ONE:Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;
        //  1997: getstatic       net/minecraft/client/renderer/GlStateManager$DestFactor.ZERO:Lnet/minecraft/client/renderer/GlStateManager$DestFactor;
        //  2000: invokestatic    net/minecraft/client/renderer/GlStateManager.tryBlendFuncSeparate:(Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;Lnet/minecraft/client/renderer/GlStateManager$DestFactor;Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;Lnet/minecraft/client/renderer/GlStateManager$DestFactor;)V
        //  2003: invokestatic    net/minecraft/client/renderer/RenderHelper.enableGUIStandardItemLighting:()V
        //  2006: iconst_0       
        //  2007: istore          10
        //  2009: iload           10
        //  2011: bipush          9
        //  2013: if_icmpge       2075
        //  2016: iload           7
        //  2018: bipush          90
        //  2020: isub           
        //  2021: iload           10
        //  2023: bipush          20
        //  2025: imul           
        //  2026: iadd           
        //  2027: iconst_2       
        //  2028: iadd           
        //  2029: istore          11
        //  2031: aload_1        
        //  2032: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //  2035: bipush          16
        //  2037: isub           
        //  2038: iconst_3       
        //  2039: isub           
        //  2040: istore          12
        //  2042: aload_0        
        //  2043: iload           11
        //  2045: iload           12
        //  2047: fload_2        
        //  2048: aload           4
        //  2050: aload           4
        //  2052: getfield        net/minecraft/entity/player/EntityPlayer.inventory:Lnet/minecraft/entity/player/InventoryPlayer;
        //  2055: getfield        net/minecraft/entity/player/InventoryPlayer.mainInventory:Lnet/minecraft/util/NonNullList;
        //  2058: iload           10
        //  2060: invokevirtual   net/minecraft/util/NonNullList.get:(I)Ljava/lang/Object;
        //  2063: checkcast       Lnet/minecraft/item/ItemStack;
        //  2066: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.renderHotbarItem:(IIFLnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)V
        //  2069: iinc            10, 1
        //  2072: goto            2009
        //  2075: aload           5
        //  2077: invokevirtual   net/minecraft/item/ItemStack.isEmpty:()Z
        //  2080: ifne            2143
        //  2083: aload_1        
        //  2084: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //  2087: bipush          16
        //  2089: isub           
        //  2090: iconst_3       
        //  2091: isub           
        //  2092: istore          10
        //  2094: aload           6
        //  2096: getstatic       net/minecraft/util/EnumHandSide.LEFT:Lnet/minecraft/util/EnumHandSide;
        //  2099: if_acmpne       2124
        //  2102: aload_0        
        //  2103: iload           7
        //  2105: bipush          91
        //  2107: isub           
        //  2108: bipush          26
        //  2110: isub           
        //  2111: iload           10
        //  2113: fload_2        
        //  2114: aload           4
        //  2116: aload           5
        //  2118: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.renderHotbarItem:(IIFLnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)V
        //  2121: goto            2143
        //  2124: aload_0        
        //  2125: iload           7
        //  2127: bipush          91
        //  2129: iadd           
        //  2130: bipush          10
        //  2132: iadd           
        //  2133: iload           10
        //  2135: fload_2        
        //  2136: aload           4
        //  2138: aload           5
        //  2140: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.renderHotbarItem:(IIFLnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)V
        //  2143: aload_0        
        //  2144: aconst_null    
        //  2145: getfield        net/minecraft/client/Minecraft.gameSettings:Lnet/minecraft/client/settings/GameSettings;
        //  2148: getfield        net/minecraft/client/settings/GameSettings.attackIndicator:I
        //  2151: iconst_2       
        //  2152: if_icmpne       2277
        //  2155: aload_0        
        //  2156: aconst_null    
        //  2157: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2160: fconst_0       
        //  2161: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.getCooledAttackStrength:(F)F
        //  2164: fstore          13
        //  2166: fload           13
        //  2168: fconst_1       
        //  2169: fcmpg          
        //  2170: ifge            2277
        //  2173: aload_1        
        //  2174: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //  2177: bipush          20
        //  2179: isub           
        //  2180: istore          11
        //  2182: iload           7
        //  2184: bipush          91
        //  2186: iadd           
        //  2187: bipush          6
        //  2189: iadd           
        //  2190: istore          12
        //  2192: aload           6
        //  2194: getstatic       net/minecraft/util/EnumHandSide.RIGHT:Lnet/minecraft/util/EnumHandSide;
        //  2197: if_acmpne       2210
        //  2200: iload           7
        //  2202: bipush          91
        //  2204: isub           
        //  2205: bipush          22
        //  2207: isub           
        //  2208: istore          12
        //  2210: aload_0        
        //  2211: aconst_null    
        //  2212: invokevirtual   net/minecraft/client/Minecraft.getTextureManager:()Lnet/minecraft/client/renderer/texture/TextureManager;
        //  2215: getstatic       net/minecraft/client/gui/Gui.ICONS:Lnet/minecraft/util/ResourceLocation;
        //  2218: invokevirtual   net/minecraft/client/renderer/texture/TextureManager.bindTexture:(Lnet/minecraft/util/ResourceLocation;)V
        //  2221: fload           13
        //  2223: ldc_w           19.0
        //  2226: fmul           
        //  2227: f2i            
        //  2228: istore          14
        //  2230: fconst_1       
        //  2231: fconst_1       
        //  2232: fconst_1       
        //  2233: fconst_1       
        //  2234: invokestatic    net/minecraft/client/renderer/GlStateManager.color:(FFFF)V
        //  2237: aload_0        
        //  2238: iload           12
        //  2240: iload           11
        //  2242: iconst_0       
        //  2243: bipush          94
        //  2245: bipush          18
        //  2247: bipush          18
        //  2249: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.drawTexturedModalRect:(IIIIII)V
        //  2252: aload_0        
        //  2253: iload           12
        //  2255: iload           11
        //  2257: bipush          18
        //  2259: iadd           
        //  2260: iload           14
        //  2262: isub           
        //  2263: bipush          18
        //  2265: bipush          112
        //  2267: iload           14
        //  2269: isub           
        //  2270: bipush          18
        //  2272: iload           14
        //  2274: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.drawTexturedModalRect:(IIIIII)V
        //  2277: invokestatic    net/minecraft/client/renderer/RenderHelper.disableStandardItemLighting:()V
        //  2280: invokestatic    net/minecraft/client/renderer/GlStateManager.disableRescaleNormal:()V
        //  2283: invokestatic    net/minecraft/client/renderer/GlStateManager.disableBlend:()V
        //  2286: goto            2799
        //  2289: aload_0        
        //  2290: aconst_null    
        //  2291: invokevirtual   net/minecraft/client/Minecraft.getRenderViewEntity:()Lnet/minecraft/entity/Entity;
        //  2294: instanceof      Lnet/minecraft/entity/player/EntityPlayer;
        //  2297: ifeq            2799
        //  2300: fconst_1       
        //  2301: fconst_1       
        //  2302: fconst_1       
        //  2303: fconst_1       
        //  2304: invokestatic    net/minecraft/client/renderer/GlStateManager.color:(FFFF)V
        //  2307: aload_0        
        //  2308: aconst_null    
        //  2309: invokevirtual   net/minecraft/client/Minecraft.getTextureManager:()Lnet/minecraft/client/renderer/texture/TextureManager;
        //  2312: getstatic       net/minecraft/client/gui/GuiIngame.WIDGETS_TEX_PATH:Lnet/minecraft/util/ResourceLocation;
        //  2315: invokevirtual   net/minecraft/client/renderer/texture/TextureManager.bindTexture:(Lnet/minecraft/util/ResourceLocation;)V
        //  2318: aload_0        
        //  2319: aconst_null    
        //  2320: invokevirtual   net/minecraft/client/Minecraft.getRenderViewEntity:()Lnet/minecraft/entity/Entity;
        //  2323: checkcast       Lnet/minecraft/entity/player/EntityPlayer;
        //  2326: astore_3       
        //  2327: aload_3        
        //  2328: invokevirtual   net/minecraft/entity/player/EntityPlayer.getHeldItemOffhand:()Lnet/minecraft/item/ItemStack;
        //  2331: astore          4
        //  2333: aload_3        
        //  2334: invokevirtual   net/minecraft/entity/player/EntityPlayer.getPrimaryHand:()Lnet/minecraft/util/EnumHandSide;
        //  2337: invokevirtual   net/minecraft/util/EnumHandSide.opposite:()Lnet/minecraft/util/EnumHandSide;
        //  2340: astore          5
        //  2342: aload_1        
        //  2343: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledWidth:()I
        //  2346: iconst_2       
        //  2347: idiv           
        //  2348: istore          6
        //  2350: aload_0        
        //  2351: getfield        com/kisman/cc/mixin/mixins/MixinGuiIngame.zLevel:F
        //  2354: fstore          7
        //  2356: aload_0        
        //  2357: ldc             -90.0
        //  2359: putfield        com/kisman/cc/mixin/mixins/MixinGuiIngame.zLevel:F
        //  2362: aload_0        
        //  2363: iload           6
        //  2365: bipush          91
        //  2367: isub           
        //  2368: aload_1        
        //  2369: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //  2372: bipush          22
        //  2374: isub           
        //  2375: iconst_0       
        //  2376: iconst_0       
        //  2377: sipush          182
        //  2380: bipush          22
        //  2382: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.drawTexturedModalRect:(IIIIII)V
        //  2385: aload_0        
        //  2386: iload           6
        //  2388: bipush          91
        //  2390: isub           
        //  2391: iconst_1       
        //  2392: isub           
        //  2393: aload_3        
        //  2394: getfield        net/minecraft/entity/player/EntityPlayer.inventory:Lnet/minecraft/entity/player/InventoryPlayer;
        //  2397: getfield        net/minecraft/entity/player/InventoryPlayer.currentItem:I
        //  2400: bipush          20
        //  2402: imul           
        //  2403: iadd           
        //  2404: aload_1        
        //  2405: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //  2408: bipush          22
        //  2410: isub           
        //  2411: iconst_1       
        //  2412: isub           
        //  2413: iconst_0       
        //  2414: bipush          22
        //  2416: bipush          24
        //  2418: bipush          22
        //  2420: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.drawTexturedModalRect:(IIIIII)V
        //  2423: aload           4
        //  2425: invokevirtual   net/minecraft/item/ItemStack.isEmpty:()Z
        //  2428: ifne            2493
        //  2431: aload           5
        //  2433: getstatic       net/minecraft/util/EnumHandSide.LEFT:Lnet/minecraft/util/EnumHandSide;
        //  2436: if_acmpne       2469
        //  2439: aload_0        
        //  2440: iload           6
        //  2442: bipush          91
        //  2444: isub           
        //  2445: bipush          29
        //  2447: isub           
        //  2448: aload_1        
        //  2449: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //  2452: bipush          23
        //  2454: isub           
        //  2455: bipush          24
        //  2457: bipush          22
        //  2459: bipush          29
        //  2461: bipush          24
        //  2463: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.drawTexturedModalRect:(IIIIII)V
        //  2466: goto            2493
        //  2469: aload_0        
        //  2470: iload           6
        //  2472: bipush          91
        //  2474: iadd           
        //  2475: aload_1        
        //  2476: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //  2479: bipush          23
        //  2481: isub           
        //  2482: bipush          53
        //  2484: bipush          22
        //  2486: bipush          29
        //  2488: bipush          24
        //  2490: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.drawTexturedModalRect:(IIIIII)V
        //  2493: aload_0        
        //  2494: fload           7
        //  2496: putfield        com/kisman/cc/mixin/mixins/MixinGuiIngame.zLevel:F
        //  2499: invokestatic    net/minecraft/client/renderer/GlStateManager.enableRescaleNormal:()V
        //  2502: invokestatic    net/minecraft/client/renderer/GlStateManager.enableBlend:()V
        //  2505: getstatic       net/minecraft/client/renderer/GlStateManager$SourceFactor.SRC_ALPHA:Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;
        //  2508: getstatic       net/minecraft/client/renderer/GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA:Lnet/minecraft/client/renderer/GlStateManager$DestFactor;
        //  2511: getstatic       net/minecraft/client/renderer/GlStateManager$SourceFactor.ONE:Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;
        //  2514: getstatic       net/minecraft/client/renderer/GlStateManager$DestFactor.ZERO:Lnet/minecraft/client/renderer/GlStateManager$DestFactor;
        //  2517: invokestatic    net/minecraft/client/renderer/GlStateManager.tryBlendFuncSeparate:(Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;Lnet/minecraft/client/renderer/GlStateManager$DestFactor;Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;Lnet/minecraft/client/renderer/GlStateManager$DestFactor;)V
        //  2520: invokestatic    net/minecraft/client/renderer/RenderHelper.enableGUIStandardItemLighting:()V
        //  2523: iconst_0       
        //  2524: istore          8
        //  2526: iload           8
        //  2528: bipush          9
        //  2530: if_icmpge       2590
        //  2533: iload           6
        //  2535: bipush          90
        //  2537: isub           
        //  2538: iload           8
        //  2540: bipush          20
        //  2542: imul           
        //  2543: iadd           
        //  2544: iconst_2       
        //  2545: iadd           
        //  2546: istore          9
        //  2548: aload_1        
        //  2549: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //  2552: bipush          16
        //  2554: isub           
        //  2555: iconst_3       
        //  2556: isub           
        //  2557: istore          10
        //  2559: aload_0        
        //  2560: iload           9
        //  2562: iload           10
        //  2564: fload_2        
        //  2565: aload_3        
        //  2566: aload_3        
        //  2567: getfield        net/minecraft/entity/player/EntityPlayer.inventory:Lnet/minecraft/entity/player/InventoryPlayer;
        //  2570: getfield        net/minecraft/entity/player/InventoryPlayer.mainInventory:Lnet/minecraft/util/NonNullList;
        //  2573: iload           8
        //  2575: invokevirtual   net/minecraft/util/NonNullList.get:(I)Ljava/lang/Object;
        //  2578: checkcast       Lnet/minecraft/item/ItemStack;
        //  2581: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.renderHotbarItem:(IIFLnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)V
        //  2584: iinc            8, 1
        //  2587: goto            2526
        //  2590: aload           4
        //  2592: invokevirtual   net/minecraft/item/ItemStack.isEmpty:()Z
        //  2595: ifne            2656
        //  2598: aload_1        
        //  2599: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //  2602: bipush          16
        //  2604: isub           
        //  2605: iconst_3       
        //  2606: isub           
        //  2607: istore          8
        //  2609: aload           5
        //  2611: getstatic       net/minecraft/util/EnumHandSide.LEFT:Lnet/minecraft/util/EnumHandSide;
        //  2614: if_acmpne       2638
        //  2617: aload_0        
        //  2618: iload           6
        //  2620: bipush          91
        //  2622: isub           
        //  2623: bipush          26
        //  2625: isub           
        //  2626: iload           8
        //  2628: fload_2        
        //  2629: aload_3        
        //  2630: aload           4
        //  2632: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.renderHotbarItem:(IIFLnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)V
        //  2635: goto            2656
        //  2638: aload_0        
        //  2639: iload           6
        //  2641: bipush          91
        //  2643: iadd           
        //  2644: bipush          10
        //  2646: iadd           
        //  2647: iload           8
        //  2649: fload_2        
        //  2650: aload_3        
        //  2651: aload           4
        //  2653: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.renderHotbarItem:(IIFLnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)V
        //  2656: aload_0        
        //  2657: aconst_null    
        //  2658: getfield        net/minecraft/client/Minecraft.gameSettings:Lnet/minecraft/client/settings/GameSettings;
        //  2661: getfield        net/minecraft/client/settings/GameSettings.attackIndicator:I
        //  2664: iconst_2       
        //  2665: if_icmpne       2790
        //  2668: aload_0        
        //  2669: aconst_null    
        //  2670: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2673: fconst_0       
        //  2674: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.getCooledAttackStrength:(F)F
        //  2677: fstore          11
        //  2679: fload           11
        //  2681: fconst_1       
        //  2682: fcmpg          
        //  2683: ifge            2790
        //  2686: aload_1        
        //  2687: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledHeight:()I
        //  2690: bipush          20
        //  2692: isub           
        //  2693: istore          9
        //  2695: iload           6
        //  2697: bipush          91
        //  2699: iadd           
        //  2700: bipush          6
        //  2702: iadd           
        //  2703: istore          10
        //  2705: aload           5
        //  2707: getstatic       net/minecraft/util/EnumHandSide.RIGHT:Lnet/minecraft/util/EnumHandSide;
        //  2710: if_acmpne       2723
        //  2713: iload           6
        //  2715: bipush          91
        //  2717: isub           
        //  2718: bipush          22
        //  2720: isub           
        //  2721: istore          10
        //  2723: aload_0        
        //  2724: aconst_null    
        //  2725: invokevirtual   net/minecraft/client/Minecraft.getTextureManager:()Lnet/minecraft/client/renderer/texture/TextureManager;
        //  2728: getstatic       net/minecraft/client/gui/Gui.ICONS:Lnet/minecraft/util/ResourceLocation;
        //  2731: invokevirtual   net/minecraft/client/renderer/texture/TextureManager.bindTexture:(Lnet/minecraft/util/ResourceLocation;)V
        //  2734: fload           11
        //  2736: ldc_w           19.0
        //  2739: fmul           
        //  2740: f2i            
        //  2741: istore          12
        //  2743: fconst_1       
        //  2744: fconst_1       
        //  2745: fconst_1       
        //  2746: fconst_1       
        //  2747: invokestatic    net/minecraft/client/renderer/GlStateManager.color:(FFFF)V
        //  2750: aload_0        
        //  2751: iload           10
        //  2753: iload           9
        //  2755: iconst_0       
        //  2756: bipush          94
        //  2758: bipush          18
        //  2760: bipush          18
        //  2762: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.drawTexturedModalRect:(IIIIII)V
        //  2765: aload_0        
        //  2766: iload           10
        //  2768: iload           9
        //  2770: bipush          18
        //  2772: iadd           
        //  2773: iload           12
        //  2775: isub           
        //  2776: bipush          18
        //  2778: bipush          112
        //  2780: iload           12
        //  2782: isub           
        //  2783: bipush          18
        //  2785: iload           12
        //  2787: invokevirtual   com/kisman/cc/mixin/mixins/MixinGuiIngame.drawTexturedModalRect:(IIIIII)V
        //  2790: invokestatic    net/minecraft/client/renderer/RenderHelper.disableStandardItemLighting:()V
        //  2793: invokestatic    net/minecraft/client/renderer/GlStateManager.disableRescaleNormal:()V
        //  2796: invokestatic    net/minecraft/client/renderer/GlStateManager.disableBlend:()V
        //  2799: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #1399 (coming from #1396).
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
    
    @Redirect(method = { "renderGameOverlay" }, at = @At(value = "FIELD", target = "Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    @Redirect(method = { "renderGameOverlay" }, at = @At(value = "FIELD", target = "Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    private EntityPlayerSP redirectOverlayPlayer(final Minecraft minecraft) {
        final W3C0y9394VvVcZKAtDfQSnqXm5zLQGty w3C0y9394VvVcZKAtDfQSnqXm5zLQGty = new W3C0y9394VvVcZKAtDfQSnqXm5zLQGty();
        w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182 = minecraft.player;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)w3C0y9394VvVcZKAtDfQSnqXm5zLQGty);
        return w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182;
    }
    
    @Redirect(method = { "renderPotionEffects" }, at = @At(value = "FIELD", target = "Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    @Redirect(method = { "renderPotionEffects" }, at = @At(value = "FIELD", target = "Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    private EntityPlayerSP redirectPotionPlayer(final Minecraft minecraft) {
        final W3C0y9394VvVcZKAtDfQSnqXm5zLQGty w3C0y9394VvVcZKAtDfQSnqXm5zLQGty = new W3C0y9394VvVcZKAtDfQSnqXm5zLQGty();
        w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182 = minecraft.player;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)w3C0y9394VvVcZKAtDfQSnqXm5zLQGty);
        return w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182;
    }
    
    @Inject(method = { "renderAttackIndicator" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "renderAttackIndicator" }, at = { @At("HEAD") }, cancellable = true)
    private void onRenderAttackIndicator(final float n, final ScaledResolution scaledResolution, final CallbackInfo callbackInfo) {
        final p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5 p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5 = new p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5(n, scaledResolution);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5);
        if (p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5.Method159()) {
            callbackInfo.cancel();
        }
    }
}
