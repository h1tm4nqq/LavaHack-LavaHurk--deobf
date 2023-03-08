//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import com.kisman.cc.util.*;

public class Class354
{
    public final ArrayList Field9465;
    public final Class97 Field9466;
    public final boolean Field9467;
    public final String Field9468;
    public int Field9469;
    public int Field9470;
    public int Field9471;
    public boolean Field9472;
    public boolean Field9473;
    public boolean Field9474;
    public int Field9475;
    public int Field9476;
    private final Class1520 Field9477;
    private int Field9478;
    
    public Class354(final Class97 field9466, final int field9467, final int field9468, final boolean b) {
        this.Field9465 = new ArrayList();
        this.Field9471 = 0;
        this.Field9472 = false;
        this.Field9474 = true;
        this.Field9477 = (Class1520)new Class366(this);
        this.Field9466 = field9466;
        this.Field9467 = false;
        this.Field9468 = "";
        this.Field9469 = field9467;
        this.Field9470 = field9468;
    }
    
    public Class354(final Class97 field9466, final int field9467, final int field9468, final boolean b, final String field9469) {
        this.Field9465 = new ArrayList();
        this.Field9471 = 0;
        this.Field9472 = false;
        this.Field9474 = true;
        this.Field9477 = (Class1520)new Class366(this);
        this.Field9466 = field9466;
        this.Field9467 = true;
        this.Field9468 = field9469;
        this.Field9469 = field9467;
        this.Field9470 = field9468;
    }
    
    public Class354(final int field9469, final int field9470, final String field9471) {
        this.Field9465 = new ArrayList();
        this.Field9471 = 0;
        this.Field9472 = false;
        this.Field9474 = true;
        this.Field9477 = (Class1520)new Class366(this);
        this.Field9466 = null;
        this.Field9467 = true;
        this.Field9468 = field9471;
        this.Field9469 = field9469;
        this.Field9470 = field9470;
        int field9472 = Class1419.Field14604;
        int n = 0;
        final Iterator<Class1249> iterator = Class1796.Field16241.Field16257.Field9235.iterator();
        while (iterator.hasNext()) {
            this.Field9465.add(new Class1429((Class42)iterator.next(), field9469, field9470, field9472, n++));
            field9472 += Class1419.Field14604;
        }
    }
    
    public Class354(final Class97 field9466, final int field9467, final int field9468) {
        this.Field9465 = new ArrayList();
        this.Field9471 = 0;
        this.Field9472 = false;
        this.Field9474 = true;
        this.Field9477 = (Class1520)new Class366(this);
        this.Field9467 = false;
        this.Field9468 = "";
        int field9469 = Class1419.Field14604;
        int n = 0;
        if (!field9466.equals(Class97.Field8347)) {
            final Iterator<Class42> iterator = Class1796.Field16241.Field16254.Method1164(field9466).iterator();
            while (iterator.hasNext()) {
                this.Field9465.add(new Class1429((Class42)iterator.next(), field9467, field9468, field9469, n++));
                field9469 += Class1419.Field14604;
            }
        }
        else {
            if (!Class1796.Field16241.Field16283.Field15891.isEmpty()) {
                final Iterator<Class42> iterator2 = Class1796.Field16241.Field16283.Field15891.iterator();
                while (iterator2.hasNext()) {
                    this.Field9465.add(new Class1429((Class42)iterator2.next(), field9467, field9468, field9469, n++));
                    field9469 += Class1419.Field14604;
                }
            }
            for (final Class42 class42 : Class1796.Field16241.Field16254.Method1164(field9466)) {
                if (class42 instanceof Class1096) {
                    this.Field9465.add(new Class1429(class42, field9467, field9468, field9469, n++));
                    field9469 += Class1419.Field14604;
                }
            }
        }
        this.Field9466 = field9466;
        this.Field9469 = field9467;
        this.Field9470 = field9468;
    }
    
    public void Method66() {
        this.Field9472 = true;
        this.Field9465.clear();
        int field14604 = Class1419.Field14604;
        int n = 0;
        if (this.Field9467) {
            final Iterator<Class1249> iterator = Class1796.Field16241.Field16257.Field9235.iterator();
            while (iterator.hasNext()) {
                this.Field9465.add(new Class1429((Class42)iterator.next(), this.Field9469, this.Field9470, field14604, n++));
                field14604 += Class1419.Field14604;
            }
        }
        else if (!this.Field9466.equals(Class97.Field8347)) {
            final Iterator<Class42> iterator2 = Class1796.Field16241.Field16254.Method1164(this.Field9466).iterator();
            while (iterator2.hasNext()) {
                this.Field9465.add(new Class1429((Class42)iterator2.next(), this.Field9469, this.Field9470, field14604, n++));
                field14604 += Class1419.Field14604;
            }
        }
        else {
            final Iterator<Class42> iterator3 = Class1796.Field16241.Field16283.Field15891.iterator();
            while (iterator3.hasNext()) {
                this.Field9465.add(new Class1429((Class42)iterator3.next(), this.Field9469, this.Field9470, field14604, n++));
                field14604 += Class1419.Field14604;
            }
        }
        this.Field9472 = false;
    }
    
