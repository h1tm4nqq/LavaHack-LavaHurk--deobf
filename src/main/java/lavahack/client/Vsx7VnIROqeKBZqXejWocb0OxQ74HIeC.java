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

import lavahack.client.Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC$1;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.util.EnumHandSide;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public static Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC Field16608;
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16609 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Custom Eating", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)542790302L ^ 0x205A529E) != 0));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16610 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Translate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1343884956L ^ 0xAFE5F165) != 0));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16611 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ItemFOV", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)270184527L ^ 0x101AB04F) != 0));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16612 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("FOV", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xD814EECE6B5BA9A3L ^ 0x9874AECE6B5BA9A3L), Double.longBitsToDouble((long)1287948643 ^ 0x405180004CC48963L), Double.longBitsToDouble((long)915894893 ^ 0x406900003697726DL), (boolean)((long)-1962643651 ^ (long)-1962643652)).Method313(this.Field16611::Method365));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16613 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Translates", this)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16614 = this.Method23(this.Field16613.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RightX", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble((long)2093679832 ^ 0xC00000007CCB04D8L), Double.longBitsToDouble(0xE33E1C9CE924FA4L ^ 0x4E33E1C9CE924FA4L), (boolean)((long)-267631997 ^ (long)-267631997))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16615 = this.Method23(this.Field16613.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RightY", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble((long)141490692 ^ 0xC0000000086EFA04L), Double.longBitsToDouble(0x9621A6EC74DEEF58L ^ 0xD621A6EC74DEEF58L), (boolean)((long)-1540564807 ^ (long)-1540564807))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16616 = this.Method23(this.Field16613.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RightZ", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble((long)1587178625 ^ 0xC00000005E9A6C81L), Double.longBitsToDouble((long)332006536 ^ 0x4000000013CA0488L), (boolean)((long)258357493 ^ (long)258357493))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16617 = this.Method23(this.Field16613.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("LeftX", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble((long)1111055171 ^ 0xC000000042395B43L), Double.longBitsToDouble((long)1719274193 ^ 0x40000000667A0AD1L), (boolean)((long)-271234249 ^ (long)-271234249))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16618 = this.Method23(this.Field16613.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("LeftY", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble((long)2397940 ^ 0xC0000000002496F4L), Double.longBitsToDouble(0x792C4D3A425F5550L ^ 0x392C4D3A425F5550L), ((int)1402814606L ^ 0x539D408E) != 0)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16619 = this.Method23(this.Field16613.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("LeftZ", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble((long)1827877306 ^ 0xC00000006CF331BAL), Double.longBitsToDouble(0x5DB2E88CE20593DEL ^ 0x1DB2E88CE20593DEL), ((int)-1297983403L ^ 0xB2A25855) != 0)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16620 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotates", this)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16621 = this.Method23(this.Field16620.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RotateRightX", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)1827716475 ^ 0x407680006CF0BD7BL), (boolean)((long)-1582501103 ^ (long)-1582501103))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16622 = this.Method23(this.Field16620.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RotateRightY", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble(0x6A4AB11C4E00B8C3L ^ 0x2A3C311C4E00B8C3L), (boolean)((long)402012323 ^ (long)402012323))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16623 = this.Method23(this.Field16620.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RotateRightZ", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)940002770 ^ 0x4076800038074DD2L), ((int)-407869708L ^ 0xE7B066F4) != 0)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16624 = this.Method23(this.Field16620.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RotateLeftX", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble(0x6BA687C03FECCE3EL ^ 0x2BD007C03FECCE3EL), (boolean)((long)-1852052047 ^ (long)-1852052047))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16625 = this.Method23(this.Field16620.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RotateLeftY", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)1479858480 ^ 0x407680005834D930L), (boolean)((long)1857234142 ^ (long)1857234142))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16626 = this.Method23(this.Field16620.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RotateLeftZ", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)1326878114 ^ 0x407680004F168DA2L), (boolean)((long)2147474185 ^ (long)2147474185))));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16627 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Scales", this)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16628 = this.Method23(this.Field16627.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ScaleRigthX", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble(0x175EFF6C587ADF4FL ^ 0xD75EFF6C587ADF4FL), Double.longBitsToDouble(0x52A9B233795687B1L ^ 0x12A9B233795687B1L), ((int)2041207314L ^ 0x79AA5A12) != 0)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16629 = this.Method23(this.Field16627.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ScaleRigthY", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble((long)174076988 ^ 0xC00000000A60343CL), Double.longBitsToDouble(0x2138955BAF2E272BL ^ 0x6138955BAF2E272BL), (boolean)((long)-1218663162 ^ (long)-1218663162))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16630 = this.Method23(this.Field16627.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ScaleRigthZ", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble((long)1102411709 ^ 0xC000000041B577BDL), Double.longBitsToDouble(0x1AB4CA5B42B631A8L ^ 0x5AB4CA5B42B631A8L), ((int)1419818921L ^ 0x54A0B7A9) != 0)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16631 = this.Method23(this.Field16627.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ScaleLeftX", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble((long)402190700 ^ 0xC000000017F8F16CL), Double.longBitsToDouble((long)2070388339 ^ 0x400000007B679E73L), (boolean)((long)-83456211 ^ (long)-83456211))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16632 = this.Method23(this.Field16627.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ScaleLeftY", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble((long)2091540647 ^ 0xC00000007CAA60A7L), Double.longBitsToDouble(0xB4D87EE44F947EB4L ^ 0xF4D87EE44F947EB4L), ((int)704298013L ^ 0x29FABC1D) != 0)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16633 = this.Method23(this.Field16627.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ScaleLeftZ", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble(0x790272B9AC2C5643L ^ 0xB90272B9AC2C5643L), Double.longBitsToDouble((long)1653999212 ^ 0x400000006296066CL), (boolean)((long)-407875568 ^ (long)-407875568))));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16634 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Auto Rotates", this)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16635 = this.Method23(this.Field16634.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("AutoRotateRigthX", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1736585526 ^ (long)1736585526))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16636 = this.Method23(this.Field16634.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("AutoRotateRigthY", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1385260269L ^ 0x529164ED) != 0)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16637 = this.Method23(this.Field16634.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("AutoRotateRigthZ", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1971482228 ^ (long)1971482228))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16638 = this.Method23(this.Field16634.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("AutoRotateLeftX", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)425699722L ^ 0x195FA98A) != 0)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16639 = this.Method23(this.Field16634.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("AutoRotateLeftY", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1847011160L ^ 0x6E172758) != 0)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16640 = this.Method23(this.Field16634.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("AutoRotateLeftZ", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)49048643 ^ (long)49048643))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16641 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HandHide", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)2021420210L ^ 0x787C6CB2) != 0));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16642 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Hands", this)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16643 = this.Method23(this.Field16642.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Hands", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-331058627L ^ 0xEC44723D) != 0)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16644 = this.Method23(this.Field16642.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HandRightX", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble(0xBD84DA40C7CE8735L ^ 0x7D94DA40C7CE8735L), Double.longBitsToDouble((long)430847618 ^ 0x4010000019AE3682L), (boolean)((long)431099692 ^ (long)431099692)).Method313(this.Field16643::Method365)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16645 = this.Method23(this.Field16642.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HandRightY", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble((long)1552337516 ^ 0xC01000005C86CA6CL), Double.longBitsToDouble((long)1374048179 ^ 0x4010000051E64FB3L), ((int)13985742L ^ 0xD567CE) != 0).Method313(this.Field16643::Method365)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16646 = this.Method23(this.Field16642.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HandRightZ", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble(0xE0A94B354C83D126L ^ 0x20B94B354C83D126L), Double.longBitsToDouble(0x1A5E556F43646565L ^ 0x5A4E556F43646565L), ((int)-1003541221L ^ 0xC42F2D1B) != 0).Method313(this.Field16643::Method365)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16647 = this.Method23(this.Field16642.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HandRotateRightX", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble(0x1B3C2ECBA265DA20L ^ 0x5B4AAECBA265DA20L), (boolean)((long)2084553829 ^ (long)2084553829)).Method313(this.Field16643::Method365)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16648 = this.Method23(this.Field16642.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HandRotateRightY", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)1977425747 ^ 0x4076800075DD1F53L), (boolean)((long)-1840673559 ^ (long)-1840673559)).Method313(this.Field16643::Method365)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16649 = this.Method23(this.Field16642.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HandRotateRightZ", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble(0x7F93233B173D7D64L ^ 0x3FE5A33B173D7D64L), ((int)208357884L ^ 0xC6B49FC) != 0).Method313(this.Field16643::Method365)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16650 = this.Method23(this.Field16642.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HandScaleRightX", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble((long)529553433 ^ 0xC00000001F905819L), Double.longBitsToDouble(0x1E98365CEC8F364FL ^ 0x5E98365CEC8F364FL), ((int)195838644L ^ 0xBAC42B4) != 0).Method313(this.Field16643::Method365)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16651 = this.Method23(this.Field16642.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HandScaleRightY", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble((long)212892978 ^ 0xC00000000CB07D32L), Double.longBitsToDouble(0xBDFCB91FE047BBB3L ^ 0xFDFCB91FE047BBB3L), (boolean)((long)-449855107 ^ (long)-449855107)).Method313(this.Field16643::Method365)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16652 = this.Method23(this.Field16642.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HandScaleRightZ", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble((long)356811404 ^ 0xC00000001544828CL), Double.longBitsToDouble((long)2102162594 ^ 0x400000007D4C74A2L), (boolean)((long)-2102978364 ^ (long)-2102978364)).Method313(this.Field16643::Method365)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16653 = this.Method23(this.Field16642.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HandLeftX", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble(0xCFF0F37661C5EE6FL ^ 0xFE0F37661C5EE6FL), Double.longBitsToDouble(0xA307AD1F6FD14ACAL ^ 0xE317AD1F6FD14ACAL), (boolean)((long)1326656792 ^ (long)1326656792)).Method313(this.Field16643::Method365)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16654 = this.Method23(this.Field16642.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HandLeftY", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble((long)513303260 ^ 0xC01000001E9862DCL), Double.longBitsToDouble((long)1299879271 ^ 0x401000004D7A9567L), ((int)-179264462L ^ 0xF550A432) != 0).Method313(this.Field16643::Method365)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16655 = this.Method23(this.Field16642.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HandLeftZ", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble(0x823C16930D97EF6BL ^ 0x422C16930D97EF6BL), Double.longBitsToDouble((long)1841600321 ^ 0x401000006DC49741L), ((int)1083282288L ^ 0x40919370) != 0).Method313(this.Field16643::Method365)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16656 = this.Method23(this.Field16642.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HandRotateLeftX", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)182663130 ^ 0x407680000AE337DAL), ((int)1995334929L ^ 0x76EE6511) != 0).Method313(this.Field16643::Method365)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16657 = this.Method23(this.Field16642.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HandRotateLeftY", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)1766761218 ^ 0x40768000694EA302L), (boolean)((long)-2094242187 ^ (long)-2094242187)).Method313(this.Field16643::Method365)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16658 = this.Method23(this.Field16642.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HandRotateLeftZ", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)738291239 ^ 0x407680002C016E27L), ((int)362534456L ^ 0x159BD638) != 0).Method313(this.Field16643::Method365)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16659 = this.Method23(this.Field16642.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HandScaleLeftX", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble(0x833E5751322314BDL ^ 0x433E5751322314BDL), Double.longBitsToDouble((long)612261186 ^ 0x40000000247E5D42L), (boolean)((long)1812652769 ^ (long)1812652769)).Method313(this.Field16643::Method365)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16660 = this.Method23(this.Field16642.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HandScaleLeftY", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble(0xF850FDFDC8D51C4DL ^ 0x3850FDFDC8D51C4DL), Double.longBitsToDouble((long)429098129 ^ 0x4000000019938491L), (boolean)((long)1441070352 ^ (long)1441070352)).Method313(this.Field16643::Method365)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16661 = this.Method23(this.Field16642.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HandScaleLeftZ", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble(0x5ABE540FE930CBE8L ^ 0x9ABE540FE930CBE8L), Double.longBitsToDouble((long)949813223 ^ 0x40000000389CFFE7L), ((int)-1422587069L ^ 0xAB350B43) != 0).Method313(this.Field16643::Method365)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16662 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Use Custom Alpha", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-156738703 ^ (long)-156738703)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16663 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Alpha", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)69625024 ^ 0x406FE000042664C0L), 0.0, Double.longBitsToDouble(0xD8B03FCA1F56A920L ^ 0x98DFDFCA1F56A920L), ((int)-1030712093L ^ 0xC29094E2) != 0).Method313(this.Field16662::Method365));
    private String Field16664 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC() {
        super("ViewModel", "modeL vieM", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
        Field16608 = this;
    }

    public void Method6972(EnumHandSide enumHandSide) {
        switch (Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC$1.Field16226[enumHandSide.ordinal()]) {
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
        int n = (int)((long)2128677069 ^ (long)2128677069);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-299503468L ^ 0xEE25F06B);
            int n2 = (int)((long)-1813821830 ^ (long)-1813821935) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-287629776 ^ (long)-287620921) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

