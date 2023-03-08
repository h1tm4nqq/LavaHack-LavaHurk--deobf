//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.block.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.item.*;
import net.minecraft.tileentity.*;
import net.minecraft.nbt.*;
import net.minecraft.entity.*;
import java.util.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.block.state.*;

public class Class1341 extends Class153
{
    private int Field14121;
    
    @Override
    public Class686 Method990(final NBTTagCompound nbtTagCompound) {
        final ItemStack method1528 = Class292.Method1528(nbtTagCompound);
        final byte[] getByteArray = nbtTagCompound.getByteArray("Blocks");
        final byte[] getByteArray2 = nbtTagCompound.getByteArray("Data");
        if (nbtTagCompound.hasKey("AddBlocks")) {
            final byte[] getByteArray3 = nbtTagCompound.getByteArray("AddBlocks");
            final byte[] array = new byte[getByteArray3.length * 2];
            for (int i = 0; i < getByteArray3.length; ++i) {
                array[i * 2 + 0] = (byte)(getByteArray3[i] >> 4 & 0xF);
                array[i * 2 + 1] = (byte)(getByteArray3[i] & 0xF);
            }
        }
        else if (nbtTagCompound.hasKey("Add")) {
            nbtTagCompound.getByteArray("Add");
        }
        final short getShort = nbtTagCompound.getShort("Width");
        final short getShort2 = nbtTagCompound.getShort("Length");
        final short getShort3 = nbtTagCompound.getShort("Height");
        final HashMap<Short, Short> hashMap = (HashMap<Short, Short>)new HashMap<Object, Short>();
        if (nbtTagCompound.hasKey("SchematicaMapping")) {
            final NBTTagCompound getCompoundTag = nbtTagCompound.getCompoundTag("SchematicaMapping");
            for (final String s : getCompoundTag.getKeySet()) {
                hashMap.put(getCompoundTag.getShort(s), (short)Block.REGISTRY.getIDForObject(Block.REGISTRY.getObject((Object)new ResourceLocation(s))));
            }
        }
        final Class16 class16 = new Class16();
        final Class1885 class17 = new Class1885(method1528, getShort, getShort3, getShort2);
        for (short n = 0; n < getShort; ++n) {
            for (short n2 = 0; n2 < getShort3; ++n2) {
                for (short n3 = 0; n3 < getShort2; ++n3) {
                    final int n4 = n + (n2 * getShort2 + n3) * getShort;
                    int shortValue = (getByteArray[n4] & 0xFF) | 0x0;
                    final int n5 = getByteArray2[n4] & 0xFF;
                    final Short n6;
                    if ((n6 = hashMap.get((short)shortValue)) != null) {
                        shortValue = n6;
                    }
                    final Block block = (Block)Block.REGISTRY.getObjectById(shortValue);
                    class16.set(n, n2, n3);
                    class17.Method2881(class16, block.getStateFromMeta(n5));
                }
            }
        }
        final NBTTagList getTagList = nbtTagCompound.getTagList("TileEntities", 10);
        for (int j = 0; j < getTagList.tagCount(); ++j) {
            final TileEntity method1529 = Class1433.Method5735(getTagList.getCompoundTagAt(j));
            if (method1529 != null) {
                class17.Method2884(method1529.getPos(), method1529);
            }
        }
        return class17;
    }
    
    @Override
    public boolean Method991(final NBTTagCompound nbtTagCompound, final Class686 class686) {
        final NBTTagCompound nbtTagCompound2 = new NBTTagCompound();
        class686.Method2889().writeToNBT(nbtTagCompound2);
        nbtTagCompound.setTag("Icon", (NBTBase)nbtTagCompound2);
        nbtTagCompound.setShort("Width", (short)class686.Method2891());
        nbtTagCompound.setShort("Length", (short)class686.Method2892());
        nbtTagCompound.setShort("Height", (short)class686.Method2893());
        final int n = class686.Method2891() * class686.Method2892() * class686.Method2893();
        final byte[] array = new byte[n];
        final byte[] array2 = new byte[n];
        final byte[] array3 = new byte[n];
        final byte[] array4 = new byte[(int)Math.ceil(n / Double.longBitsToDouble(4611686018427387904L))];
        final Class16 class687 = new Class16();
        final HashMap<String, Short> hashMap = new HashMap<String, Short>();
        for (int i = 0; i < class686.Method2891(); ++i) {
            for (int j = 0; j < class686.Method2893(); ++j) {
                for (int k = 0; k < class686.Method2892(); ++k) {
                    final int n2 = i + (j * class686.Method2892() + k) * class686.Method2891();
                    final IBlockState method2880 = class686.Method2880(class687.set(i, j, k));
                    final Block getBlock = method2880.getBlock();
                    final int getIDForObject = Block.REGISTRY.getIDForObject((Object)getBlock);
                    array[n2] = (byte)getIDForObject;
                    array2[n2] = (byte)getBlock.getMetaFromState(method2880);
                    if ((array3[n2] = (byte)(getIDForObject >> 8)) > 0) {}
                    final String value = String.valueOf(Block.REGISTRY.getNameForObject((Object)getBlock));
                    if (!hashMap.containsKey(value)) {
                        hashMap.put(value, (short)getIDForObject);
                    }
                }
            }
        }
        final NBTTagList list = new NBTTagList();
        final Iterator<TileEntity> iterator = class686.Method2883().iterator();
        while (iterator.hasNext()) {
            list.appendTag((NBTBase)Class1433.Method5734(iterator.next()));
        }
        for (int l = 0; l < array4.length; ++l) {
            if (l * 2 + 1 < array3.length) {
                array4[l] = (byte)(array3[l * 2 + 0] << 4 | array3[l * 2 + 1]);
            }
            else {
                array4[l] = (byte)(array3[l * 2 + 0] << 4);
            }
        }
        final NBTTagList list2 = new NBTTagList();
        final Iterator<Entity> iterator2 = class686.Method2886().iterator();
        while (iterator2.hasNext()) {
            final NBTTagCompound method2881 = Class1433.Method5736(iterator2.next());
            if (method2881 != null) {
                list2.appendTag((NBTBase)method2881);
            }
        }
        final Class39 class688 = new Class39(class686, hashMap);
        MinecraftForge.EVENT_BUS.post((Event)class688);
        final NBTTagCompound nbtTagCompound3 = new NBTTagCompound();
        for (final Map.Entry<String, Short> entry : hashMap.entrySet()) {
            nbtTagCompound3.setShort((String)entry.getKey(), (short)entry.getValue());
        }
        nbtTagCompound.setString("Materials", "Alpha");
        nbtTagCompound.setByteArray("Blocks", array);
        nbtTagCompound.setByteArray("Data", array2);
        nbtTagCompound.setTag("Entities", (NBTBase)list2);
        nbtTagCompound.setTag("TileEntities", (NBTBase)list);
        nbtTagCompound.setTag("SchematicaMapping", (NBTBase)nbtTagCompound3);
        final NBTTagCompound field8044 = class688.Field8044;
        if (!field8044.isEmpty()) {
            nbtTagCompound.setTag("ExtendedMetadata", (NBTBase)field8044);
        }
        return true;
    }
    
    @Override
    public String Method992() {
        return "schematica.format.alpha";
    }
    
    @Override
    public String Method993() {
        return ".schematic";
    }
    
    private static String Method1001(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x47E6 ^ 0x21));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
