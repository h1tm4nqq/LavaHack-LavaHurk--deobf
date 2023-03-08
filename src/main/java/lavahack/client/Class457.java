//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import java.util.*;

final class Class457 implements Iterable
{
    final BlockPos Field9900;
    final BlockPos Field9901;
    private String Field9902 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class457(final BlockPos field9900, final BlockPos field9901) {
        this.Field9900 = field9900;
        this.Field9901 = field9901;
    }
    
    @Override
    public Iterator iterator() {
        return (Iterator)new Class675(this);
    }
}
