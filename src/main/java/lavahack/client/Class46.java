//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.*;
import net.minecraft.client.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.math.*;
import net.minecraftforge.common.config.*;
import net.minecraftforge.fml.client.config.*;
import net.minecraftforge.fml.client.registry.*;
import net.minecraft.client.settings.*;
import net.minecraftforge.common.*;
import net.minecraftforge.client.*;
import net.minecraft.command.*;
import java.io.*;

public class Class46 extends Class1650
{
    public static boolean Field8117;
    public static boolean Field8118;
    public static final Class1531 Field8119;
    public static EnumFacing Field8120;
    public static int Field8121;
    public static Class1479 Field8122;
    public static final Class16 Field8123;
    public static final Class16 Field8124;
    public static final Class16 Field8125;
    public static final Class16 Field8126;
    public static EnumFacing Field8127;
    public static EnumFacing Field8128;
    public static RayTraceResult Field8129;
    private static final Minecraft Field8130;
    private String Field8131 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static void Method421(final EntityPlayer entityPlayer, final float n) {
        Class46.Field8119.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = entityPlayer.lastTickPosX + (entityPlayer.posX - entityPlayer.lastTickPosX) * n;
        Class46.Field8119.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = entityPlayer.lastTickPosY + (entityPlayer.posY - entityPlayer.lastTickPosY) * n;
        Class46.Field8119.Field15157 = entityPlayer.lastTickPosZ + (entityPlayer.posZ - entityPlayer.lastTickPosZ) * n;
        Class46.Field8120 = Method422(entityPlayer);
        Class46.Field8121 = (MathHelper.floor(entityPlayer.rotationYaw / Float.intBitsToFloat(1119092736)) & 0x3);
    }
    
    private static EnumFacing Method422(final EntityPlayer entityPlayer) {
        if (entityPlayer.rotationPitch > Float.intBitsToFloat(1110704128)) {
            return EnumFacing.DOWN;
        }
        if (entityPlayer.rotationPitch < Float.intBitsToFloat(-1036779520)) {
            return EnumFacing.UP;
        }
        switch (MathHelper.floor(entityPlayer.rotationYaw / Double.longBitsToDouble(4636033603912859648L) + Double.longBitsToDouble((long)1611648091 ^ 0x3FE00000600FCC5BL)) & 0x3) {
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
            default: {
                return null;
            }
        }
    }
    
    public static void Method423() {
        Class46.Field8125.Field7895 = Math.min(Class46.Field8123.Field7895, Class46.Field8124.Field7895);
        Class46.Field8125.Field7896 = Math.min(Class46.Field8123.Field7896, Class46.Field8124.Field7896);
        Class46.Field8125.Field7897 = Math.min(Class46.Field8123.Field7897, Class46.Field8124.Field7897);
        Class46.Field8126.Field7895 = Math.max(Class46.Field8123.Field7895, Class46.Field8124.Field7895);
        Class46.Field8126.Field7896 = Math.max(Class46.Field8123.Field7896, Class46.Field8124.Field7896);
        Class46.Field8126.Field7897 = Math.max(Class46.Field8123.Field7897, Class46.Field8124.Field7897);
    }
    
