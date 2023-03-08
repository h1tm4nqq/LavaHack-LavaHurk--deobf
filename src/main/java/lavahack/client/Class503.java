//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.util.function.*;
import com.kisman.cc.util.*;

public class Class503
{
    public ArrayList Field10100;
    private int Field10101;
    
    public Class503() {
        this.Field10100 = new ArrayList();
    }
    
    public void Method2315() {
        final ArrayList<Object> list = new ArrayList<Object>();
        this.Field10100.stream().filter(Class44::Method376).forEach(list::add);
        if (list.isEmpty()) {
            return;
        }
        list.forEach((Consumer<? super Object>)Class503::Method2316);
    }
    
    private static void Method2316(final Class44 class44) {
        final float[] method3623 = class44.Method339().Method3623();
        method3623[0] = (float)(Math.ceil((System.currentTimeMillis() + 200L) / Double.longBitsToDouble((long)1846960663 ^ 0x403400006E166217L)) % Double.longBitsToDouble((long)1388879631 ^ 0x4076800052C89F0FL) / Double.longBitsToDouble((long)841572313 ^ 0x4076800032295FD9L));
        class44.Method340(Class2027.Method3617(method3623, class44.Method339().Field17324));
    }
}
