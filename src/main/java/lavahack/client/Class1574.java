//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;

class Class1574 implements Runnable
{
    private ArrayList Field15343;
    final Class641 Field15344;
    private String Field15345 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class1574(final Class641 field15344) {
        this.Field15344 = field15344;
        this.Field15343 = new ArrayList();
    }
    
    @Override
    public void run() {
        this.Field15343.clear();
        this.Field15343.addAll(this.Field15344.Method527());
        Class641.Method533(this.Field15344);
        final long n = (long)(System.nanoTime() - Class641.Method534(this.Field15344) * Double.longBitsToDouble(4609434218613702656L));
        final Iterator<Class1728> iterator = (Iterator<Class1728>)this.Field15343.iterator();
        while (iterator.hasNext()) {
            Class641.Method535(this.Field15344, iterator.next(), n);
        }
        this.Field15343.clear();
    }
}
