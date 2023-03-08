//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import net.minecraft.client.gui.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.item.*;
import java.util.*;
import org.spongepowered.asm.mixin.*;
import net.minecraft.inventory.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import org.spongepowered.asm.mixin.injection.*;
import java.awt.*;
import lavahack.client.*;

@Mixin(value = { GuiContainer.class }, priority = 10000)
public class MixinGuiContainer extends GuiScreen
{
    @Shadow
    protected int Field15987;
    @Shadow
    protected int Field15988;
    @Shadow
    protected int Field15989;
    @Shadow
    protected int Field15990;
    @Shadow
    public Container Field15991;
    @Shadow
    private ItemStack Field15992;
    @Shadow
    private Slot Field15993;
    @Shadow
    private boolean Field15994;
    @Shadow
    protected boolean Field15995;
    @Shadow
    @Final
    protected Set Field15996;
    @Shadow
    private int Field15997;
    @Shadow
    private Slot Field15998;
    public iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO Field15999;
    private boolean Field16000;
    private boolean Field16001;
    private boolean Field16002;
    private boolean Field16003;
    private boolean Field16004;
    
    public MixinGuiContainer() {
        this.Field15999 = new iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO();
        this.Field16000 = false;
        this.Field16001 = false;
        this.Field16002 = true;
        this.Field16003 = true;
        this.Field16004 = true;
    }
    
    @Shadow
    @Shadow
    private void updateDragSplitting() {
    }
    
    @Shadow
    @Shadow
    protected boolean checkHotbarKeys(final int n) {
        return false;
    }
    
    @Shadow
    @Shadow
    protected void handleMouseClick(final Slot slot, final int n, final int n2, final ClickType clickType) {
    }
    
