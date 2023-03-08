//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import net.minecraft.init.*;
import net.minecraft.util.math.*;
import java.util.function.*;
import com.mojang.realmsclient.gui.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraft.util.*;

@Class99
public class Class1092 extends Class42
{
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
        this.Field12890 = this.Method23(new Class44("Target Range", this, Double.longBitsToDouble((long)1841366296 ^ 0x402400006DC10518L), 1.0, Double.longBitsToDouble((long)848586236 ^ 0x40340000329465FCL), true));
        this.Field12891 = this.Method23(new Class44("Disable On Complete", this, false));
        this.Field12892 = this.Method23(new Class44("Delay", this, Double.longBitsToDouble(4632233691727265792L), 0.0, Double.longBitsToDouble((long)1235294582 ^ 0x4059000049A11976L), true));
        this.Field12893 = this.Method23(new Class44("Rotate", this, true));
        this.Field12894 = this.Method23(new Class44("Blocks Per Tick", this, Double.longBitsToDouble((long)1085930855 ^ 0x4020000040B9FD67L), 1.0, Double.longBitsToDouble(4629137466983448576L), true));
        this.Field12895 = this.Method23(new Class44("Anti Scaffold", this, false));
        this.Field12896 = this.Method23(new Class44("Anti Step", this, false));
        this.Field12897 = this.Method23(new Class44("Surround Placing", this, true));
        this.Field12898 = this.Method23(new Class44("Range", this, Double.longBitsToDouble((long)437480911 ^ 0x401000001A136DCFL), 1.0, Double.longBitsToDouble(4617315517961601024L), false));
        this.Field12899 = this.Method23(new Class44("RayTrace", this, false));
        this.Field12900 = this.Method23(new Class44("Packet Place", this, true));
        this.Field12901 = this.Method23(new Class44("Rewrite", this, false));
        this.Field12902 = this.Method23(new Class44("Rewrite Dynamic", this, false));
        this.Field12903 = this.Method23(new Class44("Rewrite Support Blocks", this, Class856.Field11611));
        this.Field12904 = this.Method23(new Class44("Rewrite Retries", this, 0.0, 0.0, Double.longBitsToDouble(4626322717216342016L), true));
        this.Field12905 = this.Method23(new Class44("Rewrite Switch Mode", this, Class1430.Field14682));
        this.Field12906 = this.Method23(new Class44("Rewrite Rotate Mode", this, Class2140.Field17793));
        this.Field12907 = new Class650();
        this.Field12908 = new HashMap();
        this.Field12910 = new Class650();
        this.Field12912 = false;
        this.Field12915 = 0;
        this.Field12916 = 0;
        this.Field12917 = false;
        this.Field12918 = null;
        super.Method21(false);
        Class1092.Field12889 = this;
    }
    
    public Class1092(final String s) {
        super(s, Class97.Field8338);
        this.Field12890 = this.Method23(new Class44("Target Range", this, Double.longBitsToDouble(4621819117588971520L), 1.0, Double.longBitsToDouble(4626322717216342016L), true));
        this.Field12891 = this.Method23(new Class44("Disable On Complete", this, false));
        this.Field12892 = this.Method23(new Class44("Delay", this, Double.longBitsToDouble(4632233691727265792L), 0.0, Double.longBitsToDouble(4636737291354636288L), true));
        this.Field12893 = this.Method23(new Class44("Rotate", this, true));
        this.Field12894 = this.Method23(new Class44("Blocks Per Tick", this, Double.longBitsToDouble((long)1480556123 ^ 0x40200000583F7E5BL), 1.0, Double.longBitsToDouble(4629137466983448576L), true));
        this.Field12895 = this.Method23(new Class44("Anti Scaffold", this, false));
        this.Field12896 = this.Method23(new Class44("Anti Step", this, false));
        this.Field12897 = this.Method23(new Class44("Surround Placing", this, true));
        this.Field12898 = this.Method23(new Class44("Range", this, Double.longBitsToDouble((long)1763197052 ^ 0x401000006918407CL), 1.0, Double.longBitsToDouble(4617315517961601024L), false));
        this.Field12899 = this.Method23(new Class44("RayTrace", this, false));
        this.Field12900 = this.Method23(new Class44("Packet Place", this, true));
        this.Field12901 = this.Method23(new Class44("Rewrite", this, false));
        this.Field12902 = this.Method23(new Class44("Rewrite Dynamic", this, false));
        this.Field12903 = this.Method23(new Class44("Rewrite Support Blocks", this, Class856.Field11611));
        this.Field12904 = this.Method23(new Class44("Rewrite Retries", this, 0.0, 0.0, Double.longBitsToDouble((long)772541946 ^ 0x403400002E0C0DFAL), true));
        this.Field12905 = this.Method23(new Class44("Rewrite Switch Mode", this, Class1430.Field14682));
        this.Field12906 = this.Method23(new Class44("Rewrite Rotate Mode", this, Class2140.Field17793));
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
        if (Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field12918 = Class394.Method1921((Entity)Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        this.Field12914 = Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        this.Field12908.clear();
    }
    
    @Override
    public void Method45() {
        if (Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Field12901.Method365()) {
            this.Field12917 = false;
            this.Method4469();
        }
        else {
            this.Method20();
        }
    }
    
    protected void Method20() {
        this.Field12911 = Class394.Method1924(this.Field12890.Method368());
        if (this.Field12911 == null) {
            return;
        }
        final int currentItem = Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        int n;
        if (Class9.Method120(Blocks.OBSIDIAN, 0, 9) != -1) {
            n = Class9.Method120(Blocks.OBSIDIAN, 0, 9);
        }
        else {
            if (Class9.Method120(Blocks.ENDER_CHEST, 0, 9) == -1) {
                return;
            }
            n = Class9.Method120(Blocks.OBSIDIAN, 0, 9);
        }
        Class9.Method110(n, this.Field12905.Method359().equalsIgnoreCase("Silent"));
        for (final BlockPos blockPos : this.Method4467()) {
            if (!Class1486.Method5951(blockPos, true, true, this.Field12909 <= this.Field12904.Method335())) {
                continue;
            }
            this.Method4468(blockPos);
            ++this.Field12909;
        }
        this.Field12916 = 0;
        if (this.Field12905.Method359().equalsIgnoreCase(Class1430.Field14682.name())) {
            Class9.Method110(currentItem, true);
        }
        if (!this.Method4467().isEmpty()) {
            return;
        }
        this.Field12909 = 0;
        if (this.Field12891.Method365()) {
            this.Method21(false);
        }
    }
    
    protected ArrayList Method4467() {
        final List method4472 = this.Method4472();
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        for (final BlockPos e : method4472) {
            if (!this.Field12903.Method309(Class856.Field11610.name()) && (Class1036.Method4215(e) == null || (this.Field12903.Method309(Class856.Field11612.name()) && Class1486.Method5948(e, true, true)))) {
                list.add(e.down());
            }
            if (this.Field12897.Method365()) {
                list.add(e);
            }
        }
        for (final BlockPos blockPos : this.Method4474()) {
            list.add(blockPos.up());
            if (this.Field12896.Method365()) {
                list.add(blockPos.up().up());
            }
        }
        for (final BlockPos blockPos2 : this.Method4477()) {
            if (this.Field12896.Method365()) {
                list.add(blockPos2.up().up().up());
            }
            if (this.Field12895.Method365()) {
                list.add(blockPos2.up().up().up().up());
            }
        }
        return list;
    }
    
    protected void Method4468(final BlockPos blockPos) {
        if (this.Field12916 < this.Field12894.Method335()) {
            final float[] array = { Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch };
            if (!this.Field12906.Method359().equalsIgnoreCase(Class2140.Field17791.name())) {
                final float[] method6176 = Class1568.Method6176(blockPos);
                Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = method6176[0];
                Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = method6176[1];
            }
            Class1486.Method5949(blockPos, EnumHand.MAIN_HAND, this.Field12900.Method365());
            ++this.Field12916;
            if (this.Field12906.Method359().equalsIgnoreCase(Class2140.Field17793.name())) {
                Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = array[0];
                Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = array[1];
            }
        }
    }
    
    private void Method4469() {
        if (this.Method28()) {
            return;
        }
        this.Method4470();
        if (this.Field12912) {
            this.Field12907.Method2801();
        }
    }
    
    private void Method4470() {
        this.Method4471(Class1036.Method4194(this.Field12911.getPositionVector(), this.Field12895.Method365(), this.Field12896.Method365(), this.Field12897.Method365(), false, false, this.Field12899.Method365()));
    }
    
    private void Method4471(final List list) {
        list.sort(Class1092::Method4483);
        list.sort(Comparator.comparingDouble((ToDoubleFunction<? super Vec3d>)Class1092::Method4482));
        final Iterator<Vec3d> iterator = list.iterator();
        while (iterator.hasNext()) {
            final BlockPos blockPos = new BlockPos((Vec3d)iterator.next());
            final int method4190 = Class1036.Method4190(blockPos, this.Field12899.Method365());
            if (method4190 == 1 && (this.Field12908.get(blockPos) == null || this.Field12908.get(blockPos) < 4)) {
                this.Method4481(blockPos);
                this.Field12908.put(blockPos, (this.Field12908.get(blockPos) == null) ? 1 : ((int)this.Field12908.get(blockPos) + 1));
                this.Field12910.Method2801();
            }
            else {
                if (method4190 != 3) {
                    continue;
                }
                this.Method4481(blockPos);
            }
        }
    }
    
    protected boolean Method28() {
        if (Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || this.Field12918 == null) {
            return false;
        }
        this.Field12912 = false;
        this.Field12915 = 0;
        if (Class9.Method120(Blocks.OBSIDIAN, 0, 9) == -1) {
            this.Method21(false);
        }
        final int method120 = Class9.Method120(Blocks.OBSIDIAN, 0, 9);
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
        if (method120 == -1) {
            Class1393.Method5504().Method1886(ChatFormatting.RED + "No Obsidian in hotbar, AutoTrap disabling...");
            this.Method21(false);
            return true;
        }
        if (Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem != this.Field12914 && Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem != method120) {
            this.Field12914 = Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        }
        this.Field12913 = Class394.Method1922(this.Field12913);
        this.Field12911 = Class394.Method1924(this.Field12890.Method368());
        return this.Field12911 == null || !this.Field12907.Method2797((long)this.Field12892.Method335());
    }
    
    private List Method4472() {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        for (final BlockPos e : this.Method4475()) {
            if (this.Method4473(e)) {
                continue;
            }
            list.add(e);
        }
        return list;
    }
    
    private boolean Method4473(final BlockPos blockPos) {
        return !Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos);
    }
    
    private List Method4474() {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        if (this.Field12902.Method365()) {
            final double n = Math.abs(this.Field12911.posX) - Math.floor(Math.abs(this.Field12911.posX));
            final double n2 = Math.abs(this.Field12911.posZ) - Math.floor(Math.abs(this.Field12911.posZ));
            final int method4479 = this.Method4479(n, false);
            final int method4480 = this.Method4479(n, true);
            final int method4481 = this.Method4479(n2, false);
            final int method4482 = this.Method4479(n2, true);
            final ArrayList<BlockPos> c = new ArrayList<BlockPos>();
            for (int i = 1; i < method4479 + 1; ++i) {
                c.add(this.Method4480(this.Method4476(), i, 1 + method4481));
                c.add(this.Method4480(this.Method4476(), i, -(1 + method4482)));
            }
            for (int j = 0; j <= method4480; ++j) {
                c.add(this.Method4480(this.Method4476(), -j, 1 + method4481));
                c.add(this.Method4480(this.Method4476(), -j, -(1 + method4482)));
            }
            for (int k = 1; k < method4481 + 1; ++k) {
                c.add(this.Method4480(this.Method4476(), 1 + method4479, k));
                c.add(this.Method4480(this.Method4476(), -(1 + method4480), k));
            }
            for (int l = 0; l <= method4482; ++l) {
                c.add(this.Method4480(this.Method4476(), 1 + method4479, -l));
                c.add(this.Method4480(this.Method4476(), -(1 + method4480), -l));
            }
            list.addAll(c);
        }
        else {
            for (final EnumFacing enumFacing : EnumFacing.HORIZONTALS) {
                list.add(this.Method4476().add(enumFacing.getXOffset(), 0, enumFacing.getZOffset()));
            }
        }
        return list;
    }
    
    private List Method4475() {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        if (this.Field12902.Method365()) {
            final double n = Math.abs(this.Field12911.posX) - Math.floor(Math.abs(this.Field12911.posX));
            final double n2 = Math.abs(this.Field12911.posZ) - Math.floor(Math.abs(this.Field12911.posZ));
            final int method4479 = this.Method4479(n, false);
            final int method4480 = this.Method4479(n, true);
            final int method4481 = this.Method4479(n2, false);
            final int method4482 = this.Method4479(n2, true);
            final ArrayList<BlockPos> c = new ArrayList<BlockPos>();
            list.addAll(this.Method4477());
            for (int i = 1; i < method4479 + 1; ++i) {
                c.add(this.Method4480(this.Method4476(), i, 1 + method4481));
                c.add(this.Method4480(this.Method4476(), i, -(1 + method4482)));
            }
            for (int j = 0; j <= method4480; ++j) {
                c.add(this.Method4480(this.Method4476(), -j, 1 + method4481));
                c.add(this.Method4480(this.Method4476(), -j, -(1 + method4482)));
            }
            for (int k = 1; k < method4481 + 1; ++k) {
                c.add(this.Method4480(this.Method4476(), 1 + method4479, k));
                c.add(this.Method4480(this.Method4476(), -(1 + method4480), k));
            }
            for (int l = 0; l <= method4482; ++l) {
                c.add(this.Method4480(this.Method4476(), 1 + method4479, -l));
                c.add(this.Method4480(this.Method4476(), -(1 + method4480), -l));
            }
            list.addAll(c);
        }
        else {
            for (final EnumFacing enumFacing : EnumFacing.HORIZONTALS) {
                list.add(this.Method4476().add(enumFacing.getXOffset(), 0, enumFacing.getZOffset()));
            }
        }
        return list;
    }
    
    private BlockPos Method4476() {
        return new BlockPos(this.Field12911.posX, (this.Field12911.posY - Math.floor(this.Field12911.posY) > Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4626151983804780791L)) ^ 0x7FDAFD219E3E896DL)) ? (Math.floor(this.Field12911.posY) + Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4617211115437597968L)) ^ 0x7FE3A10BE4A4A510L)) : Math.floor(this.Field12911.posY), this.Field12911.posZ);
    }
    
    private List Method4477() {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        final int method4478 = this.Method4478(this.Field12911.posX - Math.floor(this.Field12911.posX));
        final int method4479 = this.Method4478(this.Field12911.posZ - Math.floor(this.Field12911.posZ));
        list.add(this.Method4476());
        for (int i = 0; i <= Math.abs(method4478); ++i) {
            for (int j = 0; j <= Math.abs(method4479); ++j) {
                list.add(this.Method4476().add(i * method4478, -1, j * method4479));
            }
        }
        return list;
    }
    
    private int Method4478(final double n) {
        return (n >= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4626940857062532511L)) ^ 0x7FD05457839243F9L)) ? 1 : ((n <= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)765248200 ^ 0x401C24713BD4D520L)) ^ 0x7FCF1742257B24DBL)) ? -1 : 0);
    }
    
    private int Method4479(final double n, final boolean b) {
        if (b) {
            return (n <= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1420838851 ^ 0x403E8FD0CFE6CCECL)) ^ 0x7FEDBCE3A865B81CL)) ? 1 : 0;
        }
        return (n >= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)343314738 ^ 0x403659BB09024309L)) ^ 0x7FD03FDD7B12B45DL)) ? 1 : 0;
    }
    
    private BlockPos Method4480(final BlockPos blockPos, double n, double n2) {
        if (blockPos.getX() < 0) {
            n = -n;
        }
        if (blockPos.getZ() < 0) {
            n2 = -n2;
        }
        return blockPos.add(n, Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)555623327 ^ 0x7FEA77598AF9D45EL)) ^ 0x7FEA7759ABE7F7C1L), n2);
    }
    
    private void Method4481(final BlockPos blockPos) {
        if (this.Field12915 < this.Field12894.Method335()) {
            Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(blockPos);
            final double longBitsToDouble = Double.longBitsToDouble(4617315517961601024L);
            return (void)(longBitsToDouble * longBitsToDouble);
        }
    }
    
    private static double Method4482(final Vec3d vec3d) {
        return vec3d.y;
    }
    
    private static int Method4483(final Vec3d vec3d, final Vec3d vec3d2) {
        return Double.compare(Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(vec3d2.x, vec3d2.y, vec3d2.z), Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(vec3d.x, vec3d.y, vec3d.z));
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1675 ^ 0xBD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
