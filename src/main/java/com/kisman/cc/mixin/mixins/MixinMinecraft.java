//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import net.minecraft.client.*;
import net.minecraft.client.settings.*;
import org.spongepowered.asm.mixin.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.multiplayer.*;
import baritone.api.*;
import baritone.api.event.events.type.*;
import java.util.function.*;
import java.util.*;
import net.minecraft.client.gui.*;
import org.spongepowered.asm.mixin.injection.*;
import net.minecraft.util.math.*;
import baritone.api.event.events.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import org.lwjgl.input.*;
import com.kisman.cc.event.*;
import lavahack.client.*;

@Mixin(value = { Minecraft.class }, priority = 10000)
public class MixinMinecraft implements wkwi2Aupxpyp8sqUHbaH7iYHxWosUPRY
{
    @Shadow
    public GameSettings Field16133;
    @Shadow
    public EntityPlayerSP Field16134;
    @Shadow
    public PlayerControllerMP Field16135;
    private boolean Field16136;
    private boolean Field16137;
    @Shadow
    public WorldClient Field16138;
    
    public MixinMinecraft() {
        this.Field16136 = false;
        this.Field16137 = false;
    }
    
    @Inject(method = { "init" }, at = { @At("RETURN") })
    @Inject(method = { "init" }, at = { @At("RETURN") })
    private void Method6718(final CallbackInfo callbackInfo) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Method6779();
    }
    
    @Inject(method = { "runTick" }, at = { @At("HEAD") })
    @Inject(method = { "runTick" }, at = { @At("HEAD") })
    public void Method6719(final CallbackInfo callbackInfo) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)new lykufhPOEnCHuwIMw0o30bjFnsTt0nqG.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf());
    }
    
    @Inject(method = { "runTick" }, at = { @At("RETURN") })
    @Inject(method = { "runTick" }, at = { @At("RETURN") })
    public void Method6720(final CallbackInfo callbackInfo) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)new lykufhPOEnCHuwIMw0o30bjFnsTt0nqG.leqS0IyKEB621E1SrHdAcHHAUjScjmKi());
        if (DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA.Field15191.Method35()) {
            DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA.Field15191.Method20();
        }
    }
    
    @Inject(method = { "processKeyBinds" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/settings/KeyBinding;isKeyDown()Z", shift = At.Shift.BEFORE, ordinal = 2) })
    @Inject(method = { "processKeyBinds" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/settings/KeyBinding;isKeyDown()Z", shift = At.Shift.BEFORE, ordinal = 2) })
    public void Method6721(final CallbackInfo p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokevirtual   lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method35:()Z
        //     6: ifeq            35
        //     9: getstatic       lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16781:Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //    12: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //    15: ifeq            35
        //    18: aload_0        
        //    19: aconst_null    
        //    20: getfield        net/minecraft/client/settings/GameSettings.keyBindAttack:Lnet/minecraft/client/settings/KeyBinding;
        //    23: invokevirtual   net/minecraft/client/settings/KeyBinding.isPressed:()Z
        //    26: ifeq            35
        //    29: invokestatic    lavahack/client/WEiQLLFUQVuGOj7qvqACpofn3o9d8dxK.Method2383:()V
        //    32: goto            18
        //    35: return         
        //    36: getstatic       lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809:Llavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN;
        //    39: invokevirtual   lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method35:()Z
        //    42: ifeq            71
        //    45: getstatic       lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16781:Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //    48: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //    51: ifeq            71
        //    54: aload_0        
        //    55: aconst_null    
        //    56: getfield        net/minecraft/client/settings/GameSettings.keyBindAttack:Lnet/minecraft/client/settings/KeyBinding;
        //    59: invokevirtual   net/minecraft/client/settings/KeyBinding.isPressed:()Z
        //    62: ifeq            71
        //    65: invokestatic    lavahack/client/WEiQLLFUQVuGOj7qvqACpofn3o9d8dxK.Method2383:()V
        //    68: goto            54
        //    71: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0035 (coming from #0026).
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
    
    @Inject(method = { "clickMouse" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "clickMouse" }, at = { @At("HEAD") }, cancellable = true)
    private void Method6722(final CallbackInfo callbackInfo) {
        WEiQLLFUQVuGOj7qvqACpofn3o9d8dxK.Method2383();
        callbackInfo.cancel();
    }
    
    @Inject(method = { "rightClickMouse" }, at = { @At("HEAD") })
    @Inject(method = { "rightClickMouse" }, at = { @At("HEAD") })
    public void Method6723(final CallbackInfo p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokevirtual   lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method35:()Z
        //     6: ifeq            33
        //     9: getstatic       lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16781:Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //    12: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //    15: ifeq            33
        //    18: aload_0        
        //    19: aload_0        
        //    20: aconst_null    
        //    21: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.getIsHittingBlock:()Z
        //    24: putfield        com/kisman/cc/mixin/mixins/MixinMinecraft.Field16137:Z
        //    27: aload_0        
        //    28: aconst_null    
        //    29: iconst_0       
        //    30: putfield        net/minecraft/client/multiplayer/PlayerControllerMP.isHittingBlock:Z
        //    33: return         
        //    34: getstatic       lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809:Llavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN;
        //    37: invokevirtual   lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method35:()Z
        //    40: ifeq            67
        //    43: getstatic       lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16781:Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //    46: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //    49: ifeq            67
        //    52: aload_0        
        //    53: aload_0        
        //    54: aconst_null    
        //    55: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.getIsHittingBlock:()Z
        //    58: putfield        com/kisman/cc/mixin/mixins/MixinMinecraft.Field16137:Z
        //    61: aload_0        
        //    62: aconst_null    
        //    63: iconst_0       
        //    64: putfield        net/minecraft/client/multiplayer/PlayerControllerMP.isHittingBlock:Z
        //    67: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0033 (coming from #0030).
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
    
    @Inject(method = { "rightClickMouse" }, at = { @At("RETURN") })
    @Inject(method = { "rightClickMouse" }, at = { @At("RETURN") })
    public void Method6724(final CallbackInfo p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokevirtual   lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method35:()Z
        //     6: ifeq            35
        //     9: getstatic       lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16781:Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //    12: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //    15: ifeq            35
        //    18: aload_0        
        //    19: aconst_null    
        //    20: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.getIsHittingBlock:()Z
        //    23: ifne            35
        //    26: aload_0        
        //    27: aconst_null    
        //    28: aload_0        
        //    29: getfield        com/kisman/cc/mixin/mixins/MixinMinecraft.Field16137:Z
        //    32: putfield        net/minecraft/client/multiplayer/PlayerControllerMP.isHittingBlock:Z
        //    35: return         
        //    36: getstatic       lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809:Llavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN;
        //    39: invokevirtual   lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method35:()Z
        //    42: ifeq            71
        //    45: getstatic       lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16781:Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //    48: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //    51: ifeq            71
        //    54: aload_0        
        //    55: aconst_null    
        //    56: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.getIsHittingBlock:()Z
        //    59: ifne            71
        //    62: aload_0        
        //    63: aconst_null    
        //    64: aload_0        
        //    65: getfield        com/kisman/cc/mixin/mixins/MixinMinecraft.Field16137:Z
        //    68: putfield        net/minecraft/client/multiplayer/PlayerControllerMP.isHittingBlock:Z
        //    71: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0035 (coming from #0023).
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
    
    @Inject(method = { "sendClickBlockToController" }, at = { @At("HEAD") })
    @Inject(method = { "sendClickBlockToController" }, at = { @At("HEAD") })
    public void Method6725(final boolean p0, final CallbackInfo p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokevirtual   lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method35:()Z
        //     6: ifeq            33
        //     9: getstatic       lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16781:Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //    12: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //    15: ifeq            33
        //    18: aload_0        
        //    19: aload_0        
        //    20: aconst_null    
        //    21: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.isHandActive:()Z
        //    24: putfield        com/kisman/cc/mixin/mixins/MixinMinecraft.Field16136:Z
        //    27: aload_0        
        //    28: aconst_null    
        //    29: iconst_0       
        //    30: putfield        net/minecraft/client/entity/EntityPlayerSP.handActive:Z
        //    33: return         
        //    34: getstatic       lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809:Llavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN;
        //    37: invokevirtual   lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method35:()Z
        //    40: ifeq            67
        //    43: getstatic       lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16781:Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //    46: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //    49: ifeq            67
        //    52: aload_0        
        //    53: aload_0        
        //    54: aconst_null    
        //    55: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.isHandActive:()Z
        //    58: putfield        com/kisman/cc/mixin/mixins/MixinMinecraft.Field16136:Z
        //    61: aload_0        
        //    62: aconst_null    
        //    63: iconst_0       
        //    64: putfield        net/minecraft/client/entity/EntityPlayerSP.handActive:Z
        //    67: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0033 (coming from #0030).
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
    
    @Inject(method = { "sendClickBlockToController" }, at = { @At("RETURN") })
    @Inject(method = { "sendClickBlockToController" }, at = { @At("RETURN") })
    public void Method6726(final boolean p0, final CallbackInfo p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokevirtual   lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method35:()Z
        //     6: ifeq            35
        //     9: getstatic       lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16781:Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //    12: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //    15: ifeq            35
        //    18: aload_0        
        //    19: aconst_null    
        //    20: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.isHandActive:()Z
        //    23: ifne            35
        //    26: aload_0        
        //    27: aconst_null    
        //    28: aload_0        
        //    29: getfield        com/kisman/cc/mixin/mixins/MixinMinecraft.Field16136:Z
        //    32: putfield        net/minecraft/client/entity/EntityPlayerSP.handActive:Z
        //    35: return         
        //    36: getstatic       lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809:Llavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN;
        //    39: invokevirtual   lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method35:()Z
        //    42: ifeq            71
        //    45: getstatic       lavahack/client/gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16781:Llavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
        //    48: invokevirtual   lavahack/client/qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.Method365:()Z
        //    51: ifeq            71
        //    54: aload_0        
        //    55: aconst_null    
        //    56: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.isHandActive:()Z
        //    59: ifne            71
        //    62: aload_0        
        //    63: aconst_null    
        //    64: aload_0        
        //    65: getfield        com/kisman/cc/mixin/mixins/MixinMinecraft.Field16136:Z
        //    68: putfield        net/minecraft/client/entity/EntityPlayerSP.handActive:Z
        //    71: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0035 (coming from #0023).
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
    private void Method6727(final boolean b) {
    }
    
    @Inject(method = { "init" }, at = { @At("RETURN") })
    @Inject(method = { "init" }, at = { @At("RETURN") })
    private void Method6728(final CallbackInfo callbackInfo) {
        BaritoneAPI.getProvider().getPrimaryBaritone();
    }
    
    @Inject(method = { "runTick" }, at = { @At(value = "FIELD", opcode = 180, target = "net/minecraft/client/Minecraft.currentScreen:Lnet/minecraft/client/gui/GuiScreen;", ordinal = 5, shift = At.Shift.BY, by = -3) })
    @Inject(method = { "runTick" }, at = { @At(value = "FIELD", opcode = 180, target = "net/minecraft/client/Minecraft.currentScreen:Lnet/minecraft/client/gui/GuiScreen;", ordinal = 5, shift = At.Shift.BY, by = -3) })
    private void Method6729(final CallbackInfo callbackInfo) {
        final BiFunction nextProvider = TickEvent.createNextProvider();
        for (final IBaritone baritone : BaritoneAPI.getProvider().getAllBaritones()) {
            baritone.getGameEventHandler().onTick((TickEvent)nextProvider.apply(EventState.PRE, (baritone.getPlayerContext().player() != null && baritone.getPlayerContext().world() != null) ? TickEvent.Type.IN : TickEvent.Type.OUT));
        }
    }
    
    @Inject(method = { "loadWorld(Lnet/minecraft/client/multiplayer/WorldClient;Ljava/lang/String;)V" }, at = { @At("HEAD") })
    @Inject(method = { "loadWorld(Lnet/minecraft/client/multiplayer/WorldClient;Ljava/lang/String;)V" }, at = { @At("HEAD") })
    private void Method6730(final WorldClient worldClient, final String s, final CallbackInfo callbackInfo) {
        if (worldClient == null) {
            return;
        }
        BaritoneAPI.getProvider().getPrimaryBaritone().getGameEventHandler().onWorldEvent(new WorldEvent(worldClient, EventState.PRE));
    }
    
    @Inject(method = { "loadWorld(Lnet/minecraft/client/multiplayer/WorldClient;Ljava/lang/String;)V" }, at = { @At("RETURN") })
    @Inject(method = { "loadWorld(Lnet/minecraft/client/multiplayer/WorldClient;Ljava/lang/String;)V" }, at = { @At("RETURN") })
    private void Method6731(final WorldClient worldClient, final String s, final CallbackInfo callbackInfo) {
        BaritoneAPI.getProvider().getPrimaryBaritone().getGameEventHandler().onWorldEvent(new WorldEvent(worldClient, EventState.POST));
    }
    
    @Redirect(method = { "runTick" }, at = @At(value = "FIELD", opcode = 180, target = "net/minecraft/client/gui/GuiScreen.allowUserInput:Z"))
    @Redirect(method = { "runTick" }, at = @At(value = "FIELD", opcode = 180, target = "net/minecraft/client/gui/GuiScreen.allowUserInput:Z"))
    private boolean Method6732(final GuiScreen p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokeinterface baritone/api/IBaritoneProvider.getPrimaryBaritone:()Lbaritone/api/IBaritone;
        //     8: invokeinterface baritone/api/IBaritone.getPathingBehavior:()Lbaritone/api/behavior/IPathingBehavior;
        //    13: invokeinterface baritone/api/behavior/IPathingBehavior.isPathing:()Z
        //    18: ifeq            22
        //    21: aload_0        
        //    22: aload_1        
        //    23: getfield        net/minecraft/client/gui/GuiScreen.allowUserInput:Z
        //    26: ifeq            33
        //    29: iconst_1       
        //    30: goto            34
        //    33: iconst_0       
        //    34: ireturn        
        //    35: invokestatic    baritone/api/BaritoneAPI.getProvider:()Lbaritone/api/IBaritoneProvider;
        //    38: invokeinterface baritone/api/IBaritoneProvider.getPrimaryBaritone:()Lbaritone/api/IBaritone;
        //    43: invokeinterface baritone/api/IBaritone.getPathingBehavior:()Lbaritone/api/behavior/IPathingBehavior;
        //    48: invokeinterface baritone/api/behavior/IPathingBehavior.isPathing:()Z
        //    53: ifeq            57
        //    56: aload_0        
        //    57: aload_1        
        //    58: getfield        net/minecraft/client/gui/GuiScreen.allowUserInput:Z
        //    61: ifeq            68
        //    64: iconst_1       
        //    65: goto            69
        //    68: iconst_0       
        //    69: ireturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0022 (coming from #0021).
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
    
    @Inject(method = { "clickMouse" }, at = { @At(value = "INVOKE", target = "net/minecraft/client/multiplayer/PlayerControllerMP.clickBlock(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z") }, locals = LocalCapture.CAPTURE_FAILHARD)
    @Inject(method = { "clickMouse" }, at = { @At(value = "INVOKE", target = "net/minecraft/client/multiplayer/PlayerControllerMP.clickBlock(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z") }, locals = LocalCapture.CAPTURE_FAILHARD)
    private void Method6733(final CallbackInfo callbackInfo, final BlockPos blockPos) {
        BaritoneAPI.getProvider().getPrimaryBaritone().getGameEventHandler().onBlockInteract(new BlockInteractEvent(blockPos, BlockInteractEvent.Type.START_BREAK));
    }
    
    @Inject(method = { "rightClickMouse" }, at = { @At(value = "INVOKE", target = "net/minecraft/client/entity/EntityPlayerSP.swingArm(Lnet/minecraft/util/EnumHand;)V") }, locals = LocalCapture.CAPTURE_FAILHARD)
    @Inject(method = { "rightClickMouse" }, at = { @At(value = "INVOKE", target = "net/minecraft/client/entity/EntityPlayerSP.swingArm(Lnet/minecraft/util/EnumHand;)V") }, locals = LocalCapture.CAPTURE_FAILHARD)
    private void Method6734(final CallbackInfo callbackInfo, final EnumHand[] array, final int n, final int n2, final EnumHand enumHand, final ItemStack itemStack, final BlockPos blockPos, final int n3, final EnumActionResult enumActionResult) {
        BaritoneAPI.getProvider().getPrimaryBaritone().getGameEventHandler().onBlockInteract(new BlockInteractEvent(blockPos, BlockInteractEvent.Type.USE));
    }
    
    @Inject(method = { "runTickKeyboard" }, at = { @At(value = "INVOKE_ASSIGN", target = "org/lwjgl/input/Keyboard.getEventKeyState()Z", remap = false) })
    @Inject(method = { "runTickKeyboard" }, at = { @At(value = "INVOKE_ASSIGN", target = "org/lwjgl/input/Keyboard.getEventKeyState()Z", remap = false) })
    private void Method6735(final CallbackInfo callbackInfo) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)new w4Aw39jw2Y7noji9TGDOyzX40rFHppel(LW9XsGygL5ez72fpW8b3DmWKe5wNuiTy.Method3906(), LW9XsGygL5ez72fpW8b3DmWKe5wNuiTy.Method3907(), LW9XsGygL5ez72fpW8b3DmWKe5wNuiTy.Method3908()));
    }
    
    @Inject(method = { "runTick" }, at = { @At(value = "FIELD", target = "Lnet/minecraft/client/Minecraft;world:Lnet/minecraft/client/multiplayer/WorldClient;", ordinal = 4, shift = At.Shift.BEFORE) })
    @Inject(method = { "runTick" }, at = { @At(value = "FIELD", target = "Lnet/minecraft/client/Minecraft;world:Lnet/minecraft/client/multiplayer/WorldClient;", ordinal = 4, shift = At.Shift.BEFORE) })
    public void Method6736(final CallbackInfo callbackInfo) {
        if (!xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG.Field8954.Method1262()) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)new w4Aw39jw2Y7noji9TGDOyzX40rFHppel.leqS0IyKEB621E1SrHdAcHHAUjScjmKi());
        }
    }
    
    @Inject(method = { "runTickMouse" }, at = { @At(value = "INVOKE", target = "Lorg/lwjgl/input/Mouse;getEventButton()I", remap = false) })
    @Inject(method = { "runTickMouse" }, at = { @At(value = "INVOKE", target = "Lorg/lwjgl/input/Mouse;getEventButton()I", remap = false) })
    private void Method6737(final CallbackInfo callbackInfo) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)new QSyAD3eZsyQQEeCIIBcGJBEyANEJ87jH(Mouse.getEventButton(), Mouse.getEventButtonState()));
    }
    
    @Inject(method = { "sendClickBlockToController" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "sendClickBlockToController" }, at = { @At("HEAD") }, cancellable = true)
    public void Method6738(final boolean b, final CallbackInfo callbackInfo) {
        final rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC rgo5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC = new rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC(Event.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13746, b);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)rgo5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC);
        if (rgo5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC.Method159()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "sendClickBlockToController" }, at = { @At("RETURN") })
    @Inject(method = { "sendClickBlockToController" }, at = { @At("RETURN") })
    public void Method6739(final boolean b, final CallbackInfo callbackInfo) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)new rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC(Event.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13747, b));
    }
    
    public void Method6103(final boolean b) {
        this.Method6727(b);
    }
}
