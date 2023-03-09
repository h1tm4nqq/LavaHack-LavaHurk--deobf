//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.EnumFacing
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class1249;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class753;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class1426
extends Class1249 {
    private int Field14649 = 0;
    private int Field14650 = 0;
    private final String[] Field14651 = new String[]{"X+", "Z+", "X-", "Z-"};
    private final Class44 Field14652 = this.Method23(new Class44("Astolfo", (Class42)this, true));
    private int Field14653;

    public Class1426() {
        super("Radar", true);
        this.Method271(0.0);
        this.Method272(0.0);
        this.Method273(Double.longBitsToDouble((long)1685524638 ^ 0x4062C0006477109EL));
        this.Method274(Double.longBitsToDouble((long)1937841724 ^ 0x4062C00073811E3CL));
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method5707(RenderGameOverlayEvent.Text text) {
        this.Field14649 = (int)this.Method267();
        this.Field14650 = (int)this.Method268();
        int n = this.Field14652.Method365() ? Class1172.Method4709(100, 100) : -1;
        Gui.drawRect((int)this.Field14649, (int)this.Field14650, (int)(150 + this.Field14649), (int)(150 + this.Field14650), (int)new Class2027(70, 70, 70, 150).Method3626());
        Class753.drawRect(Double.longBitsToDouble(4634942888378105856L) + (double)this.Field14649, 3 + Class1178.Method4748() + this.Field14650, Double.longBitsToDouble((long)1449472759 ^ 0x4052E000566532F7L) + (double)this.Field14649, 147 - Class1178.Method4748() + this.Field14650, new Class2027(50, 50, 50, 165).Method3626());
        Class753.drawRect(3 + Class1178.Method4741(this.Field14651[3]) + this.Field14649, Double.longBitsToDouble((long)1248882281 ^ 0x4052A0004A706E69L) + (double)this.Field14650, 147 - Class1178.Method4741(this.Field14651[1]) + this.Field14649, Double.longBitsToDouble(4635013257122283520L) + (double)this.Field14650, new Class2027(50, 50, 50, 165).Method3626());
        for (Entity entity : Class1426.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.world.loadedEntityList) {
            if (!(entity instanceof EntityPlayer) || entity == Class1426.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player) continue;
            this.Method5709(entity);
        }
        boolean bl = this.Method5708(EnumFacing.NORTH);
        boolean bl2 = this.Method5708(EnumFacing.SOUTH);
        boolean bl3 = this.Method5708(EnumFacing.EAST);
        boolean bl4 = this.Method5708(EnumFacing.WEST);
        if (bl) {
            Class753.drawRect(Double.longBitsToDouble(4634520675913039872L) + (double)this.Field14649, Double.longBitsToDouble(4634942888378105856L) + (double)this.Field14650, Double.longBitsToDouble((long)770563086 ^ 0x4052A0002DEDDC0EL) + (double)this.Field14649, Double.longBitsToDouble((long)790416987 ^ 0x4052E0002F1CCE5BL) + (double)this.Field14650, n);
        } else if (bl2) {
            Class753.drawRect(Double.longBitsToDouble((long)1918459598 ^ 0x4052E00072595ECEL) + (double)this.Field14649, Double.longBitsToDouble(4634942888378105856L) + (double)this.Field14650, Double.longBitsToDouble((long)800692554 ^ 0x405460002FB9994AL) + (double)this.Field14649, Double.longBitsToDouble(4634942888378105856L) + (double)this.Field14650, n);
        } else if (bl3) {
            Class753.drawRect(Double.longBitsToDouble((long)409366241 ^ 0x4052A00018666EE1L) + (double)this.Field14649, Double.longBitsToDouble(4634520675913039872L) + (double)this.Field14650, Double.longBitsToDouble((long)487827045 ^ 0x4052E0001D13A665L) + (double)this.Field14649, Double.longBitsToDouble(4634942888378105856L) + (double)this.Field14650, n);
        } else if (bl4) {
            Class753.drawRect(Double.longBitsToDouble((long)1486594403 ^ 0x4052A000589BA163L) + (double)this.Field14649, Double.longBitsToDouble(4635013257122283520L) + (double)this.Field14650, Double.longBitsToDouble((long)1477416054 ^ 0x4052E000580F9476L) + (double)this.Field14649, Double.longBitsToDouble(4635435469587349504L) + (double)this.Field14650, n);
        }
        Class1178.Method4745(this.Field14651[0], 75 - Class1178.Method4741(this.Field14651[0]) / 2 + this.Field14649, 2 + this.Field14650, n);
        Class1178.Method4745(this.Field14651[2], 75 - Class1178.Method4741(this.Field14651[2]) / 2 + this.Field14649, 148 - Class1178.Method4748() + this.Field14650, n);
        Class1178.Method4745(this.Field14651[1], 2 + this.Field14649, 75 - Class1178.Method4748() / 2 + this.Field14650, n);
        Class1178.Method4745(this.Field14651[3], 148 - Class1178.Method4741(this.Field14651[3]) + this.Field14649, 75 - Class1178.Method4748() / 2 + this.Field14650, n);
        this.Method5710(this.Field14649, this.Field14650, 1 + this.Field14649, 150 + this.Field14650, n);
        this.Method5710(this.Field14649, this.Field14650, 150 + this.Field14649, 1 + this.Field14650, n);
        this.Method5710(149 + this.Field14649, this.Field14650, 150 + this.Field14649, 150 + this.Field14650, n);
        this.Method5710(this.Field14649, 149 + this.Field14650, 150 + this.Field14649, 150 + this.Field14650, n);
    }

    private boolean Method5708(EnumFacing enumFacing) {
        return Class1426.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getHorizontalFacing().equals((Object)enumFacing);
    }

    private void Method5709(Entity entity) {
        int n = this.Field14652.Method365() ? Class1172.Method4709(100, 100) : -1;
        int n2 = this.Method5711(Class1426.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.posX, entity.posX);
        int n3 = this.Method5711(Class1426.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.posZ, entity.posZ);
        int n4 = 50;
        if (n2 > n4) return;
        if (n3 > n4) return;
        if (n2 < -n4) return;
        if (n3 < -n4) {
            return;
        }
        Class753.drawRect((double)(75 + n2 + this.Field14649) - Double.longBitsToDouble(4602678819172646912L), (double)(75 + n3 + this.Field14650) - Double.longBitsToDouble(4609434218613702656L), (double)(75 + n2 + this.Field14649) + Double.longBitsToDouble(4602678819172646912L), (double)(75 + n3 + this.Field14650) + Double.longBitsToDouble((long)1713817699 ^ 0x3FF800006626C863L), n);
        Class753.drawRect((double)(75 + n2 + this.Field14649) - Double.longBitsToDouble((long)186085516 ^ 0x3FF800000B17708CL), (double)(75 + n3 + this.Field14650) - Double.longBitsToDouble(4602678819172646912L), (double)(75 + n2 + this.Field14649) + Double.longBitsToDouble((long)2104214700 ^ 0x3FF800007D6BC4ACL), (double)(75 + n3 + this.Field14650) + Double.longBitsToDouble((long)1478230958 ^ 0x3FE00000581C03AEL), n);
    }

    private void Method5710(int n, int n2, int n3, int n4, int n5) {
        Gui.drawRect((int)n, (int)n2, (int)n3, (int)n4, (int)n5);
    }

    private int Method5711(double d, double d2) {
        double d3 = d;
        double d4 = d2;
        if (d3 < 0.0) {
            d3 *= Double.longBitsToDouble(-4616189618054758400L);
        }
        if (d4 < 0.0) {
            d4 *= Double.longBitsToDouble((long)1242587273 ^ 0xBFF000004A106089L);
        }
        int n = (int)(d4 - d3);
        if (d > 0.0 && d2 < 0.0 || d < 0.0 && d2 > 0.0) {
            n = (int)(Double.longBitsToDouble((long)1862298688 ^ 0xBFF000006F006C40L) * d + d2);
        }
        if ((d > 0.0 || d < 0.0) && d2 < 0.0 && d4 != d3) {
            n = (int)(Double.longBitsToDouble((long)775542494 ^ 0xBFF000002E39D6DEL) * d + d2);
        }
        if (d < 0.0) {
            if (d2 == 0.0) return (int)(Double.longBitsToDouble((long)842850847 ^ 0xBFF00000323CE21FL) * (d4 - d3));
        }
        if (d != 0.0) return n;
        if (!(d2 < 0.0)) return n;
        return (int)(Double.longBitsToDouble((long)842850847 ^ 0xBFF00000323CE21FL) * (d4 - d3));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 243;
            cArray2[n] = (char)(cArray[n] ^ (0x4B78 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

