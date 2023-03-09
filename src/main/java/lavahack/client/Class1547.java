//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  net.minecraft.client.ClientBrandRetriever
 *  net.minecraft.client.Minecraft
 *  net.minecraft.command.ServerCommandManager
 *  net.minecraft.crash.CrashReport
 *  net.minecraft.profiler.Snooper
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.server.management.PlayerProfileCache
 *  net.minecraft.util.Util
 *  net.minecraft.world.EnumDifficulty
 *  net.minecraft.world.GameType
 *  net.minecraft.world.IWorldEventListener
 *  net.minecraft.world.ServerWorldEventHandler
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldServer
 *  net.minecraft.world.WorldServerDemo
 *  net.minecraft.world.WorldServerMulti
 *  net.minecraft.world.WorldSettings
 *  net.minecraft.world.WorldType
 *  net.minecraft.world.storage.ISaveHandler
 *  net.minecraft.world.storage.WorldInfo
 *  net.minecraftforge.common.DimensionManager
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.event.world.WorldEvent$Load
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.eventhandler.Event
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.apache.logging.log4j.Logger
 */
package lavahack.client;

import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.FutureTask;
import lavahack.client.Class1359;
import lavahack.client.Class1796;
import net.minecraft.client.ClientBrandRetriever;
import net.minecraft.client.Minecraft;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.crash.CrashReport;
import net.minecraft.profiler.Snooper;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.PlayerProfileCache;
import net.minecraft.util.Util;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.GameType;
import net.minecraft.world.IWorldEventListener;
import net.minecraft.world.ServerWorldEventHandler;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.WorldServerDemo;
import net.minecraft.world.WorldServerMulti;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.WorldType;
import net.minecraft.world.storage.ISaveHandler;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

