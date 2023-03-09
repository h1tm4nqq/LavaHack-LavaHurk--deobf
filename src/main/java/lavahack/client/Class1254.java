/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.IGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJ
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.IGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJ;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/util/enums/ShadersSettingTypes;", "", "(Ljava/lang/String;I)V", "StateOfOption", "ShaderStateOfOption", "UniformOfShader", "kisman.cc"})
public final class Class1254
extends Enum {
    public static final /* enum */ Class1254 Field13685;
    public static final /* enum */ Class1254 Field13686;
    public static final /* enum */ Class1254 Field13687;
    private static final Class1254[] Field13688;
    private String Field13689 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1254[] class1254Array = new Class1254[3];
        Class1254[] class1254Array2 = class1254Array;
        class1254Array[0] = Field13685 = new Class1254("StateOfOption", 0);
        class1254Array[1] = Field13686 = new Class1254("ShaderStateOfOption", 1);
        class1254Array[2] = Field13687 = new Class1254("UniformOfShader", 2);
        Field13688 = class1254Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1254() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1254[] values() {
        return (IGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJ[])Field13688.clone();
    }

    public static Class1254 valueOf(String string) {
        return Enum.valueOf(Class1254.class, string);
    }

    private static String Method5061(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 56;
            cArray2[n] = (char)(cArray[n] ^ (0x52B7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

