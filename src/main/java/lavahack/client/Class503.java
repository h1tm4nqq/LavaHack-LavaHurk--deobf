/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.util.ArrayList;
import lavahack.client.Class44;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

public class Class503 {
    public ArrayList Field10100 = new ArrayList();
    private int Field10101;

    public void Method2315() {
        ArrayList<qdws5c2TrWCYwByZ0oQUUWIrq72gJscD> arrayList = new ArrayList<qdws5c2TrWCYwByZ0oQUUWIrq72gJscD>();
        this.Field10100.stream().filter(Class44::Method376).forEach(arrayList::add);
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.forEach(Class503::Method2316);
    }

    private static void Method2316(Class44 class44) {
        float[] fArray = class44.Method339().Method3623();
        double d = Math.ceil((double)(System.currentTimeMillis() + 200L) / Double.longBitsToDouble((long)1846960663 ^ 0x403400006E166217L));
        fArray[0] = (float)((d %= Double.longBitsToDouble((long)1388879631 ^ 0x4076800052C89F0FL)) / Double.longBitsToDouble((long)841572313 ^ 0x4076800032295FD9L));
        class44.Method340(Class2027.Method3617(fArray, class44.Method339().Field17324));
    }
}

