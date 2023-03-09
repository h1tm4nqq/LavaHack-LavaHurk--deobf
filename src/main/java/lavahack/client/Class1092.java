//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.realmsclient.gui.ChatFormatting
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.IBlockAccess
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import com.mojang.realmsclient.gui.ChatFormatting;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lavahack.client.Class1036;
import lavahack.client.Class1274;
import lavahack.client.Class1393;
import lavahack.client.Class1430;
import lavahack.client.Class1486;
import lavahack.client.Class1568;
import lavahack.client.Class2140;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class856;
import lavahack.client.Class9;
import lavahack.client.Class97;
import lavahack.client.Class99;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;

@Class99
public class Class1092
extends Class42 {
    public static Class1092 Field12889;
    protected final Class44 Field12890;
    protected final Class44 Field12891;
    protected final Class44 Field12892;
    protected final Class44 Field12893;
    protected final Class44 Field12894;
    protected final Class44 Field12895;
    protected final Class44 Field12896;
    protected final Class44 Field12897;
    protected final Class44 Field12898;
    protected final Class44 Field12899;
    protected final Class44 Field12900;
    protected final Class44 Field12901;
    protected final Class44 Field12902;
    protected final Class44 Field12903;
    protected final Class44 Field12904;
    protected final Class44 Field12905;
    protected final Class44 Field12906;
    protected Class650 Field12907;
    protected Map Field12908;
    protected int Field12909;
    protected Class650 Field12910;
    @Class1274
    public EntityPlayer Field12911;
    protected boolean Field12912;
    protected boolean Field12913;
    protected int Field12914;
    protected int Field12915;
    protected int Field12916;
    private boolean Field12917;
    protected BlockPos Field12918;
    private int Field12919;

    public Class1092() {
        super("AutoTrap", "trapping all players", Class97.Field8338);
        this.Field12890 = this.Method23(new Class44("Target Range", (Class42)this, Double.longBitsToDouble((long)1841366296 ^ 0x402400006DC10518L), 1.0, Double.longBitsToDouble((long)848586236 ^ 0x40340000329465FCL), true));
        this.Field12891 = this.Method23(new Class44("Disable On Complete", (Class42)this, false));
        this.Field12892 = this.Method23(new Class44("Delay", (Class42)this, Double.longBitsToDouble(0x4049000000000000L), 0.0, Double.longBitsToDouble((long)1235294582 ^ 0x4059000049A11976L), true));
        this.Field12893 = this.Method23(new Class44("Rotate", (Class42)this, true));
        this.Field12894 = this.Method23(new Class44("Blocks Per Tick", (Class42)this, Double.longBitsToDouble((long)1085930855 ^ 0x4020000040B9FD67L), 1.0, Double.longBitsToDouble(4629137466983448576L), true));
        this.Field12895 = this.Method23(new Class44("Anti Scaffold", (Class42)this, false));
        this.Field12896 = this.Method23(new Class44("Anti Step", (Class42)this, false));
        this.Field12897 = this.Method23(new Class44("Surround Placing", (Class42)this, true));
        this.Field12898 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble((long)437480911 ^ 0x401000001A136DCFL), 1.0, Double.longBitsToDouble(0x4014000000000000L), false));
        this.Field12899 = this.Method23(new Class44("RayTrace", (Class42)this, false));
        this.Field12900 = this.Method23(new Class44("Packet Place", (Class42)this, true));
        this.Field12901 = this.Method23(new Class44("Rewrite", (Class42)this, false));
        this.Field12902 = this.Method23(new Class44("Rewrite Dynamic", (Class42)this, false));
        this.Field12903 = this.Method23(new Class44("Rewrite Support Blocks", (Class42)this, Class856.Field11611));
        this.Field12904 = this.Method23(new Class44("Rewrite Retries", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(0x4034000000000000L), true));
        this.Field12905 = this.Method23(new Class44("Rewrite Switch Mode", (Class42)this, Class1430.Field14682));
        this.Field12906 = this.Method23(new Class44("Rewrite Rotate Mode", (Class42)this, Class2140.Field17793));
        this.Field12907 = new Class650();
        this.Field12908 = new HashMap();
        this.Field12910 = new Class650();
        this.Field12912 = false;
        this.Field12915 = 0;
        this.Field12916 = 0;
        this.Field12917 = false;
        this.Field12918 = null;
        super.Method21(false);
        Field12889 = this;
    }

    public Class1092(String string) {
        super(string, Class97.Field8338);
        this.Field12890 = this.Method23(new Class44("Target Range", (Class42)this, Double.longBitsToDouble(0x4024000000000000L), 1.0, Double.longBitsToDouble(0x4034000000000000L), true));
        this.Field12891 = this.Method23(new Class44("Disable On Complete", (Class42)this, false));
        this.Field12892 = this.Method23(new Class44("Delay", (Class42)this, Double.longBitsToDouble(0x4049000000000000L), 0.0, Double.longBitsToDouble(4636737291354636288L), true));
        this.Field12893 = this.Method23(new Class44("Rotate", (Class42)this, true));
        this.Field12894 = this.Method23(new Class44("Blocks Per Tick", (Class42)this, Double.longBitsToDouble((long)1480556123 ^ 0x40200000583F7E5BL), 1.0, Double.longBitsToDouble(4629137466983448576L), true));
        this.Field12895 = this.Method23(new Class44("Anti Scaffold", (Class42)this, false));
        this.Field12896 = this.Method23(new Class44("Anti Step", (Class42)this, false));
        this.Field12897 = this.Method23(new Class44("Surround Placing", (Class42)this, true));
        this.Field12898 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble((long)1763197052 ^ 0x401000006918407CL), 1.0, Double.longBitsToDouble(0x4014000000000000L), false));
        this.Field12899 = this.Method23(new Class44("RayTrace", (Class42)this, false));
        this.Field12900 = this.Method23(new Class44("Packet Place", (Class42)this, true));
        this.Field12901 = this.Method23(new Class44("Rewrite", (Class42)this, false));
        this.Field12902 = this.Method23(new Class44("Rewrite Dynamic", (Class42)this, false));
        this.Field12903 = this.Method23(new Class44("Rewrite Support Blocks", (Class42)this, Class856.Field11611));
        this.Field12904 = this.Method23(new Class44("Rewrite Retries", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)772541946 ^ 0x403400002E0C0DFAL), true));
        this.Field12905 = this.Method23(new Class44("Rewrite Switch Mode", (Class42)this, Class1430.Field14682));
        this.Field12906 = this.Method23(new Class44("Rewrite Rotate Mode", (Class42)this, Class2140.Field17793));
        this.Field12907 = new Class650();
        this.Field12908 = new HashMap();
        this.Field12910 = new Class650();
        this.Field12912 = false;
        this.Field12915 = 0;
        this.Field12916 = 0;
        this.Field12917 = false;
        this.Field12918 = null;
    }

    @Override
    public void Method38() {
        if (Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field12918 = Class394.Method1921((Entity)Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        this.Field12914 = Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        this.Field12908.clear();
    }

    @Override
    public void Method45() {
        if (Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Field12901.Method365()) {
            this.Field12917 = false;
            this.Method4469();
            return;
        }
        this.Method20();
    }

    protected void Method20() {
        int n;
        this.Field12911 = Class394.Method1924(this.Field12890.Method368());
        if (this.Field12911 == null) {
            return;
        }
        int n2 = Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (Class9.Method120(Blocks.OBSIDIAN, 0, 9) != -1) {
            n = Class9.Method120(Blocks.OBSIDIAN, 0, 9);
        } else {
            if (Class9.Method120(Blocks.ENDER_CHEST, 0, 9) == -1) return;
            n = Class9.Method120(Blocks.OBSIDIAN, 0, 9);
        }
        Class9.Method110(n, this.Field12905.Method359().equalsIgnoreCase("Silent"));
        for (BlockPos blockPos : this.Method4467()) {
            if (!Class1486.Method5951(blockPos, true, true, this.Field12909 <= this.Field12904.Method335())) continue;
            this.Method4468(blockPos);
            ++this.Field12909;
        }
        this.Field12916 = 0;
        if (this.Field12905.Method359().equalsIgnoreCase(Class1430.Field14682.name())) {
            Class9.Method110(n2, true);
        }
        if (!this.Method4467().isEmpty()) {
            return;
        }
        this.Field12909 = 0;
        if (!this.Field12891.Method365()) return;
        this.Method21(false);
    }

    protected ArrayList Method4467() {
        List list = this.Method4472();
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        for (BlockPos blockPos : list) {
            if (!this.Field12903.Method309(Class856.Field11610.name()) && (Class1036.Method4215(blockPos) == null || this.Field12903.Method309(Class856.Field11612.name()) && Class1486.Method5948(blockPos, true, true))) {
                arrayList.add(blockPos.down());
            }
            if (!this.Field12897.Method365()) continue;
            arrayList.add(blockPos);
        }
        for (BlockPos blockPos : this.Method4474()) {
            arrayList.add(blockPos.up());
            if (!this.Field12896.Method365()) continue;
            arrayList.add(blockPos.up().up());
        }
        Iterator iterator = this.Method4477().iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos;
            blockPos = (BlockPos)iterator.next();
            if (this.Field12896.Method365()) {
                arrayList.add(blockPos.up().up().up());
            }
            if (!this.Field12895.Method365()) continue;
            arrayList.add(blockPos.up().up().up().up());
        }
        return arrayList;
    }

    protected void Method4468(BlockPos blockPos) {
        if (this.Field12916 >= this.Field12894.Method335()) return;
        float[] fArray = new float[]{Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch};
        if (!this.Field12906.Method359().equalsIgnoreCase(Class2140.Field17791.name())) {
            float[] fArray2 = Class1568.Method6176(blockPos);
            Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = fArray2[0];
            Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = fArray2[1];
        }
        Class1486.Method5949(blockPos, EnumHand.MAIN_HAND, this.Field12900.Method365());
        ++this.Field12916;
        if (!this.Field12906.Method359().equalsIgnoreCase(Class2140.Field17793.name())) return;
        Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = fArray[0];
        Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = fArray[1];
    }

    private void Method4469() {
        if (this.Method28()) {
            return;
        }
        this.Method4470();
        if (!this.Field12912) return;
        this.Field12907.Method2801();
    }

    private void Method4470() {
        List list = Class1036.Method4194(this.Field12911.getPositionVector(), this.Field12895.Method365(), this.Field12896.Method365(), this.Field12897.Method365(), false, false, this.Field12899.Method365());
        this.Method4471(list);
    }

    private void Method4471(List list) {
        list.sort(Class1092::Method4483);
        list.sort(Comparator.comparingDouble(Class1092::Method4482));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Vec3d vec3d = (Vec3d)iterator.next();
            BlockPos blockPos = new BlockPos(vec3d);
            int n = Class1036.Method4190(blockPos, this.Field12899.Method365());
            if (n == 1 && (this.Field12908.get(blockPos) == null || (Integer)this.Field12908.get(blockPos) < 4)) {
                this.Method4481(blockPos);
                this.Field12908.put(blockPos, this.Field12908.get(blockPos) == null ? 1 : (Integer)this.Field12908.get(blockPos) + 1);
                this.Field12910.Method2801();
                continue;
            }
            if (n != 3) continue;
            this.Method4481(blockPos);
        }
    }

    protected boolean Method28() {
        if (Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return false;
        if (this.Field12918 == null) {
            return false;
        }
        this.Field12912 = false;
        this.Field12915 = 0;
        int n = Class9.Method120(Blocks.OBSIDIAN, 0, 9);
        if (n == -1) {
            this.Method21(false);
        }
        int n2 = Class9.Method120(Blocks.OBSIDIAN, 0, 9);
        if (!super.Method35()) {
            return true;
        }
        if (!this.Field12918.equals((Object)Class394.Method1921((Entity)Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player))) {
            this.Method21(false);
            return true;
        }
        if (this.Field12910.Method2797(2000L)) {
            this.Field12908.clear();
            this.Field12910.Method2801();
        }
        if (n2 == -1) {
            Class1393.Method5504().Method1886(ChatFormatting.RED + "No Obsidian in hotbar, AutoTrap disabling...");
            this.Method21(false);
            return true;
        }
        if (Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem != this.Field12914 && Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem != n2) {
            this.Field12914 = Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        }
        this.Field12913 = Class394.Method1922(this.Field12913);
        this.Field12911 = Class394.Method1924(this.Field12890.Method368());
        if (this.Field12911 == null) return true;
        if (!this.Field12907.Method2797(this.Field12892.Method335())) return true;
        return false;
    }

    private List Method4472() {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        Iterator iterator = this.Method4475().iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            if (this.Method4473(blockPos)) continue;
            arrayList.add(blockPos);
        }
        return arrayList;
    }

    private boolean Method4473(BlockPos blockPos) {
        if (Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) return false;
        return true;
    }

    private List Method4474() {
        ArrayList arrayList = new ArrayList();
        if (this.Field12902.Method365()) {
            int n;
            int n2;
            double d = Math.abs(this.Field12911.posX) - Math.floor(Math.abs(this.Field12911.posX));
            double d2 = Math.abs(this.Field12911.posZ) - Math.floor(Math.abs(this.Field12911.posZ));
            int n3 = this.Method4479(d, false);
            int n4 = this.Method4479(d, true);
            int n5 = this.Method4479(d2, false);
            int n6 = this.Method4479(d2, true);
            ArrayList<BlockPos> arrayList2 = new ArrayList<BlockPos>();
            for (n2 = 1; n2 < n3 + 1; ++n2) {
                arrayList2.add(this.Method4480(this.Method4476(), n2, 1 + n5));
                arrayList2.add(this.Method4480(this.Method4476(), n2, -(1 + n6)));
            }
            for (n2 = 0; n2 <= n4; ++n2) {
                arrayList2.add(this.Method4480(this.Method4476(), -n2, 1 + n5));
                arrayList2.add(this.Method4480(this.Method4476(), -n2, -(1 + n6)));
            }
            for (n = 1; n < n5 + 1; ++n) {
                arrayList2.add(this.Method4480(this.Method4476(), 1 + n3, n));
                arrayList2.add(this.Method4480(this.Method4476(), -(1 + n4), n));
            }
            n = 0;
            while (true) {
                if (n > n6) {
                    arrayList.addAll(arrayList2);
                    return arrayList;
                }
                arrayList2.add(this.Method4480(this.Method4476(), 1 + n3, -n));
                arrayList2.add(this.Method4480(this.Method4476(), -(1 + n4), -n));
                ++n;
            }
        }
        EnumFacing[] enumFacingArray = EnumFacing.HORIZONTALS;
        int n = enumFacingArray.length;
        int n7 = 0;
        while (n7 < n) {
            EnumFacing enumFacing = enumFacingArray[n7];
            arrayList.add(this.Method4476().add(enumFacing.getXOffset(), 0, enumFacing.getZOffset()));
            ++n7;
        }
        return arrayList;
    }

    private List Method4475() {
        ArrayList arrayList = new ArrayList();
        if (this.Field12902.Method365()) {
            int n;
            int n2;
            double d = Math.abs(this.Field12911.posX) - Math.floor(Math.abs(this.Field12911.posX));
            double d2 = Math.abs(this.Field12911.posZ) - Math.floor(Math.abs(this.Field12911.posZ));
            int n3 = this.Method4479(d, false);
            int n4 = this.Method4479(d, true);
            int n5 = this.Method4479(d2, false);
            int n6 = this.Method4479(d2, true);
            ArrayList<BlockPos> arrayList2 = new ArrayList<BlockPos>();
            arrayList.addAll(this.Method4477());
            for (n2 = 1; n2 < n3 + 1; ++n2) {
                arrayList2.add(this.Method4480(this.Method4476(), n2, 1 + n5));
                arrayList2.add(this.Method4480(this.Method4476(), n2, -(1 + n6)));
            }
            for (n2 = 0; n2 <= n4; ++n2) {
                arrayList2.add(this.Method4480(this.Method4476(), -n2, 1 + n5));
                arrayList2.add(this.Method4480(this.Method4476(), -n2, -(1 + n6)));
            }
            for (n = 1; n < n5 + 1; ++n) {
                arrayList2.add(this.Method4480(this.Method4476(), 1 + n3, n));
                arrayList2.add(this.Method4480(this.Method4476(), -(1 + n4), n));
            }
            n = 0;
            while (true) {
                if (n > n6) {
                    arrayList.addAll(arrayList2);
                    return arrayList;
                }
                arrayList2.add(this.Method4480(this.Method4476(), 1 + n3, -n));
                arrayList2.add(this.Method4480(this.Method4476(), -(1 + n4), -n));
                ++n;
            }
        }
        EnumFacing[] enumFacingArray = EnumFacing.HORIZONTALS;
        int n = enumFacingArray.length;
        int n7 = 0;
        while (n7 < n) {
            EnumFacing enumFacing = enumFacingArray[n7];
            arrayList.add(this.Method4476().add(enumFacing.getXOffset(), 0, enumFacing.getZOffset()));
            ++n7;
        }
        return arrayList;
    }

    private BlockPos Method4476() {
        double d;
        double d2 = this.Field12911.posX;
        if (this.Field12911.posY - Math.floor(this.Field12911.posY) > Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4626151983804780791L)) ^ 0x7FDAFD219E3E896DL)) {
            d = Math.floor(this.Field12911.posY) + Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4617211115437597968L)) ^ 0x7FE3A10BE4A4A510L);
            return new BlockPos(d2, d, this.Field12911.posZ);
        }
        d = Math.floor(this.Field12911.posY);
        return new BlockPos(d2, d, this.Field12911.posZ);
    }

    private List Method4477() {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        int n = this.Method4478(this.Field12911.posX - Math.floor(this.Field12911.posX));
        int n2 = this.Method4478(this.Field12911.posZ - Math.floor(this.Field12911.posZ));
        arrayList.add(this.Method4476());
        int n3 = 0;
        while (n3 <= Math.abs(n)) {
            for (int i = 0; i <= Math.abs(n2); ++i) {
                int n4 = n3 * n;
                int n5 = i * n2;
                arrayList.add(this.Method4476().add(n4, -1, n5));
            }
            ++n3;
        }
        return arrayList;
    }

    private int Method4478(double d) {
        if (d >= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4626940857062532511L)) ^ 0x7FD05457839243F9L)) {
            return 1;
        }
        if (!(d <= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)765248200 ^ 0x401C24713BD4D520L)) ^ 0x7FCF1742257B24DBL))) return 0;
        return -1;
    }

    private int Method4479(double d, boolean bl) {
        if (bl) {
            if (!(d <= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1420838851 ^ 0x403E8FD0CFE6CCECL)) ^ 0x7FEDBCE3A865B81CL))) return 0;
            return 1;
        }
        if (!(d >= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)343314738 ^ 0x403659BB09024309L)) ^ 0x7FD03FDD7B12B45DL))) return 0;
        return 1;
    }

    private BlockPos Method4480(BlockPos blockPos, double d, double d2) {
        if (blockPos.getX() < 0) {
            d = -d;
        }
        if (blockPos.getZ() >= 0) {
            return blockPos.add(d, Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)555623327 ^ 0x7FEA77598AF9D45EL)) ^ 0x7FEA7759ABE7F7C1L), d2);
        }
        d2 = -d2;
        return blockPos.add(d, Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)555623327 ^ 0x7FEA77598AF9D45EL)) ^ 0x7FEA7759ABE7F7C1L), d2);
    }

    private void Method4481(BlockPos blockPos) {
        if (this.Field12915 >= this.Field12894.Method335()) return;
        double d = Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(blockPos);
        double d2 = Double.longBitsToDouble(0x4014000000000000L);
        return (void)(d2 * d2);
    }

    private static double Method4482(Vec3d vec3d) {
        return vec3d.y;
    }

    private static int Method4483(Vec3d vec3d, Vec3d vec3d2) {
        return Double.compare(Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(vec3d2.x, vec3d2.y, vec3d2.z), Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(vec3d.x, vec3d.y, vec3d.z));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 189;
            cArray2[n] = (char)(cArray[n] ^ (0x1675 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

