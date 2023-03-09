/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.launchwrapper.Launch
 */
package lavahack.client;

import lavahack.client.Class1396;
import net.minecraft.launchwrapper.Launch;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;

public enum Class1207 {
    Field13481,
    Field13482,
    Field13483;

    private static Class1207 Field13484;
    private static boolean Field13485;
    private String Field13487 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static Class1207 Method4870() {
        return Field13484;
    }

    public static boolean Method4871() {
        return Field13485;
    }

    public static void Method4872() {
        Class1207 class1207 = Field13482;
        String string = "net.minecraftforge.common.ForgeHooks";
        byte[] byArray = Launch.classLoader.getClassBytes(string);
        if (byArray != null) {
            Field13485 = true;
        } else {
            class1207 = Field13481;
        }
        string = "net.minecraft.world.World";
        byArray = null;
        byArray = Launch.classLoader.getClassBytes(string);
        if (byArray != null) {
            ClassNode classNode = new ClassNode();
            ClassReader classReader = new ClassReader(byArray);
            classReader.accept(classNode, 0);
            if (Class1396.Method5522(classNode, "loadedEntityList") != null) {
                class1207 = Field13483;
            }
        }
        Field13484 = class1207;
    }

    private static String Method4873(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 119;
            cArray2[n] = (char)(cArray[n] ^ (0x1FC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

