//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.play.server.SPacketPlayerListItem
 *  net.minecraft.network.play.server.SPacketPlayerListItem$Action
 *  net.minecraft.network.play.server.SPacketPlayerListItem$AddPlayerData
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$1;
import lavahack.client.f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.server.SPacketPlayerListItem;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class f1aluHx5bxv7TlmkJp3srpREvLbP6yTl
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15970 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Color", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(Color.RED));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15971 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Chat Notify", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-99682094L ^ 0xFA0EF8D2) != 0);
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15972 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field13304);
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15973 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Scale", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x91A6105818495A0EL ^ 0xAECE832CD8495A0EL), Double.longBitsToDouble(0x1E7D05A481168A1EL ^ 0x212D67E961168A1EL), Double.longBitsToDouble((long)541767828 ^ 0x3F847AE1604AB894L), ((int)-324468066L ^ 0xECA9029E) != 0);
    private final ArrayList Field15974 = new ArrayList();
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field15975 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method6609, new Predicate[(int)-1918276932L ^ 0x8DA96ABC]);
    private String Field15976 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public f1aluHx5bxv7TlmkJp3srpREvLbP6yTl() {
        super("LogoutSpots", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15970);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15971);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15972);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15973);
    }

    @Override
    public boolean Method52() {
        return (int)((long)650095885 ^ (long)650095884) != 0;
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field15974.clear();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field15975);
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field15975);
        this.Field15974.clear();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6607(RenderWorldLastEvent renderWorldLastEvent) {
        if (this.Field15974.isEmpty()) return;
        this.Field15974.forEach(arg_0 -> f1aluHx5bxv7TlmkJp3srpREvLbP6yTl.Method6612(renderWorldLastEvent, arg_0));
    }

    public f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method6608(UUID uUID) {
        f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        Iterator iterator = this.Field15974.iterator();
        do {
            if (!iterator.hasNext()) return null;
            f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)iterator.next();
        } while (!f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11674.equals(uUID));
        return f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
    }

    private void Method6609(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketPlayerListItem)) return;
        SPacketPlayerListItem sPacketPlayerListItem = (SPacketPlayerListItem)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
        if (f1aluHx5bxv7TlmkJp3srpREvLbP6yTl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (sPacketPlayerListItem.getAction() != SPacketPlayerListItem.Action.ADD_PLAYER) return;
        if (sPacketPlayerListItem.getAction() != SPacketPlayerListItem.Action.REMOVE_PLAYER) {
            return;
        }
        sPacketPlayerListItem.getEntries().stream().filter(Objects::nonNull).filter(f1aluHx5bxv7TlmkJp3srpREvLbP6yTl::Method6611).forEach(arg_0 -> this.Method6610(sPacketPlayerListItem, arg_0));
    }

    private void Method6610(SPacketPlayerListItem sPacketPlayerListItem, SPacketPlayerListItem.AddPlayerData addPlayerData) {
        switch (f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$1.Field9716[sPacketPlayerListItem.getAction().ordinal()]) {
            case 1: {
                if (this.Method6608(addPlayerData.getProfile().getId()) == null) return;
                f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = this.Method6608(addPlayerData.getProfile().getId());
                if (this.Field15971.Method365()) {
                    NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507().Method1886(f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11670 + " is back at " + f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11669.getX() + " " + f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11669.getY() + " " + f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11669.getZ());
                }
                this.Field15974.remove(f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
                return;
            }
            case 2: {
                System.out.println("1");
                EntityPlayer entityPlayer = f1aluHx5bxv7TlmkJp3srpREvLbP6yTl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getPlayerEntityByUUID(addPlayerData.getProfile().getId());
                if (entityPlayer == null) {
                    return;
                }
                if (this.Field15971.Method365()) {
                    NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507().Method1886(entityPlayer.getName() + " just logout at " + entityPlayer.getPosition().getX() + " " + entityPlayer.getPosition().getY() + " " + entityPlayer.getPosition().getZ());
                }
                this.Field15974.add(new f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this, entityPlayer, this.Field15970.Method339()));
                return;
            }
        }
    }

    private static boolean Method6611(SPacketPlayerListItem.AddPlayerData addPlayerData) {
        int n;
        if ((addPlayerData.getProfile().getName() == null || addPlayerData.getProfile().getName().isEmpty()) && addPlayerData.getProfile().getId() == null) {
            n = (int)1716650875L ^ 0x6652037B;
            return n != 0;
        }
        n = (int)((long)1419412111 ^ (long)1419412110);
        return n != 0;
    }

    private static void Method6612(RenderWorldLastEvent renderWorldLastEvent, f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method3666(renderWorldLastEvent.getPartialTicks());
    }

    static Minecraft Method6613() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method6614(f1aluHx5bxv7TlmkJp3srpREvLbP6yTl f1aluHx5bxv7TlmkJp3srpREvLbP6yTl2) {
        return f1aluHx5bxv7TlmkJp3srpREvLbP6yTl2.Field15972;
    }

    static Minecraft Method6615() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1575909311L ^ 0xA2118841;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1278402218L ^ 0x4C32DE55);
            int n2 = (int)((long)432093885 ^ (long)432093840);
            cArray2[n] = (char)(cArray[n] ^ ((int)984660501L ^ 0x3AB08FD4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

