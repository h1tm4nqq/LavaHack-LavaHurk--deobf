//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import net.minecraft.network.handshake.client.*;
import org.spongepowered.asm.mixin.*;
import net.minecraft.network.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ C00Handshake.class })
public class MixinC00Handshake
{
    @Shadow
    private int Field8266;
    @Shadow
    private int Field8267;
    @Shadow
    private String Field8268;
    @Shadow
    private EnumConnectionState Field8269;
    
    @Inject(method = { "writePacketData" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "writePacketData" }, at = { @At("HEAD") }, cancellable = true)
    public void Method727(final PacketBuffer p0, final CallbackInfo p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokevirtual   lavahack/client/u9kGXFVhQps9BrHnQCrZ1KqnK0luH7By.Method35:()Z
        //     6: ifeq            44
        //     9: aload_2        
        //    10: invokevirtual   org/spongepowered/asm/mixin/injection/callback/CallbackInfo.cancel:()V
        //    13: aload_1        
        //    14: aload_0        
        //    15: iconst_0       
        //    16: invokevirtual   net/minecraft/network/PacketBuffer.writeVarInt:(I)Lnet/minecraft/network/PacketBuffer;
        //    19: pop            
        //    20: aload_1        
        //    21: aload_0        
        //    22: aconst_null    
        //    23: invokevirtual   net/minecraft/network/PacketBuffer.writeString:(Ljava/lang/String;)Lnet/minecraft/network/PacketBuffer;
        //    26: pop            
        //    27: aload_1        
        //    28: aload_0        
        //    29: iconst_0       
        //    30: invokevirtual   net/minecraft/network/PacketBuffer.writeShort:(I)Lio/netty/buffer/ByteBuf;
        //    33: pop            
        //    34: aload_1        
        //    35: aload_0        
        //    36: aconst_null    
        //    37: invokevirtual   net/minecraft/network/EnumConnectionState.getId:()I
        //    40: invokevirtual   net/minecraft/network/PacketBuffer.writeVarInt:(I)Lnet/minecraft/network/PacketBuffer;
        //    43: pop            
        //    44: return         
        //    45: getstatic       lavahack/client/u9kGXFVhQps9BrHnQCrZ1KqnK0luH7By.Field13139:Llavahack/client/u9kGXFVhQps9BrHnQCrZ1KqnK0luH7By;
        //    48: invokevirtual   lavahack/client/u9kGXFVhQps9BrHnQCrZ1KqnK0luH7By.Method35:()Z
        //    51: ifeq            89
        //    54: aload_2        
        //    55: invokevirtual   org/spongepowered/asm/mixin/injection/callback/CallbackInfo.cancel:()V
        //    58: aload_1        
        //    59: aload_0        
        //    60: iconst_0       
        //    61: invokevirtual   net/minecraft/network/PacketBuffer.writeVarInt:(I)Lnet/minecraft/network/PacketBuffer;
        //    64: pop            
        //    65: aload_1        
        //    66: aload_0        
        //    67: aconst_null    
        //    68: invokevirtual   net/minecraft/network/PacketBuffer.writeString:(Ljava/lang/String;)Lnet/minecraft/network/PacketBuffer;
        //    71: pop            
        //    72: aload_1        
        //    73: aload_0        
        //    74: iconst_0       
        //    75: invokevirtual   net/minecraft/network/PacketBuffer.writeShort:(I)Lio/netty/buffer/ByteBuf;
        //    78: pop            
        //    79: aload_1        
        //    80: aload_0        
        //    81: aconst_null    
        //    82: invokevirtual   net/minecraft/network/EnumConnectionState.getId:()I
        //    85: invokevirtual   net/minecraft/network/PacketBuffer.writeVarInt:(I)Lnet/minecraft/network/PacketBuffer;
        //    88: pop            
        //    89: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0044 (coming from #0043).
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
