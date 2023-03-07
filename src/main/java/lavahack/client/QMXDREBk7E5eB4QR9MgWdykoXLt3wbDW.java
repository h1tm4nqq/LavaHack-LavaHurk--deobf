//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.network.play.client.CPacketUseEntity$Action
 *  net.minecraft.world.World
 *  net.minecraftforge.event.entity.living.LivingDeathEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class QMXDREBk7E5eB4QR9MgWdykoXLt3wbDW
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public static List Field13571;
    private ConcurrentHashMap Field13572 = null;
    private int Field13573 = (int)-816250898L ^ 0x30A70011;
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13574 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Random message", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)426498616 ^ (long)426498617));
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field13575 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method4943, new Predicate[(int)-1068662281L ^ 0xC04D81F7]);
    private String Field13576 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public QMXDREBk7E5eB4QR9MgWdykoXLt3wbDW() {
        super("AutoEZ", "", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field13574);
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field13572 = new ConcurrentHashMap();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field13575);
    }

    @Override
    public void Method45() {
        if (QMXDREBk7E5eB4QR9MgWdykoXLt3wbDW.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (QMXDREBk7E5eB4QR9MgWdykoXLt3wbDW.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field13572 == null) {
            this.Field13572 = new ConcurrentHashMap();
        }
        for (Entity entity : QMXDREBk7E5eB4QR9MgWdykoXLt3wbDW.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList) {
            String string;
            EntityPlayer entityPlayer;
            if (!(entity instanceof EntityPlayer) || !((entityPlayer = (EntityPlayer)entity).getHealth() < 0.0f) || !this.Method4940(string = entityPlayer.getName())) continue;
            this.Method4941(string);
            break;
        }
        this.Field13572.forEach(this::Method4944);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method4939(LivingDeathEvent livingDeathEvent) {
        EntityLivingBase entityLivingBase;
        if (QMXDREBk7E5eB4QR9MgWdykoXLt3wbDW.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (this.Field13572 == null) {
            this.Field13572 = new ConcurrentHashMap();
        }
        if (!((entityLivingBase = livingDeathEvent.getEntityLiving()) instanceof EntityPlayer)) return;
        EntityPlayer entityPlayer = (EntityPlayer)entityLivingBase;
        if (!(entityPlayer.getHealth() < 0.0f)) return;
        String string = entityPlayer.getName();
        if (!this.Method4940(string)) return;
        this.Method4941(string);
    }

    private boolean Method4940(String string) {
        return this.Field13572.containsKey(string);
    }

    private void Method4941(String string) {
        this.Field13572.remove(string);
        if (this.Field13573 >= Field13571.size() - ((int)-923001598L ^ 0xC8FC1D03)) {
            this.Field13573 = (int)((long)-1630803436 ^ (long)1630803435);
        }
        this.Field13573 += (int)733783517L ^ 0x2BBCA5DC;
        String string2 = Field13571.size() > 0 && this.Field13574.Method365() ? (String)Field13571.get(this.Field13573) : "{name} ezzzz " + leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6783() + " " + leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6785() + " on top!";
        String string3 = string2.replaceAll("\u0e22\u0e07", "").replace("{name}", string).replace("{player_name}", QMXDREBk7E5eB4QR9MgWdykoXLt3wbDW.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getName());
        if (string3.length() > (int)((long)-37470186 ^ (long)-37469975)) {
            string3 = string3.substring((int)((long)168013872 ^ (long)168013872), (int)((long)282115429 ^ (long)282115482));
        }
        QMXDREBk7E5eB4QR9MgWdykoXLt3wbDW.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.sendChatMessage(string3);
    }

    public void Method4942(String string) {
        if (Objects.equals(string, QMXDREBk7E5eB4QR9MgWdykoXLt3wbDW.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getName())) return;
        if (this.Field13572 == null) {
            this.Field13572 = new ConcurrentHashMap();
        }
        this.Field13572.put(string, ((int)1872899590L ^ 0x6FA22E03) << 2);
    }

    @Override
    public void Method39() {
        super.Method39();
        this.Field13572 = null;
    }

    private void Method4943(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        if (QMXDREBk7E5eB4QR9MgWdykoXLt3wbDW.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (this.Field13572 == null) {
            this.Field13572 = new ConcurrentHashMap();
        }
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketUseEntity)) return;
        CPacketUseEntity cPacketUseEntity = (CPacketUseEntity)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982();
        if (!cPacketUseEntity.action.equals((Object)CPacketUseEntity.Action.ATTACK)) return;
        Entity entity = cPacketUseEntity.getEntityFromWorld((World)QMXDREBk7E5eB4QR9MgWdykoXLt3wbDW.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world);
        if (!(entity instanceof EntityPlayer)) return;
        this.Method4942(entity.getName());
    }

    private void Method4944(Object object, Object object2) {
        if ((Integer)object2 < 0) {
            this.Field13572.remove(object);
            return;
        }
        this.Field13572.put(object, (Integer)object2 - ((int)1281649332L ^ 0x4C646AB5));
    }

    static {
        String[] stringArray = new String[(int)-530044755L ^ 0xE06828AE];
        stringArray[(int)((long)865770343 ^ (long)865770343)] = "{name} owned by {player_name} with " + leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6783();
        stringArray[(int)1595792985L ^ 0x5F1DDE58] = "gg, {name}!";
        stringArray[((int)2125763210L ^ 0x7EB4928B) << 1] = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6783() + " owning {name}";
        Field13571 = new ArrayList<String>(Arrays.asList(stringArray));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)849509310 ^ (long)849509310);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)551341285L ^ 0x20DCCC1A);
            int n2 = (int)((long)-807643944 ^ (long)-807644021) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)2073615832L ^ 0x7B98FF03 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

