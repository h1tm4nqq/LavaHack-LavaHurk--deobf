//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.baritone;

import baritone.utils.accessor.*;
import net.minecraft.util.*;
import org.spongepowered.asm.mixin.*;

@Mixin({ BitArray.class })
public class MixinBitArray implements IBitArray
{
    @Shadow
    @Final
    private long[] Field15068;
    @Shadow
    @Final
    private int Field15069;
    @Shadow
    @Final
    private long Field15070;
    @Shadow
    @Final
    private int Field15071;
    
    @Unique
    @Unique
    public int[] toArray() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iconst_0       
        //     2: newarray        I
        //     4: astore_1       
        //     5: iconst_0       
        //     6: istore_2       
        //     7: aload_0        
        //     8: iconst_m1      
        //     9: istore_3       
        //    10: iload_2        
        //    11: aload_0        
        //    12: iconst_0       
        //    13: if_icmpge       103
        //    16: iload_2        
        //    17: aload_0        
        //    18: iconst_0       
        //    19: imul           
        //    20: istore          4
        //    22: iload           4
        //    24: bipush          6
        //    26: ishr           
        //    27: istore          5
        //    29: iload           4
        //    31: bipush          63
        //    33: iand           
        //    34: istore          6
        //    36: iload_3        
        //    37: bipush          6
        //    39: ishr           
        //    40: istore          7
        //    42: aload_0        
        //    43: aconst_null    
        //    44: iload           5
        //    46: laload         
        //    47: iload           6
        //    49: lushr          
        //    50: lstore          8
        //    52: iload           5
        //    54: iload           7
        //    56: if_icmpne       71
        //    59: aload_1        
        //    60: iload_2        
        //    61: lload           8
        //    63: aload_0        
        //    64: lconst_0       
        //    65: land           
        //    66: l2i            
        //    67: iastore        
        //    68: goto            92
        //    71: aload_1        
        //    72: iload_2        
        //    73: lload           8
        //    75: aload_0        
        //    76: aconst_null    
        //    77: iload           7
        //    79: laload         
        //    80: bipush          64
        //    82: iload           6
        //    84: isub           
        //    85: lshl           
        //    86: lor            
        //    87: aload_0        
        //    88: lconst_0       
        //    89: land           
        //    90: l2i            
        //    91: iastore        
        //    92: iinc            2, 1
        //    95: iload_3        
        //    96: aload_0        
        //    97: iconst_0       
        //    98: iadd           
        //    99: istore_3       
        //   100: goto            10
        //   103: aload_1        
        //   104: areturn        
        //   105: aload_0        
        //   106: iconst_0       
        //   107: newarray        I
        //   109: astore_1       
        //   110: iconst_0       
        //   111: istore_2       
        //   112: aload_0        
        //   113: iconst_m1      
        //   114: istore_3       
        //   115: iload_2        
        //   116: aload_0        
        //   117: iconst_0       
        //   118: if_icmpge       208
        //   121: iload_2        
        //   122: aload_0        
        //   123: iconst_0       
        //   124: imul           
        //   125: istore          4
        //   127: iload           4
        //   129: bipush          6
        //   131: ishr           
        //   132: istore          5
        //   134: iload           4
        //   136: bipush          63
        //   138: iand           
        //   139: istore          6
        //   141: iload_3        
        //   142: bipush          6
        //   144: ishr           
        //   145: istore          7
        //   147: aload_0        
        //   148: aconst_null    
        //   149: iload           5
        //   151: laload         
        //   152: iload           6
        //   154: lushr          
        //   155: lstore          8
        //   157: iload           5
        //   159: iload           7
        //   161: if_icmpne       176
        //   164: aload_1        
        //   165: iload_2        
        //   166: lload           8
        //   168: aload_0        
        //   169: lconst_0       
        //   170: land           
        //   171: l2i            
        //   172: iastore        
        //   173: goto            197
        //   176: aload_1        
        //   177: iload_2        
        //   178: lload           8
        //   180: aload_0        
        //   181: aconst_null    
        //   182: iload           7
        //   184: laload         
        //   185: bipush          64
        //   187: iload           6
        //   189: isub           
        //   190: lshl           
        //   191: lor            
        //   192: aload_0        
        //   193: lconst_0       
        //   194: land           
        //   195: l2i            
        //   196: iastore        
        //   197: iinc            2, 1
        //   200: iload_3        
        //   201: aload_0        
        //   202: iconst_0       
        //   203: iadd           
        //   204: istore_3       
        //   205: goto            115
        //   208: aload_1        
        //   209: areturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0010 (coming from #0100).
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
