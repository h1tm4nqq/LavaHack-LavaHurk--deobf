//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.network.play.server.*;
import net.minecraft.network.*;
import java.util.*;

public class Class1137 extends Class42
{
    private final Class44 Field13150;
    private final Class44 Field13151;
    public List Field13152;
    @Class1801
    private final Class618 Field13153;
    private int Field13154;
    
    public Class1137() {
        super("NoChunkUnload", Class97.Field8340, true);
        this.Field13150 = this.Method23(new Class44("PacketsPerTicks", this, Double.longBitsToDouble((long)712003171 ^ 0x401400002A704E63L), 1.0, Double.longBitsToDouble(4632233691727265792L), true));
        this.Field13151 = this.Method23(new Class44("Unlimited", this, false));
        this.Field13152 = new Vector();
        this.Field13153 = new Class618(this::Method4630, new Predicate[0]);
    }
    
    @Override
    public void Method38() {
        super.Method38();
        this.Field13152.clear();
    }
    
    @Override
    public void Method39() {
        super.Method39();
        final Iterator<SPacketUnloadChunk> iterator = this.Field13152.iterator();
        while (iterator.hasNext()) {
            Class937.Method3872((Packet)iterator.next());
        }
        this.Field13152.clear();
    }
    
    private void Method4630(final Class544 class544) {
        if (!(class544.Method982() instanceof SPacketUnloadChunk)) {
            return;
        }
        this.Field13152.add(class544.Method982());
        class544.Method158();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2775 ^ 0x8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
