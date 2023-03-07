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
import lavahack.client.hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.profiler.Profiler;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.storage.WorldInfo;
import org.jetbrains.annotations.NotNull;

public class HqWwdjUPEx3jgiXgw8GSblRx7afa9Rhg
extends WorldClient {
    private final Map Field15318 = new HashMap();
    private final WorldClient Field15319;
    private String Field15320 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public HqWwdjUPEx3jgiXgw8GSblRx7afa9Rhg(NetHandlerPlayClient netHandlerPlayClient, WorldSettings worldSettings, int n, EnumDifficulty enumDifficulty, Profiler profiler) {
        super(netHandlerPlayClient, worldSettings, n, enumDifficulty, profiler);
        this.Field15319 = null;
    }

    public HqWwdjUPEx3jgiXgw8GSblRx7afa9Rhg(WorldClient worldClient) {
        super(worldClient.connection, HqWwdjUPEx3jgiXgw8GSblRx7afa9Rhg.getWorldSettingFromWorld(worldClient), worldClient.provider.getDimension(), worldClient.getDifficulty(), worldClient.profiler);
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

    public void override(String string, hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs2) {
        this.Field15318.put(string, hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs2);
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
        Object[] objectArray = new Object[(int)-431669388L ^ 0xE6453F75];
        objectArray[(int)((long)1493695399 ^ (long)1493695399)] = blockPos;
        return (IBlockState)((hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs)this.Field15318.get("getBlockState")).Method1726(objectArray);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)766925 ^ (long)766925);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1745960709 ^ (long)1745960954);
            int n2 = (int)((long)1567120404 ^ (long)1567120403) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1116172010 ^ (long)1116172211) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

