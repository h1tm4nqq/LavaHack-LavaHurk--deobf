/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Objects;

public class Class1361 {
    private Object Field14195;
    private Object Field14196;
    private int Field14197;

    public Class1361(Object object, Object object2) {
        this.Field14195 = object;
        this.Field14196 = object2;
    }

    public Object Method5431() {
        return this.Field14195;
    }

    public void Method5432(Object object) {
        this.Field14195 = object;
    }

    public Object Method5433() {
        return this.Field14196;
    }

    public void Method5434(Object object) {
        this.Field14196 = object;
    }

    public boolean equals(Object object) {
        if (!(object instanceof Class1361)) {
            return false;
        }
        Class1361 class1361 = (Class1361)object;
        if (!Objects.equals(this.Field14195, class1361.Field14195)) return false;
        if (!Objects.equals(this.Field14196, class1361.Field14196)) return false;
        return true;
    }
}

