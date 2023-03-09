/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.EnumHandSide
 *  net.minecraftforge.client.event.EntityViewRenderEvent$FOVModifier
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import lavahack.client.Class1794;
import lavahack.client.Class1996;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.util.EnumHandSide;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class Class1877
extends Class42 {
    public static Class1877 Field16608;
    public Class44 Field16609 = this.Method23(new Class44("Custom Eating", (Class42)this, false));
    public Class44 Field16610 = this.Method23(new Class44("Translate", (Class42)this, true));
    public Class44 Field16611 = this.Method23(new Class44("ItemFOV", (Class42)this, false));
    public Class44 Field16612 = this.Method23(new Class44("FOV", (Class42)this, Double.longBitsToDouble(0x4060400000000000L), Double.longBitsToDouble((long)1287948643 ^ 0x405180004CC48963L), Double.longBitsToDouble((long)915894893 ^ 0x406900003697726DL), true).Method313(this.Field16611::Method365));
    private final Class1996 Field16613 = this.Method24(new Class1996(new Class44("Translates", this)));
    public Class44 Field16614 = this.Method23(this.Field16613.Method7405(new Class44("RightX", (Class42)this, 0.0, Double.longBitsToDouble((long)2093679832 ^ 0xC00000007CCB04D8L), Double.longBitsToDouble(0x4000000000000000L), false)));
    public Class44 Field16615 = this.Method23(this.Field16613.Method7405(new Class44("RightY", (Class42)this, 0.0, Double.longBitsToDouble((long)141490692 ^ 0xC0000000086EFA04L), Double.longBitsToDouble(0x4000000000000000L), false)));
    public Class44 Field16616 = this.Method23(this.Field16613.Method7405(new Class44("RightZ", (Class42)this, 0.0, Double.longBitsToDouble((long)1587178625 ^ 0xC00000005E9A6C81L), Double.longBitsToDouble((long)332006536 ^ 0x4000000013CA0488L), false)));
    public Class44 Field16617 = this.Method23(this.Field16613.Method7405(new Class44("LeftX", (Class42)this, 0.0, Double.longBitsToDouble((long)1111055171 ^ 0xC000000042395B43L), Double.longBitsToDouble((long)1719274193 ^ 0x40000000667A0AD1L), false)));
    public Class44 Field16618 = this.Method23(this.Field16613.Method7405(new Class44("LeftY", (Class42)this, 0.0, Double.longBitsToDouble((long)2397940 ^ 0xC0000000002496F4L), Double.longBitsToDouble(0x4000000000000000L), false)));
    public Class44 Field16619 = this.Method23(this.Field16613.Method7405(new Class44("LeftZ", (Class42)this, 0.0, Double.longBitsToDouble((long)1827877306 ^ 0xC00000006CF331BAL), Double.longBitsToDouble(0x4000000000000000L), false)));
    private final Class1996 Field16620 = this.Method24(new Class1996(new Class44("Rotates", this)));
    public Class44 Field16621 = this.Method23(this.Field16620.Method7405(new Class44("RotateRightX", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)1827716475 ^ 0x407680006CF0BD7BL), false)));
    public Class44 Field16622 = this.Method23(this.Field16620.Method7405(new Class44("RotateRightY", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(4645040803167600640L), false)));
    public Class44 Field16623 = this.Method23(this.Field16620.Method7405(new Class44("RotateRightZ", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)940002770 ^ 0x4076800038074DD2L), false)));
    public Class44 Field16624 = this.Method23(this.Field16620.Method7405(new Class44("RotateLeftX", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(4645040803167600640L), false)));
    public Class44 Field16625 = this.Method23(this.Field16620.Method7405(new Class44("RotateLeftY", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)1479858480 ^ 0x407680005834D930L), false)));
    public Class44 Field16626 = this.Method23(this.Field16620.Method7405(new Class44("RotateLeftZ", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)1326878114 ^ 0x407680004F168DA2L), false)));
    private final Class1996 Field16627 = this.Method24(new Class1996(new Class44("Scales", this)));
    public Class44 Field16628 = this.Method23(this.Field16627.Method7405(new Class44("ScaleRigthX", (Class42)this, 1.0, Double.longBitsToDouble(-4611686018427387904L), Double.longBitsToDouble(0x4000000000000000L), false)));
    public Class44 Field16629 = this.Method23(this.Field16627.Method7405(new Class44("ScaleRigthY", (Class42)this, 1.0, Double.longBitsToDouble((long)174076988 ^ 0xC00000000A60343CL), Double.longBitsToDouble(0x4000000000000000L), false)));
    public Class44 Field16630 = this.Method23(this.Field16627.Method7405(new Class44("ScaleRigthZ", (Class42)this, 1.0, Double.longBitsToDouble((long)1102411709 ^ 0xC000000041B577BDL), Double.longBitsToDouble(0x4000000000000000L), false)));
    public Class44 Field16631 = this.Method23(this.Field16627.Method7405(new Class44("ScaleLeftX", (Class42)this, 1.0, Double.longBitsToDouble((long)402190700 ^ 0xC000000017F8F16CL), Double.longBitsToDouble((long)2070388339 ^ 0x400000007B679E73L), false)));
    public Class44 Field16632 = this.Method23(this.Field16627.Method7405(new Class44("ScaleLeftY", (Class42)this, 1.0, Double.longBitsToDouble((long)2091540647 ^ 0xC00000007CAA60A7L), Double.longBitsToDouble(0x4000000000000000L), false)));
    public Class44 Field16633 = this.Method23(this.Field16627.Method7405(new Class44("ScaleLeftZ", (Class42)this, 1.0, Double.longBitsToDouble(-4611686018427387904L), Double.longBitsToDouble((long)1653999212 ^ 0x400000006296066CL), false)));
    private final Class1996 Field16634 = this.Method24(new Class1996(new Class44("Auto Rotates", this)));
    public Class44 Field16635 = this.Method23(this.Field16634.Method7405(new Class44("AutoRotateRigthX", (Class42)this, false)));
    public Class44 Field16636 = this.Method23(this.Field16634.Method7405(new Class44("AutoRotateRigthY", (Class42)this, false)));
    public Class44 Field16637 = this.Method23(this.Field16634.Method7405(new Class44("AutoRotateRigthZ", (Class42)this, false)));
    public Class44 Field16638 = this.Method23(this.Field16634.Method7405(new Class44("AutoRotateLeftX", (Class42)this, false)));
    public Class44 Field16639 = this.Method23(this.Field16634.Method7405(new Class44("AutoRotateLeftY", (Class42)this, false)));
    public Class44 Field16640 = this.Method23(this.Field16634.Method7405(new Class44("AutoRotateLeftZ", (Class42)this, false)));
    public Class44 Field16641 = this.Method23(new Class44("HandHide", (Class42)this, false));
    private final Class1996 Field16642 = this.Method24(new Class1996(new Class44("Hands", this)));
    public Class44 Field16643 = this.Method23(this.Field16642.Method7405(new Class44("Hands", (Class42)this, false)));
    public Class44 Field16644 = this.Method23(this.Field16642.Method7405(new Class44("HandRightX", (Class42)this, 0.0, Double.longBitsToDouble(-4607182418800017408L), Double.longBitsToDouble((long)430847618 ^ 0x4010000019AE3682L), false).Method313(this.Field16643::Method365)));
    public Class44 Field16645 = this.Method23(this.Field16642.Method7405(new Class44("HandRightY", (Class42)this, 0.0, Double.longBitsToDouble((long)1552337516 ^ 0xC01000005C86CA6CL), Double.longBitsToDouble((long)1374048179 ^ 0x4010000051E64FB3L), false).Method313(this.Field16643::Method365)));
    public Class44 Field16646 = this.Method23(this.Field16642.Method7405(new Class44("HandRightZ", (Class42)this, 0.0, Double.longBitsToDouble(-4607182418800017408L), Double.longBitsToDouble(0x4010000000000000L), false).Method313(this.Field16643::Method365)));
    public Class44 Field16647 = this.Method23(this.Field16642.Method7405(new Class44("HandRotateRightX", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(4645040803167600640L), false).Method313(this.Field16643::Method365)));
    public Class44 Field16648 = this.Method23(this.Field16642.Method7405(new Class44("HandRotateRightY", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)1977425747 ^ 0x4076800075DD1F53L), false).Method313(this.Field16643::Method365)));
    public Class44 Field16649 = this.Method23(this.Field16642.Method7405(new Class44("HandRotateRightZ", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(4645040803167600640L), false).Method313(this.Field16643::Method365)));
    public Class44 Field16650 = this.Method23(this.Field16642.Method7405(new Class44("HandScaleRightX", (Class42)this, 0.0, Double.longBitsToDouble((long)529553433 ^ 0xC00000001F905819L), Double.longBitsToDouble(0x4000000000000000L), false).Method313(this.Field16643::Method365)));
    public Class44 Field16651 = this.Method23(this.Field16642.Method7405(new Class44("HandScaleRightY", (Class42)this, 0.0, Double.longBitsToDouble((long)212892978 ^ 0xC00000000CB07D32L), Double.longBitsToDouble(0x4000000000000000L), false).Method313(this.Field16643::Method365)));
    public Class44 Field16652 = this.Method23(this.Field16642.Method7405(new Class44("HandScaleRightZ", (Class42)this, 0.0, Double.longBitsToDouble((long)356811404 ^ 0xC00000001544828CL), Double.longBitsToDouble((long)2102162594 ^ 0x400000007D4C74A2L), false).Method313(this.Field16643::Method365)));
    public Class44 Field16653 = this.Method23(this.Field16642.Method7405(new Class44("HandLeftX", (Class42)this, 0.0, Double.longBitsToDouble(-4607182418800017408L), Double.longBitsToDouble(0x4010000000000000L), false).Method313(this.Field16643::Method365)));
    public Class44 Field16654 = this.Method23(this.Field16642.Method7405(new Class44("HandLeftY", (Class42)this, 0.0, Double.longBitsToDouble((long)513303260 ^ 0xC01000001E9862DCL), Double.longBitsToDouble((long)1299879271 ^ 0x401000004D7A9567L), false).Method313(this.Field16643::Method365)));
    public Class44 Field16655 = this.Method23(this.Field16642.Method7405(new Class44("HandLeftZ", (Class42)this, 0.0, Double.longBitsToDouble(-4607182418800017408L), Double.longBitsToDouble((long)1841600321 ^ 0x401000006DC49741L), false).Method313(this.Field16643::Method365)));
    public Class44 Field16656 = this.Method23(this.Field16642.Method7405(new Class44("HandRotateLeftX", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)182663130 ^ 0x407680000AE337DAL), false).Method313(this.Field16643::Method365)));
    public Class44 Field16657 = this.Method23(this.Field16642.Method7405(new Class44("HandRotateLeftY", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)1766761218 ^ 0x40768000694EA302L), false).Method313(this.Field16643::Method365)));
    public Class44 Field16658 = this.Method23(this.Field16642.Method7405(new Class44("HandRotateLeftZ", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)738291239 ^ 0x407680002C016E27L), false).Method313(this.Field16643::Method365)));
    public Class44 Field16659 = this.Method23(this.Field16642.Method7405(new Class44("HandScaleLeftX", (Class42)this, 0.0, Double.longBitsToDouble(-4611686018427387904L), Double.longBitsToDouble((long)612261186 ^ 0x40000000247E5D42L), false).Method313(this.Field16643::Method365)));
    public Class44 Field16660 = this.Method23(this.Field16642.Method7405(new Class44("HandScaleLeftY", (Class42)this, 0.0, Double.longBitsToDouble(-4611686018427387904L), Double.longBitsToDouble((long)429098129 ^ 0x4000000019938491L), false).Method313(this.Field16643::Method365)));
    public Class44 Field16661 = this.Method23(this.Field16642.Method7405(new Class44("HandScaleLeftZ", (Class42)this, 0.0, Double.longBitsToDouble(-4611686018427387904L), Double.longBitsToDouble((long)949813223 ^ 0x40000000389CFFE7L), false).Method313(this.Field16643::Method365)));
    public Class44 Field16662 = this.Method23(new Class44("Use Custom Alpha", (Class42)this, false));
    public Class44 Field16663 = this.Method23(new Class44("Alpha", (Class42)this, Double.longBitsToDouble((long)69625024 ^ 0x406FE000042664C0L), 0.0, Double.longBitsToDouble(4643176031446892544L), true).Method313(this.Field16662::Method365));
    private String Field16664 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1877() {
        super("ViewModel", "modeL vieM", Class97.Field8342);
        Field16608 = this;
    }

    public void Method6972(EnumHandSide enumHandSide) {
        switch (Class1794.Field16226[enumHandSide.ordinal()]) {
            case 1: {
                GL11.glTranslated((double)this.Field16644.Method367(), (double)this.Field16645.Method367(), (double)this.Field16646.Method367());
                GL11.glRotated((double)this.Field16647.Method367(), (double)1.0, (double)0.0, (double)0.0);
                GL11.glRotated((double)this.Field16648.Method367(), (double)0.0, (double)1.0, (double)0.0);
                GL11.glRotated((double)this.Field16649.Method367(), (double)0.0, (double)0.0, (double)1.0);
                GL11.glScaled((double)this.Field16650.Method367(), (double)this.Field16651.Method367(), (double)this.Field16652.Method367());
                return;
            }
            case 2: {
                GL11.glTranslated((double)this.Field16653.Method367(), (double)this.Field16654.Method367(), (double)this.Field16655.Method367());
                GL11.glRotated((double)this.Field16656.Method367(), (double)1.0, (double)0.0, (double)0.0);
                GL11.glRotated((double)this.Field16657.Method367(), (double)0.0, (double)1.0, (double)0.0);
                GL11.glRotated((double)this.Field16658.Method367(), (double)0.0, (double)0.0, (double)1.0);
                GL11.glScaled((double)this.Field16659.Method367(), (double)this.Field16660.Method367(), (double)this.Field16661.Method367());
                return;
            }
        }
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6973(EntityViewRenderEvent.FOVModifier fOVModifier) {
        if (!this.Field16611.Method365()) return;
        fOVModifier.setFOV(this.Field16612.Method368());
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 214;
            cArray2[n] = (char)(cArray[n] ^ (0x5EF7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

