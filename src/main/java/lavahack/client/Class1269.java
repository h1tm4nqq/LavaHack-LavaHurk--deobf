//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.item.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0010\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003?\u0006\u0002\u0010\u0005R\u001b\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f?\u0006\u0011" }, d2 = { "Lcom/kisman/cc/util/enums/EntityESPTypes;", "", "entityClass", "Ljava/lang/Class;", "Lnet/minecraft/entity/Entity;", "(Ljava/lang/String;ILjava/lang/Class;)V", "getEntityClass", "()Ljava/lang/Class;", "Player", "Crystal", "Monster", "Animal", "Item", "XPOrb", "ItemFrame", "ArmorStand", "Companion", "kisman.cc" })
public enum Class1269
{
    Field13726("Player", 0, (Class)EntityPlayer.class), 
    Field13727("Crystal", 1, (Class)EntityEnderCrystal.class), 
    Field13728("Monster", 2, (Class)EntityMob.class), 
    Field13729("Animal", 3, (Class)EntityAnimal.class), 
    Field13730("Item", 4, (Class)EntityItem.class), 
    Field13731("XPOrb", 5, (Class)EntityXPOrb.class), 
    Field13732("ItemFrame", 6, (Class)EntityItemFrame.class), 
    Field13733("ArmorStand", 7, (Class)EntityArmorStand.class);
    
    private static final Class1269[] Field13734;
    @NotNull
    private final Class Field13735;
    public static final Class2156 Field13736;
    private int Field13737;
    
    static {
        Field13736 = new Class2156(null);
    }
    
    @NotNull
    @NotNull
    public final Class Method5102() {
        return this.Field13735;
    }
    
    private Class1269(final String name, final int ordinal, final Class field13735) {
        this.Field13735 = field13735;
    }
    
    private static String Method5103(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x20F0 ^ 0x52));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
