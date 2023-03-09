/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1164;

public abstract class Class488 {
    protected final String Field10037;
    protected final String Field10038;
    protected final Class1164 Field10039;
    protected boolean Field10040;
    private int Field10041;

    public Class488(String string, String string2, Class1164 class1164) {
        this.Field10037 = string;
        this.Field10038 = string2;
        this.Field10039 = class1164;
        this.Field10040 = false;
    }

    public String Method2259() {
        return this.Field10037;
    }

    public String Method2260() {
        return this.Field10038;
    }

    public Class1164 Method2261() {
        return this.Field10039;
    }

    public final void Method2262() {
        this.Field10040 = true;
        this.Method2267();
    }

    public final void Method2263() {
        this.Field10040 = false;
        this.Method2268();
    }

    public boolean Method2264() {
        return this.Field10040;
    }

    public boolean Method2265() {
        if (this.Field10040) return false;
        return true;
    }

    protected void Method2266() {
        if (this.Field10040) {
            return;
        }
        this.Field10039.Method4692();
    }

    protected void Method2267() {
    }

    protected void Method2268() {
    }
}

