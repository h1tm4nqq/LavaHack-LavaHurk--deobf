//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import com.kisman.cc.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.passive.*;
import net.minecraftforge.client.event.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.renderer.*;
import java.awt.*;
import java.util.concurrent.*;

public class Class2134 extends Class42
{
    private final Class44 Field17709;
    public final Class44 Field17710;
    private final Class411 Field17711;
    private final Class1996 Field17712;
    private final Class44 Field17713;
    private final Class44 Field17714;
    private final Class44 Field17715;
    private final Class44 Field17716;
    private final Class44 Field17717;
    private final Class44 Field17718;
    private final Class44 Field17719;
    public final Class44 Field17720;
    private final Class44 Field17721;
    private final Class1996 Field17722;
    private final Class44 Field17723;
    private final Class44 Field17724;
    private final Class44 Field17725;
    private final Class44 Field17726;
    private final Class44 Field17727;
    private final Class44 Field17728;
    private final Class44 Field17729;
    private final Class44 Field17730;
    private final Class44 Field17731;
    private final Class44 Field17732;
    private final Class44 Field17733;
    private final Class44 Field17734;
    private final Class44 Field17735;
    private final Class44 Field17736;
    private final Class44 Field17737;
    private final Class44 Field17738;
    private final Class44 Field17739;
    private final Class44 Field17740;
    private final Class44 Field17741;
    private final Class44 Field17742;
    private final Class44 Field17743;
    private final Class44 Field17744;
    private final Class44 Field17745;
    private final Class44 Field17746;
    private final Class44 Field17747;
    private final Class44 Field17748;
    private final Class44 Field17749;
    private final Class44 Field17750;
    private final Class44 Field17751;
    private final Class44 Field17752;
    private final Class44 Field17753;
    private final Class44 Field17754;
    private final Class44 Field17755;
    private final Class44 Field17756;
    private final Class44 Field17757;
    private final Class44 Field17758;
    @Class873
    public static Class2134 Field17759;
    private boolean Field17760;
    private boolean Field17761;
    private ArrayList Field17762;
    public static HashMap Field17763;
    private final ArrayList Field17764;
    private int Field17765;
    
