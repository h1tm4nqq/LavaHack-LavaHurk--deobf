/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.util.Class1952;
import java.util.ArrayList;
import lavahack.client.Class1024;
import lavahack.client.Class1367;
import lavahack.client.Class187;
import lavahack.client.Class2057;
import lavahack.client.Class694;

public class Class580
implements Class1367 {
    public static ArrayList Field10472 = new ArrayList();
    public static ArrayList Field10473 = new ArrayList();
    public static ArrayList Field10474 = new ArrayList();
    public static ArrayList Field10475 = new ArrayList();
    private int Field10476;

    private void Method2530() {
        for (Enum enum_ : Class187.values()) {
            if (Class1952.Method7240(enum_, Class2057.class)) {
                Field10472.add(enum_);
            }
            if (!Class1952.Method7240(enum_, Class694.class)) continue;
            Field10473.add(enum_);
        }
        Enum[] enumArray = Class1024.values();
        int n = enumArray.length;
        int n2 = 0;
        while (n2 < n) {
            Enum enum_;
            enum_ = enumArray[n2];
            if (Class1952.Method7240(enum_, Class2057.class)) {
                Field10474.add(enum_);
            }
            if (Class1952.Method7240(enum_, Class694.class)) {
                Field10475.add(enum_);
            }
            ++n2;
        }
    }

    static {
        new Class580().Method2530();
    }
}

