//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

public class Class898 {
    private static final String Field11765 = "fdee323e-7f0c-4c15-8d1c-0f277442342a";
    private String Field11766 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static Vec3d Method3736(Entity entity, double d) {
        return entity.getPositionVector().add(new Vec3d(entity.motionX * d, entity.motionY * d, entity.motionZ * d));
    }

    private static String Method3737(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 11;
            cArray2[n] = (char)(cArray[n] ^ (0xA74 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

