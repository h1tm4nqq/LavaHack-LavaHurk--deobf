//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.GuiTextField
 */
package lavahack.client;

import java.io.IOException;
import lavahack.client.RJ3He3FYgu0B1QUq5w34XvoC8L4vYFY6;
import lavahack.client.d8NUi994osLCmt6QS9gn2nL3bytx8gy3;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;

public class jfV7QfBb0ya4qxjiQh04TfulJofawM0V
extends GuiScreen {
    private GuiScreen Field14925;
    private GuiTextField Field14926;
    private GuiTextField Field14927;
    private int Field14928;

    public jfV7QfBb0ya4qxjiQh04TfulJofawM0V(GuiScreen guiScreen) {
        this.Field14925 = guiScreen;
    }

    public void initGui() {
        this.Field14927 = new GuiTextField((int)((long)1759010737 ^ (long)1759010736), this.mc.fontRenderer, this.width / (((int)1981060369L ^ 0x76149510) << 1) - (((int)44127907L ^ 0x2A156BA) << 2), this.height / ((int)((long)-1337255138 ^ (long)-1337255137) << 1) - (((int)-1459561563L ^ 0xA900DBBC) << 2), ((int)169400028L ^ 0xA18D6C5) << 3, (int)((long)2076057531 ^ (long)2076057524));
        this.Field14926 = new GuiTextField((int)((long)966082030 ^ (long)966082031) << 1, this.mc.fontRenderer, this.width / (((int)-3770496L ^ 0xFFC67781) << 1) - ((int)((long)-1051717761 ^ (long)-1051717786) << 2), this.height / (((int)-1121372417L ^ 0xBD2936FE) << 1) - (((int)1320483015L ^ 0x4EB4F8C2) << 4), (int)((long)-278312141 ^ (long)-278312150) << 3, (int)((long)1063680568 ^ (long)1063680567));
        this.buttonList.add(new GuiButton((int)1449712522L ^ 0x5668DB89, this.width / (((int)2103166870L ^ 0x7D5BC797) << 1) - ((int)-1288425342L ^ 0xB33430B1), this.height / ((int)((long)1078931909 ^ (long)1078931908) << 1) - ((int)((long)624069219 ^ (long)624069228) << 2), (int)((long)-1064674859 ^ (long)-1064674868) << 1, (int)((long)218580277 ^ (long)218580272) << 2, "Add"));
        this.buttonList.add(new GuiButton((int)((long)-607871744 ^ (long)-607871743) << 2, this.width / ((int)((long)1232576945 ^ (long)1232576944) << 1) + ((int)-1580776682L ^ 0xA1C74317), this.height / ((int)((long)-1111141977 ^ (long)-1111141978) << 1) - (((int)-475849923L ^ 0xE3A31B32) << 2), ((int)-4532785L ^ 0xFFBAD5D6) << 1, (int)((long)-1275665673 ^ (long)-1275665678) << 2, "Cancel"));
    }

    public void drawScreen(int n, int n2, float f) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.mc.fontRenderer, "Add Alt Account", this.width / (((int)985844310L ^ 0x3AC2CA57) << 1), ((int)2068847951L ^ 0x7B501D4A) << 1, (int)-1976534672L ^ 0x75CF868F);
        this.Field14927.drawTextBox();
        this.Field14926.drawTextBox();
        if (this.Field14927.getText().equals("") && !this.Field14927.isFocused()) {
            this.fontRenderer.drawStringWithShadow("Email", (float)(this.width / (((int)-1423267687L ^ 0xAB2AA898) << 1) - ((int)-647700664L ^ 0xD964DF29)), (float)(this.height / ((int)((long)513874164 ^ (long)513874165) << 1) - ((int)((long)370929698 ^ (long)370929697) << 5)), (int)((long)1848648181 ^ (long)-1851148180));
        }
        if (this.Field14926.getText().equals("") && !this.Field14926.isFocused()) {
            this.fontRenderer.drawStringWithShadow("Password", (float)(this.width / (((int)-1035404601L ^ 0xC248FAC6) << 1) - ((int)1892770865L ^ 0x70D16450)), (float)(this.height / ((int)((long)-1966168928 ^ (long)-1966168927) << 1) - ((int)((long)-1945901293 ^ (long)-1945901312) << 2)), (int)((long)459629668 ^ (long)-453181955));
        }
        super.drawScreen(n, n2, f);
    }

    public void keyTyped(char c, int n) throws IOException {
        if (n == (int)((long)-341111292 ^ (long)-341111291)) {
            this.mc.displayGuiScreen(this.Field14925);
            return;
        }
        this.Field14927.textboxKeyTyped(c, n);
        this.Field14926.textboxKeyTyped(c, n);
        if (n == (int)((long)-304998199 ^ (long)-304998194) << 2) {
            this.Field14927.setFocused((boolean)((long)-926356169 ^ (long)-926356169));
            this.Field14926.setFocused((boolean)((long)-1894787430 ^ (long)-1894787430));
        }
        super.keyTyped(c, n);
    }

    public void mouseClicked(int n, int n2, int n3) throws IOException {
        this.Field14927.mouseClicked(n, n2, n3);
        this.Field14926.mouseClicked(n, n2, n3);
        super.mouseClicked(n, n2, n3);
    }

    protected void actionPerformed(GuiButton guiButton) throws IOException {
        switch (guiButton.id) {
            case 3: {
                RJ3He3FYgu0B1QUq5w34XvoC8L4vYFY6 rJ3He3FYgu0B1QUq5w34XvoC8L4vYFY6 = new RJ3He3FYgu0B1QUq5w34XvoC8L4vYFY6(this.Field14927.getText(), this.Field14926.getText());
                d8NUi994osLCmt6QS9gn2nL3bytx8gy3.Method7475().add(rJ3He3FYgu0B1QUq5w34XvoC8L4vYFY6);
                this.mc.displayGuiScreen(this.Field14925);
                return;
            }
            case 4: {
                this.mc.displayGuiScreen(this.Field14925);
                return;
            }
        }
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-227214824 ^ (long)-227214824);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1492458996L ^ 0xA70AE2F3);
            int n2 = (int)((long)754091046 ^ (long)754091105);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-154153325 ^ (long)-154162874) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

