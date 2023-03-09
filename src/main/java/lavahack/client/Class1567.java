//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.network.NetHandlerPlayClient
 *  net.minecraft.profiler.Profiler
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.EnumDifficulty
 *  net.minecraft.world.WorldSettings
 *  net.minecraft.world.storage.WorldInfo
 */
package lavahack.client;

import java.util.HashMap;
import java.util.Map;
import lavahack.client.Class1763;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.profiler.Profiler;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.storage.WorldInfo;
import org.jetbrains.annotations.NotNull;

public class Class1567
extends WorldClient {
    private final Map Field15318 = new HashMap();
    private final WorldClient Field15319;
    private String Field15320 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1567(NetHandlerPlayClient netHandlerPlayClient, WorldSettings worldSettings, int n, EnumDifficulty enumDifficulty, Profiler profiler) {
        super(netHandlerPlayClient, worldSettings, n, enumDifficulty, profiler);
        this.Field15319 = null;
    }

    public Class1567(WorldClient worldClient) {
        super(worldClient.connection, Class1567.getWorldSettingFromWorld(worldClient), worldClient.provider.getDimension(), worldClient.getDifficulty(), worldClient.profiler);
        this.Field15319 = worldClient;
    }

    private static WorldSettings getWorldSettingFromWorld(WorldClient worldClient) {
        WorldInfo worldInfo = worldClient.getWorldInfo();
        WorldSettings worldSettings = new WorldSettings(worldInfo.getSeed(), worldInfo.getGameType(), worldInfo.isMapFeaturesEnabled(), worldInfo.isHardcoreModeEnabled(), worldInfo.getTerrainType());
        worldSettings.setGeneratorOptions(worldInfo.getGeneratorOptions());
        if (!worldInfo.areCommandsAllowed()) return worldSettings;
        worldSettings.enableCommands();
        return worldSettings;
    }

    public void override(String string, Class1763 class1763) {
        this.Field15318.put(string, class1763);
    }

    public void toDefault(String string) {
        this.Field15318.remove(string);
    }

    public WorldClient getOriginal() {
        return this.Field15319;
    }

    @NotNull
    @NotNull
    public IBlockState getBlockState(@NotNull @NotNull BlockPos blockPos) {
        if (!this.Field15318.containsKey("getBlockState")) return super.getBlockState(blockPos);
        return (IBlockState)((Class1763)this.Field15318.get("getBlockState")).Method1726(blockPos);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 14;
            cArray2[n] = (char)(cArray[n] ^ (0x1590 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

