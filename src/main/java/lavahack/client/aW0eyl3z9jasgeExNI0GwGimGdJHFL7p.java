//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.QeolztpRjpncB3tszVXsqv3ELwHJwcXz;
import lavahack.client.dqTkpmmq89rRBpUdPNcOcncCLTD1oZgH;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b$\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0016J\n\u0010!\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\"\u001a\u00020\u0006H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016J\b\u0010%\u001a\u00020\u0006H\u0016J8\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0002J\u0018\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0002J \u00100\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0016J \u00102\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0006H\u0016J\u0010\u00104\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u00105\u001a\u00020\u001e2\u0006\u00106\u001a\u00020\u0006H\u0016J\u0010\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u0006H\u0016J\u0010\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u0006H\u0016J\u0010\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u0015H\u0016J\u0010\u0010=\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\u0006H\u0016J\u0010\u0010?\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u0006H\u0016J\u0018\u0010@\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0016J\b\u0010A\u001a\u00020\u0015H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010\u00a8\u0006B"}, d2={"Lcom/kisman/cc/gui/halq/components/sub/colorpicker/slider/sliders/AlphaSlider;", "Lcom/kisman/cc/gui/api/ColorChanger;", "Lcom/kisman/cc/gui/halq/components/sub/colorpicker/slider/ISlider;", "setting", "Lcom/kisman/cc/settings/Setting;", "x_", "", "y_", "offset", "count_", "(Lcom/kisman/cc/settings/Setting;IIII)V", "color", "Lcom/kisman/cc/util/Colour;", "getCount_", "()I", "setCount_", "(I)V", "layer_", "getOffset", "setOffset", "picking_", "", "getSetting", "()Lcom/kisman/cc/settings/Setting;", "width_", "getX_", "setX_", "getY_", "setY_", "drawScreen", "", "mouseX", "mouseY", "getColor", "getCount", "getHeight", "getLayer", "getX", "gradient", "minX", "minY", "maxX", "maxY", "startColor", "endColor", "isMouseOnButton", "x", "y", "mouseClicked", "button", "mouseReleased", "mouseButton", "setColor", "setCount", "count", "setLayer", "layer", "setOff", "newOff", "setPicking", "picking", "setWidth", "width", "setX", "updateComponent", "visible", "kisman.cc"})
public final class aW0eyl3z9jasgeExNI0GwGimGdJHFL7p
implements QeolztpRjpncB3tszVXsqv3ELwHJwcXz,
dqTkpmmq89rRBpUdPNcOcncCLTD1oZgH {
    private vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field10135;
    private int Field10136;
    private int Field10137;
    private boolean Field10138;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10139;
    private int Field10140;
    private int Field10141;
    private int Field10142;
    private int Field10143;
    private String Field10144 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method623(int n, int n2) {
        int n3 = (int)-1327417724L ^ 0xB0E13685;
        int n4 = this.Method631() / ((int)((long)-1299908874 ^ (long)-1299908873) << 1);
        for (int i = -n4; i < this.Field10137; i += n4) {
            n3 = (int)-2102230134L ^ 0x82B2838A;
        }
        double d = this.Method636();
        double d2 = this.Field10141;
        double d3 = (double)this.Method636() + (double)this.Field10137;
        double d4 = (double)this.Field10141 + (double)this.Method631();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = this.Field10135;
        Integer n5 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 != null && (vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3633((int)((long)-1743200157 ^ (long)-1743200158))) != null ? Integer.valueOf(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3626()) : null;
        if (n5 == null) {
            Intrinsics.throwNpe();
        }
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawLeftGradientRect(d, d2, d3, d4, n5, (int)((long)1794521234 ^ (long)1794521234));
        float f = this.Method636() + this.Field10137;
        float f2 = this.Field10137;
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = this.Field10135;
        Float f3 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 != null ? Float.valueOf(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Field17328) : null;
        if (f3 == null) {
            Intrinsics.throwNpe();
        }
        int n6 = (int)(f - f2 * f3.floatValue());
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect((int)(n6 - (int)((long)-621834743 ^ (long)-621834744)), (int)this.Field10141, (int)(n6 + ((int)440850235L ^ 0x1A46D73A)), (int)(this.Field10141 + this.Method631()), (int)((int)((long)-794539530 ^ (long)794539529)));
        if (this.Method2342(n, n2)) {
            int n7 = this.Field10140;
            int n8 = (int)915545433L ^ 0x36921D59;
            n7 = Math.max(n7, n);
            n8 = this.Field10140 + this.Field10137;
            int n9 = (int)-556811709L ^ 0xDECFBA43;
            int n10 = Math.min(n7, n8);
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = this.Field10135;
            if (vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 != null) {
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4.Method3613(((int)1331968079L ^ 0x4F64384E) - (n10 - this.Field10140) / this.Field10137);
            }
        }
        float f4 = this.Method636();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5 = this.Field10135;
        Object object = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5 != null ? vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5.Method3623() : null;
        if (object == null) {
            Intrinsics.throwNpe();
        }
        float f5 = f4 + object[(int)((long)1218515029 ^ (long)1218515028)] * (float)this.Field10137;
        float f6 = this.Field10141 + this.Field10142 + this.Field10137;
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6 = this.Field10135;
        Object object2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6 != null ? vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6.Method3623() : null;
        if (object2 == null) {
            Intrinsics.throwNpe();
        }
        float f7 = f6 - object2[(int)((long)978856917 ^ (long)978856916) << 1] * (float)this.Field10137;
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH((double)f5 - Double.longBitsToDouble((long)778912255 ^ 0x400000002E6D41FFL), (double)f7 - Double.longBitsToDouble(0xE7A8B548A5FD4B2FL ^ 0xA7A8B548A5FD4B2FL), Double.longBitsToDouble((long)701480480 ^ 0x4010000029CFBE20L), Double.longBitsToDouble((long)507570030 ^ 0x401000001E40E76EL), (int)((long)1180807711 ^ (long)-1180807712));
        this.Field10139.Method340(this.Field10135);
    }

    private final void Method2341(int n, int n2, int n3, int n4, int n5, int n6) {
        float f = (float)(n5 >> (((int)970720790L ^ 0x39DC0615) << 3) & ((int)-295581544L ^ 0xEE61C867)) / Float.intBitsToFloat((int)((long)227524862 ^ (long)1324400894));
        float f2 = (float)(n5 >> (((int)910723539L ^ 0x364889D2) << 4) & (int)((long)-81426031 ^ (long)-81426066)) / Float.intBitsToFloat(0x5E28428C ^ 0x1D57428C);
        float f3 = (float)(n5 >> (((int)-10323463L ^ 0xFF6279F8) << 3) & (int)((long)1515622654 ^ (long)1515622401)) / Float.intBitsToFloat((int)((long)1710724082 ^ (long)646484978));
        float f4 = (float)(n5 & ((int)1670936498L ^ 0x6398774D)) / Float.intBitsToFloat((int)1227390653L ^ 0xA577EBD);
        float f5 = (float)(n6 >> ((int)((long)-1007281515 ^ (long)-1007281514) << 3) & ((int)-913145511L ^ 0xC99281A6)) / Float.intBitsToFloat((int)922604533L ^ 0x7582D3F5);
        float f6 = (float)(n6 >> (((int)195881521L ^ 0xBACEA30) << 4) & ((int)1108465811L ^ 0x4211D86C)) / Float.intBitsToFloat((int)((long)647344567 ^ (long)1709879735));
        float f7 = (float)(n6 >> (((int)117163129L ^ 0x6FBC478) << 3) & (int)((long)-647377799 ^ (long)-647377786)) / Float.intBitsToFloat((int)((long)405934926 ^ (long)1531777870));
        float f8 = (float)(n6 & ((int)-2033470600L ^ 0x86CBB387)) / Float.intBitsToFloat((int)((long)1752440088 ^ (long)722148632));
        GL11.glPushMatrix();
        GL11.glEnable((int)(((int)-1505451084L ^ 0xA644A645) << 1));
        GL11.glDisable((int)((int)239925009L ^ 0xE4CFAF0));
        GL11.glBlendFunc((int)(((int)-929505528L ^ 0xC898DE89) << 1), (int)((int)-591916357L ^ 0xDCB811B8));
        GL11.glShadeModel((int)((int)-396211558L ^ 0xE862579B));
        GL11.glBegin((int)((int)((long)740273641 ^ (long)740273632)));
        aW0eyl3z9jasgeExNI0GwGimGdJHFL7p aW0eyl3z9jasgeExNI0GwGimGdJHFL7p2 = this;
        int n7 = (int)-436360361L ^ 0xE5FDAB57;
        int n8 = (int)((long)1655068584 ^ (long)1655068584);
        aW0eyl3z9jasgeExNI0GwGimGdJHFL7p aW0eyl3z9jasgeExNI0GwGimGdJHFL7p3 = aW0eyl3z9jasgeExNI0GwGimGdJHFL7p2;
        int n9 = (int)-761007961L ^ 0xD2A3F0A7;
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
        GL11.glVertex2f((float)n, (float)n2);
        GL11.glVertex2f((float)n, (float)n4);
        GL11.glColor4f((float)f6, (float)f7, (float)f8, (float)f5);
        GL11.glVertex2f((float)n3, (float)n4);
        GL11.glVertex2f((float)n3, (float)n2);
        GL11.glEnd();
        GL11.glShadeModel((int)((int)((long)-77072930 ^ (long)-77072957) << 8));
        GL11.glEnable((int)((int)((long)-1395731963 ^ (long)-1395728412)));
        GL11.glDisable((int)((int)((long)-1961351311 ^ (long)-1961352576) << 1));
        GL11.glPopMatrix();
    }

    @Override
    public void Method625(int n, int n2, int n3) {
        if (n3 != 0) return;
        if (!this.Method2342(n, n2)) return;
        this.Field10138 = (int)-1933695911L ^ 0x8CBE2458;
    }

    private final boolean Method2342(int n, int n2) {
        int n3;
        if (n >= this.Field10140 && n <= this.Field10140 + this.Field10137 && n2 >= this.Field10141 + this.Field10142 && n2 <= this.Field10141 + this.Field10142 + this.Method631()) {
            n3 = (int)((long)2004512238 ^ (long)2004512239);
            return n3 != 0;
        }
        n3 = (int)-152112698L ^ 0xF6EEF1C6;
        return n3 != 0;
    }

    @Override
    public void Method644(boolean bl) {
        this.Field10138 = bl;
    }

    @Override
    public void Method626(int n, int n2, int n3) {
        this.Field10138 = (int)((long)1399685455 ^ (long)1399685455);
    }

    @Override
    public void Method627(int n, int n2) {
        this.Field10140 = n;
        this.Field10141 = n2;
    }

    @Override
    public void Method629(int n) {
        this.Field10142 = n;
    }

    @Override
    public void Method630(int n) {
        this.Field10143 = n;
    }

    @Override
    public int Method631() {
        return zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604 - ((int)-1145406196L ^ 0xBBBA7D0F);
    }

    @Override
    public int Method633() {
        return this.Field10143;
    }

    @Override
    public void Method634(int n) {
        this.Field10137 = n;
    }

    @Override
    public void Method635(int n) {
        this.Field10140 = n;
    }

    @Override
    public int Method636() {
        return this.Field10140;
    }

    @Override
    public void Method639(int n) {
        this.Field10136 = n;
    }

    @Override
    public int Method640() {
        return this.Field10136;
    }

    @Override
    public boolean Method641() {
        return ((int)2027236302L ^ 0x78D52BCF) != 0;
    }

    @Override
    public void Method642(@NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2) {
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"color");
        this.Field10135 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
    }

    @Override
    @Nullable
    @Nullable
    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method643() {
        return this.Field10135;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2343() {
        return this.Field10139;
    }

    public final int Method2344() {
        return this.Field10140;
    }

    public final void Method2345(int n) {
        this.Field10140 = n;
    }

    public final int Method2346() {
        return this.Field10141;
    }

    public final void Method2347(int n) {
        this.Field10141 = n;
    }

    public final int Method2348() {
        return this.Field10142;
    }

    public final void Method2349(int n) {
        this.Field10142 = n;
    }

    public final int Method2350() {
        return this.Field10143;
    }

    public final void Method2351(int n) {
        this.Field10143 = n;
    }

    public aW0eyl3z9jasgeExNI0GwGimGdJHFL7p(@NotNull @NotNull qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, int n, int n2, int n3, int n4) {
        Intrinsics.checkParameterIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"setting");
        this.Field10139 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2;
        this.Field10140 = n;
        this.Field10141 = n2;
        this.Field10142 = n3;
        this.Field10143 = n4;
    }

    private static String Method2352(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1092995956 ^ (long)-1092995956);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)304604112L ^ 0x1227E32F);
            int n2 = ((int)-738332345L ^ 0xD3FDF126) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)941909674L ^ 0x38247ABF) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

