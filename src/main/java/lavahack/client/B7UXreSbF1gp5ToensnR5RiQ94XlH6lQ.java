/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs;

public abstract class B7UXreSbF1gp5ToensnR5RiQ94XlH6lQ {
    private final String Field15437;
    private final hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs Field15438;
    private int Field15439;

    public B7UXreSbF1gp5ToensnR5RiQ94XlH6lQ(String string, hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs2) {
        this.Field15437 = string;
        this.Field15438 = hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs2;
    }

    public final String Method6245() {
        return this.Field15437;
    }

    public final hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs Method6246() {
        return this.Field15438;
    }

    public abstract B7UXreSbF1gp5ToensnR5RiQ94XlH6lQ[] Method6247();

    public B7UXreSbF1gp5ToensnR5RiQ94XlH6lQ Method6248(String string) {
        B7UXreSbF1gp5ToensnR5RiQ94XlH6lQ[] b7UXreSbF1gp5ToensnR5RiQ94XlH6lQArray = this.Method6247();
        int n = b7UXreSbF1gp5ToensnR5RiQ94XlH6lQArray.length;
        int n2 = (int)-1765388410L ^ 0x96C64F86;
        while (n2 < n) {
            B7UXreSbF1gp5ToensnR5RiQ94XlH6lQ b7UXreSbF1gp5ToensnR5RiQ94XlH6lQ = b7UXreSbF1gp5ToensnR5RiQ94XlH6lQArray[n2];
            if (b7UXreSbF1gp5ToensnR5RiQ94XlH6lQ.Field15437.equals(string)) {
                return b7UXreSbF1gp5ToensnR5RiQ94XlH6lQ;
            }
            ++n2;
        }
        return null;
    }
}

