//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.util.math.*;
import net.minecraft.network.*;
import net.minecraft.init.*;
import net.minecraft.entity.*;
import net.minecraft.client.entity.*;
import com.kisman.cc.mixin.mixins.accessor.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.network.play.server.*;
import net.minecraft.util.*;
import net.minecraft.item.*;
import net.minecraft.network.play.client.*;
import net.minecraft.client.gui.*;
import org.lwjgl.input.*;
import net.minecraft.client.settings.*;

public class Class514 extends Class42
{
    private final Class44 Field10166;
    private final Class44 Field10167;
    private final Class44 Field10168;
    private final Class44 Field10169;
    private final Class44 Field10170;
    private final Class44 Field10171;
    private final Class44 Field10172;
    private final Class1303 Field10173;
    private final Class44 Field10174;
    public final Class44 Field10175;
    private final Class1996 Field10176;
    private final Class44 Field10177;
    private final Class44 Field10178;
    private final Class44 Field10179;
    private final Class44 Field10180;
    public static Class514 Field10181;
    private boolean Field10182;
    private int Field10183;
    @Class1801
    private final Class618 Field10184;
    @Class1801
    private final Class618 Field10185;
    private final Class618 Field10186;
    private final Class618 Field10187;
    private int Field10188;
    
    public Class514() {
        super("NoSlow", "NoSlow", Class97.Field8340);
        this.Field10166 = this.Method23(new Class44("Mode", (Class42)this, (Enum)Class1369.Field14228));
        this.Field10167 = this.Method23(new Class44("Items", (Class42)this, true));
        this.Field10168 = this.Method23(new Class44("Items Test", (Class42)this, false));
        this.Field10169 = this.Method23(new Class44("NCPStrict", (Class42)this, false));
        this.Field10170 = this.Method23(new Class44("Strict", (Class42)this, false));
        this.Field10171 = this.Method23(new Class44("SlimeBlocks", (Class42)this, true));
        this.Field10172 = this.Method23(new Class44("Web", (Class42)this, false));
        this.Field10173 = new Class1303("WebStrict", (Class42)this, (Enum)Class54.Field8165).Method5303();
        this.Field10174 = this.Method23(new Class44("Sneak", (Class42)this, false));
        this.Field10175 = this.Method23(new Class44("Jump", (Class42)this, false));
        this.Field10176 = this.Method24(new Class1996(new Class44("Inv Move", (Class42)this)));
        this.Field10177 = this.Field10176.Method7405(this.Method23(new Class44("InvMove", (Class42)this, true)));
        this.Field10178 = this.Field10176.Method7405(this.Method23(new Class44("IgnoreChat", (Class42)this, true).Method313((Supplier)this.Field10177::Method365)));
        this.Field10179 = this.Field10176.Method7405(this.Method23(new Class44("IgnoreConsole", (Class42)this, true).Method313((Supplier)this.Field10177::Method365)));
        this.Field10180 = this.Field10176.Method7405(this.Method23(new Class44("IgnoreClickGui", (Class42)this, false).Method313((Supplier)this.Field10177::Method365)));
        this.Field10182 = false;
        this.Field10183 = 0;
        this.Field10184 = new Class618(this::Method2370, new Predicate[0]);
        this.Field10185 = new Class618(this::Method2369, new Predicate[0]);
        this.Field10186 = new Class618(Class514::leqS0IyKEB621E1SrHdAcHHAUjScjmKi, new Predicate[0]);
        this.Field10187 = new Class618(this::Method2368, new Predicate[0]);
        Class514.Field10181 = this;
    }
    
    public void Method38() {
        Class1796.Field16242.Method706(this.Field10184);
        Class1796.Field16242.Method706(this.Field10185);
        Class1796.Field16242.Method706(this.Field10186);
        Class1796.Field16242.Method706(this.Field10187);
    }
    
    public void Method39() {
        Class1796.Field16242.Method711(this.Field10184);
        Class1796.Field16242.Method711(this.Field10185);
        Class1796.Field16242.Method711(this.Field10186);
        Class1796.Field16242.Method711(this.Field10187);
        this.Field10182 = false;
        this.Field10183 = 0;
    }
    
