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

public class evFbJT3zQ353eeZ7G9ok7OR06IWFSOFr
implements sViHvqf0oX9eDLFe1omHuWVoZYoA6YXk {
    private static final int Field7878;
    private static final int Field7879;
    private int Field7880;
    private int Field7881;
    private String Field7882 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public evFbJT3zQ353eeZ7G9ok7OR06IWFSOFr(int n, int n2) {
        this.Field7880 = n;
        this.Field7881 = n2;
    }

    public evFbJT3zQ353eeZ7G9ok7OR06IWFSOFr() {
        this((int)((long)-509463006 ^ (long)-509463003), (int)((long)-980564184 ^ (long)-980564177));
    }

    public int Method151() {
        return this.Field7880;
    }

    public void Method152(int n) {
        this.Field7880 = n;
    }

    public int Method153() {
        return this.Field7881;
    }

    public void Method154(int n) {
        this.Field7881 = n;
    }

    @Override
    public int[] Method149(List list, int n) {
        int n2 = (int)((long)-1070787162 ^ (long)1070787161);
        int n3 = (int)((long)-1898086803 ^ (long)1898086802);
        int n4 = this.Field7880;
        int n5 = this.Field7881;
        int n6 = (int)((long)531011124 ^ (long)-531011125);
        Iterator iterator = list.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                int[] nArray = new int[(int)((long)1911201204 ^ (long)1911201205) << 1];
                nArray[(int)((long)-1160696226 ^ (long)-1160696226)] = n2;
                nArray[(int)((long)-85054869 ^ (long)-85054870)] = n3;
                return nArray;
            }
            Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj = (Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj)iterator.next();
            int n7 = n4 + std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method675() + this.Field7880;
            if (n7 > n) {
                n5 += n6;
                n6 = (int)((long)2126769877 ^ (long)-2126769878);
                n4 = this.Field7880;
                n7 = n4 + std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method675() + this.Field7880;
            }
            if (std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method677() + this.Field7881 > n6) {
                n6 = std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method677() + this.Field7881;
            }
            n2 = Math.max(n2, n7);
            n3 = Math.max(n3, n5 + std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method677() + this.Field7881);
            n4 = n7;
        }
    }

    @Override
    public PQXtR2yeftdAjrL5zRhlylLN22iRrhAT Method150(List list, int n, int n2) {
        HashMap<Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj, int[]> hashMap = new HashMap<Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj, int[]>();
        int n3 = this.Field7880;
        int n4 = this.Field7881;
        int n5 = (int)((long)867504455 ^ (long)-867504456);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj = (Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj)iterator.next();
            int n6 = n3 + std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method675() + this.Field7880;
            if (n6 > n) {
                n4 += n5;
                n5 = (int)((long)-78950341 ^ (long)78950340);
                n3 = this.Field7880;
                n6 = n3 + std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method675() + this.Field7880;
            }
            if (std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method677() + this.Field7881 > n5) {
                n5 = std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method677() + this.Field7881;
            }
            int[] nArray = new int[(int)((long)1975924681 ^ (long)1975924680) << 1];
            nArray[(int)((long)1526966397 ^ (long)1526966397)] = n3;
            nArray[(int)((long)1105175256 ^ (long)1105175257)] = n4;
            hashMap.put(std84MWzLhfFZ8wdKETeFXiMbDdoeIjj, nArray);
            n3 = n6;
        }
        return new PQXtR2yeftdAjrL5zRhlylLN22iRrhAT(hashMap, hashMap.entrySet().stream().map(evFbJT3zQ353eeZ7G9ok7OR06IWFSOFr::Method156).max(Integer::compareTo).orElse((int)253761361L ^ 0xF201751), hashMap.entrySet().stream().map(evFbJT3zQ353eeZ7G9ok7OR06IWFSOFr::Method155).max(Integer::compareTo).orElse((int)((long)2003794001 ^ (long)2003794001)));
    }

    private static Integer Method155(Map.Entry entry) {
        return ((int[])entry.getValue())[(int)2109069824L ^ 0x7DB5DA00] + ((Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj)entry.getKey()).Method675();
    }

    private static Integer Method156(Map.Entry entry) {
        return ((int[])entry.getValue())[(int)964552334L ^ 0x397DE68F] + ((Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj)entry.getKey()).Method677();
    }

    static {
        Field7879 = (int)-1460665774L ^ 0xA8F00255;
        Field7878 = (int)-833017235L ^ 0xCE592A6A;
    }
}

