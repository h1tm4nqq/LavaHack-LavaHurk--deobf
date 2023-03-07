//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.realmsclient.gui.ChatFormatting
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.util.ChatAllowedCharacters
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package lavahack.client;

import com.mojang.realmsclient.gui.ChatFormatting;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.ABhseIFL1PQVX4WAovmpeO8P6T0dQPpk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.FlWarLswISJXvRsmaDcTKPG06y93n6g0;
import lavahack.client.Hv6yhwwHcXD1FehxCGxnmz7RLwwlENSs;
import lavahack.client.I0R0do5HxnbufehLe8qF1yl2lYfOIhr9;
import lavahack.client.SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6;
import lavahack.client.SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.im1xE6GdaECDr1Bz5yXpFIa9aY3EJSGz;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ChatAllowedCharacters;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u0005H\u0016J \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J\u0016\u0010%\u001a\u00020\u00072\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0'H\u0002J\b\u0010(\u001a\u00020$H\u0016J\b\u0010)\u001a\u00020$H\u0016J\b\u0010*\u001a\u00020$H\u0016J\u0018\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0007H\u0016J \u0010/\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0007H\u0014J \u00101\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H\u0014J\b\u00103\u001a\u00020\u001eH\u0016J\u0012\u00104\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u00020$H\u0016J\u0010\u00108\u001a\u00020\u001e2\u0006\u00109\u001a\u00020$H\u0016J\u0010\u0010:\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020$H\u0016J\u0010\u0010;\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020$H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0011j\b\u0012\u0004\u0012\u00020\n`\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2={"Lcom/kisman/cc/gui/console/ConsoleGui;", "Lcom/kisman/cc/gui/KismanGuiScreen;", "Lcom/kisman/cc/gui/api/Draggable;", "()V", "drag", "", "dragX", "", "dragY", "entryString", "", "getEntryString", "()Ljava/lang/String;", "setEntryString", "(Ljava/lang/String;)V", "height1", "history", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "onMessage", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/client/console/ConsoleMessageEvent;", "kotlin.jvm.PlatformType", "getOnMessage", "()Lme/zero/alpine/listener/Listener;", "width1", "x", "y", "doesGuiPauseGame", "drawScreen", "", "mouseX", "mouseY", "partialTicks", "", "getH", "", "getLongestWord", "strings", "", "getW", "getX", "getY", "keyTyped", "typedChar", "", "keyCode", "mouseClicked", "mouseButton", "mouseReleased", "state", "onGuiClosed", "removeLastLetter", "string", "setH", "h", "setW", "w", "setX", "setY", "kisman.cc"})
public final class ABhseIFL1PQVX4WAovmpeO8P6T0dQPpk
extends FlWarLswISJXvRsmaDcTKPG06y93n6g0
implements im1xE6GdaECDr1Bz5yXpFIa9aY3EJSGz {
    private int Field9171 = (int)((long)1716863467 ^ (long)1716863392) << 2;
    private int Field9172 = (int)((long)-1763523424 ^ (long)-1763523519);
    private int Field9173 = (int)((long)554963445 ^ (long)554963436);
    private int Field9174 = (int)1960171358L ^ 0x74D5D747;
    private final ArrayList Field9175 = new ArrayList();
    @NotNull
    private String Field9176 = "";
    private boolean Field9177;
    private int Field9178;
    private int Field9179;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    @NotNull
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field9180 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)new ABhseIFL1PQVX4WAovmpeO8P6T0dQPpk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this), new Predicate[(int)976932969L ^ 0x3A3AD069]);
    private int Field9181;

    @NotNull
    @NotNull
    public final String Method1429() {
        return this.Field9176;
    }

    public final void Method1430(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"<set-?>");
        this.Field9176 = string;
    }

    @NotNull
    @NotNull
    public final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Method1431() {
        return this.Field9180;
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16267.Method1968() != SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13596) {
            SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6 skQeqyCOChLN1lnQfJFyi0gfpNl3LBi6 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16267;
            Intrinsics.checkExpressionValueIsNotNull((Object)skQeqyCOChLN1lnQfJFyi0gfpNl3LBi6, (String)"Kisman.instance.selectionBar");
            I0R0do5HxnbufehLe8qF1yl2lYfOIhr9.Field11206.Method2058(skQeqyCOChLN1lnQfJFyi0gfpNl3LBi6);
            return;
        }
        super.drawDefaultBackground();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16268.Method5122(n, n2);
        if (this.Field9177) {
            this.Field9173 = n - this.Field9178;
            this.Field9174 = n2 - this.Field9179;
        }
        Hv6yhwwHcXD1FehxCGxnmz7RLwwlENSs.Field10816.Method2466(this);
        if (this.Field9175.size() >= ((int)-559981782L ^ 0xDE9F5B33)) {
            this.Field9175.remove((int)830070233L ^ 0x3179DDD9);
        }
        this.Field9171 = this.Method1435(this.Field9175) > ((int)-701272119L ^ 0xD6336F82) << 2 ? this.Method1435(this.Field9175) + ((int)796139596L ^ 0x2F74204F) : ((int)-621291827L ^ 0xDAF7D686) << 2;
        GuiScreen.drawRect((int)this.Field9173, (int)this.Field9174, (int)(this.Field9173 + this.Field9171), (int)(this.Field9174 + this.Field9172), (int)new Color((int)((long)-253695369 ^ (long)-253695369), (int)((long)-184525935 ^ (long)-184525935), (int)((long)2058123083 ^ (long)2058123083), (int)83301748L ^ 0x4F715DB).getRGB());
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = null.Field11803;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"Config.instance.guiOutline");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            int n3 = this.Field9173 - (int)((long)1428658733 ^ (long)1428658732);
            int n4 = this.Field9174 + (int)((long)-337333139 ^ (long)-337333140);
            Color color = Color.BLACK;
            Intrinsics.checkExpressionValueIsNotNull((Object)color, (String)"Color.BLACK");
            GuiScreen.drawRect((int)n3, (int)this.Field9174, (int)(this.Field9173 + this.Field9171), (int)n4, (int)color.getRGB());
            int n5 = this.Field9173 - ((int)1525547637L ^ 0x5AEE0274);
            Color color2 = Color.BLACK;
            Intrinsics.checkExpressionValueIsNotNull((Object)color2, (String)"Color.BLACK");
            GuiScreen.drawRect((int)n5, (int)this.Field9174, (int)this.Field9173, (int)this.Field9172, (int)color2.getRGB());
            int n6 = this.Field9173 - ((int)95261097L ^ 0x5AD91A8) + this.Field9171;
            Color color3 = Color.BLACK;
            Intrinsics.checkExpressionValueIsNotNull((Object)color3, (String)"Color.BLACK");
            GuiScreen.drawRect((int)n6, (int)this.Field9174, (int)(this.Field9173 + this.Field9171), (int)this.Field9172, (int)color3.getRGB());
            int n7 = this.Field9173 - (int)((long)-1404203589 ^ (long)-1404203590);
            int n8 = this.Field9174 + this.Field9172 + ((int)-635492010L ^ 0xDA1F2957);
            Color color4 = Color.BLACK;
            Intrinsics.checkExpressionValueIsNotNull((Object)color4, (String)"Color.BLACK");
            GuiScreen.drawRect((int)n7, (int)(this.Field9174 + this.Field9172), (int)(this.Field9173 + this.Field9171), (int)n8, (int)color4.getRGB());
        }
        int n9 = (int)((long)-124365265 ^ (long)-124365265);
        Iterator iterator = this.Field9175.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.fontRenderer.drawStringWithShadow(this.Field9176 + (char)((long)-109487462 ^ (long)-109487419), (float)(this.Field9173 + (((int)-1458013433L ^ 0xA9187B06) << 1)), (float)(this.Field9174 + this.Field9172 - this.fontRenderer.FONT_HEIGHT), (int)((long)-421507767 ^ (long)421507766));
                this.drawSelectionBar(n, n2);
                return;
            }
            String string = (String)iterator.next();
            Minecraft.getMinecraft().fontRenderer.drawStringWithShadow(string, (float)(this.Field9173 + (((int)310280309L ^ 0x127E8074) << 1)), (float)(this.Field9174 + (((int)-1301163417L ^ 0xB271D266) << 1) + n9), (int)2009664898L ^ 0x8836F27D);
            n9 += Minecraft.getMinecraft().fontRenderer.FONT_HEIGHT;
        }
    }

    @Override
    protected void mouseClicked(int n, int n2, int n3) {
        if (Mouse.isButtonDown((int)((int)-1847606370L ^ 0x91DFC39E)) && n >= this.Field9173 && n <= this.Field9173 + this.Field9171 && n2 >= this.Field9174 && n2 <= this.Field9174 + this.Field9172) {
            this.Field9177 = (int)-1576407069L ^ 0xA209EFE2;
            this.Field9178 = n - this.Field9173;
            this.Field9179 = n2 - this.Field9174;
        }
        super.mouseClicked(n, n2, n3);
    }

    protected void Method1432(int n, int n2, int n3) {
        this.Field9177 = (int)((long)145594559 ^ (long)145594559);
    }

    @Override
    public void keyTyped(char c, int n) {
        if (n == ((int)2057500449L ^ 0x7AA2F720)) {
            Minecraft.getMinecraft().displayGuiScreen(null);
            return;
        }
        switch (n) {
            case 14: {
                this.Field9176 = this.Method1434(this.Field9176);
                break;
            }
            case 28: {
                String string = this.Field9176;
                int n2 = (int)((long)-513254539 ^ (long)-513254539);
                String string2 = string;
                if (string2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                String string3 = string2.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull((Object)string3, (String)"(this as java.lang.String).toLowerCase()");
                string = string3;
                switch (string.hashCode()) {
                    case 94746189: {
                        if (string.equals("clear")) {
                            this.Field9175.clear();
                            Collection collection = this.Field9175;
                            String string4 = "Cleared console!";
                            int n3 = (int)2062158551L ^ 0x7AEA0AD7;
                            collection.add(string4);
                            break;
                        }
                    }
                    default: {
                        CharSequence charSequence = this.Field9176;
                        int n4 = (int)435218262L ^ 0x19F0E756;
                        int n5 = charSequence.length() > 0 ? (int)((long)1514381353 ^ (long)1514381352) : (int)1222174183L ^ 0x48D8E5E7;
                        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16272.Method7566((char)((int)-1959778985L ^ 0x8B30257A) + this.Field9176);
                    }
                }
                this.Field9176 = "";
                break;
            }
            case 47: {
                if (!Keyboard.isKeyDown((int)((int)-1586178615L ^ 0xA174D5D4))) {
                    if (!Keyboard.isKeyDown((int)((int)484710501L ^ 0x1CE418F8))) break;
                }
                StringBuilder stringBuilder = new StringBuilder().append(this.Field9176);
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Intrinsics.checkExpressionValueIsNotNull((Object)toolkit, (String)"Toolkit.getDefaultToolkit()");
                this.Field9176 = stringBuilder.append(toolkit.getSystemClipboard().getData(DataFlavor.stringFlavor)).toString();
                break;
            }
            case 46: {
                if (!Keyboard.isKeyDown((int)((int)-719614447L ^ 0xD51B8E0C)) && !Keyboard.isKeyDown((int)((int)-1770806739L ^ 0x9673A2B0))) break;
                Object object = this.Field9176;
                int n6 = (int)((long)730846570 ^ (long)730846570);
                int n7 = object.length() == 0 ? (int)-1652778704L ^ 0x9D7C9931 : (int)((long)1310740171 ^ (long)1310740171);
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Intrinsics.checkExpressionValueIsNotNull((Object)toolkit, (String)"Toolkit.getDefaultToolkit()");
                toolkit.getSystemClipboard().setContents(new StringSelection(this.Field9176), null);
                object = this.Field9175;
                String string = ChatFormatting.BOLD + "[Console]" + ChatFormatting.RESET + " Copied text in string box to clipboard.";
                int n8 = (int)-1788312865L ^ 0x956882DF;
                object.add(string);
                break;
            }
        }
        if (!ChatAllowedCharacters.isAllowedCharacter((char)c)) return;
        this.Field9176 = this.Field9176 + c;
        super.keyTyped(c, n);
    }

    public boolean Method1433() {
        return ((int)-1305162533L ^ 0xB234CCDB) != 0;
    }

    private final String Method1434(String string) {
        int n;
        String string2 = "";
        if (string == null) return string2;
        CharSequence charSequence = string;
        int n2 = (int)-1359425017L ^ 0xAEF8D207;
        if (charSequence.length() > 0) {
            n = (int)((long)-759996751 ^ (long)-759996752);
            return string2;
        }
        n = (int)((long)-59679373 ^ (long)-59679373);
        return string2;
    }

    private final int Method1435(List list) {
        int n = (int)-1664279539L ^ 0x9CCD1C0D;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            if (Minecraft.getMinecraft().fontRenderer.getStringWidth(string) <= n) continue;
            n = Minecraft.getMinecraft().fontRenderer.getStringWidth(string);
        }
        return n;
    }

    public void Method1436() {
        if (this.mc.player != null && this.mc.world != null) {
            this.mc.entityRenderer.getShaderGroup().deleteShaderGroup();
        }
        super.onGuiClosed();
    }

    @Override
    public double Method267() {
        return this.Field9173;
    }

    @Override
    public double Method268() {
        return this.Field9174;
    }

    @Override
    public double Method269() {
        return this.Field9171;
    }

    @Override
    public double Method270() {
        return this.Field9172;
    }

    @Override
    public void Method271(double d) {
        this.Field9173 = (int)d;
    }

    @Override
    public void Method272(double d) {
        this.Field9174 = (int)d;
    }

    @Override
    public void Method273(double d) {
        this.Field9171 = (int)d;
    }

    @Override
    public void Method274(double d) {
        this.Field9172 = (int)d;
    }

    public ABhseIFL1PQVX4WAovmpeO8P6T0dQPpk() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field9180);
    }

    public static final /* bridge */ /* synthetic */ ArrayList Method1437(ABhseIFL1PQVX4WAovmpeO8P6T0dQPpk aBhseIFL1PQVX4WAovmpeO8P6T0dQPpk) {
        return aBhseIFL1PQVX4WAovmpeO8P6T0dQPpk.Field9175;
    }

    private static String Method1438(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-57366005 ^ (long)-57366005);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-690731773 ^ (long)-690731524);
            int n2 = (int)((long)-163618139 ^ (long)-163618216);
            cArray2[n] = (char)(cArray[n] ^ ((int)1545608698L ^ 0x5C2070CD ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

