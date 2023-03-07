/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.IMlppUDpZQ26r9KWqHfvhtVaFArUHbNP;
import lavahack.client.eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL;
import lavahack.client.ikFh2tmmaEajuvVhfN5Stlzrrra2EacP;
import lavahack.client.mPNKUHesROKSVtFpAZyhLqRAupt8dodO;

public abstract class pfsG8JbTXjnFvZbRhJLzfGBjgbBi78oW
extends ikFh2tmmaEajuvVhfN5Stlzrrra2EacP {
    private int Field11935;

    public pfsG8JbTXjnFvZbRhJLzfGBjgbBi78oW(mPNKUHesROKSVtFpAZyhLqRAupt8dodO mPNKUHesROKSVtFpAZyhLqRAupt8dodO2) {
        super(mPNKUHesROKSVtFpAZyhLqRAupt8dodO2);
    }

    @Override
    public void Method1620() throws eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL {
        if (!this.Method1612()) {
            throw new IMlppUDpZQ26r9KWqHfvhtVaFArUHbNP("Control frame can't have fin==false set");
        }
        if (this.Method1613()) {
            throw new IMlppUDpZQ26r9KWqHfvhtVaFArUHbNP("Control frame can't have rsv1==true set");
        }
        if (this.Method1614()) {
            throw new IMlppUDpZQ26r9KWqHfvhtVaFArUHbNP("Control frame can't have rsv2==true set");
        }
        if (!this.Method1615()) return;
        throw new IMlppUDpZQ26r9KWqHfvhtVaFArUHbNP("Control frame can't have rsv3==true set");
    }

    private static String Method1628(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1961606024L ^ 0x74EBBB88;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)468523978L ^ 0x1BED1B35);
            int n2 = ((int)1735294095L ^ 0x676E7CF6) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)1362176052L ^ 0x5131017B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

