/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/util/enums/GLSLMenuShaders;", "", "file", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getFile", "()Ljava/lang/String;", "path", "SquaresHighway", "VoxelPacMan", "Squares2", "kisman.cc"})
public final class S7YIPlQ2rUd5yHzks4soQm4KFLFDKtNU
extends Enum {
    public static final /* enum */ S7YIPlQ2rUd5yHzks4soQm4KFLFDKtNU Field8407;
    public static final /* enum */ S7YIPlQ2rUd5yHzks4soQm4KFLFDKtNU Field8408;
    public static final /* enum */ S7YIPlQ2rUd5yHzks4soQm4KFLFDKtNU Field8409;
    private static final S7YIPlQ2rUd5yHzks4soQm4KFLFDKtNU[] Field8410;
    @NotNull
    private final String Field8411;
    private String Field8412 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        S7YIPlQ2rUd5yHzks4soQm4KFLFDKtNU[] s7YIPlQ2rUd5yHzks4soQm4KFLFDKtNUArray = new S7YIPlQ2rUd5yHzks4soQm4KFLFDKtNU[(int)((long)665353859 ^ (long)665353856)];
        S7YIPlQ2rUd5yHzks4soQm4KFLFDKtNU[] s7YIPlQ2rUd5yHzks4soQm4KFLFDKtNUArray2 = s7YIPlQ2rUd5yHzks4soQm4KFLFDKtNUArray;
        s7YIPlQ2rUd5yHzks4soQm4KFLFDKtNUArray[(int)1111130431L ^ 0x423A813F] = Field8407 = new S7YIPlQ2rUd5yHzks4soQm4KFLFDKtNU("SquaresHighway", (int)-1122192356L ^ 0xBD1CB41C, "squares_highway.fsh");
        s7YIPlQ2rUd5yHzks4soQm4KFLFDKtNUArray[(int)((long)1593996635 ^ (long)1593996634)] = Field8408 = new S7YIPlQ2rUd5yHzks4soQm4KFLFDKtNU("VoxelPacMan", (int)((long)-1530479685 ^ (long)-1530479686), "voxel_pac_man.fsh");
        s7YIPlQ2rUd5yHzks4soQm4KFLFDKtNUArray[(int)((long)-323607678 ^ (long)-323607677) << 1] = Field8409 = new S7YIPlQ2rUd5yHzks4soQm4KFLFDKtNU("Squares2", ((int)331962251L ^ 0x13C9578A) << 1, "squares2.fsh");
        Field8410 = s7YIPlQ2rUd5yHzks4soQm4KFLFDKtNUArray;
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
    private S7YIPlQ2rUd5yHzks4soQm4KFLFDKtNU() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field8411 = var3_1;
    }

    public static S7YIPlQ2rUd5yHzks4soQm4KFLFDKtNU[] values() {
        return (S7YIPlQ2rUd5yHzks4soQm4KFLFDKtNU[])Field8410.clone();
    }

    public static S7YIPlQ2rUd5yHzks4soQm4KFLFDKtNU valueOf(String string) {
        return Enum.valueOf(S7YIPlQ2rUd5yHzks4soQm4KFLFDKtNU.class, string);
    }

    private static String Method843(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)940793604L ^ 0x38135F04;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1825501914 ^ (long)1825501733);
            int n2 = (int)((long)792289158 ^ (long)792289197) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1602048265 ^ (long)1602037534) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

