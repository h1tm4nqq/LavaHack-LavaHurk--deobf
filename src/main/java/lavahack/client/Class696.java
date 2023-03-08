//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.item.*;
import net.minecraft.network.*;
import net.minecraft.entity.*;
import net.minecraft.network.play.client.*;
import net.minecraft.client.entity.*;
import java.util.function.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001 B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006!" }, d2 = { "Lcom/kisman/cc/features/module/exploit/BowExploit;", "Lcom/kisman/cc/features/module/Module;", "()V", "bow", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "bypass", "damage", "debug", "default", "Lcom/kisman/cc/settings/types/SettingGroup;", "eggs", "items", "lastShootTimeD", "", "mode", "pearls", "rewrite", "send", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "shootingD", "", "snowballs", "spoofs", "test", "timeOut", "doSpoofs", "", "onDisable", "onEnable", "update", "Mode", "kisman.cc" })
public final class Class696 extends Class42
{
    private final Class1996 Field10936;
    private final Class44 Field10937;
    private final Class44 Field10938;
    private final Class44 Field10939;
    private final Class44 Field10940;
    private final Class44 Field10941;
    private final Class1996 Field10942;
    private final Class44 Field10943;
    private final Class44 Field10944;
    private final Class44 Field10945;
    private final Class1996 Field10946;
    private final Class44 Field10947;
    private final Class44 Field10948;
    private final Class44 Field10949;
    private boolean Field10950;
    private long Field10951;
    private final Class618 Field10952;
    private int Field10953;
    
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field10952);
    }
    
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field10952);
    }
    
    public void Method45() {
        if (Method2909().player != null && Method2909().world != null) {
            final Class44 field10941 = this.Field10941;
            Intrinsics.checkExpressionValueIsNotNull((Object)field10941, "mode");
            if (field10941.Method341() == Class1848.Field16522) {
                final EntityPlayerSP player = Method2909().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
                if (!player.getHeldItemMainhand().isEmpty) {
                    final EntityPlayerSP player2 = Method2909().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
                    if (player2.getHeldItemMainhand().item instanceof ItemBow) {
                        final EntityPlayerSP player3 = Method2909().player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)player3, "mc.player");
                        if (player3.getItemInUseMaxCount() > 0) {
                            final Class44 field10942 = this.Field10948;
                            Intrinsics.checkExpressionValueIsNotNull((Object)field10942, "test");
                            if (field10942.Method365()) {
                                Method2909().player.rotationPitch = 0.0f;
                            }
                        }
                        final EntityPlayerSP player4 = Method2909().player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)player4, "mc.player");
                        if (player4.getItemInUseMaxCount() > 10) {
                            Method2909().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Method2909().player, CPacketEntityAction$Action.START_SNEAKING));
                            Method2909().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Method2909().player, CPacketEntityAction$Action.START_SPRINTING));
                            Method2909().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Method2909().player, CPacketEntityAction$Action.START_SNEAKING));
                        }
                        int n = 0;
                        final Class44 field10943 = this.Field10947;
                        Intrinsics.checkExpressionValueIsNotNull((Object)field10943, "damage");
                        final int method335 = field10943.Method335();
                        if (n <= method335) {
                            while (true) {
                                Method2909().player.connection.sendPacket((Packet)new CPacketPlayer$Position(Method2909().player.posX, Method2909().player.posY - Double.longBitsToDouble(4457293557087583675L), Method2909().player.posZ, true));
                                Method2909().player.connection.sendPacket((Packet)new CPacketPlayer$Position(Method2909().player.posX, Method2909().player.posY + Double.longBitsToDouble((long)1463478083 ^ 0x3DDB7CDF8EED5AF8L), Method2909().player.posZ, false));
                                if (n == method335) {
                                    break;
                                }
                                ++n;
                            }
                        }
                        final Class44 field10944 = this.Field10949;
                        Intrinsics.checkExpressionValueIsNotNull((Object)field10944, "debug");
                        if (field10944.Method365()) {
                            Class1393.Method5503().Method1886("Spoofed!");
                        }
                        Method2909().gameSettings.keyBindUseItem.pressed = false;
                    }
                }
            }
        }
    }
    
    private final void Method2908() {
        final long n = System.currentTimeMillis() - this.Field10951;
        final Class44 field10943 = this.Field10943;
        Intrinsics.checkExpressionValueIsNotNull((Object)field10943, "timeOut");
        if (n >= field10943.Method335()) {
            this.Field10950 = false;
            this.Field10951 = System.currentTimeMillis();
            Method2909().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Method2909().player, CPacketEntityAction$Action.START_SPRINTING));
            int n2 = 0;
            final Class44 field10944 = this.Field10944;
            Intrinsics.checkExpressionValueIsNotNull((Object)field10944, "spoofs");
            final int method335 = field10944.Method335();
            if (n2 <= method335) {
                while (true) {
                    final Class44 field10945 = this.Field10945;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field10945, "bypass");
                    if (field10945.Method365()) {
                        Method2909().player.connection.sendPacket((Packet)new CPacketPlayer$Position(Method2909().player.posX, Method2909().player.posY + Double.longBitsToDouble((long)1069556407 ^ 0x3DDB7CDFE6179F0CL), Method2909().player.posZ, false));
                        Method2909().player.connection.sendPacket((Packet)new CPacketPlayer$Position(Method2909().player.posX, Method2909().player.posY - Double.longBitsToDouble(4457293557087583675L), Method2909().player.posZ, true));
                    }
                    else {
                        Method2909().player.connection.sendPacket((Packet)new CPacketPlayer$Position(Method2909().player.posX, Method2909().player.posY - Double.longBitsToDouble(4457293557087583675L), Method2909().player.posZ, true));
                        Method2909().player.connection.sendPacket((Packet)new CPacketPlayer$Position(Method2909().player.posX, Method2909().player.posY + Double.longBitsToDouble(4457293557087583675L), Method2909().player.posZ, false));
                    }
                    if (n2 == method335) {
                        break;
                    }
                    ++n2;
                }
            }
            final Class44 field10946 = this.Field10949;
            Intrinsics.checkExpressionValueIsNotNull((Object)field10946, "debug");
            if (field10946.Method365()) {
                Class1393.Method5503().Method1886("Spoofed!");
            }
            this.Field10950 = true;
        }
    }
    
    public Class696() {
        super("BowExploit", "Just bowbomb", Class97.Field8344);
        this.Field10936 = this.Method24(new Class1996(new Class44("Items", (Class42)this)));
        this.Field10937 = this.Method23(this.Field10936.Method7405(new Class44("Bow", (Class42)this, true)));
        this.Field10938 = this.Method23(this.Field10936.Method7405(new Class44("Eggs", (Class42)this, true)));
        this.Field10939 = this.Method23(this.Field10936.Method7405(new Class44("Pearls", (Class42)this, true)));
        this.Field10940 = this.Method23(this.Field10936.Method7405(new Class44("Snow Balls", (Class42)this, true)));
        this.Field10941 = this.Method23(new Class44("Mode", (Class42)this, (Enum)Class1848.Field16521));
        this.Field10942 = this.Method24(new Class1996(new Class44("Default", (Class42)this)));
        this.Field10943 = this.Method23(this.Field10942.Method7405(new Class44("TimeOut", (Class42)this, Double.longBitsToDouble(4662219572839972864L), Double.longBitsToDouble(4636737291354636288L), Double.longBitsToDouble(4671226772094713856L), Class467.Field9943)));
        this.Field10944 = this.Method23(this.Field10942.Method7405(new Class44("Spoofs", (Class42)this, Double.longBitsToDouble((long)429488985 ^ 0x4024000019997B59L), 1.0, Double.longBitsToDouble((long)585883971 ^ 0x4072C00022EBE143L), true)));
        this.Field10945 = this.Method23(this.Field10942.Method7405(new Class44("Bypass", (Class42)this, false)));
        this.Field10946 = this.Method24(new Class1996(new Class44("Rewrite", (Class42)this)));
        this.Field10947 = this.Method23(this.Field10946.Method7405(new Class44("Damage", (Class42)this, Double.longBitsToDouble(4636737291354636288L), Double.longBitsToDouble(4621819117588971520L), Double.longBitsToDouble((long)1018157164 ^ 0x4062C0003CAFD86CL), true)));
        this.Field10948 = this.Method23(this.Field10946.Method7405(new Class44("Test", (Class42)this, false)));
        this.Field10949 = this.Method23(new Class44("Debug", (Class42)this, true));
        this.Field10952 = new Class618((Class254)new Class1002(this), new Predicate[0]);
    }
    
    public static final Minecraft Method2909() {
        return Class42.Field8052;
    }
    
    public static final void Method2910(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final Class44 Method2911(final Class696 class696) {
        return class696.Field10941;
    }
    
    public static final Class44 Method2912(final Class696 class696) {
        return class696.Field10937;
    }
    
    public static final void Method2913(final Class696 class696) {
        class696.Method2908();
    }
    
    public static final Class44 Method2914(final Class696 class696) {
        return class696.Field10949;
    }
    
    public static final boolean Method2915(final Class696 class696) {
        return class696.Field10950;
    }
    
    public static final void Method2916(final Class696 class696, final boolean field10950) {
        class696.Field10950 = field10950;
    }
    
    public static final Class44 Method2917(final Class696 class696) {
        return class696.Field10938;
    }
    
    public static final Class44 Method2918(final Class696 class696) {
        return class696.Field10939;
    }
    
    public static final Class44 Method2919(final Class696 class696) {
        return class696.Field10940;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4FC2 ^ 0x6B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
