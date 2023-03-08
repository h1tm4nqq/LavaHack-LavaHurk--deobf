//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import net.minecraft.util.*;
import java.io.*;
import net.minecraft.client.shader.*;
import net.minecraft.util.text.*;
import org.spongepowered.asm.mixin.*;

@Mixin({ ScreenShotHelper.class })
public class MixinScreenShotHelper
{
    @Overwrite
    @Overwrite
    public static ITextComponent Method2924(final File file, final int n, final int n2, final Framebuffer framebuffer) {
        return null;
    }
}
