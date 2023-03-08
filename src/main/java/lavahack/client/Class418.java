//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import net.minecraft.util.text.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.util.math.*;
import net.minecraft.item.*;
import java.util.function.*;
import java.util.*;
import net.minecraft.init.*;
import com.mojang.realmsclient.gui.*;

public class Class418 extends Class42
{
    public static Class418 Field9733;
    private final Class44 Field9734;
    private final Class44 Field9735;
    private final Class44 Field9736;
    private final Class44 Field9737;
    private final Class44 Field9738;
    private final Class44 Field9739;
    private final Class44 Field9740;
    private final Class44 Field9741;
    private final Class44 Field9742;
    private final Class44 Field9743;
    private final Class44 Field9744;
    private final Class44 Field9745;
    private final Class44 Field9746;
    private final Class44 Field9747;
    private final Class44 Field9748;
    private final Class44 Field9749;
    private final Class650 Field9750;
    private final Class650 Field9751;
    private final Map Field9752;
    private final Class650 Field9753;
    private boolean Field9754;
    private boolean Field9755;
    private int Field9756;
    private int Field9757;
    private boolean Field9758;
    private BlockPos Field9759;
    public EntityPlayer Field9760;
    private int Field9761;
    
    public Class418() {
        super("AutoFirework", "", Class97.Field8338);
        this.Field9734 = this.Method23(new Class44("Target Range", this, Double.longBitsToDouble(4621819117588971520L), 1.0, Double.longBitsToDouble((long)1708277046 ^ 0x4034000065D23D36L), true));
        this.Field9735 = this.Method23(new Class44("PlaceDelay", this, Double.longBitsToDouble((long)174794695 ^ 0x408F40000A6B27C7L), 1.0, Double.longBitsToDouble((long)598301701 ^ 0x40C3880023A95C05L), true));
        this.Field9736 = this.Method23(new Class44("Rotate", this, true));
        this.Field9737 = this.Method23(new Class44("BlocksPerTick", this, Double.longBitsToDouble((long)1933492246 ^ 0x40200000733EC016L), 1.0, Double.longBitsToDouble((long)2086207722 ^ 0x403E00007C5900EAL), true));
        this.Field9738 = this.Method23(new Class44("AntiScaffold", this, false));
        this.Field9739 = this.Method23(new Class44("AntiStep", this, false));
        this.Field9740 = this.Method23(new Class44("SurroundPlacing", this, true));
        this.Field9741 = this.Method23(new Class44("Range", this, Double.longBitsToDouble((long)302678367 ^ 0x40100000120A815FL), 1.0, Double.longBitsToDouble(4617315517961601024L), false));
        this.Field9742 = this.Method23(new Class44("RayTrace", this, false));
        this.Field9743 = this.Method23(new Class44("SwitchMode", this, Class893.Field11739));
        this.Field9744 = this.Method23(new Class44("SwitchReturnFirework", this, true));
        this.Field9745 = this.Method23(new Class44("MinHealthPause", this, false));
        this.Field9746 = this.Method23(new Class44("RequiredHealth", this, Double.longBitsToDouble(4622382067542392832L), 0.0, Double.longBitsToDouble((long)24003346 ^ 0x40420000016E4312L), true));
        this.Field9747 = this.Method23(new Class44("PauseWhileEating", this, false));
        this.Field9748 = this.Method23(new Class44("PauseIfHittingBlock", this, false));
        this.Field9749 = this.Method23(new Class44("FireworkHand", this, "Default", new ArrayList((Collection<? extends E>)Arrays.asList("Default", "MainHand", "OffHand"))));
        this.Field9750 = new Class650();
        this.Field9751 = new Class650();
        this.Field9752 = new HashMap();
        this.Field9753 = new Class650();
        this.Field9754 = false;
        this.Field9757 = 0;
        this.Field9758 = false;
        this.Field9759 = null;
        this.Field9760 = null;
        Class418.Field9733 = this;
    }
    
