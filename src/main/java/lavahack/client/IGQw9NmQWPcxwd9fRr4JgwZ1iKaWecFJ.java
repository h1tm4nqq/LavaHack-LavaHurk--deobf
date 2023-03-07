/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/util/enums/ShadersSettingTypes;", "", "(Ljava/lang/String;I)V", "StateOfOption", "ShaderStateOfOption", "UniformOfShader", "kisman.cc"})
public final class IGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJ
extends Enum {
    public static final /* enum */ IGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJ Field13685;
    public static final /* enum */ IGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJ Field13686;
    public static final /* enum */ IGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJ Field13687;
    private static final IGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJ[] Field13688;
    private String Field13689 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        IGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJ[] iGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJArray = new IGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJ[(int)((long)1531313726 ^ (long)1531313725)];
        IGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJ[] iGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJArray2 = iGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJArray;
        iGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJArray[(int)((long)-930455730 ^ (long)-930455730)] = Field13685 = new IGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJ("StateOfOption", (int)((long)1781029330 ^ (long)1781029330));
        iGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJArray[(int)((long)-216870918 ^ (long)-216870917)] = Field13686 = new IGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJ("ShaderStateOfOption", (int)((long)-1195754093 ^ (long)-1195754094));
        iGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJArray[((int)-1539958244L ^ 0xA4361A1D) << 1] = Field13687 = new IGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJ("UniformOfShader", ((int)204856026L ^ 0xC35DADB) << 1);
        Field13688 = iGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private IGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJ() {
        void var2_-1;
        void var1_-1;
    }

    public static IGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJ[] values() {
        return (IGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJ[])Field13688.clone();
    }

    public static IGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJ valueOf(String string) {
        return Enum.valueOf(IGQw9NmQWPcxwd9fRr4JgwZ1iKaWecFJ.class, string);
    }

    private static String Method5061(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-2117223501 ^ (long)-2117223501);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-475402488 ^ (long)-475402249);
            int n2 = ((int)-726338801L ^ 0xD4B4F308) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1163446865L ^ 0xBAA76718 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

