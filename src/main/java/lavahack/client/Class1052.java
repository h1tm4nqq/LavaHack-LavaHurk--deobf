//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import net.minecraft.util.text.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class1052 extends Class1249
{
    private final Class44 Field12663;
    private int Field12664;
    
    public Class1052() {
        super("PvpInfo", "PvpInfo", true);
        this.Field12663 = this.Method23(new Class44("Offsets", this, Double.longBitsToDouble((long)1300353439 ^ 0x400000004D81D19FL), 0.0, Double.longBitsToDouble((long)787481203 ^ 0x402400002EF00273L), true));
    }
    
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void Method4293(final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        final int n = (int)this.Method268();
        final int n2 = this.Field12663.Method335() + Class1178.Method4748();
        int n3 = 0;
        this.Method273(Class1178.Method4741("SURRr: OFF"));
        Class1178.Method4745(TextFormatting.GRAY + "ReR: " + (Class1416.Field14544.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG ? (TextFormatting.GREEN + "ON") : (TextFormatting.RED + "OFF")), this.Method267(), n, -1);
        ++n3;
        Class1178.Method4745(TextFormatting.GRAY + "KAr: " + (Class1796.Field16241.Field16254.Method1162("KillAuraRewrite").Field8061 ? (TextFormatting.GREEN + "ON") : (TextFormatting.RED + "OFF")), this.Method267(), n3 * n2 + n, -1);
        ++n3;
        Class1178.Method4745(TextFormatting.GRAY + "FA: " + (Class418.Field9733.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG ? (TextFormatting.GREEN + "ON") : (TextFormatting.RED + "OFF")), this.Method267(), n3 * n2 + n, -1);
        ++n3;
        Class1178.Method4745(TextFormatting.GRAY + "OFF: " + (Class1796.Field16241.Field16254.Method1162("OffHand").Field8061 ? (TextFormatting.GREEN + "ON") : (TextFormatting.RED + "OFF")), this.Method267(), n3 * n2 + n, -1);
        ++n3;
        Class1178.Method4745(TextFormatting.GRAY + "Hr: " + (Class1796.Field16241.Field16254.Method1162("HandRewrite").Field8061 ? (TextFormatting.GREEN + "ON") : (TextFormatting.RED + "OFF")), this.Method267(), n3 * n2 + n, -1);
        ++n3;
        Class1178.Method4745(TextFormatting.GRAY + "SURRr: " + (Class1796.Field16241.Field16254.Method1162("SurroundRewrite").Field8061 ? (TextFormatting.GREEN + "ON") : (TextFormatting.RED + "OFF")), this.Method267(), n3 * n2 + n, -1);
        ++n3;
        Class1178.Method4745(TextFormatting.GRAY + "AT: " + (Class1092.Field12889.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG ? (TextFormatting.GREEN + "ON") : (TextFormatting.RED + "OFF")), this.Method267(), n3 * n2 + n, -1);
        ++n3;
        Class1178.Method4745(TextFormatting.GRAY + "HFr: " + (null.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG ? (TextFormatting.GREEN + "ON") : (TextFormatting.RED + "OFF")), this.Method267(), n3 * n2 + n, -1);
        ++n3;
        Class1178.Method4745(TextFormatting.GRAY + "FLTNr: " + (Class132.Field8485.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG ? (TextFormatting.GREEN + "ON") : (TextFormatting.RED + "OFF")), this.Method267(), n3 * n2 + n, -1);
        ++n3;
        Class1178.Method4745(TextFormatting.GRAY + "CF: " + (null.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG ? (TextFormatting.GREEN + "ON") : (TextFormatting.RED + "OFF")), this.Method267(), n3 * n2 + n, -1);
        ++n3;
        Class1178.Method4745(TextFormatting.GRAY + "Speed: " + (Class1126.Field13077.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG ? (TextFormatting.GREEN + "ON") : (TextFormatting.RED + "OFF")), this.Method267(), n3 * n2 + n, -1);
        ++n3;
        this.Method274(n3 * n2);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xFE2 ^ 0x87));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
