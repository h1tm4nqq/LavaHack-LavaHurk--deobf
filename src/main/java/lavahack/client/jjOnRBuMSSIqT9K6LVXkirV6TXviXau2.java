/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaClosure
 *  org.luaj.vm2.LuaTable
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.jse.CoerceJavaToLua
 */
package lavahack.client;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import lavahack.client.K9PkOnMGfpo751nxsj7CzHjKWnjAgUcY;
import lavahack.client.jjOnRBuMSSIqT9K6LVXkirV6TXviXau2$1;
import org.luaj.vm2.LuaClosure;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

public class jjOnRBuMSSIqT9K6LVXkirV6TXviXau2 {
    private static jjOnRBuMSSIqT9K6LVXkirV6TXviXau2 Field16982;
    private int Field16983;

    jjOnRBuMSSIqT9K6LVXkirV6TXviXau2() {
    }

    public String Method7209() {
        return "kisman.cc/Lua/";
    }

    public File Method7210(String string) {
        return Files.createFile(Paths.get(this.Method7209() + string, new String[(int)((long)-252748293 ^ (long)-252748293)]), new FileAttribute[(int)675833282L ^ 0x284865C2]).toFile();
    }

    public Path Method7211(String string) {
        return Files.createDirectory(Paths.get(this.Method7209() + string, new String[(int)-120687764L ^ 0xF8CE736C]), new FileAttribute[(int)((long)-575385107 ^ (long)-575385107)]);
    }

    public File Method7212(String string, String string2) {
        return Files.createTempFile(string, string2, new FileAttribute[(int)((long)-1140955951 ^ (long)-1140955951)]).toFile();
    }

    public Path Method7213(String string) {
        return Files.createTempDirectory(string, new FileAttribute[(int)((long)684441503 ^ (long)684441503)]);
    }

    public LuaTable Method7214(String string) {
        LuaTable luaTable = new LuaTable();
        List<String> list = Files.readAllLines(Paths.get(this.Method7209() + string, new String[(int)-1127643895L ^ 0xBCC98509]));
        int n = (int)((long)208797477 ^ (long)208797477);
        while (n < list.size() - (int)((long)-1941141018 ^ (long)-1941141017)) {
            luaTable.set(n + ((int)-1425854695L ^ 0xAB032F18), list.get(n));
            ++n;
        }
        return luaTable;
    }

    public String Method7215(String string) {
        return String.join((CharSequence)"\n", Files.readAllLines(Paths.get(this.Method7209() + string, new String[(int)((long)-1737018032 ^ (long)-1737018032)])));
    }

    public void Method7216(String string, String string2) {
        this.Method7217(string, string2.getBytes(StandardCharsets.UTF_8));
    }

    public void Method7217(String string, byte[] byArray) {
        Files.write(Paths.get(this.Method7209() + string, new String[(int)1975099455L ^ 0x75B9A03F]), byArray, new OpenOption[(int)((long)1643303008 ^ (long)1643303008)]);
    }

    public void Method7218(String string, LuaClosure luaClosure) {
        Files.walk(Paths.get(this.Method7209() + string, new String[(int)-998575599L ^ 0xC47AF211]), new FileVisitOption[(int)((long)-2057456130 ^ (long)-2057456130)]).forEach(arg_0 -> jjOnRBuMSSIqT9K6LVXkirV6TXviXau2.Method7222(luaClosure, arg_0));
    }

    public void Method7219(String string, LuaClosure luaClosure) {
        Files.walkFileTree(Paths.get(this.Method7209() + string, new String[(int)((long)1312355165 ^ (long)1312355165)]), new jjOnRBuMSSIqT9K6LVXkirV6TXviXau2$1(this)).forEach(arg_0 -> jjOnRBuMSSIqT9K6LVXkirV6TXviXau2.Method7221(luaClosure, arg_0));
    }

    public static jjOnRBuMSSIqT9K6LVXkirV6TXviXau2 Method7220() {
        if (Field16982 != null) return Field16982;
        Field16982 = new jjOnRBuMSSIqT9K6LVXkirV6TXviXau2();
        return Field16982;
    }

    private static void Method7221(LuaClosure luaClosure, Path path) {
        LuaValue[] luaValueArray = new LuaValue[(int)((long)304986139 ^ (long)304986138)];
        luaValueArray[(int)((long)-2030786436 ^ (long)-2030786436)] = CoerceJavaToLua.coerce((Object)path);
        K9PkOnMGfpo751nxsj7CzHjKWnjAgUcY.Method7745(luaClosure, luaValueArray);
    }

    private static void Method7222(LuaClosure luaClosure, Path path) {
        LuaValue[] luaValueArray = new LuaValue[(int)560150690L ^ 0x216338A3];
        luaValueArray[(int)((long)1717201910 ^ (long)1717201910)] = CoerceJavaToLua.coerce((Object)path);
        K9PkOnMGfpo751nxsj7CzHjKWnjAgUcY.Method7745(luaClosure, luaValueArray);
    }

    private static String Method7223(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1956216396 ^ (long)-1956216396);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)520345111L ^ 0x1F03D6E8);
            int n2 = (int)((long)506623758 ^ (long)506623787);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1366325628 ^ (long)-1366327187) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

