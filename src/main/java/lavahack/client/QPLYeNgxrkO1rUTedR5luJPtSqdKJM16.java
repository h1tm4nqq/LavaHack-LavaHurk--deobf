/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lavahack.client.PQXtR2yeftdAjrL5zRhlylLN22iRrhAT;
import lavahack.client.Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj;
import lavahack.client.sViHvqf0oX9eDLFe1omHuWVoZYoA6YXk;

public class QPLYeNgxrkO1rUTedR5luJPtSqdKJM16
implements sViHvqf0oX9eDLFe1omHuWVoZYoA6YXk {
    private static final int Field15174;
    private static final int Field15175;
    private int Field15176;
    private int Field15177;
    private int Field15178;
    private String Field15179 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public QPLYeNgxrkO1rUTedR5luJPtSqdKJM16(int n, int n2, int n3) {
        this.Field15176 = n;
        this.Field15177 = n2;
        this.Field15178 = n3;
    }

    public QPLYeNgxrkO1rUTedR5luJPtSqdKJM16(int n) {
        this(n, (int)794994913L ^ 0x2F62A8E6, (int)((long)441961261 ^ (long)441961258));
    }

    @Override
    public int[] Method149(List list, int n) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = (int)Math.ceil((double)list.size() / (double)this.Field15176);
        Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj[][] std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray = new Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj[n6][this.Field15176];
        for (int i = (int)859292660L ^ 0x3337C3F4; i < list.size(); ++i) {
            Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj;
            std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray[i / this.Field15176][i % this.Field15176] = std84MWzLhfFZ8wdKETeFXiMbDdoeIjj = (Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj)list.get(i);
        }
        int[] nArray = new int[n6];
        for (int i = (int)1393677275L ^ 0x5311D3DB; i < n6; ++i) {
            Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj[] std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray2 = std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray[i];
            n5 = (int)-2127942792L ^ 0x7ED5D487;
            Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj[] std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray3 = std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray2;
            int n7 = std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray3.length;
            for (n4 = (int)535045486L ^ 0x1FE4256E; n4 < n7; ++n4) {
                Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj = std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray3[n4];
                if (std84MWzLhfFZ8wdKETeFXiMbDdoeIjj == null || n5 >= std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method677() + this.Field15178 * ((int)((long)1791742779 ^ (long)1791742778) << 1)) continue;
                n5 = std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method677() + this.Field15178 * (((int)858528379L ^ 0x332C1A7A) << 1);
            }
            nArray[i] = n5;
        }
        int[] nArray2 = new int[this.Field15176];
        for (n3 = (int)((long)352393749 ^ (long)352393749); n3 < this.Field15176; ++n3) {
            n5 = (int)((long)-574914166 ^ (long)574914165);
            for (int i = (int)((long)-1977013392 ^ (long)-1977013392); i < n6; ++i) {
                Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj = std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray[i][n3];
                if (std84MWzLhfFZ8wdKETeFXiMbDdoeIjj == null || std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method675() + this.Field15177 * ((int)((long)117262637 ^ (long)117262636) << 1) <= n5) continue;
                n5 = std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method675() + this.Field15177 * (((int)1164744359L ^ 0x456C96A6) << 1);
            }
            nArray2[n3] = n5;
        }
        n3 = this.Field15177;
        n5 = this.Field15178;
        int[] nArray3 = nArray;
        int n8 = nArray3.length;
        for (n4 = (int)110095322L ^ 0x68FEBDA; n4 < n8; n5 += n2, ++n4) {
            n2 = nArray3[n4];
        }
        nArray3 = nArray2;
        n8 = nArray3.length;
        n4 = (int)((long)1206232768 ^ (long)1206232768);
        while (true) {
            if (n4 >= n8) {
                int[] nArray4 = new int[(int)((long)431240975 ^ (long)431240974) << 1];
                nArray4[(int)1971980252L ^ 0x758A07DC] = n3;
                nArray4[(int)758449867L ^ 0x2D3506CA] = n5;
                return nArray4;
            }
            int n9 = nArray3[n4];
            n3 += n9;
            ++n4;
        }
    }

    @Override
    public PQXtR2yeftdAjrL5zRhlylLN22iRrhAT Method150(List list, int n, int n2) {
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
        for (int i = (int)((long)-358663677 ^ (long)-358663677); i < list.size(); ++i) {
            Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj;
            std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray[i % this.Field15176][i / this.Field15176] = std84MWzLhfFZ8wdKETeFXiMbDdoeIjj = (Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj)list.get(i);
        }
        int[] nArray = new int[this.Field15176];
        for (n8 = (int)((long)-543872841 ^ (long)-543872841); n8 < std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray.length; ++n8) {
            objectArray = std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray[n8];
            n7 = (int)-850974353L ^ 0x32B8D690;
            Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj[] std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray2 = objectArray;
            object = std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray2.length;
            for (n6 = (int)((long)-2077143307 ^ (long)-2077143307); n6 < object; ++n6) {
                Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj = std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray2[n6];
                if (std84MWzLhfFZ8wdKETeFXiMbDdoeIjj == null || n7 >= std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method675() + this.Field15177 * (((int)1309683996L ^ 0x4E10311D) << 1)) continue;
                n7 = std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method675() + this.Field15177 * (((int)-257345004L ^ 0xF0A93A15) << 1);
            }
            nArray[n8] = n7;
        }
        n8 = this.Field15177 * ((int)399082008L ^ 0x17C9821B);
        objectArray = nArray;
        n7 = objectArray.length;
        for (n5 = (int)-138586909L ^ 0xF7BD54E3; n5 < n7; n8 += object, ++n5) {
            object = objectArray[n5];
        }
        int n10 = n - n8;
        n7 = n10 / this.Field15176;
        n5 = (int)((long)-1881975413 ^ (long)-1881975413);
        int[] nArray2 = nArray;
        n6 = nArray2.length;
        for (int i = (int)((long)2035424487 ^ (long)2035424487); i < n6; ++i) {
            int n11 = nArray2[i];
            if (n11 >= n7) continue;
            ++n5;
        }
        n8 = this.Field15177 * (int)((long)1542140294 ^ (long)1542140293);
        int[] nArray3 = nArray;
        n7 = nArray3.length;
        for (n5 = (int)871465570L ^ 0x33F18262; n5 < n7; n8 += n4, ++n5) {
            n4 = nArray3[n5];
        }
        int n12 = n - n8;
        n7 = (int)Math.floor((float)n12 / (float)this.Field15176);
        n5 = (int)((long)1810110225 ^ (long)1810110225);
        while (n5 < nArray.length) {
            int n13 = n5++;
            nArray[n13] = nArray[n13] + n7;
        }
        n8 = this.Field15177 * (int)((long)-199136667 ^ (long)-199136666);
        int[] nArray4 = nArray;
        n7 = nArray4.length;
        for (n5 = (int)((long)-1437005608 ^ (long)-1437005608); n5 < n7; n8 += n3, ++n5) {
            n3 = nArray4[n5];
        }
        int n14 = n - n8;
        int n15 = (int)((long)-849000796 ^ (long)-849000796);
        nArray[n15] = nArray[n15] + n14;
        int[] nArray5 = new int[n9];
        for (n14 = (int)((long)-238692208 ^ (long)-238692208); n14 < n9; ++n14) {
            n7 = (int)288830280L ^ 0xEEC8CCB7;
            for (n5 = (int)11203301L ^ 0xAAF2E5; n5 < this.Field15176; ++n5) {
                Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj = std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray[n5][n14];
                if (std84MWzLhfFZ8wdKETeFXiMbDdoeIjj == null || std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method677() <= n7) continue;
                n7 = std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method677();
            }
            nArray5[n14] = n7;
        }
        HashMap<Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj, int[]> hashMap = new HashMap<Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj, int[]>();
        n7 = this.Field15177;
        for (n5 = (int)((long)1599203254 ^ (long)1599203254); n5 < this.Field15176; n7 += nArray[n5] + this.Field15177, ++n5) {
            int n16 = this.Field15178;
            for (n6 = (int)1434536579L ^ 0x55814A83; n6 < n9; n16 += nArray5[n6] + this.Field15178, ++n6) {
                int[] nArray6 = new int[(int)((long)-501298192 ^ (long)-501298191) << 1];
                nArray6[(int)1861719592L ^ 0x6EF79628] = n7;
                nArray6[(int)((long)1784740097 ^ (long)1784740096)] = n16;
                hashMap.put(std84MWzLhfFZ8wdKETeFXiMbDdoeIjjArray[n5][n6], nArray6);
            }
        }
        n5 = (int)((long)-920942527 ^ (long)920942526);
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() == null || n5 >= ((int[])entry.getValue())[(int)1931688765L ^ 0x73233B3C] + ((Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj)entry.getKey()).Method677()) continue;
            n5 = ((int[])entry.getValue())[(int)-176104118L ^ 0xF580DD4B] + ((Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj)entry.getKey()).Method677();
        }
        n5 += this.Field15178;
        int n17 = (int)((long)45377793 ^ (long)-45377794);
        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            if (entry.getKey() == null || n17 >= ((int[])entry.getValue())[(int)-390084893L ^ 0xE8BFC6E3] + ((Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj)entry.getKey()).Method675()) continue;
            n17 = ((int[])entry.getValue())[(int)((long)888980354 ^ (long)888980354)] + ((Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj)entry.getKey()).Method675();
        }
        return new PQXtR2yeftdAjrL5zRhlylLN22iRrhAT(hashMap, n5, n17);
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
        Field15175 = (int)1451029921L ^ 0x567CF5A6;
        Field15174 = (int)-417812562L ^ 0xE718AFA9;
    }
}