    public static void Method424(final Class16 class16) {
        class16.Field7895 = (int)Math.floor(Class46.Field8119.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        class16.Field7896 = (int)Math.floor(Class46.Field8119.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
        class16.Field7897 = (int)Math.floor(Class46.Field8119.Field15157);
        switch (Class46.Field8121) {
            case 0: {
                --class16.Field7895;
                ++class16.Field7897;
                break;
            }
            case 1: {
                --class16.Field7895;
                --class16.Field7897;
                break;
            }
            case 2: {
                ++class16.Field7895;
                --class16.Field7897;
                break;
            }
            case 3: {
                ++class16.Field7895;
                ++class16.Field7897;
                break;
            }
        }
    }
    
    public static void Method425(final Class1479 class1479) {
        if (class1479 != null) {
            final Class16 field14896 = class1479.Field14896;
            field14896.Field7895 = (int)Math.floor(Class46.Field8119.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
            field14896.Field7896 = (int)Math.floor(Class46.Field8119.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
            field14896.Field7897 = (int)Math.floor(Class46.Field8119.Field15157);
            switch (Class46.Field8121) {
                case 0: {
                    final Class16 class1480 = field14896;
                    class1480.Field7895 -= class1479.getWidth();
                    final Class16 class1481 = field14896;
                    ++class1481.Field7897;
                    break;
                }
                case 1: {
                    final Class16 class1482 = field14896;
                    class1482.Field7895 -= class1479.getWidth();
                    final Class16 class1483 = field14896;
                    class1483.Field7897 -= class1479.getLength();
                    break;
                }
                case 2: {
                    final Class16 class1484 = field14896;
                    ++class1484.Field7895;
                    final Class16 class1485 = field14896;
                    class1485.Field7897 -= class1479.getLength();
                    break;
                }
                case 3: {
                    final Class16 class1486 = field14896;
                    ++class1486.Field7895;
                    final Class16 class1487 = field14896;
                    ++class1487.Field7897;
                    break;
                }
            }
        }
    }
    
    public void Method426() {
        final Property[] array = { Class32.Field8000, Class32.Field8003, Class32.Field8004, Class32.Field8005, Class32.Field8006, Class32.Field8007 };
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].setConfigEntryClass((Class)GuiConfigEntries$NumberSliderEntry.class);
        }
        final KeyBinding[] field9573 = Class373.Field9573;
        for (int length2 = field9573.length, j = 0; j < length2; ++j) {
            ClientRegistry.registerKeyBinding(field9573[j]);
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
    
    public File Method411() {
        return Class2101.Field17562;
    }
    
    public void Method413() {
        super.Method413();
        Class415.Field9718.Method2010(true);
        this.Method414();
        Class46.Field8117 = false;
        Class46.Field8119.Method5849(0.0, 0.0, 0.0);
        Class46.Field8120 = null;
        Class46.Field8121 = 0;
        Class46.Field8123.set(0, 0, 0);
        Class46.Field8124.set(0, 0, 0);
        Method423();
    }
    
    public void Method414() {
        Class46.Field8122 = null;
        Class934.Field11944.setWorldAndLoadRenderers(null);
        Class415.Field9718.Method2016((Class1479)null);
    }
    
    public boolean Method417(final EntityPlayer entityPlayer, final File file, final String s) {
        final Class686 method995 = Class153.Method995(file, s);
        if (method995 == null) {
            return false;
        }
        final Class1479 class1479 = new Class1479(method995);
        Class542.Field10314.debug("Loaded {} [w:{},h:{},l:{}]", (Object)s, (Object)class1479.getWidth(), (Object)class1479.getHeight(), (Object)class1479.getLength());
        Class46.Field8122 = class1479;
        Class934.Field11944.setWorldAndLoadRenderers(class1479);
        Class415.Field9718.Method2016(class1479);
        return class1479.Field14897 = true;
    }
    
    public boolean Method418(final EntityPlayer entityPlayer) {
        return false;
    }
    
    public File Method419(final EntityPlayer entityPlayer, final boolean b) {
        return Class32.Field7990;
    }
    
    static {
        Class46.Field8117 = false;
        Class46.Field8118 = false;
        Field8119 = new Class1531();
        Class46.Field8120 = null;
        Class46.Field8121 = 0;
        Class46.Field8122 = null;
        Field8123 = new Class16();
        Field8124 = new Class16();
        Field8125 = new Class16();
        Field8126 = new Class16();
        Class46.Field8127 = EnumFacing.UP;
        Class46.Field8128 = EnumFacing.UP;
        Class46.Field8129 = null;
        Field8130 = Minecraft.getMinecraft();
    }
    
    private static String Method420(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7FE6 ^ 0xC1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
