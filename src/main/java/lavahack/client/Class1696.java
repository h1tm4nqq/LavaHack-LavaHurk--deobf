//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.entity.player.*;
import java.util.function.*;
import java.util.*;
import com.kisman.cc.util.*;
import net.minecraft.entity.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00020\u0006`\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006R.\u0010\u0003\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u0004j\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005`\u0007X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\f" }, d2 = { "Lcom/kisman/cc/features/subsystem/subsystems/EnemyManager;", "Lcom/kisman/cc/features/subsystem/SubSystem;", "()V", "enemies", "Ljava/util/ArrayList;", "Ljava/util/function/Supplier;", "Lnet/minecraft/entity/player/EntityPlayer;", "Lkotlin/collections/ArrayList;", "enemy", "", "player", "nearestEnemy", "kisman.cc" })
public final class Class1696 extends Class166
{
    private static final ArrayList Field15859;
    public static final Class1696 Field15860;
    private String Field15861 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final ArrayList Method6504() {
        final ArrayList<EntityPlayer> list = new ArrayList<EntityPlayer>();
        final Iterator<Supplier<Object>> iterator = Class1696.Field15859.iterator();
        while (iterator.hasNext()) {
            final EntityPlayer e = iterator.next().get();
            if (e != null) {
                list.add(e);
            }
        }
        return list;
    }
    
    @Nullable
    @Nullable
    public final EntityPlayer Method6505() {
        EntityPlayer entityPlayer = null;
        double max_VALUE = DoubleCompanionObject.INSTANCE.getMAX_VALUE();
        for (final EntityPlayer entityPlayer2 : this.Method6504()) {
            final double getDistanceSq = Class2142.Field17803.player.getDistanceSq((Entity)entityPlayer2);
            if (entityPlayer == null || getDistanceSq < max_VALUE) {
                entityPlayer = entityPlayer2;
                max_VALUE = getDistanceSq;
            }
        }
        return entityPlayer;
    }
    
    public final boolean Method6506(@NotNull @NotNull final EntityPlayer o) {
        Intrinsics.checkParameterIsNotNull((Object)o, "player");
        return this.Method6504().contains(o);
    }
    
    private Class1696() {
        super("Enemy Manager");
    }
    
    static {
        Field15860 = new Class1696();
        Field15859 = new ArrayList();
        final Iterator<Class42> iterator = Class1796.Field16241.Field16254.Field8855.iterator();
        while (iterator.hasNext()) {
            Class1696.Field15859.add(iterator.next().Field8068);
        }
    }
    
    private static String Method1064(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x24BB ^ 0xA6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
