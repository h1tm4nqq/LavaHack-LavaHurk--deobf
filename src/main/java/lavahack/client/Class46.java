//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.command.ICommand
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraftforge.client.ClientCommandHandler
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.common.config.Property
 *  net.minecraftforge.fml.client.config.GuiConfigEntries$NumberSliderEntry
 *  net.minecraftforge.fml.client.registry.ClientRegistry
 */
package lavahack.client;

import java.io.File;
import lavahack.client.Class1200;
import lavahack.client.Class1479;
import lavahack.client.Class153;
import lavahack.client.Class1531;
import lavahack.client.Class1583;
import lavahack.client.Class16;
import lavahack.client.Class1650;
import lavahack.client.Class2101;
import lavahack.client.Class244;
import lavahack.client.Class32;
import lavahack.client.Class373;
import lavahack.client.Class415;
import lavahack.client.Class430;
import lavahack.client.Class542;
import lavahack.client.Class686;
import lavahack.client.Class718;
import lavahack.client.Class864;
import lavahack.client.Class934;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.command.ICommand;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.config.GuiConfigEntries;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class Class46
extends Class1650 {
    public static boolean Field8117 = false;
    public static boolean Field8118 = false;
    public static final Class1531 Field8119 = new Class1531();
    public static EnumFacing Field8120 = null;
    public static int Field8121 = 0;
    public static Class1479 Field8122 = null;
    public static final Class16 Field8123 = new Class16();
    public static final Class16 Field8124 = new Class16();
    public static final Class16 Field8125 = new Class16();
    public static final Class16 Field8126 = new Class16();
    public static EnumFacing Field8127 = EnumFacing.UP;
    public static EnumFacing Field8128 = EnumFacing.UP;
    public static RayTraceResult Field8129 = null;
    private static final Minecraft Field8130 = Minecraft.getMinecraft();
    private String Field8131 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method421(EntityPlayer entityPlayer, float f) {
        Class46.Field8119.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = entityPlayer.lastTickPosX + (entityPlayer.posX - entityPlayer.lastTickPosX) * (double)f;
        Class46.Field8119.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = entityPlayer.lastTickPosY + (entityPlayer.posY - entityPlayer.lastTickPosY) * (double)f;
        Class46.Field8119.Field15157 = entityPlayer.lastTickPosZ + (entityPlayer.posZ - entityPlayer.lastTickPosZ) * (double)f;
        Field8120 = Class46.Method422(entityPlayer);
        Field8121 = MathHelper.floor((float)(entityPlayer.rotationYaw / Float.intBitsToFloat(1119092736))) & 3;
    }

    private static EnumFacing Method422(EntityPlayer entityPlayer) {
        if (entityPlayer.rotationPitch > Float.intBitsToFloat(1110704128)) {
            return EnumFacing.DOWN;
        }
        if (entityPlayer.rotationPitch < Float.intBitsToFloat(-1036779520)) {
            return EnumFacing.UP;
        }
        switch (MathHelper.floor((double)((double)entityPlayer.rotationYaw / Double.longBitsToDouble(4636033603912859648L) + Double.longBitsToDouble((long)1611648091 ^ 0x3FE00000600FCC5BL))) & 3) {
            case 0: {
                return EnumFacing.SOUTH;
            }
            case 1: {
                return EnumFacing.WEST;
            }
            case 2: {
                return EnumFacing.NORTH;
            }
            case 3: {
                return EnumFacing.EAST;
            }
        }
        return null;
    }

    public static void Method423() {
        Class46.Field8125.Field7895 = Math.min(Class46.Field8123.Field7895, Class46.Field8124.Field7895);
        Class46.Field8125.Field7896 = Math.min(Class46.Field8123.Field7896, Class46.Field8124.Field7896);
        Class46.Field8125.Field7897 = Math.min(Class46.Field8123.Field7897, Class46.Field8124.Field7897);
        Class46.Field8126.Field7895 = Math.max(Class46.Field8123.Field7895, Class46.Field8124.Field7895);
        Class46.Field8126.Field7896 = Math.max(Class46.Field8123.Field7896, Class46.Field8124.Field7896);
        Class46.Field8126.Field7897 = Math.max(Class46.Field8123.Field7897, Class46.Field8124.Field7897);
    }

    public static void Method424(Class16 class16) {
        class16.Field7895 = (int)Math.floor(Class46.Field8119.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        class16.Field7896 = (int)Math.floor(Class46.Field8119.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
        class16.Field7897 = (int)Math.floor(Class46.Field8119.Field15157);
        switch (Field8121) {
            case 0: {
                --class16.Field7895;
                ++class16.Field7897;
                return;
            }
            case 1: {
                --class16.Field7895;
                --class16.Field7897;
                return;
            }
            case 2: {
                ++class16.Field7895;
                --class16.Field7897;
                return;
            }
            case 3: {
                ++class16.Field7895;
                ++class16.Field7897;
                return;
            }
        }
    }

    public static void Method425(Class1479 class1479) {
        if (class1479 == null) return;
        Class16 class16 = class1479.Field14896;
        class16.Field7895 = (int)Math.floor(Class46.Field8119.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        class16.Field7896 = (int)Math.floor(Class46.Field8119.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
        class16.Field7897 = (int)Math.floor(Class46.Field8119.Field15157);
        switch (Field8121) {
            case 0: {
                class16.Field7895 -= class1479.getWidth();
                ++class16.Field7897;
                return;
            }
            case 1: {
                class16.Field7895 -= class1479.getWidth();
                class16.Field7897 -= class1479.getLength();
                return;
            }
            case 2: {
                ++class16.Field7895;
                class16.Field7897 -= class1479.getLength();
                return;
            }
            case 3: {
                ++class16.Field7895;
                ++class16.Field7897;
                return;
            }
        }
    }

    public void Method426() {
        Property[] propertyArray;
        for (Property property : propertyArray = new Property[]{Class32.Field8000, Class32.Field8003, Class32.Field8004, Class32.Field8005, Class32.Field8006, Class32.Field8007}) {
            property.setConfigEntryClass(GuiConfigEntries.NumberSliderEntry.class);
        }
        Property[] propertyArray2 = Class373.Field9573;
        int n = propertyArray2.length;
        int n2 = 0;
        while (n2 < n) {
            Property property;
            property = propertyArray2[n2];
            ClientRegistry.registerKeyBinding((KeyBinding)property);
            ++n2;
        }
    }

    public void Method427() {
        MinecraftForge.EVENT_BUS.register((Object)Class373.Field9563);
        MinecraftForge.EVENT_BUS.register((Object)Class1200.Field13444);
        MinecraftForge.EVENT_BUS.register((Object)Class1583.Field15411);
        MinecraftForge.EVENT_BUS.register((Object)Class32.Field7946);
        MinecraftForge.EVENT_BUS.register((Object)Class934.Field11944);
        MinecraftForge.EVENT_BUS.register((Object)Class718.Field11072);
        MinecraftForge.EVENT_BUS.register((Object)new Class430());
        MinecraftForge.EVENT_BUS.register((Object)new Class864());
        ClientCommandHandler.instance.registerCommand((ICommand)new Class244());
    }

    public void Method428() {
        this.Method413();
    }

    @Override
    public File Method411() {
        return Class2101.Field17562;
    }

    @Override
    public void Method413() {
        super.Method413();
        Class415.Field9718.Method2010(true);
        this.Method414();
        Field8117 = false;
        Field8119.Method5849(0.0, 0.0, 0.0);
        Field8120 = null;
        Field8121 = 0;
        Field8123.set(0, 0, 0);
        Field8124.set(0, 0, 0);
        Class46.Method423();
    }

    @Override
    public void Method414() {
        Field8122 = null;
        Class934.Field11944.setWorldAndLoadRenderers(null);
        Class415.Field9718.Method2016(null);
    }

    @Override
    public boolean Method417(EntityPlayer entityPlayer, File file, String string) {
        Class686 class686 = Class153.Method995(file, string);
        if (class686 == null) {
            return false;
        }
        Class1479 class1479 = new Class1479(class686);
        Class542.Field10314.debug("Loaded {} [w:{},h:{},l:{}]", (Object)string, (Object)class1479.getWidth(), (Object)class1479.getHeight(), (Object)class1479.getLength());
        Field8122 = class1479;
        Class934.Field11944.setWorldAndLoadRenderers(class1479);
        Class415.Field9718.Method2016(class1479);
        class1479.Field14897 = true;
        return true;
    }

    @Override
    public boolean Method418(EntityPlayer entityPlayer) {
        return false;
    }

    @Override
    public File Method419(EntityPlayer entityPlayer, boolean bl) {
        return Class32.Field7990;
    }

    private static String Method420(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 193;
            cArray2[n] = (char)(cArray[n] ^ (0x7FE6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

