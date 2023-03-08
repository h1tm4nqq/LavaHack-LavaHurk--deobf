//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;

public class Class1076 extends Class42
{
    @Class1801
    private final Class618 Field12790;
    private String Field12791 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1076() {
        super("MoveInspector", Class97.Field8345);
        this.Field12790 = new Class618(Class1076::Method4351, new Predicate[0]);
    }
    
    @Override
    public void Method38() {
        super.Method38();
        if (Class1076.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1076.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        Class1796.Field16242.Method705(this);
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method710(this);
    }
    
    private static void Method4351(final Class1334 class1334) {
        Class1393.Method5505().Method1886("MoverType: " + class1334.Field14102.toString() + ", x: " + class1334.Field14103 + ", y: " + class1334.Field14104 + ", z: " + class1334.Field14105);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x42C ^ 0x5A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
