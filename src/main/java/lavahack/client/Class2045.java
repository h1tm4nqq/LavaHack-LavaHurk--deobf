/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import lavahack.client.Class1343;
import lavahack.client.Class140;
import lavahack.client.Class1490;
import lavahack.client.Class150;
import lavahack.client.Class1519;
import lavahack.client.Class1563;
import lavahack.client.Class158;
import lavahack.client.Class1627;
import lavahack.client.Class1628;
import lavahack.client.Class1723;
import lavahack.client.Class1962;
import lavahack.client.Class1986;
import lavahack.client.Class215;
import lavahack.client.Class276;
import lavahack.client.Class375;
import lavahack.client.Class485;
import lavahack.client.Class51;
import lavahack.client.Class538;
import lavahack.client.Class554;
import lavahack.client.Class809;
import lavahack.client.Class811;
import lavahack.client.Class813;
import lavahack.client.Class891;
import lavahack.client.Class916;
import lavahack.client.Class995;

public class Class2045
extends Class1563 {
    public static HashMap Field17384 = new HashMap();
    public char Field17385 = (char)45;
    public String Field17386 = "" + this.Field17385;
    private String Field17387 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class2045() {
        this.Method7563();
    }

    public void Method7563() {
        this.Method7564(new Class1627());
        this.Method7564(new Class1490());
        this.Method7564(new Class150());
        this.Method7564(new Class140());
        this.Method7564(new Class1343());
        this.Method7564(new Class891());
        this.Method7564(new Class916());
        this.Method7564(new Class1962());
        this.Method7564(new Class485());
        this.Method7564(new Class554());
        this.Method7564(new Class995());
        this.Method7564(new Class276());
        this.Method7564(new Class809());
        this.Method7564(new Class1519());
        this.Method7564(new Class1628());
        this.Method7564(new Class375());
        this.Method7564(new Class1723());
        this.Method7564(new Class811());
        this.Method7564(new Class538());
        this.Method7564(new Class51());
        this.Method7564(new Class215());
        this.Method7564(new Class1986());
        this.Method7564(new Class813());
    }

    private void Method7564(Class158 class158) {
        Field17384.put(class158.Method442(), class158);
    }

    public void Method7565(String ... stringArray) {
        Class158 class158;
        Iterator iterator = Field17384.values().iterator();
        do {
            if (iterator.hasNext()) continue;
            this.Method438("Cannot resolve internal command: \u00a7c" + stringArray[0]);
            return;
        } while (!(class158 = (Class158)iterator.next()).Method442().trim().equalsIgnoreCase(stringArray[0].trim()));
        class158.Method443(Arrays.toString(stringArray), stringArray);
    }

    public void Method7566(String string) {
        Class158 class158;
        String string2 = string.trim().substring(Character.toString(this.Field17385).length()).trim();
        boolean bl = string2.trim().contains(" ");
        String string3 = bl ? string2.split(" ")[0] : string2.trim();
        String[] stringArray = bl ? string2.substring(string3.length()).trim().split(" ") : new String[]{};
        Iterator iterator = Field17384.values().iterator();
        do {
            if (iterator.hasNext()) continue;
            this.Method438("Cannot resolve internal command: \u00a7c" + string3);
            return;
        } while (!(class158 = (Class158)iterator.next()).Method442().trim().equalsIgnoreCase(string3.trim()));
        class158.Method443(string2, stringArray);
    }

    public void Method7567(String string) {
        Class158 class158;
        boolean bl = string.trim().contains(" ");
        String string2 = bl ? string.split(" ")[0] : string.trim();
        String[] stringArray = bl ? string.substring(string2.length()).trim().split(" ") : new String[]{};
        Iterator iterator = Field17384.values().iterator();
        do {
            if (iterator.hasNext()) continue;
            this.Method438("Cannot resolve internal command: \u00a7c" + string2);
            return;
        } while (!(class158 = (Class158)iterator.next()).Method442().trim().equalsIgnoreCase(string2.trim()));
        class158.Method443(string, stringArray);
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 88;
            cArray2[n] = (char)(cArray[n] ^ (0x4E9E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

