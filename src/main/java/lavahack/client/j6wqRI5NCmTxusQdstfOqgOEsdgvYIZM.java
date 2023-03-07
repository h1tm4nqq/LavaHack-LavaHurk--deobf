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
import lavahack.client.ABhseIFL1PQVX4WAovmpeO8P6T0dQPpk;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.Z9isRG6BYbrxGGNGITuabJZMH69DuRSA;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.o73igJQaa2O9BEYFQNAk42oaxHBow5kd;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import lavahack.client.zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4;
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

public class j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10166 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14228));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10167 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Items", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-16302609 ^ (long)-16302610)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10168 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Items Test", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-2111045038 ^ (long)-2111045038)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10169 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("NCPStrict", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-477574482L ^ 0xE388CAAE) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10170 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Strict", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1232450596 ^ (long)1232450596)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10171 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SlimeBlocks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1054972807 ^ (long)1054972806)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10172 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Web", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)862930098 ^ (long)862930098)));
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field10173 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("WebStrict", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field8165).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10174 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sneak", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1984273684L ^ 0x76459D14) != 0));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10175 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Jump", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1987578645L ^ 0x8987F4EB) != 0));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field10176 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Inv Move", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10177 = this.Field10176.Method7405(this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("InvMove", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1029857580 ^ (long)1029857581))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10178 = this.Field10176.Method7405(this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("IgnoreChat", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1561611094L ^ 0xA2EBB4AB) != 0).Method313(this.Field10177::Method365)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10179 = this.Field10176.Method7405(this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("IgnoreConsole", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-2049996642 ^ (long)-2049996641)).Method313(this.Field10177::Method365)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10180 = this.Field10176.Method7405(this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("IgnoreClickGui", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)179727749L ^ 0xAB66D85) != 0).Method313(this.Field10177::Method365)));
    public static j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM Field10181;
    private boolean Field10182 = (int)((long)-1958475192 ^ (long)-1958475192);
    private int Field10183 = (int)((long)886893348 ^ (long)886893348);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field10184 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method2370, new Predicate[(int)162470966L ^ 0x9AF1C36]);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field10185 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method2369, new Predicate[(int)((long)-1035920503 ^ (long)-1035920503)]);
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field10186 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, leqS0IyKEB621E1SrHdAcHHAUjScjmKi(lavahack.client.RG0Ef4LzpvaRaWkCktLl94QMei9n80rd ), (Llavahack/client/RG0Ef4LzpvaRaWkCktLl94QMei9n80rd;)V)(), new Predicate[(int)496608464L ^ 0x1D99A4D0]);
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field10187 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method2368, new Predicate[(int)476939057L ^ 0x1C6D8331]);
    private int Field10188;

    public j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM() {
        super("NoSlow", "NoSlow", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340);
        Field10181 = this;
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field10184);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field10185);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field10186);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field10187);
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field10184);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field10185);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field10186);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field10187);
        this.Field10182 = (int)1144852988L ^ 0x443D11FC;
        this.Field10183 = (int)-1508115187L ^ 0xA61BFD0D;
    }

    @Override
    public void Method45() {
        if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive() && this.Field10167.Method365() && vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItem(vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getActiveHand()).getItem() instanceof ItemShield && (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe != 0.0f || vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward != 0.0f && vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemInUseMaxCount() >= ((int)-2106989020L ^ 0x8269E625) << 3)) {
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHorizontalFacing()));
        }
        if (this.Field10171.Method365()) {
            if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getRidingEntity() != null) {
                Blocks.SLIME_BLOCK.setDefaultSlipperiness(Float.intBitsToFloat((int)((long)642733429 ^ (long)419666360)));
            } else {
                Blocks.SLIME_BLOCK.setDefaultSlipperiness(Float.intBitsToFloat((int)((long)1446505646 ^ (long)1764652340)));
            }
        }
        if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive() && !vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRiding() && (double)vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance > Double.longBitsToDouble(0xB79F6DB2171A841BL ^ 0x88790BD4717CE27DL) && PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6651((EntityLivingBase)vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) && this.Field10166.Method359().equals("None")) {
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX *= Double.longBitsToDouble(0x704F9E58E284BB27L ^ 0x4FA352942E4877EAL);
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ *= Double.longBitsToDouble(0x81400044C89CD77EL ^ 0xBEACCC8804501BB3L);
        }
        if (this.Field10174.Method365()) {
            this.Method20();
        }
        if (!this.Field10172.Method365()) {
            return;
        }
        if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getBlock() != Blocks.WEB) return;
        if (!vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWeb) {
            return;
        }
        if (this.Field10182 || this.Field10173.Method341() == j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field8165) {
            double[] dArray = new double[(int)((long)-1706774610 ^ (long)-1706774611)];
            dArray[(int)((long)-1320425124 ^ (long)-1320425124)] = vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX;
            dArray[(int)974423824L ^ 0x3A148711] = vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY;
            dArray[((int)1107754548L ^ 0x4206FE35) << 1] = vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ;
            double[] dArray2 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1957(dArray);
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = dArray2[(int)-1239390218L ^ 0xB62067F6];
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = dArray2[(int)-163361671L ^ 0xF6434C78];
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = dArray2[(int)((long)-646142592 ^ (long)-646142591) << 1];
        }
        if (this.Field10173.Method341() == j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field8167) {
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketConfirmTeleport(this.Field10183));
        }
        this.Field10182 = !this.Field10182 ? (int)((long)1593637734 ^ (long)1593637735) : (int)((long)186078125 ^ (long)186078125);
    }

    private void Method20() {
        if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSneaking()) {
            if (!vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindForward.isKeyDown()) return;
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = Float.intBitsToFloat((int)((long)1361688267 ^ (long)1826978310));
            if (!vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) return;
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX *= Double.longBitsToDouble((long)1506637868 ^ 0x4014000059CD782CL);
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ *= Double.longBitsToDouble(0xC2E6E91BCCF70AFFL ^ 0x82F2E91BCCF70AFFL);
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX /= Double.longBitsToDouble(0xE82F1E1A3F5FB5ABL ^ 0xA8262C373109B1B2L);
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ /= Double.longBitsToDouble(0xCA751B9A13CC3DD4L ^ 0x8A7C29B71D9A39CDL);
            o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7158(Float.intBitsToFloat((int)((long)1575127747 ^ (long)1612477208)));
            if (!vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindBack.isKeyDown()) return;
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = Float.intBitsToFloat((int)((long)247519133 ^ (long)862126231));
            if (!vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) return;
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX *= Double.longBitsToDouble(0x4EF50A778103B8A0L ^ 0x8EE10A778103B8A0L);
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ *= Double.longBitsToDouble(0xDE1CD32F4B1E2619L ^ 0x1E08D32F4B1E2619L);
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX /= Double.longBitsToDouble((long)937025066 ^ 0xC009322D398FDA33L);
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ /= Double.longBitsToDouble((long)2053862176 ^ 0xC009322D743D7739L);
            o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7158(Float.intBitsToFloat((int)942175166L ^ 0x5D68A65));
            return;
        }
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = Float.intBitsToFloat(0x5FB2ADA1 ^ 0x63117AAB);
        ((AccessorEntityPlayer)vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player).Method6392(Float.intBitsToFloat(0x5503737A ^ 0x69A0A470));
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2366(LivingEvent.LivingUpdateEvent livingUpdateEvent) {
        if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive() && !vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRiding() && this.Field10166.Method359().equals("Sunrise")) {
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe *= Float.intBitsToFloat(0x7E85A3AC ^ 0x40C96F61);
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward *= Float.intBitsToFloat((int)1459989654L ^ 0x6949605B);
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.sprintToggleTimer = (int)-1598765069L ^ 0xA0B4C7F3;
        }
        if (!vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive()) return;
        if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRiding()) return;
        if (!this.Field10168.Method365()) return;
        if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % ((int)((long)-884176874 ^ (long)-884176873) << 1) != 0) return;
        if (!vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX *= Double.longBitsToDouble((long)1510234763 ^ 0x3FECCCCC9A045A8BL);
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ *= Double.longBitsToDouble((long)1223301621 ^ 0x3FECCCCC88EA19F5L);
            return;
        }
        if (!vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSprinting()) {
            o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7147(Double.longBitsToDouble(0xDD88374A925D0BEAL ^ 0xE21DB64CB68024F2L));
            return;
        }
        o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7147(Double.longBitsToDouble(0x47F2CC410031F0D2L ^ 0x78744B6A023DB912L));
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

    private void Method2368(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketPlayerPosLook)) {
            return;
        }
        this.Field10183 = ((SPacketPlayerPosLook)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getTeleportId();
    }

    private void Method2369(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) {
        if (tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method982() instanceof CPacketPlayer && this.Field10169.Method365() && this.Field10167.Method365() && vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive() && !vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRiding()) {
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.ABORT_DESTROY_BLOCK, PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6657(), EnumFacing.DOWN));
            return;
        }
        if (!this.Field10170.Method365()) return;
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method982() instanceof CPacketPlayerTryUseItemOnBlock)) {
            if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method982() instanceof CPacketPlayerTryUseItem)) return;
        }
        if (!(vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemFood) && !(vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemBow) && !(vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemShield) || this.Method2367(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method982()) != EnumHand.MAIN_HAND) {
            if (!(vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() instanceof ItemFood) && !(vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() instanceof ItemBow)) {
                if (!(vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() instanceof ItemShield)) return;
            }
            if (this.Method2367(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method982()) != EnumHand.OFF_HAND) return;
        }
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem));
    }

    private void Method2370(Z9isRG6BYbrxGGNGITuabJZMH69DuRSA z9isRG6BYbrxGGNGITuabJZMH69DuRSA) {
        if (this.Field10177.Method365() && vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen != null) {
            if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen instanceof GuiChat && this.Field10178.Method365()) {
                return;
            }
            if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen instanceof ABhseIFL1PQVX4WAovmpeO8P6T0dQPpk && this.Field10179.Method365()) {
                return;
            }
            if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen instanceof zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4 && this.Field10180.Method365()) {
                return;
            }
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe = 0.0f;
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward = 0.0f;
            KeyBinding.setKeyBindState((int)vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindForward.getKeyCode(), (boolean)Keyboard.isKeyDown((int)vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindForward.getKeyCode()));
            if (Keyboard.isKeyDown((int)vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindForward.getKeyCode())) {
                vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward += 1.0f;
                vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.forwardKeyDown = (int)366336342L ^ 0x15D5D957;
            } else {
                vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.forwardKeyDown = (int)((long)-967932992 ^ (long)-967932992);
            }
            KeyBinding.setKeyBindState((int)vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindBack.getKeyCode(), (boolean)Keyboard.isKeyDown((int)vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindBack.getKeyCode()));
            if (Keyboard.isKeyDown((int)vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindBack.getKeyCode())) {
                vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward -= 1.0f;
                vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.backKeyDown = (int)212881494L ^ 0xCB05057;
            } else {
                vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.backKeyDown = (int)((long)-1905665940 ^ (long)-1905665940);
            }
            KeyBinding.setKeyBindState((int)vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindLeft.getKeyCode(), (boolean)Keyboard.isKeyDown((int)vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindLeft.getKeyCode()));
            if (Keyboard.isKeyDown((int)vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindLeft.getKeyCode())) {
                vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe += 1.0f;
                vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.leftKeyDown = (int)((long)-1195059293 ^ (long)-1195059294);
            } else {
                vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.leftKeyDown = (int)((long)-1262492449 ^ (long)-1262492449);
            }
            KeyBinding.setKeyBindState((int)vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindRight.getKeyCode(), (boolean)Keyboard.isKeyDown((int)vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindRight.getKeyCode()));
            if (Keyboard.isKeyDown((int)vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindRight.getKeyCode())) {
                vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe -= 1.0f;
                vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.rightKeyDown = (int)((long)-1818976645 ^ (long)-1818976646);
            } else {
                vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.rightKeyDown = (int)((long)-2089719286 ^ (long)-2089719286);
            }
            KeyBinding.setKeyBindState((int)vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.getKeyCode(), (boolean)Keyboard.isKeyDown((int)vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.getKeyCode()));
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.jump = Keyboard.isKeyDown((int)vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.getKeyCode());
        }
        if (!this.Field10167.Method365()) return;
        if (!vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive()) return;
        if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRiding()) return;
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward = (float)((double)vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward / Double.longBitsToDouble(0xB742F6B7D1E9489AL ^ 0x888B6F2E4870D100L));
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe = (float)((double)vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe / Double.longBitsToDouble((long)1813769446 ^ 0x3FC99999F582757CL));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-712776230 ^ (long)-712776230);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1685900182L ^ 0x647CCB69);
            int n2 = (int)((long)836790409 ^ (long)836790410) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)1501964323L ^ 0x59863314 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

