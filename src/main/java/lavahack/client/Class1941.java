/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaClosure
 *  org.luaj.vm2.LuaTable
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
import lavahack.client.Class1579;
import lavahack.client.Class2153;
import org.luaj.vm2.LuaClosure;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

public class Class1941 {
    private static Class1941 Field16982;
    private int Field16983;

    Class1941() {
    }

    public String Method7209() {
        return "kisman.cc/Lua/";
    }

    public File Method7210(String string) {
        return Files.createFile(Paths.get(this.Method7209() + string, new String[0]), new FileAttribute[0]).toFile();
    }

    public Path Method7211(String string) {
        return Files.createDirectory(Paths.get(this.Method7209() + string, new String[0]), new FileAttribute[0]);
    }

    public File Method7212(String string, String string2) {
        return Files.createTempFile(string, string2, new FileAttribute[0]).toFile();
    }

    public Path Method7213(String string) {
        return Files.createTempDirectory(string, new FileAttribute[0]);
    }

    public LuaTable Method7214(String string) {
        LuaTable luaTable = new LuaTable();
        List<String> list = Files.readAllLines(Paths.get(this.Method7209() + string, new String[0]));
        int n = 0;
        while (n < list.size() - 1) {
            luaTable.set(n + 1, list.get(n));
            ++n;
        }
        return luaTable;
    }

    public String Method7215(String string) {
        return String.join((CharSequence)"\n", Files.readAllLines(Paths.get(this.Method7209() + string, new String[0])));
    }

    public void Method7216(String string, String string2) {
        this.Method7217(string, string2.getBytes(StandardCharsets.UTF_8));
    }

    public void Method7217(String string, byte[] byArray) {
        Files.write(Paths.get(this.Method7209() + string, new String[0]), byArray, new OpenOption[0]);
    }

    public void Method7218(String string, LuaClosure luaClosure) {
        Files.walk(Paths.get(this.Method7209() + string, new String[0]), new FileVisitOption[0]).forEach(arg_0 -> Class1941.Method7222(luaClosure, arg_0));
    }

    public void Method7219(String string, LuaClosure luaClosure) {
        Files.walkFileTree(Paths.get(this.Method7209() + string, new String[0]), new Class1579(this)).forEach(arg_0 -> Class1941.Method7221(luaClosure, arg_0));
    }

    public static Class1941 Method7220() {
        if (Field16982 != null) return Field16982;
        Field16982 = new Class1941();
        return Field16982;
    }

    private static void Method7221(LuaClosure luaClosure, Path path) {
        Class2153.Method7745(luaClosure, CoerceJavaToLua.coerce((Object)path));
    }

    private static void Method7222(LuaClosure luaClosure, Path path) {
        Class2153.Method7745(luaClosure, CoerceJavaToLua.coerce((Object)path));
    }

    private static String Method7223(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 37;
            cArray2[n] = (char)(cArray[n] ^ (0xDD2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

