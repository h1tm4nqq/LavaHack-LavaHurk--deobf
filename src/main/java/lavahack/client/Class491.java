//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.*;

class Class491 extends Class1058
{
    private String Field10045 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class491() {
        super((Class793)null);
    }
    
    public List Method2271(final Class1247 class1247, final Entity entity) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        final BlockPos method1905 = Class389.Method1905(entity);
        Arrays.stream(EnumFacing.HORIZONTALS).forEach((Consumer<? super EnumFacing>)Class491::Method2278);
        if (class1247 == Class1247.Field13648) {
            Arrays.stream(EnumFacing.HORIZONTALS).forEach((Consumer<? super EnumFacing>)Class491::Method2277);
        }
        else {
            list.add(method1905.up().north());
        }
        list.add(method1905.up(2).north());
        list.add(method1905.up(2));
        return list;
    }
    
    public List Method2272(final Entity entity) {
        return Arrays.stream(EnumFacing.HORIZONTALS).map((Function<? super EnumFacing, ?>)Class491::Method2276).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList());
    }
    
    public List Method2273(final Entity entity) {
        return Collections.singletonList(Class389.Method1905(entity).down());
    }
    
    public List Method2274(final Entity entity) {
        return Arrays.stream(EnumFacing.HORIZONTALS).map((Function<? super EnumFacing, ?>)Class491::Method2275).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList());
    }
    
    private static BlockPos Method2275(final Entity entity, final EnumFacing enumFacing) {
        return Class389.Method1905(entity).up(2).offset(enumFacing);
    }
    
    private static BlockPos Method2276(final Entity entity, final EnumFacing enumFacing) {
        return Class389.Method1905(entity).down().offset(enumFacing);
    }
    
    private static void Method2277(final List list, final BlockPos blockPos, final EnumFacing enumFacing) {
        list.add(blockPos.up().offset(enumFacing));
    }
    
    private static void Method2278(final List list, final BlockPos blockPos, final EnumFacing enumFacing) {
        list.add(blockPos.offset(enumFacing));
    }
    
    Class491(final Class793 class793) {
        this();
    }
}
