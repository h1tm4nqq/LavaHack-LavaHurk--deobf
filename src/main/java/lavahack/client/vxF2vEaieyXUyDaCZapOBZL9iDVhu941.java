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

import lavahack.client.CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL;
import lavahack.client.J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class vxF2vEaieyXUyDaCZapOBZL9iDVhu941
extends qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12663 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Offsets", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1300353439 ^ 0x400000004D81D19FL), 0.0, Double.longBitsToDouble((long)787481203 ^ 0x402400002EF00273L), ((int)-1740536202L ^ 0x98418677) != 0));
    private int Field12664;

    public vxF2vEaieyXUyDaCZapOBZL9iDVhu941() {
        super("PvpInfo", "PvpInfo", ((int)67737852L ^ 0x40998FD) != 0);
    }

    @SubscribeEvent(priority=EventPriority.HIGHEST)
    @SubscribeEvent(priority=EventPriority.HIGHEST)
    public void Method4293(RenderGameOverlayEvent.Text text) {
        int n = (int)this.Method268();
        int n2 = this.Field12663.Method335() + fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748();
        int n3 = (int)((long)1562416058 ^ (long)1562416058);
        this.Method273(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741("SURRr: OFF"));
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(TextFormatting.GRAY + "ReR: " + (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14544.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG ? TextFormatting.GREEN + "ON" : TextFormatting.RED + "OFF"), this.Method267(), n, (int)((long)809643155 ^ (long)-809643156));
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(TextFormatting.GRAY + "KAr: " + (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162((String)"KillAuraRewrite").Field8061 ? TextFormatting.GREEN + "ON" : TextFormatting.RED + "OFF"), this.Method267(), ++n3 * n2 + n, (int)-554793634L ^ 0x21117AA1);
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(TextFormatting.GRAY + "FA: " + (J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs.Field9733.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG ? TextFormatting.GREEN + "ON" : TextFormatting.RED + "OFF"), this.Method267(), ++n3 * n2 + n, (int)-1242530221L ^ 0x4A0F81AC);
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(TextFormatting.GRAY + "OFF: " + (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162((String)"OffHand").Field8061 ? TextFormatting.GREEN + "ON" : TextFormatting.RED + "OFF"), this.Method267(), ++n3 * n2 + n, (int)-120996755L ^ 0x7364392);
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(TextFormatting.GRAY + "Hr: " + (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162((String)"HandRewrite").Field8061 ? TextFormatting.GREEN + "ON" : TextFormatting.RED + "OFF"), this.Method267(), ++n3 * n2 + n, (int)127724904L ^ 0xF8631297);
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(TextFormatting.GRAY + "SURRr: " + (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162((String)"SurroundRewrite").Field8061 ? TextFormatting.GREEN + "ON" : TextFormatting.RED + "OFF"), this.Method267(), ++n3 * n2 + n, (int)988094207L ^ 0xC51AE100);
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(TextFormatting.GRAY + "AT: " + (CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.Field12889.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG ? TextFormatting.GREEN + "ON" : TextFormatting.RED + "OFF"), this.Method267(), ++n3 * n2 + n, (int)-150755644L ^ 0x8FC593B);
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(TextFormatting.GRAY + "HFr: " + (null.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG ? TextFormatting.GREEN + "ON" : TextFormatting.RED + "OFF"), this.Method267(), ++n3 * n2 + n, (int)-1450597775L ^ 0x56765D8E);
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(TextFormatting.GRAY + "FLTNr: " + (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Field8485.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG ? TextFormatting.GREEN + "ON" : TextFormatting.RED + "OFF"), this.Method267(), ++n3 * n2 + n, (int)1048354912L ^ 0xC1835F9F);
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(TextFormatting.GRAY + "CF: " + (null.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG ? TextFormatting.GREEN + "ON" : TextFormatting.RED + "OFF"), this.Method267(), ++n3 * n2 + n, (int)((long)-70844555 ^ (long)70844554));
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(TextFormatting.GRAY + "Speed: " + (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.Field13077.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG ? TextFormatting.GREEN + "ON" : TextFormatting.RED + "OFF"), this.Method267(), ++n3 * n2 + n, (int)((long)-1613137614 ^ (long)1613137613));
        this.Method274(++n3 * n2);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)234927675L ^ 0xE00B63B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-159010138L ^ 0xF685B259);
            int n2 = (int)624846756L ^ 0x253E6723;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1518153123 ^ (long)1518152274) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

