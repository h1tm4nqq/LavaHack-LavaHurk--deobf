//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiChat
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.ItemBow
 *  net.minecraft.item.ItemFood
 *  net.minecraft.item.ItemShield
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketConfirmTeleport
 *  net.minecraft.network.play.client.CPacketHeldItemChange
 *  net.minecraft.network.play.client.CPacketPlayer
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.network.play.client.CPacketPlayerDigging
 *  net.minecraft.network.play.client.CPacketPlayerDigging$Action
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItem
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.network.play.server.SPacketPlayerPosLook
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.event.entity.living.LivingEvent$LivingUpdateEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import com.kisman.cc.mixin.mixins.accessor.AccessorEntityPlayer;
import java.lang.invoke.LambdaMetafactory;
import java.util.function.Predicate;
import lavahack.client.Class1303;
import lavahack.client.Class1369;
import lavahack.client.Class1419;
import lavahack.client.Class1744;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class1917;
import lavahack.client.Class1996;
import lavahack.client.Class2015;
import lavahack.client.Class254;
import lavahack.client.Class264;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class54;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class720;
import lavahack.client.Class97;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemShield;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketConfirmTeleport;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Keyboard;

public class Class514
extends Class42 {
    private final Class44 Field10166 = this.Method23(new Class44("Mode", (Class42)this, Class1369.Field14228));
    private final Class44 Field10167 = this.Method23(new Class44("Items", (Class42)this, true));
    private final Class44 Field10168 = this.Method23(new Class44("Items Test", (Class42)this, false));
    private final Class44 Field10169 = this.Method23(new Class44("NCPStrict", (Class42)this, false));
    private final Class44 Field10170 = this.Method23(new Class44("Strict", (Class42)this, false));
    private final Class44 Field10171 = this.Method23(new Class44("SlimeBlocks", (Class42)this, true));
    private final Class44 Field10172 = this.Method23(new Class44("Web", (Class42)this, false));
    private final Class1303 Field10173 = new Class1303("WebStrict", (Class42)this, Class54.Field8165).Method5303();
    private final Class44 Field10174 = this.Method23(new Class44("Sneak", (Class42)this, false));
    public final Class44 Field10175 = this.Method23(new Class44("Jump", (Class42)this, false));
    private final Class1996 Field10176 = this.Method24(new Class1996(new Class44("Inv Move", this)));
    private final Class44 Field10177 = this.Field10176.Method7405(this.Method23(new Class44("InvMove", (Class42)this, true)));
    private final Class44 Field10178 = this.Field10176.Method7405(this.Method23(new Class44("IgnoreChat", (Class42)this, true).Method313(this.Field10177::Method365)));
    private final Class44 Field10179 = this.Field10176.Method7405(this.Method23(new Class44("IgnoreConsole", (Class42)this, true).Method313(this.Field10177::Method365)));
    private final Class44 Field10180 = this.Field10176.Method7405(this.Method23(new Class44("IgnoreClickGui", (Class42)this, false).Method313(this.Field10177::Method365)));
    public static Class514 Field10181;
    private boolean Field10182 = false;
    private int Field10183 = 0;
    @Class1801
    private final Class618 Field10184 = new Class618(this::Method2370, new Predicate[0]);
    @Class1801
    private final Class618 Field10185 = new Class618(this::Method2369, new Predicate[0]);
    private final Class618 Field10186 = new Class618((Class254)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, leqS0IyKEB621E1SrHdAcHHAUjScjmKi(Class478), (Llavahack/client/RG0Ef4LzpvaRaWkCktLl94QMei9n80rd;)V)(), new Predicate[0]);
    private final Class618 Field10187 = new Class618(this::Method2368, new Predicate[0]);
    private int Field10188;

    public Class514() {
        super("NoSlow", "NoSlow", Class97.Field8340);
        Field10181 = this;
    }

    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field10184);
        Class1796.Field16242.Method706(this.Field10185);
        Class1796.Field16242.Method706(this.Field10186);
        Class1796.Field16242.Method706(this.Field10187);
    }

    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field10184);
        Class1796.Field16242.Method711(this.Field10185);
        Class1796.Field16242.Method711(this.Field10186);
        Class1796.Field16242.Method711(this.Field10187);
        this.Field10182 = false;
        this.Field10183 = 0;
    }

    @Override
    public void Method45() {
        if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive() && this.Field10167.Method365() && Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItem(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getActiveHand()).getItem() instanceof ItemShield && (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe != 0.0f || Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward != 0.0f && Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemInUseMaxCount() >= 8)) {
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHorizontalFacing()));
        }
        if (this.Field10171.Method365()) {
            if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getRidingEntity() != null) {
                Blocks.SLIME_BLOCK.setDefaultSlipperiness(Float.intBitsToFloat(1061997773));
            } else {
                Blocks.SLIME_BLOCK.setDefaultSlipperiness(Float.intBitsToFloat(1058642330));
            }
        }
        if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive() && !Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRiding() && (double)Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance > Double.longBitsToDouble(4604480259023595110L) && Class1744.Method6651((EntityLivingBase)Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) && this.Field10166.Method359().equals("None")) {
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX *= Double.longBitsToDouble(4606281698874543309L);
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ *= Double.longBitsToDouble(4606281698874543309L);
        }
        if (this.Field10174.Method365()) {
            this.Method20();
        }
        if (!this.Field10172.Method365()) {
            return;
        }
        if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getBlock() != Blocks.WEB) return;
        if (!Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWeb) {
            return;
        }
        if (this.Field10182 || this.Field10173.Method341() == Class54.Field8165) {
            double[] dArray = Class394.Method1957(new double[]{Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX, Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY, Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ});
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = dArray[0];
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = dArray[1];
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = dArray[2];
        }
        if (this.Field10173.Method341() == Class54.Field8167) {
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX, Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY, Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ, Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketConfirmTeleport(this.Field10183));
        }
        this.Field10182 = !this.Field10182;
    }

    private void Method20() {
        if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSneaking()) {
            if (!Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindForward.isKeyDown()) return;
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = Float.intBitsToFloat(0x3DCCCCCD);
            if (!Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) return;
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX *= Double.longBitsToDouble((long)1506637868 ^ 0x4014000059CD782CL);
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ *= Double.longBitsToDouble(0x4014000000000000L);
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX /= Double.longBitsToDouble(4614274462313219097L);
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ /= Double.longBitsToDouble(4614274462313219097L);
            Class1917.Method7158(Float.intBitsToFloat(1040120283));
            if (!Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindBack.isKeyDown()) return;
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = Float.intBitsToFloat(1034147594);
            if (!Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) return;
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX *= Double.longBitsToDouble(-4606056518893174784L);
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ *= Double.longBitsToDouble(-4606056518893174784L);
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX /= Double.longBitsToDouble((long)937025066 ^ 0xC009322D398FDA33L);
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ /= Double.longBitsToDouble((long)2053862176 ^ 0xC009322D743D7739L);
            Class1917.Method7158(Float.intBitsToFloat(1040120283));
            return;
        }
        Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = Float.intBitsToFloat(1017370378);
        ((AccessorEntityPlayer)Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player).Method6392(Float.intBitsToFloat(1017370378));
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2366(LivingEvent.LivingUpdateEvent livingUpdateEvent) {
        if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive() && !Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRiding() && this.Field10166.Method359().equals("Sunrise")) {
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe *= Float.intBitsToFloat(1045220557);
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward *= Float.intBitsToFloat(1045220557);
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.sprintToggleTimer = 0;
        }
        if (!Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive()) return;
        if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRiding()) return;
        if (!this.Field10168.Method365()) return;
        if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % 2 != 0) return;
        if (!Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX *= Double.longBitsToDouble((long)1510234763 ^ 0x3FECCCCC9A045A8BL);
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ *= Double.longBitsToDouble((long)1223301621 ^ 0x3FECCCCC88EA19F5L);
            return;
        }
        if (!Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSprinting()) {
            Class1917.Method7147(Double.longBitsToDouble(4581710059307609880L));
            return;
        }
        Class1917.Method7147(Double.longBitsToDouble(4577494690056391104L));
    }

    private EnumHand Method2367(Packet packet) {
        EnumHand enumHand;
        if (packet instanceof CPacketPlayerTryUseItem) {
            enumHand = ((CPacketPlayerTryUseItem)packet).getHand();
            return enumHand;
        }
        enumHand = ((CPacketPlayerTryUseItemOnBlock)packet).getHand();
        return enumHand;
    }

    private void Method2368(Class544 class544) {
        if (!(class544.Method982() instanceof SPacketPlayerPosLook)) {
            return;
        }
        this.Field10183 = ((SPacketPlayerPosLook)class544.Method982()).getTeleportId();
    }

    private void Method2369(Class2015 class2015) {
        if (class2015.Method982() instanceof CPacketPlayer && this.Field10169.Method365() && this.Field10167.Method365() && Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive() && !Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRiding()) {
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.ABORT_DESTROY_BLOCK, Class1744.Method6657(), EnumFacing.DOWN));
            return;
        }
        if (!this.Field10170.Method365()) return;
        if (!(class2015.Method982() instanceof CPacketPlayerTryUseItemOnBlock)) {
            if (!(class2015.Method982() instanceof CPacketPlayerTryUseItem)) return;
        }
        if (!(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemFood) && !(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemBow) && !(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemShield) || this.Method2367(class2015.Method982()) != EnumHand.MAIN_HAND) {
            if (!(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() instanceof ItemFood) && !(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() instanceof ItemBow)) {
                if (!(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() instanceof ItemShield)) return;
            }
            if (this.Method2367(class2015.Method982()) != EnumHand.OFF_HAND) return;
        }
        Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem));
    }

    private void Method2370(Class720 class720) {
        if (this.Field10177.Method365() && Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen != null) {
            if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen instanceof GuiChat && this.Field10178.Method365()) {
                return;
            }
            if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen instanceof Class264 && this.Field10179.Method365()) {
                return;
            }
            if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen instanceof Class1419 && this.Field10180.Method365()) {
                return;
            }
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe = 0.0f;
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward = 0.0f;
            KeyBinding.setKeyBindState((int)Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindForward.getKeyCode(), (boolean)Keyboard.isKeyDown((int)Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindForward.getKeyCode()));
            if (Keyboard.isKeyDown((int)Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindForward.getKeyCode())) {
                Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward += 1.0f;
                Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.forwardKeyDown = true;
            } else {
                Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.forwardKeyDown = false;
            }
            KeyBinding.setKeyBindState((int)Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindBack.getKeyCode(), (boolean)Keyboard.isKeyDown((int)Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindBack.getKeyCode()));
            if (Keyboard.isKeyDown((int)Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindBack.getKeyCode())) {
                Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward -= 1.0f;
                Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.backKeyDown = true;
            } else {
                Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.backKeyDown = false;
            }
            KeyBinding.setKeyBindState((int)Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindLeft.getKeyCode(), (boolean)Keyboard.isKeyDown((int)Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindLeft.getKeyCode()));
            if (Keyboard.isKeyDown((int)Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindLeft.getKeyCode())) {
                Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe += 1.0f;
                Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.leftKeyDown = true;
            } else {
                Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.leftKeyDown = false;
            }
            KeyBinding.setKeyBindState((int)Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindRight.getKeyCode(), (boolean)Keyboard.isKeyDown((int)Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindRight.getKeyCode()));
            if (Keyboard.isKeyDown((int)Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindRight.getKeyCode())) {
                Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe -= 1.0f;
                Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.rightKeyDown = true;
            } else {
                Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.rightKeyDown = false;
            }
            KeyBinding.setKeyBindState((int)Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.getKeyCode(), (boolean)Keyboard.isKeyDown((int)Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.getKeyCode()));
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.jump = Keyboard.isKeyDown((int)Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.getKeyCode());
        }
        if (!this.Field10167.Method365()) return;
        if (!Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive()) return;
        if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRiding()) return;
        Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward = (float)((double)Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward / Double.longBitsToDouble(4596373779694328218L));
        Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe = (float)((double)Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe / Double.longBitsToDouble((long)1813769446 ^ 0x3FC99999F582757CL));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 6;
            cArray2[n] = (char)(cArray[n] ^ (0x1B37 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

