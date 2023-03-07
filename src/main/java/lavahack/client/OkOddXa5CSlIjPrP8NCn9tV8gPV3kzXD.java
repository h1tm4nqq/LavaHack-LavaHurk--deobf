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

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

public class OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD
implements Ljc0gDTN8WkwPRHY480HpEkScGALG41A {
    private static OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD Field11258;
    private String Field11259 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD() {
    }

    public int Method3171() {
        return OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.fpsCounter;
    }

    public double Method3172() {
        return 1.0 / (double)OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.fpsCounter;
    }

    public Vec3d Method3173() {
        if (OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player != null) return OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.getPositionVector();
        return Vec3d.ZERO;
    }

    public long Method3174() {
        return System.currentTimeMillis();
    }

    public String Method3175() {
        if (OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player == null) return "none";
        if (ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getCurrentServerData() != null) return OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getCurrentServerData().serverIP;
        return "none";
    }

    public String Method3176() {
        return ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getSession().getUsername();
    }

    public int Method3177() {
        int n;
        if (this.Method3178()) {
            n = (int)-327795777L ^ 0xEC763BBF;
            return n;
        }
        if (ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.isSingleplayer()) {
            n = (int)-1873649187L ^ 0x905261DD;
            return n;
        }
        n = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16275.Method7401();
        return n;
    }

    boolean Method3178() {
        int n;
        if (OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player != null && OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world != null) {
            n = (int)1070173936L ^ 0x3FC98EF0;
            return n != 0;
        }
        n = (int)-1482448659L ^ 0xA7A3A0EC;
        return n != 0;
    }

    public void Method3179(float f) {
    }

    public float Method3180() {
        return Float.intBitsToFloat((int)((long)500361505 ^ (long)1551034657));
    }

    public Block Method3181(double d, double d2, double d3) {
        if (OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world != null) return OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world.getBlockState(new BlockPos(d, d2, d3)).getBlock();
        return Blocks.AIR;
    }

    public List Method3182() {
        if (OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world != null) return OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world.loadedEntityList;
        return Collections.emptyList();
    }

    public List Method3183() {
        if (OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world != null) return OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world.playerEntities;
        return Collections.emptyList();
    }

    public List Method3184() {
        if (OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world != null) return OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world.loadedTileEntityList;
        return Collections.emptyList();
    }

    public int[] Method3185(LuaTable luaTable) {
        int[] nArray = new int[luaTable.length()];
        int n = (int)((long)-323671900 ^ (long)-323671899);
        while (n <= luaTable.length()) {
            nArray[n - ((int)-8047070L ^ 0xFF853623)] = luaTable.get(n).toint();
            ++n;
        }
        return nArray;
    }

    public float[] Method3186(LuaTable luaTable) {
        float[] fArray = new float[luaTable.length()];
        int n = (int)-1872845874L ^ 0x905EA3CF;
        while (n <= luaTable.length()) {
            fArray[n - (int)((long)707525323 ^ (long)707525322)] = luaTable.get(n).tofloat();
            ++n;
        }
        return fArray;
    }

    public double[] Method3187(LuaTable luaTable) {
        double[] dArray = new double[luaTable.length()];
        int n = (int)((long)1549352918 ^ (long)1549352919);
        while (n <= luaTable.length()) {
            dArray[n - ((int)-1736051278L ^ 0x9885F5B3)] = luaTable.get(n).todouble();
            ++n;
        }
        return dArray;
    }

    public char[] Method3188(LuaTable luaTable) {
        char[] cArray = new char[luaTable.length()];
        int n = (int)-470173605L ^ 0xE3F9B85A;
        while (n <= luaTable.length()) {
            cArray[n - (int)((long)-1680846545 ^ (long)-1680846546)] = luaTable.get(n).tochar();
            ++n;
        }
        return cArray;
    }

    public Object[] Method3189(LuaTable luaTable, Class clazz) {
        Object[] objectArray = new Object[luaTable.length()];
        int n = (int)((long)-992408052 ^ (long)-992408051);
        while (n <= luaTable.length()) {
            objectArray[n - (int)((long)1767619551 ^ (long)1767619550)] = CoerceLuaToJava.coerce((LuaValue)luaTable.get(n), (Class)clazz);
            ++n;
        }
        return objectArray;
    }

    public static List Method3190(float f, boolean bl, boolean bl2) {
        return vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7758(f, bl, bl2);
    }

    public static ScaledResolution Method3191() {
        return new ScaledResolution(ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS);
    }

    public static ModuleManager Method3192() {
        return leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254;
    }

    public static OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD Method3193() {
        if (Field11258 != null) return Field11258;
        Field11258 = new OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD();
        return Field11258;
    }

    public String Method3194(int n) {
        return Keyboard.getKeyName((int)n);
    }

    public ArrayList Method3195() {
        return new ArrayList(Arrays.asList((Object[])qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.values()));
    }

    public boolean Method3196(bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2, bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE3, bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE4) {
        int n;
        if (bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2.Field11662 > bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE3.Field11662 && bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2.Field11662 < bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE4.Field11662 && bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2.Field11663 > bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE3.Field11663 && bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2.Field11663 < bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE4.Field11663) {
            n = (int)((long)-1910603375 ^ (long)-1910603376);
            return n != 0;
        }
        n = (int)((long)985163503 ^ (long)985163503);
        return n != 0;
    }

    public int Method3197() {
        return Mouse.getDWheel();
    }

    public boolean Method3198(Object object, String string) {
        Class<?> clazz = object.getClass();
        while (clazz != null) {
            if (clazz.getName().equals(string)) {
                return (int)((long)972207219 ^ (long)972207218) != 0;
            }
            clazz = clazz.getSuperclass();
        }
        return (int)((long)1029797243 ^ (long)1029797243) != 0;
    }

    public void Method3199(GuiScreen guiScreen) {
        ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.displayGuiScreen(guiScreen);
    }

    public void Method3200(String string) {
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5506().Method1886(string);
    }

    public void Method3201(String string) {
        OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.sendChatMessage(string);
    }

    private static String Method3202(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1693215867 ^ (long)-1693215867);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1455787838L ^ 0x56C58FC1);
            int n2 = ((int)481433432L ^ 0x1CB2175B) << 6;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)839844133 ^ (long)839845346) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

