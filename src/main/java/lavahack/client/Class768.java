//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import net.minecraft.block.*;
import net.minecraft.init.*;
import net.minecraft.util.math.*;
import org.luaj.vm2.*;
import org.luaj.vm2.lib.jse.*;
import scala.actors.threadpool.*;
import java.util.*;
import org.lwjgl.input.*;
import net.minecraft.client.gui.*;

public class Class768 implements Class2142
{
    private static Class768 Field11258;
    private String Field11259 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class768() {
    }
    
    public int Method3171() {
        return Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.fpsCounter;
    }
    
    public double Method3172() {
        return 1.0 / Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.fpsCounter;
    }
    
    public Vec3d Method3173() {
        if (Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player == null) {
            return Vec3d.ZERO;
        }
        return Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.getPositionVector();
    }
    
    public long Method3174() {
        return System.currentTimeMillis();
    }
    
    public String Method3175() {
        if (Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player == null || Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getCurrentServerData() == null) {
            return "none";
        }
        return Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getCurrentServerData().serverIP;
    }
    
    public String Method3176() {
        return Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getSession().getUsername();
    }
    
    public int Method3177() {
        return this.Method3178() ? 0 : (Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.isSingleplayer() ? 0 : Class1796.Field16241.Field16275.Method7401());
    }
    
    boolean Method3178() {
        return Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player == null || Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world == null;
    }
    
    public void Method3179(final float n) {
    }
    
    public float Method3180() {
        return Float.intBitsToFloat(1101004800);
    }
    
    public Block Method3181(final double n, final double n2, final double n3) {
        if (Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world == null) {
            return Blocks.AIR;
        }
        return Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world.getBlockState(new BlockPos(n, n2, n3)).getBlock();
    }
    
    public List Method3182() {
        if (Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world == null) {
            return Collections.emptyList();
        }
        return Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world.loadedEntityList;
    }
    
    public List Method3183() {
        if (Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world == null) {
            return Collections.emptyList();
        }
        return Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world.playerEntities;
    }
    
    public List Method3184() {
        if (Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world == null) {
            return Collections.emptyList();
        }
        return Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world.loadedTileEntityList;
    }
    
    public int[] Method3185(final LuaTable luaTable) {
        final int[] array = new int[luaTable.length()];
        for (int i = 1; i <= luaTable.length(); ++i) {
            array[i - 1] = luaTable.get(i).toint();
        }
        return array;
    }
    
    public float[] Method3186(final LuaTable luaTable) {
        final float[] array = new float[luaTable.length()];
        for (int i = 1; i <= luaTable.length(); ++i) {
            array[i - 1] = luaTable.get(i).tofloat();
        }
        return array;
    }
    
    public double[] Method3187(final LuaTable luaTable) {
        final double[] array = new double[luaTable.length()];
        for (int i = 1; i <= luaTable.length(); ++i) {
            array[i - 1] = luaTable.get(i).todouble();
        }
        return array;
    }
    
    public char[] Method3188(final LuaTable luaTable) {
        final char[] array = new char[luaTable.length()];
        for (int i = 1; i <= luaTable.length(); ++i) {
            array[i - 1] = luaTable.get(i).tochar();
        }
        return array;
    }
    
    public Object[] Method3189(final LuaTable luaTable, final Class clazz) {
        final Object[] array = new Object[luaTable.length()];
        for (int i = 1; i <= luaTable.length(); ++i) {
            array[i - 1] = CoerceLuaToJava.coerce(luaTable.get(i), clazz);
        }
        return array;
    }
    
    public static List Method3190(final float n, final boolean b, final boolean b2) {
        return Class2155.Method7758(n, b, b2);
    }
    
    public static ScaledResolution Method3191() {
        return new ScaledResolution(Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS);
    }
    
    public static Class194 Method3192() {
        return Class1796.Field16241.Field16254;
    }
    
    public static Class768 Method3193() {
        if (Class768.Field11258 == null) {
            Class768.Field11258 = new Class768();
        }
        return Class768.Field11258;
    }
    
    public String Method3194(final int n) {
        return Keyboard.getKeyName(n);
    }
    
    public ArrayList Method3195() {
        return new ArrayList(Arrays.asList((Object[])Class97.values()));
    }
    
    public boolean Method3196(final Class870 class870, final Class870 class871, final Class870 class872) {
        return class870.Field11662 > class871.Field11662 && class870.Field11662 < class872.Field11662 && class870.Field11663 > class871.Field11663 && class870.Field11663 < class872.Field11663;
    }
    
    public int Method3197() {
        return Mouse.getDWheel();
    }
    
    public boolean Method3198(final Object o, final String anObject) {
        for (Class<?> clazz = o.getClass(); clazz != null; clazz = clazz.getSuperclass()) {
            if (clazz.getName().equals(anObject)) {
                return true;
            }
        }
        return false;
    }
    
    public void Method3199(final GuiScreen guiScreen) {
        Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.displayGuiScreen(guiScreen);
    }
    
    public void Method3200(final String s) {
        Class1393.Method5506().Method1886(s);
    }
    
    public void Method3201(final String s) {
        Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.sendChatMessage(s);
    }
    
    private static String Method3202(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x98E ^ 0xC0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
