//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import java.util.*;

final class Class456 implements Iterable
{
    final BlockPos Field9897;
    final BlockPos Field9898;
    private int Field9899;
    
    Class456(final BlockPos field9897, final BlockPos field9898) {
        this.Field9897 = field9897;
        this.Field9898 = field9898;
    }
    
    @Override
    public Iterator iterator() {
        return (Iterator)new Class1827(this);
    }
}
