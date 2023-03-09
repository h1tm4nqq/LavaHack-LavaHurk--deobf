/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaValue
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import lavahack.client.Class1089;
import org.luaj.vm2.LuaValue;

public class Class1705 {
    public ArrayList Field15891 = new ArrayList();
    public static boolean Field15892 = false;
    private String Field15893 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1705 Method6532() {
        return this;
    }

    public Class1705 Method6533() {
        this.Field15891.clear();
        return this;
    }

    public void Method6534(String string, LuaValue luaValue) {
        Iterator iterator = this.Field15891.iterator();
        while (iterator.hasNext()) {
            Class1089 class1089 = (Class1089)iterator.next();
            if (!class1089.Method35() || !class1089.Method29()) continue;
            class1089.Method4457(string, luaValue);
        }
    }

    public void Method6535(String string) {
        this.Method6534(string, LuaValue.NIL);
    }

    public Class1089 Method6536(String string) {
        return this.Field15891.stream().filter(arg_0 -> Class1705.Method6538(string, arg_0)).findFirst().orElse(null);
    }

    public boolean Method6537(String string) {
        Class1089 class1089;
        Iterator iterator = this.Field15891.iterator();
        do {
            if (!iterator.hasNext()) return false;
        } while (!(class1089 = (Class1089)iterator.next()).Method40().equalsIgnoreCase(string));
        return true;
    }

    private static boolean Method6538(String string, Class1089 class1089) {
        return class1089.Method40().equalsIgnoreCase(string);
    }
}

