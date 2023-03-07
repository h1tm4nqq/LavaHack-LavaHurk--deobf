/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaValue
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import lavahack.client.OVr6sF5CeH66hsotktp9WWZm4gSQtcre;
import org.luaj.vm2.LuaValue;

public class G8orPVpz3wasM192bOqg0VxWbq8zayHP {
    public ArrayList Field15891 = new ArrayList();
    public static boolean Field15892 = (int)-1202081883L ^ 0xB859AFA5;
    private String Field15893 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public G8orPVpz3wasM192bOqg0VxWbq8zayHP Method6532() {
        return this;
    }

    public G8orPVpz3wasM192bOqg0VxWbq8zayHP Method6533() {
        this.Field15891.clear();
        return this;
    }

    public void Method6534(String string, LuaValue luaValue) {
        Iterator iterator = this.Field15891.iterator();
        while (iterator.hasNext()) {
            OVr6sF5CeH66hsotktp9WWZm4gSQtcre oVr6sF5CeH66hsotktp9WWZm4gSQtcre = (OVr6sF5CeH66hsotktp9WWZm4gSQtcre)iterator.next();
            if (!oVr6sF5CeH66hsotktp9WWZm4gSQtcre.Method35() || !oVr6sF5CeH66hsotktp9WWZm4gSQtcre.Method29()) continue;
            oVr6sF5CeH66hsotktp9WWZm4gSQtcre.Method4457(string, luaValue);
        }
    }

    public void Method6535(String string) {
        this.Method6534(string, LuaValue.NIL);
    }

    public OVr6sF5CeH66hsotktp9WWZm4gSQtcre Method6536(String string) {
        return this.Field15891.stream().filter(arg_0 -> G8orPVpz3wasM192bOqg0VxWbq8zayHP.Method6538(string, arg_0)).findFirst().orElse(null);
    }

    public boolean Method6537(String string) {
        OVr6sF5CeH66hsotktp9WWZm4gSQtcre oVr6sF5CeH66hsotktp9WWZm4gSQtcre;
        Iterator iterator = this.Field15891.iterator();
        do {
            if (!iterator.hasNext()) return ((int)1239437627L ^ 0x49E0513B) != 0;
        } while (!(oVr6sF5CeH66hsotktp9WWZm4gSQtcre = (OVr6sF5CeH66hsotktp9WWZm4gSQtcre)iterator.next()).Method40().equalsIgnoreCase(string));
        return ((int)1023815165L ^ 0x3D062DFC) != 0;
    }

    private static boolean Method6538(String string, OVr6sF5CeH66hsotktp9WWZm4gSQtcre oVr6sF5CeH66hsotktp9WWZm4gSQtcre) {
        return oVr6sF5CeH66hsotktp9WWZm4gSQtcre.Method40().equalsIgnoreCase(string);
    }
}

