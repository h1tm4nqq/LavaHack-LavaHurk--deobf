//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.util.function.*;

public class Class1253 extends Class80 implements Class762
{
    private final List Field13683;
    private int Field13684;
    
    public Class1253() {
        this.Field13683 = new ArrayList();
    }
    
    @Override
    public void Method705(final Class1320 class1320) {
        super.Method705(class1320);
        if (!this.Field13683.isEmpty()) {
            this.Field13683.forEach(Class1253::Method5060);
        }
    }
    
    @Override
    public void Method706(final Class618 class618) {
        super.Method706(class618);
        if (!this.Field13683.isEmpty()) {
            this.Field13683.forEach(Class1253::Method5059);
        }
    }
    
    @Override
    public void Method710(final Class1320 class1320) {
        super.Method710(class1320);
        if (!this.Field13683.isEmpty()) {
            this.Field13683.forEach(Class1253::Method5058);
        }
    }
    
    @Override
    public void Method711(final Class618 class618) {
        super.Method711(class618);
        if (!this.Field13683.isEmpty()) {
            this.Field13683.forEach(Class1253::Method5057);
        }
    }
    
    @Override
    public void Method715(final Object o) {
        super.Method715(o);
        if (!this.Field13683.isEmpty()) {
            this.Field13683.forEach(Class1253::Method5056);
        }
    }
    
    @Override
    public void Method3147(final Class672 class672) {
        if (!this.Field13683.contains(class672)) {
            this.Field13683.add(class672);
        }
    }
    
    @Override
    public void Method3148(final Class672 class672) {
        this.Field13683.remove(class672);
    }
    
    private static void Method5056(final Object o, final Class672 class672) {
        class672.Method715(o);
    }
    
    private static void Method5057(final Class618 class618, final Class672 class619) {
        class619.Method711(class618);
    }
    
    private static void Method5058(final Class1320 class1320, final Class672 class1321) {
        class1321.Method710(class1320);
    }
    
    private static void Method5059(final Class618 class618, final Class672 class619) {
        class619.Method706(class618);
    }
    
    private static void Method5060(final Class1320 class1320, final Class672 class1321) {
        class1321.Method705(class1320);
    }
}
