//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;

public class Class1537 implements Class1997
{
    private static final int Field15174;
    private static final int Field15175;
    private int Field15176;
    private int Field15177;
    private int Field15178;
    private String Field15179 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1537(final int field15176, final int field15177, final int field15178) {
        this.Field15176 = field15176;
        this.Field15177 = field15177;
        this.Field15178 = field15178;
    }
    
    public Class1537(final int n) {
        this(n, 7, 7);
    }
    
    @Override
    public int[] Method149(final List list, final int n) {
        final int n2 = (int)Math.ceil(list.size() / (double)this.Field15176);
        final Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj[][] array = new Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj[n2][this.Field15176];
        for (int i = 0; i < list.size(); ++i) {
            array[i / this.Field15176][i % this.Field15176] = (Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj)list.get(i);
        }
        final int[] array2 = new int[n2];
        for (int j = 0; j < n2; ++j) {
            final Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj[] array3 = array[j];
            int n3 = -1;
            for (final Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj : array3) {
                if (std84MWzLhfFZ8wdKETeFXiMbDdoeIjj != null && n3 < ((Class1514)std84MWzLhfFZ8wdKETeFXiMbDdoeIjj).Method677() + this.Field15178 * 2) {
                    n3 = ((Class1514)std84MWzLhfFZ8wdKETeFXiMbDdoeIjj).Method677() + this.Field15178 * 2;
                }
            }
            array2[j] = n3;
        }
        final int[] array5 = new int[this.Field15176];
        for (int l = 0; l < this.Field15176; ++l) {
            int n4 = -1;
            for (int n5 = 0; n5 < n2; ++n5) {
                final Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj2 = array[n5][l];
                if (std84MWzLhfFZ8wdKETeFXiMbDdoeIjj2 != null && ((Class1514)std84MWzLhfFZ8wdKETeFXiMbDdoeIjj2).Method675() + this.Field15177 * 2 > n4) {
                    n4 = ((Class1514)std84MWzLhfFZ8wdKETeFXiMbDdoeIjj2).Method675() + this.Field15177 * 2;
                }
            }
            array5[l] = n4;
        }
        int field15177 = this.Field15177;
        int field15178 = this.Field15178;
        final int[] array6 = array2;
        for (int length2 = array6.length, n6 = 0; n6 < length2; ++n6) {
            field15178 += array6[n6];
        }
        final int[] array7 = array5;
        for (int length3 = array7.length, n7 = 0; n7 < length3; ++n7) {
            field15177 += array7[n7];
        }
        return new int[] { field15177, field15178 };
    }
    
    @Override
    public Class1834 Method150(final List list, final int n, final int n2) {
        final int n3 = (int)Math.ceil(list.size() / (double)this.Field15176);
        final Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj[][] array = new Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj[this.Field15176][n3];
        for (int i = 0; i < list.size(); ++i) {
            array[i % this.Field15176][i / this.Field15176] = (Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj)list.get(i);
        }
        final int[] array2 = new int[this.Field15176];
        for (int j = 0; j < array.length; ++j) {
            final Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj[] array3 = array[j];
            int n4 = -1;
            for (final Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj : array3) {
                if (std84MWzLhfFZ8wdKETeFXiMbDdoeIjj != null && n4 < ((Class1514)std84MWzLhfFZ8wdKETeFXiMbDdoeIjj).Method675() + this.Field15177 * 2) {
                    n4 = ((Class1514)std84MWzLhfFZ8wdKETeFXiMbDdoeIjj).Method675() + this.Field15177 * 2;
                }
            }
            array2[j] = n4;
        }
        int n5 = this.Field15177 * 3;
        final int[] array5 = array2;
        for (int length2 = array5.length, l = 0; l < length2; ++l) {
            n5 += array5[l];
        }
        final int n6 = (n - n5) / this.Field15176;
        int n7 = 0;
        final int[] array6 = array2;
        for (int length3 = array6.length, n8 = 0; n8 < length3; ++n8) {
            if (array6[n8] < n6) {
                ++n7;
            }
        }
        int n9 = this.Field15177 * 3;
        final int[] array7 = array2;
        for (int length4 = array7.length, n10 = 0; n10 < length4; ++n10) {
            n9 += array7[n10];
        }
        final int n11 = (int)Math.floor((n - n9) / (float)this.Field15176);
        for (int n12 = 0; n12 < array2.length; ++n12) {
            final int[] array8 = array2;
            final int n13 = n12;
            array8[n13] += n11;
        }
        int n14 = this.Field15177 * 3;
        final int[] array9 = array2;
        for (int length5 = array9.length, n15 = 0; n15 < length5; ++n15) {
            n14 += array9[n15];
        }
        final int n16 = n - n14;
        final int[] array10 = array2;
        final int n17 = 0;
        array10[n17] += n16;
        final int[] array11 = new int[n3];
        for (int n18 = 0; n18 < n3; ++n18) {
            int method677 = -1;
            for (int n19 = 0; n19 < this.Field15176; ++n19) {
                final Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj2 = array[n19][n18];
                if (std84MWzLhfFZ8wdKETeFXiMbDdoeIjj2 != null && ((Class1514)std84MWzLhfFZ8wdKETeFXiMbDdoeIjj2).Method677() > method677) {
                    method677 = ((Class1514)std84MWzLhfFZ8wdKETeFXiMbDdoeIjj2).Method677();
                }
            }
            array11[n18] = method677;
        }
        final HashMap<Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj, int[]> hashMap = new HashMap<Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj, int[]>();
        int field15177 = this.Field15177;
        for (int n20 = 0; n20 < this.Field15176; ++n20) {
            int field15178 = this.Field15178;
            for (int n21 = 0; n21 < n3; ++n21) {
                hashMap.put(array[n20][n21], new int[] { field15177, field15178 });
                field15178 += array11[n21] + this.Field15178;
            }
            field15177 += array2[n20] + this.Field15177;
        }
        int n22 = -1;
        for (final Map.Entry<Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj, int[]> entry : hashMap.entrySet()) {
            if (entry.getKey() != null && n22 < entry.getValue()[1] + ((Class1514)entry.getKey()).Method677()) {
                n22 = entry.getValue()[1] + ((Class1514)entry.getKey()).Method677();
            }
        }
        final int n23 = n22 + this.Field15178;
        int n24 = -1;
        for (final Map.Entry<Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj, int[]> entry2 : hashMap.entrySet()) {
            if (entry2.getKey() != null && n24 < entry2.getValue()[0] + ((Class1514)entry2.getKey()).Method675()) {
                n24 = entry2.getValue()[0] + ((Class1514)entry2.getKey()).Method675();
            }
        }
        return new Class1834(hashMap, n23, n24);
    }
    
    public int Method6082() {
        return this.Field15177;
    }
    
    public void Method6083(final int field15177) {
        this.Field15177 = field15177;
    }
    
    public int Method6084() {
        return this.Field15178;
    }
    
    public void Method6085(final int field15178) {
        this.Field15178 = field15178;
    }
    
    static {
        Field15175 = 7;
        Field15174 = 7;
    }
}
