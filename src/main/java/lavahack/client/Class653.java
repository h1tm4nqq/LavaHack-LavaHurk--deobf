//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;

public class Class653 extends Class42
{
    private final Class650 Field10798;
    private String Field10799 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class653() {
        super("ChatPrint", Class97.Field8345);
        this.Field10798 = new Class650();
    }
    
    public void Method38() {
        Class1393.Method5505();
    }
    
    public void Method45() {
        if (Class653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field10798.Method2797(5000L)) {
            Class1393.Method5505().Method1886("5000 ms passed");
            Class1393.Method5503().Method1890("5000 ms complete");
            Class1393.Method5506().Method1888("5000 ms");
            Class1393.Method5504().Method1892("5000 ms");
            Class1393.Method5507().Method1875("warn 5000 ms");
            this.Field10798.Method2801();
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1D04 ^ 0xED));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
