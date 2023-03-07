//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.EnumFacing
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ebo6SwpqlFaMWQSxSIe1rjAqn3vAk3rA
extends qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 {
    private int Field14649 = (int)-1890762916L ^ 0x8F4D3F5C;
    private int Field14650 = (int)-1819853904L ^ 0x93873BB0;
    private final String[] Field14651;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14652;
    private int Field14653;

    public ebo6SwpqlFaMWQSxSIe1rjAqn3vAk3rA() {
        super("Radar", ((int)274633233L ^ 0x105E9210) != 0);
        String[] stringArray = new String[(int)((long)355988620 ^ (long)355988621) << 2];
        stringArray[(int)((long)1433807149 ^ (long)1433807149)] = "X+";
        stringArray[(int)((long)59627065 ^ (long)59627064)] = "Z+";
        stringArray[(int)((long)-2047423631 ^ (long)-2047423632) << 1] = "X-";
        stringArray[(int)1637738603L ^ 0x619DE868] = "Z-";
        this.Field14651 = stringArray;
        this.Field14652 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Astolfo", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)52758165 ^ (long)52758164)));
        this.Method271(0.0);
        this.Method272(0.0);
        this.Method273(Double.longBitsToDouble((long)1685524638 ^ 0x4062C0006477109EL));
        this.Method274(Double.longBitsToDouble((long)1937841724 ^ 0x4062C00073811E3CL));
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method5707(RenderGameOverlayEvent.Text text) {
        this.Field14649 = (int)this.Method267();
        this.Field14650 = (int)this.Method268();
        int n = this.Field14652.Method365() ? zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)-1652867904 ^ (long)-1652867879) << 2, (int)((long)1255266702 ^ (long)1255266711) << 2) : (int)-1656307796L ^ 0x62B94053;
        Gui.drawRect((int)this.Field14649, (int)this.Field14650, (int)(((int)((long)-1772304200 ^ (long)-1772304141) << 1) + this.Field14649), (int)((((int)1004667539L ^ 0x3BE202D8) << 1) + this.Field14650), (int)new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)1829393085 ^ (long)1829393054) << 1, ((int)1857169387L ^ 0x6EB227C8) << 1, ((int)1142880342L ^ 0x441EF875) << 1, ((int)788677067L ^ 0x2F024180) << 1).Method3626());
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(Double.longBitsToDouble(0xA784F0E48B8A3C9CL ^ 0xE7D650E48B8A3C9CL) + (double)this.Field14649, ((int)494790584L ^ 0x1D7DE7BB) + fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + this.Field14650, Double.longBitsToDouble((long)1449472759 ^ 0x4052E000566532F7L) + (double)this.Field14649, (int)((long)130863032 ^ (long)130862891) - fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + this.Field14650, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(((int)-2018352489L ^ 0x87B2628E) << 1, ((int)-2137417713L ^ 0x80999816) << 1, ((int)-189919186L ^ 0xF4AE1037) << 1, (int)1952255142L ^ 0x745D0C03).Method3626());
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect((int)((long)1632172164 ^ (long)1632172167) + fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(this.Field14651[(int)-120569474L ^ 0xF8D0417D]) + this.Field14649, Double.longBitsToDouble((long)1248882281 ^ 0x4052A0004A706E69L) + (double)this.Field14650, ((int)-1406936255L ^ 0xAC23DBD2) - fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(this.Field14651[(int)((long)1958382617 ^ (long)1958382616)]) + this.Field14649, Double.longBitsToDouble(0x1B70FED65454657DL ^ 0x5B221ED65454657DL) + (double)this.Field14650, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)-838369379 ^ (long)-838369404) << 1, (int)((long)-1744126778 ^ (long)-1744126753) << 1, ((int)730793004L ^ 0x2B8F0435) << 1, (int)493124007L ^ 0x1D647902).Method3626());
        for (Entity entity : ebo6SwpqlFaMWQSxSIe1rjAqn3vAk3rA.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.world.loadedEntityList) {
            if (!(entity instanceof EntityPlayer) || entity == ebo6SwpqlFaMWQSxSIe1rjAqn3vAk3rA.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player) continue;
            this.Method5709(entity);
        }
        boolean bl = this.Method5708(EnumFacing.NORTH);
        boolean bl2 = this.Method5708(EnumFacing.SOUTH);
        boolean bl3 = this.Method5708(EnumFacing.EAST);
        boolean bl4 = this.Method5708(EnumFacing.WEST);
        if (bl) {
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(Double.longBitsToDouble(0x4904CBB6C1639D76L ^ 0x955EBB6C1639D76L) + (double)this.Field14649, Double.longBitsToDouble(0xED453566308EAE7DL ^ 0xAD179566308EAE7DL) + (double)this.Field14650, Double.longBitsToDouble((long)770563086 ^ 0x4052A0002DEDDC0EL) + (double)this.Field14649, Double.longBitsToDouble((long)790416987 ^ 0x4052E0002F1CCE5BL) + (double)this.Field14650, n);
        } else if (bl2) {
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(Double.longBitsToDouble((long)1918459598 ^ 0x4052E00072595ECEL) + (double)this.Field14649, Double.longBitsToDouble(0x42EA0110CB1DDF61L ^ 0x2B8A110CB1DDF61L) + (double)this.Field14650, Double.longBitsToDouble((long)800692554 ^ 0x405460002FB9994AL) + (double)this.Field14649, Double.longBitsToDouble(0x626D18418C2B5FA3L ^ 0x223FB8418C2B5FA3L) + (double)this.Field14650, n);
        } else if (bl3) {
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(Double.longBitsToDouble((long)409366241 ^ 0x4052A00018666EE1L) + (double)this.Field14649, Double.longBitsToDouble(0x7A932CF2FCFCD072L ^ 0x3AC20CF2FCFCD072L) + (double)this.Field14650, Double.longBitsToDouble((long)487827045 ^ 0x4052E0001D13A665L) + (double)this.Field14649, Double.longBitsToDouble(0x7DED27F4C8B5B0C5L ^ 0x3DBF87F4C8B5B0C5L) + (double)this.Field14650, n);
        } else if (bl4) {
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(Double.longBitsToDouble((long)1486594403 ^ 0x4052A000589BA163L) + (double)this.Field14649, Double.longBitsToDouble(0x54B8B13D7519D388L ^ 0x14EA513D7519D388L) + (double)this.Field14650, Double.longBitsToDouble((long)1477416054 ^ 0x4052E000580F9476L) + (double)this.Field14649, Double.longBitsToDouble(0xE0B1217A609AA165L ^ 0xA0E5417A609AA165L) + (double)this.Field14650, n);
        }
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(this.Field14651[(int)((long)-1464841933 ^ (long)-1464841933)], (int)((long)53536879 ^ (long)53536804) - fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(this.Field14651[(int)((long)-1809328036 ^ (long)-1809328036)]) / (((int)-1502168240L ^ 0xA676BB51) << 1) + this.Field14649, (((int)-105185186L ^ 0xF9BB005F) << 1) + this.Field14650, n);
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(this.Field14651[((int)-22512356L ^ 0xFEA87D1D) << 1], ((int)-1915050509L ^ 0x8DDAA5B8) - fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(this.Field14651[((int)-2121583584L ^ 0x818B3421) << 1]) / (((int)597996116L ^ 0x23A4B255) << 1) + this.Field14649, ((int)((long)-795481791 ^ (long)-795481756) << 2) - fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + this.Field14650, n);
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(this.Field14651[(int)((long)319749585 ^ (long)319749584)], (((int)753053527L ^ 0x2CE2AF56) << 1) + this.Field14649, ((int)-2113126250L ^ 0x820C40DD) - fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() / ((int)((long)196432428 ^ (long)196432429) << 1) + this.Field14650, n);
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(this.Field14651[(int)-1059954185L ^ 0xC0D261F4], ((int)((long)-1910827868 ^ (long)-1910827903) << 2) - fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(this.Field14651[(int)((long)1897784886 ^ (long)1897784885)]) + this.Field14649, (int)((long)1877186344 ^ (long)1877186403) - fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() / (((int)-745768213L ^ 0xD38C7AEA) << 1) + this.Field14650, n);
        this.Method5710(this.Field14649, this.Field14650, (int)((long)74469648 ^ (long)74469649) + this.Field14649, ((int)((long)662775626 ^ (long)662775553) << 1) + this.Field14650, n);
        this.Method5710(this.Field14649, this.Field14650, ((int)((long)1173369525 ^ (long)1173369598) << 1) + this.Field14649, ((int)439219846L ^ 0x1A2DF687) + this.Field14650, n);
        this.Method5710(((int)218772287L ^ 0xD0A33AA) + this.Field14649, this.Field14650, ((int)((long)1345000882 ^ (long)1345000953) << 1) + this.Field14649, (((int)1771720100L ^ 0x699A4DEF) << 1) + this.Field14650, n);
        this.Method5710(this.Field14649, ((int)-720270222L ^ 0xD5118CE7) + this.Field14650, ((int)((long)213976740 ^ (long)213976815) << 1) + this.Field14649, ((int)((long)2077943448 ^ (long)2077943507) << 1) + this.Field14650, n);
    }

    private boolean Method5708(EnumFacing enumFacing) {
        return ebo6SwpqlFaMWQSxSIe1rjAqn3vAk3rA.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getHorizontalFacing().equals((Object)enumFacing);
    }

    private void Method5709(Entity entity) {
        int n = this.Field14652.Method365() ? zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)927740365 ^ (long)927740372) << 2, ((int)1984414160L ^ 0x7647C1C9) << 2) : (int)1919920247L ^ 0x8D905788;
        int n2 = this.Method5711(ebo6SwpqlFaMWQSxSIe1rjAqn3vAk3rA.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.posX, entity.posX);
        int n3 = this.Method5711(ebo6SwpqlFaMWQSxSIe1rjAqn3vAk3rA.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.posZ, entity.posZ);
        int n4 = (int)((long)-1220953506 ^ (long)-1220953529) << 1;
        if (n2 > n4) return;
        if (n3 > n4) return;
        if (n2 < -n4) return;
        if (n3 < -n4) {
            return;
        }
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect((double)(((int)1202267749L ^ 0x47A9262E) + n2 + this.Field14649) - Double.longBitsToDouble(0x8BEC9BEA215A3482L ^ 0xB40C9BEA215A3482L), (double)(((int)402586644L ^ 0x17FEFC5F) + n3 + this.Field14650) - Double.longBitsToDouble(0xB356D72EE01C59E6L ^ 0x8CAED72EE01C59E6L), (double)((int)((long)-1993878762 ^ (long)-1993878691) + n2 + this.Field14649) + Double.longBitsToDouble(0x375CEF7DA5EDE979L ^ 0x8BCEF7DA5EDE979L), (double)(((int)314555321L ^ 0x12BFBBF2) + n3 + this.Field14650) + Double.longBitsToDouble((long)1713817699 ^ 0x3FF800006626C863L), n);
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect((double)(((int)-65306007L ^ 0xFC1B8222) + n2 + this.Field14649) - Double.longBitsToDouble((long)186085516 ^ 0x3FF800000B17708CL), (double)(((int)1239541452L ^ 0x49E1E687) + n3 + this.Field14650) - Double.longBitsToDouble(0x154EBA03D93BE293L ^ 0x2AAEBA03D93BE293L), (double)((int)((long)-1226956540 ^ (long)-1226956465) + n2 + this.Field14649) + Double.longBitsToDouble((long)2104214700 ^ 0x3FF800007D6BC4ACL), (double)((int)((long)1546843974 ^ (long)1546843917) + n3 + this.Field14650) + Double.longBitsToDouble((long)1478230958 ^ 0x3FE00000581C03AEL), n);
    }

    private void Method5710(int n, int n2, int n3, int n4, int n5) {
        Gui.drawRect((int)n, (int)n2, (int)n3, (int)n4, (int)n5);
    }

    private int Method5711(double d, double d2) {
        double d3 = d;
        double d4 = d2;
        if (d3 < 0.0) {
            d3 *= Double.longBitsToDouble(0xB759F9F6776F2A7AL ^ 0x8A9F9F6776F2A7AL);
        }
        if (d4 < 0.0) {
            d4 *= Double.longBitsToDouble((long)1242587273 ^ 0xBFF000004A106089L);
        }
        int n = (int)(d4 - d3);
        if (d > 0.0 && d2 < 0.0 || d < 0.0 && d2 > 0.0) {
            n = (int)(Double.longBitsToDouble((long)1862298688 ^ 0xBFF000006F006C40L) * d + d2);
        }
        if ((d > 0.0 || d < 0.0) && d2 < 0.0 && d4 != d3) {
            n = (int)(Double.longBitsToDouble((long)775542494 ^ 0xBFF000002E39D6DEL) * d + d2);
        }
        if (d < 0.0) {
            if (d2 == 0.0) return (int)(Double.longBitsToDouble((long)842850847 ^ 0xBFF00000323CE21FL) * (d4 - d3));
        }
        if (d != 0.0) return n;
        if (!(d2 < 0.0)) return n;
        return (int)(Double.longBitsToDouble((long)842850847 ^ 0xBFF00000323CE21FL) * (d4 - d3));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1281964939L ^ 0xB396C475;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1653966175L ^ 0x629585A0);
            int n2 = (int)1122657279L ^ 0x42EA630C;
            cArray2[n] = (char)(cArray[n] ^ (((int)166223088L ^ 0x9E8559F) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

