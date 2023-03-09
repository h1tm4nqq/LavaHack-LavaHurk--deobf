/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW
 *  net.minecraft.entity.item.EntityArmorStand
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.item.EntityItemFrame
 *  net.minecraft.entity.item.EntityXPOrb
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.entity.passive.EntityAnimal
 *  net.minecraft.entity.player.EntityPlayer
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Class2156;
import lavahack.client.oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0010\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u001b\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f\u00a8\u0006\u0011"}, d2={"Lcom/kisman/cc/util/enums/EntityESPTypes;", "", "entityClass", "Ljava/lang/Class;", "Lnet/minecraft/entity/Entity;", "(Ljava/lang/String;ILjava/lang/Class;)V", "getEntityClass", "()Ljava/lang/Class;", "Player", "Crystal", "Monster", "Animal", "Item", "XPOrb", "ItemFrame", "ArmorStand", "Companion", "kisman.cc"})
public final class Class1269
extends Enum {
    public static final /* enum */ Class1269 Field13726;
    public static final /* enum */ Class1269 Field13727;
    public static final /* enum */ Class1269 Field13728;
    public static final /* enum */ Class1269 Field13729;
    public static final /* enum */ Class1269 Field13730;
    public static final /* enum */ Class1269 Field13731;
    public static final /* enum */ Class1269 Field13732;
    public static final /* enum */ Class1269 Field13733;
    private static final Class1269[] Field13734;
    @NotNull
    private final Class Field13735;
    public static final Class2156 Field13736;
    private int Field13737;

    static {
        Class1269[] class1269Array = new Class1269[8];
        Class1269[] class1269Array2 = class1269Array;
        class1269Array[0] = Field13726 = new Class1269("Player", 0, EntityPlayer.class);
        class1269Array[1] = Field13727 = new Class1269("Crystal", 1, EntityEnderCrystal.class);
        class1269Array[2] = Field13728 = new Class1269("Monster", 2, EntityMob.class);
        class1269Array[3] = Field13729 = new Class1269("Animal", 3, EntityAnimal.class);
        class1269Array[4] = Field13730 = new Class1269("Item", 4, EntityItem.class);
        class1269Array[5] = Field13731 = new Class1269("XPOrb", 5, EntityXPOrb.class);
        class1269Array[6] = Field13732 = new Class1269("ItemFrame", 6, EntityItemFrame.class);
        class1269Array[7] = Field13733 = new Class1269("ArmorStand", 7, EntityArmorStand.class);
        Field13734 = class1269Array;
        Field13736 = new Class2156(null);
    }

    @NotNull
    @NotNull
    public final Class Method5102() {
        return this.Field13735;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1269() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field13735 = var3_1;
    }

    public static Class1269[] values() {
        return (oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW[])Field13734.clone();
    }

    public static Class1269 valueOf(String string) {
        return Enum.valueOf(Class1269.class, string);
    }

    private static String Method5103(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 82;
            cArray2[n] = (char)(cArray[n] ^ (0x20F0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

