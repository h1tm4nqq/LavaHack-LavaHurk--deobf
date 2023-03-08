//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.network.play.server.*;
import net.minecraft.util.math.*;

public class Class2016 extends Class42
{
    @Class1801
    private final Class618 Field17278;
    private String Field17279 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2016() {
        super("SoundCoordLogger", "log", Class97.Field8344);
        this.Field17278 = new Class618(Class2016::Method7472, new Predicate[0]);
    }
    
    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field17278);
    }
    
    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field17278);
    }
    
    private static void Method7472(final Class544 class544) {
        if (class544.Method982() instanceof SPacketEffect) {
            final SPacketEffect sPacketEffect = (SPacketEffect)class544.Method982();
            switch (sPacketEffect.getSoundType()) {
                case 1023: {
                    Class1393.Method5503().Method1886("Wither Spawned at " + Class1106.Method4533(new Vec3d((Vec3i)sPacketEffect.getSoundPos()), new boolean[0]));
                    break;
                }
                case 1028: {
                    Class1393.Method5503().Method1886("Ender Dragon Spawned at " + Class1106.Method4533(new Vec3d((Vec3i)sPacketEffect.getSoundPos()), new boolean[0]));
                    break;
                }
                case 1038: {
                    Class1393.Method5503().Method1886("End Portal Spawned at " + Class1106.Method4533(new Vec3d((Vec3i)sPacketEffect.getSoundPos()), new boolean[0]));
                    break;
                }
            }
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6F92 ^ 0x37));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
