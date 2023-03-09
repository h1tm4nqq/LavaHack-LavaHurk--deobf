/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 */
package lavahack.client;

import net.minecraft.entity.Entity;

public class Class1891 {
    private final Entity Field16708;
    private final long Field16709;
    private final float Field16710;
    private final int Field16711;
    private int Field16712;

    public Class1891(Entity entity, long l, float f, int n) {
        this.Field16708 = entity;
        this.Field16709 = l;
        this.Field16710 = f;
        this.Field16711 = n;
    }

    public Entity Method7002() {
        return this.Field16708;
    }

    public float Method7003() {
        return this.Field16710;
    }

    public int Method7004() {
        return this.Field16711;
    }

    static Entity Method7005(Class1891 class1891) {
        return class1891.Field16708;
    }

    static long Method7006(Class1891 class1891) {
        return class1891.Field16709;
    }

    static float Method7007(Class1891 class1891) {
        return class1891.Field16710;
    }
}

