//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.multiplayer.PlayerControllerMP
 *  net.minecraft.client.network.NetHandlerPlayClient
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemAxe
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketAnimation
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.util.EnumHand
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1048;
import lavahack.client.Class1144;
import lavahack.client.Class1238;
import lavahack.client.Class1316;
import lavahack.client.Class135;
import lavahack.client.Class1763;
import lavahack.client.Class1991;
import lavahack.client.Class1996;
import lavahack.client.Class2160;
import lavahack.client.Class385;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class459;
import lavahack.client.Class669;
import lavahack.client.Class711;
import lavahack.client.Class97;
import lavahack.client.Class99;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumHand;
import org.jetbrains.annotations.Nullable;

@Class99
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0018H\u0002J\b\u0010\"\u001a\u00020#H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u0002R\u0016\u0010\u001a\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2={"Lcom/kisman/cc/features/module/combat/KillAuraRewrite;", "Lcom/kisman/cc/features/module/Module;", "()V", "ccOnlyCrits", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "checks", "Lcom/kisman/cc/settings/types/SettingGroup;", "cooldownCheck", "hit", "logic", "monsters", "packetAttack", "passive", "players", "range", "ranges", "resetCooldown", "rotation", "rotationLogic", "shieldBreaker", "swap", "swing", "targetNoStatic", "Lnet/minecraft/entity/Entity;", "targetNoStatic$annotations", "targets", "wallRange", "weapon", "getWeaponSlot", "", "isShieldActive", "", "entity", "update", "", "Companion", "kisman.cc"})
public final class Class1180
extends Class42 {
    private final Class1996 Field13339 = this.Method24(new Class1996(new Class44("Logic", this)));
    private final Class44 Field13340 = this.Method23(this.Field13339.Method7405(new Class44("Swap", (Class42)this, Class711.Field11026)));
    private final Class44 Field13341 = this.Method23(this.Field13339.Method7405(new Class44("Rotation", (Class42)this, Class135.Field8498)));
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
        if (Class1180.Method4754().player == null) return;
        if (Class1180.Method4754().world == null) return;
        if (Class1180.Method4754().player.isDead) {
            return;
        }
        int n = Class1180.Method4754().player.inventory.currentItem;
        Class2160 class2160 = new Class2160().Method7793();
        Class44 class44 = this.Field13340;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"swap");
        Enum enum_ = class44.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.dynamic.SwapEnum2.Swap");
        }
        Class711 class711 = (Class711)enum_;
        Class44 class442 = this.Field13341;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"rotation");
        Enum enum_2 = class442.Method341();
        if (enum_2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.dynamic.RotationEnum.Rotation");
        }
        Class135 class135 = (Class135)enum_2;
        int n2 = this.Method4752();
        Class44 class443 = this.Field13357;
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"cooldownCheck");
        if (class443.Method365() && n != n2 && class711 == Class711.Field11026) {
            float f = Class1180.Method4754().player.getCooledAttackStrength(0.0f);
            Class44 class444 = this.Field13358;
            Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"ccOnlyCrits");
            float f2 = class444.Method365() ? Float.intBitsToFloat(0x3F733333) : 1.0f;
            if (f <= f2) {
                return;
            }
        }
        Class44 class445 = this.Field13347;
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"range");
        float f = class445.Method368();
        Class44 class446 = this.Field13348;
        Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"wallRange");
        float f3 = class446.Method368();
        Class44 class447 = this.Field13350;
        Intrinsics.checkExpressionValueIsNotNull((Object)class447, (String)"players");
        boolean bl = class447.Method365();
        Class44 class448 = this.Field13352;
        Intrinsics.checkExpressionValueIsNotNull((Object)class448, (String)"passive");
        boolean bl2 = class448.Method365();
        Class44 class449 = this.Field13351;
        Intrinsics.checkExpressionValueIsNotNull((Object)class449, (String)"monsters");
        Field13361 = Class394.Method1925(f, f3, bl, bl2, class449.Method365());
        if (Field13361 == null) {
            return;
        }
        if (n == -1) return;
        if (n2 != n && class711 == Class711.Field11026) {
            return;
        }
        class711.Method2972().Method1726(n2, false);
        Class1763 class1763 = class135.Method929();
        Object[] objectArray = new Object[2];
        Class1763 class17632 = class135.Method931();
        Object[] objectArray2 = new Object[2];
        Entity entity = Field13361;
        objectArray2[0] = entity != null ? Integer.valueOf(entity.entityId) : null;
        Class44 class4410 = this.Field13342;
        Intrinsics.checkExpressionValueIsNotNull((Object)class4410, (String)"rotationLogic");
        Enum enum_3 = class4410.Method341();
        if (enum_3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RotationLogic");
        }
        objectArray2[1] = (Class1048)enum_3;
        objectArray[0] = class17632.Method1726(objectArray2);
        objectArray[1] = false;
        class1763.Method1726(objectArray);
        Class44 class4411 = this.Field13357;
        Intrinsics.checkExpressionValueIsNotNull((Object)class4411, (String)"cooldownCheck");
        if (class4411.Method365() && n == n2 && class711 != Class711.Field11026) {
            float f4 = Class1180.Method4754().player.getCooledAttackStrength(0.0f);
            Class44 class4412 = this.Field13358;
            Intrinsics.checkExpressionValueIsNotNull((Object)class4412, (String)"ccOnlyCrits");
            float f5 = class4412.Method365() ? Float.intBitsToFloat(0x3F733333) : 1.0f;
            if (f4 > f5) {
                Class44 class4413 = this.Field13355;
                Intrinsics.checkExpressionValueIsNotNull((Object)class4413, (String)"packetAttack");
                if (class4413.Method365()) {
                    NetHandlerPlayClient netHandlerPlayClient = Class1180.Method4754().player.connection;
                    Entity entity2 = Field13361;
                    if (entity2 == null) {
                        Intrinsics.throwNpe();
                    }
                    netHandlerPlayClient.sendPacket((Packet)new CPacketUseEntity(entity2));
                } else {
                    PlayerControllerMP playerControllerMP = Class1180.Method4754().playerController;
                    EntityPlayer entityPlayer = (EntityPlayer)Class1180.Method4754().player;
                    Entity entity3 = Field13361;
                    if (entity3 == null) {
                        Intrinsics.throwNpe();
                    }
                    playerControllerMP.attackEntity(entityPlayer, entity3);
                }
                Class44 class4414 = this.Field13345;
                Intrinsics.checkExpressionValueIsNotNull((Object)class4414, (String)"swing");
                Enum enum_4 = class4414.Method341();
                if (enum_4 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.SwingHands");
                }
                switch (Class669.Field10844[((Class1991)enum_4).ordinal()]) {
                    case 1: {
                        Class1180.Method4754().player.swingArm(EnumHand.MAIN_HAND);
                        break;
                    }
                    case 2: {
                        Class1180.Method4754().player.swingArm(EnumHand.OFF_HAND);
                        break;
                    }
                    case 3: {
                        Class1180.Method4754().player.connection.sendPacket((Packet)new CPacketAnimation(EnumHand.MAIN_HAND));
                        break;
                    }
                }
                Class44 class4415 = this.Field13354;
                Intrinsics.checkExpressionValueIsNotNull((Object)class4415, (String)"resetCooldown");
                if (class4415.Method365()) {
                    Class1180.Method4754().player.resetCooldown();
                }
            }
        }
        class135.Method930().Method1726(class2160, true);
        class711.Method2972().Method1726(n, true);
    }

    private final int Method4752() {
        int n = 0;
        int n2 = 9;
        while (true) {
            ItemStack itemStack = Class1180.Method4754().player.inventory.getStackInSlot(n);
            Class44 class44 = this.Field13344;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"shieldBreaker");
            if (class44.Method365()) {
                Entity entity = Field13361;
                if (entity == null) {
                    Intrinsics.throwNpe();
                }
                if (this.Method4753(entity) && itemStack.item instanceof ItemAxe) {
                    return n;
                }
            }
            Class44 class442 = this.Field13343;
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"weapon");
            if (class442.Method341() != Class1144.Field13166) {
                if (itemStack.item instanceof ItemSword) {
                    Class44 class443 = this.Field13343;
                    Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"weapon");
                    if (class443.Method341() == Class1144.Field13167) return n;
                    Class44 class444 = this.Field13343;
                    Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"weapon");
                    if (class444.Method341() == Class1144.Field13169) return n;
                }
                if (itemStack.item instanceof ItemAxe) {
                    Class44 class445 = this.Field13343;
                    Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"weapon");
                    if (class445.Method341() == Class1144.Field13168) return n;
                    Class44 class446 = this.Field13343;
                    Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"weapon");
                    if (class446.Method341() == Class1144.Field13169) {
                        return n;
                    }
                }
            }
            ++n;
        }
    }

    private final boolean Method4753(Entity entity) {
        if (!(entity instanceof EntityPlayer)) return false;
        if (!((EntityPlayer)entity).isHandActive()) return false;
        if (Intrinsics.areEqual((Object)((EntityPlayer)entity).getHeldItemMainhand().item, (Object)Items.SHIELD)) {
            if (((EntityPlayer)entity).getActiveHand() == EnumHand.MAIN_HAND) return true;
        }
        if (!Intrinsics.areEqual((Object)((EntityPlayer)entity).getHeldItemOffhand().item, (Object)Items.SHIELD)) return false;
        if (((EntityPlayer)entity).getActiveHand() != EnumHand.OFF_HAND) return false;
        return true;
    }

    public Class1180() {
        super("KillAuraRewrite", "Rewrite version of KillAura", Class97.Field8338);
        Class44 class44 = new Class44("Rotation Logic", (Class42)this, Class1048.Field12640).Method313(new Class1238(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Setting(\"Rotation Logic\"\u2026e { rotation.valBoolean }");
        this.Field13342 = this.Method23(this.Field13339.Method7405(class44));
        this.Field13343 = this.Method23(this.Field13339.Method7405(new Class44("Weapon", (Class42)this, Class1144.Field13167)));
        this.Field13344 = this.Method23(this.Field13339.Method7405(new Class44("Shield Breaker", (Class42)this, false)));
        this.Field13345 = this.Method23(this.Field13339.Method7405(new Class44("Swing", (Class42)this, Class1991.Field17158)));
        this.Field13346 = this.Method24(new Class1996(new Class44("Ranges", this)));
        this.Field13347 = this.Method23(this.Field13346.Method7405(new Class44("Range", (Class42)this, Double.longBitsToDouble((long)987028919 ^ 0x401100003AD4DDB7L), 1.0, Double.longBitsToDouble((long)1846257333 ^ 0x401800006E0BA6B5L), false)));
        this.Field13348 = this.Method23(this.Field13346.Method7405(new Class44("Wall Range", (Class42)this, Double.longBitsToDouble((long)514678283 ^ 0x400800001EAD5E0BL), 1.0, Double.longBitsToDouble(4618441417868443648L), false)));
        this.Field13349 = this.Method24(new Class1996(new Class44("Targets", this)));
        this.Field13350 = this.Method23(this.Field13349.Method7405(new Class44("Players", (Class42)this, true)));
        this.Field13351 = this.Method23(this.Field13349.Method7405(new Class44("Monsters", (Class42)this, false)));
        this.Field13352 = this.Method23(this.Field13349.Method7405(new Class44("Passive", (Class42)this, false)));
        this.Field13353 = this.Method24(new Class1996(new Class44("Hit", this)));
        this.Field13354 = this.Method23(this.Field13353.Method7405(new Class44("Reset Cooldown", (Class42)this, true)));
        this.Field13355 = this.Method23(this.Field13353.Method7405(new Class44("Packet Attack", (Class42)this, false)));
        this.Field13356 = this.Method24(new Class1996(new Class44("Checks", this)));
        this.Field13357 = this.Method23(this.Field13356.Method7405(new Class44("Cooldown Check", (Class42)this, true)));
        Class44 class442 = new Class44("CC Only Crits", (Class42)this, true).Method313(new Class459(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"Setting(\"CC Only Crits\",\u2026ooldownCheck.valBoolean }");
        this.Field13358 = this.Method23(this.Field13356.Method7405(class442));
        this.Method44(Class385.Field9614);
        Field13360 = this;
    }

    static {
        Field13362 = new Class1316(null);
    }

    public static final Minecraft Method4754() {
        return Class42.Field8052;
    }

    public static final void Method4755(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    public static final Class44 Method4756(Class1180 class1180) {
        return class1180.Field13341;
    }

    public static final Class44 Method4757(Class1180 class1180) {
        return class1180.Field13357;
    }

    public static final Class1180 Method4758() {
        return Field13360;
    }

    public static final void Method4759(Class1180 class1180) {
        Field13360 = class1180;
    }

    public static final Entity Method4760() {
        return Field13361;
    }

    public static final void Method4761(Entity entity) {
        Field13361 = entity;
    }

    @Nullable
    @Nullable
    public static final Class1180 Method4762() {
        Class1316 class1316 = Field13362;
        return Field13360;
    }

    public static final void Method4763(@Nullable @Nullable Class1180 class1180) {
        Class1316 class1316 = Field13362;
        Field13360 = class1180;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 66;
            cArray2[n] = (char)(cArray[n] ^ (0x2CE8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

