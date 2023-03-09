/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1260;
import lavahack.client.Class1417;
import lavahack.client.Class1418;
import lavahack.client.Class1692;
import lavahack.client.Class1715;
import lavahack.client.Class1728;
import lavahack.client.Class2129;
import lavahack.client.Class23;
import lavahack.client.Class319;
import lavahack.client.Class481;
import lavahack.client.Class482;

public abstract class Class630
implements Class1715 {
    private Class1418 Field10688;
    private int Field10689;

    @Override
    public Class1692 Method505(Class1728 class1728, Class2129 class2129, Class481 class481) throws Class23 {
        return new Class1417();
    }

    @Override
    public void Method506(Class1728 class1728, Class481 class481, Class482 class482) throws Class23 {
    }

    @Override
    public void Method507(Class1728 class1728, Class481 class481) throws Class23 {
    }

    @Override
    public void Method515(Class1728 class1728, Class1260 class1260) {
        class1728.Method544(new Class319((Class1418)class1260));
    }

    @Override
    public void Method517(Class1728 class1728, Class1260 class1260) {
    }

    @Override
    public Class1418 Method516(Class1728 class1728) {
        if (this.Field10688 != null) return this.Field10688;
        this.Field10688 = new Class1418();
        return this.Field10688;
    }
}

