//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  org.luaj.vm2.LuaTable
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.jse.CoerceLuaToJava
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  scala.actors.threadpool.Arrays
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lavahack.client.Class1393;
import lavahack.client.Class1796;
import lavahack.client.Class194;
import lavahack.client.Class2155;
import lavahack.client.Class870;
import lavahack.client.Class97;
import net.minecraft.block.Block;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.jse.CoerceLuaToJava;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import scala.actors.threadpool.Arrays;

public class Class768
implements Class2142 {
    private static Class768 Field11258;
    private String Field11259 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class768() {
    }

    public int Method3171() {
        return Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.fpsCounter;
    }

    public double Method3172() {
        return 1.0 / (double)Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.fpsCounter;
    }

    public Vec3d Method3173() {
        if (Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player != null) return Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.getPositionVector();
        return Vec3d.ZERO;
    }

    public long Method3174() {
        return System.currentTimeMillis();
    }

    public String Method3175() {
        if (Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player == null) return "none";
        if (ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getCurrentServerData() != null) return Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getCurrentServerData().serverIP;
        return "none";
    }

    public String Method3176() {
        return ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getSession().getUsername();
    }

    public int Method3177() {
        if (this.Method3178()) {
            return 0;
        }
        if (ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.isSingleplayer()) {
            return 0;
        }
        int n = Class1796.Field16241.Field16275.Method7401();
        return n;
    }

    boolean Method3178() {
        if (Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player == null) return true;
        if (Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world == null) return true;
        return false;
    }

    public void Method3179(float f) {
    }

    public float Method3180() {
        return Float.intBitsToFloat(1101004800);
    }

    public Block Method3181(double d, double d2, double d3) {
        if (Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world != null) return Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world.getBlockState(new BlockPos(d, d2, d3)).getBlock();
        return Blocks.AIR;
    }

    public List Method3182() {
        if (Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world != null) return Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world.loadedEntityList;
        return Collections.emptyList();
    }

    public List Method3183() {
        if (Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world != null) return Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world.playerEntities;
        return Collections.emptyList();
    }

    public List Method3184() {
        if (Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world != null) return Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world.loadedTileEntityList;
        return Collections.emptyList();
    }

    public int[] Method3185(LuaTable luaTable) {
        int[] nArray = new int[luaTable.length()];
        int n = 1;
        while (n <= luaTable.length()) {
            nArray[n - 1] = luaTable.get(n).toint();
            ++n;
        }
        return nArray;
    }

    public float[] Method3186(LuaTable luaTable) {
        float[] fArray = new float[luaTable.length()];
        int n = 1;
        while (n <= luaTable.length()) {
            fArray[n - 1] = luaTable.get(n).tofloat();
            ++n;
        }
        return fArray;
    }

    public double[] Method3187(LuaTable luaTable) {
        double[] dArray = new double[luaTable.length()];
        int n = 1;
        while (n <= luaTable.length()) {
            dArray[n - 1] = luaTable.get(n).todouble();
            ++n;
        }
        return dArray;
    }

    public char[] Method3188(LuaTable luaTable) {
        char[] cArray = new char[luaTable.length()];
        int n = 1;
        while (n <= luaTable.length()) {
            cArray[n - 1] = luaTable.get(n).tochar();
            ++n;
        }
        return cArray;
    }

    public Object[] Method3189(LuaTable luaTable, Class clazz) {
        Object[] objectArray = new Object[luaTable.length()];
        int n = 1;
        while (n <= luaTable.length()) {
            objectArray[n - 1] = CoerceLuaToJava.coerce((LuaValue)luaTable.get(n), (Class)clazz);
            ++n;
        }
        return objectArray;
    }

    public static List Method3190(float f, boolean bl, boolean bl2) {
        return Class2155.Method7758(f, bl, bl2);
    }

    public static ScaledResolution Method3191() {
        return new ScaledResolution(ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS);
    }

    public static Class194 Method3192() {
        return Class1796.Field16241.Field16254;
    }

    public static Class768 Method3193() {
        if (Field11258 != null) return Field11258;
        Field11258 = new Class768();
        return Field11258;
    }

    public String Method3194(int n) {
        return Keyboard.getKeyName((int)n);
    }

    public ArrayList Method3195() {
        return new ArrayList(Arrays.asList((Object[])Class97.values()));
    }

    public boolean Method3196(Class870 class870, Class870 class8702, Class870 class8703) {
        if (!(class870.Field11662 > class8702.Field11662)) return false;
        if (!(class870.Field11662 < class8703.Field11662)) return false;
        if (!(class870.Field11663 > class8702.Field11663)) return false;
        if (!(class870.Field11663 < class8703.Field11663)) return false;
        return true;
    }

    public int Method3197() {
        return Mouse.getDWheel();
    }

    public boolean Method3198(Object object, String string) {
        Class<?> clazz = object.getClass();
        while (clazz != null) {
            if (clazz.getName().equals(string)) {
                return true;
            }
            clazz = clazz.getSuperclass();
        }
        return false;
    }

    public void Method3199(GuiScreen guiScreen) {
        ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.displayGuiScreen(guiScreen);
    }

    public void Method3200(String string) {
        Class1393.Method5506().Method1886(string);
    }

    public void Method3201(String string) {
        Class768.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.sendChatMessage(string);
    }

    private static String Method3202(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 192;
            cArray2[n] = (char)(cArray[n] ^ (0x98E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

