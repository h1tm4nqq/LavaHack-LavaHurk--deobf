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
import lavahack.client.DO10dYPePXo8COr6afE85sGACRIzqf8t;
import lavahack.client.DXjKqX0c7P4em579SJwxKJk7QIiAoRBF;
import lavahack.client.EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN;
import lavahack.client.Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo;
import lavahack.client.IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE;
import lavahack.client.MWKsjf2F7eDKYSgsSUOF8imukA0mof8z;
import lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
import lavahack.client.XvN39av4tkzwhWc6dHuPGgyXQbelkudf;
import lavahack.client.YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo;
import lavahack.client.Z59nFS7fzGt9MllssMcgOsEYj1a2guaH;
import lavahack.client.dEdKj1GGWlTmBMQQGM8XCFWfALudsWCR;
import lavahack.client.icDexZAX7B0jjcrgitumPg8Krfyfplh8;
import lavahack.client.meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU;
import lavahack.client.p3VRxk9hbkZHFP0EfsVlgJwxBnCVRjan;
import lavahack.client.pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX;
import lavahack.client.wNt5Lffs2K7YrkGQCJYRWdtf5IM8bp2Z;
import lavahack.client.yofzte5ijoBKY7IhEkm8SEmmiINz1UMz;
import lavahack.client.z8ClnaMpLA5YZqxeNNf3PF4lWaFrcs6B;
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

