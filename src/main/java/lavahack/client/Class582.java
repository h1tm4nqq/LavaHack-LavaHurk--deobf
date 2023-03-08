//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.client.*;
import net.minecraft.entity.*;
import kotlin.jvm.internal.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "run" })
final class Class582 implements Runnable
{
    final Class818 Field10481;
    final Minecraft Field10482;
    private int Field10483;
    
    @Override
    public final void run() {
        final ArrayList<Entity> list = new ArrayList<Entity>();
        for (final Entity e : this.Field10482.world.loadedEntityList) {
            if (Intrinsics.areEqual((Object)e, (Object)this.Field10482.player)) {
                continue;
            }
            final Class818 field10481 = this.Field10481;
            final Class2007 field10482 = Class2007.Field17206;
            final Class2156 field10483 = Class1269.Field13736;
            final Entity entity = e;
            Intrinsics.checkExpressionValueIsNotNull((Object)entity, "entity");
            final Class2145 method3483;
            final Class2145 class2145 = method3483 = Class818.Method3483(field10481, field10482, field10483.Method7776(entity));
            if (((method3483 != null) ? method3483.Method7723() : null) == null || class2145.Method7723().Method341() == Class1745.Field16010) {
                continue;
            }
            list.add(e);
        }
        this.Field10482.addScheduledTask((Runnable)new Class1432(this, (ArrayList)list));
    }
    
    Class582(final Class818 field10481, final Minecraft field10482) {
        this.Field10481 = field10481;
        this.Field10482 = field10482;
    }
    
    private static String Method2532(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2A2A ^ 0xFE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
