//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import net.minecraft.util.math.*;
import java.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.entity.*;
import java.util.concurrent.*;

public class Class1391 extends Class42
{
    public Class44 Field14306;
    private final ArrayList Field14307;
    private ArrayList Field14308;
    private final Class411 Field14309;
    private String Field14310 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1391() {
        super("XRay", "Shows ores", Class97.Field8342);
        this.Field14306 = this.Method23(new Class44("Range", this, Double.longBitsToDouble(4632233691727265792L), 0.0, Double.longBitsToDouble((long)794403075 ^ 0x404900002F59A103L), false));
        this.Field14307 = new ArrayList((Collection<? extends E>)Arrays.asList(new Class1066(Class693.Field10925, (Class42)this), new Class1066(Class693.Field10926, (Class42)this), new Class1066(Class693.Field10927, (Class42)this), new Class1066(Class693.Field10928, (Class42)this), new Class1066(Class693.Field10929, (Class42)this), new Class1066(Class693.Field10930, (Class42)this), new Class1066(Class693.Field10931, (Class42)this)));
        this.Field14308 = new ArrayList();
        this.Field14309 = this.Method54();
    }
    
    @Override
    public void Method38() {
        super.Method38();
        this.Field14309.Method2004();
        this.Field14308.clear();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method5499(final RenderWorldLastEvent renderWorldLastEvent) {
        this.Field14309.Method2005(this::Method20);
        for (final BlockPos blockPos : this.Field14308) {
            final Iterator<Class817> iterator2 = (Iterator<Class817>)this.Field14307.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().Method3474(blockPos);
            }
        }
    }
    
    private void Method20() {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        for (final BlockPos e : Class2155.Method7756((Entity)Class1391.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field14306.Method368(), true, false)) {
            final Iterator<Class817> iterator2 = this.Field14307.iterator();
            while (iterator2.hasNext()) {
                if (iterator2.next().Method3473(e)) {
                    list.add(e);
                }
            }
        }
        Class1391.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask((Callable)this::Method5500);
    }
    
    private ArrayList Method5500(final ArrayList field14308) throws Exception {
        return this.Field14308 = field14308;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x90C ^ 0xE1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
