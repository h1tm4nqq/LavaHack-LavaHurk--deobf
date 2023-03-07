//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/features/module/combat/holefillerrewrite/HolesList;", "Ljava/util/ArrayList;", "Lnet/minecraft/util/math/BlockPos;", "Lkotlin/collections/ArrayList;", "()V", "addPosses", "", "elements", "", "entityCheck", "", "kisman.cc"})
public final class YiaJMewdHT7xVddlXBXvHk3xrZhbIcM2
extends ArrayList {
    private String Field11939 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method3856(@NotNull @NotNull Collection collection, boolean bl) {
        Intrinsics.checkParameterIsNotNull((Object)collection, (String)"elements");
        if (!bl) {
            super.addAll(collection);
            return;
        }
        Iterator iterator = collection.iterator();
        block0: while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            Iterator iterator2 = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world.entityList.iterator();
            while (true) {
                if (!iterator2.hasNext()) continue block0;
                Entity entity = (Entity)iterator2.next();
                if (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world.getEntitiesInAABBexcluding(entity, new AxisAlignedBB(0.0, 0.0, 0.0, 1.0, 1.0, 1.0), null).size() != 0) continue;
                super.add(blockPos);
            }
            break;
        }
        return;
    }

    public boolean Method3857(BlockPos blockPos) {
        return super.contains(blockPos);
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof BlockPos)) return (int)((long)875828028 ^ (long)875828028) != 0;
        return this.Method3857((BlockPos)object);
    }

    public int Method3858(BlockPos blockPos) {
        return super.indexOf(blockPos);
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof BlockPos)) return (int)1249340463L ^ 0xB58893D0;
        return this.Method3858((BlockPos)object);
    }

    public int Method3859(BlockPos blockPos) {
        return super.lastIndexOf(blockPos);
    }

    @Override
    public final int lastIndexOf(Object object) {
        if (!(object instanceof BlockPos)) return (int)-1581970605L ^ 0x5E4AF4AC;
        return this.Method3859((BlockPos)object);
    }

    public BlockPos Method3860(int n) {
        return (BlockPos)super.remove(n);
    }

    public final BlockPos Method3861(int n) {
        return this.Method3860(n);
    }

    public boolean Method3862(BlockPos blockPos) {
        return super.remove(blockPos);
    }

    @Override
    public final boolean remove(Object object) {
        if (!(object instanceof BlockPos)) return ((int)2117583154L ^ 0x7E37C132) != 0;
        return this.Method3862((BlockPos)object);
    }

    public int Method3863() {
        return super.size();
    }

    @Override
    public final int size() {
        return this.Method3863();
    }

    private static String Method3864(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)588618870L ^ 0x23159C76;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)800425594 ^ (long)800425605);
            int n2 = ((int)-627304833L ^ 0xDA9C1664) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1607765339L ^ 0xA02B4964) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

