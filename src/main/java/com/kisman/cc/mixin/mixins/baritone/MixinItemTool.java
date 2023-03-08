//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.baritone;

import baritone.utils.accessor.*;
import net.minecraft.item.*;
import org.spongepowered.asm.mixin.*;

@Mixin({ ItemTool.class })
public class MixinItemTool implements IItemTool
{
    @Shadow
    protected Item.ToolMaterial Field15123;
    
    public int getHarvestLevel() {
        return null.getHarvestLevel();
    }
}
