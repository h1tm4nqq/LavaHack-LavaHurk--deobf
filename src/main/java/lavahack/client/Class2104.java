//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcp.MethodsReturnNonnullByDefault
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.world.MinecraftException
 *  net.minecraft.world.WorldProvider
 *  net.minecraft.world.chunk.storage.IChunkLoader
 *  net.minecraft.world.gen.structure.template.TemplateManager
 *  net.minecraft.world.storage.IPlayerFileData
 *  net.minecraft.world.storage.ISaveHandler
 *  net.minecraft.world.storage.WorldInfo
 */
package lavahack.client;

import java.io.File;
import javax.annotation.ParametersAreNonnullByDefault;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.MinecraftException;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.storage.IChunkLoader;
import net.minecraft.world.gen.structure.template.TemplateManager;
import net.minecraft.world.storage.IPlayerFileData;
import net.minecraft.world.storage.ISaveHandler;
import net.minecraft.world.storage.WorldInfo;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class Class2104
implements ISaveHandler {
    private int Field17585;

    public WorldInfo loadWorldInfo() {
        return null;
    }

    public void checkSessionLock() throws MinecraftException {
    }

    public IChunkLoader getChunkLoader(WorldProvider worldProvider) {
        return null;
    }

    public void saveWorldInfoWithPlayer(WorldInfo worldInfo, NBTTagCompound nBTTagCompound) {
    }

    public void saveWorldInfo(WorldInfo worldInfo) {
    }

    public IPlayerFileData getPlayerNBTManager() {
        return null;
    }

    public void flush() {
    }

    public File getWorldDirectory() {
        return null;
    }

    public File getMapFileFromName(String string) {
        return null;
    }

    public TemplateManager getStructureTemplateManager() {
        return null;
    }
}

