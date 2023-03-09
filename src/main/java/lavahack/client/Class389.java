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
import lavahack.client.Class1036;
import lavahack.client.Class1058;
import lavahack.client.Class1243;
import lavahack.client.Class1247;
import lavahack.client.Class1801;
import lavahack.client.Class1887;
import lavahack.client.Class1996;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class491;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class711;
import lavahack.client.Class9;
import lavahack.client.Class97;
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

@Class1887
public class Class389
extends Class42 {
    private final Class1996 Field9626 = this.Method24(new Class1996(new Class44("Trap", this)));
    private final Class44 Field9627 = this.Method23(this.Field9626.Method7405(new Class44("TrapMode", (Class42)this, Class1247.Field13648)));
    private final Class44 Field9628 = this.Method23(this.Field9626.Method7405(new Class44("TrapSwitch", (Class42)this, Class711.Field11028).Method355("Switch")));
    private final Class44 Field9629 = this.Method23(this.Field9626.Method7405(new Class44("HelpingBlocks", (Class42)this, false)));
    private final Class44 Field9630 = this.Method23(this.Field9626.Method7405(new Class44("FeetBlocks", (Class42)this, false)));
    private final Class44 Field9631 = this.Method23(this.Field9626.Method7405(new Class44("AntiStep", (Class42)this, false)));
    private final Class44 Field9632 = this.Method23(this.Field9626.Method7405(new Class44("Dynamic", (Class42)this, false)));
    private final Class44 Field9633 = this.Method23(this.Field9626.Method7405(new Class44("Rotate", (Class42)this, false)));
    private final Class44 Field9634 = this.Method23(this.Field9626.Method7405(new Class44("Packet", (Class42)this, false)));
    public static Class389 Field9635;
    private final Supplier Field9636 = this::Method1904;
    private Entity Field9637 = null;
    private EntityEnderCrystal Field9638 = null;
    private boolean Field9639 = true;
    private BlockPos Field9640 = null;
    @Class1801
    private final Class618 Field9641 = new Class618(this::Method1903, new Predicate[0]);
    private String Field9642 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class389() {
        super("CevBreaker", "Are ya satisfied, banckie?", Class97.Field8338, 0, true);
        Field9635 = this;
    }

    @Override
    public void Method39() {
        super.Method39();
        this.Field9637 = null;
        this.Field9638 = null;
        this.Field9639 = true;
        this.Field9640 = null;
    }

    @Override
    public void Method45() {
        if (Class389.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class389.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field9637 = Class394.Method1924(Float.intBitsToFloat(0x41000000));
        if (this.Field9637 == null) {
            return;
        }
        if (!this.Field9639) return;
        this.Method1899(this.Field9637);
        this.Field9640 = Class389.Method1901(this.Field9637).up(2);
        this.Field9639 = false;
    }

    private int Method1898() {
        return Class9.Method127(Blocks.OBSIDIAN);
    }

    private void Method1899(Entity entity) {
        List list = this.Method1900(entity);
        int n = this.Method1898();
        if (n == -1) {
            return;
        }
        int n2 = Class389.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        ((Class711)this.Field9628.Method341()).Method2972().Method1726(n, false);
        list.forEach(this::Method1902);
        ((Class711)this.Field9628.Method341()).Method2972().Method1726(n2, true);
    }

    private List Method1900(Entity entity) {
        List list = ((Class1058)this.Field9636.get()).Method2271((Class1247)this.Field9627.Method341(), entity);
        if (this.Field9629.Method365()) {
            list.addAll(0, ((Class1058)this.Field9636.get()).Method2272(entity));
        }
        if (this.Field9630.Method365()) {
            list.addAll(0, ((Class1058)this.Field9636.get()).Method2273(entity));
        }
        if (!this.Field9631.Method365()) return list;
        list.addAll(((Class1058)this.Field9636.get()).Method2274(entity));
        return list;
    }

    private static BlockPos Method1901(Entity entity) {
        return new BlockPos(entity.posX, entity.posY, entity.posZ);
    }

    private void Method1902(BlockPos blockPos) {
        Class1036.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field9633.Method365(), this.Field9634.Method365());
    }

    private void Method1903(Class544 class544) {
        if (this.Field9640 == null) {
            return;
        }
        if (!(class544.Method982() instanceof SPacketBlockChange)) {
            return;
        }
        SPacketBlockChange sPacketBlockChange = (SPacketBlockChange)class544.Method982();
        if (sPacketBlockChange.getBlockPosition() != this.Field9640) {
            return;
        }
        int n = Class9.Method126(Items.END_CRYSTAL);
        if (n == -1) {
            this.Field9639 = true;
            return;
        }
        int n2 = Class389.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        ((Class711)this.Field9628.Method341()).Method2972().Method1726(n, false);
        Class389.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.processRightClickBlock(Class389.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class389.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, this.Field9640, EnumFacing.UP, new Vec3d(0.0, 0.0, 0.0), EnumHand.MAIN_HAND);
        ((Class711)this.Field9628.Method341()).Method2972().Method1726(n2, true);
        EntityEnderCrystal entityEnderCrystal = null;
        Iterator iterator = Class389.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(EntityEnderCrystal.class, new AxisAlignedBB(this.Field9640.up())).iterator();
        if (iterator.hasNext()) {
            EntityEnderCrystal entityEnderCrystal2 = (EntityEnderCrystal)iterator.next();
            Class389.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketUseEntity((Entity)entityEnderCrystal2));
            entityEnderCrystal = entityEnderCrystal2;
        }
        if (entityEnderCrystal != null) {
            entityEnderCrystal.setDead();
            Class389.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityFromWorld(entityEnderCrystal.entityId);
        }
        this.Field9639 = true;
    }

    private Class1058 Method1904() {
        Class1058 class1058;
        if (this.Field9632.Method365()) {
            class1058 = new Class1243(null);
            return class1058;
        }
        class1058 = new Class491(null);
        return class1058;
    }

    static BlockPos Method1905(Entity entity) {
        return Class389.Method1901(entity);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 212;
            cArray2[n] = (char)(cArray[n] ^ (0x780E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

