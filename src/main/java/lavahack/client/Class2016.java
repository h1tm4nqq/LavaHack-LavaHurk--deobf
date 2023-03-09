//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.server.SPacketEffect
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1106;
import lavahack.client.Class1393;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class42;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class97;
import net.minecraft.network.play.server.SPacketEffect;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;

public class Class2016
extends Class42 {
    @Class1801
    private final Class618 Field17278 = new Class618(Class2016::Method7472, new Predicate[0]);
    private String Field17279 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class2016() {
        super("SoundCoordLogger", "log", Class97.Field8344);
    }

    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field17278);
    }

    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field17278);
    }

    private static void Method7472(Class544 class544) {
        if (!(class544.Method982() instanceof SPacketEffect)) return;
        SPacketEffect sPacketEffect = (SPacketEffect)class544.Method982();
        switch (sPacketEffect.getSoundType()) {
            case 1023: {
                Class1393.Method5503().Method1886("Wither Spawned at " + Class1106.Method4533(new Vec3d((Vec3i)sPacketEffect.getSoundPos()), new boolean[0]));
                return;
            }
            case 1028: {
                Class1393.Method5503().Method1886("Ender Dragon Spawned at " + Class1106.Method4533(new Vec3d((Vec3i)sPacketEffect.getSoundPos()), new boolean[0]));
                return;
            }
            case 1038: {
                Class1393.Method5503().Method1886("End Portal Spawned at " + Class1106.Method4533(new Vec3d((Vec3i)sPacketEffect.getSoundPos()), new boolean[0]));
                return;
            }
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 55;
            cArray2[n] = (char)(cArray[n] ^ (0x6F92 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

