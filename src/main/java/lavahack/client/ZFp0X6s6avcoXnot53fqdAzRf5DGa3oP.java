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
import lavahack.client.ZFp0X6s6avcoXnot53fqdAzRf5DGa3oP$1;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
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
public class ZFp0X6s6avcoXnot53fqdAzRf5DGa3oP
extends MinecraftServer {
    private static final Minecraft Field15220 = Minecraft.getMinecraft();
    private final WorldSettings Field15221;
    public boolean Field15222 = (int)2000840339L ^ 0x77426693;
    private boolean Field15223;
    private int Field15224;

    public ZFp0X6s6avcoXnot53fqdAzRf5DGa3oP(Minecraft minecraft, WorldSettings worldSettings, YggdrasilAuthenticationService yggdrasilAuthenticationService, MinecraftSessionService minecraftSessionService, GameProfileRepository gameProfileRepository, PlayerProfileCache playerProfileCache) {
        super(new File("kisman.cc/server"), minecraft.getProxy(), minecraft.getDataFixer(), yggdrasilAuthenticationService, minecraftSessionService, gameProfileRepository, playerProfileCache);
        FileUtils.deleteDirectory(new File("kisman.cc/server/main"));
        this.setServerOwner("_kisman_");
        this.setFolderName("main");
        this.setWorldName("main");
        this.setDemo(minecraft.isDemo());
        this.canCreateBonusChest(worldSettings.isBonusChestEnabled());
        this.setBuildLimit((int)((long)-438821972 ^ (long)-438821971) << 8);
        this.setPlayerList(new ZFp0X6s6avcoXnot53fqdAzRf5DGa3oP$1(this, this));
        this.Field15221 = this.isDemo() ? WorldServerDemo.DEMO_WORLD_SETTINGS : worldSettings;
    }

    @NotNull
    @NotNull
    public ServerCommandManager createCommandManager() {
        return new ServerCommandManager((MinecraftServer)this);
    }

    public void loadAllWorld(String string, String string2, long l, WorldType worldType, String string3) {
        this.convertMapIfNeeded(string);
        ISaveHandler iSaveHandler = this.getActiveAnvilConverter().getSaveLoader(string, (boolean)((long)533038113 ^ (long)533038112));
        this.setResourcePackFromWorld(this.getFolderName(), iSaveHandler);
        WorldInfo worldInfo = iSaveHandler.loadWorldInfo();
        if (worldInfo == null) {
            worldInfo = new WorldInfo(this.Field15221, string2);
        } else {
            worldInfo.setWorldName(string2);
        }
        WorldServer worldServer = this.isDemo() ? (WorldServer)new WorldServerDemo((MinecraftServer)this, iSaveHandler, worldInfo, (int)944812946L ^ 0x3850B392, this.profiler).init() : (WorldServer)new WorldServer((MinecraftServer)this, iSaveHandler, worldInfo, (int)((long)264121981 ^ (long)264121981), this.profiler).init();
        worldServer.initialize(this.Field15221);
        Integer[] integerArray = DimensionManager.getStaticDimensionIDs();
        int n = integerArray.length;
        int n2 = (int)((long)1418088915 ^ (long)1418088915);
        while (true) {
            if (n2 >= n) {
                WorldServer[] worldServerArray = new WorldServer[(int)-1323492671L ^ 0xB11D1AC0];
                worldServerArray[(int)-44122725L ^ 0xFD5EBD9B] = worldServer;
                this.getPlayerList().setPlayerManager(worldServerArray);
                this.initialWorldChunkLoad();
                this.Field15222 = (int)((long)1316977807 ^ (long)1316977806);
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
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.info("[CustomServerProvider] Starting server version 1.12.2");
        this.setOnlineMode(((int)2072116400L ^ 0x7B81FCB1) != 0);
        this.setCanSpawnAnimals(((int)-919330442L ^ 0xC9342177) != 0);
        this.setCanSpawnNPCs((boolean)((long)-1944160104 ^ (long)-1944160103));
        this.setAllowPvp((boolean)((long)-480383640 ^ (long)-480383639));
        this.setAllowFlight(((int)2081806775L ^ 0x7C15D9B6) != 0);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.info("[CustomServerProvider] Generating Keypair");
        if (!FMLCommonHandler.instance().handleServerAboutToStart((MinecraftServer)this)) {
            return ((int)-2129317944L ^ 0x81152FC8) != 0;
        }
        this.loadAllWorld(this.getFolderName(), this.getWorldName(), this.Field15221.getSeed(), this.Field15221.getTerrainType(), this.Field15221.getGeneratorOptions());
        this.setMOTD(this.getServerOwner() + " - " + this.worlds[(int)((long)1234360004 ^ (long)1234360004)].getWorldInfo().getWorldName());
        return FMLCommonHandler.instance().handleServerStarting((MinecraftServer)this);
    }

    public void tick() {
        boolean bl = this.Field15223;
        this.Field15223 = Minecraft.getMinecraft().getConnection() != null && Minecraft.getMinecraft().isGamePaused() ? (int)1710363771L ^ 0x65F2147A : (int)((long)1074918414 ^ (long)1074918414);
        int n = this.Field15223 ? 1 : 0;
        if (!bl && this.Field15223) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.info("[CustomServerProvider] Saving and pausing game...");
            this.getPlayerList().saveAllPlayerData();
            this.saveAllWorlds((boolean)((long)893049141 ^ (long)893049141));
        }
        if (this.Field15223) {
            Queue queue = this.futureTaskQueue;
            while (!this.futureTaskQueue.isEmpty()) {
                Util.runTask((FutureTask)((FutureTask)this.futureTaskQueue.poll()), (Logger)leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243);
            }
            return;
        }
        super.tick();
        if (ZFp0X6s6avcoXnot53fqdAzRf5DGa3oP.Field15220.gameSettings.renderDistanceChunks != this.getPlayerList().getViewDistance()) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.info("[CustomServerProvider] Changing view distance to {}, from {}", (Object)ZFp0X6s6avcoXnot53fqdAzRf5DGa3oP.Field15220.gameSettings.renderDistanceChunks, (Object)this.getPlayerList().getViewDistance());
            this.getPlayerList().setViewDistance(ZFp0X6s6avcoXnot53fqdAzRf5DGa3oP.Field15220.gameSettings.renderDistanceChunks);
        }
        WorldInfo worldInfo = this.worlds[(int)((long)203618572 ^ (long)203618572)].getWorldInfo();
        WorldInfo worldInfo2 = ZFp0X6s6avcoXnot53fqdAzRf5DGa3oP.Field15220.world.getWorldInfo();
        if (!worldInfo.isDifficultyLocked() && worldInfo2.getDifficulty() != worldInfo.getDifficulty()) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.info("Changing difficulty to {}, from {}", (Object)worldInfo2.getDifficulty(), (Object)worldInfo.getDifficulty());
            this.setDifficultyForAllWorlds(worldInfo2.getDifficulty());
            return;
        }
        if (!worldInfo2.isDifficultyLocked()) return;
        if (worldInfo.isDifficultyLocked()) return;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.info("Locking difficulty to {}", (Object)worldInfo2.getDifficulty());
        WorldServer[] worldServerArray = this.worlds;
        int n2 = worldServerArray.length;
        int n3 = (int)1259762733L ^ 0x4B16742D;
        while (n3 < n2) {
            WorldServer worldServer = worldServerArray[n3];
            if (worldServer != null) {
                worldServer.getWorldInfo().setDifficultyLocked((boolean)((long)-397848778 ^ (long)-397848777));
            }
            ++n3;
        }
    }

    public boolean canStructuresSpawn() {
        return ((int)-1381192325L ^ 0xADACAD7B) != 0;
    }

    public GameType getGameType() {
        return this.Field15221.getGameType();
    }

    public EnumDifficulty getDifficulty() {
        return ZFp0X6s6avcoXnot53fqdAzRf5DGa3oP.Field15220.world.getWorldInfo().getDifficulty();
    }

    public boolean isHardcore() {
        return this.Field15221.getHardcoreEnabled();
    }

    public boolean shouldBroadcastRconToOps() {
        return (int)((long)1434485351 ^ (long)1434485350) != 0;
    }

    public boolean shouldBroadcastConsoleToOps() {
        return ((int)676430344L ^ 0x28518209) != 0;
    }

    public void saveAllWorlds(boolean bl) {
        super.saveAllWorlds(bl);
    }

    public File getDataDirectory() {
        return new File("ttcSaves");
    }

    public boolean isDedicatedServer() {
        return (int)((long)-1851792668 ^ (long)-1851792668) != 0;
    }

    public boolean shouldUseNativeTransport() {
        return ((int)573394378L ^ 0x222D4DCA) != 0;
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
        return (int)((long)-2027413315 ^ (long)-2027413316) != 0;
    }

    public int getOpPermissionLevel() {
        return (int)((long)-827877128 ^ (long)-827877127) << 2;
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
        int n = (int)954549524L ^ 0x38E54514;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1175301100L ^ 0xB9F254EB);
            int n2 = ((int)296559846L ^ 0x11AD24C3) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)2031158545L ^ 0x79111BA0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