    public Class2134() {
        super("ShaderCharms", Class97.Field8342);
        this.Field17709 = this.Method23(new Class44("Range", this, Double.longBitsToDouble((long)506507437 ^ 0x404000001E30B0ADL), Double.longBitsToDouble((long)189560537 ^ 0x402000000B4C76D9L), Double.longBitsToDouble(4634204016564240384L), true));
        this.Field17710 = this.Method23(new Class44("Mode", this, (Enum)Class1671.Field15780));
        this.Field17711 = this.Method54();
        this.Field17712 = this.Method24(new Class1996(new Class44("Types", this)));
        this.Field17713 = this.Method23(this.Field17712.Method7405(new Class44("Crystals", this, true)));
        this.Field17714 = this.Method23(this.Field17712.Method7405(new Class44("Players", this, false)));
        this.Field17715 = this.Method23(this.Field17712.Method7405(new Class44("Friends", this, true)));
        this.Field17716 = this.Method23(this.Field17712.Method7405(new Class44("Mobs", this, false)));
        this.Field17717 = this.Method23(this.Field17712.Method7405(new Class44("Animals", this, false)));
        this.Field17718 = this.Method23(this.Field17712.Method7405(new Class44("Ender Pearls", this, false)));
        this.Field17719 = this.Method23(this.Field17712.Method7405(new Class44("Items(Entity)", this, false)));
        this.Field17720 = this.Method23(this.Field17712.Method7405(new Class44("Items", this, true)));
        this.Field17721 = this.Method23(this.Field17712.Method7405(new Class44("Items Fix", this, false).Method313(this.Field17720::Method365)));
        this.Field17722 = this.Method24(new Class1996(new Class44("Config", this)));
        this.Field17723 = this.Method23(this.Field17722.Method7405(new Class44("Animation Speed", this, 0.0, 1.0, Double.longBitsToDouble(4621819117588971520L), false).Method313(this::Method7703)));
        this.Field17724 = this.Method23(this.Field17722.Method7405(new Class44("Blur", this, true).Method313(this::Method7702)));
        this.Field17725 = this.Method23(this.Field17722.Method7405(new Class44("Radius", this, Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4591870180174331904L), Double.longBitsToDouble(4621819117588971520L), false)));
        this.Field17726 = this.Method23(this.Field17722.Method7405(new Class44("Mix", this, 1.0, 0.0, 1.0, false)));
        this.Field17727 = this.Method23(this.Field17722.Method7405(new Class44("Red", this, 1.0, 0.0, 1.0, false).Method313(this::Method7701)));
        this.Field17728 = this.Method23(this.Field17722.Method7405(new Class44("Green", this, 1.0, 0.0, 1.0, false).Method313(this::Method7700)));
        this.Field17729 = this.Method23(this.Field17722.Method7405(new Class44("Blue", this, 1.0, 0.0, 1.0, false).Method313(this::Method7699)));
        this.Field17730 = this.Field17722.Method7405(new Class44("RainBow", this, true).Method313(this::Method7698));
        this.Field17731 = this.Method23(this.Field17722.Method7405(new Class44("Delay", this, Double.longBitsToDouble(4636737291354636288L), 1.0, Double.longBitsToDouble((long)610144672 ^ 0x409F4000245E11A0L), true)));
        this.Field17732 = this.Method23(this.Field17722.Method7405(new Class44("Saturation", this, Double.longBitsToDouble((long)649803420 ^ 0x4042000026BB369CL), 0.0, Double.longBitsToDouble(4636737291354636288L), Class467.Field9942)));
        this.Field17733 = this.Method23(this.Field17722.Method7405(new Class44("Brightness", this, Double.longBitsToDouble((long)567319226 ^ 0x4059000021D09ABAL), 0.0, Double.longBitsToDouble(4636737291354636288L), Class467.Field9942)));
        this.Field17734 = this.Method23(this.Field17722.Method7405(new Class44("Quality", this, 1.0, 0.0, Double.longBitsToDouble(4626322717216342016L), false)));
        this.Field17735 = this.Method23(this.Field17722.Method7405(new Class44("Gradient Alpha", this, false).Method313(this::Method7697)));
        this.Field17736 = this.Method23(this.Field17722.Method7405(new Class44("Alpha Gradient Value", this, Double.longBitsToDouble((long)1185766730 ^ 0x406FE00046AD5D4AL), 0.0, Double.longBitsToDouble((long)324306708 ^ 0x406FE00013548714L), true).Method313(this::Method7696)));
        this.Field17737 = this.Method23(this.Field17722.Method7405(new Class44("Duplicate Outline", this, 1.0, 0.0, Double.longBitsToDouble((long)231265446 ^ 0x403400000DC8D4A6L), false).Method313(this::Method7695)));
        this.Field17738 = this.Method23(this.Field17722.Method7405(new Class44("More Gradient", this, 1.0, 0.0, Double.longBitsToDouble(4621819117588971520L), false).Method313(this::Method7694)));
        this.Field17739 = this.Method23(this.Field17722.Method7405(new Class44("Creepy", this, 1.0, 0.0, Double.longBitsToDouble((long)1137063177 ^ 0x4034000043C63509L), false).Method313(this::Method7693)));
        this.Field17740 = this.Method23(this.Field17722.Method7405(new Class44("Alpha", this, 1.0, 0.0, 1.0, false).Method313(this::Method7692)));
        this.Field17741 = this.Method23(this.Field17722.Method7405(new Class44("Num Octaves", this, Double.longBitsToDouble((long)108690182 ^ 0x40140000067A7B06L), 1.0, Double.longBitsToDouble(4629137466983448576L), true).Method313(this::Method7691)));
        this.Field17742 = this.Method23(this.Field17722.Method7405(new Class44("Speed", this, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4562254508917369340L), Double.longBitsToDouble((long)646538367 ^ 0x3FB99999BF10FDE5L), false).Method313(this::Method7690)));
        this.Field17743 = this.Method23(this.Field17722.Method7405(new Class44("Rainbow Speed", this, Double.longBitsToDouble(4600877379321698714L), 0.0, 1.0, false).Method313(this::Method7689)));
        this.Field17744 = this.Method23(this.Field17722.Method7405(new Class44("Rainbow Strength", this, Double.longBitsToDouble(4599075939470750515L), 0.0, 1.0, false).Method313(this::Method7688)));
        this.Field17745 = this.Method23(this.Field17722.Method7405(new Class44("Rainbow Saturation", this, Double.longBitsToDouble((long)1164330258 ^ 0x3FE0000045664512L), 0.0, 1.0, false).Method313(this::Method7687)));
        this.Field17746 = this.Method23(this.Field17722.Method7405(new Class44("Color 1", this, new Class2027(255, 0, 0, 255))));
        this.Field17747 = this.Method23(this.Field17722.Method7405(new Class44("Color 2", this, new Class2027(255, 0, 0, 255))));
        this.Field17748 = this.Method23(this.Field17722.Method7405(new Class44("Filled Color", this, new Class2027(255, 0, 0, 255))));
        this.Field17749 = this.Method23(this.Field17722.Method7405(new Class44("Outline Color", this, new Class2027(255, 0, 0, 255))));
        this.Field17750 = this.Method23(this.Field17722.Method7405(new Class44("Custom Alpha", this, true)));
        this.Field17751 = this.Method23(this.Field17722.Method7405(new Class44("Filled", this, false)));
        this.Field17752 = this.Method23(this.Field17722.Method7405(new Class44("Rainbow Filled", this, false)));
        this.Field17753 = this.Method23(this.Field17722.Method7405(new Class44("Rainbow Alpha")));
        this.Field17754 = this.Method23(this.Field17722.Method7405(new Class44("Circle", this, false)));
        this.Field17755 = this.Method23(this.Field17722.Method7405(new Class44("Circle Radius", this, Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4621819117588971520L), false)));
        this.Field17756 = this.Method23(this.Field17722.Method7405(new Class44("Glow", this, false)));
        this.Field17757 = this.Method23(this.Field17722.Method7405(new Class44("Outline", this, false)));
        this.Field17758 = this.Method23(this.Field17722.Method7405(new Class44("Fade Outline", this, false)));
        this.Field17760 = false;
        this.Field17761 = false;
        this.Field17762 = new ArrayList();
        this.Field17764 = new ArrayList();
        super.Method44(this::Method7686);
        super.Method21(true);
        super.Field8062 = false;
    }
    
    @Override
    public void Method38() {
        super.Method38();
        this.Field17711.Method2004();
        this.Field17764.clear();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method7680(final RenderHandEvent renderHandEvent) {
        if (this.Field17720.Method365() && this.Field17721.Method365() && !this.Field17760) {
            renderHandEvent.setCanceled(true);
        }
    }
    
    @Override
    public void Method45() {
        this.Field17764.clear();
        for (final Map.Entry<Class1697, V> entry : Class2134.Field17763.entrySet()) {
            final Class1697 e = entry.getKey();
            if (((Supplier)entry.getValue()).get()) {
                this.Field17764.add(e);
            }
        }
        this.Field17761 = !this.Field17764.isEmpty();
    }
    
    public boolean Method7681(final Entity entity) {
        return entity != Class2134.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player && ((entity instanceof EntityPlayer && this.Field17714.Method365()) || (entity instanceof EntityPlayer && this.Field17715.Method365() && Class726.Field11086.Method3043(entity.getName())) || (entity instanceof EntityEnderCrystal && this.Field17713.Method365()) || ((entity instanceof EntityMob || entity instanceof EntitySlime) && this.Field17716.Method365()) || (entity instanceof EntityEnderPearl && this.Field17718.Method365()) || (entity instanceof EntityItem && this.Field17719.Method365()) || (entity instanceof EntityAnimal && this.Field17717.Method365()));
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method7682(final RenderWorldLastEvent renderWorldLastEvent) {
        if (!Display.isActive() || !Display.isVisible() || Class2134.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen instanceof GuiDownloadTerrain) {
            return;
        }
        final boolean b = this.Field17714.Method365() || this.Field17715.Method365() || this.Field17713.Method365() || this.Field17716.Method365() || this.Field17718.Method365() || this.Field17719.Method365() || this.Field17717.Method365();
        this.Field17711.Method2005(this::Method7684);
        final boolean b2 = !this.Field17762.isEmpty();
        final boolean b3 = this.Field17720.Method365() && Class2134.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.thirdPersonView == 0;
        if (this.Field17761) {
            final Class1591 class1591 = null;
            final String method359 = this.Field17710.Method359();
            switch (method359.hashCode()) {
                case 2016956: {
                    if (method359.equals("AQUA")) {
                        break;
                    }
                    break;
                }
                case 81009: {
                    if (method359.equals("RED")) {
                        break;
                    }
                    break;
                }
                case 79024463: {
                    if (method359.equals("SMOKE")) {
                        break;
                    }
                    break;
                }
                case 2160942: {
                    if (method359.equals("FLOW")) {
                        break;
                    }
                    break;
                }
                case 1960714016: {
                    if (method359.equals("ITEMGLOW")) {
                        break;
                    }
                    break;
                }
                case -1923613764: {
                    if (method359.equals("PURPLE")) {
                        break;
                    }
                    break;
                }
                case 872277808: {
                    if (method359.equals("GRADIENT")) {
                        break;
                    }
                    break;
                }
                case 84188: {
                    if (method359.equals("UNU")) {
                        break;
                    }
                    break;
                }
                case 2190733: {
                    if (method359.equals("GLOW")) {
                        break;
                    }
                    break;
                }
                case -388262878: {
                    if (method359.equals("OUTLINE")) {
                        break;
                    }
                    break;
                }
                case 1579140282: {
                    if (method359.equals("BlueFlames")) {
                        break;
                    }
                    break;
                }
                case 65282027: {
                    if (method359.equals("CodeX")) {
                        break;
                    }
                    break;
                }
                case 65369201: {
                    if (method359.equals("Crazy")) {
                        break;
                    }
                    break;
                }
                case 2138497321: {
                    if (method359.equals("Golden")) {
                        break;
                    }
                    break;
                }
                case 69720868: {
                    if (method359.equals("HideF")) {
                        break;
                    }
                    break;
                }
                case -432118645: {
                    if (method359.equals("HolyFuck")) {
                        break;
                    }
                    break;
                }
                case -1531671539: {
                    if (method359.equals("HotShit")) {
                        break;
                    }
                    break;
                }
                case 75336: {
                    if (method359.equals("Kfc")) {
                        break;
                    }
                    break;
                }
                case -572581401: {
                    if (method359.equals("Sheldon")) {
                        break;
                    }
                    break;
                }
                case 80009571: {
                    if (method359.equals("Smoky")) {
                        break;
                    }
                    break;
                }
                case 2550147: {
                    if (method359.equals("SNOW")) {
                        break;
                    }
                    break;
                }
                case -1793790217: {
                    if (method359.equals("Techno")) {
                        break;
                    }
                    break;
                }
                case 2018617584: {
                    if (method359.equals("Circle")) {
                        break;
                    }
                    break;
                }
            }
            if (class1591 == null) {
                return;
            }
            class1591.Field15446 = this.Field17723.Method335();
            GlStateManager.pushMatrix();
            GlStateManager.pushAttrib();
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(GlStateManager$SourceFactor.SRC_ALPHA, GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager$SourceFactor.ONE, GlStateManager$DestFactor.ZERO);
            GlStateManager.enableDepth();
            GlStateManager.depthMask(true);
            GlStateManager.enableAlpha();
            class1591.Method241(renderWorldLastEvent.getPartialTicks());
            if (this.Field17761) {
                final Iterator<Class1697> iterator = this.Field17764.iterator();
                while (iterator.hasNext()) {
                    iterator.next().Method966();
                }
            }
            class1591.Method242();
            GlStateManager.disableBlend();
            GlStateManager.disableAlpha();
            GlStateManager.disableDepth();
            GlStateManager.popAttrib();
            GlStateManager.popMatrix();
        }
    }
    
    public Color Method7683() {
        return this.Field17730.Method365() ? Class1172.Method4725(this.Field17731.Method335(), this.Field17732.Method368(), this.Field17733.Method368()) : new Color(this.Field17727.Method368(), this.Field17728.Method368(), this.Field17729.Method368());
    }
    
    private void Method7684() {
        final ArrayList<Entity> list = new ArrayList<Entity>();
        for (final Entity e : Class2134.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList) {
            if (e != Class2134.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) {
                if (e == Class2134.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderViewEntity()) {
                    continue;
                }
                if ((!(e instanceof EntityPlayer) || !this.Field17714.Method365()) && (!(e instanceof EntityPlayer) || !this.Field17715.Method365() || !Class726.Field11086.Method3043(e.getName())) && (!(e instanceof EntityEnderCrystal) || !this.Field17713.Method365()) && ((!(e instanceof EntityMob) && !(e instanceof EntitySlime)) || !this.Field17716.Method365()) && (!(e instanceof EntityEnderPearl) || !this.Field17718.Method365()) && (!(e instanceof EntityItem) || !this.Field17719.Method365())) {
                    if (!(e instanceof EntityAnimal)) {
                        continue;
                    }
                    if (!this.Field17717.Method365()) {
                        continue;
                    }
                }
                list.add(e);
            }
        }
        Class2134.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask((Callable)this::Method7685);
    }
    
    private ArrayList Method7685(final ArrayList field17762) throws Exception {
        return this.Field17762 = field17762;
    }
    
    private String Method7686() {
        return "[" + this.Field17710.Method359() + "]";
    }
    
    private Boolean Method7687() {
        return this.Field17710.Method309("OUTLINE") || this.Field17710.Method309("InertiaOutline");
    }
    
    private Boolean Method7688() {
        return this.Field17710.Method309("OUTLINE") || this.Field17710.Method309("InertiaOutline");
    }
    
    private Boolean Method7689() {
        return this.Field17710.Method309("OUTLINE") || this.Field17710.Method309("InertiaOutline");
    }
    
    private Boolean Method7690() {
        return this.Field17710.Method309("GRADIENT");
    }
    
    private Boolean Method7691() {
        return this.Field17710.Method309("GRADIENT");
    }
    
    private Boolean Method7692() {
        return this.Field17710.Method309("GRADIENT");
    }
    
    private Boolean Method7693() {
        return this.Field17710.Method309("GRADIENT");
    }
    
    private Boolean Method7694() {
        return this.Field17710.Method309("GRADIENT");
    }
    
    private Boolean Method7695() {
        return this.Field17710.Method309("GRADIENT");
    }
    
    private Boolean Method7696() {
        return this.Field17710.Method309("GRADIENT");
    }
    
    private Boolean Method7697() {
        return this.Field17710.Method309("GRADIENT");
    }
    
    private Boolean Method7698() {
        return this.Field17710.Method309("ITEMGLOW") || this.Field17710.Method309("GLOW") || this.Field17710.Method309("Outline2");
    }
    
    private Boolean Method7699() {
        return this.Field17710.Method309("ITEMGLOW") || this.Field17710.Method309("GLOW") || this.Field17710.Method309("OUTLINE") || this.Field17710.Method309("Outline2") || this.Field17710.Method309("InertiaOutline");
    }
    
    private Boolean Method7700() {
        return this.Field17710.Method309("ITEMGLOW") || this.Field17710.Method309("GLOW") || this.Field17710.Method309("OUTLINE") || this.Field17710.Method309("Outline2") || this.Field17710.Method309("InertiaOutline");
    }
    
    private Boolean Method7701() {
        return this.Field17710.Method309("ITEMGLOW") || this.Field17710.Method309("GLOW") || this.Field17710.Method309("OUTLINE") || this.Field17710.Method309("Outline2") || this.Field17710.Method309("InertiaOutline");
    }
    
    private Boolean Method7702() {
        return this.Field17710.Method309("ITEMGLOW");
    }
    
    private Boolean Method7703() {
        return !this.Field17710.Method309("GRADIENT");
    }
    
    static {
        Class2134.Field17763 = new HashMap();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x100C ^ 0x26));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
