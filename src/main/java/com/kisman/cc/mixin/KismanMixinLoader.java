//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin;

import net.minecraftforge.fml.relauncher.*;
import org.spongepowered.asm.launch.*;
import org.spongepowered.asm.mixin.*;
import javax.annotation.*;
import java.util.*;

@IFMLLoadingPlugin.Name("kys")
@IFMLLoadingPlugin.MCVersion("1.12.2")
public class KismanMixinLoader implements IFMLLoadingPlugin
{
    public KismanMixinLoader() {
        MixinBootstrap.init();
        Mixins.addConfiguration("mixins.Kisman.json");
        MixinEnvironment.getDefaultEnvironment().setObfuscationContext("searge");
    }
    
    public String[] getASMTransformerClass() {
        return new String[0];
    }
    
    public String getModContainerClass() {
        return null;
    }
    
    @Nullable
    @Nullable
    public String getSetupClass() {
        return null;
    }
    
    public void injectData(final Map map) {
    }
    
    public String getAccessTransformerClass() {
        return null;
    }
}
