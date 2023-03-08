//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.world.storage.*;
import net.minecraft.profiler.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.*;

public class Class1939 extends World
{
    private static Class1939 Field16978;
    private String Field16979 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    protected Class1939(final ISaveHandler saveHandler, final WorldInfo worldInfo, final WorldProvider worldProvider, final Profiler profiler, final boolean b) {
        super(saveHandler, worldInfo, worldProvider, profiler, b);
    }
    
    protected IChunkProvider createChunkProvider() {
        return null;
    }
    
    protected boolean isChunkLoaded(final int n, final int n2, final boolean b) {
        return false;
    }
    
    public static Class1939 instance() {
        if (Class1939.Field16978 == null) {
            Class1939.Field16978 = new Class1939((ISaveHandler)new Class2104(), new WorldInfo(new WorldSettings(0L, GameType.CREATIVE, false, false, WorldType.FLAT), "FakeWorld"), new Class755(), new Profiler(), false);
        }
        return Class1939.Field16978;
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5A3E ^ 0x57));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
