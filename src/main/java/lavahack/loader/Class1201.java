//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import java.util.*;

class Class1201 implements Runnable
{
    private ArrayList Field13448;
    final Class625 Field13449;
    private String Field13450 = "TheKisDevs & LavaHack Development owns you";
    
    Class1201(final Class625 field13449) {
        this.Field13449 = field13449;
        this.Field13448 = new ArrayList();
    }
    
    @Override
    public void run() {
        this.Field13448.clear();
        this.Field13448.addAll(this.Field13449.Method2681());
        Class625.Method2687(this.Field13449);
        final long n = (long)(System.nanoTime() - Class625.Method2688(this.Field13449) * Double.longBitsToDouble(4609434218613702656L));
        final Iterator<Class1966> iterator = (Iterator<Class1966>)this.Field13448.iterator();
        while (iterator.hasNext()) {
            Class625.Method2689(this.Field13449, iterator.next(), n);
        }
        this.Field13448.clear();
    }
}
