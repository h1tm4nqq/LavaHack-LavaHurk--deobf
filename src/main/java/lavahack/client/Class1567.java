//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.multiplayer.*;
import net.minecraft.client.network.*;
import net.minecraft.world.*;
import net.minecraft.profiler.*;
import java.util.*;
import net.minecraft.world.storage.*;
import net.minecraft.util.math.*;
import org.jetbrains.annotations.*;
import net.minecraft.block.state.*;

public class Class1567 extends WorldClient
{
    private final Map Field15318;
    private final WorldClient Field15319;
    private String Field15320 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1567(final NetHandlerPlayClient netHandlerPlayClient, final WorldSettings worldSettings, final int n, final EnumDifficulty enumDifficulty, final Profiler profiler) {
        super(netHandlerPlayClient, worldSettings, n, enumDifficulty, profiler);
        this.Field15318 = new HashMap();
        this.Field15319 = null;
    }
    
    public Class1567(final WorldClient field15319) {
        super(field15319.connection, getWorldSettingFromWorld(field15319), field15319.provider.getDimension(), field15319.getDifficulty(), field15319.profiler);
        this.Field15318 = new HashMap();
        this.Field15319 = field15319;
    }
    
    private static WorldSettings getWorldSettingFromWorld(final WorldClient worldClient) {
        final WorldInfo getWorldInfo = worldClient.getWorldInfo();
        final WorldSettings worldSettings = new WorldSettings(getWorldInfo.getSeed(), getWorldInfo.getGameType(), getWorldInfo.isMapFeaturesEnabled(), getWorldInfo.isHardcoreModeEnabled(), getWorldInfo.getTerrainType());
        worldSettings.setGeneratorOptions(getWorldInfo.getGeneratorOptions());
        if (getWorldInfo.areCommandsAllowed()) {
            worldSettings.enableCommands();
        }
        return worldSettings;
    }
    
    public void override(final String s, final Class1763 class1763) {
        this.Field15318.put(s, class1763);
    }
    
    public void toDefault(final String s) {
        this.Field15318.remove(s);
    }
    
    public WorldClient getOriginal() {
        return this.Field15319;
    }
    
    @NotNull
    @NotNull
    public IBlockState getBlockState(@NotNull @NotNull final BlockPos blockPos) {
        if (this.Field15318.containsKey("getBlockState")) {
            return (IBlockState)this.Field15318.get("getBlockState").Method1726(blockPos);
        }
        return super.getBlockState(blockPos);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1590 ^ 0xE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
