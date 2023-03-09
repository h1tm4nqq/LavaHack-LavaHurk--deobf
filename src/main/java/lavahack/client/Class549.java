/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.GT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8
 *  net.minecraft.entity.item.EntityArmorStand
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.entity.passive.EntityAnimal
 *  net.minecraft.entity.player.EntityPlayer
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Class1014;
import lavahack.client.GT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0019\b\u0002\u0012\u0010\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u001b\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\u000e"}, d2={"Lcom/kisman/cc/util/enums/CharmsRewriteEntityTypes;", "", "entityClass", "Ljava/lang/Class;", "Lnet/minecraft/entity/Entity;", "(Ljava/lang/String;ILjava/lang/Class;)V", "getEntityClass", "()Ljava/lang/Class;", "Crystal", "Player", "Monster", "Animal", "ArmorStand", "Companion", "kisman.cc"})
public final class Class549
extends Enum {
    public static final /* enum */ Class549 Field10327;
    public static final /* enum */ Class549 Field10328;
    public static final /* enum */ Class549 Field10329;
    public static final /* enum */ Class549 Field10330;
    public static final /* enum */ Class549 Field10331;
    private static final Class549[] Field10332;
    @NotNull
    private final Class Field10333;
    public static final Class1014 Field10334;
    private String Field10335 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class549[] class549Array = new Class549[5];
        Class549[] class549Array2 = class549Array;
        class549Array[0] = Field10327 = new Class549("Crystal", 0, EntityEnderCrystal.class);
        class549Array[1] = Field10328 = new Class549("Player", 1, EntityPlayer.class);
        class549Array[2] = Field10329 = new Class549("Monster", 2, EntityMob.class);
        class549Array[3] = Field10330 = new Class549("Animal", 3, EntityAnimal.class);
        class549Array[4] = Field10331 = new Class549("ArmorStand", 4, EntityArmorStand.class);
        Field10332 = class549Array;
        Field10334 = new Class1014(null);
    }

    @NotNull
    @NotNull
    public final Class Method2457() {
        return this.Field10333;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class549() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field10333 = var3_1;
    }

    public static Class549[] values() {
        return (GT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8[])Field10332.clone();
    }

    public static Class549 valueOf(String string) {
        return Enum.valueOf(Class549.class, string);
    }

    private static String Method2458(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 200;
            cArray2[n] = (char)(cArray[n] ^ (0x49FF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