@SideOnly(value=Side.CLIENT)
public class Class1547
extends MinecraftServer {
    private static final Minecraft Field15220 = Minecraft.getMinecraft();
    private final WorldSettings Field15221;
    public boolean Field15222 = false;
    private boolean Field15223;
    private int Field15224;

    public Class1547(Minecraft minecraft, WorldSettings worldSettings, YggdrasilAuthenticationService yggdrasilAuthenticationService, MinecraftSessionService minecraftSessionService, GameProfileRepository gameProfileRepository, PlayerProfileCache playerProfileCache) {
        super(new File("kisman.cc/server"), minecraft.getProxy(), minecraft.getDataFixer(), yggdrasilAuthenticationService, minecraftSessionService, gameProfileRepository, playerProfileCache);
        FileUtils.deleteDirectory(new File("kisman.cc/server/main"));
        this.setServerOwner("_kisman_");
        this.setFolderName("main");
        this.setWorldName("main");
        this.setDemo(minecraft.isDemo());
        this.canCreateBonusChest(worldSettings.isBonusChestEnabled());
        this.setBuildLimit(256);
        this.setPlayerList(new Class1359(this, this));
        this.Field15221 = this.isDemo() ? WorldServerDemo.DEMO_WORLD_SETTINGS : worldSettings;
    }

    @NotNull
    @NotNull
    public ServerCommandManager createCommandManager() {
        return new ServerCommandManager((MinecraftServer)this);
    }

    public void loadAllWorld(String string, String string2, long l, WorldType worldType, String string3) {
        this.convertMapIfNeeded(string);
        ISaveHandler iSaveHandler = this.getActiveAnvilConverter().getSaveLoader(string, true);
        this.setResourcePackFromWorld(this.getFolderName(), iSaveHandler);
        WorldInfo worldInfo = iSaveHandler.loadWorldInfo();
        if (worldInfo == null) {
            worldInfo = new WorldInfo(this.Field15221, string2);
        } else {
            worldInfo.setWorldName(string2);
        }
        WorldServer worldServer = this.isDemo() ? (WorldServer)new WorldServerDemo((MinecraftServer)this, iSaveHandler, worldInfo, 0, this.profiler).init() : (WorldServer)new WorldServer((MinecraftServer)this, iSaveHandler, worldInfo, 0, this.profiler).init();
        worldServer.initialize(this.Field15221);
        Integer[] integerArray = DimensionManager.getStaticDimensionIDs();
        int n = integerArray.length;
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                this.getPlayerList().setPlayerManager(new WorldServer[]{worldServer});
                this.initialWorldChunkLoad();
                this.Field15222 = true;
                return;
            }
            int n3 = integerArray[n2];
            WorldServer worldServer2 = n3 == 0 ? worldServer : (WorldServer)new WorldServerMulti((MinecraftServer)this, iSaveHandler, n3, worldServer, this.profiler).init();
            worldServer2.addEventListener((IWorldEventListener)new ServerWorldEventHandler((MinecraftServer)this, worldServer2));
            if (!this.isSinglePlayer()) {
                worldServer2.getWorldInfo().setGameType(this.getGameType());
            }
            MinecraftForge.EVENT_BUS.post((Event)new WorldEvent.Load((World)worldServer2));
            ++n2;
        }
    }

    public boolean init() throws IOException {
        Class1796.Field16243.info("[CustomServerProvider] Starting server version 1.12.2");
        this.setOnlineMode(true);
        this.setCanSpawnAnimals(true);
        this.setCanSpawnNPCs(true);
        this.setAllowPvp(true);
        this.setAllowFlight(true);
        Class1796.Field16243.info("[CustomServerProvider] Generating Keypair");
        if (!FMLCommonHandler.instance().handleServerAboutToStart((MinecraftServer)this)) {
            return false;
        }
        this.loadAllWorld(this.getFolderName(), this.getWorldName(), this.Field15221.getSeed(), this.Field15221.getTerrainType(), this.Field15221.getGeneratorOptions());
        this.setMOTD(this.getServerOwner() + " - " + this.worlds[0].getWorldInfo().getWorldName());
        return FMLCommonHandler.instance().handleServerStarting((MinecraftServer)this);
    }

    public void tick() {
        boolean bl = this.Field15223;
        boolean bl2 = this.Field15223 = Minecraft.getMinecraft().getConnection() != null && Minecraft.getMinecraft().isGamePaused();
        if (!bl && this.Field15223) {
            Class1796.Field16243.info("[CustomServerProvider] Saving and pausing game...");
            this.getPlayerList().saveAllPlayerData();
            this.saveAllWorlds(false);
        }
        if (this.Field15223) {
            Queue queue = this.futureTaskQueue;
            while (!this.futureTaskQueue.isEmpty()) {
                Util.runTask((FutureTask)((FutureTask)this.futureTaskQueue.poll()), (Logger)Class1796.Field16243);
            }
            return;
        }
        super.tick();
        if (Class1547.Field15220.gameSettings.renderDistanceChunks != this.getPlayerList().getViewDistance()) {
            Class1796.Field16243.info("[CustomServerProvider] Changing view distance to {}, from {}", (Object)Class1547.Field15220.gameSettings.renderDistanceChunks, (Object)this.getPlayerList().getViewDistance());
            this.getPlayerList().setViewDistance(Class1547.Field15220.gameSettings.renderDistanceChunks);
        }
        WorldInfo worldInfo = this.worlds[0].getWorldInfo();
        WorldInfo worldInfo2 = Class1547.Field15220.world.getWorldInfo();
        if (!worldInfo.isDifficultyLocked() && worldInfo2.getDifficulty() != worldInfo.getDifficulty()) {
            Class1796.Field16243.info("Changing difficulty to {}, from {}", (Object)worldInfo2.getDifficulty(), (Object)worldInfo.getDifficulty());
            this.setDifficultyForAllWorlds(worldInfo2.getDifficulty());
            return;
        }
        if (!worldInfo2.isDifficultyLocked()) return;
        if (worldInfo.isDifficultyLocked()) return;
        Class1796.Field16243.info("Locking difficulty to {}", (Object)worldInfo2.getDifficulty());
        WorldServer[] worldServerArray = this.worlds;
        int n = worldServerArray.length;
        int n2 = 0;
        while (n2 < n) {
            WorldServer worldServer = worldServerArray[n2];
            if (worldServer != null) {
                worldServer.getWorldInfo().setDifficultyLocked(true);
            }
            ++n2;
        }
    }

    public boolean canStructuresSpawn() {
        return false;
    }

    public GameType getGameType() {
        return this.Field15221.getGameType();
    }

    public EnumDifficulty getDifficulty() {
        return Class1547.Field15220.world.getWorldInfo().getDifficulty();
    }

    public boolean isHardcore() {
        return this.Field15221.getHardcoreEnabled();
    }

    public boolean shouldBroadcastRconToOps() {
        return true;
    }

    public boolean shouldBroadcastConsoleToOps() {
        return true;
    }

    public void saveAllWorlds(boolean bl) {
        super.saveAllWorlds(bl);
    }

    public File getDataDirectory() {
        return new File("ttcSaves");
    }

    public boolean isDedicatedServer() {
        return false;
    }

    public boolean shouldUseNativeTransport() {
        return false;
    }

    public void finalTick(CrashReport crashReport) {
    }

    public CrashReport addServerInfoToCrashReport(CrashReport crashReport) {
        crashReport = super.addServerInfoToCrashReport(crashReport);
        crashReport.getCategory().addDetail("Type", () -> "Integrated Server (map_client.txt)");
        crashReport.getCategory().addDetail("Is Modded", this::lambda$addServerInfoToCrashReport$1);
        return crashReport;
    }

    public void setDifficultyForAllWorlds(EnumDifficulty enumDifficulty) {
        super.setDifficultyForAllWorlds(enumDifficulty);
    }

    public void addServerStatsToSnooper(Snooper snooper) {
    }

    public boolean isSnooperEnabled() {
        return Minecraft.getMinecraft().isSnooperEnabled();
    }

    public String shareToLAN(GameType gameType, boolean bl) {
        return "";
    }

    public void stopServer() {
        this.initiateShutdown();
        super.stopServer();
    }

    public void initiateShutdown() {
        super.initiateShutdown();
    }

    public void setGameType(GameType gameType) {
        super.setGameType(gameType);
        this.getPlayerList().setGameType(gameType);
    }

    public boolean isCommandBlockEnabled() {
        return true;
    }

    public int getOpPermissionLevel() {
        return 4;
    }

    private String lambda$addServerInfoToCrashReport$1() throws Exception {
        String string = ClientBrandRetriever.getClientModName();
        if (!string.equals("vanilla")) {
            return "Definitely; Client brand changed to '" + string + "'";
        }
        string = this.getServerModName();
        if (!"vanilla".equals(string)) {
            return "Definitely; Server brand changed to '" + string + "'";
        }
        if (Minecraft.class.getSigners() != null) return "Probably not. Jar signature remains and both client + server brands are untouched.";
        return "Very likely; Jar signature invalidated";
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 74;
            cArray2[n] = (char)(cArray[n] ^ (0x1EB1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

