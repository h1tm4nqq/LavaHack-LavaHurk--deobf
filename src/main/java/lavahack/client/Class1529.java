/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.GQCHtwrp6JeYnKqhNV7KuQ1v85QZoqcw
 *  net.minecraft.util.ResourceLocation
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Class1614;
import lavahack.client.GQCHtwrp6JeYnKqhNV7KuQ1v85QZoqcw;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0002\u001a\u00020\u0007H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000e"}, d2={"Lcom/kisman/cc/util/enums/CapeEnum;", "", "location", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getLocation", "()Ljava/lang/String;", "Lnet/minecraft/util/ResourceLocation;", "Gif", "XuluPlus", "Kuro", "Gentle", "Putin", "Gradient", "kisman.cc"})
public class Class1529
extends Enum {
    public static final /* enum */ Class1529 Field15146;
    public static final /* enum */ Class1529 Field15147;
    public static final /* enum */ Class1529 Field15148;
    public static final /* enum */ Class1529 Field15149;
    public static final /* enum */ Class1529 Field15150;
    public static final /* enum */ Class1529 Field15151;
    private static final Class1529[] Field15152;
    @NotNull
    private final String Field15153;
    private String Field15154 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1529[] class1529Array = new Class1529[6];
        Class1529[] class1529Array2 = class1529Array;
        class1529Array[0] = Field15146 = new Class1614("Gif", 0);
        class1529Array[1] = Field15147 = new Class1529("XuluPlus", 1, "kismancc:cape/xuluplus/xulupluscape.png");
        class1529Array[2] = Field15148 = new Class1529("Kuro", 2, "kismancc:cape/kuro/kuro.png");
        class1529Array[3] = Field15149 = new Class1529("Gentle", 3, "kismancc:cape/gentlemanmc/GentlemanMC.png");
        class1529Array[4] = Field15150 = new Class1529("Putin", 4, "kismancc:cape/putin/putin.png");
        class1529Array[5] = Field15151 = new Class1529("Gradient", 5, "kismancc:cape/gradient/gradient.png");
        Field15152 = class1529Array;
    }

    @NotNull
    @NotNull
    public ResourceLocation Method6069() {
        return new ResourceLocation(this.Field15153);
    }

    @NotNull
    @NotNull
    public final String Method6070() {
        return this.Field15153;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1529() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field15153 = var3_1;
    }

    /*
     * WARNING - void declaration
     */
    public Class1529() {
        this((String)var1_-1, (int)defaultConstructorMarker, (String)var3_2);
        void var3_2;
        void var1_-1;
    }

    public static Class1529[] values() {
        return (GQCHtwrp6JeYnKqhNV7KuQ1v85QZoqcw[])Field15152.clone();
    }

    public static Class1529 valueOf(String string) {
        return Enum.valueOf(Class1529.class, string);
    }

    private static String Method6071(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 46;
            cArray2[n] = (char)(cArray[n] ^ (0x7525 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

