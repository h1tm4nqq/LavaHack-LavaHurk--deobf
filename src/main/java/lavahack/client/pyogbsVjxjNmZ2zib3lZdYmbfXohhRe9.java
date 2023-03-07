/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.launchwrapper.Launch
 */
package lavahack.client;

import lavahack.client.VKBZXvQOFrziN0pExmLPOVv8CIcXCELf;
import net.minecraft.launchwrapper.Launch;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;

public final class pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9
extends Enum {
    public static final /* enum */ pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9 Field13481 = new pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9("VANILLA", (int)((long)1647470231 ^ (long)1647470231));
    public static final /* enum */ pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9 Field13482 = new pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9("SEARGE", (int)1221478765L ^ 0x48CE496C);
    public static final /* enum */ pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9 Field13483 = new pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9("MCP", (int)((long)1994850850 ^ (long)1994850851) << 1);
    private static pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9 Field13484;
    private static boolean Field13485;
    private static final pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9[] Field13486;
    private String Field13487 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9[] values() {
        return (pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9[])Field13486.clone();
    }

    public static pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9 valueOf(String string) {
        return Enum.valueOf(pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9() {
        void var2_-1;
        void var1_-1;
    }

    public static pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9 Method4870() {
        return Field13484;
    }

    public static boolean Method4871() {
        return Field13485;
    }

    public static void Method4872() {
        pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9 pyogbsVjxjNmZ2zib3lZdYmbfXohhRe92 = Field13482;
        String string = "net.minecraftforge.common.ForgeHooks";
        byte[] byArray = Launch.classLoader.getClassBytes(string);
        if (byArray != null) {
            Field13485 = (int)1255813235L ^ 0x4ADA3072;
        } else {
            pyogbsVjxjNmZ2zib3lZdYmbfXohhRe92 = Field13481;
        }
        string = "net.minecraft.world.World";
        byArray = null;
        byArray = Launch.classLoader.getClassBytes(string);
        if (byArray != null) {
            ClassNode classNode = new ClassNode();
            ClassReader classReader = new ClassReader(byArray);
            classReader.accept(classNode, (int)((long)-514322095 ^ (long)-514322095));
            if (VKBZXvQOFrziN0pExmLPOVv8CIcXCELf.Method5522(classNode, "loadedEntityList") != null) {
                pyogbsVjxjNmZ2zib3lZdYmbfXohhRe92 = Field13483;
            }
        }
        Field13484 = pyogbsVjxjNmZ2zib3lZdYmbfXohhRe92;
    }

    static {
        pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9[] pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9Array = new pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9[(int)((long)480844150 ^ (long)480844149)];
        pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9Array[(int)((long)709494098 ^ (long)709494098)] = Field13481;
        pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9Array[(int)-326760366L ^ 0xEC860853] = Field13482;
        pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9Array[(int)((long)1143662321 ^ (long)1143662320) << 1] = Field13483;
        Field13486 = pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9Array;
    }

    private static String Method4873(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1710011847 ^ (long)-1710011847);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1905732229L ^ 0x71972A7A);
            int n2 = (int)((long)1662306359 ^ (long)1662306368);
            cArray2[n] = (char)(cArray[n] ^ (((int)-420861841L ^ 0xE6EA2810) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

