/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.common.MinecraftForge
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import lavahack.client.Class1006;
import lavahack.client.Class1015;
import lavahack.client.Class1031;
import lavahack.client.Class1052;
import lavahack.client.Class119;
import lavahack.client.Class1249;
import lavahack.client.Class1292;
import lavahack.client.Class1422;
import lavahack.client.Class1426;
import lavahack.client.Class1796;
import lavahack.client.Class1898;
import lavahack.client.Class2102;
import lavahack.client.Class2141;
import lavahack.client.Class216;
import lavahack.client.Class279;
import lavahack.client.Class295;
import lavahack.client.Class33;
import lavahack.client.Class463;
import lavahack.client.Class493;
import lavahack.client.Class539;
import lavahack.client.Class591;
import lavahack.client.Class619;
import lavahack.client.Class706;
import lavahack.client.Class715;
import lavahack.client.Class73;
import lavahack.client.Class980;
import net.minecraftforge.common.MinecraftForge;

public class Class288 {
    public ArrayList Field9235 = new ArrayList();
    private String Field9236 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class288() {
        MinecraftForge.EVENT_BUS.register((Object)this);
        ++Class1796.Field16241.Field16286.Field11713;
    }

    public void Method1522() {
        Class1796.Field16242.Method715(new Class279("HUD Module Manager"));
        this.Field9235.add(new Class1006());
        this.Field9235.add(new Class1898());
        this.Field9235.add(Class539.Field10276);
        this.Field9235.add(new Class119());
        this.Field9235.add(new Class715());
        this.Field9235.add(new Class493());
        this.Field9235.add(new Class980());
        this.Field9235.add(new Class706());
        this.Field9235.add(new Class2102());
        this.Field9235.add(new Class216());
        this.Field9235.add(new Class1015());
        this.Field9235.add(new Class1031());
        this.Field9235.add(new Class619());
        this.Field9235.add(new Class591());
        this.Field9235.add(new Class1052());
        this.Field9235.add(new Class1422());
        this.Field9235.add(new Class1426());
        this.Field9235.add(new Class463());
        this.Field9235.add(new Class2141());
        this.Field9235.add(new Class1292());
        this.Field9235.add(new Class295());
        this.Field9235.add(new Class73());
        this.Field9235.add(new Class33());
    }

    public Class1249 Method1523(String string) {
        Class1249 class1249;
        Iterator iterator = this.Field9235.iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while (!(class1249 = (Class1249)iterator.next()).Method40().equalsIgnoreCase(string));
        return class1249;
    }

    private static String Method1524(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 101;
            cArray2[n] = (char)(cArray[n] ^ (0x3F0C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

