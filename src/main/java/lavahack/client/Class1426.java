//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import com.kisman.cc.util.*;
import net.minecraft.client.gui.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.*;
import java.util.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class1426 extends Class1249
{
    private int Field14649;
    private int Field14650;
    private final String[] Field14651;
    private final Class44 Field14652;
    private int Field14653;
    
    public Class1426() {
        super("Radar", true);
        this.Field14649 = 0;
        this.Field14650 = 0;
        this.Field14651 = new String[] { "X+", "Z+", "X-", "Z-" };
        this.Field14652 = this.Method23(new Class44("Astolfo", (Class42)this, true));
        this.Method271(0.0);
        this.Method272(0.0);
        this.Method273(Double.longBitsToDouble((long)1685524638 ^ 0x4062C0006477109EL));
        this.Method274(Double.longBitsToDouble((long)1937841724 ^ 0x4062C00073811E3CL));
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method5707(final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        this.Field14649 = (int)this.Method267();
        this.Field14650 = (int)this.Method268();
        final int n = this.Field14652.Method365() ? Class1172.Method4709(100, 100) : -1;
        Gui.drawRect(this.Field14649, this.Field14650, 150 + this.Field14649, 150 + this.Field14650, new Class2027(70, 70, 70, 150).Method3626());
        Class753.drawRect(Double.longBitsToDouble(4634942888378105856L) + this.Field14649, 3 + Class1178.Method4748() + this.Field14650, Double.longBitsToDouble((long)1449472759 ^ 0x4052E000566532F7L) + this.Field14649, 147 - Class1178.Method4748() + this.Field14650, new Class2027(50, 50, 50, 165).Method3626());
        Class753.drawRect(3 + Class1178.Method4741(this.Field14651[3]) + this.Field14649, Double.longBitsToDouble((long)1248882281 ^ 0x4052A0004A706E69L) + this.Field14650, 147 - Class1178.Method4741(this.Field14651[1]) + this.Field14649, Double.longBitsToDouble(4635013257122283520L) + this.Field14650, new Class2027(50, 50, 50, 165).Method3626());
        for (final Entity entity : Class1426.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.world.loadedEntityList) {
            if (entity instanceof EntityPlayer && entity != Class1426.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player) {
                this.Method5709(entity);
            }
        }
        final boolean method5708 = this.Method5708(EnumFacing.NORTH);
        final boolean method5709 = this.Method5708(EnumFacing.SOUTH);
        final boolean method5710 = this.Method5708(EnumFacing.EAST);
        final boolean method5711 = this.Method5708(EnumFacing.WEST);
        if (method5708) {
            Class753.drawRect(Double.longBitsToDouble(4634520675913039872L) + this.Field14649, Double.longBitsToDouble(4634942888378105856L) + this.Field14650, Double.longBitsToDouble((long)770563086 ^ 0x4052A0002DEDDC0EL) + this.Field14649, Double.longBitsToDouble((long)790416987 ^ 0x4052E0002F1CCE5BL) + this.Field14650, n);
        }
        else if (method5709) {
            Class753.drawRect(Double.longBitsToDouble((long)1918459598 ^ 0x4052E00072595ECEL) + this.Field14649, Double.longBitsToDouble(4634942888378105856L) + this.Field14650, Double.longBitsToDouble((long)800692554 ^ 0x405460002FB9994AL) + this.Field14649, Double.longBitsToDouble(4634942888378105856L) + this.Field14650, n);
        }
        else if (method5710) {
            Class753.drawRect(Double.longBitsToDouble((long)409366241 ^ 0x4052A00018666EE1L) + this.Field14649, Double.longBitsToDouble(4634520675913039872L) + this.Field14650, Double.longBitsToDouble((long)487827045 ^ 0x4052E0001D13A665L) + this.Field14649, Double.longBitsToDouble(4634942888378105856L) + this.Field14650, n);
        }
        else if (method5711) {
            Class753.drawRect(Double.longBitsToDouble((long)1486594403 ^ 0x4052A000589BA163L) + this.Field14649, Double.longBitsToDouble(4635013257122283520L) + this.Field14650, Double.longBitsToDouble((long)1477416054 ^ 0x4052E000580F9476L) + this.Field14649, Double.longBitsToDouble(4635435469587349504L) + this.Field14650, n);
        }
        Class1178.Method4745(this.Field14651[0], (double)(75 - Class1178.Method4741(this.Field14651[0]) / 2 + this.Field14649), (double)(2 + this.Field14650), n);
        Class1178.Method4745(this.Field14651[2], (double)(75 - Class1178.Method4741(this.Field14651[2]) / 2 + this.Field14649), (double)(148 - Class1178.Method4748() + this.Field14650), n);
        Class1178.Method4745(this.Field14651[1], (double)(2 + this.Field14649), (double)(75 - Class1178.Method4748() / 2 + this.Field14650), n);
        Class1178.Method4745(this.Field14651[3], (double)(148 - Class1178.Method4741(this.Field14651[3]) + this.Field14649), (double)(75 - Class1178.Method4748() / 2 + this.Field14650), n);
        this.Method5710(this.Field14649, this.Field14650, 1 + this.Field14649, 150 + this.Field14650, n);
        this.Method5710(this.Field14649, this.Field14650, 150 + this.Field14649, 1 + this.Field14650, n);
        this.Method5710(149 + this.Field14649, this.Field14650, 150 + this.Field14649, 150 + this.Field14650, n);
        this.Method5710(this.Field14649, 149 + this.Field14650, 150 + this.Field14649, 150 + this.Field14650, n);
    }
    
    private boolean Method5708(final EnumFacing enumFacing) {
        return Class1426.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getHorizontalFacing().equals((Object)enumFacing);
    }
    
    private void Method5709(final Entity entity) {
        final int n = this.Field14652.Method365() ? Class1172.Method4709(100, 100) : -1;
        final int method5711 = this.Method5711(Class1426.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.posX, entity.posX);
        final int method5712 = this.Method5711(Class1426.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.posZ, entity.posZ);
        final int n2 = 50;
        if (method5711 > n2 || method5712 > n2 || method5711 < -n2 || method5712 < -n2) {
            return;
        }
        Class753.drawRect(75 + method5711 + this.Field14649 - Double.longBitsToDouble(4602678819172646912L), 75 + method5712 + this.Field14650 - Double.longBitsToDouble(4609434218613702656L), 75 + method5711 + this.Field14649 + Double.longBitsToDouble(4602678819172646912L), 75 + method5712 + this.Field14650 + Double.longBitsToDouble((long)1713817699 ^ 0x3FF800006626C863L), n);
        Class753.drawRect(75 + method5711 + this.Field14649 - Double.longBitsToDouble((long)186085516 ^ 0x3FF800000B17708CL), 75 + method5712 + this.Field14650 - Double.longBitsToDouble(4602678819172646912L), 75 + method5711 + this.Field14649 + Double.longBitsToDouble((long)2104214700 ^ 0x3FF800007D6BC4ACL), 75 + method5712 + this.Field14650 + Double.longBitsToDouble((long)1478230958 ^ 0x3FE00000581C03AEL), n);
    }
    
    private void Method5710(final int n, final int n2, final int n3, final int n4, final int n5) {
        Gui.drawRect(n, n2, n3, n4, n5);
    }
    
    private int Method5711(final double n, final double n2) {
        double n3 = n;
        double n4 = n2;
        if (n3 < 0.0) {
            n3 *= Double.longBitsToDouble(-4616189618054758400L);
        }
        if (n4 < 0.0) {
            n4 *= Double.longBitsToDouble((long)1242587273 ^ 0xBFF000004A106089L);
        }
        int n5 = (int)(n4 - n3);
        if ((n > 0.0 && n2 < 0.0) || (n < 0.0 && n2 > 0.0)) {
            n5 = (int)(Double.longBitsToDouble((long)1862298688 ^ 0xBFF000006F006C40L) * n + n2);
        }
        if ((n > 0.0 || n < 0.0) && n2 < 0.0 && n4 != n3) {
            n5 = (int)(Double.longBitsToDouble((long)775542494 ^ 0xBFF000002E39D6DEL) * n + n2);
        }
        if ((n < 0.0 && n2 == 0.0) || (n == 0.0 && n2 < 0.0)) {
            n5 = (int)(Double.longBitsToDouble((long)842850847 ^ 0xBFF00000323CE21FL) * (n4 - n3));
        }
        return n5;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4B78 ^ 0xF3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
