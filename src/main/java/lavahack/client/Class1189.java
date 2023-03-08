//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.concurrent.*;

class Class1189
{
    final Thread Field13385;
    Object Field13386;
    boolean Field13387;
    private String Field13388 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class1189(final Callable callable) {
        this.Field13386 = null;
        this.Field13387 = false;
        this.Field13385 = new Thread(this::Method4785);
    }
    
    private void Method4785(final Callable callable) {
        this.Field13386 = callable.call();
        this.Field13387 = true;
    }
}
