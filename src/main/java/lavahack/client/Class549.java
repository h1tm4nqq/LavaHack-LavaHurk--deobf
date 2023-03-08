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

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0019\b\u0002\u0012\u0010\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003?\u0006\u0002\u0010\u0005R\u001b\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f?\u0006\u000e" }, d2 = { "Lcom/kisman/cc/util/enums/CharmsRewriteEntityTypes;", "", "entityClass", "Ljava/lang/Class;", "Lnet/minecraft/entity/Entity;", "(Ljava/lang/String;ILjava/lang/Class;)V", "getEntityClass", "()Ljava/lang/Class;", "Crystal", "Player", "Monster", "Animal", "ArmorStand", "Companion", "kisman.cc" })
public enum Class549
{
    Field10327("Crystal", 0, (Class)EntityEnderCrystal.class), 
    Field10328("Player", 1, (Class)EntityPlayer.class), 
    Field10329("Monster", 2, (Class)EntityMob.class), 
    Field10330("Animal", 3, (Class)EntityAnimal.class), 
    Field10331("ArmorStand", 4, (Class)EntityArmorStand.class);
    
    private static final Class549[] Field10332;
    @NotNull
    private final Class Field10333;
    public static final Class1014 Field10334;
    private String Field10335 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    static {
        Field10334 = new Class1014((DefaultConstructorMarker)null);
    }
    
    @NotNull
    @NotNull
    public final Class Method2457() {
        return this.Field10333;
    }
    
    private Class549(final String name, final int ordinal, final Class field10333) {
        this.Field10333 = field10333;
    }
    
    private static String Method2458(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x49FF ^ 0xC8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