    @Inject(method = { "drawScreen" }, at = { @At("TAIL") })
    @Inject(method = { "drawScreen" }, at = { @At("TAIL") })
    public void drawee(final int p0, final int p1, final float p2, final CallbackInfo p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokevirtual   lavahack/client/Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.Method35:()Z
        //     6: ifeq            344
        //     9: getstatic       lavahack/client/Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.Field8384:Llavahack/client/Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye;
        //    12: getfield        lavahack/client/Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.Field8379:Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //    15: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //    18: ifeq            282
        //    21: dconst_0       
        //    22: dstore          5
        //    24: aload_0        
        //    25: iconst_0       
        //    26: aload_0        
        //    27: iconst_0       
        //    28: iadd           
        //    29: aload_0        
        //    30: iconst_0       
        //    31: isub           
        //    32: i2d            
        //    33: dstore          7
        //    35: aload_0        
        //    36: iconst_0       
        //    37: aload_0        
        //    38: iconst_0       
        //    39: iadd           
        //    40: aload_0        
        //    41: iconst_0       
        //    42: iadd           
        //    43: i2d            
        //    44: dstore          9
        //    46: aload_0        
        //    47: iconst_0       
        //    48: i2d            
        //    49: dstore          11
        //    51: aload_0        
        //    52: iconst_0       
        //    53: i2d            
        //    54: dstore          13
        //    56: aload_0        
        //    57: iconst_0       
        //    58: aload_0        
        //    59: iconst_0       
        //    60: iadd           
        //    61: i2d            
        //    62: dstore          15
        //    64: new             Llavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3;
        //    67: dup            
        //    68: new             Llavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0;
        //    71: dup            
        //    72: iconst_2       
        //    73: newarray        D
        //    75: dup            
        //    76: iconst_0       
        //    77: dload           5
        //    79: dastore        
        //    80: dup            
        //    81: iconst_1       
        //    82: dload           7
        //    84: dastore        
        //    85: iconst_2       
        //    86: newarray        D
        //    88: dup            
        //    89: iconst_0       
        //    90: dload           11
        //    92: dastore        
        //    93: dup            
        //    94: iconst_1       
        //    95: dload           13
        //    97: dastore        
        //    98: iconst_2       
        //    99: newarray        D
        //   101: dup            
        //   102: iconst_0       
        //   103: dload           11
        //   105: dastore        
        //   106: dup            
        //   107: iconst_1       
        //   108: dload           15
        //   110: dastore        
        //   111: iconst_2       
        //   112: newarray        D
        //   114: dup            
        //   115: iconst_0       
        //   116: dload           5
        //   118: dastore        
        //   119: dup            
        //   120: iconst_1       
        //   121: dload           9
        //   123: dastore        
        //   124: invokespecial   lavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0.<init>:([D[D[D[D)V
        //   127: getstatic       java/awt/Color.BLACK:Ljava/awt/Color;
        //   130: new             Ljava/awt/Color;
        //   133: dup            
        //   134: iconst_0       
        //   135: iconst_0       
        //   136: iconst_0       
        //   137: iconst_0       
        //   138: invokespecial   java/awt/Color.<init>:(IIII)V
        //   141: iconst_0       
        //   142: invokespecial   lavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3.<init>:(Llavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0;Ljava/awt/Color;Ljava/awt/Color;Z)V
        //   145: invokestatic    lavahack/client/hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawAbstract:(Llavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3;)V
        //   148: new             Lnet/minecraft/client/gui/ScaledResolution;
        //   151: dup            
        //   152: invokestatic    net/minecraft/client/Minecraft.getMinecraft:()Lnet/minecraft/client/Minecraft;
        //   155: invokespecial   net/minecraft/client/gui/ScaledResolution.<init>:(Lnet/minecraft/client/Minecraft;)V
        //   158: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledWidth_double:()D
        //   161: dstore          5
        //   163: aload_0        
        //   164: iconst_0       
        //   165: aload_0        
        //   166: iconst_0       
        //   167: iadd           
        //   168: aload_0        
        //   169: iconst_0       
        //   170: isub           
        //   171: i2d            
        //   172: dstore          7
        //   174: aload_0        
        //   175: iconst_0       
        //   176: aload_0        
        //   177: iconst_0       
        //   178: iadd           
        //   179: aload_0        
        //   180: iconst_0       
        //   181: iadd           
        //   182: i2d            
        //   183: dstore          9
        //   185: new             Llavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3;
        //   188: dup            
        //   189: new             Llavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0;
        //   192: dup            
        //   193: iconst_2       
        //   194: newarray        D
        //   196: dup            
        //   197: iconst_0       
        //   198: aload_0        
        //   199: iconst_0       
        //   200: aload_0        
        //   201: iconst_0       
        //   202: iadd           
        //   203: i2d            
        //   204: dastore        
        //   205: dup            
        //   206: iconst_1       
        //   207: aload_0        
        //   208: iconst_0       
        //   209: i2d            
        //   210: dastore        
        //   211: iconst_2       
        //   212: newarray        D
        //   214: dup            
        //   215: iconst_0       
        //   216: dload           5
        //   218: dastore        
        //   219: dup            
        //   220: iconst_1       
        //   221: dload           7
        //   223: dastore        
        //   224: iconst_2       
        //   225: newarray        D
        //   227: dup            
        //   228: iconst_0       
        //   229: dload           5
        //   231: dastore        
        //   232: dup            
        //   233: iconst_1       
        //   234: dload           9
        //   236: dastore        
        //   237: iconst_2       
        //   238: newarray        D
        //   240: dup            
        //   241: iconst_0       
        //   242: aload_0        
        //   243: iconst_0       
        //   244: aload_0        
        //   245: iconst_0       
        //   246: iadd           
        //   247: i2d            
        //   248: dastore        
        //   249: dup            
        //   250: iconst_1       
        //   251: aload_0        
        //   252: iconst_0       
        //   253: aload_0        
        //   254: iconst_0       
        //   255: iadd           
        //   256: i2d            
        //   257: dastore        
        //   258: invokespecial   lavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0.<init>:([D[D[D[D)V
        //   261: new             Ljava/awt/Color;
        //   264: dup            
        //   265: iconst_0       
        //   266: iconst_0       
        //   267: iconst_0       
        //   268: iconst_0       
        //   269: invokespecial   java/awt/Color.<init>:(IIII)V
        //   272: getstatic       java/awt/Color.BLACK:Ljava/awt/Color;
        //   275: iconst_0       
        //   276: invokespecial   lavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3.<init>:(Llavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0;Ljava/awt/Color;Ljava/awt/Color;Z)V
        //   279: invokestatic    lavahack/client/hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawAbstract:(Llavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3;)V
        //   282: getstatic       lavahack/client/Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.Field8384:Llavahack/client/Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye;
        //   285: getfield        lavahack/client/Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.Field8380:Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //   288: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //   291: ifeq            344
        //   294: aload_0        
        //   295: getfield        com/kisman/cc/mixin/mixins/MixinGuiContainer.Field15999:Llavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO;
        //   298: invokevirtual   lavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO.Method2401:()Lnet/minecraft/client/gui/GuiTextField;
        //   301: invokevirtual   net/minecraft/client/gui/GuiTextField.drawTextBox:()V
        //   304: goto            344
        //   307: astore          5
        //   309: aload_0        
        //   310: getfield        com/kisman/cc/mixin/mixins/MixinGuiContainer.Field16000:Z
        //   313: ifeq            344
        //   316: new             Ljava/lang/StringBuilder;
        //   319: dup            
        //   320: invokespecial   java/lang/StringBuilder.<init>:()V
        //   323: ldc             "Got exception in drawScreen tail inject hook by ItemESP, stack trace: "
        //   325: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   328: aload           5
        //   330: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   333: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   336: invokestatic    lavahack/client/f6aFouCJkCjY6laEAJ3SlVK7O2Sc85SP.Method1452:(Ljava/lang/String;)V
        //   339: aload_0        
        //   340: iconst_0       
        //   341: putfield        com/kisman/cc/mixin/mixins/MixinGuiContainer.Field16000:Z
        //   344: return         
        //   345: getstatic       lavahack/client/Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.Field8384:Llavahack/client/Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye;
        //   348: invokevirtual   lavahack/client/Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.Method35:()Z
        //   351: ifeq            689
        //   354: getstatic       lavahack/client/Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.Field8384:Llavahack/client/Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye;
        //   357: getfield        lavahack/client/Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.Field8379:Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //   360: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //   363: ifeq            627
        //   366: dconst_0       
        //   367: dstore          5
        //   369: aload_0        
        //   370: iconst_0       
        //   371: aload_0        
        //   372: iconst_0       
        //   373: iadd           
        //   374: aload_0        
        //   375: iconst_0       
        //   376: isub           
        //   377: i2d            
        //   378: dstore          7
        //   380: aload_0        
        //   381: iconst_0       
        //   382: aload_0        
        //   383: iconst_0       
        //   384: iadd           
        //   385: aload_0        
        //   386: iconst_0       
        //   387: iadd           
        //   388: i2d            
        //   389: dstore          9
        //   391: aload_0        
        //   392: iconst_0       
        //   393: i2d            
        //   394: dstore          11
        //   396: aload_0        
        //   397: iconst_0       
        //   398: i2d            
        //   399: dstore          13
        //   401: aload_0        
        //   402: iconst_0       
        //   403: aload_0        
        //   404: iconst_0       
        //   405: iadd           
        //   406: i2d            
        //   407: dstore          15
        //   409: new             Llavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3;
        //   412: dup            
        //   413: new             Llavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0;
        //   416: dup            
        //   417: iconst_2       
        //   418: newarray        D
        //   420: dup            
        //   421: iconst_0       
        //   422: dload           5
        //   424: dastore        
        //   425: dup            
        //   426: iconst_1       
        //   427: dload           7
        //   429: dastore        
        //   430: iconst_2       
        //   431: newarray        D
        //   433: dup            
        //   434: iconst_0       
        //   435: dload           11
        //   437: dastore        
        //   438: dup            
        //   439: iconst_1       
        //   440: dload           13
        //   442: dastore        
        //   443: iconst_2       
        //   444: newarray        D
        //   446: dup            
        //   447: iconst_0       
        //   448: dload           11
        //   450: dastore        
        //   451: dup            
        //   452: iconst_1       
        //   453: dload           15
        //   455: dastore        
        //   456: iconst_2       
        //   457: newarray        D
        //   459: dup            
        //   460: iconst_0       
        //   461: dload           5
        //   463: dastore        
        //   464: dup            
        //   465: iconst_1       
        //   466: dload           9
        //   468: dastore        
        //   469: invokespecial   lavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0.<init>:([D[D[D[D)V
        //   472: getstatic       java/awt/Color.BLACK:Ljava/awt/Color;
        //   475: new             Ljava/awt/Color;
        //   478: dup            
        //   479: iconst_0       
        //   480: iconst_0       
        //   481: iconst_0       
        //   482: iconst_0       
        //   483: invokespecial   java/awt/Color.<init>:(IIII)V
        //   486: iconst_0       
        //   487: invokespecial   lavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3.<init>:(Llavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0;Ljava/awt/Color;Ljava/awt/Color;Z)V
        //   490: invokestatic    lavahack/client/hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawAbstract:(Llavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3;)V
        //   493: new             Lnet/minecraft/client/gui/ScaledResolution;
        //   496: dup            
        //   497: invokestatic    net/minecraft/client/Minecraft.getMinecraft:()Lnet/minecraft/client/Minecraft;
        //   500: invokespecial   net/minecraft/client/gui/ScaledResolution.<init>:(Lnet/minecraft/client/Minecraft;)V
        //   503: invokevirtual   net/minecraft/client/gui/ScaledResolution.getScaledWidth_double:()D
        //   506: dstore          5
        //   508: aload_0        
        //   509: iconst_0       
        //   510: aload_0        
        //   511: iconst_0       
        //   512: iadd           
        //   513: aload_0        
        //   514: iconst_0       
        //   515: isub           
        //   516: i2d            
        //   517: dstore          7
        //   519: aload_0        
        //   520: iconst_0       
        //   521: aload_0        
        //   522: iconst_0       
        //   523: iadd           
        //   524: aload_0        
        //   525: iconst_0       
        //   526: iadd           
        //   527: i2d            
        //   528: dstore          9
        //   530: new             Llavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3;
        //   533: dup            
        //   534: new             Llavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0;
        //   537: dup            
        //   538: iconst_2       
        //   539: newarray        D
        //   541: dup            
        //   542: iconst_0       
        //   543: aload_0        
        //   544: iconst_0       
        //   545: aload_0        
        //   546: iconst_0       
        //   547: iadd           
        //   548: i2d            
        //   549: dastore        
        //   550: dup            
        //   551: iconst_1       
        //   552: aload_0        
        //   553: iconst_0       
        //   554: i2d            
        //   555: dastore        
        //   556: iconst_2       
        //   557: newarray        D
        //   559: dup            
        //   560: iconst_0       
        //   561: dload           5
        //   563: dastore        
        //   564: dup            
        //   565: iconst_1       
        //   566: dload           7
        //   568: dastore        
        //   569: iconst_2       
        //   570: newarray        D
        //   572: dup            
        //   573: iconst_0       
        //   574: dload           5
        //   576: dastore        
        //   577: dup            
        //   578: iconst_1       
        //   579: dload           9
        //   581: dastore        
        //   582: iconst_2       
        //   583: newarray        D
        //   585: dup            
        //   586: iconst_0       
        //   587: aload_0        
        //   588: iconst_0       
        //   589: aload_0        
        //   590: iconst_0       
        //   591: iadd           
        //   592: i2d            
        //   593: dastore        
        //   594: dup            
        //   595: iconst_1       
        //   596: aload_0        
        //   597: iconst_0       
        //   598: aload_0        
        //   599: iconst_0       
        //   600: iadd           
        //   601: i2d            
        //   602: dastore        
        //   603: invokespecial   lavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0.<init>:([D[D[D[D)V
        //   606: new             Ljava/awt/Color;
        //   609: dup            
        //   610: iconst_0       
        //   611: iconst_0       
        //   612: iconst_0       
        //   613: iconst_0       
        //   614: invokespecial   java/awt/Color.<init>:(IIII)V
        //   617: getstatic       java/awt/Color.BLACK:Ljava/awt/Color;
        //   620: iconst_0       
        //   621: invokespecial   lavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3.<init>:(Llavahack/client/Jl14CJNmtWTqlp58umYadtnd800b2Vd0;Ljava/awt/Color;Ljava/awt/Color;Z)V
        //   624: invokestatic    lavahack/client/hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawAbstract:(Llavahack/client/gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3;)V
        //   627: getstatic       lavahack/client/Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.Field8384:Llavahack/client/Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye;
        //   630: getfield        lavahack/client/Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.Field8380:Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //   633: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //   636: ifeq            689
        //   639: aload_0        
        //   640: getfield        com/kisman/cc/mixin/mixins/MixinGuiContainer.Field15999:Llavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO;
        //   643: invokevirtual   lavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO.Method2401:()Lnet/minecraft/client/gui/GuiTextField;
        //   646: invokevirtual   net/minecraft/client/gui/GuiTextField.drawTextBox:()V
        //   649: goto            689
        //   652: astore          5
        //   654: aload_0        
        //   655: getfield        com/kisman/cc/mixin/mixins/MixinGuiContainer.Field16000:Z
        //   658: ifeq            689
        //   661: new             Ljava/lang/StringBuilder;
        //   664: dup            
        //   665: invokespecial   java/lang/StringBuilder.<init>:()V
        //   668: ldc             "Got exception in drawScreen tail inject hook by ItemESP, stack trace: "
        //   670: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   673: aload           5
        //   675: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   678: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   681: invokestatic    lavahack/client/f6aFouCJkCjY6laEAJ3SlVK7O2Sc85SP.Method1452:(Ljava/lang/String;)V
        //   684: aload_0        
        //   685: iconst_0       
        //   686: putfield        com/kisman/cc/mixin/mixins/MixinGuiContainer.Field16000:Z
        //   689: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0282 (coming from #0279).
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
    
    @Inject(method = { "drawScreen" }, at = { @At("HEAD") })
    @Inject(method = { "drawScreen" }, at = { @At("HEAD") })
    private void doDrawScreen(final int p0, final int p1, final float p2, final CallbackInfo p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/kisman/cc/mixin/mixins/MixinGuiContainer.Field15999:Llavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO;
        //     4: ifnull          179
        //     7: aload_0        
        //     8: getfield        com/kisman/cc/mixin/mixins/MixinGuiContainer.Field15999:Llavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO;
        //    11: aload_0        
        //    12: iconst_0       
        //    13: aload_0        
        //    14: iconst_0       
        //    15: aload_0        
        //    16: iconst_0       
        //    17: aload_0        
        //    18: iconst_0       
        //    19: invokevirtual   lavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO.Method2407:(IIII)V
        //    22: aload_0        
        //    23: getfield        com/kisman/cc/mixin/mixins/MixinGuiContainer.Field15999:Llavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO;
        //    26: invokevirtual   lavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO.Method2403:()Ljava/util/ArrayList;
        //    29: invokevirtual   java/util/ArrayList.clear:()V
        //    32: aload_0        
        //    33: getfield        com/kisman/cc/mixin/mixins/MixinGuiContainer.Field15999:Llavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO;
        //    36: invokevirtual   lavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO.Method2401:()Lnet/minecraft/client/gui/GuiTextField;
        //    39: invokevirtual   net/minecraft/client/gui/GuiTextField.getText:()Ljava/lang/String;
        //    42: invokevirtual   java/lang/String.isEmpty:()Z
        //    45: ifne            139
        //    48: aload_0        
        //    49: aconst_null    
        //    50: getfield        net/minecraft/inventory/Container.inventorySlots:Ljava/util/List;
        //    53: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    58: astore          5
        //    60: aload           5
        //    62: invokeinterface java/util/Iterator.hasNext:()Z
        //    67: ifeq            139
        //    70: aload           5
        //    72: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    77: checkcast       Lnet/minecraft/inventory/Slot;
        //    80: astore          6
        //    82: aload           6
        //    84: invokevirtual   net/minecraft/inventory/Slot.getHasStack:()Z
        //    87: ifeq            136
        //    90: aload           6
        //    92: invokevirtual   net/minecraft/inventory/Slot.getStack:()Lnet/minecraft/item/ItemStack;
        //    95: invokevirtual   net/minecraft/item/ItemStack.getDisplayName:()Ljava/lang/String;
        //    98: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   101: aload_0        
        //   102: getfield        com/kisman/cc/mixin/mixins/MixinGuiContainer.Field15999:Llavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO;
        //   105: invokevirtual   lavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO.Method2401:()Lnet/minecraft/client/gui/GuiTextField;
        //   108: invokevirtual   net/minecraft/client/gui/GuiTextField.getText:()Ljava/lang/String;
        //   111: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   114: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   117: ifeq            136
        //   120: aload_0        
        //   121: getfield        com/kisman/cc/mixin/mixins/MixinGuiContainer.Field15999:Llavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO;
        //   124: invokevirtual   lavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO.Method2403:()Ljava/util/ArrayList;
        //   127: aload           6
        //   129: invokevirtual   net/minecraft/inventory/Slot.getStack:()Lnet/minecraft/item/ItemStack;
        //   132: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   135: pop            
        //   136: goto            60
        //   139: goto            179
        //   142: astore          5
        //   144: aload_0        
        //   145: getfield        com/kisman/cc/mixin/mixins/MixinGuiContainer.Field16001:Z
        //   148: ifeq            179
        //   151: new             Ljava/lang/StringBuilder;
        //   154: dup            
        //   155: invokespecial   java/lang/StringBuilder.<init>:()V
        //   158: ldc             "Got exception in drawScreen head inject hook by ItemESP, stack trace: "
        //   160: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   163: aload           5
        //   165: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   168: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   171: invokestatic    lavahack/client/f6aFouCJkCjY6laEAJ3SlVK7O2Sc85SP.Method1452:(Ljava/lang/String;)V
        //   174: aload_0        
        //   175: iconst_0       
        //   176: putfield        com/kisman/cc/mixin/mixins/MixinGuiContainer.Field16001:Z
        //   179: return         
        //   180: aload_0        
        //   181: getfield        com/kisman/cc/mixin/mixins/MixinGuiContainer.Field15999:Llavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO;
        //   184: ifnull          359
        //   187: aload_0        
        //   188: getfield        com/kisman/cc/mixin/mixins/MixinGuiContainer.Field15999:Llavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO;
        //   191: aload_0        
        //   192: iconst_0       
        //   193: aload_0        
        //   194: iconst_0       
        //   195: aload_0        
        //   196: iconst_0       
        //   197: aload_0        
        //   198: iconst_0       
        //   199: invokevirtual   lavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO.Method2407:(IIII)V
        //   202: aload_0        
        //   203: getfield        com/kisman/cc/mixin/mixins/MixinGuiContainer.Field15999:Llavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO;
        //   206: invokevirtual   lavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO.Method2403:()Ljava/util/ArrayList;
        //   209: invokevirtual   java/util/ArrayList.clear:()V
        //   212: aload_0        
        //   213: getfield        com/kisman/cc/mixin/mixins/MixinGuiContainer.Field15999:Llavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO;
        //   216: invokevirtual   lavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO.Method2401:()Lnet/minecraft/client/gui/GuiTextField;
        //   219: invokevirtual   net/minecraft/client/gui/GuiTextField.getText:()Ljava/lang/String;
        //   222: invokevirtual   java/lang/String.isEmpty:()Z
        //   225: ifne            319
        //   228: aload_0        
        //   229: aconst_null    
        //   230: getfield        net/minecraft/inventory/Container.inventorySlots:Ljava/util/List;
        //   233: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   238: astore          5
        //   240: aload           5
        //   242: invokeinterface java/util/Iterator.hasNext:()Z
        //   247: ifeq            319
        //   250: aload           5
        //   252: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   257: checkcast       Lnet/minecraft/inventory/Slot;
        //   260: astore          6
        //   262: aload           6
        //   264: invokevirtual   net/minecraft/inventory/Slot.getHasStack:()Z
        //   267: ifeq            316
        //   270: aload           6
        //   272: invokevirtual   net/minecraft/inventory/Slot.getStack:()Lnet/minecraft/item/ItemStack;
        //   275: invokevirtual   net/minecraft/item/ItemStack.getDisplayName:()Ljava/lang/String;
        //   278: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   281: aload_0        
        //   282: getfield        com/kisman/cc/mixin/mixins/MixinGuiContainer.Field15999:Llavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO;
        //   285: invokevirtual   lavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO.Method2401:()Lnet/minecraft/client/gui/GuiTextField;
        //   288: invokevirtual   net/minecraft/client/gui/GuiTextField.getText:()Ljava/lang/String;
        //   291: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   294: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   297: ifeq            316
        //   300: aload_0        
        //   301: getfield        com/kisman/cc/mixin/mixins/MixinGuiContainer.Field15999:Llavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO;
        //   304: invokevirtual   lavahack/client/iIfYj2vMyp1HEd9LJzqdNnkWCXRRWNnO.Method2403:()Ljava/util/ArrayList;
        //   307: aload           6
        //   309: invokevirtual   net/minecraft/inventory/Slot.getStack:()Lnet/minecraft/item/ItemStack;
        //   312: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   315: pop            
        //   316: goto            240
        //   319: goto            359
        //   322: astore          5
        //   324: aload_0        
        //   325: getfield        com/kisman/cc/mixin/mixins/MixinGuiContainer.Field16001:Z
        //   328: ifeq            359
        //   331: new             Ljava/lang/StringBuilder;
        //   334: dup            
        //   335: invokespecial   java/lang/StringBuilder.<init>:()V
        //   338: ldc             "Got exception in drawScreen head inject hook by ItemESP, stack trace: "
        //   340: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   343: aload           5
        //   345: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   348: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   351: invokestatic    lavahack/client/f6aFouCJkCjY6laEAJ3SlVK7O2Sc85SP.Method1452:(Ljava/lang/String;)V
        //   354: aload_0        
        //   355: iconst_0       
        //   356: putfield        com/kisman/cc/mixin/mixins/MixinGuiContainer.Field16001:Z
        //   359: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0179 (coming from #0139).
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
    
    @Inject(method = { "keyTyped" }, at = { @At("HEAD") })
    @Inject(method = { "keyTyped" }, at = { @At("HEAD") })
    private void keyTypedHook(final char c, final int n, final CallbackInfo callbackInfo) {
        if (Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.Field8384.Field8380.Method365()) {
            this.Field15999.Method2401().textboxKeyTyped(c, n);
        }
    }
    
    @Inject(method = { "mouseClicked" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "mouseClicked" }, at = { @At("HEAD") }, cancellable = true)
    private void doMouseClicked(final int n, final int n2, final int n3, final CallbackInfo callbackInfo) {
        if (Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.Field8384.Method35() && Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.Field8384.Field8380.Method365() && this.Field15999 != null) {
            this.Field15999.Method2401().mouseClicked(n, n2, n3);
            if (this.Field15999.Method2401().isFocused()) {
                callbackInfo.cancel();
            }
        }
    }
    
    @Inject(method = { "drawSlot" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;enableDepth()V") })
    @Inject(method = { "drawSlot" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;enableDepth()V") })
    private void drawSlotHook(final Slot slot, final CallbackInfo callbackInfo) {
        if (Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.Field8384.Method35() && Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.Field8384.Field8380.Method365() && !this.Field15999.Method2403().isEmpty() && this.Field15999.Method2403().contains(slot.getStack())) {
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(slot.xPos, slot.yPos, slot.xPos + 16, slot.yPos + 16, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(100, 100));
        }
        if (DfxOZyI94jdDOZQSfulpe3ocgVMaQcfh.Method2214().Method35() && DfxOZyI94jdDOZQSfulpe3ocgVMaQcfh.Method2214().Method2210().Method365()) {
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(slot.xPos, slot.yPos, slot.xPos + 16, slot.yPos + 16, Color.BLACK.getRGB());
            fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4744(String.valueOf((DfxOZyI94jdDOZQSfulpe3ocgVMaQcfh.Method2214().Method2211().Method341() == MtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bI.Field16945) ? slot.getSlotIndex() : slot.slotNumber), (double)slot.xPos, (double)slot.yPos, -1);
        }
    }
}
