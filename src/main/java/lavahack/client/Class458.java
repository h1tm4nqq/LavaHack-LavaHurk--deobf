//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import java.util.*;

final class Class458 implements Iterable
{
    final BlockPos Field9903;
    final BlockPos Field9904;
    private String Field9905 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class458(final BlockPos field9903, final BlockPos field9904) {
        this.Field9903 = field9903;
        this.Field9904 = field9904;
    }
    
    @Override
    public Iterator iterator() {
        return (Iterator)new Class1228(this);
    }
}
