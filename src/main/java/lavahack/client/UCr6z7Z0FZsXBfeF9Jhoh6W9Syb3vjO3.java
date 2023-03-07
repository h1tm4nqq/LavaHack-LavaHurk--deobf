//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.network.play.server.SPacketBlockChange
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.network.play.server.SPacketBlockChange;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

@YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz
public class UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field9626 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Trap", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9627 = this.Method23(this.Field9626.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TrapMode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field13648)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9628 = this.Method23(this.Field9626.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TrapSwitch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11028).Method355("Switch")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9629 = this.Method23(this.Field9626.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HelpingBlocks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)605836583 ^ (long)605836583))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9630 = this.Method23(this.Field9626.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("FeetBlocks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)2004469105L ^ 0x7779C571) != 0)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9631 = this.Method23(this.Field9626.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("AntiStep", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1114186104 ^ (long)1114186104))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9632 = this.Method23(this.Field9626.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Dynamic", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-549190038 ^ (long)-549190038))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9633 = this.Method23(this.Field9626.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)74770574 ^ (long)74770574))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9634 = this.Method23(this.Field9626.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-393234665L ^ 0xE88FB717) != 0)));
    public static UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3 Field9635;
    private final Supplier Field9636 = this::Method1904;
    private Entity Field9637 = null;
    private EntityEnderCrystal Field9638 = null;
    private boolean Field9639 = (int)1602265230L ^ 0x5F80A08F;
    private BlockPos Field9640 = null;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field9641 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method1903, new Predicate[(int)1238576364L ^ 0x49D32CEC]);
    private String Field9642 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3() {
        super("CevBreaker", "Are ya satisfied, banckie?", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338, (int)1379177886L ^ 0x5234959E, (boolean)((long)-1371898692 ^ (long)-1371898691));
        Field9635 = this;
    }

    @Override
    public void Method39() {
        super.Method39();
        this.Field9637 = null;
        this.Field9638 = null;
        this.Field9639 = (int)((long)-781153818 ^ (long)-781153817);
        this.Field9640 = null;
    }

    @Override
    public void Method45() {
        if (UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field9637 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1924(Float.intBitsToFloat((int)((long)629083580 ^ (long)1686048188)));
        if (this.Field9637 == null) {
            return;
        }
        if (!this.Field9639) return;
        this.Method1899(this.Field9637);
        this.Field9640 = UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3.Method1901(this.Field9637).up((int)((long)-1136990609 ^ (long)-1136990610) << 1);
        this.Field9639 = (int)-1832299910L ^ 0x92C9527A;
    }

    private int Method1898() {
        return lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127(Blocks.OBSIDIAN);
    }

    private void Method1899(Entity entity) {
        List list = this.Method1900(entity);
        int n = this.Method1898();
        if (n == (int)((long)-1928121949 ^ (long)1928121948)) {
            return;
        }
        int n2 = UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        Object[] objectArray = new Object[(int)((long)-1312813384 ^ (long)-1312813383) << 1];
        objectArray[(int)-2018712541L ^ 0x87ACE423] = n;
        objectArray[(int)((long)1467110624 ^ (long)1467110625)] = ((int)355071996L ^ 0x1529F7FC) != 0;
        ((FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field9628.Method341()).Method2972().Method1726(objectArray);
        list.forEach(this::Method1902);
        Object[] objectArray2 = new Object[((int)875626779L ^ 0x3431011A) << 1];
        objectArray2[(int)659435090L ^ 0x274E2E52] = n2;
        objectArray2[(int)-149022432L ^ 0xF71E1921] = ((int)-1223261032L ^ 0xB7168499) != 0;
        ((FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field9628.Method341()).Method2972().Method1726(objectArray2);
    }

    private List Method1900(Entity entity) {
        List list = ((UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field9636.get()).Method2271((UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV)this.Field9627.Method341(), entity);
        if (this.Field9629.Method365()) {
            list.addAll((int)-278706566L ^ 0xEF63467A, ((UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field9636.get()).Method2272(entity));
        }
        if (this.Field9630.Method365()) {
            list.addAll((int)((long)-39192444 ^ (long)-39192444), ((UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field9636.get()).Method2273(entity));
        }
        if (!this.Field9631.Method365()) return list;
        list.addAll(((UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field9636.get()).Method2274(entity));
        return list;
    }

    private static BlockPos Method1901(Entity entity) {
        return new BlockPos(entity.posX, entity.posY, entity.posZ);
    }

    private void Method1902(BlockPos blockPos) {
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field9633.Method365(), this.Field9634.Method365());
    }

    private void Method1903(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (this.Field9640 == null) {
            return;
        }
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketBlockChange)) {
            return;
        }
        SPacketBlockChange sPacketBlockChange = (SPacketBlockChange)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
        if (sPacketBlockChange.getBlockPosition() != this.Field9640) {
            return;
        }
        int n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method126(Items.END_CRYSTAL);
        if (n == (int)((long)1435155988 ^ (long)-1435155989)) {
            this.Field9639 = (int)1558345930L ^ 0x5CE278CB;
            return;
        }
        int n2 = UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        Object[] objectArray = new Object[((int)1586989953L ^ 0x5E978B80) << 1];
        objectArray[(int)-820671678L ^ 0xCF158B42] = n;
        objectArray[(int)-729536773L ^ 0xD48426FA] = ((int)2138312018L ^ 0x7F740D52) != 0;
        ((FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field9628.Method341()).Method2972().Method1726(objectArray);
        UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.processRightClickBlock(UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, this.Field9640, EnumFacing.UP, new Vec3d(0.0, 0.0, 0.0), EnumHand.MAIN_HAND);
        Object[] objectArray2 = new Object[((int)-587033825L ^ 0xDD02931E) << 1];
        objectArray2[(int)((long)2071923980 ^ (long)2071923980)] = n2;
        objectArray2[(int)((long)1974111477 ^ (long)1974111476)] = ((int)239657042L ^ 0xE48E053) != 0;
        ((FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field9628.Method341()).Method2972().Method1726(objectArray2);
        EntityEnderCrystal entityEnderCrystal = null;
        Iterator iterator = UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(EntityEnderCrystal.class, new AxisAlignedBB(this.Field9640.up())).iterator();
        if (iterator.hasNext()) {
            EntityEnderCrystal entityEnderCrystal2 = (EntityEnderCrystal)iterator.next();
            UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketUseEntity((Entity)entityEnderCrystal2));
            entityEnderCrystal = entityEnderCrystal2;
        }
        if (entityEnderCrystal != null) {
            entityEnderCrystal.setDead();
            UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityFromWorld(entityEnderCrystal.entityId);
        }
        this.Field9639 = (int)-1665738153L ^ 0x9CB6DA56;
    }

    private UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method1904() {
        UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi uCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        if (this.Field9632.Method365()) {
            uCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = new UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(null);
            return uCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        }
        uCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = new UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(null);
        return uCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
    }

    static BlockPos Method1905(Entity entity) {
        return UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3.Method1901(entity);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1933854140L ^ 0x8CBBBA44;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-2137921564L ^ 0x8091E71B);
            int n2 = (int)((long)-1619656986 ^ (long)-1619657005) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-954904740 ^ (long)-954895525) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

