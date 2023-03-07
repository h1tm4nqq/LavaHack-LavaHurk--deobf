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

import lavahack.client.PoIOMl6MavESOIix8fejoCUPQX3nF19p;
import lavahack.client.il9AxcsIXbyBnRpEIjf6kL4uNA1aglA1;
import net.minecraft.profiler.Profiler;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.storage.ISaveHandler;
import net.minecraft.world.storage.WorldInfo;

public class szzspmKGmWUqivTUJ1fagL8CY5nqYVEj
extends World {
    private static szzspmKGmWUqivTUJ1fagL8CY5nqYVEj Field16978;
    private String Field16979 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    protected szzspmKGmWUqivTUJ1fagL8CY5nqYVEj(ISaveHandler iSaveHandler, WorldInfo worldInfo, WorldProvider worldProvider, Profiler profiler, boolean bl) {
        super(iSaveHandler, worldInfo, worldProvider, profiler, bl);
    }

    protected IChunkProvider createChunkProvider() {
        return null;
    }

    protected boolean isChunkLoaded(int n, int n2, boolean bl) {
        return ((int)-676598874L ^ 0xD7ABEBA6) != 0;
    }

    public static szzspmKGmWUqivTUJ1fagL8CY5nqYVEj instance() {
        if (Field16978 != null) return Field16978;
        WorldSettings worldSettings = new WorldSettings(0L, GameType.CREATIVE, ((int)904753218L ^ 0x35ED7042) != 0, (boolean)((long)252699117 ^ (long)252699117), WorldType.FLAT);
        WorldInfo worldInfo = new WorldInfo(worldSettings, "FakeWorld");
        Field16978 = new szzspmKGmWUqivTUJ1fagL8CY5nqYVEj(new il9AxcsIXbyBnRpEIjf6kL4uNA1aglA1(), worldInfo, new PoIOMl6MavESOIix8fejoCUPQX3nF19p(), new Profiler(), ((int)-1744937746L ^ 0x97FE5CEE) != 0);
        return Field16978;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-599535519L ^ 0xDC43D061;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1167302202L ^ 0x45939EC5);
            int n2 = (int)2005933003L ^ 0x77901B9C;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1655869662 ^ (long)-1655881155) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