public class sYSQwf2xD3nukbcGapT2KmEMESaueLHM
extends wNt5Lffs2K7YrkGQCJYRWdtf5IM8bp2Z {
    public static boolean Field8117 = (int)300509345L ^ 0x11E968A1;
    public static boolean Field8118 = (int)2081985973L ^ 0x7C1895B5;
    public static final DXjKqX0c7P4em579SJwxKJk7QIiAoRBF Field8119 = new DXjKqX0c7P4em579SJwxKJk7QIiAoRBF();
    public static EnumFacing Field8120 = null;
    public static int Field8121 = (int)-2040910071L ^ 0x865A2F09;
    public static OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 Field8122 = null;
    public static final EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN Field8123 = new EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN();
    public static final EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN Field8124 = new EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN();
    public static final EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN Field8125 = new EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN();
    public static final EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN Field8126 = new EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN();
    public static EnumFacing Field8127 = EnumFacing.UP;
    public static EnumFacing Field8128 = EnumFacing.UP;
    public static RayTraceResult Field8129 = null;
    private static final Minecraft Field8130 = Minecraft.getMinecraft();
    private String Field8131 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method421(EntityPlayer entityPlayer, float f) {
        sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8119.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = entityPlayer.lastTickPosX + (entityPlayer.posX - entityPlayer.lastTickPosX) * (double)f;
        sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8119.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = entityPlayer.lastTickPosY + (entityPlayer.posY - entityPlayer.lastTickPosY) * (double)f;
        sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8119.Field15157 = entityPlayer.lastTickPosZ + (entityPlayer.posZ - entityPlayer.lastTickPosZ) * (double)f;
        Field8120 = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Method422(entityPlayer);
        Field8121 = MathHelper.floor((float)(entityPlayer.rotationYaw / Float.intBitsToFloat(0x71BC593 ^ 0x45AFC593))) & ((int)-1875440587L ^ 0x90370C36);
    }

    private static EnumFacing Method422(EntityPlayer entityPlayer) {
        if (entityPlayer.rotationPitch > Float.intBitsToFloat((int)((long)463344951 ^ (long)1504318775))) {
            return EnumFacing.DOWN;
        }
        if (entityPlayer.rotationPitch < Float.intBitsToFloat((int)1483157189L ^ 0x9A532EC5)) {
            return EnumFacing.UP;
        }
        switch (MathHelper.floor((double)((double)entityPlayer.rotationYaw / Double.longBitsToDouble(0x8607C9D42413BFE1L ^ 0xC65149D42413BFE1L) + Double.longBitsToDouble((long)1611648091 ^ 0x3FE00000600FCC5BL))) & (int)((long)-1986109891 ^ (long)-1986109890)) {
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
        sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8125.Field7895 = Math.min(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8123.Field7895, sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8124.Field7895);
        sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8125.Field7896 = Math.min(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8123.Field7896, sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8124.Field7896);
        sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8125.Field7897 = Math.min(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8123.Field7897, sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8124.Field7897);
        sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8126.Field7895 = Math.max(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8123.Field7895, sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8124.Field7895);
        sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8126.Field7896 = Math.max(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8123.Field7896, sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8124.Field7896);
        sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8126.Field7897 = Math.max(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8123.Field7897, sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8124.Field7897);
    }

    public static void Method424(EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN) {
        eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7895 = (int)Math.floor(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8119.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7896 = (int)Math.floor(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8119.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
        eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7897 = (int)Math.floor(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8119.Field15157);
        switch (Field8121) {
            case 0: {
                eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7895 -= (int)((long)-850853726 ^ (long)-850853725);
                eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7897 += (int)1357320685L ^ 0x50E711EC;
                return;
            }
            case 1: {
                eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7895 -= (int)430972348L ^ 0x19B01DBD;
                eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7897 -= (int)((long)-1908079690 ^ (long)-1908079689);
                return;
            }
            case 2: {
                eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7895 += (int)-10902877L ^ 0xFF59A2A2;
                eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7897 -= (int)((long)-1665090972 ^ (long)-1665090971);
                return;
            }
            case 3: {
                eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7895 += (int)-598155167L ^ 0xDC58E060;
                eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7897 += (int)-1750231765L ^ 0x97AD952A;
                return;
            }
        }
    }

    public static void Method425(OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3) {
        if (oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 == null) return;
        EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN = oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14896;
        eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7895 = (int)Math.floor(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8119.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7896 = (int)Math.floor(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8119.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
        eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7897 = (int)Math.floor(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8119.Field15157);
        switch (Field8121) {
            case 0: {
                eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7895 -= oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getWidth();
                eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7897 += (int)((long)-814151840 ^ (long)-814151839);
                return;
            }
            case 1: {
                eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7895 -= oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getWidth();
                eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7897 -= oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getLength();
                return;
            }
            case 2: {
                eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7895 += (int)((long)2131836599 ^ (long)2131836598);
                eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7897 -= oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getLength();
                return;
            }
            case 3: {
                eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7895 += (int)((long)-788094113 ^ (long)-788094114);
                eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.Field7897 += (int)((long)-1504919609 ^ (long)-1504919610);
                return;
            }
        }
    }

    public void Method426() {
        Property property;
        int n;
        Property[] propertyArray;
        Property[] propertyArray2 = new Property[(int)((long)-2110211600 ^ (long)-2110211597) << 1];
        propertyArray2[(int)-1686410995L ^ 0x9B7B690D] = Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field8000;
        propertyArray2[(int)236319381L ^ 0xE15F294] = Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field8003;
        propertyArray2[((int)273267274L ^ 0x1049BA4B) << 1] = Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field8004;
        propertyArray2[(int)((long)-142525336 ^ (long)-142525333)] = Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field8005;
        propertyArray2[(int)((long)-978255870 ^ (long)-978255869) << 2] = Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field8006;
        propertyArray2[(int)-1413663040L ^ 0xABBD36C5] = Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field8007;
        Property[] propertyArray3 = propertyArray = propertyArray2;
        int n2 = propertyArray3.length;
        for (n = (int)((long)-1240976446 ^ (long)-1240976446); n < n2; ++n) {
            property = propertyArray3[n];
            property.setConfigEntryClass(GuiConfigEntries.NumberSliderEntry.class);
        }
        propertyArray3 = p3VRxk9hbkZHFP0EfsVlgJwxBnCVRjan.Field9573;
        n2 = propertyArray3.length;
        n = (int)((long)-663956035 ^ (long)-663956035);
        while (n < n2) {
            property = propertyArray3[n];
            ClientRegistry.registerKeyBinding((KeyBinding)property);
            ++n;
        }
    }

    public void Method427() {
        MinecraftForge.EVENT_BUS.register((Object)p3VRxk9hbkZHFP0EfsVlgJwxBnCVRjan.Field9563);
        MinecraftForge.EVENT_BUS.register((Object)yofzte5ijoBKY7IhEkm8SEmmiINz1UMz.Field13444);
        MinecraftForge.EVENT_BUS.register((Object)z8ClnaMpLA5YZqxeNNf3PF4lWaFrcs6B.Field15411);
        MinecraftForge.EVENT_BUS.register((Object)Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7946);
        MinecraftForge.EVENT_BUS.register((Object)YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11944);
        MinecraftForge.EVENT_BUS.register((Object)icDexZAX7B0jjcrgitumPg8Krfyfplh8.Field11072);
        MinecraftForge.EVENT_BUS.register((Object)new DO10dYPePXo8COr6afE85sGACRIzqf8t());
        MinecraftForge.EVENT_BUS.register((Object)new XvN39av4tkzwhWc6dHuPGgyXQbelkudf());
        ClientCommandHandler.instance.registerCommand((ICommand)new dEdKj1GGWlTmBMQQGM8XCFWfALudsWCR());
    }

    public void Method428() {
        this.Method413();
    }

    @Override
    public File Method411() {
        return Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo.Field17562;
    }

    @Override
    public void Method413() {
        super.Method413();
        IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE.Field9718.Method2010(((int)-931900078L ^ 0xC8745553) != 0);
        this.Method414();
        Field8117 = (int)-1007281070L ^ 0xC3F61C52;
        Field8119.Method5849(0.0, 0.0, 0.0);
        Field8120 = null;
        Field8121 = (int)((long)-2001910850 ^ (long)-2001910850);
        Field8123.set((int)-1629447662L ^ 0x9EE09A12, (int)228714578L ^ 0xDA1E852, (int)-1714112958L ^ 0x99D4B642);
        Field8124.set((int)((long)-733686290 ^ (long)-733686290), (int)1627611325L ^ 0x610360BD, (int)((long)-726658093 ^ (long)-726658093));
        sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Method423();
    }

    @Override
    public void Method414() {
        Field8122 = null;
        YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11944.setWorldAndLoadRenderers(null);
        IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE.Field9718.Method2016(null);
    }

    @Override
    public boolean Method417(EntityPlayer entityPlayer, File file, String string) {
        meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2 = MWKsjf2F7eDKYSgsSUOF8imukA0mof8z.Method995(file, string);
        if (meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2 == null) {
            return (int)((long)686958796 ^ (long)686958796) != 0;
        }
        OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 = new OP4La13R7rceTBm7QSP7XXXyRxZD1Op3(meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2);
        pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.debug("Loaded {} [w:{},h:{},l:{}]", (Object)string, (Object)oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getWidth(), (Object)oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getHeight(), (Object)oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getLength());
        Field8122 = oP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
        YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11944.setWorldAndLoadRenderers(oP4La13R7rceTBm7QSP7XXXyRxZD1Op3);
        IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE.Field9718.Method2016(oP4La13R7rceTBm7QSP7XXXyRxZD1Op3);
        oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14897 = (int)-1538077893L ^ 0xA452CB3A;
        return (int)((long)204886022 ^ (long)204886023) != 0;
    }

    @Override
    public boolean Method418(EntityPlayer entityPlayer) {
        return ((int)1891218187L ^ 0x70B9B30B) != 0;
    }

    @Override
    public File Method419(EntityPlayer entityPlayer, boolean bl) {
        return Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7990;
    }

    private static String Method420(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-993867512 ^ (long)-993867512);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-496472617L ^ 0xE2686D28);
            int n2 = (int)-1248372155L ^ 0xB5975A84;
            cArray2[n] = (char)(cArray[n] ^ (((int)-883601259L ^ 0xCB556F66) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