    public void Method67(final int n, final int n2) {
        if (this.Field9473) {
            this.Field9469 = n - this.Field9475;
            this.Field9470 = n2 - this.Field9476;
        }
        if (Class1419.Field14593) {
            new Class2070((double)this.Field9469, (double)this.Field9470, (double)(this.Field9469 + 120), (double)(this.Field9470 + Class1419.Field14604), Class1419.Method1228(this.Field9471), Class1419.Method1228(this.Field9471).Method3633(0), Double.longBitsToDouble(4617315517961601024L), (List)Collections.singletonList(Class1459.Field14826)).Method7585();
        }
        else {
            Class753.drawRectWH(this.Field9469, this.Field9470, Double.longBitsToDouble(4638144666238189568L), Class1419.Field14604, Class1419.Method1228(this.Field9471).Method3626());
        }
        Class1419.Method1224(this.Field9467 ? this.Field9468 : this.Field9466.Method807(), this.Field9469, this.Field9470, 120, Class1419.Field14604);
        if (null.Field11805.Method365()) {
            Class1419.Method1225("[" + this.Field9465.size() + "]", this.Field9467 ? this.Field9468 : this.Field9466.Method807(), (double)this.Field9469, (double)this.Field9470, Double.longBitsToDouble((long)1280049382 ^ 0x405E00004C4C00E6L), (double)Class1419.Field14604, new Class2027(255, 255, 255, 255), 2);
        }
    }
    
    private void Method68(final Class1520 class1520, final int n, final int n2) {
        class1520.Method624(n, n2);
        if (class1520 instanceof Class337) {
            final Class337 class1521 = (Class337)class1520;
            if (class1521.Method1668()) {
                for (final Class1520 class1522 : class1521.Method1669()) {
                    if (class1522.Method641()) {
                        this.Method68(class1522, n, n2);
                    }
                }
            }
        }
    }
    
    public void Method69(final int n, final int n2) {
        if (Class1419.Field14598) {
            Class1419.Method1232(this.Field9477, false, !Class1419.Field14597, Class1419.Field14597);
        }
        if (this.Field9474) {
            for (final Class1520 class1520 : this.Field9465) {
                if (!class1520.Method641()) {
                    continue;
                }
                this.Method68(class1520, n, n2);
            }
        }
    }
    
    public void Method70(final int n, final int n2) {
        if (this.Field9474 && null.Field11789.Method365()) {
            for (final Class1520 class1520 : this.Field9465) {
                if (class1520.Method641() && class1520 instanceof Class1429 && ((Class1429)class1520).Method5715(n, n2) && !((Class1429)class1520).Field14673.Field14052.isEmpty()) {
                    ((Class1429)class1520).Field14673.Method623(n, n2);
                }
            }
        }
    }
    
    private int[] Method71(final ArrayList list, final int[] array) {
        int n = array[0];
        int n2 = array[1];
        for (final Class1520 class1520 : list) {
            if (!class1520.Method641()) {
                continue;
            }
            class1520.Method629(n);
            class1520.Method630(n2);
            n += class1520.Method631();
            ++n2;
            if (!(class1520 instanceof Class337)) {
                continue;
            }
            final Class337 class1521 = (Class337)class1520;
            if (!class1521.Method1668()) {
                continue;
            }
            final int[] method71 = this.Method71(class1521.Method1669(), new int[] { n, n2 });
            n = method71[0];
            n2 = method71[1];
        }
        return new int[] { n, n2 };
    }
    
    public void Method72() {
        int field14604 = Class1419.Field14604;
        int n = this.Field9471 + 1;
        for (final Class1520 class1520 : this.Field9465) {
            if (!class1520.Method641()) {
                continue;
            }
            class1520.Method629(field14604);
            class1520.Method630(n);
            field14604 += Class1419.Field14604;
            ++n;
            if (!(class1520 instanceof Class337)) {
                continue;
            }
            final Class337 class1521 = (Class337)class1520;
            if (!class1521.Method1668()) {
                continue;
            }
            final int[] method71 = this.Method71(class1521.Method1669(), new int[] { field14604, n });
            field14604 = method71[0];
            n = method71[1];
        }
    }
    
    public boolean Method73(final int n, final int n2) {
        return n > this.Field9469 && n < this.Field9469 + 120 && n2 > this.Field9470 && n2 < this.Field9470 + Class1419.Field14604;
    }
    
    private static String Method74(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x11B8 ^ 0xEC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
