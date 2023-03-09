//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.google.common.collect.AbstractIterator;
import lavahack.client.Class16;
import lavahack.client.Class457;

class Class675
extends AbstractIterator {
    private Class16 Field10866;
    private int Field10867;
    private int Field10868;
    private int Field10869;
    final Class457 Field10870;
    private String Field10871 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class675(Class457 class457) {
        this.Field10870 = class457;
        this.Field10866 = null;
    }

    protected Class16 Method2859() {
        if (this.Field10866 == null) {
            this.Field10867 = this.Field10870.Field9900.getX();
            this.Field10868 = this.Field10870.Field9900.getY();
            this.Field10869 = this.Field10870.Field9900.getZ();
            this.Field10866 = new Class16(this.Field10867, this.Field10868, this.Field10869);
            return this.Field10866;
        }
        if (this.Field10866.equals(this.Field10870.Field9901)) {
            return (Class16)((Object)this.endOfData());
        }
        if (this.Field10868 < this.Field10870.Field9901.getY()) {
            ++this.Field10868;
        } else if (this.Field10867 < this.Field10870.Field9901.getX()) {
            this.Field10868 = this.Field10870.Field9900.getY();
            ++this.Field10867;
        } else if (this.Field10869 < this.Field10870.Field9901.getZ()) {
            this.Field10868 = this.Field10870.Field9900.getY();
            this.Field10867 = this.Field10870.Field9900.getX();
            ++this.Field10869;
        }
        this.Field10866.Field7895 = this.Field10867;
        this.Field10866.Field7896 = this.Field10868;
        this.Field10866.Field7897 = this.Field10869;
        return this.Field10866;
    }

    protected Object Method2860() {
        return this.Method2859();
    }
}

