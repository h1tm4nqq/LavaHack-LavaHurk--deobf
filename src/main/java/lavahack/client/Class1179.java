//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.viaversion.viaversion.api.platform.*;
import java.util.concurrent.*;

public class Class1179 implements PlatformTask
{
    private final Future Field13337;
    private int Field13338;
    
    public Class1179(final Future field13337) {
        this.Field13337 = field13337;
    }
    
    public Future leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        return this.Field13337;
    }
    
    public void cancel() {
        this.Field13337.cancel(false);
    }
    
    public Object getObject() {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    }
}
