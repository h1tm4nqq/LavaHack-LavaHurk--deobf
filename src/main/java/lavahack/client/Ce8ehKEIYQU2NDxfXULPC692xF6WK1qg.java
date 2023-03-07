//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.item.ItemBow
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketEntityAction$Action
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 */
package lavahack.client;

import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemBow;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketPlayer;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2={"Lcom/kisman/cc/features/module/exploit/BowExploit;", "Lcom/kisman/cc/features/module/Module;", "()V", "bow", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "bypass", "damage", "debug", "default", "Lcom/kisman/cc/settings/types/SettingGroup;", "eggs", "items", "lastShootTimeD", "", "mode", "pearls", "rewrite", "send", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "shootingD", "", "snowballs", "spoofs", "test", "timeOut", "doSpoofs", "", "onDisable", "onEnable", "update", "Mode", "kisman.cc"})
public final class Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field10936 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Items", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10937 = this.Method23(this.Field10936.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Bow", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-350195611L ^ 0xEB207064) != 0)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10938 = this.Method23(this.Field10936.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Eggs", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)666341986L ^ 0x27B79263) != 0)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10939 = this.Method23(this.Field10936.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Pearls", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-621027570L ^ 0xDAFBDF0F) != 0)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10940 = this.Method23(this.Field10936.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Snow Balls", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)331920045L ^ 0x13C8B2AC) != 0)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10941 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16521));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field10942 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Default", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10943 = this.Method23(this.Field10942.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TimeOut", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xD3969A55644C56C7L ^ 0x93251255644C56C7L), Double.longBitsToDouble(0xEEDD843BD76E2BFCL ^ 0xAE84843BD76E2BFCL), Double.longBitsToDouble(0x37CF2E47BC981F8DL ^ 0x771CA647BC981F8DL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10944 = this.Method23(this.Field10942.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Spoofs", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)429488985 ^ 0x4024000019997B59L), 1.0, Double.longBitsToDouble((long)585883971 ^ 0x4072C00022EBE143L), ((int)607794600L ^ 0x243A35A9) != 0)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10945 = this.Method23(this.Field10942.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Bypass", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-402648905 ^ (long)-402648905))));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field10946 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10947 = this.Method23(this.Field10946.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Damage", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xC8E2930BD4AFD8FDL ^ 0x88BB930BD4AFD8FDL), Double.longBitsToDouble(0x151CC8A2DC7FA5DCL ^ 0x5538C8A2DC7FA5DCL), Double.longBitsToDouble((long)1018157164 ^ 0x4062C0003CAFD86CL), (boolean)((long)-89405907 ^ (long)-89405908))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10948 = this.Method23(this.Field10946.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Test", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-940260846L ^ 0xC7F4C212) != 0)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10949 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Debug", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1100036625L ^ 0xBE6EC5EE) != 0));
    private boolean Field10950;
    private long Field10951;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field10952 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)new Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this), new Predicate[(int)((long)811008134 ^ (long)811008134)]);
    private int Field10953;

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field10952);
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field10952);
    }

    @Override
    public void Method45() {
        if (Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player == null) return;
        if (Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().world == null) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field10941;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"mode");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341() != Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16522) {
            return;
        }
        EntityPlayerSP entityPlayerSP = Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (entityPlayerSP.getHeldItemMainhand().isEmpty) return;
        EntityPlayerSP entityPlayerSP2 = Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
        if (!(entityPlayerSP2.getHeldItemMainhand().item instanceof ItemBow)) return;
        EntityPlayerSP entityPlayerSP3 = Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP3, (String)"mc.player");
        if (entityPlayerSP3.getItemInUseMaxCount() > 0) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field10948;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"test");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) {
                Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.rotationPitch = 0.0f;
            }
        }
        EntityPlayerSP entityPlayerSP4 = Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP4, (String)"mc.player");
        if (entityPlayerSP4.getItemInUseMaxCount() > ((int)-625852001L ^ 0xDAB2419A) << 1) {
            Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player, CPacketEntityAction.Action.START_SNEAKING));
            Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player, CPacketEntityAction.Action.START_SPRINTING));
            Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player, CPacketEntityAction.Action.START_SNEAKING));
        }
        int n = (int)-1463757144L ^ 0xA8C0D6A8;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field10947;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"damage");
        int n2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method335();
        if (n <= n2) {
            while (true) {
                Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.connection.sendPacket((Packet)new CPacketPlayer.Position(Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.posX, Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.posY - Double.longBitsToDouble(0xDA0B0103BCF46F5BL ^ 0xE7D07DDC6523D2E0L), Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.posZ, ((int)-604466275L ^ 0xDBF8939C) != 0));
                Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.connection.sendPacket((Packet)new CPacketPlayer.Position(Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.posX, Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.posY + Double.longBitsToDouble((long)1463478083 ^ 0x3DDB7CDF8EED5AF8L), Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.posZ, ((int)-1957971080L ^ 0x8B4BBB78) != 0));
                if (n == n2) break;
                ++n;
            }
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field10949;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"debug");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365()) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503().Method1886("Spoofed!");
        }
        Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().gameSettings.keyBindUseItem.pressed = (int)-1933309748L ^ 0x8CC408CC;
    }

    private final void Method2908() {
        long l = System.currentTimeMillis() - this.Field10951;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field10943;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"timeOut");
        if (l < (long)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335()) return;
        this.Field10950 = (int)((long)128894440 ^ (long)128894440);
        this.Field10951 = System.currentTimeMillis();
        Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player, CPacketEntityAction.Action.START_SPRINTING));
        int n = (int)-1900205909L ^ 0x8EBD28AB;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field10944;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"spoofs");
        int n2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method335();
        if (n <= n2) {
            while (true) {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field10945;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"bypass");
                if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365()) {
                    Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.connection.sendPacket((Packet)new CPacketPlayer.Position(Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.posX, Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.posY + Double.longBitsToDouble((long)1069556407 ^ 0x3DDB7CDFE6179F0CL), Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.posZ, (boolean)((long)-1137843803 ^ (long)-1137843803)));
                    Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.connection.sendPacket((Packet)new CPacketPlayer.Position(Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.posX, Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.posY - Double.longBitsToDouble(0x1000168D461CDB44L ^ 0x2DDB6A529FCB66FFL), Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.posZ, (boolean)((long)-1697701916 ^ (long)-1697701915)));
                } else {
                    Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.connection.sendPacket((Packet)new CPacketPlayer.Position(Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.posX, Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.posY - Double.longBitsToDouble(0x40945B801F72DE08L ^ 0x7D4F275FC6A563B3L), Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.posZ, ((int)-1554248374L ^ 0xA35C0D4B) != 0));
                    Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.connection.sendPacket((Packet)new CPacketPlayer.Position(Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.posX, Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.posY + Double.longBitsToDouble(0x79C348B036BFEFEAL ^ 0x4418346FEF685251L), Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player.posZ, (boolean)((long)-578469967 ^ (long)-578469967)));
                }
                if (n == n2) break;
                ++n;
            }
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field10949;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"debug");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365()) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503().Method1886("Spoofed!");
        }
        this.Field10950 = (int)((long)892252669 ^ (long)892252668);
    }

    public Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg() {
        super("BowExploit", "Just bowbomb", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    public static final Minecraft Method2909() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method2910(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2911(Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg ce8ehKEIYQU2NDxfXULPC692xF6WK1qg) {
        return ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Field10941;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2912(Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg ce8ehKEIYQU2NDxfXULPC692xF6WK1qg) {
        return ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Field10937;
    }

    public static final void Method2913(Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg ce8ehKEIYQU2NDxfXULPC692xF6WK1qg) {
        ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2908();
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2914(Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg ce8ehKEIYQU2NDxfXULPC692xF6WK1qg) {
        return ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Field10949;
    }

    public static final boolean Method2915(Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg ce8ehKEIYQU2NDxfXULPC692xF6WK1qg) {
        return ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Field10950;
    }

    public static final void Method2916(Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg ce8ehKEIYQU2NDxfXULPC692xF6WK1qg, boolean bl) {
        ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Field10950 = bl;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2917(Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg ce8ehKEIYQU2NDxfXULPC692xF6WK1qg) {
        return ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Field10938;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2918(Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg ce8ehKEIYQU2NDxfXULPC692xF6WK1qg) {
        return ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Field10939;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2919(Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg ce8ehKEIYQU2NDxfXULPC692xF6WK1qg) {
        return ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Field10940;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1304631980 ^ (long)1304631980);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1413430151 ^ (long)1413430136);
            int n2 = (int)-407043809L ^ 0xE7BD0174;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1997440688 ^ (long)1997447505) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

