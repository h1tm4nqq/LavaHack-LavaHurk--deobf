/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 */
package lavahack.loader;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.AccessController;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lavahack.loader.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.loader.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u00a8\u0006\u0002"}, d2={"initProvider", "", "kisman.cc"})
public final class vl3icpcdb9cWvH39NKe3weWQwVdWO7AV {
    private String Field12328 = "TheKisDevs & LavaHack Development owns you";

    public static final void Method4052() {
        Field field;
        UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        block4: {
            Method method;
            uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = new UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV();
            AccessController.doPrivileged(new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV));
            Class[] classArray = new Class[(int)1912926012L ^ 0x7204EF3D];
            classArray[(int)((long)10511709 ^ (long)10511709)] = Boolean.TYPE;
            Method method2 = method = Class.class.getDeclaredMethod("getDeclaredFields0", classArray);
            Intrinsics.checkExpressionValueIsNotNull((Object)method2, (String)"jvmFields");
            method2.setAccessible(((int)-1540170025L ^ 0xA432DED6) != 0);
            Object[] objectArray = new Object[(int)((long)163468215 ^ (long)163468214)];
            objectArray[(int)621254719L ^ 0x2507983F] = ((int)1833271240L ^ 0x6D457FC8) != 0;
            Object object = method.invoke(System.class, objectArray);
            if (object == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<java.lang.reflect.Field>");
            }
            Field[] fieldArray = (Field[])object;
            int n = fieldArray.length;
            int n2 = (int)-1139601947L ^ 0xBC130DE5;
            while (n2 < n) {
                field = fieldArray[n2];
                if (field.getName().equals("security")) {
                    field.setAccessible((boolean)((long)1588504196 ^ (long)1588504197));
                    String string = field.get(null).getClass().getName();
                    Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"field.get(null)::class.java.name");
                    if (StringsKt.startsWith$default((String)string, (String)"net.futureclient.", ((int)465914608L ^ 0x1BC54AF0) != 0, (int)(((int)650367404L ^ 0x26C3D1AD) << 1), null)) {
                        return;
                    }
                    break block4;
                }
                ++n2;
            }
            return;
        }
        field.set(null, uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
    }

    private static String Method4053(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1623448541L ^ 0x9F3C2423;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1267203419L ^ 0xB478025A);
            int n2 = ((int)2146537457L ^ 0x7FF18FEA) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)2031640873 ^ (long)2031642524) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

