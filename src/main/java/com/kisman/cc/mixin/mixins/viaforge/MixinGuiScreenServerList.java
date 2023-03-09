//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D
 *  lavahack.client.HnCeArMwqlA5KPZf75D1d92lhv5QGxpA
 *  lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj
 *  lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.GuiScreenServerList
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins.viaforge;

import lavahack.client.FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D;
import lavahack.client.HnCeArMwqlA5KPZf75D1d92lhv5QGxpA;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiScreenServerList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GuiScreenServerList.class})
public class MixinGuiScreenServerList
extends GuiScreen {
    @Inject(method={"initGui"}, at={@At(value="RETURN")})
    @Inject(method={"initGui"}, at={@At(value="RETURN")})
    public void injectInitGui(CallbackInfo callbackInfo) {
        this.buttonList.add(new GuiButton(1337, 5, 6, 98, 20, HnCeArMwqlA5KPZf75D1d92lhv5QGxpA.Method7470((int)FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D.Method7320().Method7330()).getName()));
    }

    @Inject(method={"actionPerformed"}, at={@At(value="RETURN")})
    @Inject(method={"actionPerformed"}, at={@At(value="RETURN")})
    public void injectActionPerformed(GuiButton guiButton, CallbackInfo callbackInfo) {
        if (guiButton.id != 1337) return;
        this.mc.displayGuiScreen((GuiScreen)leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16266.Method1236((GuiScreen)this));
    }

    @Inject(method={"drawScreen"}, at={@At(value="RETURN")})
    @Inject(method={"drawScreen"}, at={@At(value="RETURN")})
    public void injectDrawScreen(int n, int n2, float f, CallbackInfo callbackInfo) {
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745((String)"<-- Current Version", (double)104.0, (double)13.0, (int)-1);
    }
}

