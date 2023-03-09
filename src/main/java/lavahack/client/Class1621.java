/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Objects;

public class Class1621 {
    private final Object Field15577;
    private final Object Field15578;
    private String Field15579 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1621(Object object, Object object2) {
        this.Field15577 = object;
        this.Field15578 = object2;
    }

    public Object Method6307() {
        return this.Field15577;
    }

    public Object Method6308() {
        return this.Field15578;
    }

    public boolean equals(Object object) {
        if (!(object instanceof Class1621)) {
            return false;
        }
        Class1621 class1621 = (Class1621)object;
        if (!Objects.equals(this.Field15577, class1621.Field15577)) return false;
        if (!Objects.equals(this.Field15578, class1621.Field15578)) return false;
        return true;
    }
}

