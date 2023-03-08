//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import net.minecraft.client.multiplayer.*;
import net.minecraft.world.*;
import net.minecraft.client.*;
import net.minecraft.client.network.*;
import net.minecraft.entity.player.*;
import org.spongepowered.asm.mixin.injection.*;
import net.minecraft.util.math.*;
import net.minecraft.util.*;
import com.kisman.cc.event.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import lavahack.client.*;

@Mixin(value = { PlayerControllerMP.class }, priority = 10000)
public class MixinPlayerControllerMP
{
    @Shadow
    public GameType Field11039;
    @Shadow
    @Final
    public Minecraft Field11040;
    @Shadow
    public int Field11041;
    @Shadow
    @Final
    public NetHandlerPlayClient Field11042;
    
    @Overwrite
    @Overwrite
    public void Method2980() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aconst_null    
        //     2: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //     5: getfield        net/minecraft/client/entity/EntityPlayerSP.inventory:Lnet/minecraft/entity/player/InventoryPlayer;
        //     8: getfield        net/minecraft/entity/player/InventoryPlayer.currentItem:I
        //    11: istore_1       
        //    12: iload_1        
        //    13: aload_0        
        //    14: getfield        com/kisman/cc/mixin/mixins/MixinPlayerControllerMP.Field11041:I
        //    17: if_icmpeq       41
        //    20: aload_0        
        //    21: iload_1        
        //    22: putfield        com/kisman/cc/mixin/mixins/MixinPlayerControllerMP.Field11041:I
        //    25: aload_0        
        //    26: aconst_null    
        //    27: new             Lnet/minecraft/network/play/client/CPacketHeldItemChange;
        //    30: dup            
        //    31: aload_0        
        //    32: getfield        com/kisman/cc/mixin/mixins/MixinPlayerControllerMP.Field11041:I
        //    35: invokespecial   net/minecraft/network/play/client/CPacketHeldItemChange.<init>:(I)V
        //    38: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.sendPacket:(Lnet/minecraft/network/Packet;)V
        //    41: goto            45
        //    44: astore_1       
        //    45: return         
        //    46: aload_0        
        //    47: aconst_null    
        //    48: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    51: getfield        net/minecraft/client/entity/EntityPlayerSP.inventory:Lnet/minecraft/entity/player/InventoryPlayer;
        //    54: getfield        net/minecraft/entity/player/InventoryPlayer.currentItem:I
        //    57: istore_1       
        //    58: iload_1        
        //    59: aload_0        
        //    60: getfield        com/kisman/cc/mixin/mixins/MixinPlayerControllerMP.Field11041:I
        //    63: if_icmpeq       87
        //    66: aload_0        
        //    67: iload_1        
        //    68: putfield        com/kisman/cc/mixin/mixins/MixinPlayerControllerMP.Field11041:I
        //    71: aload_0        
        //    72: aconst_null    
        //    73: new             Lnet/minecraft/network/play/client/CPacketHeldItemChange;
        //    76: dup            
        //    77: aload_0        
        //    78: getfield        com/kisman/cc/mixin/mixins/MixinPlayerControllerMP.Field11041:I
        //    81: invokespecial   net/minecraft/network/play/client/CPacketHeldItemChange.<init>:(I)V
        //    84: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.sendPacket:(Lnet/minecraft/network/Packet;)V
        //    87: goto            91
        //    90: astore_1       
        //    91: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0041 (coming from #0038).
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
    
    @Inject(method = { "getBlockReachDistance" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "getBlockReachDistance" }, at = { @At("HEAD") }, cancellable = true)
    public void Method2981(final CallbackInfoReturnable callbackInfoReturnable) {
        final float n = (float)null.player.getEntityAttribute(EntityPlayer.REACH_DISTANCE).getAttributeValue();
        final vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3 vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3 = new(lavahack.client.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.class);
        super(null.isCreative() ? n : (n - 0.5f));
        final vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3 vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt4 = vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt4);
        callbackInfoReturnable.setReturnValue((Object)vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt4.Method4022());
    }
    
    @Inject(method = { "clickBlock" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "clickBlock" }, at = { @At("HEAD") }, cancellable = true)
    private void Method2982(final BlockPos blockPos, final EnumFacing enumFacing, final CallbackInfoReturnable callbackInfoReturnable) {
        final t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r = new t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r(blockPos, enumFacing);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r);
        if (t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r.Method159()) {
            callbackInfoReturnable.setReturnValue((Object)false);
            callbackInfoReturnable.cancel();
        }
    }
    
    @Inject(method = { "onPlayerDestroyBlock" }, at = { @At(value = "INVOKE", target = "net/minecraft/block/Block.removedByPlayer(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/EntityPlayer;Z)Z", remap = false) }, cancellable = true)
    @Inject(method = { "onPlayerDestroyBlock" }, at = { @At(value = "INVOKE", target = "net/minecraft/block/Block.removedByPlayer(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/EntityPlayer;Z)Z", remap = false) }, cancellable = true)
    @Dynamic
    @Dynamic
    private void Method2983(final BlockPos blockPos, final CallbackInfoReturnable callbackInfoReturnable) {
        final UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = new UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(Event.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13746, blockPos);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
        if (uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method159()) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }
    
    @Inject(method = { "onPlayerDamageBlock" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "onPlayerDamageBlock" }, at = { @At("HEAD") }, cancellable = true)
    private void Method2984(final BlockPos blockPos, final EnumFacing enumFacing, final CallbackInfoReturnable callbackInfoReturnable) {
        final ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = new ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(blockPos, enumFacing);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
        if (uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method159()) {
            callbackInfoReturnable.setReturnValue((Object)true);
            callbackInfoReturnable.cancel();
        }
    }
    
    @Inject(method = { "onPlayerDamageBlock" }, at = { @At("RETURN") })
    @Inject(method = { "onPlayerDamageBlock" }, at = { @At("RETURN") })
    private void Method2985(final BlockPos blockPos, final EnumFacing enumFacing, final CallbackInfoReturnable callbackInfoReturnable) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)new ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(blockPos, enumFacing));
    }
    
    @Inject(method = { "onPlayerDamageBlock" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/PlayerControllerMP;syncCurrentPlayItem()V", shift = At.Shift.AFTER) }, cancellable = true)
    @Inject(method = { "onPlayerDamageBlock" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/PlayerControllerMP;syncCurrentPlayItem()V", shift = At.Shift.AFTER) }, cancellable = true)
    private void Method2986(final BlockPos blockPos, final EnumFacing enumFacing, final CallbackInfoReturnable callbackInfoReturnable) {
        final ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy.leqS0IyKEB621E1SrHdAcHHAUjScjmKi leqS0IyKEB621E1SrHdAcHHAUjScjmKi = new ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos, enumFacing);
        lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
        if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method159()) {
            callbackInfoReturnable.setReturnValue((Object)true);
            callbackInfoReturnable.cancel();
        }
    }
    
    @Inject(method = { "onStoppedUsingItem" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "onStoppedUsingItem" }, at = { @At("HEAD") }, cancellable = true)
    private void Method2987(final EntityPlayer entityPlayer, final CallbackInfo callbackInfo) {
        final N82MBXUneZSZavqWLI2PFR4ZibcXUwaI n82MBXUneZSZavqWLI2PFR4ZibcXUwaI = new N82MBXUneZSZavqWLI2PFR4ZibcXUwaI(entityPlayer);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)n82MBXUneZSZavqWLI2PFR4ZibcXUwaI);
        if (n82MBXUneZSZavqWLI2PFR4ZibcXUwaI.Method159()) {
            callbackInfo.cancel();
        }
    }
}
