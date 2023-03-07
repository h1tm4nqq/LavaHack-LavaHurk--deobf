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
import lavahack.client.ELM7I72rYwY5mTWSyFazBkuX9BwTPath;
import lavahack.client.ELM7I72rYwY5mTWSyFazBkuX9BwTPath$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.L2xmcmr9Tre1qBd8su5PcdMk38D1GW4H;
import lavahack.client.g566FzyW5WmPBZ7TRhmIn8VXbKICOcHE;
import lavahack.client.meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU;
import lavahack.client.pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX;
import lavahack.client.uousdX8ncJWKUP3BS9cexvVPwWHrFdDD;
import lavahack.client.zDh1G3IeczcFWyYeWhMc3jw64oAZBhvl;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class Mw1rH0enxHoGt2yOomU73geB3GiYFx8A {
    public static final Mw1rH0enxHoGt2yOomU73geB3GiYFx8A Field9154 = new Mw1rH0enxHoGt2yOomU73geB3GiYFx8A();
    public meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU Field9155 = null;
    public final Map Field9156 = new LinkedHashMap();
    private String Field9157 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Mw1rH0enxHoGt2yOomU73geB3GiYFx8A() {
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
        ELM7I72rYwY5mTWSyFazBkuX9BwTPath eLM7I72rYwY5mTWSyFazBkuX9BwTPath = (ELM7I72rYwY5mTWSyFazBkuX9BwTPath)this.Field9156.remove(entityPlayerMP);
        if (eLM7I72rYwY5mTWSyFazBkuX9BwTPath == null) {
            return;
        }
        if (!eLM7I72rYwY5mTWSyFazBkuX9BwTPath.Field11620.Method4867()) {
            if ((eLM7I72rYwY5mTWSyFazBkuX9BwTPath.Field11621 += (int)((long)-55097948 ^ (long)-55097947)) >= (int)((long)-1430187541 ^ (long)-1430187616) << 2) {
                if ((eLM7I72rYwY5mTWSyFazBkuX9BwTPath.Field11622 += (int)((long)857295266 ^ (long)857295267)) >= ((int)1433616446L ^ 0x5573403B)) {
                    pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.warn("{}'s download was dropped!", (Object)entityPlayerMP.getName());
                    return;
                }
                pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.warn("{}'s download timed out, retrying (#{})", (Object)entityPlayerMP.getName(), (Object)eLM7I72rYwY5mTWSyFazBkuX9BwTPath.Field11622);
                this.Method1417(entityPlayerMP, eLM7I72rYwY5mTWSyFazBkuX9BwTPath);
                eLM7I72rYwY5mTWSyFazBkuX9BwTPath.Field11621 = (int)((long)-99161466 ^ (long)-99161466);
            }
        } else if (eLM7I72rYwY5mTWSyFazBkuX9BwTPath.Field11620 == ELM7I72rYwY5mTWSyFazBkuX9BwTPath$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13466) {
            this.Method1416(entityPlayerMP, eLM7I72rYwY5mTWSyFazBkuX9BwTPath);
        } else if (eLM7I72rYwY5mTWSyFazBkuX9BwTPath.Field11620 == ELM7I72rYwY5mTWSyFazBkuX9BwTPath$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13468) {
            this.Method1417(entityPlayerMP, eLM7I72rYwY5mTWSyFazBkuX9BwTPath);
        } else if (eLM7I72rYwY5mTWSyFazBkuX9BwTPath.Field11620 == ELM7I72rYwY5mTWSyFazBkuX9BwTPath$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13470) {
            this.Method1418(entityPlayerMP, eLM7I72rYwY5mTWSyFazBkuX9BwTPath);
            return;
        }
        this.Field9156.put(entityPlayerMP, eLM7I72rYwY5mTWSyFazBkuX9BwTPath);
    }

    private void Method1416(EntityPlayerMP entityPlayerMP, ELM7I72rYwY5mTWSyFazBkuX9BwTPath eLM7I72rYwY5mTWSyFazBkuX9BwTPath) {
        eLM7I72rYwY5mTWSyFazBkuX9BwTPath.Method3606(ELM7I72rYwY5mTWSyFazBkuX9BwTPath$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13467);
        g566FzyW5WmPBZ7TRhmIn8VXbKICOcHE g566FzyW5WmPBZ7TRhmIn8VXbKICOcHE2 = new g566FzyW5WmPBZ7TRhmIn8VXbKICOcHE(eLM7I72rYwY5mTWSyFazBkuX9BwTPath.Field11615);
        L2xmcmr9Tre1qBd8su5PcdMk38D1GW4H.Field8524.sendTo((IMessage)g566FzyW5WmPBZ7TRhmIn8VXbKICOcHE2, entityPlayerMP);
    }

    private void Method1417(EntityPlayerMP entityPlayerMP, ELM7I72rYwY5mTWSyFazBkuX9BwTPath eLM7I72rYwY5mTWSyFazBkuX9BwTPath) {
        eLM7I72rYwY5mTWSyFazBkuX9BwTPath.Method3606(ELM7I72rYwY5mTWSyFazBkuX9BwTPath$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13469);
        pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.trace("Sending chunk {},{},{}", (Object)eLM7I72rYwY5mTWSyFazBkuX9BwTPath.Field11623, (Object)eLM7I72rYwY5mTWSyFazBkuX9BwTPath.Field11624, (Object)eLM7I72rYwY5mTWSyFazBkuX9BwTPath.Field11625);
        zDh1G3IeczcFWyYeWhMc3jw64oAZBhvl zDh1G3IeczcFWyYeWhMc3jw64oAZBhvl2 = new zDh1G3IeczcFWyYeWhMc3jw64oAZBhvl(eLM7I72rYwY5mTWSyFazBkuX9BwTPath.Field11615, eLM7I72rYwY5mTWSyFazBkuX9BwTPath.Field11623, eLM7I72rYwY5mTWSyFazBkuX9BwTPath.Field11624, eLM7I72rYwY5mTWSyFazBkuX9BwTPath.Field11625);
        L2xmcmr9Tre1qBd8su5PcdMk38D1GW4H.Field8524.sendTo((IMessage)zDh1G3IeczcFWyYeWhMc3jw64oAZBhvl2, entityPlayerMP);
    }

    private void Method1418(EntityPlayerMP entityPlayerMP, ELM7I72rYwY5mTWSyFazBkuX9BwTPath eLM7I72rYwY5mTWSyFazBkuX9BwTPath) {
        uousdX8ncJWKUP3BS9cexvVPwWHrFdDD uousdX8ncJWKUP3BS9cexvVPwWHrFdDD2 = new uousdX8ncJWKUP3BS9cexvVPwWHrFdDD(eLM7I72rYwY5mTWSyFazBkuX9BwTPath.Field11616);
        L2xmcmr9Tre1qBd8su5PcdMk38D1GW4H.Field8524.sendTo((IMessage)uousdX8ncJWKUP3BS9cexvVPwWHrFdDD2, entityPlayerMP);
    }

    private static String Method1419(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)224872100L ^ 0xD6746A4;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-517621049L ^ 0xE125BA38);
            int n2 = (int)-1685910463L ^ 0x9B830C72;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-2031600848 ^ (long)-2031612179) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

