//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.accessor;

import org.spongepowered.asm.mixin.*;
import net.minecraft.network.*;
import java.util.*;
import org.spongepowered.asm.mixin.gen.*;

@Mixin({ EnumConnectionState.class })
public interface AccessorEnumConnectionState
{
    @Accessor("directionMaps")
    @Accessor("directionMaps")
    Map Method1048();
}
