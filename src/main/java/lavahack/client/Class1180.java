//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import org.jetbrains.annotations.*;
import kotlin.*;
import net.minecraft.network.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.client.network.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.item.*;
import net.minecraft.init.*;
import java.util.function.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;

@Class99
@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0018H\u0002J\b\u0010\"\u001a\u00020#H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0002X\u0083\u0004?\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u0002R\u0016\u0010\u001a\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006%" }, d2 = { "Lcom/kisman/cc/features/module/combat/KillAuraRewrite;", "Lcom/kisman/cc/features/module/Module;", "()V", "ccOnlyCrits", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "checks", "Lcom/kisman/cc/settings/types/SettingGroup;", "cooldownCheck", "hit", "logic", "monsters", "packetAttack", "passive", "players", "range", "ranges", "resetCooldown", "rotation", "rotationLogic", "shieldBreaker", "swap", "swing", "targetNoStatic", "Lnet/minecraft/entity/Entity;", "targetNoStatic$annotations", "targets", "wallRange", "weapon", "getWeaponSlot", "", "isShieldActive", "", "entity", "update", "", "Companion", "kisman.cc" })
public final class Class1180 extends Class42
{
    private final Class1996 Field13339;
    private final Class44 Field13340;
    private final Class44 Field13341;
    private final Class44 Field13342;
    private final Class44 Field13343;
    private final Class44 Field13344;
    private final Class44 Field13345;
    private final Class1996 Field13346;
    private final Class44 Field13347;
    private final Class44 Field13348;
    private final Class1996 Field13349;
    private final Class44 Field13350;
    private final Class44 Field13351;
    private final Class44 Field13352;
    private final Class1996 Field13353;
    private final Class44 Field13354;
    private final Class44 Field13355;
    private final Class1996 Field13356;
    private final Class44 Field13357;
    private final Class44 Field13358;
    private final Entity Field13359;
    @Nullable
    private static Class1180 Field13360;
    @Nullable
    private static Entity Field13361;
    public static final Class1316 Field13362;
    private int Field13363;
    
