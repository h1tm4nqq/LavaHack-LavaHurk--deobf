/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.lang.reflect.Field;
import java.util.Arrays;
import lavahack.client.WiAMnvHLTOCKoR0L3G1xR9lrpdhcW5Q6;
import lavahack.client.bTL7yjBbNml031S1WLREQHaOGkrH4ST8;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

public class fT1ITcWlEgBcM6FmBJhTIs6s7ThCeUXF {
    private String Field15326 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method6196(Object object) {
        if (object.getClass().getAnnotation(WiAMnvHLTOCKoR0L3G1xR9lrpdhcW5Q6.class) == null) {
            return;
        }
        Arrays.stream(object.getClass().getDeclaredFields()).filter(fT1ITcWlEgBcM6FmBJhTIs6s7ThCeUXF::Method6199).filter(fT1ITcWlEgBcM6FmBJhTIs6s7ThCeUXF::Method6198).forEach(arg_0 -> fT1ITcWlEgBcM6FmBJhTIs6s7ThCeUXF.Method6197(object, arg_0));
    }

    private static void Method6197(Object object, Field field) {
        field.setAccessible((boolean)((long)835682806 ^ (long)835682807));
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7569((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)field.get(object));
    }

    private static boolean Method6198(Field field) {
        return qdws5c2TrWCYwByZ0oQUUWIrq72gJscD.class.isAssignableFrom(field.getType());
    }

    private static boolean Method6199(Field field) {
        int n;
        if (!field.isAnnotationPresent(bTL7yjBbNml031S1WLREQHaOGkrH4ST8.class)) {
            n = (int)-2010457926L ^ 0x882AD8BB;
            return n != 0;
        }
        n = (int)((long)-1507245676 ^ (long)-1507245676);
        return n != 0;
    }
}

