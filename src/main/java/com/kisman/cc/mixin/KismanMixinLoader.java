/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.relauncher.IFMLLoadingPlugin
 *  net.minecraftforge.fml.relauncher.IFMLLoadingPlugin$MCVersion
 *  net.minecraftforge.fml.relauncher.IFMLLoadingPlugin$Name
 *  org.spongepowered.asm.launch.MixinBootstrap
 *  org.spongepowered.asm.mixin.MixinEnvironment
 *  org.spongepowered.asm.mixin.Mixins
 */
package com.kisman.cc.mixin;

import java.util.Map;
import javax.annotation.Nullable;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.Mixins;

@IFMLLoadingPlugin.Name(value="kys")
@IFMLLoadingPlugin.MCVersion(value="1.12.2")
public class KismanMixinLoader
implements IFMLLoadingPlugin {
    public KismanMixinLoader() {
        MixinBootstrap.init();
        Mixins.addConfiguration((String)"mixins.Kisman.json");
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

    public void injectData(Map map) {
    }

    public String getAccessTransformerClass() {
        return null;
    }
}

