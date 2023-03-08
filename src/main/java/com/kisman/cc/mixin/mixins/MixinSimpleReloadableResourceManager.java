//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import net.minecraft.client.resources.data.*;
import org.spongepowered.asm.mixin.*;
import net.minecraft.client.resources.*;
import net.minecraft.util.*;
import lavahack.client.*;
import java.util.*;
import java.io.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ SimpleReloadableResourceManager.class })
public class MixinSimpleReloadableResourceManager
{
    @Shadow
    @Final
    private MetadataSerializer Field15873;
    @Shadow
    @Final
    private Set Field15874;
    
    @Redirect(method = { "getAllResources" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/resources/IResourceManager;getAllResources(Lnet/minecraft/util/ResourceLocation;)Ljava/util/List;"))
    @Redirect(method = { "getAllResources" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/resources/IResourceManager;getAllResources(Lnet/minecraft/util/ResourceLocation;)Ljava/util/List;"))
    private List Method6520(final IResourceManager resourceManager, final ResourceLocation resourceLocation) throws IOException {
        final List getAllResources = resourceManager.getAllResources(resourceLocation);
        getAllResources.addAll(APLiuD42NlPlraivP9dUfLBjuvNUPiXs.Method5474(resourceLocation));
        return getAllResources;
    }
    
    @Inject(method = { "getResource" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "getResource" }, at = { @At("HEAD") }, cancellable = true)
    private void Method6521(final ResourceLocation p0, final CallbackInfoReturnable p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Llavahack/client/cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh;
        //     4: ifne            58
        //     7: aload_1        
        //     8: invokevirtual   net/minecraft/util/ResourceLocation.getNamespace:()Ljava/lang/String;
        //    11: ldc             "kismancc"
        //    13: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    16: ifeq            58
        //    19: new             Llavahack/client/cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh;
        //    22: dup            
        //    23: new             Ljava/lang/StringBuilder;
        //    26: dup            
        //    27: invokespecial   java/lang/StringBuilder.<init>:()V
        //    30: aload_1        
        //    31: invokevirtual   net/minecraft/util/ResourceLocation.getNamespace:()Ljava/lang/String;
        //    34: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    37: ldc             ":"
        //    39: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    42: aload_1        
        //    43: invokevirtual   net/minecraft/util/ResourceLocation.getPath:()Ljava/lang/String;
        //    46: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    49: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    52: ldc             "kismancc"
        //    54: invokespecial   lavahack/client/cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    57: astore_1       
        //    58: aload_1        
        //    59: instanceof      Llavahack/client/cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh;
        //    62: ifeq            111
        //    65: aload_1        
        //    66: checkcast       Llavahack/client/cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh;
        //    69: astore          4
        //    71: invokestatic    lavahack/client/S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a.Method1845:()Llavahack/client/S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a;
        //    74: invokevirtual   lavahack/client/S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a.Method1852:()Ljava/lang/ClassLoader;
        //    77: astore          5
        //    79: aload           5
        //    81: ifnonnull       94
        //    84: new             Ljava/lang/IllegalStateException;
        //    87: dup            
        //    88: ldc             "PluginClassLoader was null!"
        //    90: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    93: athrow         
        //    94: new             Llavahack/client/k9GtxOFyMEHGmyD7V7t0LXVkLyzuoeZv;
        //    97: dup            
        //    98: aload           4
        //   100: aload_0        
        //   101: aconst_null    
        //   102: aload           5
        //   104: invokespecial   lavahack/client/k9GtxOFyMEHGmyD7V7t0LXVkLyzuoeZv.<init>:(Llavahack/client/cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh;Lnet/minecraft/client/resources/data/MetadataSerializer;Ljava/lang/ClassLoader;)V
        //   107: astore_3       
        //   108: goto            116
        //   111: aload_1        
        //   112: invokestatic    lavahack/client/APLiuD42NlPlraivP9dUfLBjuvNUPiXs.Method5473:(Lnet/minecraft/util/ResourceLocation;)Llavahack/client/agQKyViUt0LwuNez9RWHVabw1B33135o;
        //   115: astore_3       
        //   116: aload_3        
        //   117: ifnull          171
        //   120: getstatic       lavahack/client/leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243:Lorg/apache/logging/log4j/Logger;
        //   123: new             Ljava/lang/StringBuilder;
        //   126: dup            
        //   127: invokespecial   java/lang/StringBuilder.<init>:()V
        //   130: ldc             "Custom Resource detected: "
        //   132: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   135: aload_1        
        //   136: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   139: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   142: invokeinterface org/apache/logging/log4j/Logger.info:(Ljava/lang/String;)V
        //   147: aload_3        
        //   148: invokeinterface lavahack/client/agQKyViUt0LwuNez9RWHVabw1B33135o.Method3676:()Lnet/minecraft/client/resources/IResource;
        //   153: astore          4
        //   155: aload_2        
        //   156: aload           4
        //   158: invokevirtual   org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable.setReturnValue:(Ljava/lang/Object;)V
        //   161: goto            171
        //   164: astore          4
        //   166: aload           4
        //   168: invokevirtual   lavahack/client/Csi3zhdVbG2hwuonRwuIPTdK5alKV1HC.printStackTrace:()V
        //   171: return         
        //   172: aload_1        
        //   173: instanceof      Llavahack/client/cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh;
        //   176: ifne            230
        //   179: aload_1        
        //   180: invokevirtual   net/minecraft/util/ResourceLocation.getNamespace:()Ljava/lang/String;
        //   183: ldc             "kismancc"
        //   185: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   188: ifeq            230
        //   191: new             Llavahack/client/cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh;
        //   194: dup            
        //   195: new             Ljava/lang/StringBuilder;
        //   198: dup            
        //   199: invokespecial   java/lang/StringBuilder.<init>:()V
        //   202: aload_1        
        //   203: invokevirtual   net/minecraft/util/ResourceLocation.getNamespace:()Ljava/lang/String;
        //   206: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   209: ldc             ":"
        //   211: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   214: aload_1        
        //   215: invokevirtual   net/minecraft/util/ResourceLocation.getPath:()Ljava/lang/String;
        //   218: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   221: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   224: ldc             "kismancc"
        //   226: invokespecial   lavahack/client/cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   229: astore_1       
        //   230: aload_1        
        //   231: instanceof      Llavahack/client/cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh;
        //   234: ifeq            283
        //   237: aload_1        
        //   238: checkcast       Llavahack/client/cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh;
        //   241: astore          4
        //   243: invokestatic    lavahack/client/S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a.Method1845:()Llavahack/client/S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a;
        //   246: invokevirtual   lavahack/client/S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a.Method1852:()Ljava/lang/ClassLoader;
        //   249: astore          5
        //   251: aload           5
        //   253: ifnonnull       266
        //   256: new             Ljava/lang/IllegalStateException;
        //   259: dup            
        //   260: ldc             "PluginClassLoader was null!"
        //   262: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   265: athrow         
        //   266: new             Llavahack/client/k9GtxOFyMEHGmyD7V7t0LXVkLyzuoeZv;
        //   269: dup            
        //   270: aload           4
        //   272: aload_0        
        //   273: aconst_null    
        //   274: aload           5
        //   276: invokespecial   lavahack/client/k9GtxOFyMEHGmyD7V7t0LXVkLyzuoeZv.<init>:(Llavahack/client/cPZDcaeSbzR5A7IRGH5oVRtsxx839jzh;Lnet/minecraft/client/resources/data/MetadataSerializer;Ljava/lang/ClassLoader;)V
        //   279: astore_3       
        //   280: goto            288
        //   283: aload_1        
        //   284: invokestatic    lavahack/client/APLiuD42NlPlraivP9dUfLBjuvNUPiXs.Method5473:(Lnet/minecraft/util/ResourceLocation;)Llavahack/client/agQKyViUt0LwuNez9RWHVabw1B33135o;
        //   287: astore_3       
        //   288: aload_3        
        //   289: ifnull          343
        //   292: getstatic       lavahack/client/leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243:Lorg/apache/logging/log4j/Logger;
        //   295: new             Ljava/lang/StringBuilder;
        //   298: dup            
        //   299: invokespecial   java/lang/StringBuilder.<init>:()V
        //   302: ldc             "Custom Resource detected: "
        //   304: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   307: aload_1        
        //   308: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   311: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   314: invokeinterface org/apache/logging/log4j/Logger.info:(Ljava/lang/String;)V
        //   319: aload_3        
        //   320: invokeinterface lavahack/client/agQKyViUt0LwuNez9RWHVabw1B33135o.Method3676:()Lnet/minecraft/client/resources/IResource;
        //   325: astore          4
        //   327: aload_2        
        //   328: aload           4
        //   330: invokevirtual   org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable.setReturnValue:(Ljava/lang/Object;)V
        //   333: goto            343
        //   336: astore          4
        //   338: aload           4
        //   340: invokevirtual   lavahack/client/Csi3zhdVbG2hwuonRwuIPTdK5alKV1HC.printStackTrace:()V
        //   343: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0116 (coming from #0108).
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
    
    @Inject(method = { "getResourceDomains" }, at = { @At("HEAD") })
    @Inject(method = { "getResourceDomains" }, at = { @At("HEAD") })
    private void Method6522(final CallbackInfoReturnable callbackInfoReturnable) {
        null.add("kismancc");
    }
}
