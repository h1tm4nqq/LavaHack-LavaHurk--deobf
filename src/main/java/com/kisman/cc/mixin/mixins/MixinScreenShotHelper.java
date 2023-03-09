/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.util.ScreenShotHelper
 *  net.minecraft.util.text.ITextComponent
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Overwrite
 */
package com.kisman.cc.mixin.mixins;

import java.io.File;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.util.ScreenShotHelper;
import net.minecraft.util.text.ITextComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value={ScreenShotHelper.class})
public class MixinScreenShotHelper {
    @Overwrite
    @Overwrite
    public static ITextComponent Method2924(File file, int n, int n2, Framebuffer framebuffer) {
        Framebuffer framebuffer2 = framebuffer;
        int n3 = n2;
        int n4 = n;
        Object var11_7 = null;
        File file2 = file;
        return null;
    }
}

