/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI
 *  lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  lavahack.client.zHQdBPjO1BAjzEfjRnBTbQ7HFpoZ8zpS
 *  net.minecraft.client.gui.FontRenderer
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.kisman.cc.mixin.mixins;

import java.util.Random;
import lavahack.client.TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.zHQdBPjO1BAjzEfjRnBTbQ7HFpoZ8zpS;
import net.minecraft.client.gui.FontRenderer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={FontRenderer.class})
public class MixinFontRenderer {
    private final String Field11420 = "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0451\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8\u00a3\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1\u00aa\u00ba\u00bf\u00ae\u00ac\u00bd\u00bc\u00a1\u00ab\u00bb\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u0410\u0411\u0412\u0413\u0414\u0415\u0416\u0417\u0418\u0419\u041a\u041b\u041c\u041d\u041e\u041f\u0420\u0421\u0422\u0423\u0424\u0425\u0426\u0427\u0428\u0429\u042a\u042b\u042c\u042d\u042e\u042f\u0430\u0431\u0432\u0433\u0434\u0435\u0436\u0437\u0438\u0439\u043a\u043b\u043c\u043d\u043e\u043f\u0440\u0441\u0442\u0443\u0444\u0445\u0446\u0447\u0448\u0449\u044a\u044b\u044c\u044d\u044e\u044f";
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
    private int Method3393(String string, float f, float f2, int n, boolean bl) {
        return 0;
    }

    @Shadow
    @Shadow
    protected float Method3394(int n, boolean bl) {
        return 0.0f;
    }

    @Shadow
    @Shadow
    protected float Method3395(char c, boolean bl) {
        return 0.0f;
    }

    @Shadow
    @Shadow
    protected void Method3396(float f, float f2, float f3, float f4) {
    }

    @Shadow
    @Shadow
    public int Method3397(char c) {
        return 0;
    }

    @Shadow
    @Shadow
    private float Method3398(char c, boolean bl) {
        return 0.0f;
    }

    @Shadow
    @Shadow
    protected void Method3399(float f) {
    }

    @Inject(method={"drawString(Ljava/lang/String;FFIZ)I"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"drawString(Ljava/lang/String;FFIZ)I"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method3400(String string, float f, float f2, int n, boolean bl, CallbackInfoReturnable callbackInfoReturnable) {
        if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254 == null) return;
        String string2 = zHQdBPjO1BAjzEfjRnBTbQ7HFpoZ8zpS.Field13034.Method4564(string);
        boolean bl2 = TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Field16200.Method6746().Method365();
        this.Method3391();
        this.Method3392();
        if (!bl) return;
        callbackInfoReturnable.setReturnValue((Object)Math.max(this.Method3393(string2, f + (bl2 ? TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Field16200.Method6747().Method368() : 1.0f), f2 + (bl2 ? TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Field16200.Method6748().Method368() : 1.0f), n, true), this.Method3393(string2, f, f2, n, false)));
        callbackInfoReturnable.cancel();
    }
}

