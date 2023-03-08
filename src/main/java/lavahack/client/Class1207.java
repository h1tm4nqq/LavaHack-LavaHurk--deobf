//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.launchwrapper.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.*;

public enum Class1207
{
    Field13481("VANILLA", 0), 
    Field13482("SEARGE", 1), 
    Field13483("MCP", 2);
    
    private static Class1207 Field13484;
    private static boolean Field13485;
    private static final Class1207[] Field13486;
    private String Field13487 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1207(final String name, final int ordinal) {
    }
    
    public static Class1207 Method4870() {
        return Class1207.Field13484;
    }
    
    public static boolean Method4871() {
        return Class1207.Field13485;
    }
    
    public static void Method4872() {
        Class1207 field13484 = Class1207.Field13482;
        if (Launch.classLoader.getClassBytes("net.minecraftforge.common.ForgeHooks") != null) {
            Class1207.Field13485 = true;
        }
        else {
            field13484 = Class1207.Field13481;
        }
        final byte[] classBytes = Launch.classLoader.getClassBytes("net.minecraft.world.World");
        if (classBytes != null) {
            final ClassNode classNode = new ClassNode();
            new ClassReader(classBytes).accept((ClassVisitor)classNode, 0);
            if (Class1396.Method5522(classNode, "loadedEntityList") != null) {
                field13484 = Class1207.Field13483;
            }
        }
        Class1207.Field13484 = field13484;
    }
    
    static {
        Field13486 = new Class1207[] { Class1207.Field13481, Class1207.Field13482, Class1207.Field13483 };
    }
    
    private static String Method4873(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1FC ^ 0x77));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