    public void Method45() {
        if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive() && this.Field10167.Method365() && Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItem(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getActiveHand()).getItem() instanceof ItemShield && (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe != 0.0f || (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward != 0.0f && Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemInUseMaxCount() >= 8))) {
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging$Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHorizontalFacing()));
        }
        if (this.Field10171.Method365()) {
            if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getRidingEntity() != null) {
                Blocks.SLIME_BLOCK.setDefaultSlipperiness(Float.intBitsToFloat(1061997773));
            }
            else {
                Blocks.SLIME_BLOCK.setDefaultSlipperiness(Float.intBitsToFloat(1058642330));
            }
        }
        if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive() && !Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRiding() && Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance > Double.longBitsToDouble(4604480259023595110L) && Class1744.Method6651((EntityLivingBase)Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) && this.Field10166.Method359().equals("None")) {
            final EntityPlayerSP player = Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
            player.motionX *= Double.longBitsToDouble(4606281698874543309L);
            final EntityPlayerSP player2 = Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
            player2.motionZ *= Double.longBitsToDouble(4606281698874543309L);
        }
        if (this.Field10174.Method365()) {
            this.Method20();
        }
        if (!this.Field10172.Method365()) {
            return;
        }
        if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getBlock() != Blocks.WEB || !Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWeb) {
            return;
        }
        if (this.Field10182 || this.Field10173.Method341() == Class54.Field8165) {
            final double[] method1957 = Class394.Method1957(new double[] { Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX, Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY, Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ });
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = method1957[0];
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = method1957[1];
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = method1957[2];
        }
        if (this.Field10173.Method341() == Class54.Field8167) {
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX, Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY, Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ, Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketConfirmTeleport(this.Field10183));
        }
        this.Field10182 = !this.Field10182;
    }
    
    private void Method20() {
        if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSneaking()) {
            if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindForward.isKeyDown()) {
                Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = Float.intBitsToFloat(1036831949);
                if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                    final EntityPlayerSP player = Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
                    player.motionX *= Double.longBitsToDouble((long)1506637868 ^ 0x4014000059CD782CL);
                    final EntityPlayerSP player2 = Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
                    player2.motionZ *= Double.longBitsToDouble(4617315517961601024L);
                    final EntityPlayerSP player3 = Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
                    player3.motionX /= Double.longBitsToDouble(4614274462313219097L);
                    final EntityPlayerSP player4 = Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
                    player4.motionZ /= Double.longBitsToDouble(4614274462313219097L);
                    Class1917.Method7158(Float.intBitsToFloat(1040120283));
                    if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindBack.isKeyDown()) {
                        Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = Float.intBitsToFloat(1034147594);
                        if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                            final EntityPlayerSP player5 = Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
                            player5.motionX *= Double.longBitsToDouble(-4606056518893174784L);
                            final EntityPlayerSP player6 = Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
                            player6.motionZ *= Double.longBitsToDouble(-4606056518893174784L);
                            final EntityPlayerSP player7 = Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
                            player7.motionX /= Double.longBitsToDouble((long)937025066 ^ 0xC009322D398FDA33L);
                            final EntityPlayerSP player8 = Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
                            player8.motionZ /= Double.longBitsToDouble((long)2053862176 ^ 0xC009322D743D7739L);
                            Class1917.Method7158(Float.intBitsToFloat(1040120283));
                        }
                    }
                }
            }
        }
        else {
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = Float.intBitsToFloat(1017370378);
            ((AccessorEntityPlayer)Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player).Method6392(Float.intBitsToFloat(1017370378));
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method2366(final LivingEvent$LivingUpdateEvent livingEvent$LivingUpdateEvent) {
        if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive() && !Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRiding() && this.Field10166.Method359().equals("Sunrise")) {
            final MovementInput movementInput = Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput;
            movementInput.moveStrafe *= Float.intBitsToFloat(1045220557);
            final MovementInput movementInput2 = Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput;
            movementInput2.moveForward *= Float.intBitsToFloat(1045220557);
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.sprintToggleTimer = 0;
        }
        if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive() && !Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRiding() && this.Field10168.Method365() && Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % 2 == 0) {
            if (Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                if (!Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSprinting()) {
                    Class1917.Method7147(Double.longBitsToDouble(4581710059307609880L));
                }
                else {
                    Class1917.Method7147(Double.longBitsToDouble(4577494690056391104L));
                }
            }
            else {
                final EntityPlayerSP player = Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
                player.motionX *= Double.longBitsToDouble((long)1510234763 ^ 0x3FECCCCC9A045A8BL);
                final EntityPlayerSP player2 = Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
                player2.motionZ *= Double.longBitsToDouble((long)1223301621 ^ 0x3FECCCCC88EA19F5L);
            }
        }
    }
    
    private EnumHand Method2367(final Packet packet) {
        return (packet instanceof CPacketPlayerTryUseItem) ? ((CPacketPlayerTryUseItem)packet).getHand() : ((CPacketPlayerTryUseItemOnBlock)packet).getHand();
    }
    
    private void Method2368(final Class544 class544) {
        if (!(class544.Method982() instanceof SPacketPlayerPosLook)) {
            return;
        }
        this.Field10183 = ((SPacketPlayerPosLook)class544.Method982()).getTeleportId();
    }
    
    private void Method2369(final Class2015 class2015) {
        if (class2015.Method982() instanceof CPacketPlayer && this.Field10169.Method365() && this.Field10167.Method365() && Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive() && !Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRiding()) {
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging$Action.ABORT_DESTROY_BLOCK, Class1744.Method6657(), EnumFacing.DOWN));
        }
        else if (this.Field10170.Method365() && (class2015.Method982() instanceof CPacketPlayerTryUseItemOnBlock || class2015.Method982() instanceof CPacketPlayerTryUseItem) && (((Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemFood || Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemBow || Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemShield) && this.Method2367(class2015.Method982()) == EnumHand.MAIN_HAND) || ((Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() instanceof ItemFood || Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() instanceof ItemBow || Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() instanceof ItemShield) && this.Method2367(class2015.Method982()) == EnumHand.OFF_HAND))) {
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem));
        }
    }
    
    private void Method2370(final Class720 class720) {
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
            KeyBinding.setKeyBindState(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindForward.getKeyCode(), Keyboard.isKeyDown(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindForward.getKeyCode()));
            if (Keyboard.isKeyDown(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindForward.getKeyCode())) {
                final MovementInput movementInput = Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput;
                ++movementInput.moveForward;
                Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.forwardKeyDown = true;
            }
            else {
                Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.forwardKeyDown = false;
            }
            KeyBinding.setKeyBindState(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindBack.getKeyCode(), Keyboard.isKeyDown(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindBack.getKeyCode()));
            if (Keyboard.isKeyDown(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindBack.getKeyCode())) {
                final MovementInput movementInput2 = Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput;
                --movementInput2.moveForward;
                Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.backKeyDown = true;
            }
            else {
                Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.backKeyDown = false;
            }
            KeyBinding.setKeyBindState(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindLeft.getKeyCode(), Keyboard.isKeyDown(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindLeft.getKeyCode()));
            if (Keyboard.isKeyDown(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindLeft.getKeyCode())) {
                final MovementInput movementInput3 = Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput;
                ++movementInput3.moveStrafe;
                Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.leftKeyDown = true;
            }
            else {
                Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.leftKeyDown = false;
            }
            KeyBinding.setKeyBindState(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindRight.getKeyCode(), Keyboard.isKeyDown(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindRight.getKeyCode()));
            if (Keyboard.isKeyDown(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindRight.getKeyCode())) {
                final MovementInput movementInput4 = Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput;
                --movementInput4.moveStrafe;
                Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.rightKeyDown = true;
            }
            else {
                Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.rightKeyDown = false;
            }
            KeyBinding.setKeyBindState(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.getKeyCode(), Keyboard.isKeyDown(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.getKeyCode()));
            Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.jump = Keyboard.isKeyDown(Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.getKeyCode());
        }
        if (this.Field10167.Method365() && Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive() && !Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRiding()) {
            final MovementInput movementInput5 = Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput;
            movementInput5.moveForward /= (float)Double.longBitsToDouble(4596373779694328218L);
            final MovementInput movementInput6 = Class514.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput;
            movementInput6.moveStrafe /= (float)Double.longBitsToDouble((long)1813769446 ^ 0x3FC99999F582757CL);
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1B37 ^ 0x6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
