//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiDownloadTerrain
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.GlStateManager$DestFactor
 *  net.minecraft.client.renderer.GlStateManager$SourceFactor
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.entity.item.EntityEnderPearl
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.entity.monster.EntitySlime
 *  net.minecraft.entity.passive.EntityAnimal
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraftforge.client.event.RenderHandEvent
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.Display
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;
import lavahack.client.Class1172;
import lavahack.client.Class1591;
import lavahack.client.Class1671;
import lavahack.client.Class1697;
import lavahack.client.Class1996;
import lavahack.client.Class411;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class726;
import lavahack.client.Class873;
import lavahack.client.Class97;
import net.minecraft.client.gui.GuiDownloadTerrain;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.Display;

public class Class2134
extends Class42 {
    private final Class44 Field17709 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble((long)506507437 ^ 0x404000001E30B0ADL), Double.longBitsToDouble((long)189560537 ^ 0x402000000B4C76D9L), Double.longBitsToDouble(0x4050000000000000L), true));
    public final Class44 Field17710 = this.Method23(new Class44("Mode", (Class42)this, Class1671.Field15780));
    private final Class411 Field17711 = this.Method54();
    private final Class1996 Field17712 = this.Method24(new Class1996(new Class44("Types", this)));
    private final Class44 Field17713 = this.Method23(this.Field17712.Method7405(new Class44("Crystals", (Class42)this, true)));
    private final Class44 Field17714 = this.Method23(this.Field17712.Method7405(new Class44("Players", (Class42)this, false)));
    private final Class44 Field17715 = this.Method23(this.Field17712.Method7405(new Class44("Friends", (Class42)this, true)));
    private final Class44 Field17716 = this.Method23(this.Field17712.Method7405(new Class44("Mobs", (Class42)this, false)));
    private final Class44 Field17717 = this.Method23(this.Field17712.Method7405(new Class44("Animals", (Class42)this, false)));
    private final Class44 Field17718 = this.Method23(this.Field17712.Method7405(new Class44("Ender Pearls", (Class42)this, false)));
    private final Class44 Field17719 = this.Method23(this.Field17712.Method7405(new Class44("Items(Entity)", (Class42)this, false)));
    public final Class44 Field17720 = this.Method23(this.Field17712.Method7405(new Class44("Items", (Class42)this, true)));
    private final Class44 Field17721 = this.Method23(this.Field17712.Method7405(new Class44("Items Fix", (Class42)this, false).Method313(this.Field17720::Method365)));
    private final Class1996 Field17722 = this.Method24(new Class1996(new Class44("Config", this)));
    private final Class44 Field17723 = this.Method23(this.Field17722.Method7405(new Class44("Animation Speed", (Class42)this, 0.0, 1.0, Double.longBitsToDouble(0x4024000000000000L), false).Method313(this::Method7703)));
    private final Class44 Field17724 = this.Method23(this.Field17722.Method7405(new Class44("Blur", (Class42)this, true).Method313(this::Method7702)));
    private final Class44 Field17725 = this.Method23(this.Field17722.Method7405(new Class44("Radius", (Class42)this, Double.longBitsToDouble(0x4000000000000000L), Double.longBitsToDouble(4591870180174331904L), Double.longBitsToDouble(0x4024000000000000L), false)));
    private final Class44 Field17726 = this.Method23(this.Field17722.Method7405(new Class44("Mix", (Class42)this, 1.0, 0.0, 1.0, false)));
    private final Class44 Field17727 = this.Method23(this.Field17722.Method7405(new Class44("Red", (Class42)this, 1.0, 0.0, 1.0, false).Method313(this::Method7701)));
    private final Class44 Field17728 = this.Method23(this.Field17722.Method7405(new Class44("Green", (Class42)this, 1.0, 0.0, 1.0, false).Method313(this::Method7700)));
    private final Class44 Field17729 = this.Method23(this.Field17722.Method7405(new Class44("Blue", (Class42)this, 1.0, 0.0, 1.0, false).Method313(this::Method7699)));
    private final Class44 Field17730 = this.Field17722.Method7405(new Class44("RainBow", (Class42)this, true).Method313(this::Method7698));
    private final Class44 Field17731 = this.Method23(this.Field17722.Method7405(new Class44("Delay", (Class42)this, Double.longBitsToDouble(4636737291354636288L), 1.0, Double.longBitsToDouble((long)610144672 ^ 0x409F4000245E11A0L), true)));
    private final Class44 Field17732 = this.Method23(this.Field17722.Method7405(new Class44("Saturation", (Class42)this, Double.longBitsToDouble((long)649803420 ^ 0x4042000026BB369CL), 0.0, Double.longBitsToDouble(4636737291354636288L), Class467.Field9942)));
    private final Class44 Field17733 = this.Method23(this.Field17722.Method7405(new Class44("Brightness", (Class42)this, Double.longBitsToDouble((long)567319226 ^ 0x4059000021D09ABAL), 0.0, Double.longBitsToDouble(4636737291354636288L), Class467.Field9942)));
    private final Class44 Field17734 = this.Method23(this.Field17722.Method7405(new Class44("Quality", (Class42)this, 1.0, 0.0, Double.longBitsToDouble(0x4034000000000000L), false)));
    private final Class44 Field17735 = this.Method23(this.Field17722.Method7405(new Class44("Gradient Alpha", (Class42)this, false).Method313(this::Method7697)));
    private final Class44 Field17736 = this.Method23(this.Field17722.Method7405(new Class44("Alpha Gradient Value", (Class42)this, Double.longBitsToDouble((long)1185766730 ^ 0x406FE00046AD5D4AL), 0.0, Double.longBitsToDouble((long)324306708 ^ 0x406FE00013548714L), true).Method313(this::Method7696)));
    private final Class44 Field17737 = this.Method23(this.Field17722.Method7405(new Class44("Duplicate Outline", (Class42)this, 1.0, 0.0, Double.longBitsToDouble((long)231265446 ^ 0x403400000DC8D4A6L), false).Method313(this::Method7695)));
    private final Class44 Field17738 = this.Method23(this.Field17722.Method7405(new Class44("More Gradient", (Class42)this, 1.0, 0.0, Double.longBitsToDouble(0x4024000000000000L), false).Method313(this::Method7694)));
    private final Class44 Field17739 = this.Method23(this.Field17722.Method7405(new Class44("Creepy", (Class42)this, 1.0, 0.0, Double.longBitsToDouble((long)1137063177 ^ 0x4034000043C63509L), false).Method313(this::Method7693)));
    private final Class44 Field17740 = this.Method23(this.Field17722.Method7405(new Class44("Alpha", (Class42)this, 1.0, 0.0, 1.0, false).Method313(this::Method7692)));
    private final Class44 Field17741 = this.Method23(this.Field17722.Method7405(new Class44("Num Octaves", (Class42)this, Double.longBitsToDouble((long)108690182 ^ 0x40140000067A7B06L), 1.0, Double.longBitsToDouble(4629137466983448576L), true).Method313(this::Method7691)));
    private final Class44 Field17742 = this.Method23(this.Field17722.Method7405(new Class44("Speed", (Class42)this, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4562254508917369340L), Double.longBitsToDouble((long)646538367 ^ 0x3FB99999BF10FDE5L), false).Method313(this::Method7690)));
    private final Class44 Field17743 = this.Method23(this.Field17722.Method7405(new Class44("Rainbow Speed", (Class42)this, Double.longBitsToDouble(4600877379321698714L), 0.0, 1.0, false).Method313(this::Method7689)));
    private final Class44 Field17744 = this.Method23(this.Field17722.Method7405(new Class44("Rainbow Strength", (Class42)this, Double.longBitsToDouble(0x3FD3333333333333L), 0.0, 1.0, false).Method313(this::Method7688)));
    private final Class44 Field17745 = this.Method23(this.Field17722.Method7405(new Class44("Rainbow Saturation", (Class42)this, Double.longBitsToDouble((long)1164330258 ^ 0x3FE0000045664512L), 0.0, 1.0, false).Method313(this::Method7687)));
    private final Class44 Field17746 = this.Method23(this.Field17722.Method7405(new Class44("Color 1", (Class42)this, new Class2027(255, 0, 0, 255))));
    private final Class44 Field17747 = this.Method23(this.Field17722.Method7405(new Class44("Color 2", (Class42)this, new Class2027(255, 0, 0, 255))));
    private final Class44 Field17748 = this.Method23(this.Field17722.Method7405(new Class44("Filled Color", (Class42)this, new Class2027(255, 0, 0, 255))));
    private final Class44 Field17749 = this.Method23(this.Field17722.Method7405(new Class44("Outline Color", (Class42)this, new Class2027(255, 0, 0, 255))));
    private final Class44 Field17750 = this.Method23(this.Field17722.Method7405(new Class44("Custom Alpha", (Class42)this, true)));
    private final Class44 Field17751 = this.Method23(this.Field17722.Method7405(new Class44("Filled", (Class42)this, false)));
    private final Class44 Field17752 = this.Method23(this.Field17722.Method7405(new Class44("Rainbow Filled", (Class42)this, false)));
    private final Class44 Field17753 = this.Method23(this.Field17722.Method7405(new Class44("Rainbow Alpha")));
    private final Class44 Field17754 = this.Method23(this.Field17722.Method7405(new Class44("Circle", (Class42)this, false)));
    private final Class44 Field17755 = this.Method23(this.Field17722.Method7405(new Class44("Circle Radius", (Class42)this, Double.longBitsToDouble(0x4000000000000000L), Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(0x4024000000000000L), false)));
    private final Class44 Field17756 = this.Method23(this.Field17722.Method7405(new Class44("Glow", (Class42)this, false)));
    private final Class44 Field17757 = this.Method23(this.Field17722.Method7405(new Class44("Outline", (Class42)this, false)));
    private final Class44 Field17758 = this.Method23(this.Field17722.Method7405(new Class44("Fade Outline", (Class42)this, false)));
    @Class873
    public static Class2134 Field17759;
    private boolean Field17760 = false;
    private boolean Field17761 = false;
    private ArrayList Field17762 = new ArrayList();
    public static HashMap Field17763;
    private final ArrayList Field17764 = new ArrayList();
    private int Field17765;

    public Class2134() {
        super("ShaderCharms", Class97.Field8342);
        super.Method44(this::Method7686);
        super.Method21(true);
        this.Field8062 = false;
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field17711.Method2004();
        this.Field17764.clear();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7680(RenderHandEvent renderHandEvent) {
        if (!this.Field17720.Method365()) return;
        if (!this.Field17721.Method365()) return;
        if (this.Field17760) return;
        renderHandEvent.setCanceled(true);
    }

    @Override
    public void Method45() {
        this.Field17764.clear();
        for (Map.Entry entry : Field17763.entrySet()) {
            Class1697 class1697 = (Class1697)entry.getKey();
            Supplier supplier = (Supplier)entry.getValue();
            if (!((Boolean)supplier.get()).booleanValue()) continue;
            this.Field17764.add(class1697);
        }
        this.Field17761 = !this.Field17764.isEmpty();
    }

    public boolean Method7681(Entity entity) {
        if (entity == Class2134.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) return false;
        if (entity instanceof EntityPlayer) {
            if (this.Field17714.Method365()) return true;
        }
        if (entity instanceof EntityPlayer && this.Field17715.Method365()) {
            if (Class726.Field11086.Method3043(entity.getName())) return true;
        }
        if (entity instanceof EntityEnderCrystal) {
            if (this.Field17713.Method365()) return true;
        }
        if (entity instanceof EntityMob || entity instanceof EntitySlime) {
            if (this.Field17716.Method365()) return true;
        }
        if (entity instanceof EntityEnderPearl) {
            if (this.Field17718.Method365()) return true;
        }
        if (entity instanceof EntityItem) {
            if (this.Field17719.Method365()) return true;
        }
        if (!(entity instanceof EntityAnimal)) return false;
        if (!this.Field17717.Method365()) return false;
        return true;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7682(RenderWorldLastEvent renderWorldLastEvent) {
        boolean bl;
        if (!Display.isActive()) return;
        if (!Display.isVisible()) return;
        if (Class2134.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen instanceof GuiDownloadTerrain) {
            return;
        }
        boolean bl2 = this.Field17714.Method365() || this.Field17715.Method365() || this.Field17713.Method365() || this.Field17716.Method365() || this.Field17718.Method365() || this.Field17719.Method365() || this.Field17717.Method365();
        this.Field17711.Method2005(this::Method7684);
        boolean bl3 = !this.Field17762.isEmpty();
        boolean bl4 = bl = this.Field17720.Method365() && Class2134.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.thirdPersonView == 0;
        if (!this.Field17761) {
            return;
        }
        Class1591 class1591 = null;
        boolean bl5 = false;
        boolean bl6 = false;
        boolean bl7 = false;
        boolean bl8 = false;
        boolean bl9 = false;
        String string = this.Field17710.Method359();
        int n = -1;
        switch (string.hashCode()) {
            case 2016956: {
                if (string.equals("AQUA")) {
                    n = 0;
                }
                break;
            }
            case 81009: {
                if (string.equals("RED")) {
                    n = 1;
                }
                break;
            }
            case 79024463: {
                if (string.equals("SMOKE")) {
                    n = 2;
                }
                break;
            }
            case 2160942: {
                if (string.equals("FLOW")) {
                    n = 3;
                }
                break;
            }
            case 1960714016: {
                if (string.equals("ITEMGLOW")) {
                    n = 4;
                }
                break;
            }
            case -1923613764: {
                if (string.equals("PURPLE")) {
                    n = 5;
                }
                break;
            }
            case 872277808: {
                if (string.equals("GRADIENT")) {
                    n = 6;
                }
                break;
            }
            case 84188: {
                if (string.equals("UNU")) {
                    n = 7;
                }
                break;
            }
            case 2190733: {
                if (string.equals("GLOW")) {
                    n = 8;
                }
                break;
            }
            case -388262878: {
                if (string.equals("OUTLINE")) {
                    n = 9;
                }
                break;
            }
            case 1579140282: {
                if (string.equals("BlueFlames")) {
                    n = 10;
                }
                break;
            }
            case 65282027: {
                if (string.equals("CodeX")) {
                    n = 11;
                }
                break;
            }
            case 65369201: {
                if (string.equals("Crazy")) {
                    n = 12;
                }
                break;
            }
            case 2138497321: {
                if (string.equals("Golden")) {
                    n = 13;
                }
                break;
            }
            case 69720868: {
                if (string.equals("HideF")) {
                    n = 14;
                }
                break;
            }
            case -432118645: {
                if (string.equals("HolyFuck")) {
                    n = 15;
                }
                break;
            }
            case -1531671539: {
                if (string.equals("HotShit")) {
                    n = 16;
                }
                break;
            }
            case 75336: {
                if (string.equals("Kfc")) {
                    n = 17;
                }
                break;
            }
            case -572581401: {
                if (string.equals("Sheldon")) {
                    n = 18;
                }
                break;
            }
            case 80009571: {
                if (string.equals("Smoky")) {
                    n = 19;
                }
                break;
            }
            case 2550147: {
                if (string.equals("SNOW")) {
                    n = 20;
                }
                break;
            }
            case -1793790217: {
                if (string.equals("Techno")) {
                    n = 21;
                }
                break;
            }
            case 2018617584: {
                if (string.equals("Circle")) {
                    n = 22;
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
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.enableDepth();
        GlStateManager.depthMask((boolean)true);
        GlStateManager.enableAlpha();
        class1591.Method241(renderWorldLastEvent.getPartialTicks());
        if (this.Field17761) {
            for (Class1697 class1697 : this.Field17764) {
                class1697.Method966();
            }
        }
        class1591.Method242();
        GlStateManager.disableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.disableDepth();
        GlStateManager.popAttrib();
        GlStateManager.popMatrix();
    }

    public Color Method7683() {
        Color color;
        if (this.Field17730.Method365()) {
            color = Class1172.Method4725(this.Field17731.Method335(), this.Field17732.Method368(), this.Field17733.Method368());
            return color;
        }
        color = new Color(this.Field17727.Method368(), this.Field17728.Method368(), this.Field17729.Method368());
        return color;
    }

    private void Method7684() {
        ArrayList<Entity> arrayList = new ArrayList<Entity>();
        Iterator iterator = Class2134.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(() -> this.Method7685(arrayList));
                return;
            }
            Entity entity = (Entity)iterator.next();
            if (!(entity != Class2134.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player && entity != vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderViewEntity() && (entity instanceof EntityPlayer && this.Field17714.Method365() || entity instanceof EntityPlayer && this.Field17715.Method365() && Class726.Field11086.Method3043(entity.getName()) || entity instanceof EntityEnderCrystal && this.Field17713.Method365() || (entity instanceof EntityMob || entity instanceof EntitySlime) && this.Field17716.Method365() || entity instanceof EntityEnderPearl && this.Field17718.Method365() || entity instanceof EntityItem && this.Field17719.Method365() || entity instanceof EntityAnimal && this.Field17717.Method365()))) continue;
            arrayList.add(entity);
        }
    }

    private ArrayList Method7685(ArrayList arrayList) throws Exception {
        this.Field17762 = arrayList;
        return this.Field17762;
    }

    private String Method7686() {
        return "[" + this.Field17710.Method359() + "]";
    }

    private Boolean Method7687() {
        boolean bl;
        if (!this.Field17710.Method309("OUTLINE") && !this.Field17710.Method309("InertiaOutline")) {
            bl = false;
            return bl;
        }
        bl = true;
        return bl;
    }

    private Boolean Method7688() {
        boolean bl;
        if (!this.Field17710.Method309("OUTLINE") && !this.Field17710.Method309("InertiaOutline")) {
            bl = false;
            return bl;
        }
        bl = true;
        return bl;
    }

    private Boolean Method7689() {
        boolean bl;
        if (!this.Field17710.Method309("OUTLINE") && !this.Field17710.Method309("InertiaOutline")) {
            bl = false;
            return bl;
        }
        bl = true;
        return bl;
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
        boolean bl;
        if (!(this.Field17710.Method309("ITEMGLOW") || this.Field17710.Method309("GLOW") || this.Field17710.Method309("Outline2"))) {
            bl = false;
            return bl;
        }
        bl = true;
        return bl;
    }

    private Boolean Method7699() {
        boolean bl;
        if (!(this.Field17710.Method309("ITEMGLOW") || this.Field17710.Method309("GLOW") || this.Field17710.Method309("OUTLINE") || this.Field17710.Method309("Outline2") || this.Field17710.Method309("InertiaOutline"))) {
            bl = false;
            return bl;
        }
        bl = true;
        return bl;
    }

    private Boolean Method7700() {
        boolean bl;
        if (!(this.Field17710.Method309("ITEMGLOW") || this.Field17710.Method309("GLOW") || this.Field17710.Method309("OUTLINE") || this.Field17710.Method309("Outline2") || this.Field17710.Method309("InertiaOutline"))) {
            bl = false;
            return bl;
        }
        bl = true;
        return bl;
    }

    private Boolean Method7701() {
        boolean bl;
        if (!(this.Field17710.Method309("ITEMGLOW") || this.Field17710.Method309("GLOW") || this.Field17710.Method309("OUTLINE") || this.Field17710.Method309("Outline2") || this.Field17710.Method309("InertiaOutline"))) {
            bl = false;
            return bl;
        }
        bl = true;
        return bl;
    }

    private Boolean Method7702() {
        return this.Field17710.Method309("ITEMGLOW");
    }

    private Boolean Method7703() {
        boolean bl;
        if (!this.Field17710.Method309("GRADIENT")) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    static {
        Field17763 = new HashMap();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 38;
            cArray2[n] = (char)(cArray[n] ^ (0x100C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

