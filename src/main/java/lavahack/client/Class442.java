//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.concurrent.*;
import java.time.*;

public class Class442
{
    long Field9845;
    private int Field9846;
    
    public Class442() {
        this.Field9845 = -1L;
    }
    
    public boolean Method2091(final double n, final TimeUnit sourceUnit) {
        return sourceUnit.convert(Duration.ofMillis(System.currentTimeMillis() - this.Field9845).toMillis(), sourceUnit) >= n;
    }
    
    public boolean Method2092(final long n) {
        return System.currentTimeMillis() - this.Field9845 >= n;
    }
    
    public void Method2093() {
        this.Field9845 = System.currentTimeMillis();
    }
}
