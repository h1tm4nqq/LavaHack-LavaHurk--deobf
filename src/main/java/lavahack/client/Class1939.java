//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.profiler.Profiler
 *  net.minecraft.world.GameType
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldProvider
 *  net.minecraft.world.WorldSettings
 *  net.minecraft.world.WorldType
 *  net.minecraft.world.chunk.IChunkProvider
 *  net.minecraft.world.storage.ISaveHandler
 *  net.minecraft.world.storage.WorldInfo
 */
package lavahack.client;

import lavahack.client.Class2104;
import lavahack.client.Class755;
import net.minecraft.profiler.Profiler;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.storage.ISaveHandler;
import net.minecraft.world.storage.WorldInfo;

public class Class1939
extends World {
    private static Class1939 Field16978;
    private String Field16979 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    protected Class1939(ISaveHandler iSaveHandler, WorldInfo worldInfo, WorldProvider worldProvider, Profiler profiler, boolean bl) {
        super(iSaveHandler, worldInfo, worldProvider, profiler, bl);
    }

    protected IChunkProvider createChunkProvider() {
        return null;
    }

    protected boolean isChunkLoaded(int n, int n2, boolean bl) {
        return false;
    }

    public static Class1939 instance() {
        if (Field16978 != null) return Field16978;
        WorldSettings worldSettings = new WorldSettings(0L, GameType.CREATIVE, false, false, WorldType.FLAT);
        WorldInfo worldInfo = new WorldInfo(worldSettings, "FakeWorld");
        Field16978 = new Class1939(new Class2104(), worldInfo, new Class755(), new Profiler(), false);
        return Field16978;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 87;
            cArray2[n] = (char)(cArray[n] ^ (0x5A3E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

