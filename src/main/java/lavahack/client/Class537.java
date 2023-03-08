//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import net.minecraft.entity.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "run" })
final class Class537 implements Runnable
{
    final Class1226 Field10267;
    private String Field10268 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public final void run() {
        if (Class2142.Field17803.world != null) {
            final Entity getEntityByID = Class2142.Field17803.world.getEntityByID(Class1226.Method4931(this.Field10267));
            if (getEntityByID != null) {
                getEntityByID.setPosition(Class1226.Method4933(this.Field10267), Class1226.Method4935(this.Field10267), Class1226.Method4937(this.Field10267));
            }
        }
    }
    
    Class537(final Class1226 field10267) {
        this.Field10267 = field10267;
    }
}
