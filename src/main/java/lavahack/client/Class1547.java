//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.server.*;
import net.minecraftforge.fml.relauncher.*;
import com.mojang.authlib.yggdrasil.*;
import com.mojang.authlib.minecraft.*;
import com.mojang.authlib.*;
import org.apache.commons.io.*;
import net.minecraft.server.management.*;
import net.minecraft.command.*;
import org.jetbrains.annotations.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.world.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.world.storage.*;
import net.minecraftforge.fml.common.*;
import java.io.*;
import java.util.concurrent.*;
import net.minecraft.util.*;
import java.util.*;
import net.minecraft.world.*;
import net.minecraft.crash.*;
import net.minecraft.profiler.*;
import net.minecraft.client.*;

@SideOnly(Side.CLIENT)
public class Class1547 extends MinecraftServer
{
    private static final Minecraft Field15220;
    private final WorldSettings Field15221;
    public boolean Field15222;
    private boolean Field15223;
    private int Field15224;
    
    public Class1547(final Minecraft minecraft, final WorldSettings worldSettings, final YggdrasilAuthenticationService yggdrasilAuthenticationService, final MinecraftSessionService minecraftSessionService, final GameProfileRepository gameProfileRepository, final PlayerProfileCache playerProfileCache) {
        super(new File("kisman.cc/server"), minecraft.getProxy(), minecraft.getDataFixer(), yggdrasilAuthenticationService, minecraftSessionService, gameProfileRepository, playerProfileCache);
        this.Field15222 = false;
        FileUtils.deleteDirectory(new File("kisman.cc/server/main"));
        this.setServerOwner("_kisman_");
        this.setFolderName("main");
        this.setWorldName("main");
        this.setDemo(minecraft.isDemo());
        this.canCreateBonusChest(worldSettings.isBonusChestEnabled());
        this.setBuildLimit(256);
        this.setPlayerList((PlayerList)new Class1359(this, (MinecraftServer)this));
        this.Field15221 = (this.isDemo() ? WorldServerDemo.DEMO_WORLD_SETTINGS : worldSettings);
    }
    
    @NotNull
    @NotNull
    public ServerCommandManager createCommandManager() {
        return new ServerCommandManager((MinecraftServer)this);
    }
    