    @Override
    public void Method45() {
        if (Method4754().player == null || Method4754().world == null || Method4754().player.isDead) {
            return;
        }
        final int currentItem = Method4754().player.inventory.currentItem;
        final Class2160 method7793 = new Class2160().Method7793();
        final Class44 field13340 = this.Field13340;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13340, "swap");
        final Enum method7794 = field13340.Method341();
        if (method7794 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.dynamic.SwapEnum2.Swap");
        }
        final Class711 class711 = (Class711)method7794;
        final Class44 field13341 = this.Field13341;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13341, "rotation");
        final Enum method7795 = field13341.Method341();
        if (method7795 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.dynamic.RotationEnum.Rotation");
        }
        final Class135 class712 = (Class135)method7795;
        final int method7796 = this.Method4752();
        final Class44 field13342 = this.Field13357;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13342, "cooldownCheck");
        if (field13342.Method365() && currentItem != method7796 && class711 == Class711.Field11026) {
            final float getCooledAttackStrength = Method4754().player.getCooledAttackStrength(0.0f);
            final Class44 field13343 = this.Field13358;
            Intrinsics.checkExpressionValueIsNotNull((Object)field13343, "ccOnlyCrits");
            if (getCooledAttackStrength <= (field13343.Method365() ? Float.intBitsToFloat(1064514355) : 1.0f)) {
                return;
            }
        }
        final Class44 field13344 = this.Field13347;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13344, "range");
        final float method7797 = field13344.Method368();
        final Class44 field13345 = this.Field13348;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13345, "wallRange");
        final float method7798 = field13345.Method368();
        final Class44 field13346 = this.Field13350;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13346, "players");
        final boolean method7799 = field13346.Method365();
        final Class44 field13347 = this.Field13352;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13347, "passive");
        final boolean method7800 = field13347.Method365();
        final Class44 field13348 = this.Field13351;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13348, "monsters");
        Class1180.Field13361 = Class394.Method1925(method7797, method7798, method7799, method7800, field13348.Method365());
        if (Class1180.Field13361 == null) {
            return;
        }
        if (currentItem == -1 || (method7796 != currentItem && class711 == Class711.Field11026)) {
            return;
        }
        class711.Method2972().Method1726(method7796, false);
        final Class1763 method7801 = class712.Method929();
        final Object[] array = new Object[2];
        final int n = 0;
        final Class1763 method7802 = class712.Method931();
        final Object[] array2 = new Object[2];
        final int n2 = 0;
        final Entity field13349 = Class1180.Field13361;
        array2[n2] = ((field13349 != null) ? Integer.valueOf(field13349.entityId) : null);
        final int n3 = 1;
        final Class44 field13350 = this.Field13342;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13350, "rotationLogic");
        final Enum method7803 = field13350.Method341();
        if (method7803 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RotationLogic");
        }
        array2[n3] = method7803;
        array[n] = method7802.Method1726(array2);
        array[1] = false;
        method7801.Method1726(array);
        final Class44 field13351 = this.Field13357;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13351, "cooldownCheck");
        if (field13351.Method365() && currentItem == method7796 && class711 != Class711.Field11026) {
            final float getCooledAttackStrength2 = Method4754().player.getCooledAttackStrength(0.0f);
            final Class44 field13352 = this.Field13358;
            Intrinsics.checkExpressionValueIsNotNull((Object)field13352, "ccOnlyCrits");
            if (getCooledAttackStrength2 > (field13352.Method365() ? Float.intBitsToFloat(1064514355) : 1.0f)) {
                final Class44 field13353 = this.Field13355;
                Intrinsics.checkExpressionValueIsNotNull((Object)field13353, "packetAttack");
                if (field13353.Method365()) {
                    final NetHandlerPlayClient connection = Method4754().player.connection;
                    final Entity field13354 = Class1180.Field13361;
                    if (field13354 == null) {
                        Intrinsics.throwNpe();
                    }
                    connection.sendPacket((Packet)new CPacketUseEntity(field13354));
                }
                else {
                    final PlayerControllerMP playerController = Method4754().playerController;
                    final EntityPlayer entityPlayer = (EntityPlayer)Method4754().player;
                    final Entity field13355 = Class1180.Field13361;
                    if (field13355 == null) {
                        Intrinsics.throwNpe();
                    }
                    playerController.attackEntity(entityPlayer, field13355);
                }
                final Class44 field13356 = this.Field13345;
                Intrinsics.checkExpressionValueIsNotNull((Object)field13356, "swing");
                final Enum method7804 = field13356.Method341();
                if (method7804 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.SwingHands");
                }
                switch (Class669.Field10844[((Class1991)method7804).ordinal()]) {
                    case 1: {
                        Method4754().player.swingArm(EnumHand.MAIN_HAND);
                        break;
                    }
                    case 2: {
                        Method4754().player.swingArm(EnumHand.OFF_HAND);
                        break;
                    }
                    case 3: {
                        Method4754().player.connection.sendPacket((Packet)new CPacketAnimation(EnumHand.MAIN_HAND));
                        break;
                    }
                }
                final Class44 field13357 = this.Field13354;
                Intrinsics.checkExpressionValueIsNotNull((Object)field13357, "resetCooldown");
                if (field13357.Method365()) {
                    Method4754().player.resetCooldown();
                }
            }
        }
        class712.Method930().Method1726(method7793, true);
        class711.Method2972().Method1726(currentItem, true);
    }
    
    private final int Method4752() {
        int n = 0;
        while (true) {
            final ItemStack getStackInSlot = Method4754().player.inventory.getStackInSlot(n);
            final Class44 field13344 = this.Field13344;
            Intrinsics.checkExpressionValueIsNotNull((Object)field13344, "shieldBreaker");
            if (field13344.Method365()) {
                final Entity field13345 = Class1180.Field13361;
                if (field13345 == null) {
                    Intrinsics.throwNpe();
                }
                if (this.Method4753(field13345) && getStackInSlot.item instanceof ItemAxe) {
                    return n;
                }
            }
            final Class44 field13346 = this.Field13343;
            Intrinsics.checkExpressionValueIsNotNull((Object)field13346, "weapon");
            if (field13346.Method341() != Class1144.Field13166) {
                if (getStackInSlot.item instanceof ItemSword) {
                    final Class44 field13347 = this.Field13343;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field13347, "weapon");
                    if (field13347.Method341() == Class1144.Field13167) {
                        break;
                    }
                    final Class44 field13348 = this.Field13343;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field13348, "weapon");
                    if (field13348.Method341() == Class1144.Field13169) {
                        break;
                    }
                }
                if (getStackInSlot.item instanceof ItemAxe) {
                    final Class44 field13349 = this.Field13343;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field13349, "weapon");
                    if (field13349.Method341() == Class1144.Field13168) {
                        break;
                    }
                    final Class44 field13350 = this.Field13343;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field13350, "weapon");
                    if (field13350.Method341() == Class1144.Field13169) {
                        break;
                    }
                }
            }
            ++n;
        }
        return n;
    }
    
    private final boolean Method4753(final Entity entity) {
        return entity instanceof EntityPlayer && ((EntityPlayer)entity).isHandActive() && ((Intrinsics.areEqual((Object)((EntityPlayer)entity).getHeldItemMainhand().item, (Object)Items.SHIELD) && ((EntityPlayer)entity).getActiveHand() == EnumHand.MAIN_HAND) || (Intrinsics.areEqual((Object)((EntityPlayer)entity).getHeldItemOffhand().item, (Object)Items.SHIELD) && ((EntityPlayer)entity).getActiveHand() == EnumHand.OFF_HAND));
    }
    
    public Class1180() {
        super("KillAuraRewrite", "Rewrite version of KillAura", Class97.Field8338);
        this.Field13339 = this.Method24(new Class1996(new Class44("Logic", this)));
        this.Field13340 = this.Method23(this.Field13339.Method7405(new Class44("Swap", this, Class711.Field11026)));
        this.Field13341 = this.Method23(this.Field13339.Method7405(new Class44("Rotation", this, Class135.Field8498)));
        final Class1996 field13339 = this.Field13339;
        final Class44 method313 = new Class44("Rotation Logic", this, (Enum)Class1048.Field12640).Method313(new Class1238(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)method313, "Setting(\"Rotation Logic\"\u2026e { rotation.valBoolean }");
        this.Field13342 = this.Method23(field13339.Method7405(method313));
        this.Field13343 = this.Method23(this.Field13339.Method7405(new Class44("Weapon", this, (Enum)Class1144.Field13167)));
        this.Field13344 = this.Method23(this.Field13339.Method7405(new Class44("Shield Breaker", this, false)));
        this.Field13345 = this.Method23(this.Field13339.Method7405(new Class44("Swing", this, Class1991.Field17158)));
        this.Field13346 = this.Method24(new Class1996(new Class44("Ranges", this)));
        this.Field13347 = this.Method23(this.Field13346.Method7405(new Class44("Range", this, Double.longBitsToDouble((long)987028919 ^ 0x401100003AD4DDB7L), 1.0, Double.longBitsToDouble((long)1846257333 ^ 0x401800006E0BA6B5L), false)));
        this.Field13348 = this.Method23(this.Field13346.Method7405(new Class44("Wall Range", this, Double.longBitsToDouble((long)514678283 ^ 0x400800001EAD5E0BL), 1.0, Double.longBitsToDouble(4618441417868443648L), false)));
        this.Field13349 = this.Method24(new Class1996(new Class44("Targets", this)));
        this.Field13350 = this.Method23(this.Field13349.Method7405(new Class44("Players", this, true)));
        this.Field13351 = this.Method23(this.Field13349.Method7405(new Class44("Monsters", this, false)));
        this.Field13352 = this.Method23(this.Field13349.Method7405(new Class44("Passive", this, false)));
        this.Field13353 = this.Method24(new Class1996(new Class44("Hit", this)));
        this.Field13354 = this.Method23(this.Field13353.Method7405(new Class44("Reset Cooldown", this, true)));
        this.Field13355 = this.Method23(this.Field13353.Method7405(new Class44("Packet Attack", this, false)));
        this.Field13356 = this.Method24(new Class1996(new Class44("Checks", this)));
        this.Field13357 = this.Method23(this.Field13356.Method7405(new Class44("Cooldown Check", this, true)));
        final Class1996 field13340 = this.Field13356;
        final Class44 method314 = new Class44("CC Only Crits", this, true).Method313(new Class459(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)method314, "Setting(\"CC Only Crits\",\u2026ooldownCheck.valBoolean }");
        this.Field13358 = this.Method23(field13340.Method7405(method314));
        this.Method44(Class385.Field9614);
        Class1180.Field13360 = this;
    }
    
    static {
        Field13362 = new Class1316(null);
    }
    
    public static final Minecraft Method4754() {
        return Class42.Field8052;
    }
    
    public static final void Method4755(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final Class44 Method4756(final Class1180 class1180) {
        return class1180.Field13341;
    }
    
    public static final Class44 Method4757(final Class1180 class1180) {
        return class1180.Field13357;
    }
    
    public static final Class1180 Method4758() {
        return Class1180.Field13360;
    }
    
    public static final void Method4759(final Class1180 field13360) {
        Class1180.Field13360 = field13360;
    }
    
    public static final Entity Method4760() {
        return Class1180.Field13361;
    }
    
    public static final void Method4761(final Entity field13361) {
        Class1180.Field13361 = field13361;
    }
    
    @Nullable
    @Nullable
    public static final Class1180 Method4762() {
        Class1180.Field13362;
        return Class1180.Field13360;
    }
    
    public static final void Method4763(@Nullable @Nullable final Class1180 field13360) {
        Class1180.Field13362;
        Class1180.Field13360 = field13360;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2CE8 ^ 0x42));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
