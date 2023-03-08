//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.entity.player.*;
import net.minecraftforge.fml.common.network.simpleimpl.*;

public class Class257
{
    public static final Class257 Field9154;
    public Class686 Field9155;
    public final Map Field9156;
    private String Field9157 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class257() {
        this.Field9155 = null;
        this.Field9156 = new LinkedHashMap();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method1414(final TickEvent$ServerTickEvent tickEvent$ServerTickEvent) {
        if (tickEvent$ServerTickEvent.phase == TickEvent$Phase.START) {
            return;
        }
        this.Method1415();
    }
    
    private void Method1415() {
        if (this.Field9156.size() == 0) {
            return;
        }
        final EntityPlayerMP entityPlayerMP = this.Field9156.keySet().iterator().next();
        final Class857 class857 = this.Field9156.remove(entityPlayerMP);
        if (class857 == null) {
            return;
        }
        if (!class857.Field11620.Method4867()) {
            if (++class857.Field11621 >= 300) {
                if (++class857.Field11622 >= 5) {
                    Class542.Field10314.warn("{}'s download was dropped!", (Object)entityPlayerMP.getName());
                    return;
                }
                Class542.Field10314.warn("{}'s download timed out, retrying (#{})", (Object)entityPlayerMP.getName(), (Object)class857.Field11622);
                this.Method1417(entityPlayerMP, class857);
                class857.Field11621 = 0;
            }
        }
        else if (class857.Field11620 == Class1205.Field13466) {
            this.Method1416(entityPlayerMP, class857);
        }
        else if (class857.Field11620 == Class1205.Field13468) {
            this.Method1417(entityPlayerMP, class857);
        }
        else if (class857.Field11620 == Class1205.Field13470) {
            this.Method1418(entityPlayerMP, class857);
            return;
        }
        this.Field9156.put(entityPlayerMP, class857);
    }
    
    private void Method1416(final EntityPlayerMP entityPlayerMP, final Class857 class857) {
        class857.Method3606(Class1205.Field13467);
        Class137.Field8524.sendTo((IMessage)new Class1755(class857.Field11615), entityPlayerMP);
    }
    
    private void Method1417(final EntityPlayerMP entityPlayerMP, final Class857 class857) {
        class857.Method3606(Class1205.Field13469);
        Class542.Field10314.trace("Sending chunk {},{},{}", (Object)class857.Field11623, (Object)class857.Field11624, (Object)class857.Field11625);
        Class137.Field8524.sendTo((IMessage)new Class289(class857.Field11615, class857.Field11623, class857.Field11624, class857.Field11625), entityPlayerMP);
    }
    
    private void Method1418(final EntityPlayerMP entityPlayerMP, final Class857 class857) {
        Class137.Field8524.sendTo((IMessage)new Class513(class857.Field11616), entityPlayerMP);
    }
    
    static {
        Field9154 = new Class257();
    }
    
    private static String Method1419(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6BBA ^ 0x33));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
