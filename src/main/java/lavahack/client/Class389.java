//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import net.minecraft.entity.item.*;
import java.util.function.*;
import net.minecraft.network.play.server.*;
import net.minecraft.init.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import java.util.*;

@Class1887
public class Class389 extends Class42
{
    private final Class1996 Field9626;
    private final Class44 Field9627;
    private final Class44 Field9628;
    private final Class44 Field9629;
    private final Class44 Field9630;
    private final Class44 Field9631;
    private final Class44 Field9632;
    private final Class44 Field9633;
    private final Class44 Field9634;
    public static Class389 Field9635;
    private final Supplier Field9636;
    private Entity Field9637;
    private EntityEnderCrystal Field9638;
    private boolean Field9639;
    private BlockPos Field9640;
    @Class1801
    private final Class618 Field9641;
    private String Field9642 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class389() {
        super("CevBreaker", "Are ya satisfied, banckie?", Class97.Field8338, 0, true);
        this.Field9626 = this.Method24(new Class1996(new Class44("Trap", this)));
        this.Field9627 = this.Method23(this.Field9626.Method7405(new Class44("TrapMode", this, (Enum)Class1247.Field13648)));
        this.Field9628 = this.Method23(this.Field9626.Method7405(new Class44("TrapSwitch", this, Class711.Field11028).Method355("Switch")));
        this.Field9629 = this.Method23(this.Field9626.Method7405(new Class44("HelpingBlocks", this, false)));
        this.Field9630 = this.Method23(this.Field9626.Method7405(new Class44("FeetBlocks", this, false)));
        this.Field9631 = this.Method23(this.Field9626.Method7405(new Class44("AntiStep", this, false)));
        this.Field9632 = this.Method23(this.Field9626.Method7405(new Class44("Dynamic", this, false)));
        this.Field9633 = this.Method23(this.Field9626.Method7405(new Class44("Rotate", this, false)));
        this.Field9634 = this.Method23(this.Field9626.Method7405(new Class44("Packet", this, false)));
        this.Field9636 = this::Method1904;
        this.Field9637 = null;
        this.Field9638 = null;
        this.Field9639 = true;
        this.Field9640 = null;
        this.Field9641 = new Class618(this::Method1903, new Predicate[0]);
        Class389.Field9635 = this;
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
        if (Class389.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class389.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field9637 = (Entity)Class394.Method1924(Float.intBitsToFloat(1090519040));
        if (this.Field9637 == null) {
            return;
        }
        if (this.Field9639) {
            this.Method1899(this.Field9637);
            this.Field9640 = Method1901(this.Field9637).up(2);
            this.Field9639 = false;
        }
    }
    
    private int Method1898() {
        return Class9.Method127(Blocks.OBSIDIAN);
    }
    
    private void Method1899(final Entity entity) {
        final List method1900 = this.Method1900(entity);
        final int method1901 = this.Method1898();
        if (method1901 == -1) {
            return;
        }
        final int currentItem = Class389.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        ((Class711)this.Field9628.Method341()).Method2972().Method1726(new Object[] { method1901, false });
        method1900.forEach(this::Method1902);
        ((Class711)this.Field9628.Method341()).Method2972().Method1726(new Object[] { currentItem, true });
    }
    
    private List Method1900(final Entity entity) {
        final List method2271 = this.Field9636.get().Method2271((Class1247)this.Field9627.Method341(), entity);
        if (this.Field9629.Method365()) {
            method2271.addAll(0, this.Field9636.get().Method2272(entity));
        }
        if (this.Field9630.Method365()) {
            method2271.addAll(0, this.Field9636.get().Method2273(entity));
        }
        if (this.Field9631.Method365()) {
            method2271.addAll(this.Field9636.get().Method2274(entity));
        }
        return method2271;
    }
    
    private static BlockPos Method1901(final Entity entity) {
        return new BlockPos(entity.posX, entity.posY, entity.posZ);
    }
    
    private void Method1902(final BlockPos blockPos) {
        Class1036.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field9633.Method365(), this.Field9634.Method365());
    }
    
    private void Method1903(final Class544 class544) {
        if (this.Field9640 == null) {
            return;
        }
        if (!(class544.Method982() instanceof SPacketBlockChange)) {
            return;
        }
        if (((SPacketBlockChange)class544.Method982()).getBlockPosition() != this.Field9640) {
            return;
        }
        final int method126 = Class9.Method126(Items.END_CRYSTAL);
        if (method126 == -1) {
            this.Field9639 = true;
            return;
        }
        final int currentItem = Class389.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        ((Class711)this.Field9628.Method341()).Method2972().Method1726(new Object[] { method126, false });
        Class389.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.processRightClickBlock(Class389.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class389.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, this.Field9640, EnumFacing.UP, new Vec3d(0.0, 0.0, 0.0), EnumHand.MAIN_HAND);
        ((Class711)this.Field9628.Method341()).Method2972().Method1726(new Object[] { currentItem, true });
        EntityEnderCrystal entityEnderCrystal = null;
        final Iterator<EntityEnderCrystal> iterator = Class389.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)EntityEnderCrystal.class, new AxisAlignedBB(this.Field9640.up())).iterator();
        if (iterator.hasNext()) {
            final EntityEnderCrystal entityEnderCrystal2 = iterator.next();
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
        return (Class1058)(this.Field9632.Method365() ? new Class1243((Class793)null) : new Class491(null));
    }
    
    static BlockPos Method1905(final Entity entity) {
        return Method1901(entity);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x780E ^ 0xD4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
