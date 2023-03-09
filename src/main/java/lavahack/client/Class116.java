/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.S7YIPlQ2rUd5yHzks4soQm4KFLFDKtNU
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.S7YIPlQ2rUd5yHzks4soQm4KFLFDKtNU;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/util/enums/GLSLMenuShaders;", "", "file", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getFile", "()Ljava/lang/String;", "path", "SquaresHighway", "VoxelPacMan", "Squares2", "kisman.cc"})
public final class Class116
extends Enum {
    public static final /* enum */ Class116 Field8407;
    public static final /* enum */ Class116 Field8408;
    public static final /* enum */ Class116 Field8409;
    private static final Class116[] Field8410;
    @NotNull
    private final String Field8411;
    private String Field8412 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class116[] class116Array = new Class116[3];
        Class116[] class116Array2 = class116Array;
        class116Array[0] = Field8407 = new Class116("SquaresHighway", 0, "squares_highway.fsh");
        class116Array[1] = Field8408 = new Class116("VoxelPacMan", 1, "voxel_pac_man.fsh");
        class116Array[2] = Field8409 = new Class116("Squares2", 2, "squares2.fsh");
        Field8410 = class116Array;
    }

    @NotNull
    @NotNull
    public final String Method841() {
        return "assets/kismancc/shader/glslmenu/shaders/" + this.Field8411;
    }

    @NotNull
    @NotNull
    public final String Method842() {
        return this.Field8411;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class116() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field8411 = var3_1;
    }

    public static Class116[] values() {
        return (S7YIPlQ2rUd5yHzks4soQm4KFLFDKtNU[])Field8410.clone();
    }

    public static Class116 valueOf(String string) {
        return Enum.valueOf(Class116.class, string);
    }

    private static String Method843(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 172;
            cArray2[n] = (char)(cArray[n] ^ (0x7617 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

