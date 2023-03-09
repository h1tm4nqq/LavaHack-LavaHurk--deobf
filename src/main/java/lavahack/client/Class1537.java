/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj
 */
package lavahack.client;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lavahack.client.Class1514;
import lavahack.client.Class1834;
import lavahack.client.Class1997;
import lavahack.client.Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj;

public class Class1537
implements Class1997 {
    private static final int Field15174;
    private static final int Field15175;
    private int Field15176;
    private int Field15177;
    private int Field15178;
    private String Field15179 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1537(int n, int n2, int n3) {
        this.Field15176 = n;
        this.Field15177 = n2;
        this.Field15178 = n3;
    }

    public Class1537(int n) {
        this(n, 7, 7);
    }

    @Override
    public int[] Method149(List list, int n) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = (int)Math.ceil((double)list.size() / (double)this.Field15176);
        Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj[][] std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray = new Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj[n6][this.Field15176];
        for (int i = 0; i < list.size(); ++i) {
            Class1514 class1514 = (Class1514)list.get(i);
            std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray[i / this.Field15176][i % this.Field15176] = class1514;
        }
        int[] nArray = new int[n6];
        for (int i = 0; i < n6; ++i) {
            Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj[] std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray2 = std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray[i];
            n5 = -1;
            for (Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj : std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray2) {
                if (std84MWzLhfFZ8wdKETeFXiMbDdoeIjj == null || n5 >= std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method677() + this.Field15178 * 2) continue;
                n5 = std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method677() + this.Field15178 * 2;
            }
            nArray[i] = n5;
        }
        int[] nArray2 = new int[this.Field15176];
        for (n4 = 0; n4 < this.Field15176; ++n4) {
            n5 = -1;
            for (int i = 0; i < n6; ++i) {
                Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj = std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray[i][n4];
                if (std84MWzLhfFZ8wdKETeFXiMbDdoeIjj == null || std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method675() + this.Field15177 * 2 <= n5) continue;
                n5 = std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method675() + this.Field15177 * 2;
            }
            nArray2[n4] = n5;
        }
        n4 = this.Field15177;
        n5 = this.Field15178;
        int[] nArray3 = nArray;
        int n7 = nArray3.length;
        for (n2 = 0; n2 < n7; n5 += n3, ++n2) {
            n3 = nArray3[n2];
        }
        nArray3 = nArray2;
        n7 = nArray3.length;
        n2 = 0;
        while (n2 < n7) {
            int n8 = nArray3[n2];
            n4 += n8;
            ++n2;
        }
        return new int[]{n4, n5};
    }

    @Override
    public Class1834 Method150(List list, int n, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        Object object;
        int n7;
        Object[] objectArray;
        int n8;
        int n9 = (int)Math.ceil((double)list.size() / (double)this.Field15176);
        Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj[][] std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray = new Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj[this.Field15176][n9];
        for (int i = 0; i < list.size(); ++i) {
            Class1514 class1514 = (Class1514)list.get(i);
            std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray[i % this.Field15176][i / this.Field15176] = class1514;
        }
        int[] nArray = new int[this.Field15176];
        for (n8 = 0; n8 < std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray.length; ++n8) {
            objectArray = std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray[n8];
            n7 = -1;
            Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj[] std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray2 = objectArray;
            object = std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray2.length;
            for (n6 = 0; n6 < object; ++n6) {
                Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj = std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray2[n6];
                if (std84MWzLhfFZ8wdKETeFXiMbDdoeIjj == null || n7 >= std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method675() + this.Field15177 * 2) continue;
                n7 = std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method675() + this.Field15177 * 2;
            }
            nArray[n8] = n7;
        }
        n8 = this.Field15177 * 3;
        objectArray = nArray;
        n7 = objectArray.length;
        for (n5 = 0; n5 < n7; n8 += object, ++n5) {
            object = objectArray[n5];
        }
        int n10 = n - n8;
        n7 = n10 / this.Field15176;
        n5 = 0;
        int[] nArray2 = nArray;
        n6 = nArray2.length;
        for (int i = 0; i < n6; ++i) {
            int n11 = nArray2[i];
            if (n11 >= n7) continue;
            ++n5;
        }
        n8 = this.Field15177 * 3;
        int[] nArray3 = nArray;
        n7 = nArray3.length;
        for (n5 = 0; n5 < n7; n8 += n4, ++n5) {
            n4 = nArray3[n5];
        }
        int n12 = n - n8;
        n7 = (int)Math.floor((float)n12 / (float)this.Field15176);
        n5 = 0;
        while (n5 < nArray.length) {
            int n13 = n5++;
            nArray[n13] = nArray[n13] + n7;
        }
        n8 = this.Field15177 * 3;
        int[] nArray4 = nArray;
        n7 = nArray4.length;
        for (n5 = 0; n5 < n7; n8 += n3, ++n5) {
            n3 = nArray4[n5];
        }
        int n14 = n - n8;
        nArray[0] = nArray[0] + n14;
        int[] nArray5 = new int[n9];
        for (n14 = 0; n14 < n9; ++n14) {
            n7 = -1;
            for (n5 = 0; n5 < this.Field15176; ++n5) {
                Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj = std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray[n5][n14];
                if (std84MWzLhfFZ8wdKETeFXiMbDdoeIjj == null || std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method677() <= n7) continue;
                n7 = std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method677();
            }
            nArray5[n14] = n7;
        }
        HashMap<Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj, int[]> hashMap = new HashMap<Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj, int[]>();
        n7 = this.Field15177;
        for (n5 = 0; n5 < this.Field15176; n7 += nArray[n5] + this.Field15177, ++n5) {
            int n15 = this.Field15178;
            for (n6 = 0; n6 < n9; n15 += nArray5[n6] + this.Field15178, ++n6) {
                hashMap.put(std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray[n5][n6], new int[]{n7, n15});
            }
        }
        n5 = -1;
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() == null || n5 >= ((int[])entry.getValue())[1] + ((Class1514)entry.getKey()).Method677()) continue;
            n5 = ((int[])entry.getValue())[1] + ((Class1514)entry.getKey()).Method677();
        }
        n5 += this.Field15178;
        int n16 = -1;
        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            if (entry.getKey() == null || n16 >= ((int[])entry.getValue())[0] + ((Class1514)entry.getKey()).Method675()) continue;
            n16 = ((int[])entry.getValue())[0] + ((Class1514)entry.getKey()).Method675();
        }
        return new Class1834(hashMap, n5, n16);
    }

    public int Method6082() {
        return this.Field15177;
    }

    public void Method6083(int n) {
        this.Field15177 = n;
    }

    public int Method6084() {
        return this.Field15178;
    }

    public void Method6085(int n) {
        this.Field15178 = n;
    }

    static {
        Field15175 = 7;
        Field15174 = 7;
    }
}

