//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.io.*;
import java.nio.file.attribute.*;
import java.util.*;
import java.nio.charset.*;
import java.nio.file.*;
import org.luaj.vm2.*;
import org.luaj.vm2.lib.jse.*;

public class Class1941
{
    private static Class1941 Field16982;
    private int Field16983;
    
    Class1941() {
    }
    
    public String Method7209() {
        return "kisman.cc/Lua/";
    }
    
    public File Method7210(final String str) {
        return Files.createFile(Paths.get(this.Method7209() + str, new String[0]), (FileAttribute<?>[])new FileAttribute[0]).toFile();
    }
    
    public Path Method7211(final String str) {
        return Files.createDirectory(Paths.get(this.Method7209() + str, new String[0]), (FileAttribute<?>[])new FileAttribute[0]);
    }
    
    public File Method7212(final String prefix, final String suffix) {
        return Files.createTempFile(prefix, suffix, (FileAttribute<?>[])new FileAttribute[0]).toFile();
    }
    
    public Path Method7213(final String prefix) {
        return Files.createTempDirectory(prefix, (FileAttribute<?>[])new FileAttribute[0]);
    }
    
    public LuaTable Method7214(final String str) {
        final LuaTable luaTable = new LuaTable();
        final List<String> allLines = Files.readAllLines(Paths.get(this.Method7209() + str, new String[0]));
        for (int i = 0; i < allLines.size() - 1; ++i) {
            luaTable.set(i + 1, (String)allLines.get(i));
        }
        return luaTable;
    }
    
    public String Method7215(final String str) {
        return String.join("\n", Files.readAllLines(Paths.get(this.Method7209() + str, new String[0])));
    }
    
    public void Method7216(final String s, final String s2) {
        this.Method7217(s, s2.getBytes(StandardCharsets.UTF_8));
    }
    
    public void Method7217(final String str, final byte[] bytes) {
        Files.write(Paths.get(this.Method7209() + str, new String[0]), bytes, new OpenOption[0]);
    }
    
    public void Method7218(final String str, final LuaClosure luaClosure) {
        Files.walk(Paths.get(this.Method7209() + str, new String[0]), new FileVisitOption[0]).forEach(Class1941::Method7222);
    }
    
    public void Method7219(final String str, final LuaClosure luaClosure) {
        Files.walkFileTree(Paths.get(this.Method7209() + str, new String[0]), (FileVisitor<? super Path>)new Class1579(this)).forEach(Class1941::Method7221);
    }
    
    public static Class1941 Method7220() {
        if (Class1941.Field16982 == null) {
            Class1941.Field16982 = new Class1941();
        }
        return Class1941.Field16982;
    }
    
    private static void Method7221(final LuaClosure luaClosure, final Path path) {
        Class2153.Method7745(luaClosure, CoerceJavaToLua.coerce((Object)path));
    }
    
    private static void Method7222(final LuaClosure luaClosure, final Path path) {
        Class2153.Method7745(luaClosure, CoerceJavaToLua.coerce((Object)path));
    }
    
    private static String Method7223(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xDD2 ^ 0x25));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
