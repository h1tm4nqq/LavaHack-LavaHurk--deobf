/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.EventPriority
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import lavahack.client.Class1092;
import lavahack.client.Class1126;
import lavahack.client.Class1178;
import lavahack.client.Class1249;
import lavahack.client.Class132;
import lavahack.client.Class1416;
import lavahack.client.Class1796;
import lavahack.client.Class418;
import lavahack.client.Class42;
import lavahack.client.Class44;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class1052
extends Class1249 {
    private final Class44 Field12663 = this.Method23(new Class44("Offsets", (Class42)this, Double.longBitsToDouble((long)1300353439 ^ 0x400000004D81D19FL), 0.0, Double.longBitsToDouble((long)787481203 ^ 0x402400002EF00273L), true));
    private int Field12664;

    public Class1052() {
        super("PvpInfo", "PvpInfo", true);
    }

    @SubscribeEvent(priority=EventPriority.HIGHEST)
    @SubscribeEvent(priority=EventPriority.HIGHEST)
    public void Method4293(RenderGameOverlayEvent.Text text) {
        int n = (int)this.Method268();
        int n2 = this.Field12663.Method335() + Class1178.Method4748();
        int n3 = 0;
        this.Method273(Class1178.Method4741("SURRr: OFF"));
        Class1178.Method4745(TextFormatting.GRAY + "ReR: " + (Class1416.Field14544.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG ? TextFormatting.GREEN + "ON" : TextFormatting.RED + "OFF"), this.Method267(), n, -1);
        Class1178.Method4745(TextFormatting.GRAY + "KAr: " + (Class1796.Field16241.Field16254.Method1162((String)"KillAuraRewrite").Field8061 ? TextFormatting.GREEN + "ON" : TextFormatting.RED + "OFF"), this.Method267(), ++n3 * n2 + n, -1);
        Class1178.Method4745(TextFormatting.GRAY + "FA: " + (Class418.Field9733.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG ? TextFormatting.GREEN + "ON" : TextFormatting.RED + "OFF"), this.Method267(), ++n3 * n2 + n, -1);
        Class1178.Method4745(TextFormatting.GRAY + "OFF: " + (Class1796.Field16241.Field16254.Method1162((String)"OffHand").Field8061 ? TextFormatting.GREEN + "ON" : TextFormatting.RED + "OFF"), this.Method267(), ++n3 * n2 + n, -1);
        Class1178.Method4745(TextFormatting.GRAY + "Hr: " + (Class1796.Field16241.Field16254.Method1162((String)"HandRewrite").Field8061 ? TextFormatting.GREEN + "ON" : TextFormatting.RED + "OFF"), this.Method267(), ++n3 * n2 + n, -1);
        Class1178.Method4745(TextFormatting.GRAY + "SURRr: " + (Class1796.Field16241.Field16254.Method1162((String)"SurroundRewrite").Field8061 ? TextFormatting.GREEN + "ON" : TextFormatting.RED + "OFF"), this.Method267(), ++n3 * n2 + n, -1);
        Class1178.Method4745(TextFormatting.GRAY + "AT: " + (Class1092.Field12889.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG ? TextFormatting.GREEN + "ON" : TextFormatting.RED + "OFF"), this.Method267(), ++n3 * n2 + n, -1);
        Class1178.Method4745(TextFormatting.GRAY + "HFr: " + (null.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG ? TextFormatting.GREEN + "ON" : TextFormatting.RED + "OFF"), this.Method267(), ++n3 * n2 + n, -1);
        Class1178.Method4745(TextFormatting.GRAY + "FLTNr: " + (Class132.Field8485.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG ? TextFormatting.GREEN + "ON" : TextFormatting.RED + "OFF"), this.Method267(), ++n3 * n2 + n, -1);
        Class1178.Method4745(TextFormatting.GRAY + "CF: " + (null.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG ? TextFormatting.GREEN + "ON" : TextFormatting.RED + "OFF"), this.Method267(), ++n3 * n2 + n, -1);
        Class1178.Method4745(TextFormatting.GRAY + "Speed: " + (Class1126.Field13077.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG ? TextFormatting.GREEN + "ON" : TextFormatting.RED + "OFF"), this.Method267(), ++n3 * n2 + n, -1);
        this.Method274(++n3 * n2);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 135;
            cArray2[n] = (char)(cArray[n] ^ (0xFE2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