    @Override
    public void Method38() {
        this.Field9759 = Class394.Method1921((Entity)Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        this.Field9756 = Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        this.Field9752.clear();
    }
    
    @Override
    public void Method39() {
        this.Field9755 = Class394.Method1922(this.Field9755);
    }
    
    @Override
    public void Method45() {
        if (Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field9760 != null) {
            super.Method43("[" + this.Field9760.getDisplayName().getFormattedText() + TextFormatting.GRAY + "]");
        }
        else {
            super.Method43("");
        }
        if (this.Method2045()) {
            return;
        }
        if (this.Field9760 != null) {
            final BlockPos getPosition = this.Field9760.getPosition();
            this.Field9758 = false;
            this.Method2046();
            if (Math.sqrt(Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq((double)getPosition.getX(), (double)getPosition.getY(), (double)getPosition.getZ())) <= this.Field9741.Method367()) {
                final int getBestHotbarSlot = Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getBestHotbarSlot();
                EnumFacing enumFacing = null;
                if (this.Field9742.Method365()) {
                    final RayTraceResult rayTraceBlocks = Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(new Vec3d(Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEyeHeight(), Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), new Vec3d(this.Field9760.posX + Double.longBitsToDouble((long)527425792 ^ 0x3FE000001F6FE100L), this.Field9760.posY - Double.longBitsToDouble(4602678819172646912L), this.Field9760.posZ + Double.longBitsToDouble((long)1610527829 ^ 0x3FE000005FFEB455L)));
                    if (rayTraceBlocks == null || rayTraceBlocks.sideHit == null) {
                        enumFacing = EnumFacing.UP;
                    }
                    else {
                        enumFacing = rayTraceBlocks.sideHit;
                    }
                }
                Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getConnection().sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(getPosition, enumFacing, this.Field9749.Method359().equalsIgnoreCase("Default") ? EnumHand.OFF_HAND : (this.Field9749.Method359().equalsIgnoreCase("MainHand") ? EnumHand.MAIN_HAND : EnumHand.OFF_HAND), 0.0f, 0.0f, 0.0f));
                if (this.Field9744.Method365()) {
                    Class9.Method121(getBestHotbarSlot, (Class893)this.Field9743.Method341());
                }
                this.Field9751.Method2801();
                this.Field9750.Method2801();
            }
        }
        else {
            this.Field9760 = Class394.Method1924(this.Field9734.Method368());
        }
    }
    
    private boolean Method2045() {
        return (this.Field9747.Method365() && Class1744.Method6653()) || (this.Field9745.Method365() && Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount() < this.Field9746.Method367()) || (this.Field9748.Method365() && Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.isHittingBlock && Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemTool);
    }
    
    private void Method2046() {
        if (this.Method29()) {
            return;
        }
        this.Method2047();
        if (this.Field9754) {
            this.Field9750.Method2801();
        }
    }
    
    private void Method2047() {
        this.Method2048(Class1036.Method4194(this.Field9760.getPositionVector(), this.Field9738.Method365(), this.Field9739.Method365(), this.Field9740.Method365(), false, false, this.Field9742.Method365()));
    }
    
    private void Method2048(final List list) {
        list.sort(Class418::Method2051);
        list.sort(Comparator.comparingDouble((ToDoubleFunction<? super Vec3d>)Class418::Method2050));
        final Iterator<Vec3d> iterator = list.iterator();
        while (iterator.hasNext()) {
            final BlockPos blockPos = new BlockPos((Vec3d)iterator.next());
            final int method4190 = Class1036.Method4190(blockPos, this.Field9742.Method365());
            if (method4190 == 1 && (this.Field9752.get(blockPos) == null || this.Field9752.get(blockPos) < 4)) {
                this.Method2049(blockPos);
                this.Field9752.put(blockPos, (this.Field9752.get(blockPos) == null) ? 1 : ((int)this.Field9752.get(blockPos) + 1));
                this.Field9753.Method2801();
            }
            else {
                if (method4190 != 3) {
                    continue;
                }
                this.Method2049(blockPos);
            }
        }
    }
    
    private boolean Method29() {
        if (Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || this.Field9759 == null) {
            return false;
        }
        this.Field9754 = false;
        this.Field9757 = 0;
        if (Class9.Method120(Blocks.OBSIDIAN, 0, 9) == -1) {
            this.Method21(false);
            return true;
        }
        final int method120 = Class9.Method120(Blocks.OBSIDIAN, 0, 9);
        if (!super.Method35()) {
            return true;
        }
        if (!this.Field9759.equals((Object)Class394.Method1921((Entity)Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player))) {
            this.Method21(false);
            return true;
        }
        if (this.Field9753.Method2797(2000L)) {
            this.Field9752.clear();
            this.Field9753.Method2801();
        }
        if (method120 == -1) {
            Class1393.Method5504().Method1886(ChatFormatting.RED + "No Obsidian in hotbar, AutoTrap disabling...");
            this.Method21(false);
            return true;
        }
        if (Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem != this.Field9756 && Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem != method120) {
            this.Field9756 = Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        }
        this.Field9755 = Class394.Method1922(this.Field9755);
        this.Field9760 = Class394.Method1924(this.Field9734.Method368());
        return this.Field9760 == null || !this.Field9750.Method2797((long)this.Field9735.Method335());
    }
    
    private void Method2049(final BlockPos blockPos) {
        if (this.Field9757 < this.Field9737.Method335()) {
            Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(blockPos);
            final double longBitsToDouble = Double.longBitsToDouble(4617315517961601024L);
            return (void)(longBitsToDouble * longBitsToDouble);
        }
    }
    
    private static double Method2050(final Vec3d vec3d) {
        return vec3d.y;
    }
    
    private static int Method2051(final Vec3d vec3d, final Vec3d vec3d2) {
        return Double.compare(Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(vec3d2.x, vec3d2.y, vec3d2.z), Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(vec3d.x, vec3d.y, vec3d.z));
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4D82 ^ 0x11));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
