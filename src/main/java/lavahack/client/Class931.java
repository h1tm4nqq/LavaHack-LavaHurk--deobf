//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import com.kisman.cc.util.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import com.google.common.base.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005?\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\n?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/features/module/combat/holefillerrewrite/HolesList;", "Ljava/util/ArrayList;", "Lnet/minecraft/util/math/BlockPos;", "Lkotlin/collections/ArrayList;", "()V", "addPosses", "", "elements", "", "entityCheck", "", "kisman.cc" })
public final class Class931 extends ArrayList
{
    private String Field11939 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final void Method3856(@NotNull @NotNull final Collection c, final boolean b) {
        Intrinsics.checkParameterIsNotNull((Object)c, "elements");
        if (b) {
            for (final BlockPos e : c) {
                final Iterator<Entity> iterator2 = (Iterator<Entity>)Class2142.Field17803.world.entityList.iterator();
                while (iterator2.hasNext()) {
                    if (Class2142.Field17803.world.getEntitiesInAABBexcluding((Entity)iterator2.next(), new AxisAlignedBB(0.0, 0.0, 0.0, 1.0, 1.0, 1.0), (Predicate)null).size() == 0) {
                        super.add(e);
                    }
                }
            }
        }
        else {
            super.addAll(c);
        }
    }
    
    public boolean Method3857(final BlockPos o) {
        return super.contains(o);
    }
    
    @Override
    public final boolean contains(final Object o) {
        return o instanceof BlockPos && this.Method3857((BlockPos)o);
    }
    
    public int Method3858(final BlockPos o) {
        return super.indexOf(o);
    }
    
    @Override
    public final int indexOf(final Object o) {
        if (o instanceof BlockPos) {
            return this.Method3858((BlockPos)o);
        }
        return -1;
    }
    
    public int Method3859(final BlockPos o) {
        return super.lastIndexOf(o);
    }
    
    @Override
    public final int lastIndexOf(final Object o) {
        if (o instanceof BlockPos) {
            return this.Method3859((BlockPos)o);
        }
        return -1;
    }
    
    public BlockPos Method3860(final int index) {
        return super.remove(index);
    }
    
    public final BlockPos Method3861(final int n) {
        return this.Method3860(n);
    }
    
    public boolean Method3862(final BlockPos o) {
        return super.remove(o);
    }
    
    @Override
    public final boolean remove(final Object o) {
        return o instanceof BlockPos && this.Method3862((BlockPos)o);
    }
    
    public int Method3863() {
        return super.size();
    }
    
    @Override
    public final int size() {
        return this.Method3863();
    }
    
    private static String Method3864(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7782 ^ 0x36));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
