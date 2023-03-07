/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.ArrayList;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

public class BsRVr263akNSUZGB7y6lErT06N1IwkDB {
    public ArrayList Field10100 = new ArrayList();
    private int Field10101;

    public void Method2315() {
        ArrayList<qdws5c2TrWCYwByZ0oQUUWIrq72gJscD> arrayList = new ArrayList<qdws5c2TrWCYwByZ0oQUUWIrq72gJscD>();
        this.Field10100.stream().filter(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD::Method376).forEach(arrayList::add);
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.forEach(BsRVr263akNSUZGB7y6lErT06N1IwkDB::Method2316);
    }

    private static void Method2316(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2) {
        float[] fArray = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method339().Method3623();
        double d = Math.ceil((double)(System.currentTimeMillis() + (0x28828CEL & 0x383044D8L)) / Double.longBitsToDouble((long)1846960663 ^ 0x403400006E166217L));
        fArray[(int)-1921878074L ^ 0x8D7277C6] = (float)((d %= Double.longBitsToDouble((long)1388879631 ^ 0x4076800052C89F0FL)) / Double.longBitsToDouble((long)841572313 ^ 0x4076800032295FD9L));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method340(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method3617(fArray, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method339().Field17324));
    }
}

