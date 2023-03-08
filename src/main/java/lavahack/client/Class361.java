//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;

public class Class361 extends Class42
{
    @Class1801
    private final Class618 Field9507;
    private String Field9508 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class361() {
        super("YCorrect", Class97.Field8345);
        this.Field9507 = new Class618(Class361::Method1806, new Predicate[0]);
    }
    
    @Override
    public void Method38() {
        super.Method38();
        if (Class361.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class361.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        Class1796.Field16242.Method705((Class1320)this);
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method710((Class1320)this);
    }
    
    private static void Method1806(final Class1334 class1334) {
        if (class1334.Field14104 <= Double.longBitsToDouble((long)1350106231 ^ 0xBFB4120592F7A05EL)) {
            class1334.Field14104 = 0.0;
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4B07 ^ 0xDB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
