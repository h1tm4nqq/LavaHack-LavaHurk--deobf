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
import lavahack.client.Class1002;
import lavahack.client.Class1393;
import lavahack.client.Class1796;
import lavahack.client.Class1848;
import lavahack.client.Class1996;
import lavahack.client.Class254;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class618;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemBow;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketPlayer;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2={"Lcom/kisman/cc/features/module/exploit/BowExploit;", "Lcom/kisman/cc/features/module/Module;", "()V", "bow", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "bypass", "damage", "debug", "default", "Lcom/kisman/cc/settings/types/SettingGroup;", "eggs", "items", "lastShootTimeD", "", "mode", "pearls", "rewrite", "send", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "shootingD", "", "snowballs", "spoofs", "test", "timeOut", "doSpoofs", "", "onDisable", "onEnable", "update", "Mode", "kisman.cc"})
public final class Class696
extends Class42 {
    private final Class1996 Field10936 = this.Method24(new Class1996(new Class44("Items", this)));
    private final Class44 Field10937 = this.Method23(this.Field10936.Method7405(new Class44("Bow", (Class42)this, true)));
    private final Class44 Field10938 = this.Method23(this.Field10936.Method7405(new Class44("Eggs", (Class42)this, true)));
    private final Class44 Field10939 = this.Method23(this.Field10936.Method7405(new Class44("Pearls", (Class42)this, true)));
    private final Class44 Field10940 = this.Method23(this.Field10936.Method7405(new Class44("Snow Balls", (Class42)this, true)));
    private final Class44 Field10941 = this.Method23(new Class44("Mode", (Class42)this, Class1848.Field16521));
    private final Class1996 Field10942 = this.Method24(new Class1996(new Class44("Default", this)));
    private final Class44 Field10943 = this.Method23(this.Field10942.Method7405(new Class44("TimeOut", (Class42)this, Double.longBitsToDouble(4662219572839972864L), Double.longBitsToDouble(4636737291354636288L), Double.longBitsToDouble(4671226772094713856L), Class467.Field9943)));
    private final Class44 Field10944 = this.Method23(this.Field10942.Method7405(new Class44("Spoofs", (Class42)this, Double.longBitsToDouble((long)429488985 ^ 0x4024000019997B59L), 1.0, Double.longBitsToDouble((long)585883971 ^ 0x4072C00022EBE143L), true)));
    private final Class44 Field10945 = this.Method23(this.Field10942.Method7405(new Class44("Bypass", (Class42)this, false)));
    private final Class1996 Field10946 = this.Method24(new Class1996(new Class44("Rewrite", this)));
    private final Class44 Field10947 = this.Method23(this.Field10946.Method7405(new Class44("Damage", (Class42)this, Double.longBitsToDouble(4636737291354636288L), Double.longBitsToDouble(0x4024000000000000L), Double.longBitsToDouble((long)1018157164 ^ 0x4062C0003CAFD86CL), true)));
    private final Class44 Field10948 = this.Method23(this.Field10946.Method7405(new Class44("Test", (Class42)this, false)));
    private final Class44 Field10949 = this.Method23(new Class44("Debug", (Class42)this, true));
    private boolean Field10950;
    private long Field10951;
    private final Class618 Field10952 = new Class618((Class254)new Class1002(this), new Predicate[0]);
    private int Field10953;

    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field10952);
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field10952);
    }

    @Override
    public void Method45() {
        if (Class696.Method2909().player == null) return;
        if (Class696.Method2909().world == null) return;
        Class44 class44 = this.Field10941;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"mode");
        if (class44.Method341() != Class1848.Field16522) {
            return;
        }
        EntityPlayerSP entityPlayerSP = Class696.Method2909().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (entityPlayerSP.getHeldItemMainhand().isEmpty) return;
        EntityPlayerSP entityPlayerSP2 = Class696.Method2909().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
        if (!(entityPlayerSP2.getHeldItemMainhand().item instanceof ItemBow)) return;
        EntityPlayerSP entityPlayerSP3 = Class696.Method2909().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP3, (String)"mc.player");
        if (entityPlayerSP3.getItemInUseMaxCount() > 0) {
            Class44 class442 = this.Field10948;
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"test");
            if (class442.Method365()) {
                Class696.Method2909().player.rotationPitch = 0.0f;
            }
        }
        EntityPlayerSP entityPlayerSP4 = Class696.Method2909().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP4, (String)"mc.player");
        if (entityPlayerSP4.getItemInUseMaxCount() > 10) {
            Class696.Method2909().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class696.Method2909().player, CPacketEntityAction.Action.START_SNEAKING));
            Class696.Method2909().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class696.Method2909().player, CPacketEntityAction.Action.START_SPRINTING));
            Class696.Method2909().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class696.Method2909().player, CPacketEntityAction.Action.START_SNEAKING));
        }
        int n = 0;
        Class44 class443 = this.Field10947;
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"damage");
        int n2 = class443.Method335();
        if (n <= n2) {
            while (true) {
                Class696.Method2909().player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class696.Method2909().player.posX, Class696.Method2909().player.posY - Double.longBitsToDouble(4457293557087583675L), Class696.Method2909().player.posZ, true));
                Class696.Method2909().player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class696.Method2909().player.posX, Class696.Method2909().player.posY + Double.longBitsToDouble((long)1463478083 ^ 0x3DDB7CDF8EED5AF8L), Class696.Method2909().player.posZ, false));
                if (n == n2) break;
                ++n;
            }
        }
        Class44 class444 = this.Field10949;
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"debug");
        if (class444.Method365()) {
            Class1393.Method5503().Method1886("Spoofed!");
        }
        Class696.Method2909().gameSettings.keyBindUseItem.pressed = false;
    }

    private final void Method2908() {
        long l = System.currentTimeMillis() - this.Field10951;
        Class44 class44 = this.Field10943;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"timeOut");
        if (l < (long)class44.Method335()) return;
        this.Field10950 = false;
        this.Field10951 = System.currentTimeMillis();
        Class696.Method2909().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class696.Method2909().player, CPacketEntityAction.Action.START_SPRINTING));
        int n = 0;
        Class44 class442 = this.Field10944;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"spoofs");
        int n2 = class442.Method335();
        if (n <= n2) {
            while (true) {
                Class44 class443 = this.Field10945;
                Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"bypass");
                if (class443.Method365()) {
                    Class696.Method2909().player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class696.Method2909().player.posX, Class696.Method2909().player.posY + Double.longBitsToDouble((long)1069556407 ^ 0x3DDB7CDFE6179F0CL), Class696.Method2909().player.posZ, false));
                    Class696.Method2909().player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class696.Method2909().player.posX, Class696.Method2909().player.posY - Double.longBitsToDouble(4457293557087583675L), Class696.Method2909().player.posZ, true));
                } else {
                    Class696.Method2909().player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class696.Method2909().player.posX, Class696.Method2909().player.posY - Double.longBitsToDouble(4457293557087583675L), Class696.Method2909().player.posZ, true));
                    Class696.Method2909().player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class696.Method2909().player.posX, Class696.Method2909().player.posY + Double.longBitsToDouble(4457293557087583675L), Class696.Method2909().player.posZ, false));
                }
                if (n == n2) break;
                ++n;
            }
        }
        Class44 class444 = this.Field10949;
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"debug");
        if (class444.Method365()) {
            Class1393.Method5503().Method1886("Spoofed!");
        }
        this.Field10950 = true;
    }

    public Class696() {
        super("BowExploit", "Just bowbomb", Class97.Field8344);
    }

    public static final Minecraft Method2909() {
        return Class42.Field8052;
    }

    public static final void Method2910(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    public static final Class44 Method2911(Class696 class696) {
        return class696.Field10941;
    }

    public static final Class44 Method2912(Class696 class696) {
        return class696.Field10937;
    }

    public static final void Method2913(Class696 class696) {
        class696.Method2908();
    }

    public static final Class44 Method2914(Class696 class696) {
        return class696.Field10949;
    }

    public static final boolean Method2915(Class696 class696) {
        return class696.Field10950;
    }

    public static final void Method2916(Class696 class696, boolean bl) {
        class696.Field10950 = bl;
    }

    public static final Class44 Method2917(Class696 class696) {
        return class696.Field10938;
    }

    public static final Class44 Method2918(Class696 class696) {
        return class696.Field10939;
    }

    public static final Class44 Method2919(Class696 class696) {
        return class696.Field10940;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 107;
            cArray2[n] = (char)(cArray[n] ^ (0x4FC2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

