/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.QsUYJN53MLWx702rV5eR08Z5ZKiZbBkR
 *  net.minecraft.util.EnumFacing
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.QsUYJN53MLWx702rV5eR08Z5ZKiZbBkR;
import net.minecraft.util.EnumFacing;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u0006H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011\u00a8\u0006\u0012"}, d2={"Lcom/kisman/cc/util/enums/DiagonalDirections;", "", "direction1", "Lnet/minecraft/util/EnumFacing;", "direction2", "displayName", "", "(Ljava/lang/String;ILnet/minecraft/util/EnumFacing;Lnet/minecraft/util/EnumFacing;Ljava/lang/String;)V", "getDirection1", "()Lnet/minecraft/util/EnumFacing;", "getDirection2", "getDisplayName", "()Ljava/lang/String;", "toString", "XpZp", "XmZm", "XpZm", "XmZp", "kisman.cc"})
public final class Class1592
extends Enum {
    public static final /* enum */ Class1592 Field15448;
    public static final /* enum */ Class1592 Field15449;
    public static final /* enum */ Class1592 Field15450;
    public static final /* enum */ Class1592 Field15451;
    private static final Class1592[] Field15452;
    @NotNull
    private final EnumFacing Field15453;
    @NotNull
    private final EnumFacing Field15454;
    @NotNull
    private final String Field15455;
    private String Field15456 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1592[] class1592Array = new Class1592[4];
        Class1592[] class1592Array2 = class1592Array;
        class1592Array[0] = Field15448 = new Class1592("XpZp", 0, EnumFacing.EAST, EnumFacing.SOUTH, "X+ Z+");
        class1592Array[1] = Field15449 = new Class1592("XmZm", 1, EnumFacing.WEST, EnumFacing.NORTH, "X- Z-");
        class1592Array[2] = Field15450 = new Class1592("XpZm", 2, EnumFacing.EAST, EnumFacing.NORTH, "X+ Z-");
        class1592Array[3] = Field15451 = new Class1592("XmZp", 3, EnumFacing.WEST, EnumFacing.SOUTH, "X- Z+");
        Field15452 = class1592Array;
    }

    @NotNull
    @NotNull
    public String toString() {
        return this.Field15455;
    }

    @NotNull
    @NotNull
    public final EnumFacing Method6249() {
        return this.Field15453;
    }

    @NotNull
    @NotNull
    public final EnumFacing Method6250() {
        return this.Field15454;
    }

    @NotNull
    @NotNull
    public final String Method6251() {
        return this.Field15455;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1592(String string) {
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this.Field15453 = string;
        this.Field15454 = var4_2;
        this.Field15455 = var5_3;
    }

    public static Class1592[] values() {
        return (QsUYJN53MLWx702rV5eR08Z5ZKiZbBkR[])Field15452.clone();
    }

    public static Class1592 valueOf(String string) {
        return Enum.valueOf(Class1592.class, string);
    }

    private static String Method6252(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 72;
            cArray2[n] = (char)(cArray[n] ^ (0x21ED ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

