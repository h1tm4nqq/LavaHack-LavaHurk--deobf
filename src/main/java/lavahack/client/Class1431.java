//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.tileentity.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0017\b\u0002\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003?\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007?\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011?\u0006\u0013" }, d2 = { "Lcom/kisman/cc/util/enums/StorageESPTileEntities;", "", "clazz", "Ljava/lang/Class;", "Lnet/minecraft/tileentity/TileEntity;", "(Ljava/lang/String;ILjava/lang/Class;)V", "validator", "Lcom/kisman/cc/util/enums/StorageESPTileEntities$Validator;", "getValidator", "()Lcom/kisman/cc/util/enums/StorageESPTileEntities$Validator;", "Chest", "EnderChest", "Furnace", "FlowerPot", "Dispenser", "Dropper", "Hopper", "Shulker", "Validator", "kisman.cc" })
public enum Class1431
{
    Field14685("Chest", 0, (Class)TileEntityChest.class), 
    Field14686("EnderChest", 1, (Class)TileEntityEnderChest.class), 
    Field14687("Furnace", 2, (Class)TileEntityFurnace.class), 
    Field14688("FlowerPot", 3, (Class)TileEntityFlowerPot.class), 
    Field14689("Dispenser", 4, (Class)TileEntityDispenser.class), 
    Field14690("Dropper", 5, (Class)TileEntityDropper.class), 
    Field14691("Hopper", 6, (Class)TileEntityHopper.class), 
    Field14692("Shulker", 7, (Class)TileEntityShulkerBox.class);
    
    private static final Class1431[] Field14693;
    @NotNull
    private final Class1680 Field14694;
    private String Field14695 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class1680 Method5718() {
        return this.Field14694;
    }
    
    private Class1431(final String name, final int ordinal, final Class clazz) {
        this.Field14694 = new Class1680(clazz);
    }
    
    private static String Method5719(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xF02 ^ 0x80));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
