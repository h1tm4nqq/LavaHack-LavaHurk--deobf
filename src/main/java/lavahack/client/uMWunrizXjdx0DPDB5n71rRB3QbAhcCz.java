/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.text.TextFormatting
 */
package lavahack.client;

import java.util.Iterator;
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.IqjHyBio3p7KLnDEo6TGyuKf2errkonL;
import lavahack.client.OVr6sF5CeH66hsotktp9WWZm4gSQtcre;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$1;
import lavahack.client.uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.util.text.TextFormatting;

public class uMWunrizXjdx0DPDB5n71rRB3QbAhcCz
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    private String Field15111 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public uMWunrizXjdx0DPDB5n71rRB3QbAhcCz() {
        super("lua");
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method443(String string, String[] stringArray) {
        void var3_10;
        if (stringArray[(int)((long)-349861710 ^ (long)-349861710)].equalsIgnoreCase("info")) {
            this.Method437("Documentation: https://cattyn.gitbook.io/ferret-lua-api/reference/readme.");
            return;
        }
        if (stringArray[(int)((long)256828535 ^ (long)256828535)].equalsIgnoreCase("load")) {
            OVr6sF5CeH66hsotktp9WWZm4gSQtcre oVr6sF5CeH66hsotktp9WWZm4gSQtcre;
            Iterator object = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16283.Field15891.iterator();
            do {
                if (object.hasNext()) continue;
                OVr6sF5CeH66hsotktp9WWZm4gSQtcre bl = new OVr6sF5CeH66hsotktp9WWZm4gSQtcre(stringArray[(int)((long)-991469534 ^ (long)-991469533)], ".lua script");
                bl.Method4453();
                leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16283.Field15891.add(bl);
                leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6788();
                this.Method437("[Lua] Successful loaded " + stringArray[(int)((long)-1000135186 ^ (long)-1000135185)] + " script!");
                return;
            } while (!(oVr6sF5CeH66hsotktp9WWZm4gSQtcre = (OVr6sF5CeH66hsotktp9WWZm4gSQtcre)object.next()).Method40().equalsIgnoreCase(stringArray[(int)-948755840L ^ 0xC7732281]));
            this.Method438("[Lua] Script " + stringArray[(int)((long)-1265232268 ^ (long)-1265232267)] + " is already loaded!");
            return;
        }
        if (!stringArray[(int)((long)89447122 ^ (long)89447122)].equalsIgnoreCase("get")) return;
        if (!leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16283.Method6537(stringArray[(int)((long)-1529931841 ^ (long)-1529931842)])) {
            this.Method438("[Lua] Script " + stringArray[(int)729710299L ^ 0x2B7E7EDA] + " doesn't exists!");
            return;
        }
        if (stringArray[(int)((long)-1418885927 ^ (long)-1418885928) << 1].equalsIgnoreCase("state")) {
            if (stringArray[(int)((long)-1778766044 ^ (long)-1778766041)].equalsIgnoreCase("true")) {
                int uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (int)1735593396L ^ 0x67730DB5;
            } else {
                if (!stringArray[(int)742937599L ^ 0x2C4853FC].equalsIgnoreCase("false")) {
                    this.Method438("[Lua] State " + stringArray[(int)((long)-155254547 ^ (long)-155254546)] + " doesn't convert to boolean type!");
                    return;
                }
                int n = (int)((long)176618358 ^ (long)176618358);
            }
            IqjHyBio3p7KLnDEo6TGyuKf2errkonL iqjHyBio3p7KLnDEo6TGyuKf2errkonL = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16283.Method6536(stringArray[(int)((long)-155484661 ^ (long)-155484662)]).Method4452(stringArray[((int)1292108243L ^ 0x4D0401D2) << 2]);
            if (iqjHyBio3p7KLnDEo6TGyuKf2errkonL != null) {
                void var3_7;
                iqjHyBio3p7KLnDEo6TGyuKf2errkonL.Method21((boolean)var3_7);
                this.Method435(TextFormatting.GRAY + "[Lua] Module " + TextFormatting.RED + stringArray[(int)((long)1998101108 ^ (long)1998101109) << 2] + TextFormatting.GRAY + " has been " + "disabled" + "!");
                return;
            }
            this.Method438("[Lua] Module " + stringArray[(int)((long)-382393418 ^ (long)-382393417) << 2] + " in script " + stringArray[(int)((long)1261489378 ^ (long)1261489379)] + " doesn't exists!");
            return;
        }
        if (!stringArray[((int)-747708021L ^ 0xD36EE18A) << 1].equalsIgnoreCase("action")) {
            this.Method438("Usage: " + this.Method448());
            return;
        }
        if (stringArray[(int)693200032L ^ 0x295164A3].equalsIgnoreCase("unload")) {
            uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13918;
        } else {
            if (!stringArray[(int)((long)-522425297 ^ (long)-522425300)].equalsIgnoreCase("reload")) {
                this.Method438("[Lua] Action " + stringArray[(int)1840852218L ^ 0x6DB92CF9] + " doesn't exists!");
                return;
            }
            uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13919;
        }
        OVr6sF5CeH66hsotktp9WWZm4gSQtcre oVr6sF5CeH66hsotktp9WWZm4gSQtcre = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16283.Method6536(stringArray[(int)-1471626543L ^ 0xA848C2D0]);
        if (oVr6sF5CeH66hsotktp9WWZm4gSQtcre == null) {
            this.Method438("[Lua] Script " + stringArray[((int)516705246L ^ 0x1ECC4BDF) << 2] + " doesn't exists!");
            return;
        }
        switch (uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$1.Field14097[var3_10.ordinal()]) {
            case 1: {
                oVr6sF5CeH66hsotktp9WWZm4gSQtcre.Method4454((boolean)((long)-84478681 ^ (long)-84478682));
                this.Method437("[Lua] Script " + oVr6sF5CeH66hsotktp9WWZm4gSQtcre.Method40() + " has been unloaded!");
                return;
            }
            case 2: {
                oVr6sF5CeH66hsotktp9WWZm4gSQtcre.Method20();
                this.Method437("[Lua] Script " + oVr6sF5CeH66hsotktp9WWZm4gSQtcre.Method40() + " has been reloaded!");
                return;
            }
        }
    }

    @Override
    public String Method447() {
        return "catlua";
    }

    @Override
    public String Method448() {
        return "\nlua info\nlua load <script name>\nlua get <script name> <action> <unload/reload>\nlua get <script name> <state> <true/false> <module from script name>";
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1300928130L ^ 0x4D8A9682;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-889724722 ^ (long)-889724879);
            int n2 = ((int)-2005737113L ^ 0x8872E11C) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-660842708L ^ 0xD89C77A3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

