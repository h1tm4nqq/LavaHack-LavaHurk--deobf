/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Objects;

public class U5qmVRlIyJ1kIK5qijwTTXUpgLl5ZCKj {
    private Object Field14195;
    private Object Field14196;
    private int Field14197;

    public U5qmVRlIyJ1kIK5qijwTTXUpgLl5ZCKj(Object object, Object object2) {
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
        int n;
        if (!(object instanceof U5qmVRlIyJ1kIK5qijwTTXUpgLl5ZCKj)) {
            return ((int)324199536L ^ 0x1352E470) != 0;
        }
        U5qmVRlIyJ1kIK5qijwTTXUpgLl5ZCKj u5qmVRlIyJ1kIK5qijwTTXUpgLl5ZCKj = (U5qmVRlIyJ1kIK5qijwTTXUpgLl5ZCKj)object;
        if (Objects.equals(this.Field14195, u5qmVRlIyJ1kIK5qijwTTXUpgLl5ZCKj.Field14195) && Objects.equals(this.Field14196, u5qmVRlIyJ1kIK5qijwTTXUpgLl5ZCKj.Field14196)) {
            n = (int)1236742320L ^ 0x49B730B1;
            return n != 0;
        }
        n = (int)197154383L ^ 0xBC0564F;
        return n != 0;
    }
}

