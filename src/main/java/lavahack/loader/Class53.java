/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import lavahack.loader.Class902;

public class Class53
extends Class902 {
    private static final long Field8162 = 6908339749836826785L;
    private final int Field8163;
    private int Field8164;

    public Class53() {
        this(Integer.MAX_VALUE);
    }

    public Class53(int n) {
        super(1009);
        this.Field8163 = n;
    }

    public Class53(String string, int n) {
        super(1009, string);
        this.Field8163 = n;
    }

    public Class53(String string) {
        this(string, Integer.MAX_VALUE);
    }

    public int Method484() {
        return this.Field8163;
    }
}

