//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.kisman.cc.event.Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  lavahack.client.ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
 *  lavahack.client.ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
 *  lavahack.client.ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  lavahack.client.N82MBXUneZSZavqWLI2PFR4ZibcXUwaI
 *  lavahack.client.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
 *  lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  lavahack.client.t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r
 *  lavahack.client.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.multiplayer.PlayerControllerMP
 *  net.minecraft.client.network.NetHandlerPlayClient
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.GameType
 *  org.spongepowered.asm.mixin.Dynamic
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Overwrite
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.kisman.cc.mixin.mixins;

import com.kisman.cc.event.Event;
import lavahack.client.ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy;
import lavahack.client.N82MBXUneZSZavqWLI2PFR4ZibcXUwaI;
import lavahack.client.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r;
import lavahack.client.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameType;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={PlayerControllerMP.class}, priority=10000)
public class MixinPlayerControllerMP {
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

    /*
     * Exception decompiling
     */
    @Overwrite
    @Overwrite
    public void Method2980() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl22 : GOTO - null : trying to set 1 previously set to 2
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.populateStackInfo(Op02WithProcessedDataAndRefs.java:207)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.populateStackInfo(Op02WithProcessedDataAndRefs.java:1559)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:434)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at the.bytecode.club.bytecodeviewer.decompilers.impl.CFRDecompiler.decompileToZip(CFRDecompiler.java:306)
         *     at the.bytecode.club.bytecodeviewer.resources.ResourceDecompiling.decompileSaveAll(ResourceDecompiling.java:262)
         *     at the.bytecode.club.bytecodeviewer.resources.ResourceDecompiling.lambda$decompileSaveAll$0(ResourceDecompiling.java:127)
         *     at java.base/java.lang.Thread.run(Thread.java:833)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Inject(method={"getBlockReachDistance"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"getBlockReachDistance"}, at={@At(value="HEAD")}, cancellable=true)
    public void Method2981(CallbackInfoReturnable callbackInfoReturnable) {
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3 vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt32;
        MixinPlayerControllerMP mixinPlayerControllerMP = this;
        float f = (float)null.player.getEntityAttribute(EntityPlayer.REACH_DISTANCE).getAttributeValue();
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3 vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt33 = vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt32;
        this(null.isCreative() ? f : f - 0.5f);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3 vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt34 = vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt32;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt34);
        callbackInfoReturnable.setReturnValue((Object)Float.valueOf(vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt34.Method4022()));
    }

    @Inject(method={"clickBlock"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"clickBlock"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method2982(BlockPos blockPos, EnumFacing enumFacing, CallbackInfoReturnable callbackInfoReturnable) {
        t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r2 = new t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r(blockPos, enumFacing);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r2);
        if (!t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r2.Method159()) return;
        callbackInfoReturnable.setReturnValue((Object)false);
        callbackInfoReturnable.cancel();
    }

    @Inject(method={"onPlayerDestroyBlock"}, at={@At(value="INVOKE", target="net/minecraft/block/Block.removedByPlayer(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/EntityPlayer;Z)Z", remap=false)}, cancellable=true)
    @Inject(method={"onPlayerDestroyBlock"}, at={@At(value="INVOKE", target="net/minecraft/block/Block.removedByPlayer(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/EntityPlayer;Z)Z", remap=false)}, cancellable=true)
    @Dynamic
    @Dynamic
    private void Method2983(BlockPos blockPos, CallbackInfoReturnable callbackInfoReturnable) {
        UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = new UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(Event.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13746, blockPos);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
        if (!uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method159()) return;
        callbackInfoReturnable.setReturnValue((Object)false);
    }

    @Inject(method={"onPlayerDamageBlock"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"onPlayerDamageBlock"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method2984(BlockPos blockPos, EnumFacing enumFacing, CallbackInfoReturnable callbackInfoReturnable) {
        ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = new ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(blockPos, enumFacing);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
        if (!uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method159()) return;
        callbackInfoReturnable.setReturnValue((Object)true);
        callbackInfoReturnable.cancel();
    }

    @Inject(method={"onPlayerDamageBlock"}, at={@At(value="RETURN")})
    @Inject(method={"onPlayerDamageBlock"}, at={@At(value="RETURN")})
    private void Method2985(BlockPos blockPos, EnumFacing enumFacing, CallbackInfoReturnable callbackInfoReturnable) {
        ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf ylFSugLHQAjzunVBKfamPjSRsvHTy3jf = new ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(blockPos, enumFacing);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)ylFSugLHQAjzunVBKfamPjSRsvHTy3jf);
    }

    @Inject(method={"onPlayerDamageBlock"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/multiplayer/PlayerControllerMP;syncCurrentPlayItem()V", shift=At.Shift.AFTER)}, cancellable=true)
    @Inject(method={"onPlayerDamageBlock"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/multiplayer/PlayerControllerMP;syncCurrentPlayItem()V", shift=At.Shift.AFTER)}, cancellable=true)
    private void Method2986(BlockPos blockPos, EnumFacing enumFacing, CallbackInfoReturnable callbackInfoReturnable) {
        ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy.leqS0IyKEB621E1SrHdAcHHAUjScjmKi leqS0IyKEB621E1SrHdAcHHAUjScjmKi2 = new ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos, enumFacing);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)leqS0IyKEB621E1SrHdAcHHAUjScjmKi2);
        if (!leqS0IyKEB621E1SrHdAcHHAUjScjmKi2.Method159()) return;
        callbackInfoReturnable.setReturnValue((Object)true);
        callbackInfoReturnable.cancel();
    }

    @Inject(method={"onStoppedUsingItem"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"onStoppedUsingItem"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method2987(EntityPlayer entityPlayer, CallbackInfo callbackInfo) {
        N82MBXUneZSZavqWLI2PFR4ZibcXUwaI n82MBXUneZSZavqWLI2PFR4ZibcXUwaI = new N82MBXUneZSZavqWLI2PFR4ZibcXUwaI(entityPlayer);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)n82MBXUneZSZavqWLI2PFR4ZibcXUwaI);
        if (!n82MBXUneZSZavqWLI2PFR4ZibcXUwaI.Method159()) return;
        callbackInfo.cancel();
    }
}

