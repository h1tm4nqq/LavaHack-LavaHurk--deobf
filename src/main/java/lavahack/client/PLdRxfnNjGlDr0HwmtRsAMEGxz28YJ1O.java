/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lavahack.client.EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP;
import lavahack.client.PQXtR2yeftdAjrL5zRhlylLN22iRrhAT;
import lavahack.client.Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj;
import lavahack.client.sViHvqf0oX9eDLFe1omHuWVoZYoA6YXk;

public class PLdRxfnNjGlDr0HwmtRsAMEGxz28YJ1O
extends Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj {
    protected List Field16306 = new ArrayList();
    protected Map Field16307 = new HashMap();
    protected PQXtR2yeftdAjrL5zRhlylLN22iRrhAT Field16308;
    private final sViHvqf0oX9eDLFe1omHuWVoZYoA6YXk Field16309;
    private String Field16310 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public PLdRxfnNjGlDr0HwmtRsAMEGxz28YJ1O(EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP, sViHvqf0oX9eDLFe1omHuWVoZYoA6YXk sViHvqf0oX9eDLFe1omHuWVoZYoA6YXk2) {
        super(eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP);
        this.Field16309 = sViHvqf0oX9eDLFe1omHuWVoZYoA6YXk2;
    }

    @Override
    public void Method668() {
        if (this.Method679()) {
            this.Method6813();
            this.Method6811();
        }
        this.Method6812();
        Iterator iterator = this.Field16306.iterator();
        while (iterator.hasNext()) {
            Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj = (Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj)iterator.next();
            std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method668();
        }
    }

    @Override
    public void Method669() {
        Iterator iterator = this.Field16306.iterator();
        while (iterator.hasNext()) {
            Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj = (Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj)iterator.next();
            std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method669();
        }
    }

    @Override
    public boolean Method679() {
        Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj;
        Iterator iterator = this.Field16306.iterator();
        do {
            if (!iterator.hasNext()) return super.Method679();
        } while (!(std84MWzLhfFZ8wdKETeFXiMbDdoeIjj = (Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj)iterator.next()).Method679());
        return ((int)-1402110921L ^ 0xAC6D7C36) != 0;
    }

    private void Method6811() {
        Iterator iterator = this.Field16306.iterator();
        while (iterator.hasNext()) {
            Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj = (Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj)iterator.next();
            std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method680(((int)478751359L ^ 0x1C892A7F) != 0);
        }
    }

    protected void Method6812() {
        Iterator iterator = this.Field16306.iterator();
        while (iterator.hasNext()) {
            Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj = (Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj)iterator.next();
            int[] nArray = (int[])this.Field16307.get(std84MWzLhfFZ8wdKETeFXiMbDdoeIjj);
            if (nArray == null) {
                this.Method6813();
                this.Method6812();
                return;
            }
            std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method672(this.Method671() + nArray[(int)((long)1596314209 ^ (long)1596314209)]);
            std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method674(this.Method673() + nArray[(int)((long)68559663 ^ (long)68559662)]);
        }
    }

    public void Method6813() {
        this.Method6814(this.Method675(), this.Method677(), (boolean)((long)842043887 ^ (long)842043886));
    }

    protected void Method6814(int n, int n2, boolean bl) {
        this.Field16308 = this.Field16309.Method150(this.Field16306, n, n2);
        this.Field16307 = this.Field16308.Method6901();
        if (!bl) return;
        this.Method678(this.Field16308.Method6903());
    }

    public void Method6815(Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj) {
        this.Field16306.add(std84MWzLhfFZ8wdKETeFXiMbDdoeIjj);
        this.Method6814(super.Method675(), super.Method677(), (boolean)((long)-145804748 ^ (long)-145804747));
    }

    @Override
    public boolean Method683(int n, int n2, boolean bl) {
        boolean[] blArray = new boolean[(int)((long)1778428186 ^ (long)1778428187)];
        blArray[(int)((long)467992158 ^ (long)467992158)] = (int)1952086131L ^ 0x745A7873;
        boolean[] blArray2 = blArray;
        this.Field16306.stream().sorted(Comparator.comparingInt(Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj::Method670)).forEach(arg_0 -> PLdRxfnNjGlDr0HwmtRsAMEGxz28YJ1O.Method6821(blArray2, n, n2, bl, arg_0));
        return blArray2[(int)((long)-114939570 ^ (long)-114939570)];
    }

    @Override
    public boolean Method684(int n, int n2, int n3, boolean bl) {
        boolean[] blArray = new boolean[(int)((long)-190743038 ^ (long)-190743037)];
        blArray[(int)((long)403675399 ^ (long)403675399)] = (int)-482254314L ^ 0xE3416216;
        boolean[] blArray2 = blArray;
        this.Field16306.stream().sorted(Comparator.comparingInt(Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj::Method670)).forEach(arg_0 -> PLdRxfnNjGlDr0HwmtRsAMEGxz28YJ1O.Method6820(blArray2, n, n2, n3, bl, arg_0));
        return blArray2[(int)-1991204130L ^ 0x8950A2DE];
    }

    @Override
    public boolean Method682(int n, int n2, int n3, boolean bl) {
        boolean[] blArray = new boolean[(int)1201407757L ^ 0x479C070C];
        blArray[(int)((long)-885381163 ^ (long)-885381163)] = (int)((long)621778153 ^ (long)621778153);
        boolean[] blArray2 = blArray;
        this.Field16306.stream().sorted(Comparator.comparingInt(Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj::Method670)).forEach(arg_0 -> PLdRxfnNjGlDr0HwmtRsAMEGxz28YJ1O.Method6819(blArray2, n, n2, n3, bl, arg_0));
        return blArray2[(int)((long)-274122033 ^ (long)-274122033)];
    }

    @Override
    public boolean Method681(int n, char c) {
        boolean[] blArray = new boolean[(int)((long)-640822039 ^ (long)-640822040)];
        blArray[(int)1698229489L ^ 0x6538ECF1] = (int)-1924105985L ^ 0x8D5078FF;
        boolean[] blArray2 = blArray;
        this.Field16306.stream().sorted(Comparator.comparingInt(Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj::Method670)).forEach(arg_0 -> PLdRxfnNjGlDr0HwmtRsAMEGxz28YJ1O.Method6818(blArray2, n, c, arg_0));
        return blArray2[(int)((long)-1797437184 ^ (long)-1797437184)];
    }

    @Override
    public int Method675() {
        if (super.Method675() > 0) return super.Method675();
        this.Method6816();
        return super.Method675();
    }

    @Override
    public int Method677() {
        if (super.Method677() > 0) return super.Method677();
        this.Method6816();
        return super.Method677();
    }

    private void Method6816() {
        for (Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj : this.Field16306) {
            if (!(std84MWzLhfFZ8wdKETeFXiMbDdoeIjj instanceof PLdRxfnNjGlDr0HwmtRsAMEGxz28YJ1O)) continue;
            ((PLdRxfnNjGlDr0HwmtRsAMEGxz28YJ1O)std84MWzLhfFZ8wdKETeFXiMbDdoeIjj).Method6816();
        }
        Object object = this.Field16309.Method149(this.Field16306, Integer.MAX_VALUE);
        if (super.Method675() <= 0) {
            this.Method676((int)object[(int)-1499311386L ^ 0xA6A252E6]);
        }
        if (super.Method677() > 0) return;
        this.Method678((int)object[(int)1816706339L ^ 0x6C48BD22]);
    }

    public void Method6817() {
        this.Field16306.clear();
        this.Method6814(super.Method675(), super.Method677(), ((int)-674729426L ^ 0xD7C8722F) != 0);
    }

    private static void Method6818(boolean[] blArray, int n, char c, Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj) {
        if (blArray[(int)((long)2069230411 ^ (long)2069230411)]) return;
        if (!std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method681(n, c)) return;
        blArray[(int)-1999116437L ^ 0x88D7E76B] = (int)1714111299L ^ 0x662B4342;
    }

    private static void Method6819(boolean[] blArray, int n, int n2, int n3, boolean bl, Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj) {
        if (blArray[(int)-93429834L ^ 0xFA6E5FB6]) return;
        if (!std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method682(n, n2, n3, bl)) return;
        blArray[(int)-3236506L ^ 0xFFCE9D66] = (int)449034520L ^ 0x1AC3B919;
    }

    private static void Method6820(boolean[] blArray, int n, int n2, int n3, boolean bl, Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj) {
        if (blArray[(int)907957332L ^ 0x361E5454]) return;
        if (!std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method684(n, n2, n3, bl)) return;
        blArray[(int)((long)293263852 ^ (long)293263852)] = (int)((long)-1661623561 ^ (long)-1661623562);
    }

    private static void Method6821(boolean[] blArray, int n, int n2, boolean bl, Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj std84MWzLhfFZ8wdKETeFXiMbDdoeIjj) {
        if (blArray[(int)307369699L ^ 0x125216E3]) return;
        if (!std84MWzLhfFZ8wdKETeFXiMbDdoeIjj.Method683(n, n2, bl)) return;
        blArray[(int)((long)-1202247989 ^ (long)-1202247989)] = (int)((long)1345913427 ^ (long)1345913426);
    }
}

