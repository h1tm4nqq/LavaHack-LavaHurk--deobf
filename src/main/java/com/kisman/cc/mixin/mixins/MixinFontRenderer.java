//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import net.minecraft.client.gui.*;
import org.spongepowered.asm.mixin.*;
import java.util.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ FontRenderer.class })
public class MixinFontRenderer
{
    private final String Field11420 = "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0451\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8?\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1???ом???л╗\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u0410\u0411\u0412\u0413\u0414\u0415\u0416\u0417\u0418\u0419\u041a\u041b\u041c\u041d\u041e\u041f\u0420\u0421\u0422\u0423\u0424\u0425\u0426\u0427\u0428\u0429\u042a\u042b\u042c\u042d\u042e\u042f\u0430\u0431\u0432\u0433\u0434\u0435\u0436\u0437\u0438\u0439\u043a\u043b\u043c\u043d\u043e\u043f\u0440\u0441\u0442\u0443\u0444\u0445\u0446\u0447\u0448\u0449\u044a\u044b\u044c\u044d\u044e\u044f";
    private final String Field11421 = "textures/font/ascii_fat.png";
    @Shadow
    private boolean Field11422;
    @Shadow
    @Final
    protected int[] Field11423;
    @Shadow
    @Final
    protected byte[] Field11424;
    @Shadow
    @Final
    private int[] Field11425;
    @Shadow
    private int Field11426;
    @Shadow
    private boolean Field11427;
    @Shadow
    private boolean Field11428;
    @Shadow
    private boolean Field11429;
    @Shadow
    private boolean Field11430;
    @Shadow
    private boolean Field11431;
    @Shadow
    private float Field11432;
    @Shadow
    private float Field11433;
    @Shadow
    private float Field11434;
    @Shadow
    private float Field11435;
    @Shadow
    public Random Field11436;
    @Shadow
    protected float Field11437;
    @Shadow
    protected float Field11438;
    
    @Shadow
    @Shadow
    protected void Method3391() {
    }
    
    @Shadow
    @Shadow
    private void Method3392() {
    }
    
    @Shadow
    @Shadow
    private int Method3393(final String s, final float n, final float n2, final int n3, final boolean b) {
        return 0;
    }
    
    @Shadow
    @Shadow
    protected float Method3394(final int n, final boolean b) {
        return 0.0f;
    }
    
    @Shadow
    @Shadow
    protected float Method3395(final char c, final boolean b) {
        return 0.0f;
    }
    
    @Shadow
    @Shadow
    protected void Method3396(final float n, final float n2, final float n3, final float n4) {
    }
    
    @Shadow
    @Shadow
    public int Method3397(final char c) {
        return 0;
    }
    
    @Shadow
    @Shadow
    private float Method3398(final char c, final boolean b) {
        return 0.0f;
    }
    
    @Shadow
    @Shadow
    protected void Method3399(final float n) {
    }
    
    @Inject(method = { "drawString(Ljava/lang/String;FFIZ)I" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "drawString(Ljava/lang/String;FFIZ)I" }, at = { @At("HEAD") }, cancellable = true)
    private void Method3400(final String s, final float n, final float n2, final int n3, final boolean b, final CallbackInfoReturnable callbackInfoReturnable) {
        if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254 != null) {
            final String method4564 = zHQdBPjO1BAjzEfjRnBTbQ7HFpoZ8zpS.Field13034.Method4564(s);
            final boolean method4565 = TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Field16200.Method6746().Method365();
            this.Method3391();
            this.Method3392();
            if (b) {
                callbackInfoReturnable.setReturnValue((Object)Math.max(this.Method3393(method4564, n + (method4565 ? TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Field16200.Method6747().Method368() : 1.0f), n2 + (method4565 ? TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Field16200.Method6748().Method368() : 1.0f), n3, true), this.Method3393(method4564, n, n2, n3, false)));
                callbackInfoReturnable.cancel();
            }
        }
    }
}
