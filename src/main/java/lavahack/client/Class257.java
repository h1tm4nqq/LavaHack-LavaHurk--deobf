//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$Phase
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ServerTickEvent
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package lavahack.client;

import java.util.LinkedHashMap;
import java.util.Map;
import lavahack.client.Class1205;
import lavahack.client.Class137;
import lavahack.client.Class1755;
import lavahack.client.Class289;
import lavahack.client.Class513;
import lavahack.client.Class542;
import lavahack.client.Class686;
import lavahack.client.Class857;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class Class257 {
    public static final Class257 Field9154 = new Class257();
    public Class686 Field9155 = null;
    public final Map Field9156 = new LinkedHashMap();
    private String Field9157 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Class257() {
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method1414(TickEvent.ServerTickEvent serverTickEvent) {
        if (serverTickEvent.phase == TickEvent.Phase.START) {
            return;
        }
        this.Method1415();
    }

    private void Method1415() {
        if (this.Field9156.size() == 0) {
            return;
        }
        EntityPlayerMP entityPlayerMP = (EntityPlayerMP)this.Field9156.keySet().iterator().next();
        Class857 class857 = (Class857)this.Field9156.remove(entityPlayerMP);
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
        } else if (class857.Field11620 == Class1205.Field13466) {
            this.Method1416(entityPlayerMP, class857);
        } else if (class857.Field11620 == Class1205.Field13468) {
            this.Method1417(entityPlayerMP, class857);
        } else if (class857.Field11620 == Class1205.Field13470) {
            this.Method1418(entityPlayerMP, class857);
            return;
        }
        this.Field9156.put(entityPlayerMP, class857);
    }

    private void Method1416(EntityPlayerMP entityPlayerMP, Class857 class857) {
        class857.Method3606(Class1205.Field13467);
        Class1755 class1755 = new Class1755(class857.Field11615);
        Class137.Field8524.sendTo((IMessage)class1755, entityPlayerMP);
    }

    private void Method1417(EntityPlayerMP entityPlayerMP, Class857 class857) {
        class857.Method3606(Class1205.Field13469);
        Class542.Field10314.trace("Sending chunk {},{},{}", (Object)class857.Field11623, (Object)class857.Field11624, (Object)class857.Field11625);
        Class289 class289 = new Class289(class857.Field11615, class857.Field11623, class857.Field11624, class857.Field11625);
        Class137.Field8524.sendTo((IMessage)class289, entityPlayerMP);
    }

    private void Method1418(EntityPlayerMP entityPlayerMP, Class857 class857) {
        Class513 class513 = new Class513(class857.Field11616);
        Class137.Field8524.sendTo((IMessage)class513, entityPlayerMP);
    }

    private static String Method1419(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 51;
            cArray2[n] = (char)(cArray[n] ^ (0x6BBA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