    public void loadAllWorld(final String s, final String s2, final long n, final WorldType worldType, final String s3) {
        this.convertMapIfNeeded(s);
        final ISaveHandler getSaveLoader = this.getActiveAnvilConverter().getSaveLoader(s, true);
        this.setResourcePackFromWorld(this.getFolderName(), getSaveLoader);
        WorldInfo loadWorldInfo = getSaveLoader.loadWorldInfo();
        if (loadWorldInfo == null) {
            loadWorldInfo = new WorldInfo(this.Field15221, s2);
        }
        else {
            loadWorldInfo.setWorldName(s2);
        }
        final WorldServer worldServer = (WorldServer)(this.isDemo() ? new WorldServerDemo((MinecraftServer)this, getSaveLoader, loadWorldInfo, 0, this.profiler).init() : ((WorldServer)new WorldServer((MinecraftServer)this, getSaveLoader, loadWorldInfo, 0, this.profiler).init()));
        worldServer.initialize(this.Field15221);
        for (final int intValue : DimensionManager.getStaticDimensionIDs()) {
            final WorldServer worldServer2 = (WorldServer)((intValue == 0) ? worldServer : new WorldServerMulti((MinecraftServer)this, getSaveLoader, intValue, worldServer, this.profiler).init());
            worldServer2.addEventListener((IWorldEventListener)new ServerWorldEventHandler((MinecraftServer)this, worldServer2));
            if (!this.isSinglePlayer()) {
                worldServer2.getWorldInfo().setGameType(this.getGameType());
            }
            MinecraftForge.EVENT_BUS.post((Event)new WorldEvent$Load((World)worldServer2));
        }
        this.getPlayerList().setPlayerManager(new WorldServer[] { worldServer });
        this.initialWorldChunkLoad();
        this.Field15222 = true;
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
        final boolean field15223 = this.Field15223;
        this.Field15223 = (Minecraft.getMinecraft().getConnection() != null && Minecraft.getMinecraft().isGamePaused());
        if (!field15223 && this.Field15223) {
            Class1796.Field16243.info("[CustomServerProvider] Saving and pausing game...");
            this.getPlayerList().saveAllPlayerData();
            this.saveAllWorlds(false);
        }
        if (this.Field15223) {
            final Queue futureTaskQueue = this.futureTaskQueue;
            while (!this.futureTaskQueue.isEmpty()) {
                Util.runTask((FutureTask)this.futureTaskQueue.poll(), Class1796.Field16243);
            }
        }
        else {
            super.tick();
            if (Class1547.Field15220.gameSettings.renderDistanceChunks != this.getPlayerList().getViewDistance()) {
                Class1796.Field16243.info("[CustomServerProvider] Changing view distance to {}, from {}", (Object)Class1547.Field15220.gameSettings.renderDistanceChunks, (Object)this.getPlayerList().getViewDistance());
                this.getPlayerList().setViewDistance(Class1547.Field15220.gameSettings.renderDistanceChunks);
            }
            final WorldInfo getWorldInfo = this.worlds[0].getWorldInfo();
            final WorldInfo getWorldInfo2 = Class1547.Field15220.world.getWorldInfo();
            if (!getWorldInfo.isDifficultyLocked() && getWorldInfo2.getDifficulty() != getWorldInfo.getDifficulty()) {
                Class1796.Field16243.info("Changing difficulty to {}, from {}", (Object)getWorldInfo2.getDifficulty(), (Object)getWorldInfo.getDifficulty());
                this.setDifficultyForAllWorlds(getWorldInfo2.getDifficulty());
            }
            else if (getWorldInfo2.isDifficultyLocked() && !getWorldInfo.isDifficultyLocked()) {
                Class1796.Field16243.info("Locking difficulty to {}", (Object)getWorldInfo2.getDifficulty());
                for (final WorldServer worldServer : this.worlds) {
                    if (worldServer != null) {
                        worldServer.getWorldInfo().setDifficultyLocked(true);
                    }
                }
            }
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
    
    public void saveAllWorlds(final boolean b) {
        super.saveAllWorlds(b);
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
    
    public void finalTick(final CrashReport crashReport) {
    }
    
    public CrashReport addServerInfoToCrashReport(CrashReport addServerInfoToCrashReport) {
        addServerInfoToCrashReport = super.addServerInfoToCrashReport(addServerInfoToCrashReport);
        addServerInfoToCrashReport.getCategory().addDetail("Type", () -> "Integrated Server (map_client.txt)");
        addServerInfoToCrashReport.getCategory().addDetail("Is Modded", this::lambda$addServerInfoToCrashReport$1);
        return addServerInfoToCrashReport;
    }
    
    public void setDifficultyForAllWorlds(final EnumDifficulty enumDifficulty) {
        super.setDifficultyForAllWorlds(enumDifficulty);
    }
    
    public void addServerStatsToSnooper(final Snooper snooper) {
    }
    
    public boolean isSnooperEnabled() {
        return Minecraft.getMinecraft().isSnooperEnabled();
    }
    
    public String shareToLAN(final GameType gameType, final boolean b) {
        return "";
    }
    
    public void stopServer() {
        this.initiateShutdown();
        super.stopServer();
    }
    
    public void initiateShutdown() {
        super.initiateShutdown();
    }
    
    public void setGameType(final GameType gameType) {
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
        final String clientModName = ClientBrandRetriever.getClientModName();
        if (!clientModName.equals("vanilla")) {
            return "Definitely; Client brand changed to '" + clientModName + "'";
        }
        final String serverModName = this.getServerModName();
        if (!"vanilla".equals(serverModName)) {
            return "Definitely; Server brand changed to '" + serverModName + "'";
        }
        return (Minecraft.class.getSigners() == null) ? "Very likely; Jar signature invalidated" : "Probably not. Jar signature remains and both client + server brands are untouched.";
    }
    
    static {
        Field15220 = Minecraft.getMinecraft();
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1EB1 ^ 0x4A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
